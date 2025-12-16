package ru.cyberity.cbr.core.presentation.form.viewadapter;

import kotlin.Metadata;
import ru.cyberity.cbr.core.presentation.form.model.FormItem;

/* compiled from: FormItemAdapter.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003*$\b\u0002\u0010\u0006\"\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00050\u00042\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00050\u0004¨\u0006\u0007"}, d2 = {"Lru/cyberity/cbr/core/presentation/form/model/FormItem;", "", "asViewType", "(Lru/cyberity/cbr/core/presentation/form/model/FormItem;)I", "Lru/cyberity/cbr/core/presentation/form/viewadapter/FormItemViewHolder;", "Lru/cyberity/cbr/core/widget/applicantData/CBRApplicantDataBaseFieldView;", "ItemViewHolder", "cyberity-mobile-sdk-ui_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class FormItemAdapterKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int asViewType(FormItem formItem) {
        if (formItem instanceof FormItem.Section) {
            return 4;
        }
        if (formItem instanceof FormItem.Text) {
            return 5;
        }
        if (formItem instanceof FormItem.Date) {
            return 6;
        }
        if (formItem instanceof FormItem.Title) {
            return 0;
        }
        if (formItem instanceof FormItem.Subtitle) {
            return 1;
        }
        if (formItem instanceof FormItem.Description) {
            return 2;
        }
        if (formItem instanceof FormItem.TextArea) {
            return 7;
        }
        if (formItem instanceof FormItem.Bool) {
            return 8;
        }
        if (formItem instanceof FormItem.DateTime) {
            return 9;
        }
        if (formItem instanceof FormItem.Phone) {
            return 10;
        }
        if (formItem instanceof FormItem.CountrySelect) {
            return 11;
        }
        if (formItem instanceof FormItem.Select) {
            return 12;
        }
        if (formItem instanceof FormItem.SelectDropdown) {
            return 13;
        }
        if (formItem instanceof FormItem.MultiSelect) {
            return 14;
        }
        if (formItem instanceof FormItem.FileAttachment) {
            return 15;
        }
        return formItem instanceof FormItem.MultiFileAttachments ? 16 : 3;
    }
}
