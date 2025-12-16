package defpackage;

import java.io.IOException;

/* loaded from: classes.dex */
public final /* synthetic */ class kj4 implements pa8, fu3 {
    public final /* synthetic */ ub8 a;
    public final /* synthetic */ g19 b;
    public final /* synthetic */ IOException c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object o;

    public /* synthetic */ kj4(Object obj, ub8 ub8Var, g19 g19Var, IOException iOException, boolean z) {
        this.o = obj;
        this.a = ub8Var;
        this.b = g19Var;
        this.c = iOException;
        this.d = z;
    }

    @Override // defpackage.fu3
    public void accept(Object obj) {
        lk6 lk6Var = (lk6) this.o;
        ((n99) obj).a(lk6Var.b, (d99) lk6Var.c, this.a, this.b, this.c, this.d);
    }

    @Override // defpackage.pa8, defpackage.oa8
    public void invoke(Object obj) {
        ((jd) obj).d0((id) this.o, this.a, this.b, this.c, this.d);
    }
}
