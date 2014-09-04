package keyword;

public enum AsymmetricCVRPKeyword implements Keyword {

	NAME				(KeywordType.INLINE),
	COMMENT				(KeywordType.INLINE),
	TYPE				(KeywordType.INLINE),
	DIMENSION			(KeywordType.INLINE),
	EDGE_WEIGHT_TYPE	(KeywordType.INLINE),
	EDGE_WEIGHT_FORMAT  (KeywordType.INLINE),
	DISPLAY_DATA_TYPE   (KeywordType.INLINE),
	CAPACITY			(KeywordType.INLINE),
	VEHICLES			(KeywordType.INLINE),
	EDGE_WEIGHT_SECTION	(KeywordType.BLOCK),
	DEMAND_SECTION		(KeywordType.BLOCK),
	DEPOT_SECTION		(KeywordType.BLOCK),
	EOF					(KeywordType.END);

	private final KeywordType type;

	private AsymmetricCVRPKeyword(KeywordType type) {
		this.type = type;
	}
	
	@Override
	public String displayName() {
		return this.toString();
	}
	
	@Override
	public KeywordType type() {
		return type;
	}
	
	@Override
	public Keyword[] allValues() {
		return AsymmetricCVRPKeyword.values();
	}

}