package ru.cyberity.cbr.core.presentation.form.viewutils;

import Y41.l;
import Y61.k;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import ru.cyberity.cbr.core.data.model.h;
import ru.cyberity.cbr.core.presentation.form.FormFieldCallback;
import ru.cyberity.cbr.core.presentation.form.FormItemViewUtilsKt;
import ru.cyberity.cbr.core.presentation.form.model.FormItem;
import ru.cyberity.cbr.core.widget.applicantData.CBRApplicantDataSelectionFieldView;

/* compiled from: SelectDropdownView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/cyberity/cbr/core/data/model/h$e$a$a;", "it", "Lkotlin/G0;", "invoke", "(Lru/cyberity/cbr/core/data/model/h$e$a$a;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
/* loaded from: classes9.dex */
final class SelectDropdownViewKt$createView$1$1 extends N implements l<h.e.a.C12451a, G0> {
    final /* synthetic */ FormFieldCallback $callback;
    final /* synthetic */ FormItem.SelectDropdown $this_createView;
    final /* synthetic */ CBRApplicantDataSelectionFieldView $view;

    @Override // Y41.l
    public /* bridge */ /* synthetic */ G0 invoke(h.e.a.C12451a c12451a) {
        invoke2(c12451a);
        return G0.f406611a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@k h.e.a.C12451a c12451a) {
        FormFieldCallback formFieldCallback = this.$callback;
        if (formFieldCallback != null) {
            FormItem.SelectDropdown selectDropdown = this.$this_createView;
            formFieldCallback.onValueChanged(selectDropdown, FormItemViewUtilsKt.getValueForItem(this.$view, selectDropdown));
        }
    }
}
