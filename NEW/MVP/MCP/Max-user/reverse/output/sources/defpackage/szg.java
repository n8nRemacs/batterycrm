package defpackage;

import one.me.sdk.vendor.SystemServicesManager$PushTokenGeneratedListener;

/* loaded from: classes2.dex */
public final class szg implements SystemServicesManager$PushTokenGeneratedListener {
    public final k18 a;
    public final k18 b;

    public szg(w5 w5Var) {
        this.a = w5Var.d(31);
        this.b = w5Var.d(79);
    }

    @Override // one.me.sdk.vendor.SystemServicesManager$PushTokenGeneratedListener
    public final void onPushTokenGenerated(String str) {
        if (((fxa) this.a.getValue()).b()) {
            ((hwa) this.b.getValue()).n();
        }
    }
}
