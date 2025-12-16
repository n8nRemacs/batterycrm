package defpackage;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes.dex */
public final class zd extends p2c {
    public static final boolean e;
    public final ArrayList c;
    public final lc3 d;

    static {
        boolean z = false;
        if (u1j.d() && Build.VERSION.SDK_INT < 30) {
            z = true;
        }
        e = z;
    }

    public zd() throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        z9f z9fVar;
        Method method;
        Method method2;
        Method method3 = null;
        try {
            Class<?> cls = Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketImpl"));
            Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketFactoryImpl"));
            Class.forName("com.android.org.conscrypt".concat(".SSLParametersImpl"));
            z9fVar = new z9f(cls);
        } catch (Exception e2) {
            p2c.a.getClass();
            p2c.i(5, "unable to load android socket classes", e2);
            z9fVar = null;
        }
        ArrayList arrayListT = ys.t(new i6f[]{z9fVar, new js4(ee.f), new js4(xs3.a), new js4(ct0.a)});
        ArrayList arrayList = new ArrayList();
        Iterator it = arrayListT.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((i6f) next).b()) {
                arrayList.add(next);
            }
        }
        this.c = arrayList;
        try {
            Class<?> cls2 = Class.forName("dalvik.system.CloseGuard");
            Method method4 = cls2.getMethod("get", null);
            method2 = cls2.getMethod("open", String.class);
            method = cls2.getMethod("warnIfOpen", null);
            method3 = method4;
        } catch (Exception unused) {
            method = null;
            method2 = null;
        }
        this.d = new lc3(method3, method2, method);
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
    public final ejg c(X509TrustManager x509TrustManager) throws NoSuchMethodException, SecurityException {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new yd(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.c(x509TrustManager);
        }
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
    public final void e(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        try {
            socket.connect(inetSocketAddress, i);
        } catch (ClassCastException e2) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e2;
            }
            throw new IOException("Exception in connect", e2);
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
    public final Object g() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        lc3 lc3Var = this.d;
        Method method = lc3Var.a;
        if (method != null) {
            try {
                Object objInvoke = method.invoke(null, null);
                lc3Var.b.invoke(objInvoke, "response.body().close()");
                return objInvoke;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    @Override // defpackage.p2c
    public final boolean h(String str) {
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    @Override // defpackage.p2c
    public final void j(Object obj, String str) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        lc3 lc3Var = this.d;
        lc3Var.getClass();
        if (obj != null) {
            try {
                lc3Var.c.invoke(obj, null);
                return;
            } catch (Exception unused) {
            }
        }
        p2c.i(5, str, null);
    }
}
