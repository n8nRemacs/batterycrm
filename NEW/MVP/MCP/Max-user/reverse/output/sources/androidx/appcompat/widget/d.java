package androidx.appcompat.widget;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;

/* loaded from: classes.dex */
public final class d implements View.OnKeyListener {
    public final /* synthetic */ e a;

    public d(e eVar) {
        this.a = eVar;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        e eVar = this.a;
        if (eVar.mSearchable == null) {
            return false;
        }
        if (eVar.mSearchSrcTextView.isPopupShowing() && eVar.mSearchSrcTextView.getListSelection() != -1) {
            return eVar.onSuggestionsKey(view, i, keyEvent);
        }
        if (TextUtils.getTrimmedLength(eVar.mSearchSrcTextView.getText()) == 0 || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i != 66) {
            return false;
        }
        view.cancelLongPress();
        eVar.launchQuerySearch(0, null, eVar.mSearchSrcTextView.getText().toString());
        return true;
    }
}
