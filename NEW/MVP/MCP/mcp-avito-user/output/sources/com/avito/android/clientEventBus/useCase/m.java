package com.avito.android.clientEventBus.useCase;

import Go.InterfaceC13901a;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SubscribeToEventUseCase_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/clientEventBus/useCase/m;", "Ldagger/internal/h;", "Lcom/avito/android/clientEventBus/useCase/l;", "a", "_avito_client-event-bus_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final a f118591d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.clientEventBus.repository.clientEventBus.c f118592a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Provider<InterfaceC13901a> f118593b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Provider<InterfaceC35745a5> f118594c;

    /* compiled from: SubscribeToEventUseCase_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/clientEventBus/useCase/m$a;", "", "<init>", "()V", "_avito_client-event-bus_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public m(@Y61.k com.avito.android.clientEventBus.repository.clientEventBus.c cVar, @Y61.k Provider provider, @Y61.k Provider provider2) {
        this.f118592a = cVar;
        this.f118593b = provider;
        this.f118594c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.clientEventBus.repository.clientEventBus.a aVar = (com.avito.android.clientEventBus.repository.clientEventBus.a) this.f118592a.get();
        InterfaceC13901a interfaceC13901a = this.f118593b.get();
        InterfaceC35745a5 interfaceC35745a5 = this.f118594c.get();
        f118591d.getClass();
        return new l(aVar, interfaceC13901a, interfaceC35745a5);
    }
}
