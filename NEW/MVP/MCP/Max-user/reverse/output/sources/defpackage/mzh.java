package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class mzh extends dtf implements sm6 {
    public /* synthetic */ boolean X;
    public final /* synthetic */ xwh Y;
    public final /* synthetic */ pzh Z;
    public int o;
    public final /* synthetic */ jzh s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mzh(xwh xwhVar, pzh pzhVar, jzh jzhVar, Continuation continuation) {
        super(2, continuation);
        this.Y = xwhVar;
        this.Z = pzhVar;
        this.s0 = jzhVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((mzh) l(bool, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        mzh mzhVar = new mzh(this.Y, this.Z, this.s0, continuation);
        mzhVar.X = ((Boolean) obj).booleanValue();
        return mzhVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        jzh jzhVar = this.s0;
        pzh pzhVar = this.Z;
        if (i == 0) {
            g8j.b(obj);
            axh axhVar = new axh(this.Y.a, this.X);
            pv0 pv0Var = pzhVar.e;
            String str = jzhVar.a;
            ew7 ew7Var = pzhVar.a;
            ew7Var.getClass();
            rv7 rv7Var = new rv7(str, ew7Var.b(axh.Companion.serializer(), axhVar));
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
        String str2 = jzhVar.a;
        clh clhVar = pzhVar.f;
        if (clhVar != null) {
            noh.a((noh) pzhVar.b.getValue(), str2, clhVar.a, clhVar.b, true, 0, null, null, 240);
        }
        return qqg.a;
    }
}
