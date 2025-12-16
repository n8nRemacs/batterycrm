package com.avito.android.mortgage.sign;

import android.graphics.DashPathEffect;
import androidx.compose.ui.graphics.C22279q;
import androidx.compose.ui.graphics.I0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import l0.C43522a;

/* compiled from: SignScreen.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/g;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/graphics/drawscope/g;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class r extends N implements Y41.l<androidx.compose.ui.graphics.drawscope.g, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ float f203804l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f203805m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f203806n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f203807o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(long j12, float f12, float f13, float f14) {
        super(1);
        this.f203804l = f12;
        this.f203805m = f13;
        this.f203806n = f14;
        this.f203807o = j12;
    }

    @Override // Y41.l
    public final G0 invoke(androidx.compose.ui.graphics.drawscope.g gVar) {
        androidx.compose.ui.graphics.drawscope.g gVar2 = gVar;
        I0.a aVar = I0.f39285a;
        float f12 = this.f203805m;
        aVar.getClass();
        androidx.compose.ui.graphics.drawscope.o oVar = new androidx.compose.ui.graphics.drawscope.o(this.f203804l, 0.0f, 0, 0, new C22279q(new DashPathEffect(new float[]{f12, f12}, 0.0f)), 14, null);
        float f13 = this.f203806n;
        long jFloatToRawIntBits = (Float.floatToRawIntBits(f13) << 32) | (Float.floatToRawIntBits(f13) & 4294967295L);
        C43522a.C11768a c11768a = C43522a.f413378b;
        androidx.compose.ui.graphics.drawscope.g.d1(gVar2, this.f203807o, 0L, 0L, jFloatToRawIntBits, oVar, 0.0f, 230);
        return G0.f406611a;
    }
}
