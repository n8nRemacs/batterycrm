package com.avito.android.short_term_rent.bookingform.items.retro_badges;

import Y41.l;
import Y61.k;
import android.view.View;
import com.avito.android.short_term_rent.view.components.retro_badges.RetroBadgesView;
import com.avito.android.short_term_rent.view.components.retro_badges.entity.RetroBadgeItem;
import com.avito.android.short_term_rent.view.components.retro_badges.entity.RetroBadgeItemHint;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: RetroBadgesItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/items/retro_badges/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/short_term_rent/bookingform/items/retro_badges/f;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final RetroBadgesView f281630b;

    public g(@k View view) {
        super(view);
        this.f281630b = (RetroBadgesView) view;
    }

    @Override // com.avito.android.short_term_rent.bookingform.items.retro_badges.f
    /* renamed from: if */
    public final void mo60if(@k l<? super RetroBadgeItemHint, G0> lVar) {
        this.f281630b.setOnMoreClickListener(lVar);
    }

    @Override // com.avito.android.short_term_rent.bookingform.items.retro_badges.f
    public final void k7(@k List<? extends List<RetroBadgeItem>> list) {
        this.f281630b.setup(list);
    }
}
