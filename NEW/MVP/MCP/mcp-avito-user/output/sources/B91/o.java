package B91;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

/* loaded from: classes9.dex */
public final class o implements g2.c {

    /* renamed from: a, reason: collision with root package name */
    public final LinearLayout f1151a;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f1152b;

    public o(LinearLayout linearLayout, TextView textView) {
        this.f1151a = linearLayout;
        this.f1152b = textView;
    }

    @Override // g2.c
    public final View getRoot() {
        return this.f1151a;
    }
}
