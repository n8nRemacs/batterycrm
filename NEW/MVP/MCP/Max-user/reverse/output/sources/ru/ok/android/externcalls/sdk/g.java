package ru.ok.android.externcalls.sdk;

import defpackage.hu3;
import defpackage.mze;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final /* synthetic */ class g implements mze {
    public final /* synthetic */ int a;
    public final /* synthetic */ hu3 b;

    public /* synthetic */ g(hu3 hu3Var, int i) {
        this.a = i;
        this.b = hu3Var;
    }

    @Override // defpackage.mze
    public final void onResponse(JSONObject jSONObject) throws JSONException {
        switch (this.a) {
            case 0:
                ConversationImpl.lambda$addParticipant$24(this.b, jSONObject);
                break;
            case 1:
                ConversationImpl.lambda$setCallOptionEnabled$21(this.b, jSONObject);
                break;
            default:
                ConversationImpl.lambda$addParticipant$22(this.b, jSONObject);
                break;
        }
    }
}
