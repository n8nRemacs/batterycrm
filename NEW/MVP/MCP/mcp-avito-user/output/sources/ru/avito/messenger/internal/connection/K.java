package ru.avito.messenger.internal.connection;

import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: MessengerConnectionHolder.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lio/reactivex/rxjava3/core/g;", "apply", "(J)Lio/reactivex/rxjava3/core/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class K<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C47754g f431254b;

    public K(C47754g c47754g) {
        this.f431254b = c47754g;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        ((Number) obj).longValue();
        C47754g c47754g = this.f431254b;
        return new io.reactivex.rxjava3.internal.operators.completable.v(c47754g.f431308c.sendPing().z(c47754g.f431312g.a()));
    }
}
