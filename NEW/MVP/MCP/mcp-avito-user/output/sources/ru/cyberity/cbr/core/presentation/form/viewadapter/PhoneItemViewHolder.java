package ru.cyberity.cbr.core.presentation.form.viewadapter;

import Y41.a;
import Y61.k;
import Y61.l;
import androidx.camera.camera2.internal.G;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import ru.cyberity.cbr.core.data.listener.CBRCountryPicker;
import ru.cyberity.cbr.core.data.model.remote.c;
import ru.cyberity.cbr.core.presentation.form.FormFieldCallback;
import ru.cyberity.cbr.core.presentation.form.FormItemViewUtilsKt;
import ru.cyberity.cbr.core.presentation.form.model.FormItem;
import ru.cyberity.cbr.core.presentation.form.model.FormItemExtensionsKt;
import ru.cyberity.cbr.core.widget.PhoneKit;
import ru.cyberity.cbr.core.widget.applicantData.CBRApplicantDataPhoneFieldView;
import ru.cyberity.cbr.core.widget.autocompletePhone.PhoneKitProviderKt;
import ru.cyberity.cbr.core.widget.autocompletePhone.ValidationListener;
import ru.cyberity.log.logger.Logger;

/* compiled from: PhoneItemViewHolder.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\u000fR$\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017¨\u0006\u0019"}, d2 = {"Lru/cyberity/cbr/core/presentation/form/viewadapter/PhoneItemViewHolder;", "Lru/cyberity/cbr/core/presentation/form/viewadapter/FormItemViewHolder;", "Lru/cyberity/cbr/core/presentation/form/model/FormItem$Phone;", "Lru/cyberity/cbr/core/widget/applicantData/CBRApplicantDataPhoneFieldView;", "itemView", "Lru/cyberity/cbr/core/presentation/form/FormFieldCallback;", "callback", "<init>", "(Lru/cyberity/cbr/core/widget/applicantData/CBRApplicantDataPhoneFieldView;Lru/cyberity/cbr/core/presentation/form/FormFieldCallback;)V", "view", "item", "", "itemCount", "Lkotlin/G0;", "onBind", "(Lru/cyberity/cbr/core/widget/applicantData/CBRApplicantDataPhoneFieldView;Lru/cyberity/cbr/core/presentation/form/model/FormItem$Phone;I)V", "Lru/cyberity/cbr/core/presentation/form/FormFieldCallback;", "getCallback", "()Lru/cyberity/cbr/core/presentation/form/FormFieldCallback;", "setCallback", "(Lru/cyberity/cbr/core/presentation/form/FormFieldCallback;)V", "Lru/cyberity/cbr/core/presentation/form/model/FormItem;", "internalCountryCodeItem", "Lru/cyberity/cbr/core/presentation/form/model/FormItem;", "internalCountryPhoneCodeItem", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class PhoneItemViewHolder extends FormItemViewHolder<FormItem.Phone, CBRApplicantDataPhoneFieldView> {

    @l
    private FormFieldCallback callback;
    private FormItem internalCountryCodeItem;
    private FormItem internalCountryPhoneCodeItem;

    /* compiled from: PhoneItemViewHolder.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "value", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    /* renamed from: ru.cyberity.cbr.core.presentation.form.viewadapter.PhoneItemViewHolder$onBind$1, reason: invalid class name */
    public static final class AnonymousClass1 extends N implements Y41.l<String, String> {
        final /* synthetic */ PhoneKit $phoneNumberKit;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PhoneKit phoneKit) {
            super(1);
            this.$phoneNumberKit = phoneKit;
        }

        @Override // Y41.l
        @k
        public final String invoke(@k String str) {
            String strA;
            c mask = this.$phoneNumberKit.getMask();
            return (mask == null || (strA = mask.a(str)) == null) ? "" : strA;
        }
    }

    /* compiled from: PhoneItemViewHolder.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 7, 1}, xi = 48)
    /* renamed from: ru.cyberity.cbr.core.presentation.form.viewadapter.PhoneItemViewHolder$onBind$2, reason: invalid class name */
    public static final class AnonymousClass2 extends N implements a<Boolean> {
        final /* synthetic */ PhoneKit $phoneNumberKit;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(PhoneKit phoneKit) {
            super(0);
            this.$phoneNumberKit = phoneKit;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // Y41.a
        @k
        public final Boolean invoke() {
            return Boolean.valueOf(this.$phoneNumberKit.isValid());
        }
    }

    /* compiled from: PhoneItemViewHolder.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "value", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* renamed from: ru.cyberity.cbr.core.presentation.form.viewadapter.PhoneItemViewHolder$onBind$3, reason: invalid class name */
    public static final class AnonymousClass3 extends N implements Y41.l<String, G0> {
        final /* synthetic */ FormItem.Phone $item;
        final /* synthetic */ PhoneKit $phoneNumberKit;
        final /* synthetic */ CBRApplicantDataPhoneFieldView $view;
        final /* synthetic */ PhoneItemViewHolder this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(PhoneKit phoneKit, PhoneItemViewHolder phoneItemViewHolder, FormItem.Phone phone, CBRApplicantDataPhoneFieldView cBRApplicantDataPhoneFieldView) {
            super(1);
            this.$phoneNumberKit = phoneKit;
            this.this$0 = phoneItemViewHolder;
            this.$item = phone;
            this.$view = cBRApplicantDataPhoneFieldView;
        }

        @Override // Y41.l
        public /* bridge */ /* synthetic */ G0 invoke(String str) {
            invoke2(str);
            return G0.f406611a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@l String str) {
            PhoneItemViewHolder phoneItemViewHolder;
            FormFieldCallback callback;
            PhoneItemViewHolder phoneItemViewHolder2;
            FormFieldCallback callback2;
            Logger.v$default(ru.cyberity.log.a.f436064a, "CBRApplicantDataPhoneFieldView", G.f("textChangedCallback: ", str), null, 4, null);
            CBRCountryPicker.CountryItem country = this.$phoneNumberKit.getCountry();
            if (country != null && (callback2 = (phoneItemViewHolder2 = this.this$0).getCallback()) != null) {
                FormItem formItem = phoneItemViewHolder2.internalCountryCodeItem;
                if (formItem == null) {
                    formItem = null;
                }
                callback2.onValueChanged(formItem, country.getCode());
            }
            c mask = this.$phoneNumberKit.getMask();
            if (mask != null && (callback = (phoneItemViewHolder = this.this$0).getCallback()) != null) {
                FormItem formItem2 = phoneItemViewHolder.internalCountryPhoneCodeItem;
                callback.onValueChanged(formItem2 != null ? formItem2 : null, mask.c());
            }
            FormFieldCallback callback3 = this.this$0.getCallback();
            if (callback3 != null) {
                FormItem.Phone phone = this.$item;
                callback3.onValueChanged(phone, FormItemViewUtilsKt.getValueForItem(this.$view, phone));
            }
        }
    }

    /* compiled from: PhoneItemViewHolder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* renamed from: ru.cyberity.cbr.core.presentation.form.viewadapter.PhoneItemViewHolder$onBind$4, reason: invalid class name */
    public static final class AnonymousClass4 extends N implements a<G0> {
        final /* synthetic */ PhoneKit $phoneNumberKit;
        final /* synthetic */ PhoneItemViewHolder this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(PhoneKit phoneKit, PhoneItemViewHolder phoneItemViewHolder) {
            super(0);
            this.$phoneNumberKit = phoneKit;
            this.this$0 = phoneItemViewHolder;
        }

        @Override // Y41.a
        public /* bridge */ /* synthetic */ G0 invoke() {
            invoke2();
            return G0.f406611a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$phoneNumberKit.detach(this.this$0.getContext());
        }
    }

    public PhoneItemViewHolder(@k CBRApplicantDataPhoneFieldView cBRApplicantDataPhoneFieldView, @l FormFieldCallback formFieldCallback) {
        super(cBRApplicantDataPhoneFieldView);
        this.callback = formFieldCallback;
    }

    @l
    public final FormFieldCallback getCallback() {
        return this.callback;
    }

    @Override // ru.cyberity.cbr.core.presentation.form.viewadapter.FormItemViewHolder
    public void onBind(@k CBRApplicantDataPhoneFieldView view, @k final FormItem.Phone item, int itemCount) {
        this.internalCountryCodeItem = FormItemExtensionsKt.getInternalCountryCodeItem(item);
        this.internalCountryPhoneCodeItem = FormItemExtensionsKt.getInternalCountryPhoneCodeItem(item);
        Set<Map.Entry<String, String>> setEntrySet = item.getCountriesMap().entrySet();
        ArrayList arrayList = new ArrayList(C42745f0.q(setEntrySet, 10));
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            arrayList.add(new CBRCountryPicker.CountryItem((String) entry.getKey(), (String) entry.getValue()));
        }
        if (arrayList.isEmpty()) {
            return;
        }
        view.clear();
        PhoneKit phoneKit$default = PhoneKitProviderKt.getPhoneKit$default(view.getPhoneInputLayout(), item.getCountriesMap(), item.getPhoneMaskMap(), new ValidationListener() { // from class: ru.cyberity.cbr.core.presentation.form.viewadapter.PhoneItemViewHolder$onBind$phoneNumberKit$1
            @Override // ru.cyberity.cbr.core.widget.autocompletePhone.ValidationListener
            public void onValidate(boolean isValid, boolean isBlank) {
                FormFieldCallback callback = this.this$0.getCallback();
                if (callback != null) {
                    callback.onValidatePhone(item, isValid, isBlank);
                }
            }
        }, null, 16, null);
        view.setPhoneNumberPurifier(new AnonymousClass1(phoneKit$default));
        if (!item.getSkipInvalidValues()) {
            view.setPhoneNumberValidator(new AnonymousClass2(phoneKit$default));
        }
        PhoneKit.attachToInput$default(phoneKit$default, view.getPhoneInputLayout(), arrayList, null, null, 8, null);
        view.setTextChangedCallback(new AnonymousClass3(phoneKit$default, this, item, view));
        view.setOnClear(new AnonymousClass4(phoneKit$default, this));
    }
}
