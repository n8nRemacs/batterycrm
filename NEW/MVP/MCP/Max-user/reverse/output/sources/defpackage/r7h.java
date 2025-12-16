package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class r7h extends dtf implements sm6 {
    public final /* synthetic */ cbh X;
    public final /* synthetic */ v7h Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r7h(cbh cbhVar, v7h v7hVar, Continuation continuation) {
        super(2, continuation);
        this.X = cbhVar;
        this.Y = v7hVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((r7h) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new r7h(this.X, this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        Object objD;
        g84 g84Var;
        int i = this.o;
        if (i != 0 && i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        g8j.b(obj);
        do {
            cbh cbhVar = this.X;
            if (!cbhVar.d()) {
                return qqg.a;
            }
            eoi.d(this.b);
            v7h v7hVar = this.Y;
            w8h w8hVar = (w8h) ue3.I(v7hVar.h.a.b());
            if (w8hVar != null) {
                jve jveVar = v7hVar.g;
                w8hVar.o = v8h.c;
                w8hVar.X = (cbhVar.e() / cbhVar.getDuration()) * 100.0f;
                w8hVar.Y = cbhVar.e();
                jveVar.h(w8hVar);
            }
            int i2 = s65.d;
            long jH = v9j.h(100, y65.MILLISECONDS);
            this.o = 1;
            objD = s8j.d(jH, this);
            g84Var = g84.a;
        } while (objD != g84Var);
        return g84Var;
    }
}
