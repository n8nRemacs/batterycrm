package defpackage;

import android.os.Build;
import android.util.Log;
import androidx.biometric.BiometricFragment;
import androidx.biometric.BiometricViewModel;
import androidx.fragment.app.b;

/* loaded from: classes.dex */
public final class ho0 {
    public ti6 a;

    public final void a(jkc jkcVar, go0 go0Var) {
        ti6 ti6Var = this.a;
        if (ti6Var == null) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Client fragment manager was null.");
            return;
        }
        if (ti6Var.P()) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Called after onSaveInstanceState().");
            return;
        }
        ti6 ti6Var2 = this.a;
        BiometricFragment biometricFragment = (BiometricFragment) ti6Var2.D("androidx.biometric.BiometricFragment");
        if (biometricFragment == null) {
            biometricFragment = new BiometricFragment();
            ue0 ue0Var = new ue0(ti6Var2);
            ue0Var.f(0, biometricFragment, "androidx.biometric.BiometricFragment", 1);
            ue0Var.d(true);
            ti6Var2.z(true);
            ti6Var2.E();
        }
        b bVarT = biometricFragment.t();
        if (bVarT == null) {
            Log.e("BiometricFragment", "Not launching prompt. Client activity was null.");
            return;
        }
        BiometricViewModel biometricViewModel = biometricFragment.j1;
        biometricViewModel.c = jkcVar;
        if (Build.VERSION.SDK_INT >= 30 || go0Var != null) {
            biometricViewModel.d = go0Var;
        } else {
            biometricViewModel.d = n7j.f();
        }
        if (biometricFragment.v0()) {
            biometricFragment.j1.h = biometricFragment.y(c3d.confirm_device_credential_password);
        } else {
            biometricFragment.j1.h = null;
        }
        if (biometricFragment.v0() && new jdc(new ukd(bVarT)).e(255) != 0) {
            biometricFragment.j1.k = true;
            biometricFragment.x0();
        } else if (biometricFragment.j1.m) {
            biometricFragment.i1.postDelayed(new co0(biometricFragment), 600L);
        } else {
            biometricFragment.C0();
        }
    }
}
