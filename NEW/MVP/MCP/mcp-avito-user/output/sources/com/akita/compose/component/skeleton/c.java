package com.akita.compose.component.skeleton;

import Y41.l;
import androidx.compose.animation.core.C20281g0;
import androidx.compose.runtime.J3;
import androidx.compose.ui.text.o0;
import com.akita.compose.foundation.r;
import com.facebook.imageutils.JfifUtil;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import l0.C43522a;
import l0.g;
import l0.n;

/* compiled from: Skeleton.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/d;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/graphics/drawscope/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class c extends N implements l<androidx.compose.ui.graphics.drawscope.d, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.a<o0> f62683l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f62684m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ r f62685n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C20281g0.a f62686o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Y41.a aVar, long j12, r rVar, C20281g0.a aVar2) {
        super(1);
        this.f62683l = aVar;
        this.f62684m = j12;
        this.f62685n = rVar;
        this.f62686o = aVar2;
    }

    @Override // Y41.l
    public final G0 invoke(androidx.compose.ui.graphics.drawscope.d dVar) {
        androidx.compose.ui.graphics.drawscope.d dVar2 = dVar;
        o0 o0VarInvoke = this.f62683l.invoke();
        if (o0VarInvoke != null) {
            float fB2 = o0VarInvoke.f42529d - (o0VarInvoke.f42527b.b(0) - dVar2.A0(o0VarInvoke.f42526a.f42507b.f42739a.fontSize));
            g.a aVar = g.f413384b;
            long jFloatToRawIntBits = (Float.floatToRawIntBits(fB2) & 4294967295L) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (dVar2.i() >> 32))) << 32);
            n.a aVar2 = n.f413402b;
            float fM02 = dVar2.M0(this.f62685n.f63651h);
            long jFloatToRawIntBits2 = (Float.floatToRawIntBits(fM02) << 32) | (Float.floatToRawIntBits(fM02) & 4294967295L);
            C43522a.C11768a c11768a = C43522a.f413378b;
            J3 j32 = b.f62671a;
            androidx.compose.ui.graphics.drawscope.g.d1(dVar2, this.f62684m, (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(r2) & 4294967295L), jFloatToRawIntBits, jFloatToRawIntBits2, null, ((Number) this.f62686o.getF42167b()).floatValue(), JfifUtil.MARKER_RST0);
        }
        return G0.f406611a;
    }
}
