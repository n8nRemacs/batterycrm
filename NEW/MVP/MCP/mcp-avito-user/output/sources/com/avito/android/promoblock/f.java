package com.avito.android.promoblock;

import com.avito.android.promoblock.TnsPromoBlockItem;
import com.avito.android.promoblock.a;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: TnsPromoBlockPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/promoblock/TnsPromoBlockItem$b;", "button", "Lkotlin/G0;", "accept", "(Lcom/avito/android/promoblock/TnsPromoBlockItem$b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class f<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f231786b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TnsPromoBlockItem f231787c;

    public f(i iVar, TnsPromoBlockItem tnsPromoBlockItem) {
        this.f231786b = iVar;
        this.f231787c = tnsPromoBlockItem;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        a dVar;
        TnsPromoBlockItem.b bVar = (TnsPromoBlockItem.b) obj;
        i iVar = this.f231786b;
        boolean z12 = bVar instanceof TnsPromoBlockItem.b.a;
        TnsPromoBlockItem tnsPromoBlockItem = this.f231787c;
        if (z12) {
            dVar = new a.C7060a(tnsPromoBlockItem, ((TnsPromoBlockItem.b.a) bVar).f231770b);
        } else {
            if (!(bVar instanceof TnsPromoBlockItem.b.C7059b)) {
                throw new NoWhenBranchMatchedException();
            }
            dVar = new a.d(tnsPromoBlockItem, ((TnsPromoBlockItem.b.C7059b) bVar).f231771b);
        }
        iVar.f231793b.accept(dVar);
    }
}
