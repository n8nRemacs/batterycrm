package com.avito.android.advert;

import com.avito.android.remote.model.AdvertDetails;
import kotlin.Metadata;

/* compiled from: AdvertDetailsToolbarPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/G0;", "it", "Lio/reactivex/rxjava3/core/O;", "", "apply", "(Lkotlin/G0;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class H<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C28245z f68546b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AdvertDetails f68547c;

    public H(C28245z c28245z, AdvertDetails advertDetails) {
        this.f68546b = c28245z;
        this.f68547c = advertDetails;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        C28245z c28245z = this.f68546b;
        c28245z.getClass();
        AdvertDetails advertDetails = this.f68547c;
        return c28245z.f81085d.b(advertDetails.getId(), advertDetails.getIsFavorite());
    }
}
