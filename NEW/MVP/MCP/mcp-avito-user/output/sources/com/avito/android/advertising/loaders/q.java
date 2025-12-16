package com.avito.android.advertising.loaders;

import com.avito.android.advertising.loaders.p;
import com.avito.android.remote.model.advertising.YandexNetworkBannerItem;
import kotlin.Metadata;

/* compiled from: CommercialBannersInteractor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/advertising/loaders/yandex/a;", "it", "Lcom/avito/android/advertising/CommercialBanner;", "apply", "(Lcom/avito/android/advertising/loaders/yandex/a;)Lcom/avito/android/advertising/CommercialBanner;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class q<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f88459b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ YandexNetworkBannerItem f88460c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f88461d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p.a f88462e;

    public q(p pVar, YandexNetworkBannerItem yandexNetworkBannerItem, int i12, p.a aVar) {
        this.f88459b = pVar;
        this.f88460c = yandexNetworkBannerItem;
        this.f88461d = i12;
        this.f88462e = aVar;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        String blockId = this.f88460c.getBlockId();
        p.a aVar = this.f88462e;
        return p.e(this.f88459b, blockId, (com.avito.android.advertising.loaders.yandex.a) obj, this.f88461d, aVar);
    }
}
