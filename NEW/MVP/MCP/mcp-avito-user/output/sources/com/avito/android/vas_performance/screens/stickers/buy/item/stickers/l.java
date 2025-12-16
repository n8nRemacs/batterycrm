package com.avito.android.vas_performance.screens.stickers.buy.item.stickers;

import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.chips.Chips;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: StickersItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/vas_performance/screens/stickers/buy/item/stickers/l;", "Lcom/avito/android/vas_performance/screens/stickers/buy/item/stickers/j;", "Lcom/avito/konveyor/adapter/b;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class l extends com.avito.konveyor.adapter.b implements j {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Chips f320680b;

    public l(@Y61.k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.stickers);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.chips.Chips");
        }
        this.f320680b = (Chips) viewFindViewById;
    }

    @Override // com.avito.android.vas_performance.screens.stickers.buy.item.stickers.j
    public final void ui(@Y61.k List list, @Y61.l ArrayList arrayList, int i12, @Y61.k Y41.l lVar, @Y61.k com.avito.android.gig_shift_action.ui.a aVar, @Y61.k Y41.l lVar2) {
        Chips chips = this.f320680b;
        chips.setData(list);
        chips.setMaxSelected(i12);
        chips.j();
        chips.r(arrayList);
        chips.setChipsSelectedListener(new k(lVar2));
        chips.setChipsSelectConditionListener(aVar);
        chips.setSelectCondition(lVar);
    }
}
