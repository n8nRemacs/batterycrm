package defpackage;

import android.view.KeyEvent;
import android.widget.TextView;

/* loaded from: classes2.dex */
public final /* synthetic */ class hu4 implements TextView.OnEditorActionListener {
    public final /* synthetic */ int a;

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        switch (this.a) {
            case 0:
                if (i != 6) {
                    return false;
                }
                cpi.c(textView);
                return true;
            default:
                if (i != 6) {
                    return false;
                }
                textView.clearFocus();
                return false;
        }
    }
}
