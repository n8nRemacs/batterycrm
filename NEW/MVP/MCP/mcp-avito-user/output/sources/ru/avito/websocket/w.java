package ru.avito.websocket;

import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import io.reactivex.rxjava3.core.AbstractC41768a;
import io.reactivex.rxjava3.core.I;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Q;
import kotlin.jvm.internal.s0;
import ru.avito.websocket.u;

/* compiled from: RxWebSocketToLegacyAdapter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/avito/websocket/w;", "Lru/avito/websocket/a;", "_common_rx-websocket_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class w implements InterfaceC47843a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final n f431958a;

    /* compiled from: RxWebSocketToLegacyAdapter.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "it", "Lio/reactivex/rxjava3/core/O;", "Lkotlin/G0;", "apply", "(Ljava/lang/Throwable;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final a<T, R> f431959b = new a<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            Throwable th2 = (Throwable) obj;
            Throwable cause = th2.getCause();
            if (cause != null) {
                th2 = cause;
            }
            return I.l(th2);
        }
    }

    /* compiled from: RxWebSocketToLegacyAdapter.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/G0;", "it", "Lio/reactivex/rxjava3/core/O;", "Lru/avito/websocket/u;", "apply", "(Lkotlin/G0;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T, R> implements l41.o {
        public b() {
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            return w.this.f431958a.M0().N(x.f431962b).S();
        }
    }

    /* compiled from: RxWebSocketToLegacyAdapter.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/avito/websocket/u;", VoiceInfo.STATE, "Lio/reactivex/rxjava3/core/O;", "Lkotlin/G0;", "apply", "(Lru/avito/websocket/u;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final c<T, R> f431961b = new c<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            u uVar = (u) obj;
            if (uVar instanceof u.a ? true : uVar instanceof u.b) {
                return I.q(G0.f406611a);
            }
            if (!(uVar instanceof u.c)) {
                throw new NoWhenBranchMatchedException();
            }
            u.c cVar = (u.c) uVar;
            Throwable th2 = cVar.f431956c;
            if (th2 != null) {
                return I.l(th2);
            }
            return I.l(new RuntimeException("Failed to open socket. Socket state is DISCONNECTED with code " + cVar.f431954a));
        }
    }

    public w(@Y61.k n nVar) {
        this.f431958a = nVar;
    }

    @Override // ru.avito.websocket.InterfaceC47843a
    @Y61.k
    public final io.reactivex.rxjava3.core.z<u> M0() {
        return this.f431958a.M0();
    }

    @Override // ru.avito.websocket.InterfaceC47843a
    @Y61.k
    public final I<G0> a(@Y61.l String str) {
        return this.f431958a.a(str).t(a.f431959b).n(new b()).n(c.f431961b);
    }

    @Override // ru.avito.websocket.InterfaceC47843a
    @Y61.k
    public final <T> io.reactivex.rxjava3.core.z<T> b(@Y61.k A<? extends T> a12) {
        return this.f431958a.b(a12);
    }

    @Override // ru.avito.websocket.InterfaceC47843a
    @Y61.k
    public final AbstractC41768a c(@Y61.k String str) {
        return new io.reactivex.rxjava3.internal.operators.completable.v(this.f431958a.c(str).B(G0.f406611a).n(new v(this)));
    }

    @Override // ru.avito.websocket.InterfaceC47843a
    @Y61.k
    public final y d() {
        y.f431963c.getClass();
        return y.f431964d;
    }

    @Override // ru.avito.websocket.InterfaceC47843a
    @Y61.k
    public final I<Q<Boolean, String>> e(@Y61.k String str) {
        return this.f431958a.e(str);
    }
}
