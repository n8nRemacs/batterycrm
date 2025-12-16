package com.google.android.material.theme;

import AY0.a;
import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.app.B;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.C19953i;
import androidx.appcompat.widget.C19961m;
import androidx.appcompat.widget.E;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.textfield.u;
import j.N;
import j.P;
import xY0.C49898a;

/* loaded from: classes6.dex */
public class MaterialComponentsViewInflater extends B {
    @Override // androidx.appcompat.app.B
    @N
    public final C19953i a(@N Context context, @P AttributeSet attributeSet) {
        return new u(context, attributeSet);
    }

    @Override // androidx.appcompat.app.B
    @N
    public final C19961m b(@N Context context, @N AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // androidx.appcompat.app.B
    @N
    public final AppCompatCheckBox c(Context context, AttributeSet attributeSet) {
        return new MaterialCheckBox(context, attributeSet);
    }

    @Override // androidx.appcompat.app.B
    @N
    public final E d(Context context, AttributeSet attributeSet) {
        return new C49898a(context, attributeSet);
    }

    @Override // androidx.appcompat.app.B
    @N
    public final AppCompatTextView e(Context context, AttributeSet attributeSet) {
        return new a(context, attributeSet);
    }
}
