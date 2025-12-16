package com.avito.android.advert.item.sparePartsCost;

import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.remote.model.SparePartsCost;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SparePartsCostItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class c extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f80381l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ SparePartsCost.SparePartsCostButton f80382m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ SparePartsCostItem f80383n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, SparePartsCost.SparePartsCostButton sparePartsCostButton, SparePartsCostItem sparePartsCostItem) {
        super(0);
        this.f80381l = eVar;
        this.f80382m = sparePartsCostButton;
        this.f80383n = sparePartsCostItem;
    }

    @Override // Y41.a
    public final G0 invoke() {
        String str = this.f80383n.f80374h;
        SparePartsCost.SparePartsCostButton sparePartsCostButton = this.f80382m;
        e eVar = this.f80381l;
        eVar.getClass();
        eVar.f80388c.r4(str, sparePartsCostButton.getText());
        b.a.a(eVar.f80387b, sparePartsCostButton.getDeeplink(), null, null, 6);
        return G0.f406611a;
    }
}
