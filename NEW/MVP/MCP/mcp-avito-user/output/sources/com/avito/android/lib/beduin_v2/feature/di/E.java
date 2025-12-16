package com.avito.android.lib.beduin_v2.feature.di;

import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BeduinDateTimeModule_ProvideDateTimeFunctionsClientFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/di/E;", "Ldagger/internal/h;", "LRT0/e;", "a", "_design-modules_beduin-v2_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class E implements dagger.internal.h<RT0.e> {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final a f176013e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Provider<RT0.f> f176014a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final G f176015b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C f176016c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final D f176017d;

    /* compiled from: BeduinDateTimeModule_ProvideDateTimeFunctionsClientFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/di/E$a;", "", "<init>", "()V", "_design-modules_beduin-v2_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public E(@Y61.k B b12, @Y61.k Provider provider, @Y61.k G g12, @Y61.k C c12, @Y61.k D d12) {
        this.f176014a = provider;
        this.f176015b = g12;
        this.f176016c = c12;
        this.f176017d = d12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        RT0.f fVar = this.f176014a.get();
        RT0.g gVar = (RT0.g) this.f176015b.get();
        RT0.c cVar = (RT0.c) this.f176016c.get();
        RT0.a aVar = (RT0.a) this.f176017d.get();
        f176013e.getClass();
        return new RT0.e(fVar, gVar, cVar, aVar);
    }
}
