package ru.cyberity.cbr.core.presentation.form.viewutils;

import Y41.l;
import Y61.k;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import ru.cyberity.cbr.core.presentation.form.FormFieldCallback;
import ru.cyberity.cbr.core.presentation.form.FormItemViewUtilsKt;
import ru.cyberity.cbr.core.presentation.form.model.FormItem;
import ru.cyberity.cbr.core.widget.applicantData.CBRApplicantDataRadioGroupView;

/* compiled from: SelectView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "selectedValue", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
/* loaded from: classes9.dex */
final class SelectViewKt$createView$1$1 extends N implements l<String, G0> {
    final /* synthetic */ FormFieldCallback $callback;
    final /* synthetic */ FormItem.Select $this_createView;
    final /* synthetic */ CBRApplicantDataRadioGroupView $view;

    @Override // Y41.l
    public /* bridge */ /* synthetic */ G0 invoke(String str) {
        invoke2(str);
        return G0.f406611a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@k String str) {
        FormFieldCallback formFieldCallback;
        if (!FormItemViewUtilsKt.check(this.$view, this.$this_createView) || (formFieldCallback = this.$callback) == null) {
            return;
        }
        formFieldCallback.onValueChanged(this.$this_createView, str);
    }
}
