package ru.cyberity.cbr.core.presentation.form.viewutils;

import Y61.k;
import Y61.l;
import android.annotation.SuppressLint;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Metadata;
import ru.cyberity.cbr.core.widget.applicantData.CBRApplicantDataDateTimeFieldView;

/* compiled from: DateTimeView.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0001*\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0007\"\u0014\u0010\t\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/cyberity/cbr/core/widget/applicantData/CBRApplicantDataDateTimeFieldView;", "", "aValue", "Lkotlin/G0;", "setValueFromItem", "(Lru/cyberity/cbr/core/widget/applicantData/CBRApplicantDataDateTimeFieldView;Ljava/lang/String;)V", "getValueForItem", "(Lru/cyberity/cbr/core/widget/applicantData/CBRApplicantDataDateTimeFieldView;)Ljava/lang/String;", "Ljava/text/SimpleDateFormat;", "backEndDateTimeFormat", "Ljava/text/SimpleDateFormat;", "cyberity-mobile-sdk-ui_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class DateTimeViewKt {

    @k
    @SuppressLint({"ConstantLocale"})
    private static final SimpleDateFormat backEndDateTimeFormat;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm", Locale.getDefault());
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        backEndDateTimeFormat = simpleDateFormat;
    }

    @l
    public static final String getValueForItem(@k CBRApplicantDataDateTimeFieldView cBRApplicantDataDateTimeFieldView) {
        Date selectedDate = cBRApplicantDataDateTimeFieldView.getSelectedDate();
        if (selectedDate != null) {
            return backEndDateTimeFormat.format(selectedDate);
        }
        return null;
    }

    public static final void setValueFromItem(@k CBRApplicantDataDateTimeFieldView cBRApplicantDataDateTimeFieldView, @l String str) throws ParseException {
        Date date;
        if (str != null) {
            try {
                date = backEndDateTimeFormat.parse(str);
            } catch (Exception unused) {
            }
        } else {
            date = null;
        }
        cBRApplicantDataDateTimeFieldView.setSelectedDate(date);
    }
}
