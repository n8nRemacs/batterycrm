package ru.tinkoff.core.components.security.ssltrusted.certs.enrich;

import Y61.k;
import Y61.l;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import com.avito.android.R;
import j.X;
import java.io.InputStream;
import java.net.Socket;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.X509ExtendedTrustManager;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: MediatorTrustManager24.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/tinkoff/core/components/security/ssltrusted/certs/enrich/e;", "Ljavax/net/ssl/X509ExtendedTrustManager;", "ru.tinkoff.core.components.security.ssl-trusted-certs"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"CustomX509TrustManager"})
@X
/* loaded from: classes9.dex */
public final class e extends X509ExtendedTrustManager {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f437009f = 0;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Context f437010a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC42726C f437011b = C42727D.c(new b());

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC42726C f437012c = C42727D.c(new c());

    /* renamed from: d, reason: collision with root package name */
    @k
    public final InterfaceC42726C f437013d = C42727D.c(new a());

    /* renamed from: e, reason: collision with root package name */
    @k
    public final InterfaceC42726C f437014e = C42727D.c(new d());

    /* compiled from: MediatorTrustManager24.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljavax/net/ssl/X509ExtendedTrustManager;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a extends N implements Y41.a<X509ExtendedTrustManager> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final X509ExtendedTrustManager invoke() throws Resources.NotFoundException {
            int i12 = e.f437009f;
            e eVar = e.this;
            eVar.getClass();
            g gVar = g.f437019a;
            InputStream inputStreamOpenRawResource = eVar.f437010a.getResources().openRawResource(R.raw.ministry_of_digital_development_root_cert);
            gVar.getClass();
            return (X509ExtendedTrustManager) g.b(g.a(g.c(inputStreamOpenRawResource)));
        }
    }

    /* compiled from: MediatorTrustManager24.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljavax/net/ssl/X509ExtendedTrustManager;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class b extends N implements Y41.a<X509ExtendedTrustManager> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final X509ExtendedTrustManager invoke() {
            int i12 = e.f437009f;
            e.this.getClass();
            g.f437019a.getClass();
            return (X509ExtendedTrustManager) g.b(null);
        }
    }

    /* compiled from: MediatorTrustManager24.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljavax/net/ssl/X509ExtendedTrustManager;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class c extends N implements Y41.a<X509ExtendedTrustManager> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final X509ExtendedTrustManager invoke() throws Resources.NotFoundException {
            int i12 = e.f437009f;
            e eVar = e.this;
            eVar.getClass();
            g gVar = g.f437019a;
            InputStream inputStreamOpenRawResource = eVar.f437010a.getResources().openRawResource(R.raw.tinkoff_root_cert);
            gVar.getClass();
            return (X509ExtendedTrustManager) g.b(g.a(g.c(inputStreamOpenRawResource)));
        }
    }

    /* compiled from: MediatorTrustManager24.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Ljavax/net/ssl/X509ExtendedTrustManager;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class d extends N implements Y41.a<List<X509ExtendedTrustManager>> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final List<X509ExtendedTrustManager> invoke() {
            int i12 = e.f437009f;
            e eVar = e.this;
            return C42745f0.e0((X509ExtendedTrustManager) eVar.f437011b.getValue(), (X509ExtendedTrustManager) eVar.f437012c.getValue(), (X509ExtendedTrustManager) eVar.f437013d.getValue());
        }
    }

    public e(@k Context context) {
        this.f437010a = context;
    }

    public final synchronized List<X509ExtendedTrustManager> a() {
        return (List) this.f437014e.getValue();
    }

    public final synchronized void b(X509ExtendedTrustManager x509ExtendedTrustManager) {
        a().remove(x509ExtendedTrustManager);
        a().add(0, x509ExtendedTrustManager);
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public final void checkClientTrusted(@l X509Certificate[] x509CertificateArr, @l String str, @l Socket socket) throws CertificateException {
        List listM0;
        synchronized (this) {
            listM0 = C42745f0.M0(a());
        }
        try {
            ((X509ExtendedTrustManager) listM0.get(0)).checkClientTrusted(x509CertificateArr, str, socket);
        } catch (CertificateException unused) {
            try {
                ((X509ExtendedTrustManager) listM0.get(1)).checkClientTrusted(x509CertificateArr, str, socket);
                b((X509ExtendedTrustManager) listM0.get(1));
            } catch (CertificateException unused2) {
                ((X509ExtendedTrustManager) listM0.get(2)).checkClientTrusted(x509CertificateArr, str, socket);
                b((X509ExtendedTrustManager) listM0.get(2));
            }
        }
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public final void checkServerTrusted(@l X509Certificate[] x509CertificateArr, @l String str, @l Socket socket) throws CertificateException {
        List listM0;
        synchronized (this) {
            listM0 = C42745f0.M0(a());
        }
        try {
            ((X509ExtendedTrustManager) listM0.get(0)).checkServerTrusted(x509CertificateArr, str, socket);
        } catch (CertificateException unused) {
            try {
                ((X509ExtendedTrustManager) listM0.get(1)).checkServerTrusted(x509CertificateArr, str, socket);
                b((X509ExtendedTrustManager) listM0.get(1));
            } catch (CertificateException unused2) {
                ((X509ExtendedTrustManager) listM0.get(2)).checkServerTrusted(x509CertificateArr, str, socket);
                b((X509ExtendedTrustManager) listM0.get(2));
            }
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    @k
    public final X509Certificate[] getAcceptedIssuers() {
        return (X509Certificate[]) C42756l.X(C42756l.X(((X509ExtendedTrustManager) this.f437011b.getValue()).getAcceptedIssuers(), ((X509ExtendedTrustManager) this.f437012c.getValue()).getAcceptedIssuers()), ((X509ExtendedTrustManager) this.f437013d.getValue()).getAcceptedIssuers());
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public final void checkClientTrusted(@l X509Certificate[] x509CertificateArr, @l String str, @l SSLEngine sSLEngine) throws CertificateException {
        List listM0;
        synchronized (this) {
            listM0 = C42745f0.M0(a());
        }
        try {
            ((X509ExtendedTrustManager) listM0.get(0)).checkClientTrusted(x509CertificateArr, str, sSLEngine);
        } catch (CertificateException unused) {
            try {
                ((X509ExtendedTrustManager) listM0.get(1)).checkClientTrusted(x509CertificateArr, str, sSLEngine);
                b((X509ExtendedTrustManager) listM0.get(1));
            } catch (CertificateException unused2) {
                ((X509ExtendedTrustManager) listM0.get(2)).checkClientTrusted(x509CertificateArr, str, sSLEngine);
                b((X509ExtendedTrustManager) listM0.get(2));
            }
        }
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public final void checkServerTrusted(@l X509Certificate[] x509CertificateArr, @l String str, @l SSLEngine sSLEngine) throws CertificateException {
        List listM0;
        synchronized (this) {
            listM0 = C42745f0.M0(a());
        }
        try {
            ((X509ExtendedTrustManager) listM0.get(0)).checkServerTrusted(x509CertificateArr, str, sSLEngine);
        } catch (CertificateException unused) {
            try {
                ((X509ExtendedTrustManager) listM0.get(1)).checkServerTrusted(x509CertificateArr, str, sSLEngine);
                b((X509ExtendedTrustManager) listM0.get(1));
            } catch (CertificateException unused2) {
                ((X509ExtendedTrustManager) listM0.get(2)).checkServerTrusted(x509CertificateArr, str, sSLEngine);
                b((X509ExtendedTrustManager) listM0.get(2));
            }
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkClientTrusted(@l X509Certificate[] x509CertificateArr, @l String str) throws CertificateException {
        List listM0;
        synchronized (this) {
            listM0 = C42745f0.M0(a());
        }
        try {
            ((X509ExtendedTrustManager) listM0.get(0)).checkClientTrusted(x509CertificateArr, str);
        } catch (CertificateException unused) {
            try {
                ((X509ExtendedTrustManager) listM0.get(1)).checkClientTrusted(x509CertificateArr, str);
                b((X509ExtendedTrustManager) listM0.get(1));
            } catch (CertificateException unused2) {
                ((X509ExtendedTrustManager) listM0.get(2)).checkClientTrusted(x509CertificateArr, str);
                b((X509ExtendedTrustManager) listM0.get(2));
            }
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkServerTrusted(@l X509Certificate[] x509CertificateArr, @l String str) throws CertificateException {
        List listM0;
        synchronized (this) {
            listM0 = C42745f0.M0(a());
        }
        try {
            ((X509ExtendedTrustManager) listM0.get(0)).checkServerTrusted(x509CertificateArr, str);
        } catch (CertificateException unused) {
            try {
                ((X509ExtendedTrustManager) listM0.get(1)).checkServerTrusted(x509CertificateArr, str);
                b((X509ExtendedTrustManager) listM0.get(1));
            } catch (CertificateException unused2) {
                ((X509ExtendedTrustManager) listM0.get(2)).checkServerTrusted(x509CertificateArr, str);
                b((X509ExtendedTrustManager) listM0.get(2));
            }
        }
    }
}
