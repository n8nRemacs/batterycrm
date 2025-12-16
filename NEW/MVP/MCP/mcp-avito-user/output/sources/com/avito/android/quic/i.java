package com.avito.android.quic;

import android.annotation.SuppressLint;
import com.avito.android.quic.cronet.t;
import com.avito.android.quic.events.CronetReportedErrorType;
import io.reactivex.rxjava3.core.z;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import ng0.C44420a;
import okhttp3.HttpUrl;
import org.chromium.net.CronetException;
import org.chromium.net.NetworkException;
import org.chromium.net.QuicException;

/* compiled from: QuicModuleInitializer.kt */
@Singleton
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/quic/i;", "Lcom/avito/android/quic/h;", "_common_quic_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class i implements h {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final p f246258a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.quic.cronet.k f246259b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.quic.cronet.t f246260c;

    @Inject
    public i(@Y61.k p pVar, @Y61.k com.avito.android.quic.cronet.k kVar, @Y61.k com.avito.android.quic.cronet.t tVar) {
        this.f246258a = pVar;
        this.f246259b = kVar;
        this.f246260c = tVar;
    }

    @Override // com.avito.android.quic.h
    @SuppressLint({"CheckResult"})
    public final void a() {
        if (this.f246258a.c()) {
            z<t.a> zVar = this.f246260c.f246226b;
            final com.avito.android.quic.cronet.k kVar = this.f246259b;
            zVar.t0(new l41.g() { // from class: com.avito.android.quic.i.a
                @Override // l41.g
                public final void accept(Object obj) {
                    Integer num;
                    Integer numValueOf;
                    t.a aVar = (t.a) obj;
                    com.avito.android.quic.cronet.k kVar2 = kVar;
                    kVar2.getClass();
                    CronetException cronetException = aVar.f246227a;
                    if (cronetException instanceof NetworkException) {
                        NetworkException networkException = (NetworkException) cronetException;
                        Integer numValueOf2 = Integer.valueOf(networkException.getErrorCode());
                        numValueOf = Integer.valueOf(networkException.getCronetInternalErrorCode());
                        num = numValueOf2;
                    } else {
                        num = null;
                        numValueOf = null;
                    }
                    Integer numValueOf3 = cronetException instanceof QuicException ? Integer.valueOf(((QuicException) cronetException).getQuicDetailedErrorCode()) : null;
                    CronetReportedErrorType cronetReportedErrorType = numValueOf3 != null ? CronetReportedErrorType.f246252e : (num != null && num.intValue() == 11) ? CronetReportedErrorType.f246251d : num != null ? CronetReportedErrorType.f246250c : CronetReportedErrorType.f246253f;
                    HttpUrl httpUrl = HttpUrl.INSTANCE.parse(aVar.f246228b);
                    kVar2.f246214b.b(httpUrl, aVar.f246229c, cronetException);
                    kVar2.f246213a.c(new C44420a(num, numValueOf, numValueOf3, httpUrl != null ? httpUrl.host() : null, httpUrl != null ? httpUrl.encodedPath() : null, cronetReportedErrorType));
                }
            });
        }
    }
}
