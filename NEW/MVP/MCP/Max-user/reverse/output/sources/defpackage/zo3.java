package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class zo3 extends dtf implements sm6 {
    public final /* synthetic */ boolean X;
    public final /* synthetic */ long Y;
    public final /* synthetic */ ap3 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zo3(ap3 ap3Var, boolean z, long j, Continuation continuation) {
        super(2, continuation);
        this.o = ap3Var;
        this.X = z;
        this.Y = j;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        zo3 zo3Var = (zo3) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        zo3Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new zo3(this.o, this.X, this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        ap3 ap3Var = this.o;
        pe8 pe8Var = (pe8) ((pb3) ap3Var.c.getValue());
        pe8Var.v0.O(pe8Var, pe8.U0[9], Boolean.valueOf(this.X));
        ci5 ci5Var = ap3Var.X;
        ug1.c.getClass();
        xc0.l(":profile/add-members?chat_id=" + this.Y + "&is_chat=true", ci5Var);
        return qqg.a;
    }
}
