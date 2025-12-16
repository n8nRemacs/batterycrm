package defpackage;

import android.view.KeyEvent;
import android.widget.TextView;
import androidx.appcompat.widget.e;

/* loaded from: classes.dex */
public final class p7e implements TextView.OnEditorActionListener {
    public final /* synthetic */ e a;

    public p7e(e eVar) {
        this.a = eVar;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        this.a.onSubmitQuery();
        return true;
    }
}
