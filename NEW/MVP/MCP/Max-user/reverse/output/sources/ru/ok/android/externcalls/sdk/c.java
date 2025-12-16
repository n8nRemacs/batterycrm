package ru.ok.android.externcalls.sdk;

import defpackage.hu3;
import defpackage.pze;
import defpackage.ti1;
import org.json.JSONException;

/* loaded from: classes2.dex */
public final /* synthetic */ class c implements hu3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ c(int i, Object obj, boolean z) {
        this.a = i;
        this.b = obj;
        this.c = z;
    }

    @Override // defpackage.hu3
    public final void accept(Object obj) throws JSONException {
        switch (this.a) {
            case 0:
                ((ConversationImpl) this.b).lambda$removeParticipant$28(this.c, (ti1) obj);
                break;
            case 1:
                ((ConversationImpl) this.b).lambda$promoteParticipant$29(this.c, (ti1) obj);
                break;
            default:
                ConversationImpl.lambda$setMuteState$37((pze) this.b, this.c, (ti1) obj);
                break;
        }
    }
}
