package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class p40 extends dtf implements um6 {
    public /* synthetic */ float X;
    public /* synthetic */ x40 o;

    @Override // defpackage.um6
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        float fFloatValue = ((Number) obj2).floatValue();
        p40 p40Var = new p40(3, (Continuation) obj3);
        p40Var.o = (x40) obj;
        p40Var.X = fFloatValue;
        return p40Var.n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        x40 x40Var = this.o;
        float f = this.X;
        if (x40Var != null) {
            return new x40(x40Var.a, x40Var.b, f, x40Var.d);
        }
        return null;
    }
}
