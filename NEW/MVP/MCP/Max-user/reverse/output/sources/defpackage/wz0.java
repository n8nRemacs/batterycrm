package defpackage;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.participant.state.internal.ParticipantStatesManagerImpl;
import ru.ok.android.externcalls.sdk.record.RecordManager;
import ru.ok.android.externcalls.sdk.record.internal.RecordManagerImpl;
import ru.ok.android.externcalls.sdk.stat.negotiation.NegotiationErrorStat;
import ru.ok.android.externcalls.sdk.stereo.internal.command.StereoRoomCommandExecutorImpl;

/* loaded from: classes2.dex */
public final /* synthetic */ class wz0 implements mze {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ wz0(mze mzeVar, ParticipantStatesManagerImpl participantStatesManagerImpl, Map map) {
        this.a = 3;
        this.d = mzeVar;
        this.b = participantStatesManagerImpl;
        this.c = map;
    }

    @Override // defpackage.mze
    public final void onResponse(JSONObject jSONObject) {
        switch (this.a) {
            case 0:
                k01 k01Var = (k01) this.b;
                ti1 ti1Var = (ti1) this.c;
                mze mzeVar = (mze) this.d;
                y6d y6dVar = k01Var.P;
                y6dVar.log("OKRTCCall", "handle response from signaling on add-participant command");
                try {
                    int i = h9i.b[az1.v(k01Var.y(ti1Var, jSONObject.optJSONObject("participant")))];
                    if (i != 1 && i == 2) {
                        mzeVar.onResponse(new JSONObject().put(NegotiationErrorStat.KEY_ERROR, "state.accepted"));
                        break;
                    }
                } catch (JSONException e) {
                    y6dVar.reportException("OKRTCCall", "add.participant.success", e);
                    return;
                }
                break;
            case 1:
                k01 k01Var2 = (k01) this.b;
                qpb qpbVar = (qpb) this.c;
                tjh tjhVar = (tjh) this.d;
                lu1 lu1VarY = k01Var2.I0.y(jSONObject);
                if (lu1VarY == null) {
                    tjhVar.run();
                    break;
                } else {
                    qpbVar.accept(lu1VarY);
                    break;
                }
            case 2:
                xo8 xo8Var = (xo8) this.b;
                ts9 ts9Var = (ts9) this.c;
                ts9 ts9Var2 = (ts9) this.d;
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("rooms");
                j0f j0fVarI = jSONObjectOptJSONObject != null ? ((aqc) xo8Var.b).i(jSONObjectOptJSONObject) : null;
                if (j0fVarI != null) {
                    ts9Var2.invoke(j0fVarI);
                    break;
                } else {
                    ts9Var.invoke(new RuntimeException("Can't parse rooms from " + jSONObject));
                    break;
                }
            case 3:
                ParticipantStatesManagerImpl.updateOwnStateInternal$lambda$19((mze) this.d, (ParticipantStatesManagerImpl) this.b, (Map) this.c, jSONObject);
                break;
            case 4:
                RecordManagerImpl.stopRecord$lambda$3((RecordManagerImpl) this.b, (RecordManager.StopParams) this.c, (em6) this.d, jSONObject);
                break;
            case 5:
                RecordManagerImpl.startRecord$lambda$1((RecordManagerImpl) this.b, (RecordManager.StartParams) this.c, (em6) this.d, jSONObject);
                break;
            default:
                StereoRoomCommandExecutorImpl.getHandsQueue$lambda$8((StereoRoomCommandExecutorImpl) this.b, (em6) this.c, (um6) this.d, jSONObject);
                break;
        }
    }

    public /* synthetic */ wz0(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
