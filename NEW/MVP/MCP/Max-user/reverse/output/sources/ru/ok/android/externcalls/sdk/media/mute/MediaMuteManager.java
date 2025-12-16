package ru.ok.android.externcalls.sdk.media.mute;

import defpackage.cm6;
import defpackage.em6;
import defpackage.fje;
import defpackage.g29;
import defpackage.h29;
import defpackage.i29;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.media.mute.listener.MediaMuteManagerListener;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006Je\u0010\u0016\u001a\u00020\u00042\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\n\u0010\u000e\u001a\u00060\fj\u0002`\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00112\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0013H&¢\u0006\u0004\b\u0016\u0010\u0017JY\u0010\u0018\u001a\u00020\u00042\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00112\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0013H&¢\u0006\u0004\b\u0018\u0010\u0019J_\u0010\u001c\u001a\u00020\u00042\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\t0\u001a2\n\u0010\u000e\u001a\u00060\fj\u0002`\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00112\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0013H&¢\u0006\u0004\b\u001c\u0010\u001dJS\u0010\u001e\u001a\u00020\u00042\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\t0\u001a2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00112\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0013H&¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010!\u001a\u00020 2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fH&¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020 H&¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\u00042\u0006\u0010&\u001a\u00020%H&¢\u0006\u0004\b'\u0010(ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006)À\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/media/mute/MediaMuteManager;", "", "Lru/ok/android/externcalls/sdk/media/mute/listener/MediaMuteManagerListener;", "listener", "Lqqg;", "addListener", "(Lru/ok/android/externcalls/sdk/media/mute/listener/MediaMuteManagerListener;)V", "removeListener", "", "Lg29;", "Lh29;", "statesToUpdate", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "participantId", "Lfje;", "roomId", "Lkotlin/Function0;", "onSuccess", "Lkotlin/Function1;", "", "onError", "updateMediaOptionsForParticipant", "(Ljava/util/Map;Lru/ok/android/externcalls/sdk/id/ParticipantId;Lfje;Lcm6;Lem6;)V", "updateMediaOptionsForAll", "(Ljava/util/Map;Lfje;Lcm6;Lem6;)V", "", "mediaOptions", "requestToEnableMediaForParticipant", "(Ljava/util/Set;Lru/ok/android/externcalls/sdk/id/ParticipantId;Lfje;Lcm6;Lem6;)V", "requestToEnableMediaForAll", "(Ljava/util/Set;Lfje;Lcm6;Lem6;)V", "Li29;", "getMediaOptionsForCall", "(Lfje;)Li29;", "getMediaOptionsForCurrentUser", "()Li29;", "", "mute", "setAudioPlayoutMuted", "(Z)V", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface MediaMuteManager {
    static /* synthetic */ i29 getMediaOptionsForCall$default(MediaMuteManager mediaMuteManager, fje fjeVar, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getMediaOptionsForCall");
        }
        if ((i & 1) != 0) {
            fjeVar = null;
        }
        return mediaMuteManager.getMediaOptionsForCall(fjeVar);
    }

    static /* synthetic */ void requestToEnableMediaForAll$default(MediaMuteManager mediaMuteManager, Set set, fje fjeVar, cm6 cm6Var, em6 em6Var, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestToEnableMediaForAll");
        }
        if ((i & 2) != 0) {
            fjeVar = null;
        }
        if ((i & 4) != 0) {
            cm6Var = null;
        }
        if ((i & 8) != 0) {
            em6Var = null;
        }
        mediaMuteManager.requestToEnableMediaForAll(set, fjeVar, cm6Var, em6Var);
    }

    static /* synthetic */ void requestToEnableMediaForParticipant$default(MediaMuteManager mediaMuteManager, Set set, ParticipantId participantId, fje fjeVar, cm6 cm6Var, em6 em6Var, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestToEnableMediaForParticipant");
        }
        if ((i & 4) != 0) {
            fjeVar = null;
        }
        if ((i & 8) != 0) {
            cm6Var = null;
        }
        if ((i & 16) != 0) {
            em6Var = null;
        }
        mediaMuteManager.requestToEnableMediaForParticipant(set, participantId, fjeVar, cm6Var, em6Var);
    }

    static /* synthetic */ void updateMediaOptionsForAll$default(MediaMuteManager mediaMuteManager, Map map, fje fjeVar, cm6 cm6Var, em6 em6Var, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateMediaOptionsForAll");
        }
        if ((i & 2) != 0) {
            fjeVar = null;
        }
        if ((i & 4) != 0) {
            cm6Var = null;
        }
        if ((i & 8) != 0) {
            em6Var = null;
        }
        mediaMuteManager.updateMediaOptionsForAll(map, fjeVar, cm6Var, em6Var);
    }

    static /* synthetic */ void updateMediaOptionsForParticipant$default(MediaMuteManager mediaMuteManager, Map map, ParticipantId participantId, fje fjeVar, cm6 cm6Var, em6 em6Var, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateMediaOptionsForParticipant");
        }
        if ((i & 4) != 0) {
            fjeVar = null;
        }
        if ((i & 8) != 0) {
            cm6Var = null;
        }
        if ((i & 16) != 0) {
            em6Var = null;
        }
        mediaMuteManager.updateMediaOptionsForParticipant(map, participantId, fjeVar, cm6Var, em6Var);
    }

    void addListener(MediaMuteManagerListener listener);

    i29 getMediaOptionsForCall(fje roomId);

    i29 getMediaOptionsForCurrentUser();

    void removeListener(MediaMuteManagerListener listener);

    void requestToEnableMediaForAll(Set<? extends g29> mediaOptions, fje roomId, cm6 onSuccess, em6 onError);

    void requestToEnableMediaForParticipant(Set<? extends g29> mediaOptions, ParticipantId participantId, fje roomId, cm6 onSuccess, em6 onError);

    void setAudioPlayoutMuted(boolean mute);

    void updateMediaOptionsForAll(Map<g29, ? extends h29> statesToUpdate, fje roomId, cm6 onSuccess, em6 onError);

    void updateMediaOptionsForParticipant(Map<g29, ? extends h29> statesToUpdate, ParticipantId participantId, fje roomId, cm6 onSuccess, em6 onError);
}
