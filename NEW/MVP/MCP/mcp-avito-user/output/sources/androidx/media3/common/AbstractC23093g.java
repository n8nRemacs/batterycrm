package androidx.media3.common;

import android.os.SystemClock;
import androidx.media3.common.P;
import com.google.common.collect.AbstractC37401r1;
import j.k0;

/* compiled from: BasePlayer.java */
@androidx.media3.common.util.J
/* renamed from: androidx.media3.common.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC23093g implements H {

    /* renamed from: a, reason: collision with root package name */
    public final P.d f47663a = new P.d();

    @Override // androidx.media3.common.H
    @j.P
    public final z B() {
        P currentTimeline = getCurrentTimeline();
        if (currentTimeline.x()) {
            return null;
        }
        return currentTimeline.u(getCurrentMediaItemIndex(), this.f47663a, 0L).f47409d;
    }

    @Override // androidx.media3.common.H
    public final int C() {
        long jU2 = U();
        long duration = getDuration();
        if (jU2 == -9223372036854775807L || duration == -9223372036854775807L) {
            return 0;
        }
        if (duration == 0) {
            return 100;
        }
        return androidx.media3.common.util.M.k((int) ((jU2 * 100) / duration), 0, 100);
    }

    @Override // androidx.media3.common.H
    public final void D() {
        a0(getCurrentMediaItemIndex(), -9223372036854775807L, false);
    }

    @Override // androidx.media3.common.H
    public final void S(z zVar) {
        c(AbstractC37401r1.E(zVar));
    }

    @Override // androidx.media3.common.H
    public final void V(z zVar, long j12) {
        M(AbstractC37401r1.E(zVar), 0, j12);
    }

    public final boolean Y() {
        int iM2;
        P currentTimeline = getCurrentTimeline();
        if (currentTimeline.x()) {
            iM2 = -1;
        } else {
            int currentMediaItemIndex = getCurrentMediaItemIndex();
            int repeatMode = getRepeatMode();
            if (repeatMode == 1) {
                repeatMode = 0;
            }
            iM2 = currentTimeline.m(currentMediaItemIndex, repeatMode, o());
        }
        return iM2 != -1;
    }

    public final boolean Z() {
        int iS2;
        P currentTimeline = getCurrentTimeline();
        if (currentTimeline.x()) {
            iS2 = -1;
        } else {
            int currentMediaItemIndex = getCurrentMediaItemIndex();
            int repeatMode = getRepeatMode();
            if (repeatMode == 1) {
                repeatMode = 0;
            }
            iS2 = currentTimeline.s(currentMediaItemIndex, repeatMode, o());
        }
        return iS2 != -1;
    }

    @k0
    public abstract void a0(int i12, long j12, boolean z12);

    public final void b0(int i12) {
        int iS2;
        P currentTimeline = getCurrentTimeline();
        if (currentTimeline.x()) {
            iS2 = -1;
        } else {
            int currentMediaItemIndex = getCurrentMediaItemIndex();
            int repeatMode = getRepeatMode();
            if (repeatMode == 1) {
                repeatMode = 0;
            }
            iS2 = currentTimeline.s(currentMediaItemIndex, repeatMode, o());
        }
        if (iS2 == -1) {
            return;
        }
        if (iS2 == getCurrentMediaItemIndex()) {
            a0(getCurrentMediaItemIndex(), -9223372036854775807L, true);
        } else {
            a0(iS2, -9223372036854775807L, false);
        }
    }

    @Override // androidx.media3.common.H
    public final void f(z zVar) {
        c(AbstractC37401r1.E(zVar));
    }

    @Override // androidx.media3.common.H
    public final long i() {
        P currentTimeline = getCurrentTimeline();
        if (currentTimeline.x()) {
            return -9223372036854775807L;
        }
        return androidx.media3.common.util.M.Q(currentTimeline.u(getCurrentMediaItemIndex(), this.f47663a, 0L).f47420o);
    }

    @Override // androidx.media3.common.H
    public final boolean isCurrentMediaItemDynamic() {
        P currentTimeline = getCurrentTimeline();
        return !currentTimeline.x() && currentTimeline.u(getCurrentMediaItemIndex(), this.f47663a, 0L).f47415j;
    }

    @Override // androidx.media3.common.H
    public final boolean isCurrentMediaItemLive() {
        P currentTimeline = getCurrentTimeline();
        return !currentTimeline.x() && currentTimeline.u(getCurrentMediaItemIndex(), this.f47663a, 0L).a();
    }

    @Override // androidx.media3.common.H
    public final boolean isCurrentMediaItemSeekable() {
        P currentTimeline = getCurrentTimeline();
        return !currentTimeline.x() && currentTimeline.u(getCurrentMediaItemIndex(), this.f47663a, 0L).f47414i;
    }

    @Override // androidx.media3.common.H
    public final boolean k() {
        return getPlaybackState() == 3 && getPlayWhenReady() && getPlaybackSuppressionReason() == 0;
    }

    @Override // androidx.media3.common.H
    public final void pause() {
        setPlayWhenReady(false);
    }

    @Override // androidx.media3.common.H
    public final void play() {
        setPlayWhenReady(true);
    }

    @Override // androidx.media3.common.H
    public final void seekTo(long j12) {
        a0(getCurrentMediaItemIndex(), j12, false);
    }

    @Override // androidx.media3.common.H
    public final void setPlaybackSpeed(float f12) {
        d(new G(f12, getPlaybackParameters().f47237c));
    }

    @Override // androidx.media3.common.H
    public final boolean u(int i12) {
        return n().a(i12);
    }

    @Override // androidx.media3.common.H
    public final long x() {
        P currentTimeline = getCurrentTimeline();
        if (currentTimeline.x()) {
            return -9223372036854775807L;
        }
        int currentMediaItemIndex = getCurrentMediaItemIndex();
        P.d dVar = this.f47663a;
        if (currentTimeline.u(currentMediaItemIndex, dVar, 0L).f47412g == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j12 = dVar.f47413h;
        int i12 = androidx.media3.common.util.M.f47887a;
        return ((j12 == -9223372036854775807L ? System.currentTimeMillis() : j12 + SystemClock.elapsedRealtime()) - dVar.f47412g) - getContentPosition();
    }
}
