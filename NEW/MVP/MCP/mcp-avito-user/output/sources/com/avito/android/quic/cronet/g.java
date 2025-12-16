package com.avito.android.quic.cronet;

import android.content.Context;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.statsd.y;
import com.avito.android.error_reporting.non_fatal.NonFatalErrorEvent;
import com.avito.android.util.V2;
import java.io.File;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.text.C43059p;
import kotlin.text.C43066x;
import org.chromium.net.CronetEngine;
import org.chromium.net.CronetProvider;

/* compiled from: CronetEngineProvider.kt */
@Singleton
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/quic/cronet/g;", "Lcom/avito/android/quic/cronet/f;", "a", "_common_quic_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class g implements f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f246203a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.quic.cronet.b f246204b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final d f246205c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final t f246206d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f246207e = C42727D.c(new b());

    /* compiled from: CronetEngineProvider.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/quic/cronet/g$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "_common_quic_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: CronetEngineProvider.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lorg/chromium/net/CronetEngine;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<CronetEngine> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final CronetEngine invoke() {
            g gVar = g.this;
            List<CronetProvider> allProviders = CronetProvider.getAllProviders(gVar.f246204b.f246198a);
            boolean z12 = allProviders instanceof Collection;
            InterfaceC28373a interfaceC28373a = gVar.f246203a;
            if (!z12 || !allProviders.isEmpty()) {
                Iterator<T> it = allProviders.iterator();
                while (it.hasNext()) {
                    if (((CronetProvider) it.next()).isEnabled()) {
                        try {
                            com.avito.android.quic.cronet.a aVarB = g.b(gVar);
                            interfaceC28373a.c(new y.a("cronet.init.success", 0L, 2, null));
                            g.c(gVar, aVarB);
                            return aVarB;
                        } catch (Throwable th2) {
                            interfaceC28373a.c(new y.a("cronet.init.error", 0L, 2, null));
                            interfaceC28373a.c(new NonFatalErrorEvent("Cronet initialization failed", th2, null, null, 12, null));
                            return null;
                        }
                    }
                }
            }
            V2.f318762a.j("CronetEngineProvider", "No Cronet provider", null);
            interfaceC28373a.c(new y.a("cronet.init.nocronet", 0L, 2, null));
            return null;
        }
    }

    static {
        new a(null);
    }

    @Inject
    public g(@Y61.k InterfaceC28373a interfaceC28373a, @Y61.k com.avito.android.quic.cronet.b bVar, @Y61.k d dVar, @Y61.k t tVar) {
        this.f246203a = interfaceC28373a;
        this.f246204b = bVar;
        this.f246205c = dVar;
        this.f246206d = tVar;
    }

    public static final com.avito.android.quic.cronet.a b(g gVar) {
        List<String> list = gVar.f246205c.f246202a;
        h hVar = new h(3, gVar, g.class, "reportCronetError", "reportCronetError(Lorg/chromium/net/CronetException;Ljava/lang/String;Lokhttp3/Protocol;)V", 0);
        com.avito.android.quic.cronet.b bVar = gVar.f246204b;
        bVar.getClass();
        Context context = bVar.f246198a;
        File file = new File(context.getFilesDir(), "cronet_storage");
        if (!file.exists()) {
            file.mkdirs();
        }
        CronetEngine.Builder builderEnableHttpCache = new CronetEngine.Builder(context).enableQuic(bVar.f246199b.d()).setStoragePath(file.getAbsolutePath()).enableHttpCache(3, 10485760L);
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            builderEnableHttpCache = builderEnableHttpCache.addQuicHint(it.next(), 443, 443);
        }
        return new com.avito.android.quic.cronet.a(builderEnableHttpCache.build(), hVar);
    }

    public static final void c(g gVar, com.avito.android.quic.cronet.a aVar) {
        gVar.getClass();
        String versionString = aVar.f246196a.getVersionString();
        int I12 = C43066x.I(versionString, "@", 0, false, 6);
        String strSubstring = I12 > 0 ? versionString.substring(0, I12) : versionString;
        y.a aVar2 = new y.a("cronet.version.full.".concat(new C43059p("[^a-zA-Z0-9]").f(versionString, "_")), 0L, 2, null);
        InterfaceC28373a interfaceC28373a = gVar.f246203a;
        interfaceC28373a.c(aVar2);
        interfaceC28373a.c(new y.a("cronet.version.short.".concat(new C43059p("[^a-zA-Z0-9]").f(strSubstring, "_")), 0L, 2, null));
    }

    @Override // com.avito.android.quic.cronet.f
    @Y61.l
    public final CronetEngine a() {
        return (CronetEngine) this.f246207e.getValue();
    }
}
