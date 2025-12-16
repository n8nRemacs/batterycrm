package ru.ok.android.externcalls.sdk.watch_together.internal.commands;

import defpackage.akh;
import defpackage.c3a;
import defpackage.cm6;
import defpackage.d3a;
import defpackage.em6;
import defpackage.fni;
import defpackage.fr6;
import defpackage.nt;
import defpackage.p8a;
import defpackage.pze;
import defpackage.sf1;
import defpackage.tv;
import defpackage.y2a;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;
import ru.ok.android.externcalls.sdk.exceptions.ConversationNotPreparedException;
import ru.ok.android.externcalls.sdk.signaling.SignalingProvider;
import ru.ok.android.externcalls.sdk.stat.negotiation.NegotiationErrorStat;
import ru.ok.android.externcalls.sdk.watch_together.WatchTogetherError;
import ru.ok.android.externcalls.sdk.watch_together.exceptions.WatchTogetherException;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ5\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0016\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0018\u0010\u0019JZ\u0010%\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010!\u001a\u00020 2\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00042\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tH\u0016ø\u0001\u0000¢\u0006\u0004\b#\u0010$J=\u0010&\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001a2\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00042\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tH\u0016¢\u0006\u0004\b&\u0010'J=\u0010(\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001a2\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00042\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tH\u0016¢\u0006\u0004\b(\u0010'J=\u0010)\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001a2\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00042\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tH\u0016¢\u0006\u0004\b)\u0010'JP\u0010-\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010*\u001a\u00020 2\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00042\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tH\u0016ø\u0001\u0000¢\u0006\u0004\b+\u0010,JE\u0010.\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010*\u001a\u00020 2\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00042\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tH\u0016¢\u0006\u0004\b.\u0010/JM\u00104\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u0002022\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00042\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tH\u0016¢\u0006\u0004\b4\u00105R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00106R\u001c\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00107\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00068"}, d2 = {"Lru/ok/android/externcalls/sdk/watch_together/internal/commands/WatchTogetherCommandExecutorImpl;", "Lru/ok/android/externcalls/sdk/watch_together/internal/commands/WatchTogetherCommandsExecutor;", "Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;", "signalingProvider", "Lkotlin/Function0;", "Lsf1;", "mediaOptionsDelegate", "<init>", "(Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;Lcm6;)V", "Lkotlin/Function1;", "", "Lqqg;", "onError", "Lpze;", "getSignalingOrPassExceptionToOnError", "(Lem6;)Lpze;", "", "method", "Lorg/json/JSONObject;", "errorResponse", "parseErrorResponse", "(Ljava/lang/String;Lorg/json/JSONObject;Lem6;)V", SdkMetricStatEvent.VALUE_KEY, "Ld3a;", "parseMovieType", "(Ljava/lang/String;)Ld3a;", "Ly2a;", "movieId", "Ll3a;", "volume", "Lc3a;", "meta", "", "moveToAdminOnHangup", "onSuccess", "play-yj_a6ag", "(Ly2a;FLc3a;ZLcm6;Lem6;)V", "play", "stop", "(Ly2a;Lcm6;Lem6;)V", "pause", "resume", "isMuted", "setVolume-F2PwOSs", "(Ly2a;FZLcm6;Lem6;)V", "setVolume", "setMuted", "(Ly2a;ZLcm6;Lem6;)V", "", "position", "Ljava/util/concurrent/TimeUnit;", "unit", "setPosition", "(Ly2a;JLjava/util/concurrent/TimeUnit;Lcm6;Lem6;)V", "Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;", "Lcm6;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class WatchTogetherCommandExecutorImpl implements WatchTogetherCommandsExecutor {
    private final cm6 mediaOptionsDelegate;
    private final SignalingProvider signalingProvider;

    public WatchTogetherCommandExecutorImpl(SignalingProvider signalingProvider, cm6 cm6Var) {
        this.signalingProvider = signalingProvider;
        this.mediaOptionsDelegate = cm6Var;
    }

    private final pze getSignalingOrPassExceptionToOnError(em6 onError) {
        pze signaling = this.signalingProvider.getSignaling();
        if (signaling != null) {
            return signaling;
        }
        if (onError == null) {
            return null;
        }
        onError.invoke(new ConversationNotPreparedException());
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void parseErrorResponse(String method, JSONObject errorResponse, em6 onError) {
        String strOptString = errorResponse.optString(NegotiationErrorStat.KEY_ERROR);
        WatchTogetherError watchTogetherError = (fni.a(strOptString, "movie-limit-exceeded") || fni.a(strOptString, "movie-not-found")) ? WatchTogetherError.LIMIT_EXCEEDED : WatchTogetherError.UNKNOWN_ERROR;
        WatchTogetherError watchTogetherError2 = watchTogetherError;
        if (onError != null) {
            onError.invoke(new WatchTogetherException(watchTogetherError2, "Error response for " + method + " command " + errorResponse, null, 4, null));
        }
    }

    private final d3a parseMovieType(String value) {
        if (fni.a(value, "MOVIE")) {
            return d3a.a;
        }
        if (fni.a(value, "STREAM")) {
            return d3a.b;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void pause$lambda$4(cm6 cm6Var, JSONObject jSONObject) {
        if (cm6Var != null) {
            cm6Var.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void play_yj_a6ag$lambda$0(cm6 cm6Var, JSONObject jSONObject) {
        if (cm6Var != null) {
            cm6Var.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void resume$lambda$6(cm6 cm6Var, JSONObject jSONObject) {
        if (cm6Var != null) {
            cm6Var.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setMuted$lambda$10(cm6 cm6Var, JSONObject jSONObject) {
        if (cm6Var != null) {
            cm6Var.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setPosition$lambda$12(cm6 cm6Var, JSONObject jSONObject) {
        if (cm6Var != null) {
            cm6Var.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setVolume_F2PwOSs$lambda$8(cm6 cm6Var, JSONObject jSONObject) {
        if (cm6Var != null) {
            cm6Var.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void stop$lambda$2(cm6 cm6Var, JSONObject jSONObject) {
        if (cm6Var != null) {
            cm6Var.invoke();
        }
    }

    @Override // ru.ok.android.externcalls.sdk.watch_together.internal.commands.WatchTogetherCommandsExecutor
    public void pause(y2a movieId, cm6 onSuccess, em6 onError) throws JSONException {
        pze signalingOrPassExceptionToOnError = getSignalingOrPassExceptionToOnError(onError);
        if (signalingOrPassExceptionToOnError == null) {
            return;
        }
        long j = movieId.a;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("command", "update-movie");
        jSONObject.put("movieId", j);
        jSONObject.put("pause", true);
        signalingOrPassExceptionToOnError.d(new fr6(jSONObject), false, new nt(20, onSuccess), new akh(this, onError, 1));
    }

    @Override // ru.ok.android.externcalls.sdk.watch_together.internal.commands.WatchTogetherCommandsExecutor
    /* renamed from: play-yj_a6ag */
    public void mo156playyj_a6ag(y2a movieId, float volume, c3a meta, boolean moveToAdminOnHangup, cm6 onSuccess, em6 onError) throws JSONException {
        sf1 sf1Var = (sf1) this.mediaOptionsDelegate.invoke();
        if (sf1Var != null) {
            if (sf1.d(new tv(0, 22, p8a.class, sf1Var.i, "movieSharingState", "getMovieSharingState()Lru/ok/android/webrtc/media_options/MediaOptionState;"))) {
                pze signalingOrPassExceptionToOnError = getSignalingOrPassExceptionToOnError(onError);
                if (signalingOrPassExceptionToOnError == null) {
                    return;
                }
                long j = movieId.a;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("command", "add-movie");
                jSONObject.put("movieId", j);
                jSONObject.put("gain", volume);
                jSONObject.put("moveToAdminOnHangup", moveToAdminOnHangup);
                signalingOrPassExceptionToOnError.d(new fr6(jSONObject), false, new nt(22, onSuccess), new akh(this, onError, 4));
                return;
            }
        }
        if (onError != null) {
            onError.invoke(new WatchTogetherException(WatchTogetherError.PLAY_NOT_ALLOWED, "Play not allowed due to media option", null, 4, null));
        }
    }

    @Override // ru.ok.android.externcalls.sdk.watch_together.internal.commands.WatchTogetherCommandsExecutor
    public void resume(y2a movieId, cm6 onSuccess, em6 onError) throws JSONException {
        pze signalingOrPassExceptionToOnError = getSignalingOrPassExceptionToOnError(onError);
        if (signalingOrPassExceptionToOnError == null) {
            return;
        }
        long j = movieId.a;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("command", "update-movie");
        jSONObject.put("movieId", j);
        jSONObject.put("pause", false);
        signalingOrPassExceptionToOnError.d(new fr6(jSONObject), false, new nt(18, onSuccess), new akh(this, onError, 2));
    }

    @Override // ru.ok.android.externcalls.sdk.watch_together.internal.commands.WatchTogetherCommandsExecutor
    public void setMuted(y2a movieId, boolean isMuted, cm6 onSuccess, em6 onError) throws JSONException {
        pze signalingOrPassExceptionToOnError = getSignalingOrPassExceptionToOnError(onError);
        if (signalingOrPassExceptionToOnError == null) {
            return;
        }
        long j = movieId.a;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("command", "update-movie");
        jSONObject.put("movieId", j);
        jSONObject.put("mute", isMuted);
        signalingOrPassExceptionToOnError.d(new fr6(jSONObject), false, new nt(23, onSuccess), new akh(this, onError, 5));
    }

    @Override // ru.ok.android.externcalls.sdk.watch_together.internal.commands.WatchTogetherCommandsExecutor
    public void setPosition(y2a movieId, long position, TimeUnit unit, cm6 onSuccess, em6 onError) throws JSONException {
        pze signalingOrPassExceptionToOnError = getSignalingOrPassExceptionToOnError(onError);
        if (signalingOrPassExceptionToOnError == null) {
            return;
        }
        long j = movieId.a;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("command", "update-movie");
        jSONObject.put("movieId", j);
        jSONObject.put("offset", unit.toSeconds(position));
        signalingOrPassExceptionToOnError.d(new fr6(jSONObject), false, new nt(21, onSuccess), new akh(this, onError, 3));
    }

    @Override // ru.ok.android.externcalls.sdk.watch_together.internal.commands.WatchTogetherCommandsExecutor
    /* renamed from: setVolume-F2PwOSs */
    public void mo157setVolumeF2PwOSs(y2a movieId, float volume, boolean isMuted, cm6 onSuccess, em6 onError) throws JSONException {
        pze signalingOrPassExceptionToOnError = getSignalingOrPassExceptionToOnError(onError);
        if (signalingOrPassExceptionToOnError == null) {
            return;
        }
        long j = movieId.a;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("command", "update-movie");
        jSONObject.put("movieId", j);
        jSONObject.put("gain", volume);
        jSONObject.put("mute", isMuted);
        signalingOrPassExceptionToOnError.d(new fr6(jSONObject), false, new nt(19, onSuccess), new akh(this, onError, 0));
    }

    @Override // ru.ok.android.externcalls.sdk.watch_together.internal.commands.WatchTogetherCommandsExecutor
    public void stop(y2a movieId, cm6 onSuccess, em6 onError) throws JSONException {
        pze signalingOrPassExceptionToOnError = getSignalingOrPassExceptionToOnError(onError);
        if (signalingOrPassExceptionToOnError == null) {
            return;
        }
        long j = movieId.a;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("command", "remove-movie");
        jSONObject.put("movieId", j);
        signalingOrPassExceptionToOnError.d(new fr6(jSONObject), false, new nt(24, onSuccess), new akh(this, onError, 6));
    }
}
