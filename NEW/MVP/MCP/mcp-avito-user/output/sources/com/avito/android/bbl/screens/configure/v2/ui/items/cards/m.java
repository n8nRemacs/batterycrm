package com.avito.android.bbl.screens.configure.v2.ui.items.cards;

import java.util.ListIterator;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: BblSelectorCardPreview.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/avito/android/bbl/screens/configure/v2/ui/items/cards/ItemIndex;", "clickedCardIndex", "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class m extends N implements Y41.l<Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.runtime.snapshots.D<C28729a> f99435l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(androidx.compose.runtime.snapshots.D<C28729a> d12) {
        super(1);
        this.f99435l = d12;
    }

    @Override // Y41.l
    public final G0 invoke(Integer num) {
        int iIntValue = num.intValue();
        androidx.compose.runtime.snapshots.D<C28729a> d12 = this.f99435l;
        ListIterator<C28729a> listIterator = d12.listIterator();
        int i12 = 0;
        while (listIterator.hasNext()) {
            C28729a next = listIterator.next();
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            C28729a c28729a = next;
            d12.set(i12, C28729a.d(c28729a, L.f(d12.get(iIntValue).f99408f, c28729a.f99408f)));
            i12 = i13;
        }
        return G0.f406611a;
    }
}
