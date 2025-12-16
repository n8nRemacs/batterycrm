package com.akita.compose.component.strikethrough;

import Y41.l;
import androidx.compose.ui.graphics.C22277p;
import androidx.compose.ui.graphics.drawscope.a;
import androidx.compose.ui.graphics.drawscope.d;
import androidx.compose.ui.graphics.drawscope.o;
import androidx.compose.ui.graphics.m1;
import androidx.compose.ui.text.G;
import androidx.compose.ui.text.o0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import l0.g;
import l0.n;

/* compiled from: StrikethroughText.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/d;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/graphics/drawscope/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class c extends N implements l<d, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.a<o0> f62973l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f62974m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(long j12, Y41.a aVar) {
        super(1);
        this.f62973l = aVar;
        this.f62974m = j12;
    }

    @Override // Y41.l
    public final G0 invoke(d dVar) {
        long j12;
        c cVar = this;
        d dVar2 = dVar;
        dVar2.y1();
        o0 o0VarInvoke = cVar.f62973l.invoke();
        if (o0VarInvoke != null) {
            G g12 = o0VarInvoke.f42527b;
            int i12 = g12.f41921f;
            int i13 = 0;
            while (i13 < i12) {
                float fG2 = o0VarInvoke.g(i13);
                float f12 = g12.f(i13);
                float fH2 = o0VarInvoke.h(i13);
                float fB2 = g12.b(i13) - f12;
                long jFloatToRawIntBits = (Float.floatToRawIntBits(fB2) & 4294967295L) | (Float.floatToRawIntBits(fH2 - fG2) << 32);
                n.a aVar = n.f413402b;
                long j13 = cVar.f62974m;
                dVar2.getF39478c().f39485a.f(fG2, f12);
                try {
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) / 71.0f;
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) / 30.0f;
                    g.f413384b.getClass();
                    a.b f39478c = dVar2.getF39478c();
                    long jE2 = f39478c.e();
                    f39478c.a().k();
                    try {
                        o0 o0Var = o0VarInvoke;
                        f39478c.f39485a.e(fIntBitsToFloat, fIntBitsToFloat2, 0L);
                        C22277p c22277p = b.f62954a;
                        m1.f39698b.getClass();
                        G g13 = g12;
                        int i14 = i12;
                        j12 = jE2;
                        try {
                            androidx.compose.ui.graphics.drawscope.g.n0(dVar2, c22277p, j13, 0.0f, new o(1.2f, 0.0f, m1.f39700d, 0, null, 26, null), 52);
                            f39478c.a().i();
                            f39478c.j(j12);
                            dVar2.getF39478c().f39485a.f(-fG2, -f12);
                            i13++;
                            cVar = this;
                            o0VarInvoke = o0Var;
                            g12 = g13;
                            i12 = i14;
                        } catch (Throwable th2) {
                            th = th2;
                            f39478c.a().i();
                            f39478c.j(j12);
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        j12 = jE2;
                    }
                } catch (Throwable th4) {
                    dVar2.getF39478c().f39485a.f(-fG2, -f12);
                    throw th4;
                }
            }
        }
        return G0.f406611a;
    }
}
