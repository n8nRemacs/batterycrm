package com.avito.android.advertising.loaders;

import com.avito.android.advertising.loaders.buzzoola.BuzzoolaBanner;
import com.avito.android.advertising.loaders.p;
import com.avito.android.remote.model.advertising.BuzzoolaNetworkBannerItem;
import kotlin.Metadata;

/* compiled from: CommercialBannersInteractor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/avito/android/advertising/CommercialBanner;", "it", "Lcom/avito/android/advertising/loaders/buzzoola/BuzzoolaBanner;", "apply"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
final class s<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f88467b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BuzzoolaNetworkBannerItem f88468c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f88469d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p.a f88470e;

    public s(p pVar, BuzzoolaNetworkBannerItem buzzoolaNetworkBannerItem, int i12, p.a aVar) {
        this.f88467b = pVar;
        this.f88468c = buzzoolaNetworkBannerItem;
        this.f88469d = i12;
        this.f88470e = aVar;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        String blockId = this.f88468c.getBlockId();
        p.a aVar = this.f88470e;
        return p.e(this.f88467b, blockId, (BuzzoolaBanner) obj, this.f88469d, aVar);
    }
}
