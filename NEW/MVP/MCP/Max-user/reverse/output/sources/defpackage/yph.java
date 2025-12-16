package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class yph extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ hqh Y;
    public final /* synthetic */ eqh Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yph(eqh eqhVar, hqh hqhVar, Continuation continuation) {
        super(2, continuation);
        this.Y = hqhVar;
        this.Z = eqhVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((yph) l((nph) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        yph yphVar = new yph(this.Z, this.Y, continuation);
        yphVar.X = obj;
        return yphVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        String str;
        int i = this.o;
        eqh eqhVar = this.Z;
        if (i == 0) {
            g8j.b(obj);
            nph nphVar = (nph) this.X;
            if (xph.$EnumSwitchMapping$0[nphVar.ordinal()] == 1) {
                wqi.c("DownloadFromWebApp", "processDownloadFile complete", new Object[0]);
                kqh kqhVar = new kqh(this.Y.a, nphVar.a);
                pv0 pv0Var = eqhVar.e;
                ew7 ew7Var = eqhVar.a;
                ew7Var.getClass();
                rv7 rv7Var = new rv7("WebAppDownloadFile", ew7Var.b(kqh.Companion.serializer(), kqhVar));
                this.X = "WebAppDownloadFile";
                this.o = 1;
                Object objH = pv0Var.h(rv7Var, this);
                g84 g84Var = g84.a;
                if (objH == g84Var) {
                    return g84Var;
                }
                str = "WebAppDownloadFile";
            }
            return qqg.a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        String str2 = (String) this.X;
        g8j.b(obj);
        str = str2;
        clh clhVar = eqhVar.f;
        if (clhVar != null) {
            noh.a((noh) eqhVar.b.getValue(), str, clhVar.a, clhVar.b, true, 0, null, null, 240);
        }
        return qqg.a;
    }
}
