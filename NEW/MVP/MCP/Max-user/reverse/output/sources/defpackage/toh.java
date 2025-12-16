package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class toh extends dtf implements sm6 {
    public int X;
    public /* synthetic */ boolean Y;
    public final /* synthetic */ xoh Z;
    public String o;
    public final /* synthetic */ qoh s0;
    public final /* synthetic */ uoh t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public toh(xoh xohVar, qoh qohVar, uoh uohVar, Continuation continuation) {
        super(2, continuation);
        this.Z = xohVar;
        this.s0 = qohVar;
        this.t0 = uohVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((toh) l(bool, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        toh tohVar = new toh(this.Z, this.s0, this.t0, continuation);
        tohVar.Y = ((Boolean) obj).booleanValue();
        return tohVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        String str;
        int i = this.X;
        uoh uohVar = this.t0;
        if (i == 0) {
            g8j.b(obj);
            xoh xohVar = new xoh(this.Z.a, this.Y);
            this.s0.getClass();
            pv0 pv0Var = uohVar.e;
            ew7 ew7Var = uohVar.a;
            ew7Var.getClass();
            rv7 rv7Var = new rv7("WebAppChangeScreenBrightness", ew7Var.b(xoh.Companion.serializer(), xohVar));
            this.o = "WebAppChangeScreenBrightness";
            this.X = 1;
            Object objH = pv0Var.h(rv7Var, this);
            g84 g84Var = g84.a;
            if (objH == g84Var) {
                return g84Var;
            }
            str = "WebAppChangeScreenBrightness";
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str2 = this.o;
            g8j.b(obj);
            str = str2;
        }
        clh clhVar = uohVar.f;
        if (clhVar != null) {
            noh.a((noh) uohVar.b.getValue(), str, clhVar.a, clhVar.b, true, 0, null, null, 240);
        }
        return qqg.a;
    }
}
