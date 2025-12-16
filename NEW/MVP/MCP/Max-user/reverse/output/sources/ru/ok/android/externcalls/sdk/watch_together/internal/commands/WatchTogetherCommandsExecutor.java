package ru.ok.android.externcalls.sdk.watch_together.internal.commands;

import defpackage.c3a;
import defpackage.cm6;
import defpackage.em6;
import defpackage.y2a;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001JZ\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b\u0018\u00010\rH&ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J=\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b\u0018\u00010\rH&¢\u0006\u0004\b\u0013\u0010\u0014J=\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b\u0018\u00010\rH&¢\u0006\u0004\b\u0015\u0010\u0014J=\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b\u0018\u00010\rH&¢\u0006\u0004\b\u0016\u0010\u0014JP\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\b2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b\u0018\u00010\rH&ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019JE\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\b2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b\u0018\u00010\rH&¢\u0006\u0004\b\u001b\u0010\u001cJM\u0010!\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b\u0018\u00010\rH&¢\u0006\u0004\b!\u0010\"ø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006#À\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/watch_together/internal/commands/WatchTogetherCommandsExecutor;", "", "Ly2a;", "movieId", "Ll3a;", "volume", "Lc3a;", "meta", "", "moveToAdminOnHangup", "Lkotlin/Function0;", "Lqqg;", "onSuccess", "Lkotlin/Function1;", "", "onError", "play-yj_a6ag", "(Ly2a;FLc3a;ZLcm6;Lem6;)V", "play", "stop", "(Ly2a;Lcm6;Lem6;)V", "pause", "resume", "isMuted", "setVolume-F2PwOSs", "(Ly2a;FZLcm6;Lem6;)V", "setVolume", "setMuted", "(Ly2a;ZLcm6;Lem6;)V", "", "position", "Ljava/util/concurrent/TimeUnit;", "unit", "setPosition", "(Ly2a;JLjava/util/concurrent/TimeUnit;Lcm6;Lem6;)V", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface WatchTogetherCommandsExecutor {
    void pause(y2a movieId, cm6 onSuccess, em6 onError);

    /* renamed from: play-yj_a6ag */
    void mo156playyj_a6ag(y2a movieId, float volume, c3a meta, boolean moveToAdminOnHangup, cm6 onSuccess, em6 onError);

    void resume(y2a movieId, cm6 onSuccess, em6 onError);

    void setMuted(y2a movieId, boolean isMuted, cm6 onSuccess, em6 onError);

    void setPosition(y2a movieId, long position, TimeUnit unit, cm6 onSuccess, em6 onError);

    /* renamed from: setVolume-F2PwOSs */
    void mo157setVolumeF2PwOSs(y2a movieId, float volume, boolean isMuted, cm6 onSuccess, em6 onError);

    void stop(y2a movieId, cm6 onSuccess, em6 onError);
}
