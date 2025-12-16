package defpackage;

import android.net.TrafficStats;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import org.apache.http.HttpStatus;
import org.apache.http.protocol.HTTP;
import ru.ok.messages.http.UnknownOkhttpException;

/* loaded from: classes2.dex */
public final class yzf implements bp7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzf b;

    public /* synthetic */ yzf(zzf zzfVar, int i) {
        this.a = i;
        this.b = zzfVar;
    }

    @Override // defpackage.bp7
    public final ood a(rbd rbdVar) throws IOException {
        ga7 ga7VarB;
        switch (this.a) {
            case 0:
                zmd zmdVarA = (zmd) rbdVar.i;
                ga7 ga7Var = zmdVarA.b;
                if (this.b.c) {
                    String strG = ga7Var.g("TAM_TAM_ORIGINAL_HOST");
                    if (!l8g.c(strG)) {
                        an3 an3VarF = ga7Var.f();
                        an3VarF.l("TAM_TAM_ORIGINAL_HOST");
                        ga7 ga7VarB2 = an3VarF.b();
                        kw6 kw6VarA = zmdVarA.a();
                        ((i17) kw6VarA.c).h(HTTP.TARGET_HOST, strG);
                        kw6VarA.a = ga7VarB2;
                        zmdVarA = kw6VarA.a();
                    }
                }
                try {
                    ood oodVarD = rbdVar.d(zmdVarA);
                    if (!this.b.c) {
                        return oodVarD;
                    }
                    int i = oodVarD.d;
                    if (i != 307 && i != 308) {
                        switch (i) {
                            case HttpStatus.SC_MULTIPLE_CHOICES /* 300 */:
                            case HttpStatus.SC_MOVED_PERMANENTLY /* 301 */:
                            case HttpStatus.SC_MOVED_TEMPORARILY /* 302 */:
                            case HttpStatus.SC_SEE_OTHER /* 303 */:
                                break;
                            default:
                                return oodVarD;
                        }
                    }
                    String strA = oodVarD.X.a("Location");
                    if (strA == null) {
                        strA = null;
                    }
                    if (l8g.c(strA)) {
                        wqi.e("zzf", "Redirect, but Location is empty", null);
                        return oodVarD;
                    }
                    try {
                        an3 an3Var = new an3();
                        an3Var.j(null, strA);
                        ga7VarB = an3Var.b();
                    } catch (IllegalArgumentException unused) {
                        ga7VarB = null;
                    }
                    if (ga7VarB == null) {
                        Locale locale = Locale.ENGLISH;
                        wqi.e("zzf", "Can't parse location " + strA, null);
                        return oodVarD;
                    }
                    String str = ga7VarB.e;
                    zzf zzfVar = this.b;
                    an3 an3VarF2 = ga7VarB.f();
                    zzf.c(zzfVar, an3VarF2, zmdVarA.b.a);
                    an3VarF2.l("TAM_TAM_ORIGINAL_HOST");
                    if (an3VarF2.d == null) {
                        an3VarF2.d = new ArrayList();
                    }
                    an3VarF2.d.add(mni.y("TAM_TAM_ORIGINAL_HOST", 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", 219));
                    an3VarF2.d.add(str != null ? mni.y(str, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", 219) : null);
                    ga7 ga7VarB3 = an3VarF2.b();
                    nod nodVarW = oodVarD.w();
                    nodVarW.f.h("Location", ga7VarB3.i);
                    return nodVarW.a();
                } catch (ClassCastException unused2) {
                    throw new IOException("ClassCastException");
                } catch (RuntimeException e) {
                    wqi.e("zzf", "Http redirect failed", e);
                    throw new UnknownOkhttpException("Http redirect failed", e);
                }
            default:
                TrafficStats.setThreadStatsTag(61453);
                zmd zmdVar = (zmd) rbdVar.i;
                kw6 kw6VarA2 = zmdVar.a();
                ((i17) kw6VarA2.c).h(HTTP.USER_AGENT, this.b.g);
                ga7 ga7Var2 = zmdVar.b;
                String str2 = ga7Var2.e;
                if (this.b.c) {
                    if (!this.b.d(str2)) {
                        StringBuilder sbN = az1.n("Http request behind the proxy. Host = ", str2, ", path = ");
                        sbN.append(ga7Var2.b());
                        ((y3b) this.b.b).a(new IllegalStateException(sbN.toString()));
                    }
                    if (str2.equals(this.b.e)) {
                        StringBuilder sbN2 = az1.n("Http request with direct proxy Host = ", str2, ", path = ");
                        sbN2.append(ga7Var2.b());
                        ((y3b) this.b.b).a(new IllegalStateException(sbN2.toString()));
                    }
                    zzf zzfVar2 = this.b;
                    an3 an3VarF3 = ga7Var2.f();
                    zzf.c(zzfVar2, an3VarF3, zmdVar.b.a);
                    ga7 ga7VarB4 = an3VarF3.b();
                    ((i17) kw6VarA2.c).h(HTTP.TARGET_HOST, str2);
                    kw6VarA2.a = ga7VarB4;
                }
                try {
                    return rbdVar.d(kw6VarA2.a());
                } catch (ClassCastException unused3) {
                    throw new IOException("ClassCastException");
                } catch (RuntimeException e2) {
                    wqi.e("zzf", "Http request failed", e2);
                    throw new UnknownOkhttpException("Http request failed", e2);
                }
        }
    }
}
