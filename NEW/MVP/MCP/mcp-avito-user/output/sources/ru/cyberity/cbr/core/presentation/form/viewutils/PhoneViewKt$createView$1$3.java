package ru.cyberity.cbr.core.presentation.form.viewutils;

import Y41.l;
import androidx.camera.camera2.internal.G;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import ru.cyberity.cbr.core.data.listener.CBRCountryPicker;
import ru.cyberity.cbr.core.data.model.remote.c;
import ru.cyberity.cbr.core.presentation.form.FormFieldCallback;
import ru.cyberity.cbr.core.presentation.form.FormItemViewUtilsKt;
import ru.cyberity.cbr.core.presentation.form.model.FormItem;
import ru.cyberity.cbr.core.presentation.form.model.FormItemExtensionsKt;
import ru.cyberity.cbr.core.widget.PhoneKit;
import ru.cyberity.cbr.core.widget.applicantData.CBRApplicantDataPhoneFieldView;
import ru.cyberity.log.a;
import ru.cyberity.log.logger.Logger;

/* compiled from: PhoneView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "value", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
/* loaded from: classes9.dex */
final class PhoneViewKt$createView$1$3 extends N implements l<String, G0> {
    final /* synthetic */ FormFieldCallback $callback;
    final /* synthetic */ PhoneKit $phoneNumberKit;
    final /* synthetic */ FormItem.Phone $this_createView;
    final /* synthetic */ CBRApplicantDataPhoneFieldView $view;

    @Override // Y41.l
    public /* bridge */ /* synthetic */ G0 invoke(String str) {
        invoke2(str);
        return G0.f406611a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@Y61.l String str) {
        Logger.v$default(a.f436064a, "CBRApplicantDataPhoneFieldView", G.f("textChangedCallback: ", str), null, 4, null);
        CBRCountryPicker.CountryItem country = this.$phoneNumberKit.getCountry();
        if (country != null) {
            FormFieldCallback formFieldCallback = this.$callback;
            FormItem.Phone phone = this.$this_createView;
            if (formFieldCallback != null) {
                formFieldCallback.onValueChanged(FormItemExtensionsKt.getInternalCountryCodeItem(phone), country.getCode());
            }
        }
        c mask = this.$phoneNumberKit.getMask();
        if (mask != null) {
            FormFieldCallback formFieldCallback2 = this.$callback;
            FormItem.Phone phone2 = this.$this_createView;
            if (formFieldCallback2 != null) {
                formFieldCallback2.onValueChanged(FormItemExtensionsKt.getInternalCountryPhoneCodeItem(phone2), mask.c());
            }
        }
        FormFieldCallback formFieldCallback3 = this.$callback;
        if (formFieldCallback3 != null) {
            FormItem.Phone phone3 = this.$this_createView;
            formFieldCallback3.onValueChanged(phone3, FormItemViewUtilsKt.getValueForItem(this.$view, phone3));
        }
    }
}
