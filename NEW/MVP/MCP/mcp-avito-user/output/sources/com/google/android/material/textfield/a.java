package com.google.android.material.textfield;

import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f357441b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f357442c;

    public /* synthetic */ a(q qVar, int i12) {
        this.f357441b = i12;
        this.f357442c = qVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f357441b) {
            case 0:
                g gVar = (g) this.f357442c;
                EditText editText = gVar.f357455i;
                if (editText != null) {
                    Editable text = editText.getText();
                    if (text != null) {
                        text.clear();
                    }
                    gVar.q();
                    break;
                }
                break;
            case 1:
                ((n) this.f357442c).u();
                break;
            default:
                w wVar = (w) this.f357442c;
                EditText editText2 = wVar.f357557f;
                if (editText2 != null) {
                    int selectionEnd = editText2.getSelectionEnd();
                    EditText editText3 = wVar.f357557f;
                    if (editText3 == null || !(editText3.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                        wVar.f357557f.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    } else {
                        wVar.f357557f.setTransformationMethod(null);
                    }
                    if (selectionEnd >= 0) {
                        wVar.f357557f.setSelection(selectionEnd);
                    }
                    wVar.q();
                    break;
                }
                break;
        }
    }
}
