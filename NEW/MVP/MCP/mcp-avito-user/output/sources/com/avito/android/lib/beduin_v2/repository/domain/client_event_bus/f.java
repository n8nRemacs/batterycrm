package com.avito.android.lib.beduin_v2.repository.domain.client_event_bus;

import Y61.k;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.h;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ClientEventBusRepositoryClientImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/repository/domain/client_event_bus/f;", "Ldagger/internal/h;", "Lcom/avito/android/lib/beduin_v2/repository/domain/client_event_bus/d;", "a", "_design-modules_beduin-v2_interactions_repository_domain_client-event-bus_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class f implements h<d> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f176585c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Provider<com.avito.android.clientEventBus.a> f176586a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Provider<InterfaceC35745a5> f176587b;

    /* compiled from: ClientEventBusRepositoryClientImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/repository/domain/client_event_bus/f$a;", "", "<init>", "()V", "_design-modules_beduin-v2_interactions_repository_domain_client-event-bus_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public f(@k Provider<com.avito.android.clientEventBus.a> provider, @k Provider<InterfaceC35745a5> provider2) {
        this.f176586a = provider;
        this.f176587b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.clientEventBus.a aVar = this.f176586a.get();
        InterfaceC35745a5 interfaceC35745a5 = this.f176587b.get();
        f176585c.getClass();
        return new d(aVar, interfaceC35745a5);
    }
}
