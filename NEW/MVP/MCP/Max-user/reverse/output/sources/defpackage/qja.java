package defpackage;

import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public final class qja {
    public final k18 a;
    public final k18 b;
    public final k18 c;
    public final k18 d;
    public final k18 e;
    public final k18 f;
    public final k18 g;
    public final k18 h;
    public final k18 i;
    public final k18 j;
    public final k18 k;
    public volatile u0g l;

    public qja(k18 k18Var, k18 k18Var2, k18 k18Var3, k18 k18Var4, k18 k18Var5, k18 k18Var6, k18 k18Var7, k18 k18Var8, k18 k18Var9, k18 k18Var10, k18 k18Var11) {
        this.a = k18Var;
        this.b = k18Var2;
        this.c = k18Var3;
        this.d = k18Var4;
        this.e = k18Var5;
        this.f = k18Var6;
        this.g = k18Var7;
        this.h = k18Var8;
        this.i = k18Var9;
        this.j = k18Var10;
        this.k = k18Var11;
    }

    public final tfe a() {
        return (tfe) this.b.getValue();
    }

    public final void b(cm6 cm6Var) {
        u0g u0gVar = this.l;
        if (u0gVar != null) {
            ((ExecutorService) u0gVar.w0.getValue()).execute(new k79(cm6Var, 15, this));
        }
    }
}
