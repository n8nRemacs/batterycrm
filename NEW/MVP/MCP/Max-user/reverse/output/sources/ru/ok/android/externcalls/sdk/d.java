package ru.ok.android.externcalls.sdk;

import defpackage.cm6;
import java.io.Serializable;
import java.util.ArrayList;
import ru.ok.android.externcalls.sdk.id.ParticipantId;

/* loaded from: classes2.dex */
public final /* synthetic */ class d implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ConversationImpl b;
    public final /* synthetic */ Serializable c;

    public /* synthetic */ d(ConversationImpl conversationImpl, Serializable serializable, int i) {
        this.a = i;
        this.b = conversationImpl;
        this.c = serializable;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return this.b.lambda$withInternalIds$32((ArrayList) this.c);
            default:
                return this.b.lambda$withInternalId$30((ParticipantId) this.c);
        }
    }
}
