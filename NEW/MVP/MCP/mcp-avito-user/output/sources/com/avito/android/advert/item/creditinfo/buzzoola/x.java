package com.avito.android.advert.item.creditinfo.buzzoola;

import androidx.compose.runtime.internal.P;
import androidx.view.M0;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: BuzzoolaCreditBannerViewModelFactory.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/creditinfo/buzzoola/x;", "Lcom/avito/android/advert/item/creditinfo/buzzoola/w;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class x implements w {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final BuzzoolaCreditBannerLoader f74998a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f74999b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert_core.analytics.a f75000c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advertising.loaders.event_service.c f75001d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f75002e;

    @Inject
    public x(@Y61.k BuzzoolaCreditBannerLoader buzzoolaCreditBannerLoader, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k com.avito.android.advert_core.analytics.a aVar, @Y61.k com.avito.android.advertising.loaders.event_service.c cVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar2) {
        this.f74998a = buzzoolaCreditBannerLoader;
        this.f74999b = interfaceC35745a5;
        this.f75000c = aVar;
        this.f75001d = cVar;
        this.f75002e = aVar2;
    }

    @Override // androidx.lifecycle.P0.c
    @Y61.k
    public final <T extends M0> T create(@Y61.k Class<T> cls) {
        if (!cls.isAssignableFrom(v.class)) {
            throw new IllegalArgumentException("Unknown ViewModel class");
        }
        return new v(this.f74998a, this.f74999b, this.f75000c, this.f75001d, this.f75002e);
    }
}
