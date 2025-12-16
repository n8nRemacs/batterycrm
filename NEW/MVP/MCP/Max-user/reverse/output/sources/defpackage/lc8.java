package defpackage;

import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;

/* loaded from: classes.dex */
public final class lc8 implements wta {
    public final vgd a;
    public boolean b = false;

    public lc8(lii liiVar, vgd vgdVar) {
        this.a = vgdVar;
    }

    @Override // defpackage.wta
    public final void a(Object obj) {
        vgd vgdVar = this.a;
        vgdVar.getClass();
        SignInHubActivity signInHubActivity = (SignInHubActivity) vgdVar.b;
        signInHubActivity.setResult(signInHubActivity.L0, signInHubActivity.M0);
        signInHubActivity.finish();
        this.b = true;
    }

    public final String toString() {
        return this.a.toString();
    }
}
