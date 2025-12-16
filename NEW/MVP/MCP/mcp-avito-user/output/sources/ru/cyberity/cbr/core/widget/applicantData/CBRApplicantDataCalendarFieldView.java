package ru.cyberity.cbr.core.widget.applicantData;

import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.widget.EditText;
import com.google.android.material.datepicker.CalendarConstraints;
import java.text.DateFormat;
import java.util.Date;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import ru.cyberity.cbr.core.R;
import ru.cyberity.cbr.core.widget.CBRApplicantDataFieldView;
import ru.cyberity.cbr.core.widget.CBRDateInputLayout;

/* compiled from: CBRApplicantDataCalendarFieldView.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\r\n\u0002\b\u0006\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u0004\u0018\u00010\f*\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0016\u001a\n \u0015*\u0004\u0018\u00010\u00140\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R.\u0010\u0019\u001a\u0004\u0018\u00010\f2\b\u0010\u0018\u001a\u0004\u0018\u00010\f8F@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0016\u0010\"\u001a\u0004\u0018\u00010\u001f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R$\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u000b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R(\u0010,\u001a\u0004\u0018\u00010'2\b\u0010\u0018\u001a\u0004\u0018\u00010'8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+¨\u0006-"}, d2 = {"Lru/cyberity/cbr/core/widget/applicantData/CBRApplicantDataCalendarFieldView;", "Lru/cyberity/cbr/core/widget/CBRApplicantDataFieldView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "", "Ljava/util/Date;", "parseAsPrintFormat", "(Ljava/lang/String;)Ljava/util/Date;", "Lcom/google/android/material/datepicker/CalendarConstraints;", "constraints", "Lkotlin/G0;", "setConstraints", "(Lcom/google/android/material/datepicker/CalendarConstraints;)V", "Ljava/text/DateFormat;", "kotlin.jvm.PlatformType", "printDateFormat", "Ljava/text/DateFormat;", "value", "selectedDate", "Ljava/util/Date;", "getSelectedDate", "()Ljava/util/Date;", "setSelectedDate", "(Ljava/util/Date;)V", "Lru/cyberity/cbr/core/widget/CBRDateInputLayout;", "getDateInput", "()Lru/cyberity/cbr/core/widget/CBRDateInputLayout;", "dateInput", "getValue", "()Ljava/lang/String;", "setValue", "(Ljava/lang/String;)V", "", "getError", "()Ljava/lang/CharSequence;", "setError", "(Ljava/lang/CharSequence;)V", "error", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class CBRApplicantDataCalendarFieldView extends CBRApplicantDataFieldView {
    private final DateFormat printDateFormat;

    @l
    private Date selectedDate;

    public /* synthetic */ CBRApplicantDataCalendarFieldView(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? R.attr.cbr_applicantDataFieldViewStyle : i12, (i14 & 8) != 0 ? R.style.Widget_CBRApplicantDataFieldView_Date : i13);
    }

    private final CBRDateInputLayout getDateInput() {
        return (CBRDateInputLayout) findViewById(R.id.cbr_data_date);
    }

    private final Date parseAsPrintFormat(String str) {
        try {
            return this.printDateFormat.parse(str);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // ru.cyberity.cbr.core.widget.applicantData.CBRApplicantDataBaseFieldView
    @l
    public CharSequence getError() {
        CBRDateInputLayout dateInput = getDateInput();
        if (dateInput != null) {
            return dateInput.getError();
        }
        return null;
    }

    @l
    public final Date getSelectedDate() {
        EditText editText;
        CBRDateInputLayout dateInput = getDateInput();
        return parseAsPrintFormat(String.valueOf((dateInput == null || (editText = dateInput.getEditText()) == null) ? null : editText.getText()));
    }

    @Override // ru.cyberity.cbr.core.widget.applicantData.CBRApplicantDataBaseFieldView
    @k
    public String getValue() {
        Date selectedDate = getSelectedDate();
        String str = selectedDate != null ? this.printDateFormat.format(selectedDate) : null;
        return str == null ? "" : str;
    }

    public final void setConstraints(@l CalendarConstraints constraints) {
        CBRDateInputLayout dateInput = getDateInput();
        if (dateInput != null) {
            dateInput.setConstraints(constraints);
        }
    }

    @Override // ru.cyberity.cbr.core.widget.applicantData.CBRApplicantDataBaseFieldView
    public void setError(@l CharSequence charSequence) {
        CBRDateInputLayout dateInput = getDateInput();
        if (dateInput == null) {
            return;
        }
        dateInput.setError(charSequence);
    }

    public final void setSelectedDate(@l Date date) {
        EditText editText;
        CBRDateInputLayout dateInput = getDateInput();
        if (dateInput != null && (editText = dateInput.getEditText()) != null) {
            String str = date != null ? this.printDateFormat.format(date) : null;
            if (str == null) {
                str = "";
            }
            editText.setText(str);
        }
        this.selectedDate = date;
    }

    @Override // ru.cyberity.cbr.core.widget.applicantData.CBRApplicantDataBaseFieldView
    public void setValue(@k String str) {
        setSelectedDate(parseAsPrintFormat(str));
    }

    @j
    public CBRApplicantDataCalendarFieldView(@k Context context, @l AttributeSet attributeSet, int i12, int i13) {
        EditText editText;
        super(context, attributeSet, i12, i13);
        DateFormat dateInstance = DateFormat.getDateInstance();
        this.printDateFormat = dateInstance;
        setFocusable(true);
        setFocusableInTouchMode(true);
        CBRDateInputLayout dateInput = getDateInput();
        if (dateInput != null) {
            dateInput.setDateFormatter(dateInstance);
        }
        CBRDateInputLayout dateInput2 = getDateInput();
        if (dateInput2 != null && (editText = dateInput2.getEditText()) != null) {
            editText.addTextChangedListener(new TextWatcher() { // from class: ru.cyberity.cbr.core.widget.applicantData.CBRApplicantDataCalendarFieldView$special$$inlined$addTextChangedListener$default$1
                @Override // android.text.TextWatcher
                public void afterTextChanged(@l Editable s5) {
                    this.this$0.setError(null);
                    Y41.l<String, G0> textChangedCallback = this.this$0.getTextChangedCallback();
                    if (textChangedCallback != null) {
                        textChangedCallback.invoke(s5 != null ? s5.toString() : null);
                    }
                }

                @Override // android.text.TextWatcher
                public void beforeTextChanged(@l CharSequence text, int start, int count, int after) {
                }

                @Override // android.text.TextWatcher
                public void onTextChanged(@l CharSequence text, int start, int before, int count) {
                }
            });
        }
        onInitializationFinished();
    }
}
