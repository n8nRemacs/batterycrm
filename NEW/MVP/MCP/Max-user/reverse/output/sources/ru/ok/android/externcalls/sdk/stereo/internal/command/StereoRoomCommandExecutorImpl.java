package ru.ok.android.externcalls.sdk.stereo.internal.command;

import defpackage.cm6;
import defpackage.em6;
import defpackage.fni;
import defpackage.fr6;
import defpackage.ief;
import defpackage.lu1;
import defpackage.mc5;
import defpackage.nt;
import defpackage.paj;
import defpackage.pze;
import defpackage.st1;
import defpackage.um6;
import defpackage.we3;
import defpackage.wz0;
import defpackage.y6d;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.signaling.SignalingProvider;
import ru.ok.android.externcalls.sdk.signaling.SignalingProviderKt;
import ru.ok.android.externcalls.sdk.stat.negotiation.NegotiationErrorStat;
import ru.ok.android.externcalls.sdk.stereo.exception.ParticipantNotFoundException;
import ru.ok.android.externcalls.sdk.stereo.exception.PromotedLimitExceeded;
import ru.ok.android.externcalls.sdk.stereo.exception.StereoRoomException;
import ru.ok.android.externcalls.sdk.stereo.internal.command.StereoRoomCommandExecutor;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J5\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J=\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00122\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00142\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J=\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00182\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00142\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ=\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u001b2\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00142\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJK\u0010#\u001a\u00020\u000e2$\u0010\u0015\u001a \u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 \u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0!\u0012\u0004\u0012\u00020\u000e0\u001e2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fH\u0016¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010&¨\u0006'"}, d2 = {"Lru/ok/android/externcalls/sdk/stereo/internal/command/StereoRoomCommandExecutorImpl;", "Lru/ok/android/externcalls/sdk/stereo/internal/command/StereoRoomCommandExecutor;", "Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;", "signalingProvider", "Ly6d;", "log", "<init>", "(Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;Ly6d;)V", "", "method", "Lorg/json/JSONObject;", "errorResponse", "Lkotlin/Function1;", "", "Lqqg;", "onError", "parseErrorResponse", "(Ljava/lang/String;Lorg/json/JSONObject;Lem6;)V", "Lru/ok/android/externcalls/sdk/stereo/internal/command/StereoRoomCommandExecutor$PromoteParticipantParams;", "params", "Lkotlin/Function0;", "onSuccess", "promoteParticipant", "(Lru/ok/android/externcalls/sdk/stereo/internal/command/StereoRoomCommandExecutor$PromoteParticipantParams;Lcm6;Lem6;)V", "Lru/ok/android/externcalls/sdk/stereo/internal/command/StereoRoomCommandExecutor$RequestPromotionParams;", "requestPromotion", "(Lru/ok/android/externcalls/sdk/stereo/internal/command/StereoRoomCommandExecutor$RequestPromotionParams;Lcm6;Lem6;)V", "Lru/ok/android/externcalls/sdk/stereo/internal/command/StereoRoomCommandExecutor$AcceptPromotionParams;", "acceptPromotion", "(Lru/ok/android/externcalls/sdk/stereo/internal/command/StereoRoomCommandExecutor$AcceptPromotionParams;Lcm6;Lem6;)V", "Lkotlin/Function3;", "", "", "", "Ltt1;", "getHandsQueue", "(Lum6;Lem6;)V", "Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;", "Ly6d;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class StereoRoomCommandExecutorImpl implements StereoRoomCommandExecutor {
    private final y6d log;
    private final SignalingProvider signalingProvider;

    public StereoRoomCommandExecutorImpl(SignalingProvider signalingProvider, y6d y6dVar) {
        this.signalingProvider = signalingProvider;
        this.log = y6dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void acceptPromotion$lambda$4(cm6 cm6Var, JSONObject jSONObject) {
        if (cm6Var != null) {
            cm6Var.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getHandsQueue$lambda$8(StereoRoomCommandExecutorImpl stereoRoomCommandExecutorImpl, em6 em6Var, um6 um6Var, JSONObject jSONObject) {
        lu1 lu1VarY = new mc5(6, stereoRoomCommandExecutorImpl.log).y(jSONObject);
        if (lu1VarY == null) {
            if (em6Var != null) {
                em6Var.invoke(new StereoRoomException("getHandsQueue: missing response", null, 2, null));
                return;
            }
            return;
        }
        Object objValueOf = Integer.valueOf(lu1VarY.c);
        Object objValueOf2 = Boolean.valueOf(lu1VarY.b);
        ArrayList arrayList = lu1VarY.a;
        ArrayList arrayList2 = new ArrayList(we3.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((st1) it.next()).a);
        }
        um6Var.invoke(objValueOf, objValueOf2, arrayList2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void parseErrorResponse(String method, JSONObject errorResponse, em6 onError) {
        Object stereoRoomException;
        String strOptString = errorResponse.optString(NegotiationErrorStat.KEY_ERROR);
        if (fni.a(strOptString, "chatRoom.partNotFound")) {
            stereoRoomException = new ParticipantNotFoundException("Participant not found, " + method + " command " + errorResponse);
        } else if (fni.a(strOptString, "chatRoom.promotedLimit")) {
            stereoRoomException = new PromotedLimitExceeded();
        } else {
            stereoRoomException = new StereoRoomException("Error response for " + method + " command " + errorResponse, null, 2, null);
        }
        if (onError != null) {
            onError.invoke(stereoRoomException);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void promoteParticipant$lambda$0(cm6 cm6Var, JSONObject jSONObject) {
        if (cm6Var != null) {
            cm6Var.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void requestPromotion$lambda$2(cm6 cm6Var, JSONObject jSONObject) {
        if (cm6Var != null) {
            cm6Var.invoke();
        }
    }

    @Override // ru.ok.android.externcalls.sdk.stereo.internal.command.StereoRoomCommandExecutor
    public void acceptPromotion(StereoRoomCommandExecutor.AcceptPromotionParams params, cm6 onSuccess, em6 onError) throws JSONException {
        pze pzeVar = SignalingProviderKt.get(this.signalingProvider, onError);
        if (pzeVar == null) {
            return;
        }
        boolean reject = params.getReject();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("command", "accept-promotion");
        jSONObject.put("reject", reject);
        pzeVar.d(new fr6(jSONObject), false, new nt(14, onSuccess), new ief(this, onError, 2));
    }

    @Override // ru.ok.android.externcalls.sdk.stereo.internal.command.StereoRoomCommandExecutor
    public void getHandsQueue(um6 onSuccess, em6 onError) throws JSONException {
        pze pzeVar = SignalingProviderKt.get(this.signalingProvider, onError);
        if (pzeVar == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("command", "get-hand-queue");
        pzeVar.d(new fr6(jSONObject), false, new wz0(this, onError, onSuccess, 6), new ief(this, onError, 0));
    }

    @Override // ru.ok.android.externcalls.sdk.stereo.internal.command.StereoRoomCommandExecutor
    public void promoteParticipant(StereoRoomCommandExecutor.PromoteParticipantParams params, cm6 onSuccess, em6 onError) {
        pze pzeVar = SignalingProviderKt.get(this.signalingProvider, onError);
        if (pzeVar == null) {
            return;
        }
        pzeVar.d(paj.o(params.getParticipantId(), params.getPromote()), false, new nt(15, onSuccess), new ief(this, onError, 3));
    }

    @Override // ru.ok.android.externcalls.sdk.stereo.internal.command.StereoRoomCommandExecutor
    public void requestPromotion(StereoRoomCommandExecutor.RequestPromotionParams params, cm6 onSuccess, em6 onError) throws JSONException {
        pze pzeVar = SignalingProviderKt.get(this.signalingProvider, onError);
        if (pzeVar == null) {
            return;
        }
        boolean unrequest = params.getUnrequest();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("command", "request-promotion");
        jSONObject.put("unrequest", unrequest);
        pzeVar.d(new fr6(jSONObject), false, new nt(13, onSuccess), new ief(this, onError, 1));
    }
}
