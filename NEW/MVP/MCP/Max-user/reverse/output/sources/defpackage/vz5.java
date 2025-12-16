package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import androidx.biometric.FingerprintDialogFragment;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.c;

/* loaded from: classes.dex */
public final class vz5 implements wta {
    public final /* synthetic */ int a;
    public final /* synthetic */ DialogFragment b;

    public /* synthetic */ vz5(DialogFragment dialogFragment, int i) {
        this.a = i;
        this.b = dialogFragment;
    }

    @Override // defpackage.wta
    public final void a(Object obj) {
        int i;
        switch (this.a) {
            case 0:
                Integer num = (Integer) obj;
                FingerprintDialogFragment fingerprintDialogFragment = (FingerprintDialogFragment) this.b;
                Handler handler = fingerprintDialogFragment.y1;
                ue ueVar = fingerprintDialogFragment.z1;
                handler.removeCallbacks(ueVar);
                int iIntValue = num.intValue();
                if (fingerprintDialogFragment.D1 != null) {
                    int i2 = fingerprintDialogFragment.A1.v;
                    Context contextV = fingerprintDialogFragment.v();
                    Drawable drawableB = null;
                    if (contextV == null) {
                        Log.w("FingerprintFragment", "Unable to get asset. Context is null.");
                    } else {
                        if (i2 == 0 && iIntValue == 1) {
                            i = dxc.fingerprint_dialog_fp_icon;
                        } else if (i2 == 1 && iIntValue == 2) {
                            i = dxc.fingerprint_dialog_error;
                        } else if (i2 == 2 && iIntValue == 1) {
                            i = dxc.fingerprint_dialog_fp_icon;
                        } else if (i2 == 1 && iIntValue == 3) {
                            i = dxc.fingerprint_dialog_fp_icon;
                        }
                        drawableB = r34.b(contextV, i);
                    }
                    if (drawableB != null) {
                        fingerprintDialogFragment.D1.setImageDrawable(drawableB);
                        if ((i2 != 0 || iIntValue != 1) && ((i2 == 1 && iIntValue == 2) || (i2 == 2 && iIntValue == 1))) {
                            wz5.a(drawableB);
                        }
                        fingerprintDialogFragment.A1.v = iIntValue;
                    }
                }
                int iIntValue2 = num.intValue();
                TextView textView = fingerprintDialogFragment.E1;
                if (textView != null) {
                    textView.setTextColor(iIntValue2 == 2 ? fingerprintDialogFragment.B1 : fingerprintDialogFragment.C1);
                }
                handler.postDelayed(ueVar, 2000L);
                return;
            case 1:
                CharSequence charSequence = (CharSequence) obj;
                FingerprintDialogFragment fingerprintDialogFragment2 = (FingerprintDialogFragment) this.b;
                Handler handler2 = fingerprintDialogFragment2.y1;
                ue ueVar2 = fingerprintDialogFragment2.z1;
                handler2.removeCallbacks(ueVar2);
                TextView textView2 = fingerprintDialogFragment2.E1;
                if (textView2 != null) {
                    textView2.setText(charSequence);
                }
                handler2.postDelayed(ueVar2, 2000L);
                return;
            default:
                if (((j48) obj) != null) {
                    DialogFragment dialogFragment = this.b;
                    if (dialogFragment.p1) {
                        View viewL0 = dialogFragment.l0();
                        if (viewL0.getParent() != null) {
                            throw new IllegalStateException("DialogFragment can not be attached to a container view");
                        }
                        if (dialogFragment.t1 != null) {
                            if (c.K(3)) {
                                Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + dialogFragment.t1);
                            }
                            dialogFragment.t1.setContentView(viewL0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
