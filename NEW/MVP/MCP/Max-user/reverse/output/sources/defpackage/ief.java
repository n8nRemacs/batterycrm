package defpackage;

import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.stereo.internal.command.StereoRoomCommandExecutorImpl;

/* loaded from: classes2.dex */
public final /* synthetic */ class ief implements mze {
    public final /* synthetic */ int a;
    public final /* synthetic */ StereoRoomCommandExecutorImpl b;
    public final /* synthetic */ em6 c;

    public /* synthetic */ ief(StereoRoomCommandExecutorImpl stereoRoomCommandExecutorImpl, em6 em6Var, int i) {
        this.a = i;
        this.b = stereoRoomCommandExecutorImpl;
        this.c = em6Var;
    }

    @Override // defpackage.mze
    public final void onResponse(JSONObject jSONObject) {
        switch (this.a) {
            case 0:
                this.b.parseErrorResponse("getHandQueue", jSONObject, this.c);
                break;
            case 1:
                this.b.parseErrorResponse("requestPromotion", jSONObject, this.c);
                break;
            case 2:
                this.b.parseErrorResponse("acceptPromotion", jSONObject, this.c);
                break;
            default:
                this.b.parseErrorResponse("promoteParticipant", jSONObject, this.c);
                break;
        }
    }
}
