package com.avito.android.advertising.loaders;

import com.avito.android.advertising.loaders.p;
import com.avito.android.remote.model.advertising.AvitoNetworkBannerItem;
import kotlin.Metadata;

/* compiled from: CommercialBannersInteractor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/advertising/b;", "it", "Lcom/avito/android/advertising/CommercialBanner;", "apply", "(Lcom/avito/android/advertising/b;)Lcom/avito/android/advertising/CommercialBanner;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class u<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f88475b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AvitoNetworkBannerItem f88476c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f88477d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p.a f88478e;

    public u(p pVar, AvitoNetworkBannerItem avitoNetworkBannerItem, int i12, p.a aVar) {
        this.f88475b = pVar;
        this.f88476c = avitoNetworkBannerItem;
        this.f88477d = i12;
        this.f88478e = aVar;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        String blockId = this.f88476c.getBlockId();
        p.a aVar = this.f88478e;
        return p.e(this.f88475b, blockId, (com.avito.android.advertising.b) obj, this.f88477d, aVar);
    }
}
