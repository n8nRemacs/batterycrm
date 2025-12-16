package defpackage;

import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* loaded from: classes2.dex */
public final /* synthetic */ class qg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ qg(View view, int i) {
        this.a = i;
        this.b = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.setVisibility(0);
                break;
            case 1:
                this.b.setVisibility(0);
                break;
            case 2:
                View view = this.b;
                view.setVisibility(8);
                view.setAlpha(1.0f);
                break;
            case 3:
                this.b.setVisibility(8);
                break;
            case 4:
                View view2 = this.b;
                ((InputMethodManager) view2.getContext().getSystemService("input_method")).showSoftInput(view2, 0);
                break;
            default:
                View view3 = this.b;
                ((InputMethodManager) s34.b(view3.getContext(), InputMethodManager.class)).showSoftInput(view3, 1);
                break;
        }
    }
}
