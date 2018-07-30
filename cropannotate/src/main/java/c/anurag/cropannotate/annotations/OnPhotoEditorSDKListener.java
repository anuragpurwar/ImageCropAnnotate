package c.anurag.cropannotate.annotations;

/**
 * Created by Anurag Purwar on 02/06/2017.
 */

public interface OnPhotoEditorSDKListener {

    void onEditTextChangeListener(String text, int colorCode);

    void onAddViewListener(ViewType viewType, int numberOfAddedViews);

    void onRemoveViewListener(int numberOfAddedViews);

    void onStartViewChangeListener(ViewType viewType);

    void onStopViewChangeListener(ViewType viewType);
}
