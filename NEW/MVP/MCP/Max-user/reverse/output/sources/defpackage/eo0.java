package defpackage;

import android.hardware.biometrics.BiometricManager;

/* loaded from: classes.dex */
public abstract class eo0 {
    public static int a(BiometricManager biometricManager, int i) {
        return biometricManager.canAuthenticate(i);
    }
}
