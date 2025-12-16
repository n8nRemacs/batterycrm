package com.avito.android.competitor_analytics.ui;

import androidx.compose.ui.graphics.C22277p;
import androidx.compose.ui.graphics.C22315w;
import androidx.compose.ui.graphics.m1;
import androidx.compose.ui.unit.h;
import com.avito.android.competitor_analytics.mvi.entity.b;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: CompetitorAnalyticsSmallChart.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/g;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/graphics/drawscope/g;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class w0 extends kotlin.jvm.internal.N implements Y41.l<androidx.compose.ui.graphics.drawscope.g, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b.g.C3713b f124870l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(b.g.C3713b c3713b) {
        super(1);
        this.f124870l = c3713b;
    }

    public static final C22277p a(androidx.compose.ui.graphics.drawscope.g gVar, b.g.C3713b c3713b, ArrayList arrayList) {
        float fIntBitsToFloat = arrayList.size() > 1 ? Float.intBitsToFloat((int) (gVar.i() >> 32)) / (arrayList.size() - 1) : Float.intBitsToFloat((int) (gVar.i() >> 32));
        C22277p c22277pA = C22315w.a();
        int i12 = 0;
        for (Object obj : arrayList) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            Float f12 = (Float) obj;
            if (f12 != null) {
                float f13 = i12 * fIntBitsToFloat;
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (gVar.i() & 4294967295L)) - (Float.intBitsToFloat((int) (gVar.i() & 4294967295L)) * ((f12.floatValue() - 0) / c3713b.f124520j));
                if (i12 == 0 || arrayList.get(i12 - 1) == null) {
                    c22277pA.i(f13, fIntBitsToFloat2);
                }
                if (i12 != 0) {
                    c22277pA.r(f13, fIntBitsToFloat2);
                }
            }
            i12 = i13;
        }
        return c22277pA;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(androidx.compose.ui.graphics.drawscope.g gVar) {
        androidx.compose.ui.graphics.drawscope.g gVar2 = gVar;
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        float fM02 = gVar2.M0(2);
        m1.f39698b.getClass();
        androidx.compose.ui.graphics.drawscope.o oVar = new androidx.compose.ui.graphics.drawscope.o(fM02, 0.0f, m1.f39699c, 0, null, 26, null);
        b.g.C3713b c3713b = this.f124870l;
        androidx.compose.ui.graphics.drawscope.g.n0(gVar2, a(gVar2, c3713b, c3713b.f124519i), c3713b.f124512b.f124329b, 0.0f, oVar, 52);
        androidx.compose.ui.graphics.drawscope.g.n0(gVar2, a(gVar2, c3713b, c3713b.f124518h), c3713b.f124511a.f124329b, 0.0f, oVar, 52);
        return kotlin.G0.f406611a;
    }
}
