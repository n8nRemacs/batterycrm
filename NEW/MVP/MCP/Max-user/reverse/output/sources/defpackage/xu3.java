package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class xu3 extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ iv3 Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xu3(iv3 iv3Var, Continuation continuation) {
        super(2, continuation);
        this.Y = iv3Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((xu3) l((jfc) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        xu3 xu3Var = new xu3(this.Y, continuation);
        xu3Var.X = obj;
        return xu3Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) throws Throwable {
        int i = this.o;
        qqg qqgVar = qqg.a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
            return qqgVar;
        }
        g8j.b(obj);
        jfc jfcVar = (jfc) this.X;
        if (jfcVar instanceof gfc) {
            Long l = ((gfc) jfcVar).a;
            iv3 iv3Var = this.Y;
            if (l.longValue() == iv3Var.p.get()) {
                jve jveVar = iv3Var.e;
                jc3 jc3Var = jc3.b;
                this.o = 1;
                Object objA = jveVar.a(jc3Var, this);
                g84 g84Var = g84.a;
                if (objA == g84Var) {
                    return g84Var;
                }
            }
        }
        return qqgVar;
    }
}
