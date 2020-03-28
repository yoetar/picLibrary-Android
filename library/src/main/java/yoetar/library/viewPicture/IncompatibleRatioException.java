package yoetar.library.viewPicture;

class IncompatibleRatioException extends RuntimeException {

    IncompatibleRatioException() {
        super("Can't perform Ken Burns effect on rects with distinct aspect ratios!");
    }
}