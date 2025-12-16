package ru.cyberity.cbr.core.presentation.form.viewutils;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.category_parameters.DateTimeParameterKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.text.C43044a;
import kotlin.text.C43066x;
import ru.cyberity.cbr.core.data.listener.CBRCountryPicker;
import ru.cyberity.cbr.core.data.model.remote.c;
import ru.cyberity.cbr.core.presentation.form.FormItemValueProvider;
import ru.cyberity.cbr.core.presentation.form.model.FieldError;
import ru.cyberity.cbr.core.presentation.form.model.FormItem;
import ru.cyberity.cbr.core.presentation.form.model.FormItemExtensionsKt;
import ru.cyberity.cbr.core.presentation.form.model.QuestionnaireResponseExtensionsKt;
import ru.cyberity.cbr.core.widget.applicantData.CBRApplicantDataPhoneFieldView;

/* compiled from: PhoneView.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001b\u0010\t\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u0013\u0010\f\u001a\u0004\u0018\u00010\u000b*\u00020\u0000¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/cyberity/cbr/core/widget/applicantData/CBRApplicantDataPhoneFieldView;", "Lru/cyberity/cbr/core/presentation/form/model/FormItem$Phone;", "item", "Lru/cyberity/cbr/core/presentation/form/FormItemValueProvider;", "valueProvider", "Lkotlin/G0;", "setValueFromItem", "(Lru/cyberity/cbr/core/widget/applicantData/CBRApplicantDataPhoneFieldView;Lru/cyberity/cbr/core/presentation/form/model/FormItem$Phone;Lru/cyberity/cbr/core/presentation/form/FormItemValueProvider;)V", "", "check", "(Lru/cyberity/cbr/core/widget/applicantData/CBRApplicantDataPhoneFieldView;Lru/cyberity/cbr/core/presentation/form/model/FormItem$Phone;)Z", "", "getValueForItem", "(Lru/cyberity/cbr/core/widget/applicantData/CBRApplicantDataPhoneFieldView;)Ljava/lang/String;", "cyberity-mobile-sdk-ui_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class PhoneViewKt {
    public static final boolean check(@k CBRApplicantDataPhoneFieldView cBRApplicantDataPhoneFieldView, @k FormItem.Phone phone) {
        FieldError fieldErrorCheck = QuestionnaireResponseExtensionsKt.check(phone.getItem(), cBRApplicantDataPhoneFieldView.getPurePhoneNumber());
        if (fieldErrorCheck == null) {
            fieldErrorCheck = FieldError.NOT_VALID;
            if (cBRApplicantDataPhoneFieldView.isValid() || C43066x.K(cBRApplicantDataPhoneFieldView.getPurePhoneNumber())) {
                fieldErrorCheck = null;
            }
        }
        return !((L.f(phone.getItem().getRequired(), Boolean.TRUE) && C43066x.K(cBRApplicantDataPhoneFieldView.getPurePhoneNumber())) || fieldErrorCheck != null);
    }

    @l
    public static final String getValueForItem(@k CBRApplicantDataPhoneFieldView cBRApplicantDataPhoneFieldView) {
        String value = cBRApplicantDataPhoneFieldView.getValue();
        StringBuilder sb2 = new StringBuilder();
        int length = value.length();
        for (int i12 = 0; i12 < length; i12++) {
            char cCharAt = value.charAt(i12);
            if (!C43044a.d(cCharAt)) {
                sb2.append(cCharAt);
            }
        }
        return sb2.toString();
    }

    public static final void setValueFromItem(@k CBRApplicantDataPhoneFieldView cBRApplicantDataPhoneFieldView, @k FormItem.Phone phone, @k FormItemValueProvider formItemValueProvider) {
        Object obj;
        Object next;
        Object next2;
        Object next3;
        Set<Map.Entry<String, String>> setEntrySet = phone.getCountriesMap().entrySet();
        ArrayList arrayList = new ArrayList(C42745f0.q(setEntrySet, 10));
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            arrayList.add(new CBRCountryPicker.CountryItem((String) entry.getKey(), (String) entry.getValue()));
        }
        if (arrayList.isEmpty()) {
            return;
        }
        Map<String, c> phoneMaskMap = phone.getPhoneMaskMap();
        String value = formItemValueProvider.getValue(phone);
        if (value == null) {
            value = "";
        }
        Iterator<T> it2 = phoneMaskMap.entrySet().iterator();
        while (true) {
            obj = null;
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            String strC = ((c) ((Map.Entry) next).getValue()).c();
            if (strC == null) {
                strC = DateTimeParameterKt.DATE_TIME_PARAMETER_PRESENT_TIME;
            }
            if (C43066x.h0(value, "+".concat(strC), false)) {
                break;
            }
        }
        Map.Entry entry2 = (Map.Entry) next;
        Iterator it3 = arrayList.iterator();
        while (true) {
            if (!it3.hasNext()) {
                next2 = null;
                break;
            } else {
                next2 = it3.next();
                if (L.f(((CBRCountryPicker.CountryItem) next2).getCode(), entry2 != null ? (String) entry2.getKey() : null)) {
                    break;
                }
            }
        }
        CBRCountryPicker.CountryItem countryItem = (CBRCountryPicker.CountryItem) next2;
        if (countryItem == null) {
            String defaultCountry = phone.getDefaultCountry();
            if (defaultCountry != null) {
                Iterator it4 = arrayList.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        next3 = null;
                        break;
                    } else {
                        next3 = it4.next();
                        if (L.f(((CBRCountryPicker.CountryItem) next3).getCode(), defaultCountry)) {
                            break;
                        }
                    }
                }
                countryItem = (CBRCountryPicker.CountryItem) next3;
            } else {
                countryItem = null;
            }
        }
        if (value.length() <= 0) {
            if (countryItem != null) {
                cBRApplicantDataPhoneFieldView.setCountry(countryItem);
                return;
            }
            return;
        }
        String value2 = formItemValueProvider.getValue(FormItemExtensionsKt.getInternalCountryCodeItem(phone));
        if (value2 != null) {
            Iterator it5 = arrayList.iterator();
            while (true) {
                if (!it5.hasNext()) {
                    break;
                }
                Object next4 = it5.next();
                if (L.f(((CBRCountryPicker.CountryItem) next4).getCode(), value2)) {
                    obj = next4;
                    break;
                }
            }
            CBRCountryPicker.CountryItem countryItem2 = (CBRCountryPicker.CountryItem) obj;
            if (countryItem2 != null) {
                cBRApplicantDataPhoneFieldView.setCountry(countryItem2);
            }
        }
        cBRApplicantDataPhoneFieldView.setValue(value);
    }
}
