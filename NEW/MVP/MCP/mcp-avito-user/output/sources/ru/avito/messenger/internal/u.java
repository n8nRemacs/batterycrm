package ru.avito.messenger.internal;

import java.util.Collections;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import ru.avito.messenger.MessengerApi;

/* compiled from: MessengerClientImpl.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/avito/messenger/MessengerApi;", "api", "Lio/reactivex/rxjava3/core/O;", "Lkotlin/G0;", "apply", "(Lru/avito/messenger/MessengerApi;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes9.dex */
final class u<T, R> implements l41.o {
    @Override // l41.o
    public final Object apply(Object obj) {
        return ((MessengerApi) obj).setOptions(Collections.singletonMap("filterExchange", P0.g(new Q("enable", Boolean.TRUE), new Q("channelId", null))));
    }
}
