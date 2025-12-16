package com.avito.android.campaigns_sale_search;

import android.content.DialogInterface;
import com.avito.android.R;
import com.avito.android.lib.design.modal.a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CampaignsSaleSearchFragment.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/lib/design/modal/a$b;", "Landroid/content/DialogInterface;", "dialog", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/modal/a$b;Landroid/content/DialogInterface;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class n extends N implements Y41.p<a.b, DialogInterface, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ CampaignsSaleSearchFragment f114798l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.campaigns_sale_search.konveyor.search_item.a f114799m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(CampaignsSaleSearchFragment campaignsSaleSearchFragment, com.avito.android.campaigns_sale_search.konveyor.search_item.a aVar) {
        super(2);
        this.f114798l = campaignsSaleSearchFragment;
        this.f114799m = aVar;
    }

    @Override // Y41.p
    public final G0 invoke(a.b bVar, DialogInterface dialogInterface) {
        a.b bVar2 = bVar;
        DialogInterface dialogInterface2 = dialogInterface;
        CampaignsSaleSearchFragment campaignsSaleSearchFragment = this.f114798l;
        bVar2.setTitle(campaignsSaleSearchFragment.getString(R.string.campaigns_sale_delete_block_alert_title));
        bVar2.setSubtitle(campaignsSaleSearchFragment.getString(R.string.campaigns_sale_delete_block_alert_subtitle));
        bVar2.setButtonsOrientation(1);
        bVar2.L3(campaignsSaleSearchFragment.getString(R.string.campaigns_sale_delete_block_alert_primary_button), new l(dialogInterface2, campaignsSaleSearchFragment, this.f114799m));
        bVar2.M3(campaignsSaleSearchFragment.getString(R.string.campaigns_sale_delete_block_alert_secondary_button), new m(dialogInterface2));
        return G0.f406611a;
    }
}
