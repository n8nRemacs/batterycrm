package com.google.android.exoplayer2;

import com.google.android.exoplayer2.s0;
import java.util.Collections;

/* compiled from: BasePlayer.java */
/* renamed from: com.google.android.exoplayer2.e, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC36510e implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final s0.d f344362a = new s0.d();

    @Override // com.google.android.exoplayer2.d0
    public final int A() {
        return getCurrentTimeline().o();
    }

    @Override // com.google.android.exoplayer2.d0
    @j.P
    public final O B() {
        s0 currentTimeline = getCurrentTimeline();
        if (currentTimeline.p()) {
            return null;
        }
        return currentTimeline.m(getCurrentMediaItemIndex(), this.f344362a, 0L).f345882d;
    }

    @Override // com.google.android.exoplayer2.d0
    public final void C() {
        int iK2;
        int iK3;
        if (getCurrentTimeline().p() || isPlayingAd()) {
            return;
        }
        boolean zP2 = P();
        if (R() && !S()) {
            if (zP2) {
                s0 currentTimeline = getCurrentTimeline();
                if (currentTimeline.p()) {
                    iK3 = -1;
                } else {
                    int currentMediaItemIndex = getCurrentMediaItemIndex();
                    int repeatMode = getRepeatMode();
                    iK3 = currentTimeline.k(currentMediaItemIndex, repeatMode != 1 ? repeatMode : 0, o());
                }
                if (iK3 != -1) {
                    T(iK3);
                    return;
                }
                return;
            }
            return;
        }
        if (!zP2 || getCurrentPosition() > b()) {
            seekTo(0L);
            return;
        }
        s0 currentTimeline2 = getCurrentTimeline();
        if (currentTimeline2.p()) {
            iK2 = -1;
        } else {
            int currentMediaItemIndex2 = getCurrentMediaItemIndex();
            int repeatMode2 = getRepeatMode();
            iK2 = currentTimeline2.k(currentMediaItemIndex2, repeatMode2 != 1 ? repeatMode2 : 0, o());
        }
        if (iK2 != -1) {
            T(iK2);
        }
    }

    @Override // com.google.android.exoplayer2.d0
    public final void E() {
        long currentPosition = getCurrentPosition() + (-q());
        long duration = getDuration();
        if (duration != -9223372036854775807L) {
            currentPosition = Math.min(currentPosition, duration);
        }
        seekTo(Math.max(currentPosition, 0L));
    }

    @Override // com.google.android.exoplayer2.d0
    public final void K() {
        int iE2;
        if (getCurrentTimeline().p() || isPlayingAd()) {
            return;
        }
        if (!O()) {
            if (R() && Q()) {
                T(getCurrentMediaItemIndex());
                return;
            }
            return;
        }
        s0 currentTimeline = getCurrentTimeline();
        if (currentTimeline.p()) {
            iE2 = -1;
        } else {
            int currentMediaItemIndex = getCurrentMediaItemIndex();
            int repeatMode = getRepeatMode();
            if (repeatMode == 1) {
                repeatMode = 0;
            }
            iE2 = currentTimeline.e(currentMediaItemIndex, repeatMode, o());
        }
        if (iE2 != -1) {
            T(iE2);
        }
    }

    public final boolean O() {
        int iE2;
        s0 currentTimeline = getCurrentTimeline();
        if (currentTimeline.p()) {
            iE2 = -1;
        } else {
            int currentMediaItemIndex = getCurrentMediaItemIndex();
            int repeatMode = getRepeatMode();
            if (repeatMode == 1) {
                repeatMode = 0;
            }
            iE2 = currentTimeline.e(currentMediaItemIndex, repeatMode, o());
        }
        return iE2 != -1;
    }

    public final boolean P() {
        int iK2;
        s0 currentTimeline = getCurrentTimeline();
        if (currentTimeline.p()) {
            iK2 = -1;
        } else {
            int currentMediaItemIndex = getCurrentMediaItemIndex();
            int repeatMode = getRepeatMode();
            if (repeatMode == 1) {
                repeatMode = 0;
            }
            iK2 = currentTimeline.k(currentMediaItemIndex, repeatMode, o());
        }
        return iK2 != -1;
    }

    public final boolean Q() {
        s0 currentTimeline = getCurrentTimeline();
        return !currentTimeline.p() && currentTimeline.m(getCurrentMediaItemIndex(), this.f344362a, 0L).f345888j;
    }

    public final boolean R() {
        s0 currentTimeline = getCurrentTimeline();
        return !currentTimeline.p() && currentTimeline.m(getCurrentMediaItemIndex(), this.f344362a, 0L).a();
    }

    public final boolean S() {
        s0 currentTimeline = getCurrentTimeline();
        return !currentTimeline.p() && currentTimeline.m(getCurrentMediaItemIndex(), this.f344362a, 0L).f345887i;
    }

    public final void T(int i12) {
        f(i12, -9223372036854775807L);
    }

    @Override // com.google.android.exoplayer2.d0
    public final long i() {
        s0 currentTimeline = getCurrentTimeline();
        if (currentTimeline.p()) {
            return -9223372036854775807L;
        }
        return com.google.android.exoplayer2.util.U.R(currentTimeline.m(getCurrentMediaItemIndex(), this.f344362a, 0L).f345893o);
    }

    @Override // com.google.android.exoplayer2.d0
    public final boolean k() {
        return getPlaybackState() == 3 && getPlayWhenReady() && getPlaybackSuppressionReason() == 0;
    }

    @Override // com.google.android.exoplayer2.d0
    public final void pause() {
        setPlayWhenReady(false);
    }

    @Override // com.google.android.exoplayer2.d0
    public final void play() {
        setPlayWhenReady(true);
    }

    @Override // com.google.android.exoplayer2.d0
    public final void r(O o12) {
        c(Collections.singletonList(o12));
    }

    @Override // com.google.android.exoplayer2.d0
    public final void seekTo(long j12) {
        f(getCurrentMediaItemIndex(), j12);
    }

    @Override // com.google.android.exoplayer2.d0
    public final boolean u(int i12) {
        return n().f344191b.f348141a.get(i12);
    }

    @Override // com.google.android.exoplayer2.d0
    public final void z() {
        long currentPosition = getCurrentPosition() + j();
        long duration = getDuration();
        if (duration != -9223372036854775807L) {
            currentPosition = Math.min(currentPosition, duration);
        }
        seekTo(Math.max(currentPosition, 0L));
    }
}
