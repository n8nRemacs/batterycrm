package com.avito.android.inline_filters.dialog.select;

import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.inline_filters.dialog.select.adapter.InlineItemType;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: SelectFilterView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class L extends kotlin.jvm.internal.N implements Y41.l<Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ SelectFilterView f172030l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(SelectFilterView selectFilterView) {
        super(1);
        this.f172030l = selectFilterView;
    }

    @Override // Y41.l
    public final G0 invoke(Integer num) {
        RecyclerView.Adapter adapter;
        int iIntValue = num.intValue();
        SelectFilterView selectFilterView = this.f172030l;
        if (!selectFilterView.f172040i.isEmpty() && iIntValue >= 0 && iIntValue < selectFilterView.f172040i.size()) {
            selectFilterView.f172041j.accept(selectFilterView.f172040i.get(iIntValue));
            com.avito.android.inline_filters.dialog.select.adapter.i iVar = (com.avito.android.inline_filters.dialog.select.adapter.i) C42745f0.K(iIntValue, selectFilterView.f172040i);
            if (iVar != null) {
                if (iVar.f172095f == InlineItemType.f172056c && (adapter = selectFilterView.f172035d.getAdapter()) != null) {
                    adapter.notifyItemChanged(iIntValue);
                }
            }
        }
        return G0.f406611a;
    }
}
