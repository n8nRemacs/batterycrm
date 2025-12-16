package ru.cyberity.cbr.core.widget;

import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.FragmentManager;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.MaterialDatePicker;
import com.google.android.material.datepicker.SingleDateSelector;
import e11.ViewOnClickListenerC39879j1;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import ru.cyberity.cbr.core.R;
import ru.cyberity.cbr.core.common.s;
import ru.cyberity.cbr.core.data.listener.CBRIconHandler;
import ru.cyberity.cbr.core.presentation.helper.ThemeHelper;

/* compiled from: CBRDateInputLayout.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lru/cyberity/cbr/core/widget/CBRDateInputLayout;", "Lru/cyberity/cbr/core/widget/CBRTextInputLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Lkotlin/G0;", "showCalendar", "()V", "Ljava/text/DateFormat;", "format", "setDateFormatter", "(Ljava/text/DateFormat;)V", "Lcom/google/android/material/datepicker/CalendarConstraints;", "c", "setConstraints", "(Lcom/google/android/material/datepicker/CalendarConstraints;)V", "Landroid/view/View;", "child", "index", "Landroid/view/ViewGroup$LayoutParams;", "params", "addView", "(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V", "dateFormat", "Ljava/text/DateFormat;", "constraints", "Lcom/google/android/material/datepicker/CalendarConstraints;", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class CBRDateInputLayout extends CBRTextInputLayout {

    @l
    private CalendarConstraints constraints;

    @l
    private DateFormat dateFormat;

    @j
    public CBRDateInputLayout(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: addView$lambda-0, reason: not valid java name */
    public static final void m284addView$lambda0(CBRDateInputLayout cBRDateInputLayout, View view, boolean z12) {
        if (z12) {
            cBRDateInputLayout.showCalendar();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showCalendar() {
        FragmentManager supportFragmentManager;
        Editable text;
        String string;
        Date date;
        final Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        final DateFormat dateInstance = this.dateFormat;
        if (dateInstance == null) {
            dateInstance = DateFormat.getDateInstance();
        }
        dateInstance.setTimeZone(calendar.getTimeZone());
        try {
            EditText editText = getEditText();
            if (editText != null && (text = editText.getText()) != null && (string = text.toString()) != null && (date = dateInstance.parse(string)) != null) {
                calendar.setTime(date);
            }
        } catch (Exception unused) {
        }
        ActivityC22955m activityC22955mA = s.a(getContext());
        if (activityC22955mA == null || (supportFragmentManager = activityC22955mA.getSupportFragmentManager()) == null) {
            return;
        }
        MaterialDatePicker.e eVar = new MaterialDatePicker.e(new SingleDateSelector());
        eVar.f356486d = Long.valueOf(calendar.getTimeInMillis());
        CalendarConstraints calendarConstraints = this.constraints;
        if (calendarConstraints != null) {
            eVar.f356484b = calendarConstraints;
        }
        MaterialDatePicker materialDatePickerA = eVar.a();
        materialDatePickerA.f356458f0.add(new com.google.android.material.datepicker.s() { // from class: ru.cyberity.cbr.core.widget.a
            @Override // com.google.android.material.datepicker.s
            public final void a(Object obj) {
                CBRDateInputLayout.m286showCalendar$lambda7$lambda6(calendar, this, dateInstance, (Long) obj);
            }
        });
        materialDatePickerA.show(supportFragmentManager, (String) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showCalendar$lambda-7$lambda-6, reason: not valid java name */
    public static final void m286showCalendar$lambda7$lambda6(Calendar calendar, CBRDateInputLayout cBRDateInputLayout, DateFormat dateFormat, Long l12) {
        calendar.setTimeInMillis(l12.longValue());
        EditText editText = cBRDateInputLayout.getEditText();
        if (editText != null) {
            editText.setText(dateFormat.format(calendar.getTime()));
        }
    }

    @Override // ru.cyberity.cbr.core.widget.CBRTextInputLayout, com.google.android.material.textfield.TextInputLayout, android.view.ViewGroup
    public void addView(@k View child, int index, @k ViewGroup.LayoutParams params) {
        super.addView(child, index, params);
        if (child instanceof EditText) {
            EditText editText = getEditText();
            if (editText != null) {
                editText.setOnFocusChangeListener(new com.avito.android.advert.item.fmp.calculator.l(this, 21));
            }
            EditText editText2 = getEditText();
            if (editText2 != null) {
                editText2.setOnClickListener(new ViewOnClickListenerC39879j1(this, 23));
            }
            EditText editText3 = getEditText();
            if (editText3 == null) {
                return;
            }
            editText3.setKeyListener(null);
        }
    }

    public final void setConstraints(@l CalendarConstraints c12) {
        this.constraints = c12;
    }

    public final void setDateFormatter(@k DateFormat format) {
        this.dateFormat = format;
    }

    public /* synthetic */ CBRDateInputLayout(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? R.attr.cbr_DateInputLayoutStyle : i12, (i14 & 8) != 0 ? R.style.Widget_CBRDateInputLayout : i13);
    }

    @j
    public CBRDateInputLayout(@k Context context, @l AttributeSet attributeSet, int i12, int i13) {
        super(context, attributeSet, i12, i13);
        setStartIconDrawable(ThemeHelper.INSTANCE.resolveIcon(context, CBRIconHandler.CBRCommonIcons.CALENDAR.getImageName()));
    }
}
