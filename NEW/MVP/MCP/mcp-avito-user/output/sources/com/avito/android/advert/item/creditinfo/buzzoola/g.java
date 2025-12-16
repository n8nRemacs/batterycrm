package com.avito.android.advert.item.creditinfo.buzzoola;

import com.avito.android.advert.item.creditinfo.buzzoola.BuzzoolaCreditBannerLoader;
import com.avito.android.advertising.loaders.BannerInfo;
import com.avito.android.advertising.loaders.NoAdException;
import com.avito.android.remote.model.AdvertDetails;
import io.reactivex.rxjava3.core.B;
import kotlin.Metadata;

/* compiled from: BuzzoolaCreditBannerLoader.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "error", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class g<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f74944b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BannerInfo f74945c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AdvertDetails f74946d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ B<a> f74947e;

    public g(i iVar, BannerInfo bannerInfo, AdvertDetails advertDetails, B<a> b12) {
        this.f74944b = iVar;
        this.f74945c = bannerInfo;
        this.f74946d = advertDetails;
        this.f74947e = b12;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        Throwable th2 = (Throwable) obj;
        boolean z12 = th2 instanceof NoAdException;
        BannerInfo bannerInfo = this.f74945c;
        i iVar = this.f74944b;
        if (z12) {
            iVar.f74954e.c(iVar.b(bannerInfo));
        } else {
            iVar.f74954e.a(iVar.b(bannerInfo), th2);
        }
        iVar.f74954e.b(iVar.b(bannerInfo));
        iVar.f74953d.y6(bannerInfo, z12, this.f74946d);
        this.f74947e.g(new BuzzoolaCreditBannerLoader.BuzzoolaCreditBannerLoadingException());
    }
}
