package com.avito.android.favorites;

import kotlin.Metadata;

/* compiled from: FavoritesListPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/favorites/CategoryChipable;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/favorites/CategoryChipable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class D0 extends kotlin.jvm.internal.N implements Y41.l<CategoryChipable, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C30684r0 f156212l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D0(C30684r0 c30684r0) {
        super(1);
        this.f156212l = c30684r0;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(CategoryChipable categoryChipable) {
        CategoryChipable categoryChipable2 = categoryChipable;
        C30684r0 c30684r0 = this.f156212l;
        c30684r0.f157458b0 = CategoryState.a(c30684r0.f157458b0, null, categoryChipable2.f156200b, null, 13);
        c30684r0.f157460c0 = OrderState.a(c30684r0.f157460c0, null, categoryChipable2.f156204f, 15);
        c30684r0.N();
        C30684r0.L(c30684r0, true, 6);
        c30684r0.f157469h.n0(categoryChipable2.f156200b, categoryChipable2.f156203e);
        return kotlin.G0.f406611a;
    }
}
