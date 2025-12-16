package com.akita.compose.component.progress_bar;

import androidx.compose.ui.graphics.C22277p;
import androidx.compose.ui.graphics.Path;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ProgressBar.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/g;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/graphics/drawscope/g;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class d extends N implements Y41.l<androidx.compose.ui.graphics.drawscope.g, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ float f62377l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f62378m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ List<m> f62379n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ a f62380o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ float f62381p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(float f12, float f13, List<m> list, a aVar, float f14) {
        super(1);
        this.f62377l = f12;
        this.f62378m = f13;
        this.f62379n = list;
        this.f62380o = aVar;
        this.f62381p = f14;
    }

    @Override // Y41.l
    public final G0 invoke(androidx.compose.ui.graphics.drawscope.g gVar) {
        l0.l lVarA;
        androidx.compose.ui.graphics.drawscope.g gVar2 = gVar;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (gVar2.i() >> 32)) / this.f62377l;
        float fM02 = gVar2.M0(this.f62378m);
        float f12 = fM02 / 2;
        List<m> list = this.f62379n;
        Iterator<m> it = list.iterator();
        int i12 = 0;
        float f13 = 0.0f;
        while (it.hasNext()) {
            int i13 = i12 + 1;
            m next = it.next();
            if ((next != null ? next : null) != null) {
                float f14 = (i12 == 0 || i12 == list.size() + (-1)) ? (next.f62409a * fIntBitsToFloat) - f12 : (next.f62409a * fIntBitsToFloat) - fM02;
                a aVar = this.f62380o;
                aVar.f62366a.reset();
                if (i12 == 0 && list.size() - 1 == 0) {
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (gVar2.i() >> 32));
                    float fIntBitsToFloat3 = Float.intBitsToFloat((int) (gVar2.i() & 4294967295L));
                    float f15 = this.f62381p;
                    lVarA = l0.m.a(0.0f, 0.0f, fIntBitsToFloat2, fIntBitsToFloat3, f15, f15);
                } else if (i12 == 0) {
                    lVarA = l0.l.a(aVar.f62368c, f13, f13 + f14, Float.intBitsToFloat((int) (gVar2.i() & 4294967295L)), 242);
                } else if (i12 == list.size() - 1) {
                    lVarA = l0.l.a(aVar.f62369d, f13, f13 + f14, Float.intBitsToFloat((int) (gVar2.i() & 4294967295L)), 242);
                } else {
                    lVarA = l0.m.a(f13, 0.0f, f13 + f14, Float.intBitsToFloat((int) (gVar2.i() & 4294967295L)), 0.0f, 0.0f);
                }
                C22277p c22277p = aVar.f62366a;
                Path.b(c22277p, lVarA);
                androidx.compose.ui.graphics.drawscope.g.n0(gVar2, c22277p, next.f62410b, 0.0f, null, 60);
                f13 = f14 + fM02 + f13;
            }
            i12 = i13;
        }
        return G0.f406611a;
    }
}
