package com.avito.android.str_calendar.seller.calandar_parameters.items.chips;

import JO.m;
import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.lib.design.chips.Chips;
import com.avito.android.lib.design.chips.SelectStrategy;
import com.avito.android.remote.model.category_parameters.CustomPaddings;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ChipsSelectItemView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_calendar/seller/calandar_parameters/items/chips/f;", "LTV0/e;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface f extends TV0.e {

    /* compiled from: ChipsSelectItemView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    void DA(@k Chips.DisplayType displayType);

    void E50(@k m mVar);

    void Sb(@k List<m> list, @l m mVar, @k p<? super m, ? super Boolean, G0> pVar);

    void i2(boolean z12);

    void jr(@k CustomPaddings customPaddings);

    void k(@l AttributedText attributedText);

    void r3(@k SelectStrategy selectStrategy);

    void setError(@l String str);

    void setTitle(@k String str);
}
