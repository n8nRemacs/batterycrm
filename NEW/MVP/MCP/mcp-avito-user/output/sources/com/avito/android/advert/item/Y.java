package com.avito.android.advert.item;

import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.advert_core.gap.AdvertDetailsGapItem;
import com.avito.android.serp.adapter.PersistableSpannedItem;
import java.util.ArrayList;
import java.util.ListIterator;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: AdvertDetailsItemsPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/util/bottom_gap/j;", "bottomGap", "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/util/bottom_gap/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.advert.item.AdvertDetailsItemsPresenterImpl$attachView$3", f = "AdvertDetailsItemsPresenter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes10.dex */
final class Y extends SuspendLambda implements Y41.p<com.avito.android.util.bottom_gap.j, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f72285q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ T f72286r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(T t12, Continuation<? super Y> continuation) {
        super(2, continuation);
        this.f72286r = t12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        Y y12 = new Y(this.f72286r, continuation);
        y12.f72285q = obj;
        return y12;
    }

    @Override // Y41.p
    public final Object invoke(com.avito.android.util.bottom_gap.j jVar, Continuation<? super kotlin.G0> continuation) {
        return ((Y) create(jVar, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        int iNextIndex;
        int iNextIndex2;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        com.avito.android.util.bottom_gap.j jVar = (com.avito.android.util.bottom_gap.j) this.f72285q;
        T t12 = this.f72286r;
        ArrayList arrayList = t12.f71975Z1;
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (true) {
            iNextIndex = -1;
            if (!listIterator.hasPrevious()) {
                iNextIndex2 = -1;
                break;
            }
            PersistableSpannedItem persistableSpannedItem = (PersistableSpannedItem) listIterator.previous();
            if (persistableSpannedItem instanceof AdvertDetailsGapItem) {
                long j12 = ((AdvertDetailsGapItem) persistableSpannedItem).f83668b;
                AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
                if (j12 == 53) {
                    iNextIndex2 = listIterator.nextIndex();
                    break;
                }
            }
        }
        if (iNextIndex2 >= 0) {
            Object obj2 = t12.f71975Z1.get(iNextIndex2);
            if (obj2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.avito.android.advert_core.gap.AdvertDetailsGapItem");
            }
            AdvertDetailsGapItem advertDetailsGapItem = (AdvertDetailsGapItem) obj2;
            AdvertDetailsGapItem advertDetailsGapItem2 = new AdvertDetailsGapItem(advertDetailsGapItem.f83668b, advertDetailsGapItem.f83669c, jVar.f318843a, advertDetailsGapItem.f83671e, advertDetailsGapItem.f83672f, advertDetailsGapItem.f83673g);
            t12.f71975Z1.set(iNextIndex2, advertDetailsGapItem2);
            I1 i12 = t12.f71968Y1;
            if (i12 != null) {
                ArrayList arrayList2 = i12.f71660K0;
                ListIterator listIterator2 = arrayList2.listIterator(arrayList2.size());
                while (true) {
                    if (!listIterator2.hasPrevious()) {
                        break;
                    }
                    if (kotlin.jvm.internal.L.f(((com.avito.android.serp.adapter.i1) listIterator2.previous()).getF281621b(), advertDetailsGapItem2.f83669c)) {
                        iNextIndex = listIterator2.nextIndex();
                        break;
                    }
                }
                if (iNextIndex >= 0) {
                    arrayList2.remove(iNextIndex);
                    arrayList2.add(iNextIndex, advertDetailsGapItem2);
                    i12.f71653H.notifyItemChanged(iNextIndex, null);
                }
            }
        }
        return kotlin.G0.f406611a;
    }
}
