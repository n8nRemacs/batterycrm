package com.avito.android.imv_cars_details.presentation.items.imv_cars_details_poll_item;

import WM.a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ImvCarsDetailsPollPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class d extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f170148l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ImvCarsDetailsPollItem f170149m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f170150n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, ImvCarsDetailsPollItem imvCarsDetailsPollItem, int i12) {
        super(0);
        this.f170148l = eVar;
        this.f170149m = imvCarsDetailsPollItem;
        this.f170150n = i12;
    }

    @Override // Y41.a
    public final G0 invoke() {
        e eVar = this.f170148l;
        l41.g<WM.a> gVar = eVar.f170151b;
        ImvCarsDetailsPollItem imvCarsDetailsPollItem = this.f170149m;
        gVar.accept(new a.c(imvCarsDetailsPollItem.f170140c, this.f170150n));
        String toolTipText = imvCarsDetailsPollItem.f170140c.getToolTipText();
        if (toolTipText != null) {
            eVar.f170151b.accept(new a.e(toolTipText));
        }
        return G0.f406611a;
    }
}
