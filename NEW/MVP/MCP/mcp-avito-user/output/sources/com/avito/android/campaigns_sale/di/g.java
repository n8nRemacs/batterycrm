package com.avito.android.campaigns_sale.di;

import android.content.res.Resources;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.campaigns_sale.CampaignsSaleFragment;
import com.avito.android.campaigns_sale.model.CampaignsSaleArguments;
import com.avito.android.di.B;
import com.avito.android.di.module.InterfaceC30106l7;
import cv.InterfaceC39417a;
import h31.d;
import kotlin.Metadata;

/* compiled from: CampaignsSaleComponent.kt */
@B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/campaigns_sale/di/g;", "", "a", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.d
/* loaded from: classes12.dex */
public interface g {

    /* compiled from: CampaignsSaleComponent.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/campaigns_sale/di/g$a;", "", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @Y61.k
        g a(@h31.b @Y61.k CampaignsSaleArguments campaignsSaleArguments, @h31.b @Y61.k C28478k c28478k, @h31.b @Y61.k Y41.l lVar, @p @h31.b @Y61.k String str, @h31.b @Y61.k Resources resources, @Y61.k i iVar, @Y61.k InterfaceC39417a interfaceC39417a, @Y61.k InterfaceC30106l7 interfaceC30106l7);
    }

    void a(@Y61.k CampaignsSaleFragment campaignsSaleFragment);
}
