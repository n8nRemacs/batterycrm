package com.akita.compose.component.docking_badge;

import androidx.compose.runtime.internal.P;
import androidx.compose.ui.graphics.A0;
import androidx.compose.ui.graphics.C22277p;
import androidx.compose.ui.graphics.C22315w;
import androidx.compose.ui.graphics.D0;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.h1;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import l0.g;

/* compiled from: EdgeShape.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/akita/compose/component/docking_badge/l;", "Landroidx/compose/ui/graphics/h1;", "docking-badge_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class l implements h1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final m f61550a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final m f61551b;

    public l(@Y61.k m mVar, @Y61.k m mVar2) {
        this.f61550a = mVar;
        this.f61551b = mVar2;
    }

    public static l0.j b(C22277p c22277p, float[] fArr, long j12) {
        l0.j jVarW = c22277p.w();
        float fMax = Math.max(jVarW.f413392c - jVarW.f413390a, jVarW.f413393d - jVarW.f413391b);
        int i12 = (int) (j12 & 4294967295L);
        A0.g(fArr, Float.intBitsToFloat(i12) / fMax, Float.intBitsToFloat(i12) / fMax);
        c22277p.x(fArr);
        A0.e(fArr);
        return c22277p.w();
    }

    @Override // androidx.compose.ui.graphics.h1
    @Y61.k
    public final D0 a(long j12, @Y61.k LayoutDirection layoutDirection, @Y61.k androidx.compose.ui.unit.d dVar) {
        float[] fArrB = A0.b();
        C22277p c22277pA = C22315w.a();
        C22277p c22277pA2 = C22315w.a();
        this.f61551b.a(c22277pA2);
        l0.j jVarB = b(c22277pA2, fArrB, j12);
        float f12 = jVarB.f413392c - jVarB.f413390a;
        float f13 = jVarB.f413393d - jVarB.f413391b;
        int i12 = (int) (j12 >> 32);
        g.a aVar = l0.g.f413384b;
        c22277pA.v(c22277pA2, (Float.floatToRawIntBits(Float.intBitsToFloat(i12) - f12) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L));
        C22277p c22277pA3 = C22315w.a();
        m mVar = this.f61550a;
        mVar.a(c22277pA3);
        l0.j jVarB2 = b(c22277pA3, fArrB, j12);
        float f14 = jVarB2.f413390a;
        float f15 = jVarB2.f413392c;
        if (mVar.f61552a) {
            A0.i(fArrB, f15 - f14, 0.0f);
            A0.g(fArrB, 1.0f, -1.0f);
        } else {
            A0.i(fArrB, f15 - f14, jVarB2.f413393d - jVarB2.f413391b);
        }
        A0.f(fArrB, 180.0f);
        c22277pA3.x(fArrB);
        Path.t(c22277pA, c22277pA3);
        Path.q(c22277pA, new l0.j(f15 - f14, 0.0f, Float.intBitsToFloat(i12) - f12, f13));
        return new D0.a(c22277pA);
    }
}
