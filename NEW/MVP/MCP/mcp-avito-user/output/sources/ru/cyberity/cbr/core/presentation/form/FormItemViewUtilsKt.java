package ru.cyberity.cbr.core.presentation.form;

import Y61.k;
import Y61.l;
import android.widget.EditText;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.text.C43066x;
import ru.cyberity.cbr.core.data.listener.CBRCountryPicker;
import ru.cyberity.cbr.core.data.model.h;
import ru.cyberity.cbr.core.presentation.form.model.FormItem;
import ru.cyberity.cbr.core.presentation.form.model.QuestionnaireResponseExtensionsKt;
import ru.cyberity.cbr.core.presentation.form.viewutils.CountrySelectKt;
import ru.cyberity.cbr.core.presentation.form.viewutils.DateTimeViewKt;
import ru.cyberity.cbr.core.presentation.form.viewutils.DateVIewKt;
import ru.cyberity.cbr.core.presentation.form.viewutils.FileAttachmentViewKt;
import ru.cyberity.cbr.core.presentation.form.viewutils.MultiFileAttachmentViewKt;
import ru.cyberity.cbr.core.presentation.form.viewutils.MultiselectViewKt;
import ru.cyberity.cbr.core.presentation.form.viewutils.PhoneViewKt;
import ru.cyberity.cbr.core.presentation.form.viewutils.SelectDropdownViewKt;
import ru.cyberity.cbr.core.presentation.form.viewutils.SelectViewKt;
import ru.cyberity.cbr.core.presentation.util.ApplicantDataFieldFormatUtilsKt;
import ru.cyberity.cbr.core.widget.applicantData.CBRApplicantDataBaseFieldView;
import ru.cyberity.cbr.core.widget.applicantData.CBRApplicantDataBoolFieldView;
import ru.cyberity.cbr.core.widget.applicantData.CBRApplicantDataCalendarFieldView;
import ru.cyberity.cbr.core.widget.applicantData.CBRApplicantDataDateTimeFieldView;
import ru.cyberity.cbr.core.widget.applicantData.CBRApplicantDataFileFieldView;
import ru.cyberity.cbr.core.widget.applicantData.CBRApplicantDataMutilselectFieldView;
import ru.cyberity.cbr.core.widget.applicantData.CBRApplicantDataPhoneFieldView;
import ru.cyberity.cbr.core.widget.applicantData.CBRApplicantDataRadioGroupView;
import ru.cyberity.cbr.core.widget.applicantData.CBRApplicantDataSelectionCountryFieldView;
import ru.cyberity.cbr.core.widget.applicantData.CBRApplicantDataSelectionFieldView;

