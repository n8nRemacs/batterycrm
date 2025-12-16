package com.google.android.material.timepicker;

import android.text.Editable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/* compiled from: TimePickerTextInputKeyController.java */
/* loaded from: classes6.dex */
class j implements TextView.OnEditorActionListener, View.OnKeyListener {

    /* renamed from: b, reason: collision with root package name */
    public final ChipTextInputComboView f357676b;

    /* renamed from: c, reason: collision with root package name */
    public final ChipTextInputComboView f357677c;

    /* renamed from: d, reason: collision with root package name */
    public final TimeModel f357678d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f357679e = false;

    public j(ChipTextInputComboView chipTextInputComboView, ChipTextInputComboView chipTextInputComboView2, TimeModel timeModel) {
        this.f357676b = chipTextInputComboView;
        this.f357677c = chipTextInputComboView2;
        this.f357678d = timeModel;
    }

    public final void a(int i12) {
        this.f357677c.setChecked(i12 == 12);
        this.f357676b.setChecked(i12 == 10);
        this.f357678d.f357645g = i12;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i12, KeyEvent keyEvent) {
        boolean z12 = i12 == 5;
        if (z12) {
            a(12);
        }
        return z12;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i12, KeyEvent keyEvent) {
        if (this.f357679e) {
            return false;
        }
        boolean z12 = true;
        this.f357679e = true;
        EditText editText = (EditText) view;
        if (this.f357678d.f357645g != 12) {
            Editable text = editText.getText();
            if (text == null) {
                z12 = false;
            } else if (i12 >= 7 && i12 <= 16 && keyEvent.getAction() == 1 && editText.getSelectionStart() == 2 && text.length() == 2) {
                a(12);
            } else {
                if (editText.getSelectionStart() == 0 && editText.length() == 2) {
                    editText.getText().clear();
                }
                z12 = false;
            }
        } else if (i12 == 67 && keyEvent.getAction() == 0 && TextUtils.isEmpty(editText.getText())) {
            a(10);
        } else {
            if (editText.getSelectionStart() == 0 && editText.length() == 2) {
                editText.getText().clear();
            }
            z12 = false;
        }
        this.f357679e = false;
        return z12;
    }
}
