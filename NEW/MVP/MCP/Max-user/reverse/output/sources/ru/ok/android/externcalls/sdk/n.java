package ru.ok.android.externcalls.sdk;

import ru.ok.android.externcalls.sdk.ConversationImpl;

/* loaded from: classes2.dex */
public final /* synthetic */ class n implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((ConversationImpl) this.b).lambda$performConnect$18();
                break;
            case 1:
                ((ConversationImpl) this.b).reportIfApplicable();
                break;
            case 2:
                ((ConversationImpl) this.b).onSignalingRefresh();
                break;
            case 3:
                ((ConversationImpl) this.b).resolveUnknownExternals();
                break;
            case 4:
                ((ConversationImpl) this.b).lambda$performConnect$17();
                break;
            default:
                ((ConversationImpl.AnonymousClass1) this.b).lambda$onSample$0();
                break;
        }
    }
}
