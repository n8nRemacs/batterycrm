package com.avito.android.quic.tracking;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.quic.cronet.CronetTcpRstReporter;
import com.avito.android.quic.p;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.U;
import kotlinx.coroutines.internal.C43238h;
import og0.InterfaceC44773a;
import okhttp3.Protocol;
import okhttp3.Response;

/* compiled from: QuicRequestsTracker.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/quic/tracking/h;", "Lcom/avito/android/quic/tracking/e;", "_common_quic_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class h implements e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f246373a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final p.b f246374b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final p.e f246375c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final CronetTcpRstReporter.b f246376d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final InterfaceC44773a f246377e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final p f246378f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f246379g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final Object f246380h = new Object();

    /* renamed from: i, reason: collision with root package name */
    @k
    public final Object f246381i = new Object();

    /* renamed from: j, reason: collision with root package name */
    @k
    public final C43238h f246382j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public Protocol f246383k;

    @Inject
    public h(@k InterfaceC28373a interfaceC28373a, @k p.b bVar, @k p.e eVar, @k CronetTcpRstReporter.b bVar2, @k InterfaceC44773a interfaceC44773a, @k p pVar, @k R0 r02) {
        this.f246373a = interfaceC28373a;
        this.f246374b = bVar;
        this.f246375c = eVar;
        this.f246376d = bVar2;
        this.f246377e = interfaceC44773a;
        this.f246378f = pVar;
        this.f246382j = U.a(r02.a());
    }

    @Override // com.avito.android.quic.tracking.e
    public final void a(@k Response response) {
        synchronized (this.f246380h) {
            if (!this.f246379g && L.f(response.request().url().host(), "app-quic.avito.ru")) {
                this.f246379g = true;
                G0 g02 = G0.f406611a;
                C43259k.d(this.f246382j, null, null, new f(this, response, null), 3);
            }
        }
        if (L.f(response.request().url().host(), "app-quic.avito.ru")) {
            synchronized (this.f246381i) {
                Protocol protocol = this.f246383k;
                if (protocol != response.protocol()) {
                    if (protocol == null) {
                        this.f246383k = response.protocol();
                    } else {
                        this.f246383k = response.protocol();
                        G0 g03 = G0.f406611a;
                        C43259k.d(this.f246382j, null, null, new g(this, response, protocol, null), 3);
                    }
                }
            }
        }
    }
}
