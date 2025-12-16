package com.avito.android.mortgage.landing.list.items.chips;

import Y61.k;
import Y61.l;
import com.avito.android.lib.design.chips.h;
import com.avito.android.mortgage.landing.list.items.chips.ChipsItem;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ChipsView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/landing/list/items/chips/f;", "LTV0/e;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface f extends TV0.e {

    /* compiled from: ChipsView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    void C1(@k List<? extends h> list);

    void E1(@l Y41.l<? super ChipsItem.Chip, G0> lVar);

    void I(boolean z12);

    void ag(@k ChipsItem.Chip chip);

    void db(@l Integer num);

    void setTitle(int i12);
}
