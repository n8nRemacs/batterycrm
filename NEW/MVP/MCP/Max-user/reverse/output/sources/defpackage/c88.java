package defpackage;

import android.text.style.ClickableSpan;
import android.view.View;

/* loaded from: classes2.dex */
public final /* synthetic */ class c88 implements a88 {
    public final /* synthetic */ h88 a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c88(h88 h88Var, Object obj) {
        this.a = h88Var;
        this.b = obj;
    }

    @Override // defpackage.a88
    public void a(View view, String str) {
        this.a.b(view, str, i88.X, (ClickableSpan) this.b);
    }
}
