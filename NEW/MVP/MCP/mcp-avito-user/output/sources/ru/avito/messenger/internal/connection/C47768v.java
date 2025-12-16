package ru.avito.messenger.internal.connection;

import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: MessengerConnectionHolder.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/avito/messenger/internal/connection/b;", "connectCondition", "Lio/reactivex/rxjava3/core/E;", "Lru/avito/messenger/internal/connection/g$f;", "apply", "(Lru/avito/messenger/internal/connection/b;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: ru.avito.messenger.internal.connection.v, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47768v<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C47754g f431383b;

    public C47768v(C47754g c47754g) {
        this.f431383b = c47754g;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        C47749b c47749b = (C47749b) obj;
        if (!c47749b.f431277a || c47749b.f431278b.length() <= 0 || !c47749b.f431280d) {
            return io.reactivex.rxjava3.internal.operators.observable.U.f403867b;
        }
        C47754g c47754g = this.f431383b;
        return new io.reactivex.rxjava3.internal.operators.mixed.w(c47754g.f431306a.M0().D(io.reactivex.rxjava3.internal.functions.a.f401991a), new C47767u(c47754g, c47749b));
    }
}
