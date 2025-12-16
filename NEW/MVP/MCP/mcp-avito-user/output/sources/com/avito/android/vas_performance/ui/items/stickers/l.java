package com.avito.android.vas_performance.ui.items.stickers;

import Y41.p;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.chips.Chips;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: StickersItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/vas_performance/ui/items/stickers/l;", "Lcom/avito/android/vas_performance/ui/items/stickers/j;", "Lcom/avito/konveyor/adapter/b;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class l extends com.avito.konveyor.adapter.b implements j {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Chips f321741b;

    public l(@Y61.k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.stickers);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.chips.Chips");
        }
        this.f321741b = (Chips) viewFindViewById;
    }

    @Override // com.avito.android.vas_performance.ui.items.stickers.j
    public final void Yx(@Y61.k ArrayList arrayList, @Y61.l ArrayList arrayList2, int i12, @Y61.k Y41.l lVar, @Y61.k com.avito.android.gig_shift_action.ui.a aVar, @Y61.k p pVar) {
        Chips chips = this.f321741b;
        chips.setData(arrayList);
        chips.setMaxSelected(i12);
        chips.j();
        chips.r(arrayList2);
        chips.setChipsSelectedListener(new k(pVar));
        chips.setChipsSelectConditionListener(aVar);
        chips.setSelectCondition(lVar);
    }
}
