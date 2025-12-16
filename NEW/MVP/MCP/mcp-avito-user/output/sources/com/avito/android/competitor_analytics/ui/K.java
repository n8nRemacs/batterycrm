package com.avito.android.competitor_analytics.ui;

import android.graphics.DashPathEffect;
import androidx.compose.runtime.InterfaceC22192v1;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.ui.graphics.C22277p;
import androidx.compose.ui.graphics.C22279q;
import androidx.compose.ui.graphics.C22315w;
import androidx.compose.ui.graphics.I0;
import androidx.compose.ui.graphics.m1;
import androidx.compose.ui.unit.h;
import com.avito.android.competitor_analytics.domain.model.ChartColor;
import com.avito.android.competitor_analytics.mvi.entity.b;
import com.avito.android.competitor_analytics.util.d;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import l0.g;

/* compiled from: CompetitorAnalyticsFullChart.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/g;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/graphics/drawscope/g;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class K extends kotlin.jvm.internal.N implements Y41.l<androidx.compose.ui.graphics.drawscope.g, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.competitor_analytics.util.d f124657l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ b.g.C3713b f124658m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22192v1 f124659n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22192v1 f124660o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ long f124661p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22192v1 f124662q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1<Integer> f124663r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f124664s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ long f124665t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(com.avito.android.competitor_analytics.util.d dVar, b.g.C3713b c3713b, InterfaceC22192v1 interfaceC22192v1, InterfaceC22192v1 interfaceC22192v12, long j12, InterfaceC22192v1 interfaceC22192v13, InterfaceC22204y1<Integer> interfaceC22204y1, long j13, long j14) {
        super(1);
        this.f124657l = dVar;
        this.f124658m = c3713b;
        this.f124659n = interfaceC22192v1;
        this.f124660o = interfaceC22192v12;
        this.f124661p = j12;
        this.f124662q = interfaceC22192v13;
        this.f124663r = interfaceC22204y1;
        this.f124664s = j13;
        this.f124665t = j14;
    }

    public static final C22277p a(float f12, InterfaceC22192v1 interfaceC22192v1, com.avito.android.competitor_analytics.util.d dVar, androidx.compose.ui.graphics.drawscope.g gVar, ArrayList arrayList) {
        C22277p c22277pA = C22315w.a();
        int i12 = 0;
        for (Object obj : arrayList) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            Float f13 = (Float) obj;
            if (f13 != null) {
                float f14 = (i12 * f12) + interfaceC22192v1.f();
                float fB2 = b(dVar, gVar, f13.floatValue());
                if (i12 == 0 || arrayList.get(i12 - 1) == null) {
                    c22277pA.i(f14, fB2);
                }
                if (i12 != 0) {
                    c22277pA.r(f14, fB2);
                }
            }
            i12 = i13;
        }
        return c22277pA;
    }

    public static final float b(com.avito.android.competitor_analytics.util.d dVar, androidx.compose.ui.graphics.drawscope.g gVar, float f12) {
        return Float.intBitsToFloat((int) (gVar.i() & 4294967295L)) - (Float.intBitsToFloat((int) (gVar.i() & 4294967295L)) * ((f12 - 0) / dVar.f124911a));
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(androidx.compose.ui.graphics.drawscope.g gVar) {
        b.g.C3713b c3713b;
        int i12 = 2;
        androidx.compose.ui.graphics.drawscope.g gVar2 = gVar;
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        float fM02 = gVar2.M0(2);
        m1.f39698b.getClass();
        androidx.compose.ui.graphics.drawscope.o oVar = new androidx.compose.ui.graphics.drawscope.o(fM02, 0.0f, m1.f39699c, 0, null, 26, null);
        float f12 = 20;
        float fM03 = gVar2.M0(f12);
        InterfaceC22192v1 interfaceC22192v1 = this.f124659n;
        interfaceC22192v1.S6(fM03);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (gVar2.i() >> 32)) - gVar2.M0(f12);
        InterfaceC22192v1 interfaceC22192v12 = this.f124660o;
        interfaceC22192v12.S6(fIntBitsToFloat);
        float f13 = interfaceC22192v12.f() - interfaceC22192v1.f();
        com.avito.android.competitor_analytics.util.d dVar = this.f124657l;
        Iterator it = dVar.f124913c.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            c3713b = this.f124658m;
            if (!zHasNext) {
                break;
            }
            d.c cVar = (d.c) it.next();
            float fB2 = b(dVar, gVar2, cVar.f124920a);
            if (cVar.f124920a == c3713b.f124520j) {
                this.f124662q.S6(fB2);
            }
            I0.a aVar2 = androidx.compose.ui.graphics.I0.f39285a;
            float fM04 = gVar2.M0(4);
            float fM05 = gVar2.M0(8);
            float[] fArr = new float[i12];
            fArr[0] = fM04;
            fArr[1] = fM05;
            aVar2.getClass();
            C22279q c22279q = new C22279q(new DashPathEffect(fArr, 0.0f));
            g.a aVar3 = l0.g.f413384b;
            androidx.compose.ui.graphics.drawscope.g.G0(gVar2, this.f124661p, (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(fB2) & 4294967295L), (Float.floatToRawIntBits(Float.intBitsToFloat((int) (gVar2.i() >> 32))) << 32) | (Float.floatToRawIntBits(fB2) & 4294967295L), gVar2.M0(1), 0, c22279q, 0, 464);
            dVar = dVar;
            interfaceC22192v1 = interfaceC22192v1;
            i12 = 2;
        }
        com.avito.android.competitor_analytics.util.d dVar2 = dVar;
        InterfaceC22192v1 interfaceC22192v13 = interfaceC22192v1;
        if (c3713b.f124517g.size() > 1) {
            f13 /= c3713b.f124517g.size() - 1;
        }
        float f14 = f13;
        ArrayList arrayList = c3713b.f124519i;
        C22277p c22277pA = a(f14, interfaceC22192v13, dVar2, gVar2, arrayList);
        ChartColor chartColor = c3713b.f124512b;
        androidx.compose.ui.graphics.drawscope.g.n0(gVar2, c22277pA, chartColor.f124329b, 0.0f, oVar, 52);
        ArrayList arrayList2 = c3713b.f124518h;
        C22277p c22277pA2 = a(f14, interfaceC22192v13, dVar2, gVar2, arrayList2);
        ChartColor chartColor2 = c3713b.f124511a;
        androidx.compose.ui.graphics.drawscope.g.n0(gVar2, c22277pA2, chartColor2.f124329b, 0.0f, oVar, 52);
        Integer f42167b = this.f124663r.getF42167b();
        if (f42167b != null) {
            int iIntValue = f42167b.intValue();
            float f15 = interfaceC22192v13.f() + (iIntValue * f14);
            g.a aVar4 = l0.g.f413384b;
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (gVar2.i() & 4294967295L));
            androidx.compose.ui.graphics.drawscope.g.G0(gVar2, this.f124664s, (Float.floatToRawIntBits(f15) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L), (4294967295L & Float.floatToRawIntBits(fIntBitsToFloat2)) | (Float.floatToRawIntBits(f15) << 32), gVar2.M0(1), 0, null, 0, 496);
            Float f16 = (Float) C42745f0.K(iIntValue, arrayList);
            long j12 = this.f124665t;
            if (f16 != null) {
                O.c(gVar2, chartColor.f124329b, j12, f15, b(dVar2, gVar2, f16.floatValue()));
            }
            Float f17 = (Float) C42745f0.K(iIntValue, arrayList2);
            if (f17 != null) {
                O.c(gVar2, chartColor2.f124329b, j12, f15, b(dVar2, gVar2, f17.floatValue()));
            }
        }
        return kotlin.G0.f406611a;
    }
}
