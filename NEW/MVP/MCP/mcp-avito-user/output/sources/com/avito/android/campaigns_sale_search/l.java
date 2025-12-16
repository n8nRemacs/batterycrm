package com.avito.android.campaigns_sale_search;

import android.content.DialogInterface;
import com.avito.android.campaigns_sale_search.CampaignsSaleSearchFragment;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import um.b;

/* compiled from: CampaignsSaleSearchFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class l extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ DialogInterface f114629l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ CampaignsSaleSearchFragment f114630m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.campaigns_sale_search.konveyor.search_item.a f114631n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(DialogInterface dialogInterface, CampaignsSaleSearchFragment campaignsSaleSearchFragment, com.avito.android.campaigns_sale_search.konveyor.search_item.a aVar) {
        super(0);
        this.f114629l = dialogInterface;
        this.f114630m = campaignsSaleSearchFragment;
        this.f114631n = aVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        this.f114629l.dismiss();
        CampaignsSaleSearchFragment.a aVar = CampaignsSaleSearchFragment.f114473A0;
        this.f114630m.v5().accept(new b.j(this.f114631n));
        return G0.f406611a;
    }
}
