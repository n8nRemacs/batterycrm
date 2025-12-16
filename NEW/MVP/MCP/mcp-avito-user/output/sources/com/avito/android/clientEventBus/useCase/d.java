package com.avito.android.clientEventBus.useCase;

import Go.InterfaceC13901a;
import dagger.internal.u;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ObserveEventsUseCase_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/clientEventBus/useCase/d;", "Ldagger/internal/h;", "Lcom/avito/android/clientEventBus/useCase/c;", "a", "_avito_client-event-bus_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f118573c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ru.avito.messenger.internal.socket_events.h f118574a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final u f118575b;

    /* compiled from: ObserveEventsUseCase_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/clientEventBus/useCase/d$a;", "", "<init>", "()V", "_avito_client-event-bus_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public d(@Y61.k ru.avito.messenger.internal.socket_events.h hVar, @Y61.k u uVar) {
        this.f118574a = hVar;
        this.f118575b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        mx0.d dVar = (mx0.d) this.f118574a.get();
        InterfaceC13901a interfaceC13901a = (InterfaceC13901a) this.f118575b.get();
        f118573c.getClass();
        return new c(dVar, interfaceC13901a);
    }
}
