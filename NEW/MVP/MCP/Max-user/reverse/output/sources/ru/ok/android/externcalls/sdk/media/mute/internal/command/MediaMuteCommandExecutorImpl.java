package ru.ok.android.externcalls.sdk.media.mute.internal.command;

import defpackage.cm6;
import defpackage.em6;
import defpackage.fje;
import defpackage.g29;
import defpackage.h29;
import defpackage.i29;
import defpackage.k01;
import defpackage.k29;
import defpackage.nt;
import defpackage.ot;
import defpackage.p8a;
import defpackage.pve;
import defpackage.pze;
import defpackage.rve;
import defpackage.ti1;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.signaling.SignalingProvider;
import ru.ok.android.externcalls.sdk.signaling.SignalingProviderKt;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\"\u0010\f\u001a\u001e\u0012\f\u0012\n\u0018\u00010\bj\u0004\u0018\u0001`\t\u0012\f\u0012\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b0\u0007\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\u0004\b\u000f\u0010\u0010Jc\u0010\u001b\u001a\u00020\u00172\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00112\u000e\u0010\u0015\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t2\b\u0010\u0016\u001a\u0004\u0018\u00010\r2\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00042\u0014\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ]\u0010\u001f\u001a\u00020\u00172\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00120\u001d2\u000e\u0010\u0015\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t2\b\u0010\u0016\u001a\u0004\u0018\u00010\r2\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00042\u0014\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u001f\u0010 J_\u0010!\u001a\u00020\u00172\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00112\n\u0010\u0015\u001a\u00060\bj\u0002`\t2\b\u0010\u0016\u001a\u0004\u0018\u00010\r2\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00042\u0014\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0007H\u0016¢\u0006\u0004\b!\u0010\u001cJS\u0010\"\u001a\u00020\u00172\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\r2\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00042\u0014\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\"\u0010#JY\u0010$\u001a\u00020\u00172\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00120\u001d2\n\u0010\u0015\u001a\u00060\bj\u0002`\t2\b\u0010\u0016\u001a\u0004\u0018\u00010\r2\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00042\u0014\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0007H\u0016¢\u0006\u0004\b$\u0010 JM\u0010%\u001a\u00020\u00172\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00120\u001d2\b\u0010\u0016\u001a\u0004\u0018\u00010\r2\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00042\u0014\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0007H\u0016¢\u0006\u0004\b%\u0010&J\u0019\u0010(\u001a\u00020'2\b\u0010\u0016\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020'H\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010.\u001a\u00020\u00172\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b.\u0010/R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00100R\u001c\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00101R0\u0010\f\u001a\u001e\u0012\f\u0012\n\u0018\u00010\bj\u0004\u0018\u0001`\t\u0012\f\u0012\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00102R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u00101R\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105¨\u00066"}, d2 = {"Lru/ok/android/externcalls/sdk/media/mute/internal/command/MediaMuteCommandExecutorImpl;", "Lru/ok/android/externcalls/sdk/media/mute/internal/command/MediaMuteCommandExecutor;", "Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;", "signalingProvider", "Lkotlin/Function0;", "Lk01;", "getCall", "Lkotlin/Function1;", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "Lti1;", "Lru/ok/android/externcalls/sdk/id/InternalId;", "getInternalId", "Lfje;", "getActiveRoomId", "<init>", "(Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;Lcm6;Lem6;Lcm6;)V", "", "Lg29;", "Lh29;", "statesToUpdate", "participantId", "roomId", "Lqqg;", "onSuccess", "", "onError", "updateMediaOptions", "(Ljava/util/Map;Lru/ok/android/externcalls/sdk/id/ParticipantId;Lfje;Lcm6;Lem6;)V", "", "mediaOptions", "requestToEnableMedia", "(Ljava/util/Set;Lru/ok/android/externcalls/sdk/id/ParticipantId;Lfje;Lcm6;Lem6;)V", "updateMediaOptionsForParticipant", "updateMediaOptionsForAll", "(Ljava/util/Map;Lfje;Lcm6;Lem6;)V", "requestToEnableMediaForParticipant", "requestToEnableMediaForAll", "(Ljava/util/Set;Lfje;Lcm6;Lem6;)V", "Li29;", "getMediaOptionsForCall", "(Lfje;)Li29;", "getMediaOptionsForCurrentUser", "()Li29;", "", "mute", "setAudioPlayoutMuted", "(Z)V", "Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;", "Lcm6;", "Lem6;", "Lk29;", "paramsCreator", "Lk29;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MediaMuteCommandExecutorImpl implements MediaMuteCommandExecutor {
    private final cm6 getActiveRoomId;
    private final cm6 getCall;
    private final em6 getInternalId;
    private final k29 paramsCreator = new k29();
    private final SignalingProvider signalingProvider;

    public MediaMuteCommandExecutorImpl(SignalingProvider signalingProvider, cm6 cm6Var, em6 em6Var, cm6 cm6Var2) {
        this.signalingProvider = signalingProvider;
        this.getCall = cm6Var;
        this.getInternalId = em6Var;
        this.getActiveRoomId = cm6Var2;
    }

    private final void requestToEnableMedia(Set<? extends g29> mediaOptions, ParticipantId participantId, fje roomId, cm6 onSuccess, em6 onError) {
        pze pzeVar = SignalingProviderKt.get(this.signalingProvider, onError);
        if (pzeVar == null) {
            return;
        }
        ti1 ti1Var = (ti1) this.getInternalId.invoke(participantId);
        if (participantId != null && ti1Var == null) {
            if (onError != null) {
                onError.invoke(new IllegalStateException("Participant is not prepared"));
                return;
            }
            return;
        }
        try {
            k29 k29Var = this.paramsCreator;
            if (roomId == null) {
                roomId = (fje) this.getActiveRoomId.invoke();
            }
            k29Var.getClass();
            pzeVar.j(k29.a(mediaOptions, ti1Var, roomId), new nt(5, onSuccess), new ot(5, onError));
        } catch (JSONException e) {
            if (onError != null) {
                onError.invoke(new RuntimeException("Error while creating params", e));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void requestToEnableMedia$lambda$2(cm6 cm6Var, JSONObject jSONObject) {
        if (cm6Var != null) {
            cm6Var.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void requestToEnableMedia$lambda$3(em6 em6Var, JSONObject jSONObject) {
        if (em6Var != null) {
            em6Var.invoke(new RuntimeException("Error response " + jSONObject));
        }
    }

    private final void updateMediaOptions(Map<g29, ? extends h29> statesToUpdate, ParticipantId participantId, fje roomId, cm6 onSuccess, em6 onError) {
        pze pzeVar = SignalingProviderKt.get(this.signalingProvider, onError);
        if (pzeVar == null) {
            return;
        }
        ti1 ti1Var = (ti1) this.getInternalId.invoke(participantId);
        if (participantId != null && ti1Var == null) {
            if (onError != null) {
                onError.invoke(new IllegalStateException("Participant is not prepared"));
                return;
            }
            return;
        }
        try {
            k29 k29Var = this.paramsCreator;
            if (roomId == null) {
                roomId = (fje) this.getActiveRoomId.invoke();
            }
            k29Var.getClass();
            pzeVar.j(k29.b(statesToUpdate, ti1Var, roomId), new nt(6, onSuccess), new ot(6, onError));
        } catch (JSONException e) {
            if (onError != null) {
                onError.invoke(new RuntimeException("Error while creating params", e));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateMediaOptions$lambda$0(cm6 cm6Var, JSONObject jSONObject) {
        if (cm6Var != null) {
            cm6Var.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateMediaOptions$lambda$1(em6 em6Var, JSONObject jSONObject) {
        if (em6Var != null) {
            em6Var.invoke(new RuntimeException("Error response " + jSONObject));
        }
    }

    @Override // ru.ok.android.externcalls.sdk.media.mute.internal.command.MediaMuteCommandExecutor
    public i29 getMediaOptionsForCall(fje roomId) {
        i29 i29Var;
        k01 k01Var = (k01) this.getCall.invoke();
        if (roomId == null) {
            roomId = (fje) this.getActiveRoomId.invoke();
        }
        if (k01Var != null) {
            p8a p8aVarH = k01Var.G0.h(roomId);
            i29Var = new i29(p8aVarH.a, p8aVarH.b, p8aVarH.c, p8aVarH.d);
        } else {
            i29Var = null;
        }
        return i29Var == null ? new i29() : i29Var;
    }

    @Override // ru.ok.android.externcalls.sdk.media.mute.internal.command.MediaMuteCommandExecutor
    public i29 getMediaOptionsForCurrentUser() {
        i29 i29Var;
        k01 k01Var = (k01) this.getCall.invoke();
        if (k01Var != null) {
            p8a p8aVar = k01Var.G0.i;
            i29Var = new i29(p8aVar.a, p8aVar.b, p8aVar.c, p8aVar.d);
        } else {
            i29Var = null;
        }
        return i29Var == null ? new i29() : i29Var;
    }

    @Override // ru.ok.android.externcalls.sdk.media.mute.internal.command.MediaMuteCommandExecutor
    public void requestToEnableMediaForAll(Set<? extends g29> mediaOptions, fje roomId, cm6 onSuccess, em6 onError) {
        requestToEnableMedia(mediaOptions, null, roomId, onSuccess, onError);
    }

    @Override // ru.ok.android.externcalls.sdk.media.mute.internal.command.MediaMuteCommandExecutor
    public void requestToEnableMediaForParticipant(Set<? extends g29> mediaOptions, ParticipantId participantId, fje roomId, cm6 onSuccess, em6 onError) {
        requestToEnableMedia(mediaOptions, participantId, roomId, onSuccess, onError);
    }

    @Override // ru.ok.android.externcalls.sdk.media.mute.internal.command.MediaMuteCommandExecutor
    public void setAudioPlayoutMuted(boolean mute) {
        k01 k01Var = (k01) this.getCall.invoke();
        if (k01Var != null) {
            rve rveVar = k01Var.f0;
            rveVar.a.execute(new pve(rveVar, mute, 2));
        }
    }

    @Override // ru.ok.android.externcalls.sdk.media.mute.internal.command.MediaMuteCommandExecutor
    public void updateMediaOptionsForAll(Map<g29, ? extends h29> statesToUpdate, fje roomId, cm6 onSuccess, em6 onError) {
        updateMediaOptions(statesToUpdate, null, roomId, onSuccess, onError);
    }

    @Override // ru.ok.android.externcalls.sdk.media.mute.internal.command.MediaMuteCommandExecutor
    public void updateMediaOptionsForParticipant(Map<g29, ? extends h29> statesToUpdate, ParticipantId participantId, fje roomId, cm6 onSuccess, em6 onError) {
        updateMediaOptions(statesToUpdate, participantId, roomId, onSuccess, onError);
    }
}
