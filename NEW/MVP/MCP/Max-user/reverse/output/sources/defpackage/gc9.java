package defpackage;

import org.apache.http.HttpStatus;

/* loaded from: classes2.dex */
public final class gc9 extends d2f {
    @Override // defpackage.d2f
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public final void z(fc9 fc9Var) {
        roe roeVar = (roe) this.a;
        long j = fc9Var.X;
        s5g s5gVar = fc9Var.b;
        hoe hoeVar = fc9Var.c;
        Integer num = fc9Var.d;
        roeVar.setModelItem(new toe(j, 0, s5gVar, hoeVar, null, num != null ? new s18(num.intValue(), 0, 6) : null, fc9Var.o, null, null, HttpStatus.SC_BAD_REQUEST));
    }
}
