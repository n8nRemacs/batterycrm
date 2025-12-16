package ru.ok.android.externcalls.sdk;

import defpackage.gu3;
import defpackage.hu3;
import defpackage.k01;

/* loaded from: classes2.dex */
public final /* synthetic */ class p implements gu3 {
    public final /* synthetic */ ConversationImpl a;
    public final /* synthetic */ hu3 b;

    public /* synthetic */ p(ConversationImpl conversationImpl, hu3 hu3Var) {
        this.a = conversationImpl;
        this.b = hu3Var;
    }

    public void a(k01 k01Var) {
        this.a.lambda$performConnect$19(this.b, k01Var);
    }

    @Override // defpackage.gu3
    public void accept(Object obj) throws Throwable {
        this.a.lambda$runStartConversation$15(this.b, (Throwable) obj);
    }
}
