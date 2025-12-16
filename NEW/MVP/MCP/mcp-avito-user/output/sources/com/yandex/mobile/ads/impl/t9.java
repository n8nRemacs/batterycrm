package com.yandex.mobile.ads.impl;

import android.os.Build;
import android.security.NetworkSecurityPolicy;
import com.yandex.mobile.ads.impl.p9;
import com.yandex.mobile.ads.impl.ts0;
import com.yandex.mobile.ads.impl.uj;
import com.yandex.mobile.ads.impl.v61;
import com.yandex.mobile.ads.impl.v9;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.collections.C42756l;

/* loaded from: classes8.dex */
public final class t9 extends ts0 {

    /* renamed from: f, reason: collision with root package name */
    private static final boolean f390123f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f390124g = 0;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    private final ArrayList f390125d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    private final uj f390126e;

    public static final class a {
        @Y61.l
        public static t9 a() {
            if (t9.f390123f) {
                return new t9();
            }
            return null;
        }
    }

    public static final class b implements ab1 {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        private final X509TrustManager f390127a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        private final Method f390128b;

        public b(@Y61.k X509TrustManager x509TrustManager, @Y61.k Method method) {
            this.f390127a = x509TrustManager;
            this.f390128b = method;
        }

        @Override // com.yandex.mobile.ads.impl.ab1
        @Y61.l
        public final X509Certificate a(@Y61.k X509Certificate x509Certificate) {
            try {
                return ((TrustAnchor) this.f390128b.invoke(this.f390127a, x509Certificate)).getTrustedCert();
            } catch (IllegalAccessException e12) {
                throw new AssertionError("unable to get issues and signature", e12);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return kotlin.jvm.internal.L.f(this.f390127a, bVar.f390127a) && kotlin.jvm.internal.L.f(this.f390128b, bVar.f390128b);
        }

        public final int hashCode() {
            return this.f390128b.hashCode() + (this.f390127a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sbA = Cif.a("CustomTrustRootIndex(trustManager=");
            sbA.append(this.f390127a);
            sbA.append(", findByIssuerAndSignatureMethod=");
            sbA.append(this.f390128b);
            sbA.append(')');
            return sbA.toString();
        }
    }

    static {
        f390123f = ts0.a.c() && Build.VERSION.SDK_INT < 30;
    }

    public t9() {
        int i12 = v61.f390803h;
        v61 v61VarA = v61.a.a();
        int i13 = v9.f390819g;
        ArrayList arrayListB = C42756l.B(new d61[]{v61VarA, new qp(v9.a.b())});
        ArrayList arrayList = new ArrayList();
        Iterator it = arrayListB.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((d61) next).a()) {
                arrayList.add(next);
            }
        }
        this.f390125d = arrayList;
        this.f390126e = uj.a.a();
    }

    @Override // com.yandex.mobile.ads.impl.ts0
    public final void a(@Y61.k Socket socket, @Y61.k InetSocketAddress inetSocketAddress, int i12) throws IOException {
        socket.connect(inetSocketAddress, i12);
    }

    @Override // com.yandex.mobile.ads.impl.ts0
    @Y61.l
    public final String b(@Y61.k SSLSocket sSLSocket) {
        Object next;
        Iterator it = this.f390125d.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((d61) next).a(sSLSocket)) {
                break;
            }
        }
        d61 d61Var = (d61) next;
        if (d61Var != null) {
            return d61Var.b(sSLSocket);
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.ts0
    public final void a(@Y61.k SSLSocket sSLSocket, @Y61.l String str, @Y61.k List<sv0> list) {
        Object next;
        Iterator it = this.f390125d.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((d61) next).a(sSLSocket)) {
                    break;
                }
            }
        }
        d61 d61Var = (d61) next;
        if (d61Var != null) {
            d61Var.a(sSLSocket, str, list);
        }
    }

    @Override // com.yandex.mobile.ads.impl.ts0
    @Y61.l
    public final Object b() {
        return this.f390126e.a();
    }

    @Override // com.yandex.mobile.ads.impl.ts0
    @Y61.k
    public final ab1 b(@Y61.k X509TrustManager x509TrustManager) throws NoSuchMethodException, SecurityException {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new b(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.b(x509TrustManager);
        }
    }

    @Override // com.yandex.mobile.ads.impl.ts0
    public final void a(@Y61.l Object obj, @Y61.k String str) {
        if (this.f390126e.a(obj)) {
            return;
        }
        ts0.a(this, str, 5, 4);
    }

    @Override // com.yandex.mobile.ads.impl.ts0
    public final boolean a(@Y61.k String str) {
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    @Override // com.yandex.mobile.ads.impl.ts0
    @Y61.k
    public final ji a(@Y61.k X509TrustManager x509TrustManager) {
        p9 p9VarA = p9.a.a(x509TrustManager);
        return p9VarA != null ? p9VarA : super.a(x509TrustManager);
    }
}
