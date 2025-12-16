package defpackage;

import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.sessionroom.internal.command.SessionRoomAdminCommandExecutorImpl;

/* loaded from: classes2.dex */
public final /* synthetic */ class aje implements mze {
    public final /* synthetic */ int a;
    public final /* synthetic */ SessionRoomAdminCommandExecutorImpl b;
    public final /* synthetic */ em6 c;

    public /* synthetic */ aje(SessionRoomAdminCommandExecutorImpl sessionRoomAdminCommandExecutorImpl, em6 em6Var, int i) {
        this.a = i;
        this.b = sessionRoomAdminCommandExecutorImpl;
        this.c = em6Var;
    }

    @Override // defpackage.mze
    public final void onResponse(JSONObject jSONObject) {
        switch (this.a) {
            case 0:
                this.b.parseErrorResponse("switchRoom", jSONObject, this.c);
                break;
            default:
                this.b.parseErrorResponse("updateRooms", jSONObject, this.c);
                break;
        }
    }
}
