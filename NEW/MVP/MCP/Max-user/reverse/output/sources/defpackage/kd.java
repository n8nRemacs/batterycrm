package defpackage;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes.dex */
public final class kd extends p2c {
    public static final boolean d;
    public final ArrayList c;

    static {
        d = u1j.d() && Build.VERSION.SDK_INT >= 29;
    }

    public kd() {
        ArrayList arrayListT = ys.t(new i6f[]{(!u1j.d() || Build.VERSION.SDK_INT < 29) ? null : new ld(), new js4(ee.f), new js4(xs3.a), new js4(ct0.a)});
        ArrayList arrayList = new ArrayList();
        Iterator it = arrayListT.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((i6f) next).b()) {
                arrayList.add(next);
            }
        }
        this.c = arrayList;
    }

    @Override // defpackage.p2c
    public final wyi b(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        md mdVar = x509TrustManagerExtensions != null ? new md(x509TrustManager, x509TrustManagerExtensions) : null;
        return mdVar != null ? mdVar : super.b(x509TrustManager);
    }

    @Override // defpackage.p2c
    public final void d(SSLSocket sSLSocket, String str, List list) {
        Object next;
        Iterator it = this.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((i6f) next).a(sSLSocket)) {
                    break;
                }
            }
        }
        i6f i6fVar = (i6f) next;
        if (i6fVar != null) {
            i6fVar.d(sSLSocket, str, list);
        }
    }

    @Override // defpackage.p2c
    public final String f(SSLSocket sSLSocket) {
        Object next;
        Iterator it = this.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((i6f) next).a(sSLSocket)) {
                break;
            }
        }
        i6f i6fVar = (i6f) next;
        if (i6fVar != null) {
            return i6fVar.c(sSLSocket);
        }
        return null;
    }

    @Override // defpackage.p2c
    public final boolean h(String str) {
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }
}
