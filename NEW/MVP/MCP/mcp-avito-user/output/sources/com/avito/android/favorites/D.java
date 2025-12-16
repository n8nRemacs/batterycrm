package com.avito.android.favorites;

import java.util.List;
import kotlin.Metadata;

/* compiled from: FavoriteAdvertsServiceInteractor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "", "it", "", "apply"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
final class D<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ A f156210b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List<String> f156211c;

    public D(A a12, List<String> list) {
        this.f156210b = a12;
        this.f156211c = list;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        com.avito.android.favorite.x xVar = this.f156210b.f156183b;
        List<String> list = this.f156211c;
        xVar.c(list);
        return list;
    }
}
