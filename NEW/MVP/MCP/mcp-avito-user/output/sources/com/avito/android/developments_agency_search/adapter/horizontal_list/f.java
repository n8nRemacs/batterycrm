package com.avito.android.developments_agency_search.adapter.horizontal_list;

import Y41.l;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;

/* compiled from: HorizontalListItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "itemPosition", "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class f extends N implements l<Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a f136303l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ g f136304m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(a aVar, g gVar) {
        super(1);
        this.f136303l = aVar;
        this.f136304m = gVar;
    }

    @Override // Y41.l
    public final G0 invoke(Integer num) {
        l<? super String, G0> lVar;
        com.avito.conveyor_item.a aVar = (com.avito.conveyor_item.a) C42745f0.K(num.intValue(), this.f136303l.f136293c);
        if (aVar != null && (lVar = this.f136304m.f136305b) != null) {
            lVar.invoke(aVar.getF96790b());
        }
        return G0.f406611a;
    }
}
