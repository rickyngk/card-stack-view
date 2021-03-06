package R.cardstack;

import android.view.View;

/**
 * Created by duynk on 1/5/16.
 */
public interface CardStackViewDelegate {
    void onStarted(CardStackView v);
    View onLoadView(CardStackView v, int index);
    View onLoadEmptyView(CardStackView v);

    int getCount();

    void onDrag(CardStackView v, float confidence);

    void onActive(CardStackView v, int index);
    void onEndOfStack(CardStackView v);
    void onOpen(CardStackView v, int index);
    void onRollback(CardStackView v);

}
