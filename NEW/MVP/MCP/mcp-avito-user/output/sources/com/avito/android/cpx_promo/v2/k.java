package com.avito.android.cpx_promo.v2;

import androidx.compose.foundation.layout.R1;
import androidx.compose.runtime.A;
import androidx.compose.ui.layout.C22392w0;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.avito.android.cpx_promo.v2.CpxPromoV2Fragment;
import com.avito.android.cpx_promo.v2.mvi.entity.CpxPromoV2State;
import com.avito.android.mnz_common.compose.C32578a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: CpxPromoV2Fragment.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class k extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ CpxPromoV2State.ButtonState f127555l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ CpxPromoV2Fragment.a f127556m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ CpxPromoV2Fragment f127557n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(CpxPromoV2State.ButtonState buttonState, CpxPromoV2Fragment.a aVar, CpxPromoV2Fragment cpxPromoV2Fragment) {
        super(2);
        this.f127555l = buttonState;
        this.f127556m = aVar;
        this.f127557n = cpxPromoV2Fragment;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            CpxPromoV2State.ButtonState buttonState = this.f127555l;
            String str = buttonState.f127638c;
            h.a aVar = androidx.compose.ui.unit.h.f42849c;
            v vVarA = C22392w0.a(R1.m(v.f42878y1, 0.0f, 24, 0.0f, 0.0f, 13), new h(this.f127556m));
            CpxPromoV2Fragment cpxPromoV2Fragment = this.f127557n;
            C32578a.a(vVarA, str, buttonState.f127636a, new i(cpxPromoV2Fragment, buttonState), new j(cpxPromoV2Fragment, buttonState), buttonState.f127640e, true, a13, 1572864, 0);
        }
        return G0.f406611a;
    }
}
