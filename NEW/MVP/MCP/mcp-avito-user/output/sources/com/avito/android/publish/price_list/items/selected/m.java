package com.avito.android.publish.price_list.items.selected;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;

/* compiled from: SelectedPriceListItemsRe23Presenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "isExpanded", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class m extends N implements Y41.l<Boolean, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f238734l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ r f238735m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(d dVar, r rVar) {
        super(1);
        this.f238734l = dVar;
        this.f238735m = rVar;
    }

    @Override // Y41.l
    public final G0 invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        d dVar = this.f238734l;
        dVar.f238721d = zBooleanValue;
        this.f238735m.N3(C42745f0.M0(dVar.f238722e));
        return G0.f406611a;
    }
}
