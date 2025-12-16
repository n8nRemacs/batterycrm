package ru.cyberity.cbr.core.widget;

import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.FragmentManager;
import com.avito.android.job.cv_info_actualization.ui.items.radio.g;
import com.google.android.material.datepicker.MaterialDatePicker;
import com.google.android.material.datepicker.SingleDateSelector;
import com.google.android.material.timepicker.MaterialTimePicker;
import e11.ViewOnClickListenerC39879j1;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.l0;
import ru.cyberity.cbr.core.R;
import ru.cyberity.cbr.core.common.s;
import ru.cyberity.cbr.core.data.listener.CBRIconHandler;
import ru.cyberity.cbr.core.presentation.helper.ThemeHelper;

/* compiled from: CBRDateTimeInputLayout.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ-\u0010\u0012\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lru/cyberity/cbr/core/widget/CBRDateTimeInputLayout;", "Lru/cyberity/cbr/core/widget/CBRTextInputLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Lkotlin/G0;", "showCalendar", "()V", "Ljava/util/Calendar;", "cal", "hours", "minutes", "showTime", "(Ljava/util/Calendar;Ljava/lang/Integer;Ljava/lang/Integer;)V", "Ljava/text/DateFormat;", "format", "setDateFormatter", "(Ljava/text/DateFormat;)V", "Landroid/view/View;", "child", "index", "Landroid/view/ViewGroup$LayoutParams;", "params", "addView", "(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V", "dateFormat", "Ljava/text/DateFormat;", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class CBRDateTimeInputLayout extends CBRTextInputLayout {

    @l
    private DateFormat dateFormat;

    @j
    public CBRDateTimeInputLayout(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: addView$lambda-0, reason: not valid java name */
    public static final void m287addView$lambda0(CBRDateTimeInputLayout cBRDateTimeInputLayout, View view, boolean z12) {
        if (z12) {
            cBRDateTimeInputLayout.showCalendar();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r1v11, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r1v8, types: [T, java.lang.Integer] */
    public final void showCalendar() {
        FragmentManager supportFragmentManager;
        Editable text;
        String string;
        Date date;
        final Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        DateFormat dateInstance = this.dateFormat;
        if (dateInstance == null) {
            dateInstance = DateFormat.getDateInstance();
        }
        DateFormat dateFormat = this.dateFormat;
        if (dateFormat != null) {
            dateFormat.setTimeZone(calendar.getTimeZone());
        }
        final l0.h hVar = new l0.h();
        final l0.h hVar2 = new l0.h();
        try {
            EditText editText = getEditText();
            if (editText != null && (text = editText.getText()) != null && (string = text.toString()) != null && (date = dateInstance.parse(string)) != null) {
                calendar.setTime(date);
                hVar.f406842b = Integer.valueOf(calendar.get(12));
                hVar2.f406842b = Integer.valueOf(calendar.get(10));
            }
        } catch (Exception unused) {
        }
        ActivityC22955m activityC22955mA = s.a(getContext());
        if (activityC22955mA == null || (supportFragmentManager = activityC22955mA.getSupportFragmentManager()) == null) {
            return;
        }
        MaterialDatePicker.e eVar = new MaterialDatePicker.e(new SingleDateSelector());
        eVar.f356486d = Long.valueOf(calendar.getTimeInMillis());
        MaterialDatePicker materialDatePickerA = eVar.a();
        materialDatePickerA.f356458f0.add(new com.google.android.material.datepicker.s() { // from class: ru.cyberity.cbr.core.widget.b
            @Override // com.google.android.material.datepicker.s
            public final void a(Object obj) {
                CBRDateTimeInputLayout.m289showCalendar$lambda5$lambda4(calendar, this, hVar2, hVar, (Long) obj);
            }
        });
        materialDatePickerA.show(supportFragmentManager, (String) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: showCalendar$lambda-5$lambda-4, reason: not valid java name */
    public static final void m289showCalendar$lambda5$lambda4(Calendar calendar, CBRDateTimeInputLayout cBRDateTimeInputLayout, l0.h hVar, l0.h hVar2, Long l12) {
        calendar.setTimeInMillis(l12.longValue());
        cBRDateTimeInputLayout.showTime(calendar, (Integer) hVar.f406842b, (Integer) hVar2.f406842b);
    }

    private final void showTime(Calendar cal, Integer hours, Integer minutes) {
        FragmentManager supportFragmentManager;
        MaterialTimePicker.d dVar = new MaterialTimePicker.d();
        dVar.c();
        if (minutes != null) {
            dVar.b(minutes.intValue());
        }
        if (hours != null) {
            dVar.a(hours.intValue());
        }
        MaterialTimePicker materialTimePicker = new MaterialTimePicker();
        Bundle bundle = new Bundle();
        bundle.putParcelable("TIME_PICKER_TIME_MODEL", dVar.f357639a);
        bundle.putInt("TIME_PICKER_TITLE_RES", 0);
        bundle.putInt("TIME_PICKER_POSITIVE_BUTTON_TEXT_RES", 0);
        bundle.putInt("TIME_PICKER_NEGATIVE_BUTTON_TEXT_RES", 0);
        bundle.putInt("TIME_PICKER_OVERRIDE_THEME_RES_ID", 0);
        materialTimePicker.setArguments(bundle);
        materialTimePicker.f357615f0.add(new g(cal, materialTimePicker, this, 27));
        ActivityC22955m activityC22955mA = s.a(getContext());
        if (activityC22955mA == null || (supportFragmentManager = activityC22955mA.getSupportFragmentManager()) == null) {
            return;
        }
        materialTimePicker.show(supportFragmentManager, (String) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showTime$lambda-8, reason: not valid java name */
    public static final void m290showTime$lambda8(Calendar calendar, MaterialTimePicker materialTimePicker, CBRDateTimeInputLayout cBRDateTimeInputLayout, View view) {
        Date time;
        EditText editText;
        if (calendar != null) {
            calendar.set(10, materialTimePicker.b5());
        }
        if (calendar != null) {
            calendar.set(12, materialTimePicker.c5());
        }
        if (calendar == null || (time = calendar.getTime()) == null) {
            return;
        }
        DateFormat dateFormat = cBRDateTimeInputLayout.dateFormat;
        String str = dateFormat != null ? dateFormat.format(time) : null;
        if (str == null || (editText = cBRDateTimeInputLayout.getEditText()) == null) {
            return;
        }
        editText.setText(str);
    }

    @Override // ru.cyberity.cbr.core.widget.CBRTextInputLayout, com.google.android.material.textfield.TextInputLayout, android.view.ViewGroup
    public void addView(@k View child, int index, @k ViewGroup.LayoutParams params) {
        super.addView(child, index, params);
        if (child instanceof EditText) {
            EditText editText = getEditText();
            if (editText != null) {
                editText.setOnFocusChangeListener(new com.avito.android.advert.item.fmp.calculator.l(this, 22));
            }
            EditText editText2 = getEditText();
            if (editText2 != null) {
                editText2.setOnClickListener(new ViewOnClickListenerC39879j1(this, 24));
            }
            EditText editText3 = getEditText();
            if (editText3 != null) {
                editText3.setKeyListener(null);
            }
            setFocusable(true);
            setFocusableInTouchMode(true);
        }
    }

    public final void setDateFormatter(@k DateFormat format) {
        this.dateFormat = format;
    }

    public /* synthetic */ CBRDateTimeInputLayout(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? R.attr.cbr_DateTimeInputLayoutStyle : i12, (i14 & 8) != 0 ? R.style.Widget_CBRDateTimeInputLayout : i13);
    }

    @j
    public CBRDateTimeInputLayout(@k Context context, @l AttributeSet attributeSet, int i12, int i13) {
        super(context, attributeSet, i12, i13);
        EditText editText = getEditText();
        if (editText != null) {
            editText.setKeyListener(null);
        }
        setStartIconDrawable(ThemeHelper.INSTANCE.resolveIcon(context, CBRIconHandler.CBRCommonIcons.CALENDAR.getImageName()));
    }
}
