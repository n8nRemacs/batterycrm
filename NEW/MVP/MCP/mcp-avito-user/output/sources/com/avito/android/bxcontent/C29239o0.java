package com.avito.android.bxcontent;

import android.app.Application;
import android.content.Intent;
import com.avito.android.AnalyticParams;
import com.avito.android.avito_for_business.AvitoForBusinessMainBxContentTabData;
import com.avito.android.bottom_navigation.NavigationTab;
import com.avito.android.bottom_navigation.NavigationTabSetItem;
import com.avito.android.bottom_navigation.ui.NavigationScreenAction;
import com.avito.android.bxcontent.BxContentActivity;
import com.avito.android.bxcontent.BxContentIntentFactory;
import com.avito.android.bxcontent.model.AdvertListAdditionalTopics;
import com.avito.android.remote.model.NavigationBarStyle;
import com.avito.android.remote.model.PresentationType;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.SerpSpaceType;
import com.avito.android.remote.model.search.map.Area;
import com.avito.android.util.C35792f5;
import com.avito.android.util.C35800g5;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: BxContentIntentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/o0;", "Lcom/avito/android/bxcontent/BxContentIntentFactory;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.bxcontent.o0, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C29239o0 implements BxContentIntentFactory {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Application f112650a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.navigation.a f112651b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.L f112652c;

    /* compiled from: BxContentIntentFactoryImpl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.o0$a */
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[BxContentIntentFactory.SerpItemType.values().length];
            try {
                BxContentIntentFactory.SerpItemType[] serpItemTypeArr = BxContentIntentFactory.SerpItemType.f109311b;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    @Inject
    public C29239o0(@Y61.k Application application, @Y61.k com.avito.android.L l12, @Y61.k com.avito.android.navigation.a aVar) {
        this.f112650a = application;
        this.f112651b = aVar;
        this.f112652c = l12;
    }

    @Override // com.avito.android.bxcontent.BxContentIntentFactory
    @Y61.k
    public final Intent a(@Y61.k String str) {
        return c(new BxContentArguments(str, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, 8388606, null), NavigationTab.f106971g, false);
    }

    @Override // com.avito.android.bxcontent.BxContentIntentFactory
    @Y61.k
    public final Intent b(@Y61.k SearchParams searchParams, @Y61.l String str, @Y61.l String str2, @Y61.k PresentationType presentationType, @Y61.l String str3, @Y61.k SerpSpaceType serpSpaceType, boolean z12, @Y61.l NavigationBarStyle navigationBarStyle, @Y61.l List list, @Y61.l AnalyticParams analyticParams, @Y61.l String str4, @Y61.l String str5, @Y61.l AdvertListAdditionalTopics advertListAdditionalTopics, boolean z13, @Y61.l Boolean bool, @Y61.l String str6, @Y61.l Area area, @Y61.l Area area2, @Y61.l String str7, @Y61.l Float f12, @Y61.k NavigationScreenAction navigationScreenAction) {
        NavigationTabSetItem navigationTabSetItemA = this.f112651b.a();
        BxContentArguments bxContentArguments = new BxContentArguments(null, searchParams, str, null, str2, presentationType, null, str3 == null ? "" : str3, null, serpSpaceType, z12, navigationBarStyle, bool, list, analyticParams, str4, str5, advertListAdditionalTopics, str6, area == null ? area2 : area, str7, f12, navigationScreenAction, 257, null);
        if (navigationTabSetItemA == null) {
            navigationTabSetItemA = NavigationTab.f106970f;
        }
        return c(bxContentArguments, navigationTabSetItemA, z13);
    }

    public final Intent c(BxContentArguments bxContentArguments, NavigationTabSetItem navigationTabSetItem, boolean z12) {
        if (!z12) {
            return this.f112652c.d(C35800g5.c(new C35792f5(bxContentArguments.f108865d)) ? new AvitoForBusinessMainBxContentTabData(bxContentArguments) : new BxContentFragmentData(bxContentArguments, navigationTabSetItem, null, null, 12, null));
        }
        new BxContentActivity.a();
        return new Intent(this.f112650a, (Class<?>) BxContentActivity.class).putExtra("arguments", bxContentArguments);
    }
}
