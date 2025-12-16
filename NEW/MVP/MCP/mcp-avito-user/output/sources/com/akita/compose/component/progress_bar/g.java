package com.akita.compose.component.progress_bar;

import androidx.compose.ui.graphics.C22277p;
import androidx.compose.ui.graphics.Path;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ProgressBar.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/g;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/graphics/drawscope/g;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class g extends N implements Y41.l<androidx.compose.ui.graphics.drawscope.g, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ float f62387l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a<Float> f62388m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f62389n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ a f62390o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ float f62391p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ long f62392q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ long f62393r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(float f12, Y41.a<Float> aVar, float f13, a aVar2, float f14, long j12, long j13) {
        super(1);
        this.f62387l = f12;
        this.f62388m = aVar;
        this.f62389n = f13;
        this.f62390o = aVar2;
        this.f62391p = f14;
        this.f62392q = j12;
        this.f62393r = j13;
    }

    @Override // Y41.l
    public final G0 invoke(androidx.compose.ui.graphics.drawscope.g gVar) {
        androidx.compose.ui.graphics.drawscope.g gVar2 = gVar;
        float fM02 = gVar2.M0(this.f62387l);
        float fFloatValue = this.f62388m.invoke().floatValue();
        float fM03 = gVar2.M0(this.f62389n);
        a aVar = this.f62390o;
        aVar.f62366a.reset();
        C22277p c22277p = aVar.f62367b;
        c22277p.reset();
        float f12 = fM03 / 2;
        float fIntBitsToFloat = (Float.intBitsToFloat((int) (gVar2.i() >> 32)) * fFloatValue) - f12;
        if (fFloatValue == 0.0f || fIntBitsToFloat >= fM02) {
            fM02 = fIntBitsToFloat;
        }
        float fIntBitsToFloat2 = ((1.0f - fFloatValue) * Float.intBitsToFloat((int) (gVar2.i() >> 32))) - f12;
        float f13 = fM03 + fM02;
        C22277p c22277p2 = aVar.f62366a;
        float f14 = this.f62391p;
        if (fFloatValue > 0.99f) {
            Path.b(c22277p2, l0.m.a(0.0f, 0.0f, Float.intBitsToFloat((int) (gVar2.i() >> 32)), Float.intBitsToFloat((int) (gVar2.i() & 4294967295L)), f14, f14));
        } else if (fFloatValue < 0.01f) {
            Path.b(c22277p, l0.m.a(0.0f, 0.0f, f13 + fIntBitsToFloat2, Float.intBitsToFloat((int) (gVar2.i() & 4294967295L)), f14, f14));
        } else {
            Path.b(c22277p2, l0.l.a(aVar.f62368c, 0.0f, fM02, Float.intBitsToFloat((int) (gVar2.i() & 4294967295L)), 243));
            Path.b(c22277p, l0.l.a(aVar.f62369d, f13, fIntBitsToFloat2 + f13, Float.intBitsToFloat((int) (gVar2.i() & 4294967295L)), 242));
        }
        androidx.compose.ui.graphics.drawscope.g.n0(gVar2, c22277p2, this.f62392q, 0.0f, null, 60);
        androidx.compose.ui.graphics.drawscope.g.n0(gVar2, c22277p, this.f62393r, 0.0f, null, 60);
        return G0.f406611a;
    }
}
