package com.avito.android.messenger.conversation.mvi.voice;

import com.avito.android.messenger.conversation.mvi.voice.r0;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: VoicePlayerPresenterImpl.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/voice/r0;", "kotlin.jvm.PlatformType", VoiceInfo.STATE, "Lio/reactivex/rxjava3/core/E;", "apply", "(Lcom/avito/android/messenger/conversation/mvi/voice/r0;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class n0<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a0 f195180b;

    public n0(a0 a0Var) {
        this.f195180b = a0Var;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        long j12;
        r0 r0Var = (r0) obj;
        if (r0Var instanceof r0.c ? true : r0Var instanceof r0.a) {
            return io.reactivex.rxjava3.core.z.c0(r0Var);
        }
        if (!(r0Var instanceof r0.b)) {
            throw new NoWhenBranchMatchedException();
        }
        a0 a0Var = this.f195180b;
        androidx.media3.session.J j13 = a0Var.f195127N;
        Long l12 = null;
        if (j13 != null) {
            long duration = j13.getDuration();
            Long lValueOf = Long.valueOf(duration);
            if (duration != -9223372036854775807L) {
                l12 = lValueOf;
            }
        }
        kotlin.ranges.o oVar = new kotlin.ranges.o(0L, 4000L);
        if (l12 == null || !oVar.b(l12.longValue())) {
            kotlin.ranges.o oVar2 = new kotlin.ranges.o(4001L, 6000L);
            if (l12 == null || !oVar2.b(l12.longValue())) {
                j12 = (l12 == null || !new kotlin.ranges.o(6001L, 20000L).b(l12.longValue())) ? 200L : 100L;
            } else {
                j12 = 70;
            }
        } else {
            j12 = 50;
        }
        return io.reactivex.rxjava3.core.z.a0(0L, j12, TimeUnit.MILLISECONDS, io.reactivex.rxjava3.schedulers.b.f404942b).j0(a0Var.f195122E.e()).d0(new m0(r0Var, a0Var));
    }
}
