package com.avito.android.quic.tracking;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.quic.cronet.CronetException;
import com.avito.android.quic.cronet.CronetTcpRstReporter;
import com.avito.android.quic.p;
import com.avito.android.quic.tracking.a;
import com.avito.android.util.R0;
import java.io.IOException;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.U;
import kotlinx.coroutines.internal.C43238h;
import og0.InterfaceC44773a;
import okhttp3.Call;
import okhttp3.HttpUrl;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.connection.RealConnection;

/* compiled from: NetworkRequestsResultsTracker.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/quic/tracking/c;", "Lcom/avito/android/quic/tracking/a;", "_common_quic_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f246342a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final p.b f246343b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final p.e f246344c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final CronetTcpRstReporter.b f246345d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final a.InterfaceC7383a f246346e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final InterfaceC44773a f246347f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final p f246348g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final C43238h f246349h;

    @Inject
    public c(@k InterfaceC28373a interfaceC28373a, @k p.b bVar, @k p.e eVar, @k CronetTcpRstReporter.b bVar2, @k a.InterfaceC7383a interfaceC7383a, @k InterfaceC44773a interfaceC44773a, @k p pVar, @k R0 r02) {
        this.f246342a = interfaceC28373a;
        this.f246343b = bVar;
        this.f246344c = eVar;
        this.f246345d = bVar2;
        this.f246346e = interfaceC7383a;
        this.f246347f = interfaceC44773a;
        this.f246348g = pVar;
        this.f246349h = U.a(r02.a());
    }

    @Override // com.avito.android.quic.tracking.a
    @k
    public final IOException a(@k Call call, @k Request request, @k IOException iOException) {
        Protocol protocol;
        RealConnection connection;
        if (iOException instanceof CronetException.CronetHandledRetryReporting) {
            return null;
        }
        RealCall realCall = call instanceof RealCall ? (RealCall) call : null;
        if (realCall == null || (connection = realCall.getConnection()) == null || (protocol = connection.getProtocol()) == null) {
            protocol = Protocol.HTTP_1_1;
        }
        C43259k.d(this.f246349h, null, null, new b(this, protocol, request.url(), iOException, false, null), 3);
        return iOException;
    }

    @Override // com.avito.android.quic.tracking.a
    public final void b(@l HttpUrl httpUrl, @k Protocol protocol, @k org.chromium.net.CronetException cronetException) {
        C43259k.d(this.f246349h, null, null, new b(this, protocol, httpUrl, cronetException, false, null), 3);
    }

    @Override // com.avito.android.quic.tracking.a
    public final void c(@k Request request, @k Response response) {
        C43259k.d(this.f246349h, null, null, new b(this, response.protocol(), request.url(), null, true, null), 3);
    }
}
