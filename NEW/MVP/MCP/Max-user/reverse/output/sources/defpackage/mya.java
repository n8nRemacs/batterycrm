package defpackage;

import one.me.sdk.vendor.SystemServicesManager$PushTokenGeneratedListener;

/* loaded from: classes.dex */
public final class mya implements SystemServicesManager$PushTokenGeneratedListener {
    public final /* synthetic */ oya a;

    public mya(oya oyaVar) {
        this.a = oyaVar;
    }

    @Override // one.me.sdk.vendor.SystemServicesManager$PushTokenGeneratedListener
    public final void onPushTokenGenerated(String str) {
        oya oyaVar = this.a;
        oyaVar.i.m(null, oyaVar.e());
    }
}
