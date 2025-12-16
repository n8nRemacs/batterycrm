package ru.avito.messenger.internal.connection;

import com.avito.android.analytics.statsd.y;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;

/* compiled from: MessengerConnectionHolder.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/avito/websocket/u$c;", "it", "Lkotlin/G0;", "accept", "(Lru/avito/websocket/u$c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes9.dex */
final class B<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicInteger f431241b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C47754g f431242c;

    public B(AtomicInteger atomicInteger, C47754g c47754g) {
        this.f431241b = atomicInteger;
        this.f431242c = c47754g;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        int andSet = this.f431241b.getAndSet(0);
        l0 l0Var = this.f431242c.f431326u;
        l0Var.getClass();
        l0Var.f431365a.c(new y.a("messenger.socket.reconnect_on_foreground.".concat(andSet != 0 ? andSet != 1 ? andSet != 2 ? andSet != 3 ? andSet != 4 ? "many" : "four" : "three" : "two" : PluralsKeys.ONE : "zero"), 0L, 2, null));
    }
}
