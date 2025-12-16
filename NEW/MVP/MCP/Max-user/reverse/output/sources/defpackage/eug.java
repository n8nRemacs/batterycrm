package defpackage;

import java.io.File;

/* loaded from: classes2.dex */
public final /* synthetic */ class eug implements gu3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xm9 b;

    public /* synthetic */ eug(xm9 xm9Var, int i) {
        this.a = i;
        this.b = xm9Var;
    }

    @Override // defpackage.gu3
    public final void accept(Object obj) {
        Object ipdVar;
        Object ipdVar2;
        Object ipdVar3;
        Object ipdVar4;
        Object ipdVar5;
        x00 x00Var = (x00) obj;
        switch (this.a) {
            case 0:
                x00Var.k = 100.0f;
                x00Var.i = p10.c;
                xm9 xm9Var = this.b;
                ttg ttgVar = xm9Var.a;
                String str = ttgVar.b;
                tvg tvgVar = ttgVar.h;
                x00Var.m = str;
                x00Var.u = pbj.e(str);
                s10 s10Var = x00Var.a;
                int i = s10Var == null ? -1 : fug.$EnumSwitchMapping$0[s10Var.ordinal()];
                if (i == 1) {
                    k10 k10Var = x00Var.b;
                    if (k10Var == null) {
                        k10Var = k10.v0;
                    }
                    j10 j10VarB = k10Var.b();
                    j10VarB.g = tvgVar.a;
                    x00Var.b = new k10(j10VarB);
                    break;
                } else if (i == 2) {
                    w00 w00Var = x00Var.e;
                    if (w00Var == null) {
                        w00Var = w00.j;
                    }
                    v00 v00VarA = w00Var.a();
                    v00VarA.e = tvgVar.a;
                    v00VarA.a = tvgVar.b;
                    x00Var.e = new w00(v00VarA);
                    break;
                } else if (i == 3) {
                    t10 t10VarA = x00Var.c().a();
                    t10VarA.a = tvgVar.b;
                    t10VarA.m = tvgVar.a;
                    x00Var.d = new v10(t10VarA);
                    break;
                } else if (i == 4) {
                    e10 e10VarA = x00Var.b().a();
                    e10VarA.a = tvgVar.b;
                    e10VarA.d = tvgVar.a;
                    x00Var.r = new f10(e10VarA);
                    break;
                } else if (i == 5) {
                    x00Var.f = po8.q(xm9Var.b);
                    break;
                } else {
                    wqi.e("UploadDraftMediaWorker", "Unknown attach type " + x00Var.a, null);
                    break;
                }
            case 1:
                x00Var.i = p10.o;
                ttg ttgVar2 = this.b.a;
                bug bugVar = ttgVar2.a;
                x00Var.m = bugVar.a;
                x00Var.u = bugVar.b;
                x00Var.k = ttgVar2.e;
                x00Var.o = ttgVar2.f;
                break;
            default:
                xm9 xm9Var2 = this.b;
                ttg ttgVar3 = xm9Var2.a;
                x00Var.k = 100.0f;
                x00Var.i = p10.c;
                s10 s10Var2 = x00Var.a;
                int i2 = s10Var2 == null ? -1 : vug.$EnumSwitchMapping$0[s10Var2.ordinal()];
                if (i2 == 1) {
                    String str2 = ttgVar3.h.a;
                    k10 k10Var2 = x00Var.b;
                    if (k10Var2 == null) {
                        k10Var2 = k10.v0;
                    }
                    j10 j10VarB2 = k10Var2.b();
                    j10VarB2.g = str2;
                    x00Var.b = new k10(j10VarB2);
                    String str3 = ttgVar3.b;
                    x00Var.m = str3;
                    try {
                        ipdVar = Long.valueOf(new File(str3).lastModified());
                    } catch (Throwable th) {
                        ipdVar = new ipd(th);
                    }
                    x00Var.u = ((Number) (ipdVar instanceof ipd ? 0L : ipdVar)).longValue();
                    break;
                } else if (i2 == 2) {
                    tvg tvgVar2 = ttgVar3.h;
                    long j = tvgVar2.b;
                    String str4 = tvgVar2.a;
                    w00 w00Var2 = x00Var.e;
                    if (w00Var2 == null) {
                        w00Var2 = w00.j;
                    }
                    v00 v00VarA2 = w00Var2.a();
                    v00VarA2.e = str4;
                    v00VarA2.a = j;
                    x00Var.e = new w00(v00VarA2);
                    String str5 = ttgVar3.b;
                    x00Var.m = str5;
                    try {
                        ipdVar2 = Long.valueOf(new File(str5).lastModified());
                    } catch (Throwable th2) {
                        ipdVar2 = new ipd(th2);
                    }
                    x00Var.u = ((Number) (ipdVar2 instanceof ipd ? 0L : ipdVar2)).longValue();
                    break;
                } else if (i2 == 3) {
                    tvg tvgVar3 = ttgVar3.h;
                    long j2 = tvgVar3.b;
                    String str6 = tvgVar3.a;
                    t10 t10VarA2 = x00Var.c().a();
                    t10VarA2.a = j2;
                    t10VarA2.m = str6;
                    x00Var.d = new v10(t10VarA2);
                    String str7 = ttgVar3.b;
                    x00Var.m = str7;
                    try {
                        ipdVar3 = Long.valueOf(new File(str7).lastModified());
                    } catch (Throwable th3) {
                        ipdVar3 = new ipd(th3);
                    }
                    x00Var.u = ((Number) (ipdVar3 instanceof ipd ? 0L : ipdVar3)).longValue();
                    break;
                } else if (i2 == 4) {
                    tvg tvgVar4 = ttgVar3.h;
                    long j3 = tvgVar4.b;
                    String str8 = tvgVar4.a;
                    e10 e10VarA2 = x00Var.b().a();
                    e10VarA2.a = j3;
                    e10VarA2.d = str8;
                    x00Var.r = new f10(e10VarA2);
                    String str9 = ttgVar3.b;
                    x00Var.m = str9;
                    try {
                        ipdVar4 = Long.valueOf(new File(str9).lastModified());
                    } catch (Throwable th4) {
                        ipdVar4 = new ipd(th4);
                    }
                    x00Var.u = ((Number) (ipdVar4 instanceof ipd ? 0L : ipdVar4)).longValue();
                    break;
                } else if (i2 == 5) {
                    x00Var.f = po8.q(xm9Var2.b);
                    String str10 = ttgVar3.b;
                    x00Var.m = str10;
                    try {
                        ipdVar5 = Long.valueOf(new File(str10).lastModified());
                    } catch (Throwable th5) {
                        ipdVar5 = new ipd(th5);
                    }
                    x00Var.u = ((Number) (ipdVar5 instanceof ipd ? 0L : ipdVar5)).longValue();
                    break;
                }
                break;
        }
    }
}
