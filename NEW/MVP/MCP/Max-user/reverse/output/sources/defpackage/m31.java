package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class m31 extends dtf implements um6 {
    public /* synthetic */ boolean X;
    public /* synthetic */ boolean Y;
    public final /* synthetic */ int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m31(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.o = i2;
    }

    @Override // defpackage.um6
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.o;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
        Continuation continuation = (Continuation) obj3;
        switch (i) {
            case 0:
                m31 m31Var = new m31(3, continuation, 0);
                m31Var.X = zBooleanValue;
                m31Var.Y = zBooleanValue2;
                return m31Var.n(qqg.a);
            case 1:
                m31 m31Var2 = new m31(3, continuation, 1);
                m31Var2.X = zBooleanValue;
                m31Var2.Y = zBooleanValue2;
                return m31Var2.n(qqg.a);
            default:
                m31 m31Var3 = new m31(3, continuation, 2);
                m31Var3.X = zBooleanValue;
                m31Var3.Y = zBooleanValue2;
                return m31Var3.n(qqg.a);
        }
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        switch (this.o) {
            case 0:
                g8j.b(obj);
                return Boolean.valueOf(this.X && !this.Y);
            case 1:
                g8j.b(obj);
                return Boolean.valueOf(this.X && !this.Y);
            default:
                g8j.b(obj);
                return Boolean.valueOf(this.X || this.Y);
        }
    }
}
