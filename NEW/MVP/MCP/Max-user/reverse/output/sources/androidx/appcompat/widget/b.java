package androidx.appcompat.widget;

import android.view.View;

/* loaded from: classes.dex */
public final class b implements View.OnFocusChangeListener {
    public final /* synthetic */ e a;

    public b(e eVar) {
        this.a = eVar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        e eVar = this.a;
        View.OnFocusChangeListener onFocusChangeListener = eVar.mOnQueryTextFocusChangeListener;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(eVar, z);
        }
    }
}
