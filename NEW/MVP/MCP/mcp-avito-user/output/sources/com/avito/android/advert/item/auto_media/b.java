package com.avito.android.advert.item.auto_media;

import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertDetailsAutoMediaAnalytics.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/auto_media/b;", "Lcom/avito/android/advert/item/auto_media/a;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f72916a;

    @Inject
    public b(@Y61.k InterfaceC28373a interfaceC28373a) {
        this.f72916a = interfaceC28373a;
    }

    @Override // com.avito.android.advert.item.auto_media.a
    public final void a(@Y61.k String str, boolean z12) {
        this.f72916a.c(new m(str, z12 ? "" : "item"));
    }
}
