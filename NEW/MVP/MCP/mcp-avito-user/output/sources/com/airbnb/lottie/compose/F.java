package com.airbnb.lottie.compose;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Typeface;
import androidx.compose.runtime.C22040c3;
import androidx.compose.runtime.C22082i3;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.InterfaceC22192v1;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.Q1;
import androidx.compose.ui.graphics.C22245c;
import androidx.compose.ui.graphics.C22247d;
import androidx.compose.ui.unit.u;
import com.airbnb.lottie.AsyncUpdates;
import com.airbnb.lottie.C27291k;
import com.airbnb.lottie.RenderMode;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: LottiePainter.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/airbnb/lottie/compose/F;", "Landroidx/compose/ui/graphics/painter/e;", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class F extends androidx.compose.ui.graphics.painter.e {

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f59373g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22192v1 f59374h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f59375i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f59376j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f59377k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f59378l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f59379m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f59380n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f59381o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f59382p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f59383q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f59384r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.l
    public z f59385s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final com.airbnb.lottie.B f59386t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public final Matrix f59387u;

    public F() {
        this(null, 0.0f, false, false, false, null, false, null, false, false, null, null, 4095, null);
    }

    @Override // androidx.compose.ui.graphics.painter.e
    /* renamed from: h */
    public final long getF39738j() {
        if (((C27291k) ((C22082i3) this.f59373g).getF42167b()) != null) {
            return l0.o.a(r0.f59592k.width(), r0.f59592k.height());
        }
        l0.n.f413402b.getClass();
        return l0.n.f413403c;
    }

    @Override // androidx.compose.ui.graphics.painter.e
    public final void i(@Y61.k androidx.compose.ui.graphics.drawscope.g gVar) {
        C27291k c27291k = (C27291k) ((C22082i3) this.f59373g).getF42167b();
        if (c27291k == null) {
            return;
        }
        androidx.compose.ui.graphics.M mA2 = gVar.getF39478c().a();
        long jA2 = l0.o.a(c27291k.f59592k.width(), c27291k.f59592k.height());
        long jA3 = androidx.compose.ui.unit.v.a(kotlin.math.b.b(l0.n.e(gVar.i())), kotlin.math.b.b(l0.n.c(gVar.i())));
        Matrix matrix = this.f59387u;
        matrix.reset();
        u.a aVar = androidx.compose.ui.unit.u.f42871b;
        matrix.preScale(((int) (jA3 >> 32)) / l0.n.e(jA2), ((int) (jA3 & 4294967295L)) / l0.n.c(jA2));
        boolean zBooleanValue = ((Boolean) ((C22082i3) this.f59377k).getF42167b()).booleanValue();
        com.airbnb.lottie.B b12 = this.f59386t;
        b12.i(zBooleanValue);
        b12.f59015A = (RenderMode) ((C22082i3) this.f59378l).getF42167b();
        b12.e();
        b12.f59031Q = (AsyncUpdates) ((C22082i3) this.f59383q).getF42167b();
        b12.r(c27291k);
        Map<String, Typeface> map = (Map) ((C22082i3) this.f59382p).getF42167b();
        if (map != b12.f59046m) {
            b12.f59046m = map;
            b12.invalidateSelf();
        }
        InterfaceC22204y1 interfaceC22204y1 = this.f59380n;
        z zVar = (z) ((C22082i3) interfaceC22204y1).getF42167b();
        z zVar2 = this.f59385s;
        if (zVar != zVar2) {
            if (zVar2 != null || ((z) ((C22082i3) interfaceC22204y1).getF42167b()) != null) {
                throw null;
            }
            this.f59385s = (z) ((C22082i3) interfaceC22204y1).getF42167b();
        }
        boolean zBooleanValue2 = ((Boolean) ((C22082i3) this.f59375i).getF42167b()).booleanValue();
        if (b12.f59056w != zBooleanValue2) {
            b12.f59056w = zBooleanValue2;
            com.airbnb.lottie.model.layer.c cVar = b12.f59053t;
            if (cVar != null) {
                cVar.r(zBooleanValue2);
            }
        }
        b12.f59057x = ((Boolean) ((C22082i3) this.f59376j).getF42167b()).booleanValue();
        b12.f59051r = ((Boolean) ((C22082i3) this.f59379m).getF42167b()).booleanValue();
        b12.q(((Boolean) ((C22082i3) this.f59381o).getF42167b()).booleanValue());
        boolean zBooleanValue3 = ((Boolean) ((C22082i3) this.f59384r).getF42167b()).booleanValue();
        if (zBooleanValue3 != b12.f59059z) {
            b12.f59059z = zBooleanValue3;
            b12.invalidateSelf();
        }
        b12.y(((C22040c3) this.f59374h).f());
        b12.setBounds(0, 0, c27291k.f59592k.width(), c27291k.f59592k.height());
        Canvas canvas = C22247d.f39473a;
        b12.g(((C22245c) mA2).f39351a, matrix);
    }

    public F(C27291k c27291k, float f12, boolean z12, boolean z13, boolean z14, RenderMode renderMode, boolean z15, z zVar, boolean z16, boolean z17, Map map, AsyncUpdates asyncUpdates, int i12, C42822w c42822w) {
        C27291k c27291k2 = (i12 & 1) != 0 ? null : c27291k;
        float f13 = (i12 & 2) != 0 ? 0.0f : f12;
        boolean z18 = (i12 & 4) != 0 ? false : z12;
        boolean z19 = (i12 & 8) != 0 ? false : z13;
        boolean z22 = (i12 & 16) != 0 ? false : z14;
        RenderMode renderMode2 = (i12 & 32) != 0 ? RenderMode.f59154b : renderMode;
        boolean z23 = (i12 & 64) != 0 ? false : z15;
        z zVar2 = (i12 & 128) != 0 ? null : zVar;
        boolean z24 = (i12 & 256) != 0 ? true : z16;
        boolean z25 = (i12 & 512) == 0 ? z17 : false;
        Map map2 = (i12 & 1024) == 0 ? map : null;
        AsyncUpdates asyncUpdates2 = (i12 & 2048) != 0 ? AsyncUpdates.f59010b : asyncUpdates;
        this.f59373g = C22126m3.g(c27291k2);
        this.f59374h = Q1.a(f13);
        this.f59375i = C22126m3.g(Boolean.valueOf(z18));
        this.f59376j = C22126m3.g(Boolean.valueOf(z19));
        this.f59377k = C22126m3.g(Boolean.valueOf(z22));
        this.f59378l = C22126m3.g(renderMode2);
        this.f59379m = C22126m3.g(Boolean.valueOf(z23));
        this.f59380n = C22126m3.g(zVar2);
        this.f59381o = C22126m3.g(Boolean.valueOf(z24));
        this.f59382p = C22126m3.g(map2);
        this.f59383q = C22126m3.g(asyncUpdates2);
        this.f59384r = C22126m3.g(Boolean.valueOf(z25));
        this.f59386t = new com.airbnb.lottie.B();
        this.f59387u = new Matrix();
    }
}
