package ru.ok.android.externcalls.sdk;

import defpackage.em6;
import java.util.List;
import ru.ok.android.externcalls.sdk.id.ParticipantId;

/* loaded from: classes2.dex */
public final /* synthetic */ class q implements em6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ConversationImpl b;

    public /* synthetic */ q(ConversationImpl conversationImpl, int i) {
        this.a = i;
        this.b = conversationImpl;
    }

    @Override // defpackage.em6
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return this.b.getCallParticipantId((ParticipantId) obj);
            default:
                return this.b.lambda$new$3((List) obj);
        }
    }
}
