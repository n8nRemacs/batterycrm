package com.avito.android.advertising.loaders;

import com.avito.android.advertising.loaders.p;
import com.avito.android.remote.model.advertising.MyTargetNetworkBannerItem;
import kotlin.Metadata;

/* compiled from: CommercialBannersInteractor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/advertising/loaders/my_target/d;", "it", "Lcom/avito/android/advertising/CommercialBanner;", "apply", "(Lcom/avito/android/advertising/loaders/my_target/d;)Lcom/avito/android/advertising/CommercialBanner;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class r<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f88463b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MyTargetNetworkBannerItem f88464c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f88465d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p.a f88466e;

    public r(p pVar, MyTargetNetworkBannerItem myTargetNetworkBannerItem, int i12, p.a aVar) {
        this.f88463b = pVar;
        this.f88464c = myTargetNetworkBannerItem;
        this.f88465d = i12;
        this.f88466e = aVar;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        String strValueOf = String.valueOf(this.f88464c.getBlockId().intValue());
        p.a aVar = this.f88466e;
        return p.e(this.f88463b, strValueOf, (com.avito.android.advertising.loaders.my_target.d) obj, this.f88465d, aVar);
    }
}
