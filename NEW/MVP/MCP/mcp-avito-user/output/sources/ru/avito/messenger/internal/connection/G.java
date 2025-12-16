package ru.avito.messenger.internal.connection;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import ru.avito.websocket.u;

/* compiled from: MessengerConnectionHolder.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/avito/websocket/u$c;", "disconnected", "Lkotlin/G0;", "accept", "(Lru/avito/websocket/u$c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes9.dex */
final class G<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicInteger f431249b;

    public G(AtomicInteger atomicInteger) {
        this.f431249b = atomicInteger;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        if (((u.c) obj).f431954a == 3410) {
            this.f431249b.set(0);
        }
    }
}
