package com.google.android.material.datepicker;

import android.app.DatePickerDialog;
import android.os.Bundle;
import androidx.annotation.RestrictTo;
import pY0.ViewOnTouchListenerC47033a;

/* compiled from: MaterialStyledDatePickerDialog.java */
@RestrictTo
/* loaded from: classes6.dex */
public class t extends DatePickerDialog {
    @Override // android.app.AlertDialog, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setBackgroundDrawable(null);
        getWindow().getDecorView().setOnTouchListener(new ViewOnTouchListenerC47033a(this, null));
    }
}
