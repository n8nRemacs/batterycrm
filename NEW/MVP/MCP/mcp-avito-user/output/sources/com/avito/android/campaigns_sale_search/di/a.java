package com.avito.android.campaigns_sale_search.di;

import Y41.l;
import Y61.k;
import android.content.res.Resources;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.campaigns_sale_search.CampaignsSaleSearchFragment;
import com.avito.android.campaigns_sale_search.model.CampaignsSaleSearchArguments;
import com.avito.android.di.B;
import com.avito.android.di.module.InterfaceC30106l7;
import cv.InterfaceC39417a;
import h31.d;
import kotlin.Metadata;

/* compiled from: CampaignsSaleSearchComponent.kt */
@B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/campaigns_sale_search/di/a;", "", "a", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.d
/* loaded from: classes12.dex */
public interface a {

    /* compiled from: CampaignsSaleSearchComponent.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/campaigns_sale_search/di/a$a;", "", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.campaigns_sale_search.di.a$a, reason: collision with other inner class name */
    public interface InterfaceC3345a {
        @k
        a a(@h31.b @k CampaignsSaleSearchArguments campaignsSaleSearchArguments, @h31.b @k C28478k c28478k, @h31.b @k l lVar, @h31.b @k Resources resources, @k InterfaceC30106l7 interfaceC30106l7, @k InterfaceC39417a interfaceC39417a, @k b bVar);
    }

    void a(@k CampaignsSaleSearchFragment campaignsSaleSearchFragment);
}
