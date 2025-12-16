package com.avito.android.mall.deeplink;

import android.content.Intent;
import com.avito.android.L;
import com.avito.android.bottom_navigation.NavigationTab;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: MallIntentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mall/deeplink/e;", "Lcom/avito/android/mall/deeplink/d;", "_avito_mall_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class e implements d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final L f184262a;

    @Inject
    public e(@Y61.k L l12) {
        this.f184262a = l12;
    }

    @Override // com.avito.android.mall.deeplink.d
    @Y61.k
    public final Intent a(@Y61.l String str) {
        return this.f184262a.d(new MallNavigationData(new MallArguments(str), NavigationTab.f106970f));
    }
}
