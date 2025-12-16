package com.akita.compose.component.tab_group;

import androidx.compose.runtime.I3;
import androidx.compose.ui.graphics.k1;
import androidx.compose.ui.unit.h;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import l0.g;
import l0.n;

/* compiled from: TabGroupIndicator.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/g;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/graphics/drawscope/g;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class c extends N implements Y41.l<androidx.compose.ui.graphics.drawscope.g, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f62976l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ R2.a f62977m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f62978n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ float f62979o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ long f62980p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ I3<Float> f62981q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ I3<Float> f62982r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(long j12, R2.a aVar, float f12, float f13, long j13, I3<Float> i32, I3<Float> i33) {
        super(1);
        this.f62976l = j12;
        this.f62977m = aVar;
        this.f62978n = f12;
        this.f62979o = f13;
        this.f62980p = j13;
        this.f62981q = i32;
        this.f62982r = i33;
    }

    @Override // Y41.l
    public final G0 invoke(androidx.compose.ui.graphics.drawscope.g gVar) {
        androidx.compose.ui.graphics.drawscope.g gVar2 = gVar;
        k1 k1Var = new k1(this.f62976l, null);
        R2.a aVar = this.f62977m;
        float f12 = aVar.f14068b;
        float f13 = this.f62978n;
        float f14 = this.f62979o;
        h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
        float fM02 = gVar2.M0(f13 - f14);
        long jFloatToRawIntBits = (Float.floatToRawIntBits(f12) << 32) | (Float.floatToRawIntBits(fM02) & 4294967295L);
        g.a aVar3 = l0.g.f413384b;
        float f15 = aVar.f14069c;
        float fM03 = gVar2.M0(f14);
        long jFloatToRawIntBits2 = (Float.floatToRawIntBits(f15) << 32) | (Float.floatToRawIntBits(fM03) & 4294967295L);
        n.a aVar4 = l0.n.f413402b;
        androidx.compose.ui.graphics.drawscope.g.e0(gVar2, k1Var, jFloatToRawIntBits, jFloatToRawIntBits2, 0.0f, null, null, 120);
        float fFloatValue = this.f62982r.getF42167b().floatValue();
        float fM04 = gVar2.M0(f13);
        androidx.compose.ui.graphics.drawscope.g.e0(gVar2, new k1(this.f62980p, null), (Float.floatToRawIntBits(this.f62981q.getF42167b().floatValue()) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L), (Float.floatToRawIntBits(fFloatValue) << 32) | (Float.floatToRawIntBits(fM04) & 4294967295L), 0.0f, null, null, 120);
        return G0.f406611a;
    }
}
