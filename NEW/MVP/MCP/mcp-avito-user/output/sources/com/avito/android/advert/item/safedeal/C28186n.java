package com.avito.android.advert.item.safedeal;

import com.avito.android.advert.item.Z0;
import com.avito.android.remote.safedeal.SafeDeal;
import kotlin.Metadata;

/* compiled from: AdvertSafeDealPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/G0;", "it", "Lio/reactivex/rxjava3/core/w;", "LH6/c;", "apply", "(Lkotlin/G0;)Lio/reactivex/rxjava3/core/w;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.advert.item.safedeal.n, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C28186n<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Z0 f78891b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SafeDeal.ReturnCheckoutDialog.AddToFavoriteDialog f78892c;

    public C28186n(Z0 z02, SafeDeal.ReturnCheckoutDialog.AddToFavoriteDialog addToFavoriteDialog) {
        this.f78891b = z02;
        this.f78892c = addToFavoriteDialog;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        return this.f78891b.E(this.f78892c);
    }
}
