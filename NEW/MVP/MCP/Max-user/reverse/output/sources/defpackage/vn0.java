package defpackage;

import androidx.biometric.BiometricFragment;
import androidx.biometric.BiometricViewModel;

/* loaded from: classes.dex */
public final class vn0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ BiometricFragment b;

    public /* synthetic */ vn0(BiometricFragment biometricFragment, int i) {
        this.a = i;
        this.b = biometricFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                BiometricViewModel biometricViewModel = this.b.j1;
                if (biometricViewModel.b == null) {
                    biometricViewModel.b = new io0();
                }
                biometricViewModel.b.b();
                break;
            case 1:
                BiometricViewModel biometricViewModel2 = this.b.j1;
                if (biometricViewModel2.b == null) {
                    biometricViewModel2.b = new io0();
                }
                biometricViewModel2.b.c();
                break;
            default:
                this.b.j1.t = false;
                break;
        }
    }

    public vn0(BiometricFragment biometricFragment, int i, CharSequence charSequence) {
        this.a = 0;
        this.b = biometricFragment;
    }
}
