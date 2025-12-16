package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.annotation.RestrictTo;
import androidx.core.util.C22807v;
import com.google.android.material.R;
import com.google.android.material.internal.C37075p;
import com.google.android.material.textfield.TextInputLayout;
import j.N;
import j.P;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

@RestrictTo
/* loaded from: classes6.dex */
public class RangeDateSelector implements DateSelector<C22807v<Long, Long>> {
    public static final Parcelable.Creator<RangeDateSelector> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @P
    public CharSequence f356499b;

    /* renamed from: c, reason: collision with root package name */
    public String f356500c;

    /* renamed from: d, reason: collision with root package name */
    @P
    public Long f356501d = null;

    /* renamed from: e, reason: collision with root package name */
    @P
    public Long f356502e = null;

    /* renamed from: f, reason: collision with root package name */
    @P
    public Long f356503f = null;

    /* renamed from: g, reason: collision with root package name */
    @P
    public Long f356504g = null;

    public class a implements Parcelable.Creator<RangeDateSelector> {
        @Override // android.os.Parcelable.Creator
        @N
        public final RangeDateSelector createFromParcel(@N Parcel parcel) {
            RangeDateSelector rangeDateSelector = new RangeDateSelector();
            rangeDateSelector.f356501d = (Long) parcel.readValue(Long.class.getClassLoader());
            rangeDateSelector.f356502e = (Long) parcel.readValue(Long.class.getClassLoader());
            return rangeDateSelector;
        }

        @Override // android.os.Parcelable.Creator
        @N
        public final RangeDateSelector[] newArray(int i12) {
            return new RangeDateSelector[i12];
        }
    }

