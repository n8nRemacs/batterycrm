package com.avito.android.advertising.loaders.beduin;

import com.avito.android.advertising.CommercialBanner;
import com.avito.android.advertising.CommercialItem;
import com.avito.android.advertising.loaders.InterfaceC28345a;
import com.avito.android.advertising.loaders.beduin.H;
import kotlin.Metadata;

/* compiled from: CommercialBDUIBannerGetInteractionHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/avito/android/advertising/CommercialItem;", "loadedBanner", "Lcom/avito/android/advertising/CommercialBanner;", "apply"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.advertising.loaders.beduin.d, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
final class C28350d<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C28347a f88125b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C28354h f88126c;

    public C28350d(C28347a c28347a, C28354h c28354h) {
        this.f88125b = c28347a;
        this.f88126c = c28354h;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        CommercialBanner commercialBanner = (CommercialBanner) obj;
        C28347a c28347a = this.f88125b;
        CommercialItem commercialItemA = com.avito.android.advertising.g.a(commercialBanner, c28347a.f88101f, c28347a.f88102g);
        if (commercialBanner.d() && (commercialItemA instanceof InterfaceC28345a)) {
            H h12 = (H) ((r) this.f88126c.f88135d).invoke();
            InterfaceC28345a interfaceC28345a = (InterfaceC28345a) commercialItemA;
            String str = interfaceC28345a.getF86895d().f87871b;
            String bannerCode = interfaceC28345a.getF86895d().getBannerCode();
            if (bannerCode == null) {
                bannerCode = "";
            }
            h12.f(str, bannerCode, new H.c.C2608c(commercialItemA), c28347a.f88106k);
        }
        return commercialItemA;
    }
}
