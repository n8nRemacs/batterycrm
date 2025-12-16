package ru.cyberity.cbr.core.widget.applicantData;

import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.widget.EditText;
import java.text.DateFormat;
import java.util.Date;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import ru.cyberity.cbr.core.R;
import ru.cyberity.cbr.core.widget.CBRApplicantDataFieldView;
import ru.cyberity.cbr.core.widget.CBRDateTimeInputLayout;

/* compiled from: CBRApplicantDataDateTimeFieldView.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\u000e\u0010#\u001a\u0004\u0018\u00010\u0018*\u00020\u001eH\u0002R\u0016\u0010\n\u001a\u0004\u0018\u00010\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR(\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\n \u0017*\u0004\u0018\u00010\u00160\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u000e\u001a\u0004\u0018\u00010\u00188F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010\u000e\u001a\u00020\u001e2\u0006\u0010\u000e\u001a\u00020\u001e8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lru/cyberity/cbr/core/widget/applicantData/CBRApplicantDataDateTimeFieldView;", "Lru/cyberity/cbr/core/widget/CBRApplicantDataFieldView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "dateTimeInput", "Lru/cyberity/cbr/core/widget/CBRDateTimeInputLayout;", "getDateTimeInput", "()Lru/cyberity/cbr/core/widget/CBRDateTimeInputLayout;", "value", "", "error", "getError", "()Ljava/lang/CharSequence;", "setError", "(Ljava/lang/CharSequence;)V", "printDateFormat", "Ljava/text/DateFormat;", "kotlin.jvm.PlatformType", "Ljava/util/Date;", "selectedDate", "getSelectedDate", "()Ljava/util/Date;", "setSelectedDate", "(Ljava/util/Date;)V", "", "getValue", "()Ljava/lang/String;", "setValue", "(Ljava/lang/String;)V", "parseAsPrintFormat", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class CBRApplicantDataDateTimeFieldView extends CBRApplicantDataFieldView {
    private final DateFormat printDateFormat;

    @l
    private Date selectedDate;

    public /* synthetic */ CBRApplicantDataDateTimeFieldView(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? R.attr.cbr_applicantDataFieldViewStyle : i12, (i14 & 8) != 0 ? R.style.Widget_CBRApplicantDataFieldView_DateTime : i13);
    }

    private final CBRDateTimeInputLayout getDateTimeInput() {
        return (CBRDateTimeInputLayout) findViewById(R.id.cbr_data_datetime);
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
        CBRDateTimeInputLayout dateTimeInput = getDateTimeInput();
        if (dateTimeInput != null) {
            return dateTimeInput.getError();
        }
        return null;
    }

    @l
    public final Date getSelectedDate() {
        EditText editText;
        CBRDateTimeInputLayout dateTimeInput = getDateTimeInput();
        return parseAsPrintFormat(String.valueOf((dateTimeInput == null || (editText = dateTimeInput.getEditText()) == null) ? null : editText.getText()));
    }

    @Override // ru.cyberity.cbr.core.widget.applicantData.CBRApplicantDataBaseFieldView
    @k
    public String getValue() {
        Date selectedDate = getSelectedDate();
        String str = selectedDate != null ? this.printDateFormat.format(selectedDate) : null;
        return str == null ? "" : str;
    }

    @Override // ru.cyberity.cbr.core.widget.applicantData.CBRApplicantDataBaseFieldView
    public void setError(@l CharSequence charSequence) {
        CBRDateTimeInputLayout dateTimeInput = getDateTimeInput();
        if (dateTimeInput == null) {
            return;
        }
        dateTimeInput.setError(charSequence);
    }

    public final void setSelectedDate(@l Date date) {
        EditText editText;
        CBRDateTimeInputLayout dateTimeInput = getDateTimeInput();
        if (dateTimeInput != null && (editText = dateTimeInput.getEditText()) != null) {
            editText.setText(date != null ? this.printDateFormat.format(date) : null);
        }
        this.selectedDate = date;
    }

    @Override // ru.cyberity.cbr.core.widget.applicantData.CBRApplicantDataBaseFieldView
    public void setValue(@k String str) {
        setSelectedDate(parseAsPrintFormat(str));
    }

    @j
    public CBRApplicantDataDateTimeFieldView(@k Context context, @l AttributeSet attributeSet, int i12, int i13) {
        EditText editText;
        super(context, attributeSet, i12, i13);
        DateFormat dateTimeInstance = DateFormat.getDateTimeInstance();
        this.printDateFormat = dateTimeInstance;
        setFocusable(true);
        setFocusableInTouchMode(true);
        CBRDateTimeInputLayout dateTimeInput = getDateTimeInput();
        if (dateTimeInput != null) {
            dateTimeInput.setDateFormatter(dateTimeInstance);
        }
        CBRDateTimeInputLayout dateTimeInput2 = getDateTimeInput();
        if (dateTimeInput2 != null && (editText = dateTimeInput2.getEditText()) != null) {
            editText.addTextChangedListener(new TextWatcher() { // from class: ru.cyberity.cbr.core.widget.applicantData.CBRApplicantDataDateTimeFieldView$special$$inlined$addTextChangedListener$default$1
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
