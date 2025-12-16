package com.avito.android.remote.analytics;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: NetworkResponsesRelayImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/analytics/D;", "Ldagger/internal/h;", "Lcom/avito/android/remote/analytics/C;", "a", "_avito_performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class D implements dagger.internal.h<C> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f253092b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.u f253093a;

    /* compiled from: NetworkResponsesRelayImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/analytics/D$a;", "", "<init>", "()V", "_avito_performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public D(@Y61.k dagger.internal.u uVar) {
        this.f253093a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        u uVar = (u) this.f253093a.get();
        f253092b.getClass();
        return new C(uVar);
    }
}
