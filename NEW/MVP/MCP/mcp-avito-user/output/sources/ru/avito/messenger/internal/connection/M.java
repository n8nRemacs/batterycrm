package ru.avito.messenger.internal.connection;

import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import io.reactivex.rxjava3.internal.operators.maybe.C41928w;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import ru.avito.messenger.internal.connection.InterfaceC47751d;

/* compiled from: MessengerConnectionHolder.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u001e\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0000 \u0004*\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00030\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/avito/messenger/internal/connection/d$b;", VoiceInfo.STATE, "Lio/reactivex/rxjava3/core/w;", "Lru/avito/messenger/internal/state_machine/g$a;", "kotlin.jvm.PlatformType", "apply", "(Lru/avito/messenger/internal/connection/d$b;)Lio/reactivex/rxjava3/core/w;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class M<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f431256b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C47754g f431257c;

    public M(long j12, C47754g c47754g) {
        this.f431256b = j12;
        this.f431257c = c47754g;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        if (!(((InterfaceC47751d.b) obj) instanceof InterfaceC47751d.b.a)) {
            return C41928w.f403335b;
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        C47754g c47754g = this.f431257c;
        io.reactivex.rxjava3.core.H hC2 = c47754g.f431312g.c();
        long j12 = this.f431256b;
        return new io.reactivex.rxjava3.internal.operators.maybe.f0(new io.reactivex.rxjava3.internal.operators.mixed.v(io.reactivex.rxjava3.core.z.a0(j12, j12, timeUnit, hC2), new K(c47754g)).z(), new L(c47754g));
    }
}
