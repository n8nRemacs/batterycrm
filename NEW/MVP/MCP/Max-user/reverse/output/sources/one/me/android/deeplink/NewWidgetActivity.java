package one.me.android.deeplink;

import android.content.Intent;
import android.os.Bundle;
import defpackage.czi;
import defpackage.d6;
import defpackage.da1;
import defpackage.f5j;
import defpackage.f82;
import defpackage.j8j;
import defpackage.ksd;
import defpackage.l3b;
import defpackage.l85;
import defpackage.t1b;
import defpackage.wxc;
import defpackage.yq9;
import defpackage.ytd;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lone/me/android/deeplink/NewWidgetActivity;", "Ld6;", "Lksd;", "<init>", "()V", "oneme_playGoogleRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NewWidgetActivity extends d6 implements ksd {
    public static final /* synthetic */ int T0 = 0;
    public ytd S0;

    @Override // defpackage.d6
    public final String G() {
        return null;
    }

    @Override // defpackage.d6
    public final void I() {
    }

    @Override // defpackage.d6
    public final boolean M() {
        return true;
    }

    @Override // defpackage.ksd
    public final ytd k() {
        ytd ytdVar = this.S0;
        if (ytdVar != null) {
            return ytdVar;
        }
        return null;
    }

    @Override // defpackage.ksd
    /* renamed from: m */
    public final boolean getT0() {
        return false;
    }

    @Override // defpackage.d6, androidx.fragment.app.b, defpackage.nl3, android.app.Activity
    public final void onCreate(Bundle bundle) {
        f82 f82VarA = czi.a(this);
        f82VarA.setId(wxc.root);
        setContentView(f82VarA);
        l85.a(this);
        super.onCreate(bundle);
        ytd ytdVarA = f5j.a(this, f82VarA, bundle);
        ytdVarA.e = 1;
        ytdVarA.R(false);
        this.S0 = ytdVarA;
        yq9 yq9Var = new yq9(5);
        t1b.a.k().g(new da1(this, j8j.c(this), yq9Var, 15));
        j8j.f(this, null);
    }

    @Override // defpackage.d6, defpackage.nl3, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        j8j.a(j8j.c(this), intent);
        t1b.a.k().g(new l3b(this, 21, intent));
        j8j.f(this, intent);
    }
}
