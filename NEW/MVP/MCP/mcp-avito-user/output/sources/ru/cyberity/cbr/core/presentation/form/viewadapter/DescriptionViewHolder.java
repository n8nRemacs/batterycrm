package ru.cyberity.cbr.core.presentation.form.viewadapter;

import Y61.k;
import android.content.Context;
import kotlin.Metadata;
import ru.cyberity.cbr.core.common.s;
import ru.cyberity.cbr.core.data.source.applicant.remote.h;
import ru.cyberity.cbr.core.presentation.form.model.FormItem;
import ru.cyberity.cbr.core.widget.applicantData.CBRApplicantDataDescriptionView;

/* compiled from: DescriptionViewHolder.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/cyberity/cbr/core/presentation/form/viewadapter/DescriptionViewHolder;", "Lru/cyberity/cbr/core/presentation/form/viewadapter/FormItemViewHolder;", "Lru/cyberity/cbr/core/presentation/form/model/FormItem;", "Lru/cyberity/cbr/core/widget/applicantData/CBRApplicantDataDescriptionView;", "itemView", "<init>", "(Lru/cyberity/cbr/core/widget/applicantData/CBRApplicantDataDescriptionView;)V", "view", "item", "", "itemCount", "Lkotlin/G0;", "onBind", "(Lru/cyberity/cbr/core/widget/applicantData/CBRApplicantDataDescriptionView;Lru/cyberity/cbr/core/presentation/form/model/FormItem;I)V", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class DescriptionViewHolder extends FormItemViewHolder<FormItem, CBRApplicantDataDescriptionView> {
    public DescriptionViewHolder(@k CBRApplicantDataDescriptionView cBRApplicantDataDescriptionView) {
        super(cBRApplicantDataDescriptionView);
    }

    @Override // ru.cyberity.cbr.core.presentation.form.viewadapter.FormItemViewHolder
    public void onBind(@k CBRApplicantDataDescriptionView view, @k FormItem item, int itemCount) {
        h item2 = item.getItem();
        Context context = view.getContext();
        String title = item2.getTitle();
        view.setLabel(title != null ? s.a(title, context) : null);
    }
}
