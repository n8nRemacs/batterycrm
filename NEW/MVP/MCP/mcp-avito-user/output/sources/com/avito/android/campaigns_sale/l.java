package com.avito.android.campaigns_sale;

import android.content.DialogInterface;
import com.avito.android.R;
import com.avito.android.lib.design.modal.a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CampaignsSaleFragment.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/lib/design/modal/a$b;", "Landroid/content/DialogInterface;", "dialog", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/modal/a$b;Landroid/content/DialogInterface;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class l extends N implements Y41.p<a.b, DialogInterface, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ CampaignsSaleFragment f114047l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(CampaignsSaleFragment campaignsSaleFragment) {
        super(2);
        this.f114047l = campaignsSaleFragment;
    }

    @Override // Y41.p
    public final G0 invoke(a.b bVar, DialogInterface dialogInterface) {
        a.b bVar2 = bVar;
        DialogInterface dialogInterface2 = dialogInterface;
        CampaignsSaleFragment campaignsSaleFragment = this.f114047l;
        bVar2.setTitle(campaignsSaleFragment.getString(R.string.campaigns_sale_exit_sale_alert_title));
        bVar2.setSubtitle(campaignsSaleFragment.getString(R.string.campaigns_sale_exit_sale_alert_subtitle));
        bVar2.setButtonsOrientation(1);
        bVar2.L3(campaignsSaleFragment.getString(R.string.campaigns_sale_exit_sale_alert_primary_button), new j(dialogInterface2, campaignsSaleFragment));
        bVar2.M3(campaignsSaleFragment.getString(R.string.campaigns_sale_exit_sale_alert_secondary_button), new k(dialogInterface2));
        return G0.f406611a;
    }
}