/* compiled from: FormItemViewUtils.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001b\u0010\t\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001d\u0010\f\u001a\u0004\u0018\u00010\u000b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\f\u0010\r\u001a#\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000e*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/cyberity/cbr/core/widget/applicantData/CBRApplicantDataBaseFieldView;", "Lru/cyberity/cbr/core/presentation/form/model/FormItem;", "item", "Lru/cyberity/cbr/core/presentation/form/FormItemValueProvider;", "valueProvider", "Lkotlin/G0;", "setValueFromItem", "(Lru/cyberity/cbr/core/widget/applicantData/CBRApplicantDataBaseFieldView;Lru/cyberity/cbr/core/presentation/form/model/FormItem;Lru/cyberity/cbr/core/presentation/form/FormItemValueProvider;)V", "", "check", "(Lru/cyberity/cbr/core/widget/applicantData/CBRApplicantDataBaseFieldView;Lru/cyberity/cbr/core/presentation/form/model/FormItem;)Z", "", "getValueForItem", "(Lru/cyberity/cbr/core/widget/applicantData/CBRApplicantDataBaseFieldView;Lru/cyberity/cbr/core/presentation/form/model/FormItem;)Ljava/lang/String;", "", "getValuesForItem", "(Lru/cyberity/cbr/core/widget/applicantData/CBRApplicantDataBaseFieldView;Lru/cyberity/cbr/core/presentation/form/model/FormItem;)Ljava/util/List;", "cyberity-mobile-sdk-ui_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class FormItemViewUtilsKt {
    public static final boolean check(@k CBRApplicantDataBaseFieldView cBRApplicantDataBaseFieldView, @k FormItem formItem) {
        if (formItem instanceof FormItem.Text ? true : formItem instanceof FormItem.TextArea ? true : formItem instanceof FormItem.Bool ? true : formItem instanceof FormItem.Date ? true : formItem instanceof FormItem.DateTime ? true : formItem instanceof FormItem.CountrySelect ? true : formItem instanceof FormItem.SelectDropdown) {
            return QuestionnaireResponseExtensionsKt.check(formItem.getItem(), getValueForItem(cBRApplicantDataBaseFieldView, formItem)) == null;
        }
        if (formItem instanceof FormItem.Phone) {
            return PhoneViewKt.check((CBRApplicantDataPhoneFieldView) cBRApplicantDataBaseFieldView, (FormItem.Phone) formItem);
        }
        if (formItem instanceof FormItem.Select) {
            String valueForItem = getValueForItem(cBRApplicantDataBaseFieldView, formItem);
            boolean z12 = valueForItem == null || valueForItem.length() == 0;
            if (!L.f(formItem.getItem().getRequired(), Boolean.TRUE) || !z12) {
                return true;
            }
        } else if (formItem instanceof FormItem.MultiSelect) {
            List<String> valuesForItem = getValuesForItem(cBRApplicantDataBaseFieldView, formItem);
            boolean z13 = valuesForItem == null || valuesForItem.isEmpty();
            if (!L.f(formItem.getItem().getRequired(), Boolean.TRUE) || !z13) {
                return true;
            }
        } else if (formItem instanceof FormItem.FileAttachment) {
            String valueForItem2 = getValueForItem(cBRApplicantDataBaseFieldView, formItem);
            if (!L.f(formItem.getItem().getRequired(), Boolean.TRUE) || valueForItem2 != null) {
                return true;
            }
        } else {
            if (!(formItem instanceof FormItem.MultiFileAttachments)) {
                return true;
            }
            List valuesForItem2 = getValuesForItem(cBRApplicantDataBaseFieldView, formItem);
            if (valuesForItem2 == null) {
                valuesForItem2 = C42784z0.f406748b;
            }
            if (!MultiFileAttachmentViewKt.isRequired(cBRApplicantDataBaseFieldView, (FormItem.MultiFileAttachments) formItem) || ApplicantDataFieldFormatUtilsKt.checkField(QuestionnaireResponseExtensionsKt.getFieldFormat(formItem.getItem()), String.valueOf(valuesForItem2.size()))) {
                return true;
            }
        }
        return false;
    }

    @l
    public static final String getValueForItem(@k CBRApplicantDataBaseFieldView cBRApplicantDataBaseFieldView, @k FormItem formItem) {
        List<CBRApplicantDataFileFieldView.Attachment> files;
        CBRApplicantDataFileFieldView.Attachment attachment;
        CBRCountryPicker.CountryItem selectedCountry;
        h.e.a.C12451a selectedItem;
        if (formItem instanceof FormItem.Text ? true : formItem instanceof FormItem.TextArea ? true : formItem instanceof FormItem.Select) {
            String value = cBRApplicantDataBaseFieldView.getValue();
            if (C43066x.K(value)) {
                return null;
            }
            return value;
        }
        if (formItem instanceof FormItem.Phone) {
            CBRApplicantDataPhoneFieldView cBRApplicantDataPhoneFieldView = cBRApplicantDataBaseFieldView instanceof CBRApplicantDataPhoneFieldView ? (CBRApplicantDataPhoneFieldView) cBRApplicantDataBaseFieldView : null;
            if (cBRApplicantDataPhoneFieldView != null) {
                return PhoneViewKt.getValueForItem(cBRApplicantDataPhoneFieldView);
            }
            return null;
        }
        if (formItem instanceof FormItem.SelectDropdown) {
            CBRApplicantDataSelectionFieldView cBRApplicantDataSelectionFieldView = cBRApplicantDataBaseFieldView instanceof CBRApplicantDataSelectionFieldView ? (CBRApplicantDataSelectionFieldView) cBRApplicantDataBaseFieldView : null;
            if (cBRApplicantDataSelectionFieldView == null || (selectedItem = cBRApplicantDataSelectionFieldView.getSelectedItem()) == null) {
                return null;
            }
            return selectedItem.getId();
        }
        if (formItem instanceof FormItem.Bool) {
            CBRApplicantDataBoolFieldView cBRApplicantDataBoolFieldView = cBRApplicantDataBaseFieldView instanceof CBRApplicantDataBoolFieldView ? (CBRApplicantDataBoolFieldView) cBRApplicantDataBaseFieldView : null;
            return String.valueOf(cBRApplicantDataBoolFieldView != null ? Boolean.valueOf(cBRApplicantDataBoolFieldView.isChecked()) : null);
        }
        if (formItem instanceof FormItem.Date) {
            CBRApplicantDataCalendarFieldView cBRApplicantDataCalendarFieldView = cBRApplicantDataBaseFieldView instanceof CBRApplicantDataCalendarFieldView ? (CBRApplicantDataCalendarFieldView) cBRApplicantDataBaseFieldView : null;
            if (cBRApplicantDataCalendarFieldView != null) {
                return DateVIewKt.getValueForItem(cBRApplicantDataCalendarFieldView);
            }
            return null;
        }
        if (formItem instanceof FormItem.DateTime) {
            CBRApplicantDataDateTimeFieldView cBRApplicantDataDateTimeFieldView = cBRApplicantDataBaseFieldView instanceof CBRApplicantDataDateTimeFieldView ? (CBRApplicantDataDateTimeFieldView) cBRApplicantDataBaseFieldView : null;
            if (cBRApplicantDataDateTimeFieldView != null) {
                return DateTimeViewKt.getValueForItem(cBRApplicantDataDateTimeFieldView);
            }
            return null;
        }
        if (formItem instanceof FormItem.CountrySelect) {
            CBRApplicantDataSelectionCountryFieldView cBRApplicantDataSelectionCountryFieldView = cBRApplicantDataBaseFieldView instanceof CBRApplicantDataSelectionCountryFieldView ? (CBRApplicantDataSelectionCountryFieldView) cBRApplicantDataBaseFieldView : null;
            if (cBRApplicantDataSelectionCountryFieldView == null || (selectedCountry = cBRApplicantDataSelectionCountryFieldView.getSelectedCountry()) == null) {
                return null;
            }
            return selectedCountry.getCode();
        }
        if (!(formItem instanceof FormItem.FileAttachment)) {
            if (formItem instanceof FormItem.MultiFileAttachments ? true : formItem instanceof FormItem.MultiSelect ? true : formItem instanceof FormItem.Description ? true : formItem instanceof FormItem.Hidden ? true : formItem instanceof FormItem.Section ? true : formItem instanceof FormItem.Subtitle ? true : formItem instanceof FormItem.Title) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        CBRApplicantDataFileFieldView cBRApplicantDataFileFieldView = cBRApplicantDataBaseFieldView instanceof CBRApplicantDataFileFieldView ? (CBRApplicantDataFileFieldView) cBRApplicantDataBaseFieldView : null;
        if (cBRApplicantDataFileFieldView == null || (files = cBRApplicantDataFileFieldView.getFiles()) == null || (attachment = (CBRApplicantDataFileFieldView.Attachment) C42745f0.G(files)) == null) {
            return null;
        }
        return attachment.getId();
    }

    @l
    public static final List<String> getValuesForItem(@k CBRApplicantDataBaseFieldView cBRApplicantDataBaseFieldView, @k FormItem formItem) {
        if (formItem instanceof FormItem.MultiSelect) {
            List<h.e.a.C12451a> selectedItems = ((CBRApplicantDataMutilselectFieldView) cBRApplicantDataBaseFieldView).getSelectedItems();
            ArrayList arrayList = new ArrayList(C42745f0.q(selectedItems, 10));
            Iterator<T> it = selectedItems.iterator();
            while (it.hasNext()) {
                arrayList.add(((h.e.a.C12451a) it.next()).getId());
            }
            return arrayList;
        }
        if (formItem instanceof FormItem.MultiFileAttachments) {
            List<CBRApplicantDataFileFieldView.Attachment> files = ((CBRApplicantDataFileFieldView) cBRApplicantDataBaseFieldView).getFiles();
            ArrayList arrayList2 = new ArrayList(C42745f0.q(files, 10));
            Iterator<T> it2 = files.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((CBRApplicantDataFileFieldView.Attachment) it2.next()).getId());
            }
            if (!arrayList2.isEmpty()) {
                return arrayList2;
            }
        } else {
            if (!(formItem instanceof FormItem.Bool ? true : formItem instanceof FormItem.CountrySelect ? true : formItem instanceof FormItem.Date ? true : formItem instanceof FormItem.DateTime ? true : formItem instanceof FormItem.FileAttachment ? true : formItem instanceof FormItem.Phone ? true : formItem instanceof FormItem.Select ? true : formItem instanceof FormItem.SelectDropdown ? true : formItem instanceof FormItem.Text ? true : formItem instanceof FormItem.TextArea ? true : formItem instanceof FormItem.Hidden ? true : formItem instanceof FormItem.Description ? true : formItem instanceof FormItem.Section ? true : formItem instanceof FormItem.Subtitle ? true : formItem instanceof FormItem.Title)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return null;
    }

    public static final void setValueFromItem(@k CBRApplicantDataBaseFieldView cBRApplicantDataBaseFieldView, @k FormItem formItem, @k FormItemValueProvider formItemValueProvider) throws ParseException {
        if (formItem instanceof FormItem.Text ? true : formItem instanceof FormItem.TextArea) {
            EditText editText = cBRApplicantDataBaseFieldView.getEditText();
            if (editText != null) {
                editText.setText(formItemValueProvider.getValue(formItem));
                return;
            }
            return;
        }
        if (formItem instanceof FormItem.Bool) {
            CBRApplicantDataBoolFieldView cBRApplicantDataBoolFieldView = cBRApplicantDataBaseFieldView instanceof CBRApplicantDataBoolFieldView ? (CBRApplicantDataBoolFieldView) cBRApplicantDataBaseFieldView : null;
            if (cBRApplicantDataBoolFieldView == null) {
                return;
            }
            String value = formItemValueProvider.getValue(formItem);
            cBRApplicantDataBoolFieldView.setChecked(value != null ? Boolean.parseBoolean(value) : false);
            return;
        }
        if (formItem instanceof FormItem.Date) {
            CBRApplicantDataCalendarFieldView cBRApplicantDataCalendarFieldView = cBRApplicantDataBaseFieldView instanceof CBRApplicantDataCalendarFieldView ? (CBRApplicantDataCalendarFieldView) cBRApplicantDataBaseFieldView : null;
            if (cBRApplicantDataCalendarFieldView != null) {
                DateVIewKt.setValueFromItem(cBRApplicantDataCalendarFieldView, formItemValueProvider.getValue(formItem));
                return;
            }
            return;
        }
        if (formItem instanceof FormItem.DateTime) {
            CBRApplicantDataDateTimeFieldView cBRApplicantDataDateTimeFieldView = cBRApplicantDataBaseFieldView instanceof CBRApplicantDataDateTimeFieldView ? (CBRApplicantDataDateTimeFieldView) cBRApplicantDataBaseFieldView : null;
            if (cBRApplicantDataDateTimeFieldView != null) {
                DateTimeViewKt.setValueFromItem(cBRApplicantDataDateTimeFieldView, formItemValueProvider.getValue(formItem));
                return;
            }
            return;
        }
        if (formItem instanceof FormItem.Select) {
            CBRApplicantDataRadioGroupView cBRApplicantDataRadioGroupView = cBRApplicantDataBaseFieldView instanceof CBRApplicantDataRadioGroupView ? (CBRApplicantDataRadioGroupView) cBRApplicantDataBaseFieldView : null;
            if (cBRApplicantDataRadioGroupView != null) {
                SelectViewKt.setValueFromItem(cBRApplicantDataRadioGroupView, formItemValueProvider.getValue(formItem));
                return;
            }
            return;
        }
        if (formItem instanceof FormItem.SelectDropdown) {
            CBRApplicantDataSelectionFieldView cBRApplicantDataSelectionFieldView = cBRApplicantDataBaseFieldView instanceof CBRApplicantDataSelectionFieldView ? (CBRApplicantDataSelectionFieldView) cBRApplicantDataBaseFieldView : null;
            if (cBRApplicantDataSelectionFieldView != null) {
                SelectDropdownViewKt.setValueFromItem(cBRApplicantDataSelectionFieldView, formItemValueProvider.getValue(formItem));
                return;
            }
            return;
        }
        if (formItem instanceof FormItem.CountrySelect) {
            CBRApplicantDataSelectionCountryFieldView cBRApplicantDataSelectionCountryFieldView = cBRApplicantDataBaseFieldView instanceof CBRApplicantDataSelectionCountryFieldView ? (CBRApplicantDataSelectionCountryFieldView) cBRApplicantDataBaseFieldView : null;
            if (cBRApplicantDataSelectionCountryFieldView != null) {
                CountrySelectKt.setValueFromItem(cBRApplicantDataSelectionCountryFieldView, (FormItem.CountrySelect) formItem, formItemValueProvider.getValue(formItem));
                return;
            }
            return;
        }
        if (formItem instanceof FormItem.Phone) {
            CBRApplicantDataPhoneFieldView cBRApplicantDataPhoneFieldView = cBRApplicantDataBaseFieldView instanceof CBRApplicantDataPhoneFieldView ? (CBRApplicantDataPhoneFieldView) cBRApplicantDataBaseFieldView : null;
            if (cBRApplicantDataPhoneFieldView != null) {
                PhoneViewKt.setValueFromItem(cBRApplicantDataPhoneFieldView, (FormItem.Phone) formItem, formItemValueProvider);
                return;
            }
            return;
        }
        if (formItem instanceof FormItem.FileAttachment) {
            CBRApplicantDataFileFieldView cBRApplicantDataFileFieldView = cBRApplicantDataBaseFieldView instanceof CBRApplicantDataFileFieldView ? (CBRApplicantDataFileFieldView) cBRApplicantDataBaseFieldView : null;
            if (cBRApplicantDataFileFieldView != null) {
                FileAttachmentViewKt.setValueFromItem(cBRApplicantDataFileFieldView, (FormItem.FileAttachment) formItem, formItemValueProvider.getValue(formItem));
                return;
            }
            return;
        }
        if (formItem instanceof FormItem.MultiSelect) {
            CBRApplicantDataMutilselectFieldView cBRApplicantDataMutilselectFieldView = cBRApplicantDataBaseFieldView instanceof CBRApplicantDataMutilselectFieldView ? (CBRApplicantDataMutilselectFieldView) cBRApplicantDataBaseFieldView : null;
            if (cBRApplicantDataMutilselectFieldView != null) {
                MultiselectViewKt.setValuesFromQuestionnaire(cBRApplicantDataMutilselectFieldView, (FormItem.MultiSelect) formItem, formItemValueProvider.getValues(formItem));
                return;
            }
            return;
        }
        if (formItem instanceof FormItem.MultiFileAttachments) {
            CBRApplicantDataFileFieldView cBRApplicantDataFileFieldView2 = cBRApplicantDataBaseFieldView instanceof CBRApplicantDataFileFieldView ? (CBRApplicantDataFileFieldView) cBRApplicantDataBaseFieldView : null;
            if (cBRApplicantDataFileFieldView2 != null) {
                MultiFileAttachmentViewKt.setValuesFromQuestionnaire(cBRApplicantDataFileFieldView2, (FormItem.MultiFileAttachments) formItem, formItemValueProvider.getValues(formItem));
            }
        }
    }
}
