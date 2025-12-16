package ru.ok.android.externcalls.sdk;

import defpackage.gu3;
import defpackage.hu3;
import ru.ok.android.externcalls.sdk.api.ConversationParams;
import ru.ok.android.externcalls.sdk.api.request.JoinConversation;
import ru.ok.android.externcalls.sdk.conversation.internal.actions.ConversationStart;

/* loaded from: classes2.dex */
public final /* synthetic */ class s implements gu3 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ ConversationImpl b;
    public final /* synthetic */ hu3 c;
    public final /* synthetic */ ConversationParams d;
    public final /* synthetic */ hu3 o;

    public /* synthetic */ s(ConversationImpl conversationImpl, hu3 hu3Var, ConversationParams conversationParams, hu3 hu3Var2) {
        this.b = conversationImpl;
        this.c = hu3Var;
        this.d = conversationParams;
        this.o = hu3Var2;
    }

    @Override // defpackage.gu3
    public final void accept(Object obj) throws Throwable {
        switch (this.a) {
            case 0:
                this.b.lambda$performConfroomJoin$10(this.d, this.c, this.o, (JoinConversation.Response) obj);
                break;
            default:
                this.b.lambda$runStartConversation$14(this.c, this.d, this.o, (ConversationStart.Result) obj);
                break;
        }
    }

    public /* synthetic */ s(ConversationImpl conversationImpl, ConversationParams conversationParams, hu3 hu3Var, hu3 hu3Var2) {
        this.b = conversationImpl;
        this.d = conversationParams;
        this.c = hu3Var;
        this.o = hu3Var2;
    }
}
