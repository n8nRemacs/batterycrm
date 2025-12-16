package ru.ok.android.externcalls.sdk;

import defpackage.cm6;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ConversationImpl b;

    public /* synthetic */ a(ConversationImpl conversationImpl, int i) {
        this.a = i;
        this.b = conversationImpl;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return Boolean.valueOf(this.b.isMeCreatorOrAdmin());
            case 1:
                return this.b.lambda$createMediaMuteManager$4();
            case 2:
                return this.b.lambda$createAsrOnlineManager$5();
            case 3:
                return this.b.lambda$createAsrOnlineManager$6();
            case 4:
                return Boolean.valueOf(this.b.isDestroyed());
            case 5:
                return this.b.lambda$new$0();
            case 6:
                return this.b.lambda$new$1();
            default:
                return this.b.lambda$new$2();
        }
    }
}
