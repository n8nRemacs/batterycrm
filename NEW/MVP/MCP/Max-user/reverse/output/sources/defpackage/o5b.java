package defpackage;

import android.content.Context;

/* loaded from: classes2.dex */
public final /* synthetic */ class o5b implements cm6 {
    public final /* synthetic */ k18 X;
    public final /* synthetic */ k18 Y;
    public final /* synthetic */ int a;
    public final /* synthetic */ k18 b;
    public final /* synthetic */ k18 c;
    public final /* synthetic */ k18 d;
    public final /* synthetic */ k18 o;

    public /* synthetic */ o5b(k18 k18Var, k18 k18Var2, k18 k18Var3, k18 k18Var4, k18 k18Var5, k18 k18Var6, int i) {
        this.a = i;
        this.b = k18Var;
        this.c = k18Var2;
        this.d = k18Var3;
        this.o = k18Var4;
        this.X = k18Var5;
        this.Y = k18Var6;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new c0a(this.b, this.c, this.d, this.o, this.X, this.Y);
            default:
                return new el1((Context) this.b.getValue(), (age) this.c.getValue(), this.d, this.o, this.X, this.Y);
        }
    }
}
