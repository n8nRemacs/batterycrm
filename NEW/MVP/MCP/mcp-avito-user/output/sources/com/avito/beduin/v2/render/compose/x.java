package com.avito.beduin.v2.render.compose;

import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.ui.graphics.T;
import androidx.compose.ui.graphics.V;
import androidx.compose.ui.graphics.k1;
import androidx.compose.ui.unit.h;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import l0.g;

/* compiled from: RecompositionModifiers.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/d;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/graphics/drawscope/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class x extends N implements Y41.l<androidx.compose.ui.graphics.drawscope.d, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Long[] f338106l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1<Long> f338107m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(Long[] lArr, InterfaceC22204y1<Long> interfaceC22204y1) {
        super(1);
        this.f338106l = lArr;
        this.f338107m = interfaceC22204y1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y41.l
    public final G0 invoke(androidx.compose.ui.graphics.drawscope.d dVar) {
        Q q12;
        androidx.compose.ui.graphics.drawscope.d dVar2 = dVar;
        dVar2.y1();
        long jLongValue = this.f338106l[0].longValue() - this.f338107m.getF42167b().longValue();
        if (l0.n.d(dVar2.i()) > 0.0f) {
            long j12 = 0;
            if (jLongValue > 0) {
                if (jLongValue == 1) {
                    T.f39320b.getClass();
                    q12 = new Q(T.a(T.f39326h), Float.valueOf(1.0f));
                } else if (jLongValue == 2) {
                    T.f39320b.getClass();
                    T tA2 = T.a(T.f39325g);
                    h.a aVar = androidx.compose.ui.unit.h.f42849c;
                    q12 = new Q(tA2, Float.valueOf(dVar2.M0(2)));
                } else {
                    T.f39320b.getClass();
                    T tA3 = T.a(V.h(T.c(T.f39327i, 0.8f), T.c(T.f39324f, 0.5f), Math.min(1.0f, (jLongValue - 1) / 100.0f)));
                    h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
                    q12 = new Q(tA3, Float.valueOf(dVar2.M0((int) jLongValue)));
                }
                long j13 = ((T) q12.f406619b).f39331a;
                float fFloatValue = ((Number) q12.f406620c).floatValue();
                float f12 = 2;
                float f13 = fFloatValue / f12;
                long jFloatToRawIntBits = (Float.floatToRawIntBits(f13) & 4294967295L) | (Float.floatToRawIntBits(f13) << 32);
                g.a aVar3 = l0.g.f413384b;
                long jFloatToRawIntBits2 = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (dVar2.i() >> 32)) - fFloatValue) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (dVar2.i() & 4294967295L)) - fFloatValue) & 4294967295L);
                boolean z12 = f12 * fFloatValue > l0.n.d(dVar2.i());
                if (z12) {
                    l0.g.f413384b.getClass();
                } else {
                    j12 = jFloatToRawIntBits;
                }
                if (z12) {
                    jFloatToRawIntBits2 = dVar2.i();
                }
                androidx.compose.ui.graphics.drawscope.g.e0(dVar2, new k1(j13, null), j12, jFloatToRawIntBits2, 0.0f, z12 ? androidx.compose.ui.graphics.drawscope.n.f39497a : new androidx.compose.ui.graphics.drawscope.o(fFloatValue, 0.0f, 0, 0, null, 30, null), null, 104);
            }
        }
        return G0.f406611a;
    }
}
