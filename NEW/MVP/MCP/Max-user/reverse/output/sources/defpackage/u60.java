package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class u60 extends dtf implements sm6 {
    public final /* synthetic */ int X;
    public final /* synthetic */ float Y;
    public final /* synthetic */ float Z;
    public final /* synthetic */ w60 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u60(w60 w60Var, int i, float f, float f2, Continuation continuation) {
        super(2, continuation);
        this.o = w60Var;
        this.X = i;
        this.Y = f;
        this.Z = f2;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        u60 u60Var = (u60) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        u60Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new u60(this.o, this.X, this.Y, this.Z, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        int i = this.X;
        Integer num = new Integer(i);
        w60 w60Var = this.o;
        w60Var.i = num;
        w60Var.l = new Float(this.Y);
        w60Var.m = new Float(this.Z);
        js jsVar = w60Var.j;
        js jsVar2 = new js(i);
        if (jsVar != null) {
            jsVar2.addAll(jsVar);
        }
        w60Var.j = jsVar2;
        w60Var.a();
        return qqg.a;
    }
}
