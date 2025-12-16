package ru.cyberity.cbr.core.presentation.form.model;

import Y61.k;
import Y61.l;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.text.C43066x;
import ru.cyberity.cbr.core.data.model.FieldType;
import ru.cyberity.cbr.core.data.model.q;
import ru.cyberity.cbr.core.data.model.remote.c;
import ru.cyberity.cbr.core.data.source.applicant.remote.g;
import ru.cyberity.cbr.core.data.source.applicant.remote.h;
import ru.cyberity.cbr.core.data.source.applicant.remote.o;
import ru.cyberity.cbr.core.presentation.form.FormItemValueProvider;
import ru.cyberity.cbr.core.presentation.form.HostViewModel;
import ru.cyberity.cbr.core.presentation.form.model.FormItem;
import ru.cyberity.cbr.core.presentation.util.ApplicantDataFieldFormatUtilsKt;
import ru.cyberity.cbr.core.widget.autocompletePhone.util.ExtensionsKt;

/* compiled from: FormItemExtensions.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a \u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000\u001a\u0014\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0000\u001a\u0014\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\t\u001a\u0018\u0010\r\u001a\u0004\u0018\u00010\u0005*\u00020\f2\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0000\"\u0018\u0010\u0011\u001a\u00020\u0007*\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\"\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0012*\u0004\u0018\u00010\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\"\u0015\u0010\u0019\u001a\u00020\u0000*\u00020\u00168F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018\"\u0015\u0010\u001b\u001a\u00020\u0000*\u00020\u00168F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0018¨\u0006\u001c"}, d2 = {"Lru/cyberity/cbr/core/presentation/form/model/FormItem;", "Lru/cyberity/cbr/core/presentation/form/HostViewModel$ValidationStrings;", "strings", "Lru/cyberity/cbr/core/presentation/form/FormItemValueProvider;", "valueProvider", "", "findError", "", "check", "", "error", "copyWithError", "Lru/cyberity/cbr/core/presentation/form/model/FieldError;", "getErrorMessage", "Lru/cyberity/cbr/core/presentation/form/model/FormItem$MultiFileAttachments;", "getHasRequiredDocsRange", "(Lru/cyberity/cbr/core/presentation/form/model/FormItem$MultiFileAttachments;)Z", "hasRequiredDocsRange", "Lru/cyberity/cbr/core/data/model/q;", "getMappedItemFormat", "(Lru/cyberity/cbr/core/presentation/form/model/FormItem$MultiFileAttachments;)Lru/cyberity/cbr/core/data/model/q;", "mappedItemFormat", "Lru/cyberity/cbr/core/presentation/form/model/FormItem$Phone;", "getInternalCountryCodeItem", "(Lru/cyberity/cbr/core/presentation/form/model/FormItem$Phone;)Lru/cyberity/cbr/core/presentation/form/model/FormItem;", "internalCountryCodeItem", "getInternalCountryPhoneCodeItem", "internalCountryPhoneCodeItem", "cyberity-mobile-sdk-ui_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class FormItemExtensionsKt {

    /* compiled from: FormItemExtensions.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FieldError.values().length];
            iArr[FieldError.REQUIRED.ordinal()] = 1;
            iArr[FieldError.NOT_VALID.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final boolean check(@k FormItem formItem, @k FormItemValueProvider formItemValueProvider) {
        if (formItem instanceof FormItem.Text ? true : formItem instanceof FormItem.TextArea ? true : formItem instanceof FormItem.Bool ? true : formItem instanceof FormItem.Date ? true : formItem instanceof FormItem.DateTime ? true : formItem instanceof FormItem.CountrySelect) {
            return QuestionnaireResponseExtensionsKt.check(formItem.getItem(), formItemValueProvider.getValue(formItem)) == null;
        }
        if (formItem instanceof FormItem.SelectDropdown) {
            h item = formItem.getItem();
            String value = formItemValueProvider.getValue(formItem);
            List<o> listR = formItem.getItem().r();
            if (listR == null) {
                listR = C42784z0.f406748b;
            }
            return QuestionnaireResponseExtensionsKt.check(item, value, listR) == null;
        }
        if (formItem instanceof FormItem.Phone) {
            String value2 = formItemValueProvider.getValue(getInternalCountryCodeItem((FormItem.Phone) formItem));
            String value3 = formItemValueProvider.getValue(formItem);
            if (value3 == null) {
                value3 = "";
            }
            String strA = c.INSTANCE.a(value2, value3);
            Object objCheck = QuestionnaireResponseExtensionsKt.check(formItem.getItem(), strA);
            if (objCheck == null) {
                objCheck = !ExtensionsKt.isPhoneDigitCountValid(value3) && !C43066x.K(strA) ? formItem : null;
            }
            return !((L.f(formItem.getItem().getRequired(), Boolean.TRUE) && C43066x.K(strA)) || objCheck != null);
        }
        if (formItem instanceof FormItem.Select) {
            String value4 = formItemValueProvider.getValue(formItem);
            boolean z12 = value4 == null || value4.length() == 0;
            if (!L.f(formItem.getItem().getRequired(), Boolean.TRUE) || !z12) {
                return true;
            }
        } else if (formItem instanceof FormItem.MultiSelect) {
            List<String> values = formItemValueProvider.getValues(formItem);
            boolean z13 = values == null || values.isEmpty();
            if (!L.f(formItem.getItem().getRequired(), Boolean.TRUE) || !z13) {
                return true;
            }
        } else if (formItem instanceof FormItem.FileAttachment) {
            String value5 = formItemValueProvider.getValue(formItem);
            if (!L.f(formItem.getItem().getRequired(), Boolean.TRUE) || value5 != null) {
                return true;
            }
        } else {
            if (!(formItem instanceof FormItem.MultiFileAttachments)) {
                if (formItem instanceof FormItem.Description ? true : formItem instanceof FormItem.Hidden ? true : formItem instanceof FormItem.Section ? true : formItem instanceof FormItem.Subtitle ? true : formItem instanceof FormItem.Title) {
                    return true;
                }
                throw new NoWhenBranchMatchedException();
            }
            List<String> values2 = formItemValueProvider.getValues(formItem);
            if (values2 == null) {
                values2 = C42784z0.f406748b;
            }
            boolean z14 = formItem.isRequired() || (!values2.isEmpty() && getHasRequiredDocsRange((FormItem.MultiFileAttachments) formItem));
            String strValueOf = String.valueOf(values2.size());
            q mappedItemFormat = getMappedItemFormat((FormItem.MultiFileAttachments) formItem);
            if (!z14 || ApplicantDataFieldFormatUtilsKt.checkField(mappedItemFormat, strValueOf)) {
                return true;
            }
        }
        return false;
    }

    @k
    public static final FormItem copyWithError(@k FormItem formItem, @l CharSequence charSequence) {
        if (formItem instanceof FormItem.Date) {
            return FormItem.Date.copy$default((FormItem.Date) formItem, null, null, false, null, charSequence, 15, null);
        }
        if (formItem instanceof FormItem.DateTime) {
            return FormItem.DateTime.copy$default((FormItem.DateTime) formItem, null, null, null, charSequence, 7, null);
        }
        if (formItem instanceof FormItem.MultiSelect) {
            return FormItem.MultiSelect.copy$default((FormItem.MultiSelect) formItem, null, null, null, charSequence, false, 23, null);
        }
        if (formItem instanceof FormItem.Select) {
            return FormItem.Select.copy$default((FormItem.Select) formItem, null, null, null, charSequence, 7, null);
        }
        if (formItem instanceof FormItem.Text) {
            return FormItem.Text.copy$default((FormItem.Text) formItem, null, null, null, false, charSequence, null, 47, null);
        }
        if (formItem instanceof FormItem.TextArea) {
            return FormItem.TextArea.copy$default((FormItem.TextArea) formItem, null, null, null, charSequence, 7, null);
        }
        if (formItem instanceof FormItem.Bool) {
            return FormItem.Bool.copy$default((FormItem.Bool) formItem, null, null, null, charSequence, 7, null);
        }
        if (formItem instanceof FormItem.FileAttachment) {
            FormItem.FileAttachment fileAttachment = (FormItem.FileAttachment) formItem;
            return fileAttachment.copy((239 & 1) != 0 ? fileAttachment.getItem() : null, (239 & 2) != 0 ? fileAttachment.getSectionId() : null, (239 & 4) != 0 ? fileAttachment.getValue() : null, (239 & 8) != 0 ? fileAttachment.hint : null, (239 & 16) != 0 ? fileAttachment.getError() : charSequence, (239 & 32) != 0 ? fileAttachment.fileState : null, (239 & 64) != 0 ? fileAttachment.state : null, (239 & 128) != 0 ? fileAttachment.previewUrl : null);
        }
        if (formItem instanceof FormItem.MultiFileAttachments) {
            FormItem.MultiFileAttachments multiFileAttachments = (FormItem.MultiFileAttachments) formItem;
            return multiFileAttachments.copy((495 & 1) != 0 ? multiFileAttachments.getItem() : null, (495 & 2) != 0 ? multiFileAttachments.getSectionId() : null, (495 & 4) != 0 ? multiFileAttachments.getValues() : null, (495 & 8) != 0 ? multiFileAttachments.hint : null, (495 & 16) != 0 ? multiFileAttachments.getError() : charSequence, (495 & 32) != 0 ? multiFileAttachments.getIsMultivalued() : false, (495 & 64) != 0 ? multiFileAttachments.fileStates : null, (495 & 128) != 0 ? multiFileAttachments.state : null, (495 & 256) != 0 ? multiFileAttachments.previewUrls : null);
        }
        if (formItem instanceof FormItem.Phone) {
            FormItem.Phone phone = (FormItem.Phone) formItem;
            return phone.copy((127 & 1) != 0 ? phone.getSectionId() : null, (127 & 2) != 0 ? phone.getItem() : null, (127 & 4) != 0 ? phone.countriesMap : null, (127 & 8) != 0 ? phone.phoneMaskMap : null, (127 & 16) != 0 ? phone.defaultCountry : null, (127 & 32) != 0 ? phone.skipInvalidValues : false, (127 & 64) != 0 ? phone.getValue() : null, (127 & 128) != 0 ? phone.getError() : charSequence);
        }
        if (formItem instanceof FormItem.SelectDropdown) {
            return FormItem.SelectDropdown.copy$default((FormItem.SelectDropdown) formItem, null, null, null, false, charSequence, 15, null);
        }
        if (formItem instanceof FormItem.CountrySelect) {
            return FormItem.CountrySelect.copy$default((FormItem.CountrySelect) formItem, null, null, null, null, false, charSequence, 31, null);
        }
        if (formItem instanceof FormItem.Description ? true : formItem instanceof FormItem.Hidden ? true : formItem instanceof FormItem.Section ? true : formItem instanceof FormItem.Subtitle ? true : formItem instanceof FormItem.Title) {
            return formItem;
        }
        throw new NoWhenBranchMatchedException();
    }

    @l
    public static final String findError(@k FormItem formItem, @l HostViewModel.ValidationStrings validationStrings, @k FormItemValueProvider formItemValueProvider) {
        if (formItem instanceof FormItem.Text ? true : formItem instanceof FormItem.TextArea ? true : formItem instanceof FormItem.Bool ? true : formItem instanceof FormItem.Date ? true : formItem instanceof FormItem.DateTime ? true : formItem instanceof FormItem.CountrySelect ? true : formItem instanceof FormItem.SelectDropdown) {
            FieldError fieldErrorCheck = QuestionnaireResponseExtensionsKt.check(formItem.getItem(), formItemValueProvider.getValue(formItem));
            if (fieldErrorCheck != null) {
                return getErrorMessage(fieldErrorCheck, validationStrings);
            }
        } else if (formItem instanceof FormItem.Phone) {
            String value = formItemValueProvider.getValue(getInternalCountryCodeItem((FormItem.Phone) formItem));
            String value2 = formItemValueProvider.getValue(formItem);
            if (value2 == null) {
                value2 = "";
            }
            FieldError fieldErrorCheck2 = QuestionnaireResponseExtensionsKt.check(formItem.getItem(), c.INSTANCE.a(value, value2));
            if (fieldErrorCheck2 == null && !ExtensionsKt.isPhoneDigitCountValid(value2)) {
                return getErrorMessage(FieldError.NOT_VALID, validationStrings);
            }
            if (fieldErrorCheck2 != null) {
                return getErrorMessage(fieldErrorCheck2, validationStrings);
            }
        } else {
            if (formItem instanceof FormItem.MultiSelect ? true : formItem instanceof FormItem.Select ? true : formItem instanceof FormItem.FileAttachment ? true : formItem instanceof FormItem.MultiFileAttachments) {
                String errorMessage = getErrorMessage(FieldError.REQUIRED, validationStrings);
                if (!check(formItem, formItemValueProvider)) {
                    return errorMessage;
                }
            } else {
                if (!(formItem instanceof FormItem.Description ? true : formItem instanceof FormItem.Hidden ? true : formItem instanceof FormItem.Section ? true : formItem instanceof FormItem.Subtitle ? true : formItem instanceof FormItem.Title)) {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
        return null;
    }

    @l
    public static final String getErrorMessage(@k FieldError fieldError, @l HostViewModel.ValidationStrings validationStrings) {
        int i12 = WhenMappings.$EnumSwitchMapping$0[fieldError.ordinal()];
        if (i12 != 1) {
            if (i12 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            if (validationStrings != null) {
                return validationStrings.getIsNotValid();
            }
        } else if (validationStrings != null) {
            return validationStrings.getIsRequired();
        }
        return null;
    }

    private static final boolean getHasRequiredDocsRange(FormItem.MultiFileAttachments multiFileAttachments) {
        q fieldFormat = QuestionnaireResponseExtensionsKt.getFieldFormat(multiFileAttachments.getItem());
        if (fieldFormat != null) {
            return ((fieldFormat instanceof q.d) && ((int) ((q.d) fieldFormat).getValue().getMin()) > 0) || ((fieldFormat instanceof q.j) && (((q.j) fieldFormat).getValue() > 0.0d ? 1 : (((q.j) fieldFormat).getValue() == 0.0d ? 0 : -1)) > 0);
        }
        return false;
    }

    @k
    public static final FormItem getInternalCountryCodeItem(@k FormItem.Phone phone) {
        return new FormItem.Hidden("internal." + phone.getSectionId(), new h(phone.getItem().getId() + ".countryCode", (String) null, (String) null, FieldType.text.name(), Boolean.FALSE, (String) null, (String) null, (String) null, (List) null, 480, (C42822w) null));
    }

    @k
    public static final FormItem getInternalCountryPhoneCodeItem(@k FormItem.Phone phone) {
        return new FormItem.Hidden("internal." + phone.getSectionId(), new h(phone.getItem().getId() + ".countryPhoneCode", (String) null, (String) null, FieldType.text.name(), Boolean.FALSE, (String) null, (String) null, (String) null, (List) null, 480, (C42822w) null));
    }

    private static final q getMappedItemFormat(FormItem.MultiFileAttachments multiFileAttachments) {
        q fieldFormat;
        if (multiFileAttachments == null || (fieldFormat = QuestionnaireResponseExtensionsKt.getFieldFormat(multiFileAttachments.getItem())) == null) {
            return null;
        }
        return ((fieldFormat instanceof q.h) && multiFileAttachments.isRequired()) ? new q.d(new g(1.0d, ((q.h) fieldFormat).getValue())) : fieldFormat;
    }
}
