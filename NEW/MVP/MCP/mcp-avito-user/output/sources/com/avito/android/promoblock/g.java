package com.avito.android.promoblock;

import com.avito.android.promoblock.a;
import kotlin.Metadata;

/* compiled from: TnsPromoBlockPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class g<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f231788b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TnsPromoBlockItem f231789c;

    public g(i iVar, TnsPromoBlockItem tnsPromoBlockItem) {
        this.f231788b = iVar;
        this.f231789c = tnsPromoBlockItem;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        this.f231788b.f231793b.accept(new a.b(this.f231789c, null));
    }
}
