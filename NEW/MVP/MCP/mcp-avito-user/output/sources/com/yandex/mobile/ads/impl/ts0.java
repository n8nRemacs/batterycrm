package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.h80;
import com.yandex.mobile.ads.impl.n9;
import com.yandex.mobile.ads.impl.t9;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.collections.C42745f0;
import okio.C44802l;

/* loaded from: classes8.dex */
public class ts0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private static volatile ts0 f390301a = a.a();

    /* renamed from: b, reason: collision with root package name */
    private static final Logger f390302b = Logger.getLogger(bq0.class.getName());

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f390303c = 0;

    public static final class a {
        public static final ts0 a() {
            if (!c()) {
                i80 i80Var = i80.f386364d ? new i80() : null;
                if (i80Var != null) {
                    return i80Var;
                }
                int i12 = h80.f385923i;
                h80 h80VarA = h80.b.a();
                return h80VarA != null ? h80VarA : new ts0();
            }
            q9.a();
            int i13 = n9.f388192f;
            n9 n9VarA = n9.a.a();
            if (n9VarA != null) {
                return n9VarA;
            }
            int i14 = t9.f390124g;
            return t9.a.a();
        }

        @X41.n
        @Y61.k
        public static ts0 b() {
            return ts0.f390301a;
        }

        public static boolean c() {
            return "Dalvik".equals(System.getProperty("java.vm.name"));
        }

        @Y61.k
        public static byte[] b(@Y61.k List list) {
            C44802l c44802l = new C44802l();
            Iterator it = a(list).iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                c44802l.D(str.length());
                c44802l.N(0, str.length(), str);
            }
            return c44802l.p5(c44802l.f420125c);
        }

        @Y61.k
        public static ArrayList a(@Y61.k List list) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((sv0) obj) != sv0.f390033b) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((sv0) it.next()).toString());
            }
            return arrayList2;
        }
    }

    @Y61.k
    public static SSLSocketFactory c(@Y61.k X509TrustManager x509TrustManager) throws NoSuchAlgorithmException, KeyManagementException {
        try {
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            sSLContext.init(null, new TrustManager[]{x509TrustManager}, null);
            return sSLContext.getSocketFactory();
        } catch (GeneralSecurityException e12) {
            throw new AssertionError("No System TLS: " + e12, e12);
        }
    }

    public void a(@Y61.k SSLSocket sSLSocket) {
    }

    @Y61.l
    public String b(@Y61.k SSLSocket sSLSocket) {
        return null;
    }

    @Y61.k
    public final String toString() {
        return getClass().getSimpleName();
    }

    public void a(@Y61.k SSLSocket sSLSocket, @Y61.l String str, @Y61.k List<sv0> list) {
    }

    @Y61.l
    public Object b() {
        if (f390302b.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    public boolean a(@Y61.k String str) {
        return true;
    }

    @Y61.k
    public ab1 b(@Y61.k X509TrustManager x509TrustManager) {
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        return new mf((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public void a(@Y61.l Object obj, @Y61.k String str) {
        if (obj == null) {
            str = up1.a(str, " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        a(5, str, (Throwable) obj);
    }

    @Y61.k
    public static X509TrustManager c() throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                return (X509TrustManager) trustManager;
            }
        }
        StringBuilder sbA = Cif.a("Unexpected default trust managers: ");
        sbA.append(Arrays.toString(trustManagers));
        throw new IllegalStateException(sbA.toString().toString());
    }

    public void a(@Y61.k Socket socket, @Y61.k InetSocketAddress inetSocketAddress, int i12) throws IOException {
        socket.connect(inetSocketAddress, i12);
    }

    public static /* synthetic */ void a(ts0 ts0Var, String str, int i12, int i13) {
        if ((i13 & 2) != 0) {
            i12 = 4;
        }
        ts0Var.getClass();
        a(i12, str, (Throwable) null);
    }

    public static void a(int i12, @Y61.k String str, @Y61.l Throwable th2) {
        f390302b.log(i12 == 5 ? Level.WARNING : Level.INFO, str, th2);
    }

    @Y61.k
    public ji a(@Y61.k X509TrustManager x509TrustManager) {
        return new kf(b(x509TrustManager));
    }
}
