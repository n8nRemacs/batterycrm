package defpackage;

import java.util.ArrayList;
import one.me.sdk.transfer.domain.UploadException;

/* loaded from: classes2.dex */
public final /* synthetic */ class ytg implements gu3, tm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ttg b;

    public /* synthetic */ ytg(ttg ttgVar, int i) {
        this.a = i;
        this.b = ttgVar;
    }

    @Override // defpackage.gu3
    public void accept(Object obj) {
        int i = this.a;
        ttg ttgVar = this.b;
        switch (i) {
            case 0:
                wqi.f("aug", "putUploadInRepository: failed, upload=%s", ttgVar, (Throwable) obj);
                break;
            default:
                x00 x00Var = (x00) obj;
                x00Var.i = p10.o;
                bug bugVar = ttgVar.a;
                x00Var.m = bugVar.a;
                x00Var.u = bugVar.b;
                x00Var.k = ttgVar.e;
                x00Var.o = ttgVar.f;
                break;
        }
    }

    @Override // defpackage.tm6
    public Object apply(Object obj) {
        svg svgVar;
        switch (this.a) {
            case 1:
                l0g l0gVar = (l0g) obj;
                boolean z = l0gVar instanceof ddh;
                ttg ttgVar = this.b;
                if (z) {
                    ArrayList arrayList = ((ddh) l0gVar).c;
                    edh edhVar = (edh) (arrayList != null ? ue3.d0(arrayList) : hd5.a).get(0);
                    stg stgVarB = ttgVar.b();
                    stgVarB.d = edhVar.a;
                    svg svgVar2 = new svg();
                    svgVar2.a = edhVar.c;
                    svgVar2.b = edhVar.b;
                    stgVarB.h = new tvg(svgVar2);
                    return new ttg(stgVarB);
                }
                if (l0gVar instanceof fy5) {
                    gy5 gy5Var = (gy5) ((fy5) l0gVar).c.get(0);
                    stg stgVarB2 = ttgVar.b();
                    stgVarB2.d = gy5Var.c;
                    svg svgVar3 = new svg();
                    svgVar3.a = gy5Var.b;
                    svgVar3.b = gy5Var.a;
                    stgVarB2.h = new tvg(svgVar3);
                    return new ttg(stgVarB2);
                }
                if (l0gVar instanceof fvb) {
                    stg stgVarB3 = ttgVar.b();
                    stgVarB3.d = ((fvb) l0gVar).c;
                    return new ttg(stgVarB3);
                }
                if (l0gVar instanceof qgf) {
                    stg stgVarB4 = ttgVar.b();
                    stgVarB4.d = ((qgf) l0gVar).c;
                    return new ttg(stgVarB4);
                }
                throw new UploadException("requestUrlSingle, can't request url for unknown media type= " + ttgVar.a.c);
            case 2:
            default:
                ewg ewgVar = (ewg) obj;
                cug cugVar = new cug();
                ttg ttgVar2 = this.b;
                bug bugVar = ttgVar2.a;
                cugVar.b = bugVar.d;
                ey2 ey2Var = new ey2(4, false);
                ey2Var.c = bugVar.a;
                ey2Var.d = bugVar.c;
                ey2Var.b = bugVar.b;
                cugVar.a = ey2Var;
                cugVar.c = ttgVar2.b;
                cugVar.d = ttgVar2.c;
                cugVar.e = ttgVar2.d;
                cugVar.f = ttgVar2.e;
                cugVar.g = ttgVar2.f;
                cugVar.h = ttgVar2.g;
                tvg tvgVar = ttgVar2.h;
                if (tvgVar == null) {
                    svgVar = null;
                } else {
                    svg svgVar4 = new svg();
                    svgVar4.b = tvgVar.b;
                    svgVar4.a = tvgVar.a;
                    svgVar = svgVar4;
                }
                cugVar.i = svgVar;
                cugVar.j = ttgVar2.i;
                ewgVar.getClass();
                return new kk3(2, new jad(ewgVar, 15, cugVar));
            case 3:
                return new xm9(this.b, (jef) obj);
        }
    }
}
