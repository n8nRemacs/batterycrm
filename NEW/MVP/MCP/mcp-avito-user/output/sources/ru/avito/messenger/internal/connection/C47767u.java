package ru.avito.messenger.internal.connection;

import io.reactivex.rxjava3.internal.operators.maybe.C41928w;
import io.reactivex.rxjava3.internal.operators.maybe.p0;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import ru.avito.messenger.internal.connection.InterfaceC47751d;

/* compiled from: MessengerConnectionHolder.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/avito/messenger/internal/connection/d$b;", "originalState", "Lio/reactivex/rxjava3/core/w;", "Lru/avito/messenger/internal/connection/g$f;", "apply", "(Lru/avito/messenger/internal/connection/d$b;)Lio/reactivex/rxjava3/core/w;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: ru.avito.messenger.internal.connection.u, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47767u<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C47754g f431381b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C47749b f431382c;

    public C47767u(C47754g c47754g, C47749b c47749b) {
        this.f431381b = c47754g;
        this.f431382c = c47749b;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        InterfaceC47751d.b bVar = (InterfaceC47751d.b) obj;
        if (!(bVar instanceof InterfaceC47751d.b.AbstractC12404b)) {
            return C41928w.f403335b;
        }
        TimeUnit timeUnit = TimeUnit.SECONDS;
        C47754g c47754g = this.f431381b;
        io.reactivex.rxjava3.core.H hC2 = c47754g.f431312g.c();
        Objects.requireNonNull(timeUnit, "unit is null");
        return new p0(Math.max(0L, 15L), timeUnit, hC2).j(new C47766t(bVar, c47754g, this.f431382c));
    }
}
