package com.avito.android.advert;

import android.content.Intent;
import com.avito.android.analytics.provider.clickstream.TreeClickStreamParent;
import com.avito.android.bottom_navigation.NavigationTabSetItem;
import com.avito.android.bottom_navigation.space.BottomNavigationSpace;
import com.avito.android.deep_linking.links.AdvertDetailsLink;
import com.avito.android.rec.ScreenSource;
import com.avito.android.remote.model.AdvertNavBarStyle;
import com.avito.android.remote.model.IceBreaker;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.advert_details.ContactBarData;
import com.avito.android.remote.model.autotekateaser.CpoDescription;
import java.util.List;
import kotlin.Metadata;

/* compiled from: AdvertDetailsIntentFactory.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/e;", "", "_avito_advert-details_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.advert.e, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public interface InterfaceC27793e {

    /* compiled from: AdvertDetailsIntentFactory.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.advert.e$a */
    public static final class a {
    }

    @Y61.k
    Intent a(@Y61.l String str, @Y61.l BottomNavigationSpace bottomNavigationSpace);

    @Y61.k
    Intent b(@Y61.k List<IceBreaker> list, int i12, @Y61.k String str, @Y61.l String str2, @Y61.l String str3);

    @Y61.k
    Intent c(@Y61.k String str, @Y61.l ContactBarData contactBarData, @Y61.k String str2, @Y61.l String str3, boolean z12, @Y61.l String str4);

    @Y61.k
    Intent d(@Y61.k CpoDescription cpoDescription);

    @Y61.k
    Intent e(@Y61.k String str, @Y61.l Integer num, @Y61.l String str2, @Y61.l String str3, @Y61.l String str4, @Y61.l String str5, @Y61.l String str6, @Y61.l Image image, @Y61.l String str7, @Y61.l Boolean bool, @Y61.l Boolean bool2, @Y61.l TreeClickStreamParent treeClickStreamParent, long j12, @Y61.l Integer num2, @Y61.l NavigationTabSetItem navigationTabSetItem, @Y61.k ScreenSource screenSource, @Y61.l String str8, @Y61.k AdvertDetailsLink.Segment segment, @Y61.l String str9, @Y61.l AdvertNavBarStyle advertNavBarStyle, @Y61.l String str10, @Y61.l String str11, @Y61.l AdvertDetailsLink.GigAction gigAction);
}
