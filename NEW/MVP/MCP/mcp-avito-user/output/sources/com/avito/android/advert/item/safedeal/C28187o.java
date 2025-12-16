package com.avito.android.advert.item.safedeal;

import com.avito.android.advert_details.AdvertDetailsStyle;
import com.avito.android.remote.model.AdvertDetails;
import kotlin.Metadata;

/* compiled from: AdvertSafeDealPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LH6/c;", "result", "Lkotlin/G0;", "accept", "(LH6/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.advert.item.safedeal.o, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C28187o<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C28180h f78893b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AdvertDetailsStyle f78894c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AdvertDetails f78895d;

    public C28187o(C28180h c28180h, AdvertDetailsStyle advertDetailsStyle, AdvertDetails advertDetails) {
        this.f78893b = c28180h;
        this.f78894c = advertDetailsStyle;
        this.f78895d = advertDetails;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        H6.c cVar = (H6.c) obj;
        boolean z12 = cVar instanceof H6.b;
        C28180h c28180h = this.f78893b;
        if (z12) {
            c28180h.f78843x.b(c28180h.f78828i.e(this.f78894c, this.f78895d, "delivery_checkout", false).x(io.reactivex.rxjava3.internal.functions.a.f401994d, io.reactivex.rxjava3.internal.functions.a.f401996f));
        } else if (cVar instanceof H6.a) {
            AdvertDetails advertDetails = c28180h.f78814C;
            if (advertDetails != null) {
                c28180h.f78822c.x0(advertDetails);
            }
            c28180h.f78830k.b();
        }
    }
}
