package com.avito.android.bbl.screens.configure.v2.ui.items.cards;

import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BblSelectorCardGrid.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/avito/android/bbl/screens/configure/v2/ui/items/cards/ItemIndex;", "it", "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.bbl.screens.configure.v2.ui.items.cards.d, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
final class C28732d extends N implements Y41.l<Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.l<C28729a, G0> f99416l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ List<C28729a> f99417m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f99418n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28732d(List list, int i12, Y41.l lVar) {
        super(1);
        this.f99416l = lVar;
        this.f99417m = list;
        this.f99418n = i12;
    }

    @Override // Y41.l
    public final G0 invoke(Integer num) {
        num.intValue();
        this.f99416l.invoke(this.f99417m.get(this.f99418n));
        return G0.f406611a;
    }
}
