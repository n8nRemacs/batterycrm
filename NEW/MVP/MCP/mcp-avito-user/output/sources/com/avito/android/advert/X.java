package com.avito.android.advert;

import com.avito.android.advert_details.AdvertDetailsStyle;
import com.avito.android.remote.model.AdvertDetails;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: AdvertDetailsToolbarPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "isFavoriteLocally", "Lio/reactivex/rxjava3/core/O;", "Lkotlin/G0;", "apply", "(Z)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class X<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdvertDetails f68576b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C28245z f68577c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AdvertDetailsStyle f68578d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f68579e;

    public X(C28245z c28245z, AdvertDetailsStyle advertDetailsStyle, AdvertDetails advertDetails, String str) {
        this.f68576b = advertDetails;
        this.f68577c = c28245z;
        this.f68578d = advertDetailsStyle;
        this.f68579e = str;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        AdvertDetails advertDetails = this.f68576b;
        if (zBooleanValue == advertDetails.getIsFavorite()) {
            return io.reactivex.rxjava3.core.I.q(G0.f406611a);
        }
        C28245z c28245z = this.f68577c;
        com.avito.android.advert.favorites.a aVar = c28245z.f81085d;
        d0 d0Var = c28245z.f81107z;
        boolean z12 = false;
        if (d0Var != null && d0Var.Tc()) {
            z12 = true;
        }
        return aVar.e(this.f68578d, advertDetails, this.f68579e, z12);
    }
}
