package com.avito.android.quic.cronet;

import android.app.Application;
import android.location.Location;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import androidx.collection.C20212g0;
import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.quic.cronet.CronetException;
import com.avito.android.quic.p;
import com.avito.android.util.V2;
import j.InterfaceC42148d;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.WeakHashMap;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import okhttp3.HttpUrl;
import okhttp3.Response;
import org.chromium.net.CronetEngine;

/* compiled from: CronetTcpRstReporter.kt */
@Singleton
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/quic/cronet/CronetTcpRstReporter;", "", "a", "ErrorMoment", "b", "c", "_common_quic_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42148d
/* loaded from: classes16.dex */
public final class CronetTcpRstReporter {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Application f246180a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f246181b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final p.d f246182c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final f f246183d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final o f246184e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final b f246185f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Set<CronetException> f246186g = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f246187h = new LinkedHashMap();

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f246188i = new LinkedHashMap();

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final C20212g0<HttpUrl, c> f246189j = new C20212g0<>(30);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CronetTcpRstReporter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/quic/cronet/CronetTcpRstReporter$ErrorMoment;", "", "_common_quic_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ErrorMoment {

        /* renamed from: c, reason: collision with root package name */
        public static final ErrorMoment f246190c;

        /* renamed from: d, reason: collision with root package name */
        public static final ErrorMoment f246191d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ ErrorMoment[] f246192e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f246193f;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f246194b;

        static {
            ErrorMoment errorMoment = new ErrorMoment("CONNECTION_ESTABLISHING", 0, "connection_establishing");
            f246190c = errorMoment;
            ErrorMoment errorMoment2 = new ErrorMoment("CONNECTION_ACTIVE", 1, "connection_active");
            f246191d = errorMoment2;
            ErrorMoment[] errorMomentArr = {errorMoment, errorMoment2};
            f246192e = errorMomentArr;
            f246193f = kotlin.enums.c.a(errorMomentArr);
        }

        public ErrorMoment(String str, int i12, String str2) {
            this.f246194b = str2;
        }

        public static ErrorMoment valueOf(String str) {
            return (ErrorMoment) Enum.valueOf(ErrorMoment.class, str);
        }

        public static ErrorMoment[] values() {
            return (ErrorMoment[]) f246192e.clone();
        }
    }

    /* compiled from: CronetTcpRstReporter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/quic/cronet/CronetTcpRstReporter$a;", "", "<init>", "()V", "_common_quic_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: CronetTcpRstReporter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/quic/cronet/CronetTcpRstReporter$b;", "", "_common_quic_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {
        @Y61.l
        String a();

        @Y61.l
        String b();
    }

    /* compiled from: CronetTcpRstReporter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/quic/cronet/CronetTcpRstReporter$c;", "", "_common_quic_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f246195a;

        public c(@Y61.k String str) {
            this.f246195a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f246195a, ((c) obj).f246195a);
        }

        public final int hashCode() {
            return this.f246195a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("RequestUrlExtraParams(headers="), this.f246195a, ')');
        }
    }

    static {
        new a(null);
    }

    @Inject
    public CronetTcpRstReporter(@Y61.k Application application, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k p.d dVar, @Y61.k f fVar, @Y61.k o oVar, @Y61.k b bVar) {
        this.f246180a = application;
        this.f246181b = interfaceC28373a;
        this.f246182c = dVar;
        this.f246183d = fVar;
        this.f246184e = oVar;
        this.f246185f = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC42148d
    public final synchronized void a(@Y61.k String str, @Y61.k Throwable th2, @Y61.k ErrorMoment errorMoment) {
        try {
            Object objA = th2 instanceof CronetException ? (IOException) th2 : this.f246184e.a(th2);
            if ((objA instanceof CronetException.TcpReset) && !this.f246186g.contains(objA)) {
                c(str, errorMoment);
                this.f246186g.add(objA);
            }
        } finally {
        }
    }

    @InterfaceC42148d
    public final synchronized void b(@Y61.k Response response) {
        HttpUrl httpUrlUrl = response.request().url();
        String string = response.headers().toString();
        this.f246189j.put(httpUrlUrl, new c(string.substring(0, Integer.min(string.length(), 1000))));
    }

    public final void c(String str, ErrorMoment errorMoment) {
        boolean zF2;
        HttpUrl httpUrl = HttpUrl.INSTANCE.parse(str);
        if (httpUrl == null) {
            return;
        }
        String strHost = httpUrl.host();
        LinkedHashMap linkedHashMap = this.f246188i;
        Integer num = (Integer) linkedHashMap.get(strHost);
        linkedHashMap.put(strHost, Integer.valueOf((num != null ? num.intValue() : 0) + 1));
        Location locationA = this.f246182c.a();
        CronetEngine cronetEngineA = this.f246183d.a();
        String versionString = cronetEngineA != null ? cronetEngineA.getVersionString() : null;
        b bVar = this.f246185f;
        String strA = bVar.a();
        String strB = bVar.b();
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f246180a.getSystemService("connectivity");
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            zF2 = L.f(networkCapabilities != null ? Boolean.valueOf(networkCapabilities.hasTransport(4)) : null, Boolean.TRUE);
        } catch (SecurityException e12) {
            V2.f318762a.a("CronetTcpRstReporter", "Unexpected security exception during VPN status acquiring", e12);
            zF2 = false;
        }
        Integer num2 = (Integer) linkedHashMap.get(strHost);
        int iIntValue = num2 != null ? num2.intValue() : 0;
        Integer num3 = (Integer) this.f246187h.get(strHost);
        int iIntValue2 = num3 != null ? num3.intValue() : 0;
        c cVar = this.f246189j.get(httpUrl);
        this.f246181b.c(new ng0.c(httpUrl.host(), httpUrl.encodedPath(), errorMoment.f246194b, locationA != null ? Double.valueOf(locationA.getLatitude()) : null, locationA != null ? Double.valueOf(locationA.getLongitude()) : null, versionString, strA, strB, zF2, iIntValue2, iIntValue, cVar != null ? cVar.f246195a : null));
    }
}
