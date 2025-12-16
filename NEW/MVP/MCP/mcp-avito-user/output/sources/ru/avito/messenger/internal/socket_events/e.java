package ru.avito.messenger.internal.socket_events;

import Y61.k;
import io.reactivex.rxjava3.internal.operators.observable.L;
import javax.inject.Inject;
import kotlin.Metadata;
import mx0.InterfaceC44150b;
import ru.avito.messenger.V;

/* compiled from: SocketEventConnectionStateObserverImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/avito/messenger/internal/socket_events/e;", "Lmx0/b;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class e implements InterfaceC44150b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final V f431770a;

    @Inject
    public e(@k V v12) {
        this.f431770a = v12;
    }

    @Override // mx0.InterfaceC44150b
    @k
    public final L a() {
        return this.f431770a.state().d0(d.f431769b).D(io.reactivex.rxjava3.internal.functions.a.f401991a);
    }
}
