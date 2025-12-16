package com.avito.android.clientEventBus.repository.socketEvents;

import Y61.k;
import com.google.gson.Gson;
import dagger.internal.h;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import nx0.InterfaceC44488b;

/* compiled from: SocketEventsRepositoryImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/clientEventBus/repository/socketEvents/d;", "Ldagger/internal/h;", "Lcom/avito/android/clientEventBus/repository/socketEvents/c;", "a", "_avito_client-event-bus_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class d implements h<c> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f118562c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ru.avito.messenger.internal.socket_events.c f118563a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Provider<Gson> f118564b;

    /* compiled from: SocketEventsRepositoryImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/clientEventBus/repository/socketEvents/d$a;", "", "<init>", "()V", "_avito_client-event-bus_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public d(@k ru.avito.messenger.internal.socket_events.c cVar, @k Provider provider) {
        this.f118563a = cVar;
        this.f118564b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC44488b interfaceC44488b = (InterfaceC44488b) this.f118563a.get();
        Gson gson = this.f118564b.get();
        f118562c.getClass();
        return new c(interfaceC44488b, gson);
    }
}
