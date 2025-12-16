package com.avito.android.serp.adapter.reformulations;

import com.avito.android.remote.model.SearchParams;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import zr0.C50619b;

/* compiled from: ReformulationsItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class l<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f270634b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f270635c;

    public l(n nVar, q qVar) {
        this.f270634b = nVar;
        this.f270635c = qVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        n nVar = this.f270634b;
        SearchParams searchParams = nVar.f270638c;
        String categoryId = searchParams != null ? searchParams.getCategoryId() : null;
        nVar.f270639d.getClass();
        q qVar = this.f270635c;
        nVar.f270637b.c(new C50619b(categoryId, null, qVar.Se(), C42745f0.O(qVar.qr(), ";", null, null, null, 62)));
    }
}
