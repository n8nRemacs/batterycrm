package androidx.biometric;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.fragment.app.a;
import androidx.fragment.app.b;
import androidx.fragment.app.c;
import defpackage.c3d;
import defpackage.co0;
import defpackage.fo0;
import defpackage.ggh;
import defpackage.i5i;
import defpackage.j8a;
import defpackage.jkc;
import defpackage.k08;
import defpackage.mlb;
import defpackage.os0;
import defpackage.paj;
import defpackage.r42;
import defpackage.sti;
import defpackage.ue0;
import defpackage.uuc;
import defpackage.vid;
import defpackage.vn0;
import defpackage.wn0;
import defpackage.xn0;
import defpackage.zid;
import defpackage.zn6;

/* loaded from: classes.dex */
public class BiometricFragment extends a {
    public final Handler i1 = new Handler(Looper.getMainLooper());
    public BiometricViewModel j1;

    public final void A0(fo0 fo0Var) throws Resources.NotFoundException {
        BiometricViewModel biometricViewModel = this.j1;
        if (biometricViewModel.k) {
            biometricViewModel.k = false;
            new Handler(Looper.getMainLooper()).post(new zn6(this, fo0Var, false, 4));
        } else {
            Log.w("BiometricFragment", "Success not sent to client. Client is not awaiting a result.");
        }
        t0();
    }

