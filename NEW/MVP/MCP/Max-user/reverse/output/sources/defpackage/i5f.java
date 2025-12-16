package defpackage;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class i5f implements TextWatcher {
    public final /* synthetic */ j5f a;
    public final /* synthetic */ int b;

    public i5f(j5f j5fVar, int i) {
        this.a = j5fVar;
        this.b = i;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        iq3 iq3Var;
        lm7 lm7VarH0;
        fm7 fm7Var = this.a.F0;
        boolean z = false;
        int length = charSequence != null ? charSequence.length() : 0;
        String string = charSequence != null ? charSequence.subSequence(i, i3 + i).toString() : null;
        String strI = "";
        if (string == null) {
            string = "";
        }
        int i4 = this.b;
        if (length == 2 && string.length() == 1) {
            mq3 mq3Var = (mq3) fm7Var;
            if (i4 < 0) {
                mq3Var.getClass();
            } else if (i4 <= mq3Var.getCountCells()) {
                z = true;
            }
            if (z && string.length() == 1) {
                lm7 lm7VarH02 = mq3Var.H0(i4);
                if (lm7VarH02 != null) {
                    ((j5f) lm7VarH02).A(string);
                }
                lm7 lm7VarH03 = mq3Var.H0(i4 + 1);
                if (lm7VarH03 != null) {
                    ((j5f) lm7VarH03).G0.requestFocus();
                    return;
                }
                return;
            }
            return;
        }
        if (length > 1) {
            ((mq3) fm7Var).I0(i4, String.valueOf(charSequence));
            return;
        }
        String strValueOf = String.valueOf(charSequence);
        mq3 mq3Var2 = (mq3) fm7Var;
        if (i4 < 0) {
            mq3Var2.getClass();
        } else if (i4 <= mq3Var2.getCountCells()) {
            z = true;
        }
        if (z && strValueOf.length() == 1) {
            if (i4 < mq3Var2.getCountCells() - 1 && (lm7VarH0 = mq3Var2.H0(i4 + 1)) != null) {
                ((j5f) lm7VarH0).G0.requestFocus();
            }
            Iterator it = mq3.G0(mq3Var2).iterator();
            while (it.hasNext()) {
                strI = az1.i(strI, ((j5f) ((lm7) it.next())).z());
            }
            if (strI.length() <= 0 || strI.length() != mq3Var2.getCountCells() || !TextUtils.isDigitsOnly(strI) || (iq3Var = mq3Var2.V1) == null) {
                return;
            }
            iq3Var.a(strI);
        }
    }
}
