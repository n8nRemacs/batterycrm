package defpackage;

import android.content.res.Resources;
import androidx.biometric.BiometricFragment;
import androidx.biometric.BiometricViewModel;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class co0 implements Runnable {
    public final /* synthetic */ int a;
    public final WeakReference b;

    public co0(BiometricFragment biometricFragment) {
        this.a = 0;
        this.b = new WeakReference(biometricFragment);
    }

    @Override // java.lang.Runnable
    public final void run() throws Resources.NotFoundException {
        switch (this.a) {
            case 0:
                WeakReference weakReference = this.b;
                if (weakReference.get() != null) {
                    ((BiometricFragment) weakReference.get()).C0();
                    break;
                }
                break;
            case 1:
                WeakReference weakReference2 = this.b;
                if (weakReference2.get() != null) {
                    ((BiometricViewModel) weakReference2.get()).m = false;
                    break;
                }
                break;
            default:
                WeakReference weakReference3 = this.b;
                if (weakReference3.get() != null) {
                    ((BiometricViewModel) weakReference3.get()).n = false;
                    break;
                }
                break;
        }
    }

    public co0(BiometricViewModel biometricViewModel, int i) {
        this.a = i;
        switch (i) {
            case 2:
                this.b = new WeakReference(biometricViewModel);
                break;
            default:
                this.b = new WeakReference(biometricViewModel);
                break;
        }
    }
}
