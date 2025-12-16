package com.akita.compose.foundation.modifier;

import Y41.l;
import android.graphics.BlendMode;
import android.graphics.Paint;
import android.os.Build;
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
final class b extends N implements l<g, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ float f63598l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f63599m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f63600n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ float f63601o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f63602p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ float f63603q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ float f63604r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(float f12, float f13, float f14, float f15, float f16, int i12, int i13) {
        super(1);
        this.f63598l = f12;
        this.f63599m = i12;
        this.f63600n = f13;
        this.f63601o = f14;
        this.f63602p = i13;
        this.f63603q = f15;
        this.f63604r = f16;
    }

    @Override // Y41.l
    public final G0 invoke(g gVar) {
        g gVar2 = gVar;
        float f12 = d.f63611a;
        float f13 = this.f63598l;
        if (!h.b(f13, f12)) {
            M mA2 = gVar2.getF39478c().a();
            C22273n c22273n = new C22273n();
            Paint paint = c22273n.f39702a;
            paint.setColor(this.f63599m);
            paint.setShadowLayer(gVar2.M0(f13), gVar2.M0(this.f63600n), gVar2.M0(this.f63601o), this.f63602p);
            if (Build.VERSION.SDK_INT >= 29) {
                paint.setBlendMode(BlendMode.SRC_OVER);
            }
            float f14 = this.f63603q;
            float f15 = 0.0f - f14;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (gVar2.i() >> 32)) + f14;
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (gVar2.i() & 4294967295L)) + f14;
            float f16 = this.f63604r;
            mA2.w(f15, f15, fIntBitsToFloat, fIntBitsToFloat2, gVar2.M0(f16), gVar2.M0(f16), c22273n);
        }
        return G0.f406611a;
    }
}
