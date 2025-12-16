package ru.avito.messenger.internal.connection;

import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import ru.avito.messenger.internal.connection.C47754g.c;

/* compiled from: MessengerConnectionHolder.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "error", "Lru/avito/messenger/internal/state_machine/g$a;", "Lru/avito/messenger/internal/connection/d$b;", "apply", "(Ljava/lang/Throwable;)Lru/avito/messenger/internal/state_machine/g$a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class L<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C47754g f431255b;

    public L(C47754g c47754g) {
        this.f431255b = c47754g;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        C47754g c47754g = this.f431255b;
        c47754g.f431311f.e("ConnectionHolder", "Ping failed. Reconnect scheduled.", (Throwable) obj);
        return c47754g.new c();
    }
}
