package defpackage;

import com.google.firebase.messaging.FirebaseMessaging;

/* loaded from: classes.dex */
public final /* synthetic */ class tl3 implements rpc {
    public final /* synthetic */ int a;

    public /* synthetic */ tl3(int i) {
        this.a = i;
    }

    @Override // defpackage.rpc
    public final Object get() {
        switch (this.a) {
            case 5:
                n4e n4eVar = FirebaseMessaging.k;
                break;
        }
        return null;
    }
}
