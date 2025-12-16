package com.akita.compose.component.gallery;

import androidx.compose.foundation.lazy.layout.C0;
import androidx.compose.runtime.C22061e3;
import androidx.compose.ui.layout.InterfaceC22363h0;
import androidx.compose.ui.layout.InterfaceC22367j0;
import androidx.compose.ui.layout.InterfaceC22369k0;
import androidx.compose.ui.layout.K0;
import androidx.compose.ui.unit.C22712b;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.N;

/* compiled from: Gallery.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/compose/ui/layout/k0;", "Landroidx/compose/ui/layout/h0;", "measurable", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/j0;", "invoke-3p2s80s", "(Landroidx/compose/ui/layout/k0;Landroidx/compose/ui/layout/h0;J)Landroidx/compose/ui/layout/j0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class l extends N implements Y41.q<InterfaceC22369k0, InterfaceC22363h0, C22712b, InterfaceC22367j0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f61617l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ s f61618m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ e f61619n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(int i12, s sVar, e eVar) {
        super(3);
        this.f61617l = i12;
        this.f61618m = sVar;
        this.f61619n = eVar;
    }

    @Override // Y41.q
    public final InterfaceC22367j0 invoke(InterfaceC22369k0 interfaceC22369k0, InterfaceC22363h0 interfaceC22363h0, C22712b c22712b) {
        InterfaceC22369k0 interfaceC22369k02 = interfaceC22369k0;
        InterfaceC22363h0 interfaceC22363h02 = interfaceC22363h0;
        long j12 = c22712b.f42843a;
        C0<c> c02 = this.f61618m.f61623a;
        float f12 = this.f61617l == 2 ? c02.f29258b : 2.0f;
        int i12 = c02.f29258b;
        K0 k0I = interfaceC22363h02.I(C22712b.c(j12, (2 > i12 || i12 >= 4) ? C22712b.l(j12) : kotlin.math.b.b(((C22061e3) this.f61619n.f61593a).e() / f12), 0, 0, 0, 14));
        return interfaceC22369k02.L0(k0I.f40345b, k0I.f40346c, P0.c(), new k(k0I));
    }
}
