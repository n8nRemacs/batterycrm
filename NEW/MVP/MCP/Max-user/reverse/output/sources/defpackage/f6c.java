package defpackage;

import android.view.View;

/* loaded from: classes2.dex */
public final class f6c {
    public final i6c a;
    public int b;

    public f6c(i6c i6cVar) {
        this.a = i6cVar;
    }

    public final void a(int i) {
        View viewD;
        i6c i6cVar = this.a;
        if (i6cVar == null || (viewD = i6cVar.d()) == null) {
            return;
        }
        int iC = n7j.c(i - i6cVar.c(), 0, Integer.MAX_VALUE);
        int i2 = iC - this.b;
        this.b = iC;
        viewD.offsetTopAndBottom(i2);
    }
}
