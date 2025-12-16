package ru.cyberity.cbr.core.presentation.form.viewutils;

import Y41.l;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import ru.cyberity.cbr.core.presentation.form.FormFieldCallback;
import ru.cyberity.cbr.core.presentation.form.FormItemViewUtilsKt;
import ru.cyberity.cbr.core.presentation.form.model.FormItem;
import ru.cyberity.cbr.core.widget.applicantData.CBRApplicantDataBoolFieldView;

/* compiled from: BoolView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
/* loaded from: classes9.dex */
final class BoolViewKt$createView$1$1 extends N implements l<Boolean, G0> {
    final /* synthetic */ FormFieldCallback $callback;
    final /* synthetic */ FormItem.Bool $this_createView;
    final /* synthetic */ CBRApplicantDataBoolFieldView $view;

    @Override // Y41.l
    public /* bridge */ /* synthetic */ G0 invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return G0.f406611a;
    }

    public final void invoke(boolean z12) {
        FormFieldCallback formFieldCallback = this.$callback;
        if (formFieldCallback != null) {
            FormItem.Bool bool = this.$this_createView;
            formFieldCallback.onValueChanged(bool, FormItemViewUtilsKt.getValueForItem(this.$view, bool));
        }
    }
}
