package com.avito.android.quic;

import com.avito.android.I1;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.quic.cronet.CronetTcpRstReporter;
import com.avito.android.util.InterfaceC35745a5;
import j.InterfaceC42148d;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import okhttp3.Interceptor;

/* compiled from: QuicInterceptor.kt */
@Singleton
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/quic/c;", "Lcom/avito/android/quic/b;", "_common_quic_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class c implements b {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f246167b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.quic.cronet.f f246168c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.quic.cronet.q f246169d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final p f246170e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final I1 f246171f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.quic.cronet.o f246172g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final a f246173h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final CronetTcpRstReporter f246174i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.quic.tracking.e f246175j;

    /* renamed from: k, reason: collision with root package name */
    public volatile boolean f246176k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public volatile com.google.net.cronet.okhttptransport.e f246177l;

    @Inject
    public c(@Y61.k InterfaceC28373a interfaceC28373a, @Y61.k com.avito.android.quic.cronet.f fVar, @Y61.k com.avito.android.quic.cronet.q qVar, @Y61.k p pVar, @Y61.k I1 i12, @Y61.k com.avito.android.quic.cronet.o oVar, @Y61.k a aVar, @Y61.k CronetTcpRstReporter cronetTcpRstReporter, @Y61.k com.avito.android.quic.tracking.e eVar, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        this.f246167b = interfaceC28373a;
        this.f246168c = fVar;
        this.f246169d = qVar;
        this.f246170e = pVar;
        this.f246171f = i12;
        this.f246172g = oVar;
        this.f246173h = aVar;
        this.f246174i = cronetTcpRstReporter;
        this.f246175j = eVar;
        interfaceC35745a5.a().d(new com.avito.android.publish.screen.objects.view.actions.h(this, 1));
    }

    @InterfaceC42148d
    public final boolean a(Interceptor.Chain chain) {
        return this.f246176k && this.f246170e.a(chain.request().url()) && chain.request().headers().get("Sec-WebSocket-Key") == null;
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x016a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // okhttp3.Interceptor
    @Y61.k
    @j.InterfaceC42148d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final okhttp3.Response intercept(@Y61.k okhttp3.Interceptor.Chain r11) throws com.avito.android.quic.cronet.CronetException {
        /*
            Method dump skipped, instructions count: 523
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.quic.c.intercept(okhttp3.Interceptor$Chain):okhttp3.Response");
    }
}
