package com.avito.android.campaigns_sale.deep_link;

import android.content.Intent;
import com.avito.android.campaigns_sale.CampaignsSaleActivity;
import com.avito.android.campaigns_sale.model.CampaignsSaleArguments;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import sv.C48421d;

/* compiled from: CampaignsSaleLinkHandler.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class c extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f113885l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ CampaignsSaleArguments f113886m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, CampaignsSaleArguments campaignsSaleArguments) {
        super(0);
        this.f113885l = dVar;
        this.f113886m = campaignsSaleArguments;
    }

    @Override // Y41.a
    public final G0 invoke() {
        CampaignsSaleActivity.a aVar = CampaignsSaleActivity.f113812m;
        d dVar = this.f113885l;
        aVar.getClass();
        dVar.f113888g.J(new Intent(dVar.f113887f, (Class<?>) CampaignsSaleActivity.class).putExtra("saleData", this.f113886m), C48421d.a(dVar), com.avito.android.deeplink_handler.view.c.f134589l);
        return G0.f406611a;
    }
}
