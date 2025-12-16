package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes2.dex */
public final class qxf extends dtf implements sm6 {
    public vxf X;
    public int Y;
    public final /* synthetic */ vxf Z;
    public vxf o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qxf(vxf vxfVar, Continuation continuation) {
        super(2, continuation);
        this.Z = vxfVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((qxf) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new qxf(this.Z, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        vxf vxfVar;
        vxf vxfVar2;
        int i = this.Y;
        try {
            if (i == 0) {
                g8j.b(obj);
                vxf vxfVar3 = this.Z;
                try {
                    o42 o42VarD = gw0.d(((qh8) vxfVar3.Z.getValue()).stream());
                    this.o = vxfVar3;
                    this.X = vxfVar3;
                    this.Y = 1;
                    Object objP = gw0.p(o42VarD, this);
                    g84 g84Var = g84.a;
                    if (objP == g84Var) {
                        return g84Var;
                    }
                    vxfVar2 = vxfVar3;
                    vxfVar = vxfVar2;
                } catch (Throwable th) {
                    th = th;
                    vxfVar = vxfVar3;
                    wqi.p(vxfVar.b, "fail to track pms keys", th);
                    return qqg.a;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                vxfVar = this.X;
                vxfVar2 = this.o;
                try {
                    g8j.b(obj);
                } catch (Throwable th2) {
                    th = th2;
                    wqi.p(vxfVar.b, "fail to track pms keys", th);
                    return qqg.a;
                }
            }
            age ageVar = (age) vxfVar2.o.getValue();
            k18 k18Var = vxfVar2.s0;
            l5c l5cVar = (l5c) ageVar;
            l5cVar.getClass();
            imb imbVar = new imb("net-new-client-enabled", String.valueOf(l5cVar.j(PmsKey.f107netnewclientenabled, false)));
            imb imbVar2 = new imb("one-video-player", String.valueOf(((gu5) ((rt5) k18Var.getValue())).r()));
            gu5 gu5Var = (gu5) ((rt5) k18Var.getValue());
            gu5Var.getClass();
            imb imbVar3 = new imb("one-video-uploader", String.valueOf(gu5Var.j(PmsKey.f119onevideouploader, false)));
            gu5 gu5Var2 = (gu5) ((rt5) k18Var.getValue());
            ut5 ut5Var = gu5Var2.O;
            yy7[] yy7VarArr = gu5.S;
            imb imbVar4 = new imb("suspend-video-converter", String.valueOf(((Boolean) ut5Var.D(gu5Var2, yy7VarArr[29])).booleanValue()));
            imb imbVar5 = new imb("chatlist-subtitle-ver", String.valueOf(((gu5) ((rt5) k18Var.getValue())).n()));
            gu5 gu5Var3 = (gu5) ((rt5) k18Var.getValue());
            imb imbVar6 = new imb("calls-sdk-enable-nohost", String.valueOf(((Boolean) gu5Var3.n.D(gu5Var3, yy7VarArr[4])).booleanValue()));
            gu5 gu5Var4 = (gu5) ((rt5) k18Var.getValue());
            imb imbVar7 = new imb("video-content-cache-ttl", String.valueOf(((Number) gu5Var4.P.D(gu5Var4, yy7VarArr[30])).longValue()));
            l5c l5cVar2 = (l5c) ((age) vxfVar2.o.getValue());
            l5cVar2.getClass();
            imb imbVar8 = new imb("official-org", String.valueOf(l5cVar2.j(PmsKey.f117officialorg, false)));
            gu5 gu5Var5 = (gu5) ((rt5) k18Var.getValue());
            us usVarA = ori.a(imbVar, imbVar2, imbVar3, imbVar4, imbVar5, imbVar6, imbVar7, imbVar8, new imb("ab-status", String.valueOf(((Number) gu5Var5.A.D(gu5Var5, yy7VarArr[14])).longValue())));
            ((mq) vxfVar2.d()).getClass();
            if (!usVarA.isEmpty()) {
                uyf uyfVar = feg.f;
                if (uyfVar == null) {
                    uyfVar = null;
                }
                uyfVar.c(usVarA);
            }
            return qqg.a;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
