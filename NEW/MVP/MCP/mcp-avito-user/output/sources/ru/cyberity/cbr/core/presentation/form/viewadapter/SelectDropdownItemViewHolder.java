package ru.cyberity.cbr.core.presentation.form.viewadapter;

import Y61.k;
import Y61.l;
import java.util.ArrayList;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.N;
import ru.cyberity.cbr.core.data.model.h;
import ru.cyberity.cbr.core.data.source.applicant.remote.o;
import ru.cyberity.cbr.core.presentation.form.FormFieldCallback;
import ru.cyberity.cbr.core.presentation.form.FormItemViewUtilsKt;
import ru.cyberity.cbr.core.presentation.form.model.FormItem;
import ru.cyberity.cbr.core.widget.applicantData.CBRApplicantDataSelectionFieldView;

/* compiled from: SelectDropdownItemViewHolder.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\u000fR$\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/cyberity/cbr/core/presentation/form/viewadapter/SelectDropdownItemViewHolder;", "Lru/cyberity/cbr/core/presentation/form/viewadapter/FormItemViewHolder;", "Lru/cyberity/cbr/core/presentation/form/model/FormItem$SelectDropdown;", "Lru/cyberity/cbr/core/widget/applicantData/CBRApplicantDataSelectionFieldView;", "itemView", "Lru/cyberity/cbr/core/presentation/form/FormFieldCallback;", "callback", "<init>", "(Lru/cyberity/cbr/core/widget/applicantData/CBRApplicantDataSelectionFieldView;Lru/cyberity/cbr/core/presentation/form/FormFieldCallback;)V", "view", "item", "", "itemCount", "Lkotlin/G0;", "onBind", "(Lru/cyberity/cbr/core/widget/applicantData/CBRApplicantDataSelectionFieldView;Lru/cyberity/cbr/core/presentation/form/model/FormItem$SelectDropdown;I)V", "Lru/cyberity/cbr/core/presentation/form/FormFieldCallback;", "getCallback", "()Lru/cyberity/cbr/core/presentation/form/FormFieldCallback;", "setCallback", "(Lru/cyberity/cbr/core/presentation/form/FormFieldCallback;)V", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class SelectDropdownItemViewHolder extends FormItemViewHolder<FormItem.SelectDropdown, CBRApplicantDataSelectionFieldView> {

    @l
    private FormFieldCallback callback;

    /* compiled from: SelectDropdownItemViewHolder.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/cyberity/cbr/core/data/model/h$e$a$a;", "it", "Lkotlin/G0;", "invoke", "(Lru/cyberity/cbr/core/data/model/h$e$a$a;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* renamed from: ru.cyberity.cbr.core.presentation.form.viewadapter.SelectDropdownItemViewHolder$onBind$1, reason: invalid class name */
    public static final class AnonymousClass1 extends N implements Y41.l<h.e.a.C12451a, G0> {
        final /* synthetic */ FormItem.SelectDropdown $item;
        final /* synthetic */ CBRApplicantDataSelectionFieldView $view;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(FormItem.SelectDropdown selectDropdown, CBRApplicantDataSelectionFieldView cBRApplicantDataSelectionFieldView) {
            super(1);
            this.$item = selectDropdown;
            this.$view = cBRApplicantDataSelectionFieldView;
        }

        @Override // Y41.l
        public /* bridge */ /* synthetic */ G0 invoke(h.e.a.C12451a c12451a) {
            invoke2(c12451a);
            return G0.f406611a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@k h.e.a.C12451a c12451a) {
            FormFieldCallback callback = SelectDropdownItemViewHolder.this.getCallback();
            if (callback != null) {
                FormItem.SelectDropdown selectDropdown = this.$item;
                callback.onValueChanged(selectDropdown, FormItemViewUtilsKt.getValueForItem(this.$view, selectDropdown));
            }
        }
    }

    public SelectDropdownItemViewHolder(@k CBRApplicantDataSelectionFieldView cBRApplicantDataSelectionFieldView, @l FormFieldCallback formFieldCallback) {
        super(cBRApplicantDataSelectionFieldView);
        this.callback = formFieldCallback;
    }

    @l
    public final FormFieldCallback getCallback() {
        return this.callback;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v0, types: [ru.cyberity.cbr.core.widget.applicantData.CBRApplicantDataSelectionFieldView] */
    @Override // ru.cyberity.cbr.core.presentation.form.viewadapter.FormItemViewHolder
    public void onBind(@k CBRApplicantDataSelectionFieldView view, @k FormItem.SelectDropdown item, int itemCount) {
        ?? arrayList;
        List<o> listR = item.getItem().r();
        if (listR != null) {
            arrayList = new ArrayList(C42745f0.q(listR, 10));
            int i12 = 0;
            for (Object obj : listR) {
                int i13 = i12 + 1;
                if (i12 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                o oVar = (o) obj;
                String value = oVar.getValue();
                if (value == null) {
                    value = String.valueOf(i12);
                }
                String title = oVar.getTitle();
                if (title == null) {
                    title = String.valueOf(i12);
                }
                arrayList.add(new h.e.a.C12451a(value, title));
                i12 = i13;
            }
        } else {
            arrayList = C42784z0.f406748b;
        }
        view.setItems(arrayList);
        view.setOnSelectedCallback(new AnonymousClass1(item, view));
    }
}
