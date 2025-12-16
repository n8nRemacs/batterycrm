package com.avito.android.cpx_promo.v2;

import androidx.compose.runtime.A;
import com.avito.android.cpx_promo.v2.mvi.entity.CpxPromoV2State;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CpxPromoV2Fragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class g extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ CpxPromoV2State.c f127548l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ CpxPromoV2Fragment f127549m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(CpxPromoV2State.c cVar, CpxPromoV2Fragment cpxPromoV2Fragment) {
        super(2);
        this.f127548l = cVar;
        this.f127549m = cpxPromoV2Fragment;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            com.akita.compose.theme.re23.c.a(false, androidx.compose.runtime.internal.r.c(1968055621, new f(this.f127548l, this.f127549m), a13), a13, 48, 1);
        }
        return G0.f406611a;
    }
}
