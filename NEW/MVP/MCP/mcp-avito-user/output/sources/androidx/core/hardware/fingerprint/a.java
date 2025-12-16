package androidx.core.hardware.fingerprint;

import android.hardware.fingerprint.FingerprintManager;
import androidx.core.hardware.fingerprint.b;

/* compiled from: FingerprintManagerCompat.java */
/* loaded from: classes.dex */
class a extends FingerprintManager.AuthenticationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b.AbstractC1732b f44786a;

    public a(b.AbstractC1732b abstractC1732b) {
        this.f44786a = abstractC1732b;
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationError(int i12, CharSequence charSequence) {
        this.f44786a.a(i12, charSequence);
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationFailed() {
        this.f44786a.b();
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationHelp(int i12, CharSequence charSequence) {
        this.f44786a.c(charSequence);
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
        FingerprintManager.CryptoObject cryptoObject = authenticationResult.getCryptoObject();
        b.d dVar = null;
        if (cryptoObject != null) {
            if (cryptoObject.getCipher() != null) {
                dVar = new b.d(cryptoObject.getCipher());
            } else if (cryptoObject.getSignature() != null) {
                dVar = new b.d(cryptoObject.getSignature());
            } else if (cryptoObject.getMac() != null) {
                dVar = new b.d(cryptoObject.getMac());
            }
        }
        this.f44786a.d(new b.c(dVar));
    }
}
