package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class gth extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ lth Y;
    public final /* synthetic */ ith Z;
    public int o;
    public final /* synthetic */ eth s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gth(lth lthVar, ith ithVar, eth ethVar, Continuation continuation) {
        super(2, continuation);
        this.Y = lthVar;
        this.Z = ithVar;
        this.s0 = ethVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((gth) l((String) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        gth gthVar = new gth(this.Y, this.Z, this.s0, continuation);
        gthVar.X = obj;
        return gthVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        eth ethVar = this.s0;
        ith ithVar = this.Z;
        if (i == 0) {
            g8j.b(obj);
            oth othVar = new oth(this.Y.a, (String) this.X);
            pv0 pv0Var = ithVar.e;
            ethVar.getClass();
            ew7 ew7Var = ithVar.a;
            ew7Var.getClass();
            rv7 rv7Var = new rv7("WebAppRequestPhone", ew7Var.b(oth.Companion.serializer(), othVar));
            this.o = 1;
            Object objH = pv0Var.h(rv7Var, this);
            g84 g84Var = g84.a;
            if (objH == g84Var) {
                return g84Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
        }
        ethVar.getClass();
        clh clhVar = ithVar.f;
        if (clhVar != null) {
            noh.a((noh) ithVar.b.getValue(), "WebAppRequestPhone", clhVar.a, clhVar.b, true, 0, null, null, 240);
        }
        return qqg.a;
    }
}
