package ru.avito.messenger.internal.socket_events;

import com.avito.android.socketEvents.ConnectionState;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import l41.o;
import ru.avito.messenger.k0;

/* compiled from: SocketEventConnectionStateObserverImpl.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/avito/messenger/k0;", "messengerState", "Lcom/avito/android/socketEvents/ConnectionState;", "apply", "(Lru/avito/messenger/k0;)Lcom/avito/android/socketEvents/ConnectionState;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes9.dex */
final class d<T, R> implements o {

    /* renamed from: b, reason: collision with root package name */
    public static final d<T, R> f431769b = new d<>();

    @Override // l41.o
    public final Object apply(Object obj) {
        k0 k0Var = (k0) obj;
        if (k0Var instanceof k0.a) {
            return ConnectionState.f284728b;
        }
        if (k0Var instanceof k0.b ? true : k0Var instanceof k0.c) {
            return ConnectionState.f284729c;
        }
        throw new NoWhenBranchMatchedException();
    }
}