    public static void a(RangeDateSelector rangeDateSelector, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, x xVar) {
        Long l12 = rangeDateSelector.f356503f;
        if (l12 == null || rangeDateSelector.f356504g == null) {
            if (textInputLayout.getError() != null && rangeDateSelector.f356500c.contentEquals(textInputLayout.getError())) {
                textInputLayout.setError(null);
            }
            if (textInputLayout2.getError() != null && " ".contentEquals(textInputLayout2.getError())) {
                textInputLayout2.setError(null);
            }
            xVar.a();
        } else if (l12.longValue() <= rangeDateSelector.f356504g.longValue()) {
            Long l13 = rangeDateSelector.f356503f;
            rangeDateSelector.f356501d = l13;
            Long l14 = rangeDateSelector.f356504g;
            rangeDateSelector.f356502e = l14;
            xVar.b(new C22807v(l13, l14));
        } else {
            textInputLayout.setError(rangeDateSelector.f356500c);
            textInputLayout2.setError(" ");
            xVar.a();
        }
        if (!TextUtils.isEmpty(textInputLayout.getError())) {
            rangeDateSelector.f356499b = textInputLayout.getError();
        } else if (TextUtils.isEmpty(textInputLayout2.getError())) {
            rangeDateSelector.f356499b = null;
        } else {
            rangeDateSelector.f356499b = textInputLayout2.getError();
        }
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final boolean C4() {
        Long l12 = this.f356501d;
        return (l12 == null || this.f356502e == null || l12.longValue() > this.f356502e.longValue()) ? false : true;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @N
    public final C22807v<Long, Long> E4() {
        return new C22807v<>(this.f356501d, this.f356502e);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final int K0(@N Context context) {
        Resources resources = context.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        return com.google.android.material.resources.b.c(context, Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels) > resources.getDimensionPixelSize(R.dimen.mtrl_calendar_maximum_default_fullscreen_minor_axis) ? R.attr.materialCalendarTheme : R.attr.materialCalendarFullscreenTheme, MaterialDatePicker.class.getCanonicalName()).data;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @N
    public final String K2(@N Context context) {
        Resources resources = context.getResources();
        Long l12 = this.f356501d;
        if (l12 == null && this.f356502e == null) {
            return resources.getString(R.string.mtrl_picker_range_header_unselected);
        }
        Long l13 = this.f356502e;
        if (l13 == null) {
            return resources.getString(R.string.mtrl_picker_range_header_only_start_selected, C37058f.b(l12.longValue()));
        }
        if (l12 == null) {
            return resources.getString(R.string.mtrl_picker_range_header_only_end_selected, C37058f.b(l13.longValue()));
        }
        C22807v<String, String> c22807vA = C37058f.a(l12, l13);
        return resources.getString(R.string.mtrl_picker_range_header_selected, c22807vA.f44895a, c22807vA.f44896b);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final void M4(long j12) {
        Long l12 = this.f356501d;
        if (l12 == null) {
            this.f356501d = Long.valueOf(j12);
        } else if (this.f356502e == null && l12.longValue() <= j12) {
            this.f356502e = Long.valueOf(j12);
        } else {
            this.f356502e = null;
            this.f356501d = Long.valueOf(j12);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @P
    public final String getError() {
        if (TextUtils.isEmpty(this.f356499b)) {
            return null;
        }
        return this.f356499b.toString();
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @N
    public final String j2(@N Context context) {
        Resources resources = context.getResources();
        C22807v<String, String> c22807vA = C37058f.a(this.f356501d, this.f356502e);
        String str = c22807vA.f44895a;
        String string = str == null ? resources.getString(R.string.mtrl_picker_announce_current_selection_none) : str;
        String str2 = c22807vA.f44896b;
        return resources.getString(R.string.mtrl_picker_announce_current_range_selection, string, str2 == null ? resources.getString(R.string.mtrl_picker_announce_current_selection_none) : str2);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final View q3(@N LayoutInflater layoutInflater, @P ViewGroup viewGroup, CalendarConstraints calendarConstraints, @N x xVar) throws Resources.NotFoundException {
        View viewInflate = layoutInflater.inflate(R.layout.mtrl_picker_text_input_date_range, viewGroup, false);
        TextInputLayout textInputLayout = (TextInputLayout) viewInflate.findViewById(R.id.mtrl_picker_text_input_range_start);
        TextInputLayout textInputLayout2 = (TextInputLayout) viewInflate.findViewById(R.id.mtrl_picker_text_input_range_end);
        textInputLayout.setErrorAccessibilityLiveRegion(0);
        textInputLayout2.setErrorAccessibilityLiveRegion(0);
        EditText editText = textInputLayout.getEditText();
        EditText editText2 = textInputLayout2.getEditText();
        if (C37075p.a()) {
            editText.setInputType(17);
            editText2.setInputType(17);
        }
        this.f356500c = viewInflate.getResources().getString(R.string.mtrl_picker_invalid_range);
        SimpleDateFormat simpleDateFormatD = E.d();
        Long l12 = this.f356501d;
        if (l12 != null) {
            editText.setText(simpleDateFormatD.format(l12));
            this.f356503f = this.f356501d;
        }
        Long l13 = this.f356502e;
        if (l13 != null) {
            editText2.setText(simpleDateFormatD.format(l13));
            this.f356504g = this.f356502e;
        }
        String strE = E.e(viewInflate.getResources(), simpleDateFormatD);
        textInputLayout.setPlaceholderText(strE);
        textInputLayout2.setPlaceholderText(strE);
        editText.addTextChangedListener(new y(this, strE, simpleDateFormatD, textInputLayout, calendarConstraints, textInputLayout, textInputLayout2, xVar));
        editText2.addTextChangedListener(new z(this, strE, simpleDateFormatD, textInputLayout2, calendarConstraints, textInputLayout, textInputLayout2, xVar));
        DateSelector.d3(editText, editText2);
        return viewInflate;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@N Parcel parcel, int i12) {
        parcel.writeValue(this.f356501d);
        parcel.writeValue(this.f356502e);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @N
    public final ArrayList y1() {
        ArrayList arrayList = new ArrayList();
        Long l12 = this.f356501d;
        if (l12 != null) {
            arrayList.add(l12);
        }
        Long l13 = this.f356502e;
        if (l13 != null) {
            arrayList.add(l13);
        }
        return arrayList;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @N
    public final ArrayList z5() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C22807v(this.f356501d, this.f356502e));
        return arrayList;
    }
}
