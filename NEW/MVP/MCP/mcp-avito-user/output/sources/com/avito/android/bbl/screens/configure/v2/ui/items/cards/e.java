package com.avito.android.bbl.screens.configure.v2.ui.items.cards;

import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BblSelectorCardGrid.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\n\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u000b¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/avito/android/bbl/screens/configure/v2/ui/items/cards/D;", "item", "", "Lcom/avito/android/bbl/screens/configure/v2/ui/items/cards/ItemIndex;", "index", "Landroidx/compose/ui/v;", "modifier", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/bbl/screens/configure/v2/ui/items/cards/D;ILandroidx/compose/ui/v;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class e extends N implements Y41.s<D, Integer, androidx.compose.ui.v, androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.l<C28729a, G0> f99419l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ List<C28729a> f99420m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e(Y41.l<? super C28729a, G0> lVar, List<C28729a> list) {
        super(5);
        this.f99419l = lVar;
        this.f99420m = list;
    }

    @Override // Y41.s
    public final G0 invoke(D d12, Integer num, androidx.compose.ui.v vVar, androidx.compose.runtime.A a12, Integer num2) {
        int i12;
        D d13 = d12;
        int iIntValue = num.intValue();
        androidx.compose.ui.v vVar2 = vVar;
        androidx.compose.runtime.A a13 = a12;
        int iIntValue2 = num2.intValue();
        if ((iIntValue2 & 14) == 0) {
            i12 = (a13.B(d13) ? 4 : 2) | iIntValue2;
        } else {
            i12 = iIntValue2;
        }
        if ((iIntValue2 & 112) == 0) {
            i12 |= a13.m(iIntValue) ? 32 : 16;
        }
        if ((iIntValue2 & 896) == 0) {
            i12 |= a13.B(vVar2) ? 256 : 128;
        }
        if ((i12 & 5851) == 1170 && a13.c()) {
            a13.f();
        } else {
            l.a(iIntValue, d13, vVar2, new C28732d(this.f99420m, iIntValue, this.f99419l), a13, ((i12 >> 3) & 14) | ((i12 << 3) & 112) | (i12 & 896));
        }
        return G0.f406611a;
    }
}
