package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.annotation.RestrictTo;
import com.google.android.material.R;
import com.google.android.material.internal.C37075p;
import com.google.android.material.textfield.TextInputLayout;
import j.N;
import j.P;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;

@RestrictTo
/* loaded from: classes6.dex */
public class SingleDateSelector implements DateSelector<Long> {
    public static final Parcelable.Creator<SingleDateSelector> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @P
    public CharSequence f356505b;

    /* renamed from: c, reason: collision with root package name */
    @P
    public Long f356506c;

    public class a implements Parcelable.Creator<SingleDateSelector> {
        @Override // android.os.Parcelable.Creator
        @N
        public final SingleDateSelector createFromParcel(@N Parcel parcel) {
            SingleDateSelector singleDateSelector = new SingleDateSelector();
            singleDateSelector.f356506c = (Long) parcel.readValue(Long.class.getClassLoader());
            return singleDateSelector;
        }

        @Override // android.os.Parcelable.Creator
        @N
        public final SingleDateSelector[] newArray(int i12) {
            return new SingleDateSelector[i12];
        }
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final boolean C4() {
        return this.f356506c != null;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @P
    public final Long E4() {
        return this.f356506c;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final int K0(Context context) {
        return com.google.android.material.resources.b.c(context, R.attr.materialCalendarTheme, MaterialDatePicker.class.getCanonicalName()).data;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @N
    public final String K2(@N Context context) {
        Resources resources = context.getResources();
        Long l12 = this.f356506c;
        if (l12 == null) {
            return resources.getString(R.string.mtrl_picker_date_header_unselected);
        }
        return resources.getString(R.string.mtrl_picker_date_header_selected, C37058f.d(l12.longValue(), Locale.getDefault()));
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final void M4(long j12) {
        this.f356506c = Long.valueOf(j12);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @P
    public final String getError() {
        if (TextUtils.isEmpty(this.f356505b)) {
            return null;
        }
        return this.f356505b.toString();
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @N
    public final String j2(@N Context context) {
        Resources resources = context.getResources();
        Long l12 = this.f356506c;
        return resources.getString(R.string.mtrl_picker_announce_current_selection, l12 == null ? resources.getString(R.string.mtrl_picker_announce_current_selection_none) : C37058f.d(l12.longValue(), Locale.getDefault()));
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final View q3(@N LayoutInflater layoutInflater, @P ViewGroup viewGroup, CalendarConstraints calendarConstraints, @N x xVar) throws Resources.NotFoundException {
        View viewInflate = layoutInflater.inflate(R.layout.mtrl_picker_text_input_date, viewGroup, false);
        TextInputLayout textInputLayout = (TextInputLayout) viewInflate.findViewById(R.id.mtrl_picker_text_input_date);
        textInputLayout.setErrorAccessibilityLiveRegion(0);
        EditText editText = textInputLayout.getEditText();
        if (C37075p.a()) {
            editText.setInputType(17);
        }
        SimpleDateFormat simpleDateFormatD = E.d();
        String strE = E.e(viewInflate.getResources(), simpleDateFormatD);
        textInputLayout.setPlaceholderText(strE);
        Long l12 = this.f356506c;
        if (l12 != null) {
            editText.setText(simpleDateFormatD.format(l12));
        }
        editText.addTextChangedListener(new A(this, strE, simpleDateFormatD, textInputLayout, calendarConstraints, xVar, textInputLayout));
        DateSelector.d3(editText);
        return viewInflate;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@N Parcel parcel, int i12) {
        parcel.writeValue(this.f356506c);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @N
    public final ArrayList y1() {
        ArrayList arrayList = new ArrayList();
        Long l12 = this.f356506c;
        if (l12 != null) {
            arrayList.add(l12);
        }
        return arrayList;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @N
    public final ArrayList z5() {
        return new ArrayList();
    }
}
