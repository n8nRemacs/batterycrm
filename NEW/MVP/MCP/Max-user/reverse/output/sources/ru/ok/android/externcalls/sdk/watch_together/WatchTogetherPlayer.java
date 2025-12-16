package ru.ok.android.externcalls.sdk.watch_together;

import defpackage.c3a;
import defpackage.cm6;
import defpackage.em6;
import defpackage.l3a;
import defpackage.y2a;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.watch_together.listener.WatchTogetherListener;
import ru.ok.android.externcalls.sdk.watch_together.listener.states.MovieStates;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001Jd\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b\u0018\u00010\rH'ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011JA\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b\u0018\u00010\rH'¢\u0006\u0004\b\u0013\u0010\u0014JA\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b\u0018\u00010\rH'¢\u0006\u0004\b\u0015\u0010\u0014JA\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b\u0018\u00010\rH'¢\u0006\u0004\b\u0016\u0010\u0014JT\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b\u0018\u00010\rH'ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019JI\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b\u0018\u00010\rH'¢\u0006\u0004\b\u001b\u0010\u001cJQ\u0010!\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b\u0018\u00010\rH'¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020#H'¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020#H'¢\u0006\u0004\b'\u0010&J\u000f\u0010)\u001a\u00020(H'¢\u0006\u0004\b)\u0010*ø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006+À\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/watch_together/WatchTogetherPlayer;", "", "Ly2a;", "movieId", "Ll3a;", "volume", "Lc3a;", "meta", "", "moveToAdminOnHangup", "Lkotlin/Function0;", "Lqqg;", "onSuccess", "Lkotlin/Function1;", "", "onError", "play-yj_a6ag", "(Ly2a;FLc3a;ZLcm6;Lem6;)V", "play", "stop", "(Ly2a;Lcm6;Lem6;)V", "pause", "resume", "isMuted", "setVolume-F2PwOSs", "(Ly2a;FZLcm6;Lem6;)V", "setVolume", "setMuted", "(Ly2a;ZLcm6;Lem6;)V", "", "position", "Ljava/util/concurrent/TimeUnit;", "unit", "setPosition", "(Ly2a;JLjava/util/concurrent/TimeUnit;Lcm6;Lem6;)V", "Lru/ok/android/externcalls/sdk/watch_together/listener/WatchTogetherListener;", "listener", "addListener", "(Lru/ok/android/externcalls/sdk/watch_together/listener/WatchTogetherListener;)V", "removeListener", "Lru/ok/android/externcalls/sdk/watch_together/listener/states/MovieStates;", "getMovieStates", "()Lru/ok/android/externcalls/sdk/watch_together/listener/states/MovieStates;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface WatchTogetherPlayer {
    static /* synthetic */ void pause$default(WatchTogetherPlayer watchTogetherPlayer, y2a y2aVar, cm6 cm6Var, em6 em6Var, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: pause");
        }
        if ((i & 2) != 0) {
            cm6Var = null;
        }
        if ((i & 4) != 0) {
            em6Var = null;
        }
        watchTogetherPlayer.pause(y2aVar, cm6Var, em6Var);
    }

    /* renamed from: play-yj_a6ag$default, reason: not valid java name */
    static void m154playyj_a6ag$default(WatchTogetherPlayer watchTogetherPlayer, y2a y2aVar, float f, c3a c3aVar, boolean z, cm6 cm6Var, em6 em6Var, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: play-yj_a6ag");
        }
        if ((i & 2) != 0) {
            float f2 = l3a.a;
            f = l3a.a;
        }
        float f3 = f;
        c3a c3aVar2 = (i & 4) != 0 ? null : c3aVar;
        if ((i & 8) != 0) {
            z = false;
        }
        watchTogetherPlayer.mo156playyj_a6ag(y2aVar, f3, c3aVar2, z, (i & 16) != 0 ? null : cm6Var, (i & 32) != 0 ? null : em6Var);
    }

    static /* synthetic */ void resume$default(WatchTogetherPlayer watchTogetherPlayer, y2a y2aVar, cm6 cm6Var, em6 em6Var, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resume");
        }
        if ((i & 2) != 0) {
            cm6Var = null;
        }
        if ((i & 4) != 0) {
            em6Var = null;
        }
        watchTogetherPlayer.resume(y2aVar, cm6Var, em6Var);
    }

    static /* synthetic */ void setMuted$default(WatchTogetherPlayer watchTogetherPlayer, y2a y2aVar, boolean z, cm6 cm6Var, em6 em6Var, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setMuted");
        }
        if ((i & 4) != 0) {
            cm6Var = null;
        }
        if ((i & 8) != 0) {
            em6Var = null;
        }
        watchTogetherPlayer.setMuted(y2aVar, z, cm6Var, em6Var);
    }

    static /* synthetic */ void setPosition$default(WatchTogetherPlayer watchTogetherPlayer, y2a y2aVar, long j, TimeUnit timeUnit, cm6 cm6Var, em6 em6Var, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setPosition");
        }
        if ((i & 8) != 0) {
            cm6Var = null;
        }
        if ((i & 16) != 0) {
            em6Var = null;
        }
        watchTogetherPlayer.setPosition(y2aVar, j, timeUnit, cm6Var, em6Var);
    }

    /* renamed from: setVolume-F2PwOSs$default, reason: not valid java name */
    static /* synthetic */ void m155setVolumeF2PwOSs$default(WatchTogetherPlayer watchTogetherPlayer, y2a y2aVar, float f, boolean z, cm6 cm6Var, em6 em6Var, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setVolume-F2PwOSs");
        }
        if ((i & 8) != 0) {
            cm6Var = null;
        }
        if ((i & 16) != 0) {
            em6Var = null;
        }
        watchTogetherPlayer.mo157setVolumeF2PwOSs(y2aVar, f, z, cm6Var, em6Var);
    }

    static /* synthetic */ void stop$default(WatchTogetherPlayer watchTogetherPlayer, y2a y2aVar, cm6 cm6Var, em6 em6Var, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: stop");
        }
        if ((i & 2) != 0) {
            cm6Var = null;
        }
        if ((i & 4) != 0) {
            em6Var = null;
        }
        watchTogetherPlayer.stop(y2aVar, cm6Var, em6Var);
    }

    void addListener(WatchTogetherListener listener);

    MovieStates getMovieStates();

    void pause(y2a movieId, cm6 onSuccess, em6 onError);

    /* renamed from: play-yj_a6ag, reason: not valid java name */
    void mo156playyj_a6ag(y2a movieId, float volume, c3a meta, boolean moveToAdminOnHangup, cm6 onSuccess, em6 onError);

    void removeListener(WatchTogetherListener listener);

    void resume(y2a movieId, cm6 onSuccess, em6 onError);

    void setMuted(y2a movieId, boolean isMuted, cm6 onSuccess, em6 onError);

    void setPosition(y2a movieId, long position, TimeUnit unit, cm6 onSuccess, em6 onError);

    /* renamed from: setVolume-F2PwOSs, reason: not valid java name */
    void mo157setVolumeF2PwOSs(y2a movieId, float volume, boolean isMuted, cm6 onSuccess, em6 onError);

    void stop(y2a movieId, cm6 onSuccess, em6 onError);
}
