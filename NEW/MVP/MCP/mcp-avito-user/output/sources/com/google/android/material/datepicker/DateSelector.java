package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.annotation.RestrictTo;
import com.google.android.material.internal.O;
import j.N;
import j.P;
import j.f0;
import java.util.ArrayList;

@RestrictTo
/* loaded from: classes6.dex */
public interface DateSelector<S> extends Parcelable {
    static void d3(@N EditText... editTextArr) {
        if (editTextArr.length == 0) {
            return;
        }
        com.avito.android.advert.item.fmp.calculator.l lVar = new com.avito.android.advert.item.fmp.calculator.l(editTextArr, 20);
        for (EditText editText : editTextArr) {
            editText.setOnFocusChangeListener(lVar);
        }
        O.h(editTextArr[0]);
    }

    boolean C4();

    @P
    S E4();

    @f0
    int K0(Context context);

    @N
    String K2(Context context);

    void M4(long j12);

    @P
    String getError();

    @N
    String j2(@N Context context);

    @N
    View q3(@N LayoutInflater layoutInflater, @P ViewGroup viewGroup, @N CalendarConstraints calendarConstraints, @N x xVar);

    @N
    ArrayList y1();

    @N
    ArrayList z5();
}
