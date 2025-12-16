package com.akita.compose.component.slider;

import androidx.compose.ui.graphics.m1;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import l0.g;

/* compiled from: SliderTrack.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/g;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/graphics/drawscope/g;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class w extends N implements Y41.l<androidx.compose.ui.graphics.drawscope.g, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ float f62781l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f62782m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ q f62783n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f62784o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ long f62785p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(float f12, long j12, q qVar, boolean z12, long j13) {
        super(1);
        this.f62781l = f12;
        this.f62782m = j12;
        this.f62783n = qVar;
        this.f62784o = z12;
        this.f62785p = j13;
    }

    @Override // Y41.l
    public final G0 invoke(androidx.compose.ui.graphics.drawscope.g gVar) {
        androidx.compose.ui.graphics.drawscope.g gVar2 = gVar;
        float fM02 = gVar2.M0(this.f62781l);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (gVar2.v1() & 4294967295L));
        long jFloatToRawIntBits = (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat) & 4294967295L);
        g.a aVar = l0.g.f413384b;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (gVar2.i() >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (gVar2.v1() & 4294967295L));
        m1.f39698b.getClass();
        int i12 = m1.f39699c;
        androidx.compose.ui.graphics.drawscope.g.G0(gVar2, this.f62782m, jFloatToRawIntBits, (Float.floatToRawIntBits(fIntBitsToFloat2) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat3) & 4294967295L), fM02, i12, null, 0, 480);
        float fC2 = this.f62783n.c();
        if (this.f62784o || fC2 > 0.0f) {
            float fIntBitsToFloat4 = Float.intBitsToFloat((int) (gVar2.i() >> 32)) * fC2;
            float fIntBitsToFloat5 = Float.intBitsToFloat((int) (gVar2.v1() & 4294967295L));
            androidx.compose.ui.graphics.drawscope.g.G0(gVar2, this.f62785p, jFloatToRawIntBits, (Float.floatToRawIntBits(fIntBitsToFloat4) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat5) & 4294967295L), fM02, i12, null, 0, 480);
        }
        return G0.f406611a;
    }
}
