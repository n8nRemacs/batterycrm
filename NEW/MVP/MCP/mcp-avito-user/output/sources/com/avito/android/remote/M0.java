package com.avito.android.remote;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: PublishLimitsApi_Module_ProvidePublishLimitsApiFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/M0;", "Ldagger/internal/h;", "Lcom/avito/android/remote/K0;", "a", "_avito-discouraged_avito-api_publish-limits-info"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class M0 implements dagger.internal.h<K0> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f253033b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.f f253034a;

    /* compiled from: PublishLimitsApi_Module_ProvidePublishLimitsApiFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/M0$a;", "", "<init>", "()V", "_avito-discouraged_avito-api_publish-limits-info"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public M0(@Y61.k dagger.internal.f fVar) {
        this.f253034a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f253034a.get();
        f253033b.getClass();
        L0.f253030a.getClass();
        K0 k02 = (K0) r02.create(K0.class);
        dagger.internal.t.b(k02, "Cannot return null from a non-@Nullable @Provides method");
        return k02;
    }
}
