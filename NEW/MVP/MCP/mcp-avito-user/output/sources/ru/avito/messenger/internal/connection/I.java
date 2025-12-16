package ru.avito.messenger.internal.connection;

import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.util.InterfaceC35745a5;
import java.util.concurrent.atomic.AtomicInteger;
import k91.AbstractC42548f;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import ru.avito.messenger.internal.connection.InterfaceC47751d;
import ru.avito.websocket.InterfaceC47843a;
import ru.avito.websocket.u;

/* compiled from: MessengerConnectionHolder.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00000\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/avito/messenger/internal/connection/d$b;", VoiceInfo.STATE, "Lio/reactivex/rxjava3/core/E;", "Lru/avito/messenger/internal/state_machine/g$a;", "apply", "(Lru/avito/messenger/internal/connection/d$b;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes9.dex */
final class I<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C47754g f431251b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f431252c;

    public I(C47754g c47754g, String str) {
        this.f431251b = c47754g;
        this.f431252c = str;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        InterfaceC47751d.b bVar = (InterfaceC47751d.b) obj;
        if (!(bVar instanceof InterfaceC47751d.b.c) || !((InterfaceC47751d.b.c) bVar).f431297a || (((InterfaceC47751d.b.c) bVar).f431298b instanceof AbstractC42548f.e)) {
            return io.reactivex.rxjava3.internal.operators.observable.U.f403867b;
        }
        AtomicInteger atomicInteger = new AtomicInteger(0);
        C47754g c47754g = this.f431251b;
        InterfaceC47843a interfaceC47843a = c47754g.f431307b;
        io.reactivex.rxjava3.core.z<ru.avito.websocket.u> zVarM0 = interfaceC47843a.M0();
        InterfaceC35745a5 interfaceC35745a5 = c47754g.f431312g;
        io.reactivex.rxjava3.core.z zVarD0 = zVarM0.j0(interfaceC35745a5.c()).D(F.f431248b).k0(u.c.class).K(new G(atomicInteger)).d0(H.f431250b);
        if (c47754g.f431318m) {
            zVarD0 = io.reactivex.rxjava3.core.z.g0(zVarD0, c47754g.f431325t.I0(interfaceC47843a.M0(), A.f431240b).j0(interfaceC35745a5.c()).k0(u.c.class).K(new B(atomicInteger, c47754g)).d0(C.f431243b));
        }
        return zVarD0.x(new D(atomicInteger, c47754g)).d0(new E(c47754g, this.f431252c));
    }
}
