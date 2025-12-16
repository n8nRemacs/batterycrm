package com.avito.android.remote.analytics.image;

import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: FrescoLoggingInterceptorImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/analytics/image/c;", "Ldagger/internal/h;", "Lcom/avito/android/remote/analytics/image/b;", "a", "_avito_performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f253125b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Provider<e> f253126a;

    /* compiled from: FrescoLoggingInterceptorImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/analytics/image/c$a;", "", "<init>", "()V", "_avito_performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public c(@Y61.k Provider<e> provider) {
        this.f253126a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        e eVar = this.f253126a.get();
        f253125b.getClass();
        return new b(eVar);
    }
}
