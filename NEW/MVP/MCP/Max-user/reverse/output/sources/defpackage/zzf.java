package defpackage;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes2.dex */
public final class zzf implements zfe {
    public static final /* synthetic */ int m = 0;
    public final lv4 a;
    public final yi5 b;
    public volatile boolean c;
    public final boolean d;
    public volatile String e;
    public volatile List f;
    public final String g;
    public final bwf h;
    public final bwf i;
    public final bwf j;
    public final bwf k;
    public sua l;

    public zzf(lv4 lv4Var, yi5 yi5Var, age ageVar, bwf bwfVar, bwf bwfVar2, bwf bwfVar3, bwf bwfVar4) {
        this.a = lv4Var;
        this.b = yi5Var;
        l5c l5cVar = (l5c) ageVar;
        l5cVar.getClass();
        this.d = sg4.a((int) l5cVar.m(PmsKey.f37debugmode, (long) 0)) != sg4.DISABLED;
        this.h = bwfVar2;
        this.i = bwfVar3;
        this.j = bwfVar4;
        this.k = bwfVar;
        f(l9j.a(l5cVar.t(PmsKey.proxy, null)));
        List listE = l5cVar.e(PmsKey.f122proxydomains.name(), hd5.a);
        synchronized (this) {
            this.f = listE;
        }
        StringBuilder sb = new StringBuilder("OKMessages/");
        sb.append(lv4Var.j().b);
        sb.append(" (");
        sb.append(lv4Var.j().d);
        sb.append("; ");
        sb.append(lv4Var.j().h);
        sb.append("; ");
        String strL = ho7.l(sb, lv4Var.j().i, ")");
        try {
            this.g = URLEncoder.encode(strL, Charset.defaultCharset().name());
        } catch (UnsupportedEncodingException unused) {
            this.g = strL;
        }
    }

    public static void c(zzf zzfVar, an3 an3Var, boolean z) {
        if (l8g.c(zzfVar.e)) {
            ((y3b) zzfVar.b).a(new IllegalStateException("proxy is null or empty!"));
            an3Var.k(z ? 443 : 80);
        } else {
            an3Var.h(zzfVar.e);
            an3Var.k(z ? 443 : 80);
        }
    }

    @Override // defpackage.zfe
    public final void a(String str, String str2) {
        f(str2);
    }

    @Override // defpackage.zfe
    public final void b(List list, List list2) {
        synchronized (this) {
            this.f = list2;
        }
    }

    public final boolean d(String str) {
        if (l8g.c(str)) {
            return false;
        }
        for (String str2 : this.f) {
            if (str.equals(str2)) {
                return true;
            }
            if (str.endsWith("." + str2)) {
                return true;
            }
        }
        return false;
    }

    public final sua e() {
        if (this.l == null) {
            rua ruaVar = new rua();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            ruaVar.w = yxg.b();
            ruaVar.x = yxg.b();
            ExecutorService executorService = (ExecutorService) this.k.getValue();
            fa6 fa6Var = new fa6(5);
            fa6Var.a = executorService;
            ruaVar.a = fa6Var;
            ruaVar.v = yxg.b();
            int i = 1;
            ruaVar.c.add(new yzf(this, i));
            ruaVar.d.add(new yzf(this, 0));
            if (this.d) {
                ruaVar.d.add(new mt0(i, "zzf"));
            } else {
                this.a.e();
            }
            bwf bwfVar = this.h;
            if (bwfVar != null && this.i != null) {
                SSLSocketFactory sSLSocketFactory = (SSLSocketFactory) bwfVar.getValue();
                X509TrustManager x509TrustManager = (X509TrustManager) this.i.getValue();
                if (!sSLSocketFactory.equals(ruaVar.o) || !x509TrustManager.equals(ruaVar.p)) {
                    ruaVar.z = null;
                }
                ruaVar.o = sSLSocketFactory;
                p2c p2cVar = p2c.a;
                ruaVar.u = p2c.a.b(x509TrustManager);
                ruaVar.p = x509TrustManager;
                bwf bwfVar2 = this.j;
                if (bwfVar2 != null && bwfVar2.getValue() != null) {
                    throw new ClassCastException();
                }
            }
            this.l = new sua(ruaVar);
        }
        return this.l;
    }

    public final synchronized void f(String str) {
        this.c = !l8g.c(str);
        this.e = str;
    }
}
