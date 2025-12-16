package ru.ok.android.externcalls.sdk;

import defpackage.gu3;
import defpackage.hu3;
import ru.ok.android.externcalls.sdk.api.ConversationParams;

/* loaded from: classes2.dex */
public final /* synthetic */ class k implements gu3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ k(Runnable runnable, hu3 hu3Var) {
        this.a = 2;
        this.c = runnable;
        this.b = hu3Var;
    }

    @Override // defpackage.gu3
    public final void accept(Object obj) throws Throwable {
        switch (this.a) {
            case 0:
                ((ConversationImpl) this.b).lambda$refreshParams$12(this.c, (ConversationParams) obj);
                break;
            case 1:
                ((ConversationImpl) this.b).lambda$resolveExternalsByInternalsIds$36(this.c, (Throwable) obj);
                break;
            default:
                ConversationImpl.lambda$removeJoinLink$34(this.c, (hu3) this.b, (Boolean) obj);
                break;
        }
    }

    public /* synthetic */ k(ConversationImpl conversationImpl, Runnable runnable, int i) {
        this.a = i;
        this.b = conversationImpl;
        this.c = runnable;
    }
}
