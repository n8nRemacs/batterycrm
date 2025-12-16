package defpackage;

import androidx.biometric.BiometricViewModel;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class jo0 extends g80 {
    public final WeakReference a;

    public jo0(BiometricViewModel biometricViewModel) {
        this.a = new WeakReference(biometricViewModel);
    }

    @Override // defpackage.g80
    public final void a(int i, CharSequence charSequence) {
        WeakReference weakReference = this.a;
        if (weakReference.get() == null || ((BiometricViewModel) weakReference.get()).l || !((BiometricViewModel) weakReference.get()).k) {
            return;
        }
        ((BiometricViewModel) weakReference.get()).f(new un0(i, charSequence));
    }

    @Override // defpackage.g80
    public final void b(fo0 fo0Var) {
        WeakReference weakReference = this.a;
        if (weakReference.get() == null || !((BiometricViewModel) weakReference.get()).k) {
            return;
        }
        int i = -1;
        if (fo0Var.b == -1) {
            go0 go0Var = fo0Var.a;
            int iE = ((BiometricViewModel) weakReference.get()).e();
            if ((iE & 32767) != 0 && !sti.b(iE)) {
                i = 2;
            }
            fo0Var = new fo0(go0Var, i);
        }
        BiometricViewModel biometricViewModel = (BiometricViewModel) weakReference.get();
        if (biometricViewModel.o == null) {
            biometricViewModel.o = new j8a();
        }
        BiometricViewModel.j(biometricViewModel.o, fo0Var);
    }
}
