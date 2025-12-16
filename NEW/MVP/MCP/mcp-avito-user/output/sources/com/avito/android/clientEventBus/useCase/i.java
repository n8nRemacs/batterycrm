package com.avito.android.clientEventBus.useCase;

import Go.InterfaceC13901a;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SubscribeToActiveTopicsUseCase_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/clientEventBus/useCase/i;", "Ldagger/internal/h;", "Lcom/avito/android/clientEventBus/useCase/h;", "a", "_avito_client-event-bus_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final a f118582d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.clientEventBus.repository.socketEvents.d f118583a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Provider<InterfaceC13901a> f118584b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Provider<InterfaceC35745a5> f118585c;

    /* compiled from: SubscribeToActiveTopicsUseCase_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/clientEventBus/useCase/i$a;", "", "<init>", "()V", "_avito_client-event-bus_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public i(@Y61.k com.avito.android.clientEventBus.repository.socketEvents.d dVar, @Y61.k Provider provider, @Y61.k Provider provider2) {
        this.f118583a = dVar;
        this.f118584b = provider;
        this.f118585c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.clientEventBus.repository.socketEvents.a aVar = (com.avito.android.clientEventBus.repository.socketEvents.a) this.f118583a.get();
        InterfaceC13901a interfaceC13901a = this.f118584b.get();
        InterfaceC35745a5 interfaceC35745a5 = this.f118585c.get();
        f118582d.getClass();
        return new h(aVar, interfaceC13901a, interfaceC35745a5);
    }
}
