package com.avito.android.profile.user_profile.cards.nd_trx_deal_cabinet;

import Y61.k;
import android.view.View;
import com.avito.android.R;
import com.avito.android.profile.user_profile.cards.c;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: NdTrxDealCabinetItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/nd_trx_deal_cabinet/g;", "Lcom/avito/android/profile/user_profile/cards/nd_trx_deal_cabinet/f;", "Lcom/avito/konveyor/adapter/b;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final PU.b f225098b;

    public g(@k View view) {
        super(view);
        this.f225098b = c.a.a(view, R.id.user_profile_common_card_container);
    }

    @Override // com.avito.android.profile.user_profile.cards.nd_trx_deal_cabinet.f
    public final void a(@k Y41.a<G0> aVar) {
        this.f225098b.a(aVar);
    }

    @Override // com.avito.android.profile.user_profile.cards.nd_trx_deal_cabinet.f
    public final void b(@k String str) {
        this.f225098b.g0(str);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f225098b.a(null);
    }

    @Override // com.avito.android.profile.user_profile.cards.nd_trx_deal_cabinet.f
    public final void n(@k String str) {
        this.f225098b.b(str);
    }
}
