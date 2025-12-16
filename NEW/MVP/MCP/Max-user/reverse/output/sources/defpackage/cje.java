package defpackage;

import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.sessionroom.internal.command.SessionRoomCommandExecutorImpl;

/* loaded from: classes2.dex */
public final /* synthetic */ class cje implements mze {
    public final /* synthetic */ int a;
    public final /* synthetic */ SessionRoomCommandExecutorImpl b;
    public final /* synthetic */ em6 c;

    public /* synthetic */ cje(SessionRoomCommandExecutorImpl sessionRoomCommandExecutorImpl, em6 em6Var, int i) {
        this.a = i;
        this.b = sessionRoomCommandExecutorImpl;
        this.c = em6Var;
    }

    @Override // defpackage.mze
    public final void onResponse(JSONObject jSONObject) {
        switch (this.a) {
            case 0:
                this.b.parseErrorResponse("joinRoom", jSONObject, this.c);
                break;
            case 1:
                this.b.parseErrorResponse("leaveRoom", jSONObject, this.c);
                break;
            default:
                this.b.parseErrorResponse("requestAttention", jSONObject, this.c);
                break;
        }
    }
}
