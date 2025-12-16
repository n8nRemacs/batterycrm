package ru.avito.messenger.internal.socket_events;

import Y61.k;
import io.reactivex.rxjava3.core.z;
import javax.inject.Inject;
import kotlin.Metadata;
import mx0.InterfaceC44149a;
import ru.avito.messenger.W;

/* compiled from: SocketEventObserverImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/avito/messenger/internal/socket_events/g;", "Lmx0/d;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class g implements mx0.d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final W f431772a;

    @Inject
    public g(@k W w12) {
        this.f431772a = w12;
    }

    @Override // mx0.d
    @k
    public final <EventT extends InterfaceC44149a> z<EventT> a(@k Class<EventT> cls, @k mx0.e eVar) {
        return this.f431772a.z(cls, eVar);
    }
}
