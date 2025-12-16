package com.akita.compose.foundation.modifier;

import Y41.l;
import android.graphics.BlurMaskFilter;
import android.graphics.Paint;
import androidx.compose.ui.graphics.C22273n;
import androidx.compose.ui.graphics.M;
import androidx.compose.ui.graphics.drawscope.g;
import androidx.compose.ui.unit.h;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: Shadow.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/g;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/graphics/drawscope/g;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class c extends N implements l<g, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ float f63605l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f63606m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f63607n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ float f63608o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ float f63609p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ float f63610q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(float f12, int i12, float f13, float f14, float f15, float f16) {
        super(1);
        this.f63605l = f12;
        this.f63606m = i12;
        this.f63607n = f13;
        this.f63608o = f14;
        this.f63609p = f15;
        this.f63610q = f16;
    }

    @Override // Y41.l
    public final G0 invoke(g gVar) {
        g gVar2 = gVar;
        float f12 = d.f63611a;
        float f13 = this.f63605l;
        if (!h.b(f13, f12)) {
            M mA2 = gVar2.getF39478c().a();
            C22273n c22273n = new C22273n();
            Paint paint = c22273n.f39702a;
            if (!h.b(f13, f12)) {
                paint.setMaskFilter(new BlurMaskFilter(gVar2.M0(f13), BlurMaskFilter.Blur.NORMAL));
            }
            paint.setColor(this.f63606m);
            float fM02 = gVar2.M0(this.f63607n);
            float f14 = this.f63608o;
            float f15 = fM02 - f14;
            float fM03 = gVar2.M0(this.f63609p) - f14;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (gVar2.i() >> 32)) + f14 + f15;
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (gVar2.i() & 4294967295L)) + f14 + fM03;
            float f16 = this.f63610q;
            mA2.w(f15, fM03, fIntBitsToFloat, fIntBitsToFloat2, gVar2.M0(f16), gVar2.M0(f16), c22273n);
        }
        return G0.f406611a;
    }
}
