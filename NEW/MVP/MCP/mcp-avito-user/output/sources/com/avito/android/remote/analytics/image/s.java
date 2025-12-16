package com.avito.android.remote.analytics.image;

import com.avito.android.remote.analytics.u;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: NetworkImageResponsesRelayImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/analytics/image/s;", "Ldagger/internal/h;", "Lcom/avito/android/remote/analytics/image/r;", "a", "_avito_performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class s implements dagger.internal.h<r> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f253166b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Provider<u> f253167a;

    /* compiled from: NetworkImageResponsesRelayImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/analytics/image/s$a;", "", "<init>", "()V", "_avito_performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public s(@Y61.k Provider<u> provider) {
        this.f253167a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        u uVar = this.f253167a.get();
        f253166b.getClass();
        return new r(uVar);
    }
}
