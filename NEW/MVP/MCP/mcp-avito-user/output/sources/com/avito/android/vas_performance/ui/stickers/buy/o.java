package com.avito.android.vas_performance.ui.stickers.buy;

import kotlin.Metadata;
import kotlin.Q;

/* compiled from: StickersBuyVasViewModel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/reactivex/rxjava3/disposables/d;", "it", "Lkotlin/G0;", "accept", "(Lio/reactivex/rxjava3/disposables/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class o<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f321960b;

    public o(v vVar) {
        this.f321960b = vVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        v vVar = this.f321960b;
        vVar.f321976R.postValue(new Q<>(vVar.f321977S, Boolean.TRUE));
    }
}
