package com.avito.android.remote.analytics;

import com.avito.android.quic.tracking.a;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: NetworkErrorsModule_ProvideNetworkErrorNameFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/analytics/h;", "Ldagger/internal/h;", "Lcom/avito/android/quic/tracking/a$a;", "a", "_avito_performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.remote.analytics.h, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C34251h implements dagger.internal.h<a.InterfaceC7383a> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f253121b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Provider<y> f253122a;

    /* compiled from: NetworkErrorsModule_ProvideNetworkErrorNameFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/analytics/h$a;", "", "<init>", "()V", "_avito_performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.remote.analytics.h$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C34251h(@Y61.k Provider<y> provider) {
        this.f253122a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        y yVar = this.f253122a.get();
        f253121b.getClass();
        C34249f.f253118a.getClass();
        return new C34248e(yVar);
    }
}
