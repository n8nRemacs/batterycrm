package ru.cyberity.cbr.core.presentation.form.viewadapter;

import Y61.k;
import kotlin.Metadata;
import ru.cyberity.cbr.core.presentation.base.adapter.CBRBaseRecyclerViewHolder;
import ru.cyberity.cbr.core.presentation.form.model.FormItem;
import ru.cyberity.cbr.core.widget.applicantData.CBRApplicantDataBaseFieldView;

/* compiled from: FormItemViewHolder.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b \u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u0005B\u000f\u0012\u0006\u0010\u0006\u001a\u00028\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00028\u00012\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\nH$¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0014\u001a\u00028\u00018\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/cyberity/cbr/core/presentation/form/viewadapter/FormItemViewHolder;", "Lru/cyberity/cbr/core/presentation/form/model/FormItem;", "T", "Lru/cyberity/cbr/core/widget/applicantData/CBRApplicantDataBaseFieldView;", "V", "Lru/cyberity/cbr/core/presentation/base/adapter/CBRBaseRecyclerViewHolder;", "itemView", "<init>", "(Lru/cyberity/cbr/core/widget/applicantData/CBRApplicantDataBaseFieldView;)V", "item", "", "itemCount", "Lkotlin/G0;", "bind", "(Lru/cyberity/cbr/core/presentation/form/model/FormItem;I)V", "view", "onBind", "(Lru/cyberity/cbr/core/widget/applicantData/CBRApplicantDataBaseFieldView;Lru/cyberity/cbr/core/presentation/form/model/FormItem;I)V", "onRecycled", "()V", "formItemView", "Lru/cyberity/cbr/core/widget/applicantData/CBRApplicantDataBaseFieldView;", "getFormItemView", "()Lru/cyberity/cbr/core/widget/applicantData/CBRApplicantDataBaseFieldView;", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public abstract class FormItemViewHolder<T extends FormItem, V extends CBRApplicantDataBaseFieldView> extends CBRBaseRecyclerViewHolder<T> {

    @k
    private final V formItemView;

    public FormItemViewHolder(@k V v12) {
        super(v12);
        this.formItemView = v12;
    }

    @k
    public final V getFormItemView() {
        return this.formItemView;
    }

    public abstract void onBind(@k V view, @k T item, int itemCount);

    @Override // ru.cyberity.cbr.core.presentation.base.adapter.CBRBaseRecyclerViewHolder
    public final void bind(@k T item, int itemCount) {
        onBind(this.formItemView, item, itemCount);
    }

    public void onRecycled() {
    }
}
