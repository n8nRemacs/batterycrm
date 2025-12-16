package defpackage;

import android.hardware.biometrics.BiometricPrompt;
import android.hardware.biometrics.BiometricPrompt$AuthenticationCallback;
import android.os.Build;
import android.security.identity.IdentityCredential;
import androidx.biometric.BiometricViewModel;
import java.lang.ref.WeakReference;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* loaded from: classes.dex */
public final class d80 extends BiometricPrompt$AuthenticationCallback {
    public final /* synthetic */ g80 a;

    public d80(g80 g80Var) {
        this.a = g80Var;
    }

    public void onAuthenticationError(int i, CharSequence charSequence) {
        this.a.a(i, charSequence);
    }

    public void onAuthenticationFailed() {
        WeakReference weakReference = ((jo0) this.a).a;
        if (weakReference.get() == null || !((BiometricViewModel) weakReference.get()).k) {
            return;
        }
        BiometricViewModel biometricViewModel = (BiometricViewModel) weakReference.get();
        if (biometricViewModel.r == null) {
            biometricViewModel.r = new j8a();
        }
        BiometricViewModel.j(biometricViewModel.r, Boolean.TRUE);
    }

    public void onAuthenticationHelp(int i, CharSequence charSequence) {
    }

    public void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
        BiometricPrompt.CryptoObject cryptoObject;
        IdentityCredential identityCredentialB;
        go0 go0Var = null;
        if (authenticationResult != null && (cryptoObject = authenticationResult.getCryptoObject()) != null) {
            Cipher cipherD = bb4.d(cryptoObject);
            if (cipherD != null) {
                go0Var = new go0(cipherD);
            } else {
                Signature signatureF = bb4.f(cryptoObject);
                if (signatureF != null) {
                    go0Var = new go0(signatureF);
                } else {
                    Mac macE = bb4.e(cryptoObject);
                    if (macE != null) {
                        go0Var = new go0(macE);
                    } else if (Build.VERSION.SDK_INT >= 30 && (identityCredentialB = cb4.b(cryptoObject)) != null) {
                        go0Var = new go0(identityCredentialB);
                    }
                }
            }
        }
        int i = Build.VERSION.SDK_INT;
        int iA = -1;
        if (i >= 30) {
            if (authenticationResult != null) {
                iA = f80.a(authenticationResult);
            }
        } else if (i != 29) {
            iA = 2;
        }
        this.a.b(new fo0(go0Var, iA));
    }
}
