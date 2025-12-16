package com.avito.android.login_suggests_impl;

import com.avito.android.login_suggests_impl.adapter.progress.ProgressItem;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: LoginSuggestsPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/reactivex/rxjava3/disposables/d;", "it", "Lkotlin/G0;", "accept", "(Lio/reactivex/rxjava3/disposables/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class p<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f182944b;

    public p(t tVar) {
        this.f182944b = tVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        t tVar = this.f182944b;
        com.avito.konveyor.util.a.a(tVar.f182949b, C42745f0.i0(new ProgressItem(0L, 1, null), tVar.f182959l));
        A a12 = tVar.f182955h;
        if (a12 != null) {
            a12.f182847b.notifyDataSetChanged();
        }
    }
}
