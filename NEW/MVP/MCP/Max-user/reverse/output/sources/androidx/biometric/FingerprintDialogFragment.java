package androidx.biometric;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.b;
import defpackage.c3d;
import defpackage.g1d;
import defpackage.ggh;
import defpackage.j8a;
import defpackage.jkc;
import defpackage.ko0;
import defpackage.kyc;
import defpackage.qc;
import defpackage.sti;
import defpackage.uc;
import defpackage.ue;
import defpackage.vc;
import defpackage.vid;
import defpackage.vz5;
import defpackage.xz5;
import defpackage.zid;

/* loaded from: classes.dex */
public class FingerprintDialogFragment extends DialogFragment {
    public BiometricViewModel A1;
    public int B1;
    public int C1;
    public ImageView D1;
    public TextView E1;
    public final Handler y1 = new Handler(Looper.getMainLooper());
    public final ue z1 = new ue(19, this);

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.a
    public final void M(Bundle bundle) {
        super.M(bundle);
        b bVarT = t();
        if (bVarT != null) {
            BiometricViewModel biometricViewModel = (BiometricViewModel) new zid((ggh) bVarT).i(vid.a(BiometricViewModel.class));
            this.A1 = biometricViewModel;
            if (biometricViewModel.w == null) {
                biometricViewModel.w = new j8a();
            }
            biometricViewModel.w.e(this, new vz5(this, 0));
            BiometricViewModel biometricViewModel2 = this.A1;
            if (biometricViewModel2.x == null) {
                biometricViewModel2.x = new j8a();
            }
            biometricViewModel2.x.e(this, new vz5(this, 1));
        }
        this.B1 = y0(xz5.a());
        this.C1 = y0(R.attr.textColorSecondary);
    }

    @Override // androidx.fragment.app.a
    public final void X() {
        this.Q0 = true;
        this.y1.removeCallbacksAndMessages(null);
    }

    @Override // androidx.fragment.app.a
    public final void a0() {
        this.Q0 = true;
        BiometricViewModel biometricViewModel = this.A1;
        biometricViewModel.v = 0;
        biometricViewModel.h(1);
        this.A1.g(y(c3d.fingerprint_dialog_touch_sensor));
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        BiometricViewModel biometricViewModel = this.A1;
        if (biometricViewModel.u == null) {
            biometricViewModel.u = new j8a();
        }
        BiometricViewModel.j(biometricViewModel.u, Boolean.TRUE);
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog v0() {
        uc ucVar = new uc(k0());
        jkc jkcVar = this.A1.c;
        CharSequence charSequenceY = null;
        ucVar.setTitle(jkcVar != null ? (CharSequence) jkcVar.a : null);
        View viewInflate = LayoutInflater.from(ucVar.getContext()).inflate(g1d.fingerprint_dialog_layout, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(kyc.fingerprint_subtitle);
        if (textView != null) {
            this.A1.getClass();
            if (TextUtils.isEmpty(null)) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
                textView.setText((CharSequence) null);
            }
        }
        TextView textView2 = (TextView) viewInflate.findViewById(kyc.fingerprint_description);
        if (textView2 != null) {
            jkc jkcVar2 = this.A1.c;
            CharSequence charSequence = jkcVar2 != null ? (CharSequence) jkcVar2.b : null;
            if (TextUtils.isEmpty(charSequence)) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
                textView2.setText(charSequence);
            }
        }
        this.D1 = (ImageView) viewInflate.findViewById(kyc.fingerprint_icon);
        this.E1 = (TextView) viewInflate.findViewById(kyc.fingerprint_error);
        if (sti.b(this.A1.e())) {
            charSequenceY = y(c3d.confirm_device_credential_password);
        } else {
            BiometricViewModel biometricViewModel = this.A1;
            String str = biometricViewModel.h;
            if (str != null) {
                charSequenceY = str;
            } else {
                jkc jkcVar3 = biometricViewModel.c;
                if (jkcVar3 != null && (charSequenceY = (CharSequence) jkcVar3.c) == null) {
                    charSequenceY = "";
                }
            }
        }
        ko0 ko0Var = new ko0(this);
        qc qcVar = ucVar.a;
        qcVar.i = charSequenceY;
        qcVar.j = ko0Var;
        ucVar.setView(viewInflate);
        vc vcVarCreate = ucVar.create();
        vcVarCreate.setCanceledOnTouchOutside(false);
        return vcVarCreate;
    }

    public final int y0(int i) throws Resources.NotFoundException {
        Context contextV = v();
        b bVarT = t();
        if (contextV == null || bVarT == null) {
            Log.w("FingerprintFragment", "Unable to get themed color. Context or activity is null.");
            return 0;
        }
        TypedValue typedValue = new TypedValue();
        contextV.getTheme().resolveAttribute(i, typedValue, true);
        TypedArray typedArrayObtainStyledAttributes = bVarT.obtainStyledAttributes(typedValue.data, new int[]{i});
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        return color;
    }
}
