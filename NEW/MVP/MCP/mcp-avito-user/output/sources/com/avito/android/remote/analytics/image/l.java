package com.avito.android.remote.analytics.image;

import android.net.Uri;
import com.avito.android.performance.PerformanceImageTracker;
import com.avito.android.quic.cronet.CronetTcpRstReporter;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ImagesNetworkErrorAnalyticsImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/remote/analytics/image/l;", "", "_avito_performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final q f253135a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final CronetTcpRstReporter f253136b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final a f253137c = new a();

    @Inject
    public l(@Y61.k q qVar, @Y61.k CronetTcpRstReporter cronetTcpRstReporter) {
        this.f253135a = qVar;
        this.f253136b = cronetTcpRstReporter;
    }

    /* compiled from: ImagesNetworkErrorAnalyticsImpl.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/remote/analytics/image/l$a", "Lcom/avito/android/performance/a;", "_avito_performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements com.avito.android.performance.a {
        public a() {
        }

        @Override // com.avito.android.performance.a
        public final void a(@Y61.k Uri uri, long j12, @Y61.l Throwable th2) {
            l lVar = l.this;
            lVar.f253135a.c(uri, th2);
            if (th2 != null) {
                lVar.f253136b.a(uri.toString(), th2, CronetTcpRstReporter.ErrorMoment.f246191d);
            }
        }

        @Override // com.avito.android.performance.a
        public final void c(@Y61.k Uri uri, long j12, int i12, int i13, long j13, @Y61.k PerformanceImageTracker.ImageOrigin imageOrigin) {
            if (imageOrigin != PerformanceImageTracker.ImageOrigin.f215085b) {
                return;
            }
            l.this.f253135a.d(uri);
        }

        @Override // com.avito.android.performance.a
        public final void b(@Y61.k Uri uri) {
        }
    }
}
