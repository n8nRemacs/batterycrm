package com.avito.android.advert.item.safedeal;

import io.reactivex.rxjava3.internal.operators.maybe.C41928w;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: AdvertSafeDealPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "canShowDialog", "Lio/reactivex/rxjava3/core/w;", "Lkotlin/G0;", "apply", "(Z)Lio/reactivex/rxjava3/core/w;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.advert.item.safedeal.i, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C28181i<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C28180h f78869b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f78870c;

    public C28181i(C28180h c28180h, String str) {
        this.f78869b = c28180h;
        this.f78870c = str;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        if (!((Boolean) obj).booleanValue()) {
            return C41928w.f403335b;
        }
        this.f78869b.f78830k.a(this.f78870c);
        return io.reactivex.rxjava3.core.q.i(G0.f406611a);
    }
}
