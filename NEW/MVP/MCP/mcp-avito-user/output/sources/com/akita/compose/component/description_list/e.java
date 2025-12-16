package com.akita.compose.component.description_list;

import Y41.l;
import android.graphics.DashPathEffect;
import androidx.compose.runtime.InterfaceC22192v1;
import androidx.compose.ui.graphics.C22279q;
import androidx.compose.ui.graphics.I0;
import com.akita.compose.component.description_list.j;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import l0.g;

/* compiled from: DescriptionList.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/g;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/graphics/drawscope/g;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class e extends N implements l<androidx.compose.ui.graphics.drawscope.g, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22192v1 f61472l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f61473m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22192v1 f61474n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ j f61475o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ float f61476p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f61477q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(InterfaceC22192v1 interfaceC22192v1, long j12, InterfaceC22192v1 interfaceC22192v12, j jVar, float f12, int i12) {
        super(1);
        this.f61472l = interfaceC22192v1;
        this.f61473m = j12;
        this.f61474n = interfaceC22192v12;
        this.f61475o = jVar;
        this.f61476p = f12;
        this.f61477q = i12;
    }

    @Override // Y41.l
    public final G0 invoke(androidx.compose.ui.graphics.drawscope.g gVar) {
        androidx.compose.ui.graphics.drawscope.g gVar2 = gVar;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (gVar2.i() >> 32)) - this.f61472l.f();
        gVar2.getF39478c().a();
        float f12 = this.f61474n.f();
        j jVar = this.f61475o;
        float fM02 = gVar2.M0(jVar.f61495f.f61501f) + f12;
        float f13 = this.f61476p - this.f61477q;
        g.a aVar = l0.g.f413384b;
        j.a aVar2 = jVar.f61495f;
        I0.a aVar3 = I0.f39285a;
        float[] fArr = {gVar2.M0(aVar2.f61499d), gVar2.M0(aVar2.f61500e)};
        aVar3.getClass();
        androidx.compose.ui.graphics.drawscope.g.G0(gVar2, this.f61473m, (Float.floatToRawIntBits(fM02) << 32) | (Float.floatToRawIntBits(f13) & 4294967295L), (Float.floatToRawIntBits(f13) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat - gVar2.M0(aVar2.f61501f)) << 32), 0.0f, 0, new C22279q(new DashPathEffect(fArr, 0.0f)), 0, 472);
        return G0.f406611a;
    }
}
