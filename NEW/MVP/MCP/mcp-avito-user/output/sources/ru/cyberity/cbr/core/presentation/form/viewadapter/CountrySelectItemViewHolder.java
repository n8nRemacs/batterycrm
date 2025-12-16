package ru.cyberity.cbr.core.presentation.form.viewadapter;

import Y61.k;
import Y61.l;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import ru.cyberity.cbr.core.data.listener.CBRCountryPicker;
import ru.cyberity.cbr.core.presentation.form.FormFieldCallback;
import ru.cyberity.cbr.core.presentation.form.FormItemViewUtilsKt;
import ru.cyberity.cbr.core.presentation.form.model.FormItem;
import ru.cyberity.cbr.core.widget.applicantData.CBRApplicantDataSelectionCountryFieldView;

/* compiled from: CountrySelectItemViewHolder.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\u000fR$\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/cyberity/cbr/core/presentation/form/viewadapter/CountrySelectItemViewHolder;", "Lru/cyberity/cbr/core/presentation/form/viewadapter/FormItemViewHolder;", "Lru/cyberity/cbr/core/presentation/form/model/FormItem$CountrySelect;", "Lru/cyberity/cbr/core/widget/applicantData/CBRApplicantDataSelectionCountryFieldView;", "itemView", "Lru/cyberity/cbr/core/presentation/form/FormFieldCallback;", "callback", "<init>", "(Lru/cyberity/cbr/core/widget/applicantData/CBRApplicantDataSelectionCountryFieldView;Lru/cyberity/cbr/core/presentation/form/FormFieldCallback;)V", "view", "item", "", "itemCount", "Lkotlin/G0;", "onBind", "(Lru/cyberity/cbr/core/widget/applicantData/CBRApplicantDataSelectionCountryFieldView;Lru/cyberity/cbr/core/presentation/form/model/FormItem$CountrySelect;I)V", "Lru/cyberity/cbr/core/presentation/form/FormFieldCallback;", "getCallback", "()Lru/cyberity/cbr/core/presentation/form/FormFieldCallback;", "setCallback", "(Lru/cyberity/cbr/core/presentation/form/FormFieldCallback;)V", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class CountrySelectItemViewHolder extends FormItemViewHolder<FormItem.CountrySelect, CBRApplicantDataSelectionCountryFieldView> {

    @l
    private FormFieldCallback callback;

    /* compiled from: CountrySelectItemViewHolder.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/cyberity/cbr/core/data/listener/CBRCountryPicker$CountryItem;", "it", "Lkotlin/G0;", "invoke", "(Lru/cyberity/cbr/core/data/listener/CBRCountryPicker$CountryItem;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* renamed from: ru.cyberity.cbr.core.presentation.form.viewadapter.CountrySelectItemViewHolder$onBind$1, reason: invalid class name */
    public static final class AnonymousClass1 extends N implements Y41.l<CBRCountryPicker.CountryItem, G0> {
        final /* synthetic */ FormItem.CountrySelect $item;
        final /* synthetic */ CBRApplicantDataSelectionCountryFieldView $view;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(FormItem.CountrySelect countrySelect, CBRApplicantDataSelectionCountryFieldView cBRApplicantDataSelectionCountryFieldView) {
            super(1);
            this.$item = countrySelect;
            this.$view = cBRApplicantDataSelectionCountryFieldView;
        }

        @Override // Y41.l
        public /* bridge */ /* synthetic */ G0 invoke(CBRCountryPicker.CountryItem countryItem) {
            invoke2(countryItem);
            return G0.f406611a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@k CBRCountryPicker.CountryItem countryItem) {
            FormFieldCallback callback = CountrySelectItemViewHolder.this.getCallback();
            if (callback != null) {
                FormItem.CountrySelect countrySelect = this.$item;
                callback.onValueChanged(countrySelect, FormItemViewUtilsKt.getValueForItem(this.$view, countrySelect));
            }
        }
    }

    public CountrySelectItemViewHolder(@k CBRApplicantDataSelectionCountryFieldView cBRApplicantDataSelectionCountryFieldView, @l FormFieldCallback formFieldCallback) {
        super(cBRApplicantDataSelectionCountryFieldView);
        this.callback = formFieldCallback;
    }

    @l
    public final FormFieldCallback getCallback() {
        return this.callback;
    }

    @Override // ru.cyberity.cbr.core.presentation.form.viewadapter.FormItemViewHolder
    public void onBind(@k CBRApplicantDataSelectionCountryFieldView view, @k FormItem.CountrySelect item, int itemCount) {
        view.setItems(CBRCountryPicker.CountryItem.INSTANCE.fromMap(item.getCountriesMap()));
        view.setOnCountrySelectedCallback(new AnonymousClass1(item, view));
    }
}
