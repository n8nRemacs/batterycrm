package com.avito.android.inline_filters.dialog.suggest;

import com.avito.android.inline_filters.dialog.select.SelectFilterView;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SuggestFilterDialog.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Lcom/avito/android/inline_filters/dialog/select/adapter/i;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class g extends N implements Y41.l<List<? extends com.avito.android.inline_filters.dialog.select.adapter.i>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ SelectFilterView f172235l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(SelectFilterView selectFilterView) {
        super(1);
        this.f172235l = selectFilterView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y41.l
    public final G0 invoke(List<? extends com.avito.android.inline_filters.dialog.select.adapter.i> list) {
        List<? extends com.avito.android.inline_filters.dialog.select.adapter.i> list2 = list;
        boolean zIsEmpty = list2.isEmpty();
        SelectFilterView selectFilterView = this.f172235l;
        selectFilterView.x(zIsEmpty);
        selectFilterView.k(list2, null);
        return G0.f406611a;
    }
}
