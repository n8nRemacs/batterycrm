package com.akita.compose.component.toggle;

import androidx.compose.runtime.I3;
import androidx.compose.ui.graphics.T;
import androidx.compose.ui.unit.h;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: RadioToggle.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/g;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/graphics/drawscope/g;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class m extends N implements Y41.l<androidx.compose.ui.graphics.drawscope.g, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ I3<T> f63376l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f63377m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ I3<T> f63378n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ I3<androidx.compose.ui.unit.h> f63379o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ I3<T> f63380p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(I3<T> i32, float f12, I3<T> i33, I3<androidx.compose.ui.unit.h> i34, I3<T> i35) {
        super(1);
        this.f63376l = i32;
        this.f63377m = f12;
        this.f63378n = i33;
        this.f63379o = i34;
        this.f63380p = i35;
    }

    @Override // Y41.l
    public final G0 invoke(androidx.compose.ui.graphics.drawscope.g gVar) {
        androidx.compose.ui.graphics.drawscope.g gVar2 = gVar;
        float f12 = 2;
        float fD2 = l0.n.d(gVar2.i()) / f12;
        long j12 = this.f63376l.getF42167b().f39331a;
        androidx.compose.ui.graphics.drawscope.n nVar = androidx.compose.ui.graphics.drawscope.n.f39497a;
        androidx.compose.ui.graphics.drawscope.g.U(gVar2, j12, fD2, 0L, 0.0f, nVar, 0, 108);
        float f13 = 0;
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        float f14 = this.f63377m;
        if (Float.compare(f14, f13) > 0) {
            float fM02 = gVar2.M0(f14);
            androidx.compose.ui.graphics.drawscope.g.U(gVar2, this.f63378n.getF42167b().f39331a, fD2 - (fM02 / f12), 0L, 0.0f, new androidx.compose.ui.graphics.drawscope.o(fM02, 0.0f, 0, 0, null, 30, null), 0, 108);
        }
        I3<androidx.compose.ui.unit.h> i32 = this.f63379o;
        if (Float.compare(i32.getF42167b().f42852b, f13) > 0) {
            androidx.compose.ui.graphics.drawscope.g.U(gVar2, this.f63380p.getF42167b().f39331a, gVar2.M0(i32.getF42167b().f42852b), 0L, 0.0f, nVar, 0, 108);
        }
        return G0.f406611a;
    }
}
