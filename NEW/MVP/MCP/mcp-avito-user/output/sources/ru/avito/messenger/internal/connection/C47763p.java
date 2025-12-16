package ru.avito.messenger.internal.connection;

import kotlin.Metadata;

/* compiled from: MessengerConnectionHolder.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "error", "Lio/reactivex/rxjava3/core/O;", "Lru/avito/websocket/y;", "apply", "(Ljava/lang/Throwable;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: ru.avito.messenger.internal.connection.p, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class C47763p<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C47754g f431372b;

    public C47763p(C47754g c47754g) {
        this.f431372b = c47754g;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        C47754g c47754g = this.f431372b;
        return c47754g.f431306a.M0().S().n(new C47762o((Throwable) obj, c47754g));
    }
}
