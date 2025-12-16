package ru.avito.messenger.internal.connection;

import kotlin.Metadata;

/* compiled from: MessengerConnectionHolder.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/avito/messenger/internal/state_machine/g$a;", "Lru/avito/messenger/internal/connection/d$b;", "it", "Lkotlin/G0;", "accept", "(Lru/avito/messenger/internal/state_machine/g$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes9.dex */
final class J<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C47754g f431253b;

    public J(C47754g c47754g) {
        this.f431253b = c47754g;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        this.f431253b.f431311f.b("Reconnect triggered");
    }
}
