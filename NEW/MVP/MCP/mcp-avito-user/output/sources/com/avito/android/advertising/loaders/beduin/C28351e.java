package com.avito.android.advertising.loaders.beduin;

import com.avito.android.advertising.CommercialLoadingItem;
import com.avito.android.advertising.loaders.beduin.H;
import kotlin.Metadata;

/* compiled from: CommercialBDUIBannerGetInteractionHandler.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/advertising/CommercialLoadingItem;", "loadingItem", "Lio/reactivex/rxjava3/core/E;", "Lcom/avito/android/advertising/CommercialItem;", "apply", "(Lcom/avito/android/advertising/CommercialLoadingItem;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.advertising.loaders.beduin.e, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
final class C28351e<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C28354h f88127b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.advertising.loaders.n f88128c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f88129d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C28347a f88130e;

    public C28351e(C28354h c28354h, com.avito.android.advertising.loaders.n nVar, long j12, C28347a c28347a) {
        this.f88127b = c28354h;
        this.f88128c = nVar;
        this.f88129d = j12;
        this.f88130e = c28347a;
    }

    @Override // l41.o
    public final Object apply(Object obj) throws Throwable {
        CommercialLoadingItem commercialLoadingItem = (CommercialLoadingItem) obj;
        C28354h c28354h = this.f88127b;
        H.c cVar = ((H) ((r) c28354h.f88135d).invoke()).get(commercialLoadingItem.f86897b.f86885b);
        if (cVar instanceof H.c.C2608c) {
            return io.reactivex.rxjava3.core.z.c0(((H.c.C2608c) cVar).f88086a);
        }
        if (cVar instanceof H.c.b) {
            throw ((H.c.b) cVar).f88085a;
        }
        C28347a c28347a = this.f88130e;
        Integer num = c28347a.f88103h;
        return this.f88128c.c(commercialLoadingItem.f86897b, this.f88129d, num, c28347a.f88104i).d0(new C28350d(c28347a, c28354h));
    }
}
