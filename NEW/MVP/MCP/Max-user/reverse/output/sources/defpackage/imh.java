package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class imh extends dtf implements sm6 {
    public int X;
    public final /* synthetic */ tmh Y;
    public boolean o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public imh(tmh tmhVar, Continuation continuation) {
        super(2, continuation);
        this.Y = tmhVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((imh) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new imh(this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        boolean zF;
        int i = this.X;
        if (i == 0) {
            g8j.b(obj);
            tmh tmhVar = this.Y;
            zF = tmhVar.f();
            qlh qlhVar = (qlh) tmhVar.h.getValue();
            long j = tmhVar.a;
            long j2 = tmhVar.b;
            this.o = zF;
            this.X = 1;
            obj = qlhVar.a(j, j2, this);
            g84 g84Var = g84.a;
            if (obj == g84Var) {
                return g84Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zF = this.o;
            g8j.b(obj);
        }
        umh umhVar = (umh) obj;
        boolean z = umhVar != null && umhVar.e;
        boolean z2 = umhVar != null && umhVar.f;
        String str = umhVar != null ? umhVar.d : null;
        return new ro0(zF, z, z2, !(str == null || str.length() == 0));
    }
}
