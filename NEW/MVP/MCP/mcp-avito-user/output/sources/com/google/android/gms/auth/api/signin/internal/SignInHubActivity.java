package com.google.android.gms.auth.api.signin.internal;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.view.accessibility.AccessibilityEvent;
import androidx.fragment.app.ActivityC22955m;
import com.avito.android.remote.model.Navigation;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import j.N;
import j.P;

/* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
@KeepName
/* loaded from: classes6.dex */
public class SignInHubActivity extends ActivityC22955m {

    /* renamed from: g, reason: collision with root package name */
    public static boolean f348771g = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f348772b = false;

    /* renamed from: c, reason: collision with root package name */
    public SignInConfiguration f348773c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f348774d;

    /* renamed from: e, reason: collision with root package name */
    public int f348775e;

    /* renamed from: f, reason: collision with root package name */
    public Intent f348776f;

    public final void H1(int i12) {
        Status status = new Status(i12, null, null, null);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        f348771g = false;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(@N AccessibilityEvent accessibilityEvent) {
        return true;
    }

    @Override // androidx.fragment.app.ActivityC22955m, androidx.view.n, android.app.Activity
    public final void onActivityResult(int i12, int i13, @P Intent intent) {
        GoogleSignInAccount googleSignInAccount;
        if (this.f348772b) {
            return;
        }
        setResult(0);
        if (i12 != 40962) {
            return;
        }
        if (intent != null) {
            SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra("signInAccount");
            if (signInAccount != null && (googleSignInAccount = signInAccount.f348760c) != null) {
                q qVarA = q.a(this);
                GoogleSignInOptions googleSignInOptions = this.f348773c.f348770c;
                synchronized (qVarA) {
                    qVarA.f348793a.d(googleSignInAccount, googleSignInOptions);
                }
                intent.removeExtra("signInAccount");
                intent.putExtra("googleSignInAccount", googleSignInAccount);
                this.f348774d = true;
                this.f348775e = i13;
                this.f348776f = intent;
                getSupportLoaderManager().c(new z(this, null));
                f348771g = false;
                return;
            }
            if (intent.hasExtra("errorCode")) {
                int intExtra = intent.getIntExtra("errorCode", 8);
                if (intExtra == 13) {
                    intExtra = 12501;
                }
                H1(intExtra);
                return;
            }
        }
        H1(8);
    }

    @Override // androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@P Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        if (action == null) {
            H1(12500);
            return;
        }
        if (action.equals("com.google.android.gms.auth.NO_IMPL")) {
            H1(12500);
            return;
        }
        if (!action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") && !action.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            "Unknown action: ".concat(String.valueOf(intent.getAction()));
            finish();
            return;
        }
        Bundle bundleExtra = intent.getBundleExtra(Navigation.CONFIG);
        if (bundleExtra == null) {
            setResult(0);
            finish();
            return;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) bundleExtra.getParcelable(Navigation.CONFIG);
        if (signInConfiguration == null) {
            setResult(0);
            finish();
            return;
        }
        this.f348773c = signInConfiguration;
        if (bundle != null) {
            boolean z12 = bundle.getBoolean("signingInGoogleApiClients");
            this.f348774d = z12;
            if (z12) {
                this.f348775e = bundle.getInt("signInResultCode");
                Intent intent2 = (Intent) bundle.getParcelable("signInResultData");
                if (intent2 == null) {
                    setResult(0);
                    finish();
                    return;
                } else {
                    this.f348776f = intent2;
                    getSupportLoaderManager().c(new z(this, null));
                    f348771g = false;
                    return;
                }
            }
            return;
        }
        if (f348771g) {
            setResult(0);
            H1(12502);
            return;
        }
        f348771g = true;
        Intent intent3 = new Intent(action);
        if (action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) {
            intent3.setPackage("com.google.android.gms");
        } else {
            intent3.setPackage(getPackageName());
        }
        intent3.putExtra(Navigation.CONFIG, this.f348773c);
        try {
            startActivityForResult(intent3, 40962);
        } catch (ActivityNotFoundException unused) {
            this.f348772b = true;
            H1(17);
        }
    }

    @Override // androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        f348771g = false;
    }

    @Override // androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onSaveInstanceState(@N Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.f348774d);
        if (this.f348774d) {
            bundle.putInt("signInResultCode", this.f348775e);
            bundle.putParcelable("signInResultData", this.f348776f);
        }
    }
}
