package defpackage;

import java.net.ProxySelector;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes.dex */
public final class sua implements Cloneable, h01 {
    public static final List K0 = yxg.k(epc.HTTP_2, epc.HTTP_1_1);
    public static final List L0 = yxg.k(gs3.e, gs3.f);
    public final List A0;
    public final List B0;
    public final qua C0;
    public final g72 D0;
    public final wyi E0;
    public final int F0;
    public final int G0;
    public final int H0;
    public final long I0;
    public final zid J0;
    public final boolean X;
    public final qha Y;
    public final boolean Z;
    public final fa6 a;
    public final x6i b;
    public final List c;
    public final List d;
    public final syf o;
    public final boolean s0;
    public final mni t0;
    public final v1a u0;
    public final ProxySelector v0;
    public final qha w0;
    public final SocketFactory x0;
    public final SSLSocketFactory y0;
    public final X509TrustManager z0;

    public sua(rua ruaVar) throws NoSuchAlgorithmException, KeyStoreException {
        this.a = ruaVar.a;
        this.b = ruaVar.b;
        this.c = yxg.w(ruaVar.c);
        this.d = yxg.w(ruaVar.d);
        this.o = ruaVar.e;
        this.X = ruaVar.f;
        this.Y = ruaVar.g;
        this.Z = ruaVar.h;
        this.s0 = ruaVar.i;
        this.t0 = ruaVar.j;
        this.u0 = ruaVar.k;
        ProxySelector proxySelector = ruaVar.l;
        proxySelector = proxySelector == null ? ProxySelector.getDefault() : proxySelector;
        this.v0 = proxySelector == null ? ypa.a : proxySelector;
        this.w0 = ruaVar.m;
        this.x0 = ruaVar.n;
        List list = ruaVar.q;
        this.A0 = list;
        this.B0 = ruaVar.r;
        this.C0 = ruaVar.s;
        this.F0 = ruaVar.v;
        this.G0 = ruaVar.w;
        this.H0 = ruaVar.x;
        this.I0 = ruaVar.y;
        zid zidVar = ruaVar.z;
        this.J0 = zidVar == null ? new zid(1) : zidVar;
        if (list == null || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((gs3) it.next()).a) {
                    SSLSocketFactory sSLSocketFactory = ruaVar.o;
                    if (sSLSocketFactory != null) {
                        this.y0 = sSLSocketFactory;
                        wyi wyiVar = ruaVar.u;
                        this.E0 = wyiVar;
                        this.z0 = ruaVar.p;
                        g72 g72Var = ruaVar.t;
                        this.D0 = fni.a(g72Var.b, wyiVar) ? g72Var : new g72(g72Var.a, wyiVar);
                    } else {
                        p2c p2cVar = p2c.a;
                        X509TrustManager x509TrustManagerM = p2c.a.m();
                        this.z0 = x509TrustManagerM;
                        this.y0 = p2c.a.l(x509TrustManagerM);
                        wyi wyiVarB = p2c.a.b(x509TrustManagerM);
                        this.E0 = wyiVarB;
                        g72 g72Var2 = ruaVar.t;
                        this.D0 = fni.a(g72Var2.b, wyiVarB) ? g72Var2 : new g72(g72Var2.a, wyiVarB);
                    }
                }
            }
            this.y0 = null;
            this.E0 = null;
            this.z0 = null;
            this.D0 = g72.c;
        } else {
            this.y0 = null;
            this.E0 = null;
            this.z0 = null;
            this.D0 = g72.c;
        }
        X509TrustManager x509TrustManager = this.z0;
        wyi wyiVar2 = this.E0;
        SSLSocketFactory sSLSocketFactory2 = this.y0;
        List list2 = this.d;
        List list3 = this.c;
        if (list3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        }
        if (list3.contains(null)) {
            throw new IllegalStateException(("Null interceptor: " + list3).toString());
        }
        if (list2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        }
        if (list2.contains(null)) {
            throw new IllegalStateException(("Null network interceptor: " + list2).toString());
        }
        List list4 = this.A0;
        if (list4 == null || !list4.isEmpty()) {
            Iterator it2 = list4.iterator();
            while (it2.hasNext()) {
                if (((gs3) it2.next()).a) {
                    if (sSLSocketFactory2 == null) {
                        throw new IllegalStateException("sslSocketFactory == null");
                    }
                    if (wyiVar2 == null) {
                        throw new IllegalStateException("certificateChainCleaner == null");
                    }
                    if (x509TrustManager == null) {
                        throw new IllegalStateException("x509TrustManager == null");
                    }
                    return;
                }
            }
        }
        if (sSLSocketFactory2 != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (wyiVar2 != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (x509TrustManager != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (!fni.a(this.D0, g72.c)) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final rua a() {
        rua ruaVar = new rua();
        ruaVar.a = this.a;
        ruaVar.b = this.b;
        af3.v(ruaVar.c, this.c);
        af3.v(ruaVar.d, this.d);
        ruaVar.e = this.o;
        ruaVar.f = this.X;
        ruaVar.g = this.Y;
        ruaVar.h = this.Z;
        ruaVar.i = this.s0;
        ruaVar.j = this.t0;
        ruaVar.k = this.u0;
        ruaVar.l = this.v0;
        ruaVar.m = this.w0;
        ruaVar.n = this.x0;
        ruaVar.o = this.y0;
        ruaVar.p = this.z0;
        ruaVar.q = this.A0;
        ruaVar.r = this.B0;
        ruaVar.s = this.C0;
        ruaVar.t = this.D0;
        ruaVar.u = this.E0;
        ruaVar.v = this.F0;
        ruaVar.w = this.G0;
        ruaVar.x = this.H0;
        ruaVar.y = this.I0;
        ruaVar.z = this.J0;
        return ruaVar;
    }

    public final mbd b(zmd zmdVar) {
        return new mbd(this, zmdVar, false);
    }

    public final Object clone() {
        return super.clone();
    }

    public sua() {
        this(new rua());
    }
}
