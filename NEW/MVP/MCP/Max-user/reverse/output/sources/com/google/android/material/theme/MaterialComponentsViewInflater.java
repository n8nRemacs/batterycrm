package com.google.android.material.theme;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.button.MaterialButton;
import defpackage.d7g;
import defpackage.dr8;
import defpackage.dvc;
import defpackage.er8;
import defpackage.gti;
import defpackage.mn;
import defpackage.po;
import defpackage.rm3;
import defpackage.rq8;
import defpackage.uq8;
import defpackage.wp;
import defpackage.wsi;
import defpackage.z5d;
import defpackage.zp8;

/* loaded from: classes.dex */
public class MaterialComponentsViewInflater extends wp {
    @Override // defpackage.wp
    public final mn a(Context context, AttributeSet attributeSet) {
        return new zp8(context, attributeSet);
    }

    @Override // defpackage.wp
    public final AppCompatButton b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // defpackage.wp
    public final AppCompatCheckBox c(Context context, AttributeSet attributeSet) {
        return new rq8(context, attributeSet);
    }

    @Override // defpackage.wp
    public final po d(Context context, AttributeSet attributeSet) {
        int i = dvc.radioButtonStyle;
        int i2 = uq8.t0;
        uq8 uq8Var = new uq8(er8.a(context, attributeSet, i, i2), attributeSet, i);
        Context context2 = uq8Var.getContext();
        TypedArray typedArrayD = d7g.d(context2, attributeSet, z5d.MaterialRadioButton, i, i2, new int[0]);
        if (typedArrayD.hasValue(z5d.MaterialRadioButton_buttonTint)) {
            rm3.c(uq8Var, gti.c(context2, typedArrayD, z5d.MaterialRadioButton_buttonTint));
        }
        uq8Var.s0 = typedArrayD.getBoolean(z5d.MaterialRadioButton_useMaterialThemeColors, false);
        typedArrayD.recycle();
        return uq8Var;
    }

    @Override // defpackage.wp
    public final AppCompatTextView e(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        dr8 dr8Var = new dr8(er8.a(context, attributeSet, R.attr.textViewStyle, 0), attributeSet, R.attr.textViewStyle);
        Context context2 = dr8Var.getContext();
        if (wsi.f(dvc.textAppearanceLineHeightEnabled, context2, true)) {
            Resources.Theme theme = context2.getTheme();
            TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, z5d.MaterialTextView, R.attr.textViewStyle, 0);
            int[] iArr = {z5d.MaterialTextView_android_lineHeight, z5d.MaterialTextView_lineHeight};
            int iD = -1;
            for (int i = 0; i < 2 && iD < 0; i++) {
                iD = gti.d(context2, typedArrayObtainStyledAttributes, iArr[i], -1);
            }
            typedArrayObtainStyledAttributes.recycle();
            if (iD == -1) {
                TypedArray typedArrayObtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, z5d.MaterialTextView, R.attr.textViewStyle, 0);
                int resourceId = typedArrayObtainStyledAttributes2.getResourceId(z5d.MaterialTextView_android_textAppearance, -1);
                typedArrayObtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    TypedArray typedArrayObtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, z5d.MaterialTextAppearance);
                    Context context3 = dr8Var.getContext();
                    int[] iArr2 = {z5d.MaterialTextAppearance_android_lineHeight, z5d.MaterialTextAppearance_lineHeight};
                    int iD2 = -1;
                    for (int i2 = 0; i2 < 2 && iD2 < 0; i2++) {
                        iD2 = gti.d(context3, typedArrayObtainStyledAttributes3, iArr2[i2], -1);
                    }
                    typedArrayObtainStyledAttributes3.recycle();
                    if (iD2 >= 0) {
                        dr8Var.setLineHeight(iD2);
                    }
                }
            }
        }
        return dr8Var;
    }
}
