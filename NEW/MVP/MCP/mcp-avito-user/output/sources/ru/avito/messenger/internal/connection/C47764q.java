package ru.avito.messenger.internal.connection;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import ru.avito.messenger.internal.connection.InterfaceC47751d;
import ru.avito.messenger.internal.connection.j0;
import ru.avito.messenger.internal.entity.jsonrpc.MessengerNoNetworkException;

/* compiled from: MessengerConnectionHolder.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "isNetworkAvailable", "Lio/reactivex/rxjava3/core/O;", "Lru/avito/websocket/y;", "apply", "(Z)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: ru.avito.messenger.internal.connection.q, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class C47764q<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C47754g f431373b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f431374c;

    public C47764q(long j12, C47754g c47754g) {
        this.f431373b = c47754g;
        this.f431374c = j12;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        if (!((Boolean) obj).booleanValue()) {
            return io.reactivex.rxjava3.core.I.l(new MessengerNoNetworkException("Network is not available"));
        }
        C47754g c47754g = this.f431373b;
        return c47754g.f431306a.M0().k0(InterfaceC47751d.b.a.class).S().r(new j0.c(new kotlin.jvm.internal.h0() { // from class: ru.avito.messenger.internal.connection.n
            @Override // kotlin.jvm.internal.h0, kotlin.reflect.p
            @Y61.l
            public final Object get(@Y61.l Object obj2) {
                return ((InterfaceC47751d.b.a) obj2).f431291c;
            }
        })).B(this.f431374c, TimeUnit.MILLISECONDS, c47754g.f431312g.c(), null).t(new C47763p(c47754g));
    }
}
