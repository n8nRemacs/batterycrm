package defpackage;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class gc5 extends haj {
    public final TextView a;
    public final kb5 b;
    public boolean c = true;

    public gc5(TextView textView) {
        this.a = textView;
        this.b = new kb5(textView);
    }

    @Override // defpackage.haj
    public final InputFilter[] b(InputFilter[] inputFilterArr) {
        if (!this.c) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i = 0; i < inputFilterArr.length; i++) {
                InputFilter inputFilter = inputFilterArr[i];
                if (inputFilter instanceof kb5) {
                    sparseArray.put(i, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                if (sparseArray.indexOfKey(i3) < 0) {
                    inputFilterArr2[i2] = inputFilterArr[i3];
                    i2++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int i4 = 0;
        while (true) {
            kb5 kb5Var = this.b;
            if (i4 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = kb5Var;
                return inputFilterArr3;
            }
            if (inputFilterArr[i4] == kb5Var) {
                return inputFilterArr;
            }
            i4++;
        }
    }

    @Override // defpackage.haj
    public final boolean f() {
        return this.c;
    }

    @Override // defpackage.haj
    public final void g(boolean z) {
        if (z) {
            TextView textView = this.a;
            textView.setTransformationMethod(i(textView.getTransformationMethod()));
        }
    }

    @Override // defpackage.haj
    public final void h(boolean z) {
        this.c = z;
        TextView textView = this.a;
        textView.setTransformationMethod(i(textView.getTransformationMethod()));
        textView.setFilters(b(textView.getFilters()));
    }

    @Override // defpackage.haj
    public final TransformationMethod i(TransformationMethod transformationMethod) {
        return this.c ? ((transformationMethod instanceof lc5) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new lc5(transformationMethod) : transformationMethod instanceof lc5 ? ((lc5) transformationMethod).a : transformationMethod;
    }
}
