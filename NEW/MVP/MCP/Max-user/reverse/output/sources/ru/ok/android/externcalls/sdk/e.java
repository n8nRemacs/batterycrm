package ru.ok.android.externcalls.sdk;

import defpackage.hu3;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Map;
import ru.ok.android.externcalls.sdk.id.ParticipantId;

/* loaded from: classes2.dex */
public final /* synthetic */ class e implements hu3 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ hu3 b;
    public final /* synthetic */ Serializable c;

    public /* synthetic */ e(hu3 hu3Var, ArrayList arrayList) {
        this.b = hu3Var;
        this.c = arrayList;
    }

    @Override // defpackage.hu3
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                ConversationImpl.lambda$withInternalIds$33(this.b, (ArrayList) this.c, (Map) obj);
                break;
            default:
                ConversationImpl.lambda$withInternalId$31((ParticipantId) this.c, this.b, (Map) obj);
                break;
        }
    }

    public /* synthetic */ e(ParticipantId participantId, hu3 hu3Var) {
        this.c = participantId;
        this.b = hu3Var;
    }
}
