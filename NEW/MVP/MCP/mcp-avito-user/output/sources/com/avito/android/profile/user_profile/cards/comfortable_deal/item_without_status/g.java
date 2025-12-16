package com.avito.android.profile.user_profile.cards.comfortable_deal.item_without_status;

import Y61.k;
import android.view.View;
import com.avito.android.R;
import com.avito.android.profile.user_profile.cards.c;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ComfortableDealCardItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/comfortable_deal/item_without_status/g;", "Lcom/avito/android/profile/user_profile/cards/comfortable_deal/item_without_status/f;", "Lcom/avito/konveyor/adapter/b;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final PU.b f224919b;

    public g(@k View view) {
        super(view);
        this.f224919b = c.a.a(view, R.id.user_profile_common_card_container);
    }

    @Override // com.avito.android.profile.user_profile.cards.comfortable_deal.item_without_status.f
    public final void S(@k Y41.a<G0> aVar) {
        this.f224919b.a(aVar);
    }

    @Override // com.avito.android.profile.user_profile.cards.comfortable_deal.item_without_status.f
    public final void b(@k String str) {
        this.f224919b.g0(str);
    }

    @Override // com.avito.android.profile.user_profile.cards.comfortable_deal.item_without_status.f
    public final void j(@k String str) {
        this.f224919b.b(str);
    }
}
