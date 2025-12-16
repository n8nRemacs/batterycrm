package defpackage;

import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import org.apache.http.HttpHost;

/* loaded from: classes.dex */
public final class aa {
    public final ga7 a;
    public final List b;
    public final List c;
    public final v1a d;
    public final SocketFactory e;
    public final SSLSocketFactory f;
    public final HostnameVerifier g;
    public final g72 h;
    public final qha i;
    public final ProxySelector j;

    public aa(String str, int i, v1a v1aVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, g72 g72Var, qha qhaVar, List list, List list2, ProxySelector proxySelector) {
        this.d = v1aVar;
        this.e = socketFactory;
        this.f = sSLSocketFactory;
        this.g = hostnameVerifier;
        this.h = g72Var;
        this.i = qhaVar;
        this.j = proxySelector;
        an3 an3Var = new an3();
        String str2 = sSLSocketFactory != null ? "https" : HttpHost.DEFAULT_SCHEME_NAME;
        if (str2.equalsIgnoreCase(HttpHost.DEFAULT_SCHEME_NAME)) {
            an3Var.e = HttpHost.DEFAULT_SCHEME_NAME;
        } else {
            if (!str2.equalsIgnoreCase("https")) {
                throw new IllegalArgumentException("unexpected scheme: ".concat(str2));
            }
            an3Var.e = "https";
        }
        an3Var.h(str);
        an3Var.k(i);
        this.a = an3Var.b();
        this.b = yxg.w(list);
        this.c = yxg.w(list2);
    }

    public final boolean a(aa aaVar) {
        return fni.a(this.d, aaVar.d) && fni.a(this.i, aaVar.i) && fni.a(this.b, aaVar.b) && fni.a(this.c, aaVar.c) && fni.a(this.j, aaVar.j) && fni.a(this.f, aaVar.f) && fni.a(this.g, aaVar.g) && fni.a(this.h, aaVar.h) && this.a.f == aaVar.a.f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof aa)) {
            return false;
        }
        aa aaVar = (aa) obj;
        return fni.a(this.a, aaVar.a) && a(aaVar);
    }

    public final int hashCode() {
        return Objects.hashCode(this.h) + ((Objects.hashCode(this.g) + ((Objects.hashCode(this.f) + ((this.j.hashCode() + xrf.l(this.c, xrf.l(this.b, (this.i.hashCode() + ((this.d.hashCode() + u45.e(527, 31, this.a.i)) * 31)) * 31, 31), 31)) * 961)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        ga7 ga7Var = this.a;
        sb.append(ga7Var.e);
        sb.append(':');
        sb.append(ga7Var.f);
        sb.append(", ");
        sb.append("proxySelector=" + this.j);
        sb.append("}");
        return sb.toString();
    }
}