    public final void B0(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = y(c3d.default_error_msg);
        }
        this.j1.h(2);
        this.j1.g(charSequence);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void C0() throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 630
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.biometric.BiometricFragment.C0():void");
    }

    @Override // androidx.fragment.app.a
    public final void J(int i, int i2, Intent intent) throws Resources.NotFoundException {
        super.J(i, i2, intent);
        if (i == 1) {
            this.j1.l = false;
            if (i2 == -1) {
                A0(new fo0(null, 1));
            } else {
                y0(10, y(c3d.generic_error_user_canceled));
            }
        }
    }

    @Override // androidx.fragment.app.a
    public final void M(Bundle bundle) {
        super.M(bundle);
        if (t() == null) {
            return;
        }
        BiometricViewModel biometricViewModel = (BiometricViewModel) new zid((ggh) t()).i(vid.a(BiometricViewModel.class));
        this.j1 = biometricViewModel;
        if (biometricViewModel.o == null) {
            biometricViewModel.o = new j8a();
        }
        biometricViewModel.o.e(this, new wn0(this, 0));
        BiometricViewModel biometricViewModel2 = this.j1;
        if (biometricViewModel2.p == null) {
            biometricViewModel2.p = new j8a();
        }
        biometricViewModel2.p.e(this, new wn0(this, 1));
        BiometricViewModel biometricViewModel3 = this.j1;
        if (biometricViewModel3.q == null) {
            biometricViewModel3.q = new j8a();
        }
        biometricViewModel3.q.e(this, new wn0(this, 2));
        BiometricViewModel biometricViewModel4 = this.j1;
        if (biometricViewModel4.r == null) {
            biometricViewModel4.r = new j8a();
        }
        biometricViewModel4.r.e(this, new wn0(this, 3));
        BiometricViewModel biometricViewModel5 = this.j1;
        if (biometricViewModel5.s == null) {
            biometricViewModel5.s = new j8a();
        }
        biometricViewModel5.s.e(this, new wn0(this, 4));
        BiometricViewModel biometricViewModel6 = this.j1;
        if (biometricViewModel6.u == null) {
            biometricViewModel6.u = new j8a();
        }
        biometricViewModel6.u.e(this, new wn0(this, 5));
    }

    @Override // androidx.fragment.app.a
    public final void c0() {
        this.Q0 = true;
        if (Build.VERSION.SDK_INT == 29 && sti.b(this.j1.e())) {
            BiometricViewModel biometricViewModel = this.j1;
            biometricViewModel.n = true;
            this.i1.postDelayed(new co0(biometricViewModel, 2), 250L);
        }
    }

    @Override // androidx.fragment.app.a
    public final void d0() {
        this.Q0 = true;
        if (Build.VERSION.SDK_INT >= 29 || this.j1.l) {
            return;
        }
        b bVarT = t();
        if (bVarT == null || !bVarT.isChangingConfigurations()) {
            s0(0);
        }
    }

    public final void s0(int i) {
        if (i == 3 || !this.j1.n) {
            if (w0()) {
                this.j1.i = i;
                if (i == 1) {
                    z0(10, paj.z(v(), 10));
                }
            }
            BiometricViewModel biometricViewModel = this.j1;
            if (biometricViewModel.f == null) {
                biometricViewModel.f = new i5i(10);
            }
            i5i i5iVar = biometricViewModel.f;
            CancellationSignal cancellationSignal = (CancellationSignal) i5iVar.a;
            if (cancellationSignal != null) {
                try {
                    r42.a(cancellationSignal);
                } catch (NullPointerException e) {
                    Log.e("CancelSignalProvider", "Got NPE while canceling biometric authentication.", e);
                }
                i5iVar.a = null;
            }
            os0 os0Var = (os0) i5iVar.b;
            if (os0Var != null) {
                try {
                    os0Var.b();
                } catch (NullPointerException e2) {
                    Log.e("CancelSignalProvider", "Got NPE while canceling fingerprint authentication.", e2);
                }
                i5iVar.b = null;
            }
        }
    }

    public final void t0() throws Resources.NotFoundException {
        this.j1.j = false;
        u0();
        if (!this.j1.l && F()) {
            ue0 ue0Var = new ue0(x());
            ue0Var.h(this);
            ue0Var.d(true);
        }
        Context contextV = v();
        if (contextV != null) {
            String str = Build.MODEL;
            if (Build.VERSION.SDK_INT != 29) {
                return;
            }
            int i = uuc.delay_showing_prompt_models;
            if (str == null) {
                return;
            }
            for (String str2 : contextV.getResources().getStringArray(i)) {
                if (str.equals(str2)) {
                    BiometricViewModel biometricViewModel = this.j1;
                    biometricViewModel.m = true;
                    this.i1.postDelayed(new co0(biometricViewModel, 1), 600L);
                    return;
                }
            }
        }
    }

    public final void u0() {
        this.j1.j = false;
        if (F()) {
            c cVarX = x();
            FingerprintDialogFragment fingerprintDialogFragment = (FingerprintDialogFragment) cVarX.D("androidx.biometric.FingerprintDialogFragment");
            if (fingerprintDialogFragment != null) {
                if (fingerprintDialogFragment.F()) {
                    fingerprintDialogFragment.s0();
                    return;
                }
                ue0 ue0Var = new ue0(cVarX);
                ue0Var.h(fingerprintDialogFragment);
                ue0Var.d(true);
            }
        }
    }

    public final boolean v0() {
        return Build.VERSION.SDK_INT <= 28 && sti.b(this.j1.e());
    }

    public final boolean w0() throws Resources.NotFoundException {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            b bVarT = t();
            if (bVarT != null && this.j1.d != null) {
                String str = Build.MANUFACTURER;
                String str2 = Build.MODEL;
                if (i == 28) {
                    int i2 = uuc.crypto_fingerprint_fallback_vendors;
                    if (str != null) {
                        for (String str3 : bVarT.getResources().getStringArray(i2)) {
                            if (str.equalsIgnoreCase(str3)) {
                                break;
                            }
                        }
                    }
                    int i3 = uuc.crypto_fingerprint_fallback_prefixes;
                    String str4 = Build.MODEL;
                    if (str4 != null) {
                        for (String str5 : bVarT.getResources().getStringArray(i3)) {
                            if (!str4.startsWith(str5)) {
                            }
                        }
                    }
                }
            }
            if (Build.VERSION.SDK_INT != 28) {
                return false;
            }
            Context contextV = v();
            return contextV == null || contextV.getPackageManager() == null || !mlb.a(contextV.getPackageManager());
        }
        return true;
    }

    public final void x0() {
        b bVarT = t();
        if (bVarT == null) {
            Log.e("BiometricFragment", "Failed to check device credential. Client FragmentActivity not found.");
            return;
        }
        KeyguardManager keyguardManagerA = k08.a(bVarT);
        if (keyguardManagerA == null) {
            y0(12, y(c3d.generic_error_no_keyguard));
            return;
        }
        BiometricViewModel biometricViewModel = this.j1;
        jkc jkcVar = biometricViewModel.c;
        CharSequence charSequence = jkcVar != null ? (CharSequence) jkcVar.a : null;
        biometricViewModel.getClass();
        jkc jkcVar2 = this.j1.c;
        Intent intentA = xn0.a(keyguardManagerA, charSequence, jkcVar2 != null ? (CharSequence) jkcVar2.b : null);
        if (intentA == null) {
            y0(14, y(c3d.generic_error_no_device_credential));
            return;
        }
        this.j1.l = true;
        if (w0()) {
            u0();
        }
        intentA.setFlags(134742016);
        r0(intentA, 1, null);
    }

    public final void y0(int i, CharSequence charSequence) {
        z0(i, charSequence);
        t0();
    }

    public final void z0(int i, CharSequence charSequence) {
        BiometricViewModel biometricViewModel = this.j1;
        if (biometricViewModel.l) {
            Log.v("BiometricFragment", "Error not sent to client. User is confirming their device credential.");
        } else if (!biometricViewModel.k) {
            Log.w("BiometricFragment", "Error not sent to client. Client is not awaiting a result.");
        } else {
            biometricViewModel.k = false;
            new Handler(Looper.getMainLooper()).post(new vn0(this, i, charSequence));
        }
    }
}
