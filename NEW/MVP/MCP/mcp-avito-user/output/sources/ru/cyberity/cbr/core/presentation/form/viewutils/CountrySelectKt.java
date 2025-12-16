package ru.cyberity.cbr.core.presentation.form.viewutils;

import Y61.k;
import Y61.l;
import java.util.Map;
import kotlin.Metadata;
import ru.cyberity.cbr.core.presentation.form.model.FormItem;
import ru.cyberity.cbr.core.widget.applicantData.CBRApplicantDataSelectionCountryFieldView;

/* compiled from: CountrySelect.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/cyberity/cbr/core/widget/applicantData/CBRApplicantDataSelectionCountryFieldView;", "Lru/cyberity/cbr/core/presentation/form/model/FormItem$CountrySelect;", "item", "", "aValue", "Lkotlin/G0;", "setValueFromItem", "(Lru/cyberity/cbr/core/widget/applicantData/CBRApplicantDataSelectionCountryFieldView;Lru/cyberity/cbr/core/presentation/form/model/FormItem$CountrySelect;Ljava/lang/String;)V", "cyberity-mobile-sdk-ui_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class CountrySelectKt {
    public static final void setValueFromItem(@k CBRApplicantDataSelectionCountryFieldView cBRApplicantDataSelectionCountryFieldView, @k FormItem.CountrySelect countrySelect, @l String str) {
        Map<String, String> countriesMap = countrySelect.getCountriesMap();
        if (str == null) {
            str = "";
        }
        String str2 = countriesMap.get(str);
        cBRApplicantDataSelectionCountryFieldView.setValue(str2 != null ? str2 : "");
    }
}
