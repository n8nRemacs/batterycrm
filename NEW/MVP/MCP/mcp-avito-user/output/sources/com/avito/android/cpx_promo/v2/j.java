package com.avito.android.cpx_promo.v2;

import com.avito.android.cpx_promo.v2.CpxPromoV2Fragment;
import com.avito.android.cpx_promo.v2.mvi.entity.CpxPromoV2State;
import com.avito.android.cpx_promo.v2.mvi.entity.a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CpxPromoV2Fragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class j extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ CpxPromoV2Fragment f127553l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ CpxPromoV2State.ButtonState f127554m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(CpxPromoV2Fragment cpxPromoV2Fragment, CpxPromoV2State.ButtonState buttonState) {
        super(0);
        this.f127553l = cpxPromoV2Fragment;
        this.f127554m = buttonState;
    }

    @Override // Y41.a
    public final G0 invoke() {
        CpxPromoV2Fragment.b bVar = CpxPromoV2Fragment.f127346s0;
        this.f127553l.r5().accept(new a.c(this.f127554m.f127637b));
        return G0.f406611a;
    }
}
