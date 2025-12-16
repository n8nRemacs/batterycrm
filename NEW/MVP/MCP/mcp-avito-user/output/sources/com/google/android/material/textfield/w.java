package com.google.android.material.textfield;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.R;
import j.InterfaceC42165v;
import j.N;
import j.P;
import j.e0;

/* compiled from: PasswordToggleEndIconDelegate.java */
/* loaded from: classes6.dex */
class w extends q {

    /* renamed from: e, reason: collision with root package name */
    public final int f357556e;

    /* renamed from: f, reason: collision with root package name */
    @P
    public EditText f357557f;

    /* renamed from: g, reason: collision with root package name */
    public final a f357558g;

    public w(@N p pVar, @InterfaceC42165v int i12) {
        super(pVar);
        this.f357556e = R.drawable.design_password_eye;
        this.f357558g = new a(this, 2);
        if (i12 != 0) {
            this.f357556e = i12;
        }
    }

    @Override // com.google.android.material.textfield.q
    public final void b() {
        q();
    }

    @Override // com.google.android.material.textfield.q
    @e0
    public final int c() {
        return R.string.password_toggle_content_description;
    }

    @Override // com.google.android.material.textfield.q
    @InterfaceC42165v
    public final int d() {
        return this.f357556e;
    }

    @Override // com.google.android.material.textfield.q
    public final View.OnClickListener f() {
        return this.f357558g;
    }

    @Override // com.google.android.material.textfield.q
    public final boolean k() {
        return true;
    }

    @Override // com.google.android.material.textfield.q
    public final boolean l() {
        EditText editText = this.f357557f;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    @Override // com.google.android.material.textfield.q
    public final void m(@P EditText editText) {
        this.f357557f = editText;
        q();
    }

    @Override // com.google.android.material.textfield.q
    public final void r() {
        EditText editText = this.f357557f;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.f357557f.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // com.google.android.material.textfield.q
    public final void s() {
        EditText editText = this.f357557f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
