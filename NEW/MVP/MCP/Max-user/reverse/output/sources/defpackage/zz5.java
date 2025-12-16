package defpackage;

import android.hardware.fingerprint.FingerprintManager;
import androidx.biometric.BiometricViewModel;
import java.lang.ref.WeakReference;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* loaded from: classes.dex */
public final class zz5 extends FingerprintManager.AuthenticationCallback {
    public final /* synthetic */ usd a;

    public zz5(usd usdVar) {
        this.a = usdVar;
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationError(int i, CharSequence charSequence) {
        ((jo0) ((jkc) this.a.b).c).a(i, charSequence);
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationFailed() {
        WeakReference weakReference = ((jo0) ((jkc) this.a.b).c).a;
        if (weakReference.get() == null || !((BiometricViewModel) weakReference.get()).k) {
            return;
        }
        BiometricViewModel biometricViewModel = (BiometricViewModel) weakReference.get();
        if (biometricViewModel.r == null) {
            biometricViewModel.r = new j8a();
        }
        BiometricViewModel.j(biometricViewModel.r, Boolean.TRUE);
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationHelp(int i, CharSequence charSequence) {
        WeakReference weakReference = ((jo0) ((jkc) this.a.b).c).a;
        if (weakReference.get() != null) {
            BiometricViewModel biometricViewModel = (BiometricViewModel) weakReference.get();
            if (biometricViewModel.q == null) {
                biometricViewModel.q = new j8a();
            }
            BiometricViewModel.j(biometricViewModel.q, charSequence);
        }
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
        b06 b06VarF = a06.f(a06.b(authenticationResult));
        usd usdVar = this.a;
        usdVar.getClass();
        go0 go0Var = null;
        if (b06VarF != null) {
            Cipher cipher = b06VarF.b;
            if (cipher != null) {
                go0Var = new go0(cipher);
            } else {
                Signature signature = b06VarF.a;
                if (signature != null) {
                    go0Var = new go0(signature);
                } else {
                    Mac mac = b06VarF.c;
                    if (mac != null) {
                        go0Var = new go0(mac);
                    }
                }
            }
        }
        ((jo0) ((jkc) usdVar.b).c).b(new fo0(go0Var, 2));
    }
}
