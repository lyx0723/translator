package util.file;

import java.nio.file.Path;

public interface PathSelector {

	public boolean isSelected(Path path);
	
}
