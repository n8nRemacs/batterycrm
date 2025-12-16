package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class tod extends dtf implements sm6 {
    public final /* synthetic */ zw1 X;
    public final /* synthetic */ long Y;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tod(zw1 zw1Var, long j, Continuation continuation) {
        super(2, continuation);
        this.X = zw1Var;
        this.Y = j;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((tod) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        tod todVar = new tod(this.X, this.Y, continuation);
        todVar.o = obj;
        return todVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        f84 f84Var = (f84) this.o;
        String name = f84Var.getClass().getName();
        long j = this.Y;
        l6b l6bVar = wqi.a;
        CharSequence charSequenceE = null;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, name, vb9.e(j, "start restore draft for chatId:"), null);
            }
        }
        pb2 pb2Var = (pb2) ((w63) this.X.a.getValue()).j(this.Y).a.getValue();
        if (pb2Var == null) {
            wqi.c(f84Var.getClass().getName(), "can't restore draft because chat is null", new Object[0]);
            return null;
        }
        p3b p3bVar = pb2Var.b.c0;
        if (!(p3bVar instanceof p3b)) {
            p3bVar = null;
        }
        if (p3bVar == null) {
            wqi.c(f84Var.getClass().getName(), "Draft empty in chat don't need restore", new Object[0]);
            return null;
        }
        zw1 zw1Var = this.X;
        y08 y08Var = p3bVar.b;
        if (!qzi.b(y08Var)) {
            charSequenceE = ((f7b) zw1Var.b.getValue()).j.e(((f7b) zw1Var.b.getValue()).m(y08Var.a, y08Var.b));
        }
        return new sod(charSequenceE, p3bVar.d, p3bVar.c);
    }
}
