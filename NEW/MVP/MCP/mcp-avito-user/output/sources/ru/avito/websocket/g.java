package ru.avito.websocket;

import io.reactivex.rxjava3.core.I;
import java.io.IOException;
import kotlin.G0;
import kotlin.Metadata;
import ru.avito.websocket.u;

/* compiled from: LegacyRxWebSocketImpl.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/avito/websocket/u;", "kotlin.jvm.PlatformType", "it", "Lio/reactivex/rxjava3/core/O;", "Lkotlin/G0;", "apply", "(Lru/avito/websocket/u;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes9.dex */
final class g<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public static final g<T, R> f431895b = new g<>();

    @Override // l41.o
    public final Object apply(Object obj) {
        return ((u) obj) instanceof u.a ? I.q(G0.f406611a) : I.l(new IOException());
    }
}
