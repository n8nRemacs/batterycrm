package com.avito.android.advert.item.preload;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert.InterfaceC27797i;
import com.avito.android.advert.di.C27710t;
import com.avito.android.advert.item.AdvertDetailsFastOpenParams;
import com.avito.android.advert.item.C28124e0;
import com.avito.android.advert.item.PreloadCacheKey;
import com.avito.android.advert_core.advert.AdvertDetailsWithMeta;
import com.avito.android.di.module.InterfaceC30098l;
import com.avito.android.di.module.InterfaceC30174s;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.core.z;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertDetailsPreloadingPromise.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/preload/d;", "Lcom/avito/android/preloading/d;", "Lcom/avito/android/advert/item/preload/f;", "Lcom/avito/android/advert_core/advert/AdvertDetailsWithMeta;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class d implements com.avito.android.preloading.d<f, AdvertDetailsWithMeta> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC27797i f78195a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f78196b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Integer f78197c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f78198d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final com.avito.android.advert_core.analytics.a f78199e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final AdvertDetailsFastOpenParams f78200f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f78201g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final A7.b f78202h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final PreloadCacheKey f78203i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final C28124e0 f78204j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final A7.b f78205k;

    @Inject
    public d(@k InterfaceC27797i interfaceC27797i, @k @InterfaceC30174s String str, @l @InterfaceC30098l Integer num, @C27710t.InterfaceC2166t @l String str2, @k com.avito.android.advert_core.analytics.a aVar, @k AdvertDetailsFastOpenParams advertDetailsFastOpenParams, @k InterfaceC35745a5 interfaceC35745a5, @k A7.b bVar, @l PreloadCacheKey preloadCacheKey, @k C28124e0 c28124e0, @k A7.b bVar2) {
        this.f78195a = interfaceC27797i;
        this.f78196b = str;
        this.f78197c = num;
        this.f78198d = str2;
        this.f78199e = aVar;
        this.f78200f = advertDetailsFastOpenParams;
        this.f78201g = interfaceC35745a5;
        this.f78202h = bVar;
        this.f78203i = preloadCacheKey;
        this.f78204j = c28124e0;
        this.f78205k = bVar2;
    }

    @Override // com.avito.android.preloading.d
    public final z<? extends AdvertDetailsWithMeta> a(f fVar) {
        AdvertDetailsWithMeta advertDetailsWithMetaA;
        f fVar2 = fVar;
        PreloadCacheKey preloadCacheKey = this.f78203i;
        if (preloadCacheKey != null && (advertDetailsWithMetaA = this.f78204j.a(preloadCacheKey)) != null) {
            return z.c0(advertDetailsWithMetaA);
        }
        String strV0 = this.f78199e.v0();
        AdvertDetailsFastOpenParams advertDetailsFastOpenParams = this.f78200f;
        AdvertDetailsFastOpenParams.FromSpace fromSpace = advertDetailsFastOpenParams.f71334k;
        return this.f78195a.e(this.f78196b, this.f78197c, this.f78198d, strV0, fVar2.f78217a, fromSpace, advertDetailsFastOpenParams.f71335l, fVar2.f78218b).J(io.reactivex.rxjava3.internal.functions.a.f401993c, new a(this)).K(new b(this)).I(new c(this)).o(this.f78202h.w()).j0(this.f78201g.e());
    }
}
