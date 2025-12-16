package com.avito.android.remote.analytics;

import com.avito.android.quic.cronet.CronetTcpRstReporter;
import com.avito.android.remote.analytics.B;
import com.avito.android.remote.error.ApiError;
import com.avito.android.util.V2;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;

/* compiled from: NetworkErrorsAnalyticsImpl.kt */
@Singleton
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/remote/analytics/b;", "", "_avito_performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.remote.analytics.b, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C34245b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final B f253105a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h31.e<k> f253106b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final h31.e<n> f253107c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final CronetTcpRstReporter f253108d;

    /* compiled from: NetworkErrorsAnalyticsImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/analytics/B$b;", "response", "Lkotlin/G0;", "accept", "(Lcom/avito/android/remote/analytics/B$b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.remote.analytics.b$a */
    public static final class a<T> implements l41.g {
        public a() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            B.b bVar = (B.b) obj;
            C34245b c34245b = C34245b.this;
            try {
                c34245b.f253106b.get().a(bVar.f253080c).a(bVar.f253080c, bVar.f253078a, bVar.f253079b, bVar.f253081d, bVar.f253082e);
                ApiError apiError = bVar.f253083f;
                Throwable th2 = bVar.f253082e;
                if (apiError != null) {
                    c34245b.f253107c.get().a(apiError, th2);
                }
                c34245b.f253108d.a(bVar.f253078a, th2, CronetTcpRstReporter.ErrorMoment.f246191d);
            } catch (Throwable th3) {
                V2.f318762a.f(th3);
            }
        }
    }

    /* compiled from: NetworkErrorsAnalyticsImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.remote.analytics.b$b, reason: collision with other inner class name */
    public static final class C7607b<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final C7607b<T> f253110b = new C7607b<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.f((Throwable) obj);
        }
    }

    @Inject
    public C34245b(@Y61.k B b12, @Y61.k h31.e<k> eVar, @Y61.k h31.e<n> eVar2, @Y61.k CronetTcpRstReporter cronetTcpRstReporter) {
        this.f253105a = b12;
        this.f253106b = eVar;
        this.f253107c = eVar2;
        this.f253108d = cronetTcpRstReporter;
    }

    public final void a() {
        this.f253105a.getF253088d().u0(new a(), C7607b.f253110b);
    }
}
