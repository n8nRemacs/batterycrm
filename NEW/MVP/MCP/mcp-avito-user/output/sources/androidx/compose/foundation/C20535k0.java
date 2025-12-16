package androidx.compose.foundation;

import androidx.compose.ui.graphics.InterfaceC22280q0;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: Border.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/d;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/graphics/drawscope/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: androidx.compose.foundation.k0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C20535k0 extends kotlin.jvm.internal.N implements Y41.l<androidx.compose.ui.graphics.drawscope.d, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ l0.j f28183l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ l0.h<InterfaceC22280q0> f28184m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f28185n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.graphics.F f28186o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20535k0(l0.j jVar, l0.h hVar, long j12, androidx.compose.ui.graphics.F f12) {
        super(1);
        this.f28183l = jVar;
        this.f28184m = hVar;
        this.f28185n = j12;
        this.f28186o = f12;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(androidx.compose.ui.graphics.drawscope.d dVar) throws Throwable {
        float f12;
        float f13;
        androidx.compose.ui.graphics.drawscope.d dVar2 = dVar;
        dVar2.y1();
        l0.j jVar = this.f28183l;
        l0.h<InterfaceC22280q0> hVar = this.f28184m;
        long j12 = this.f28185n;
        androidx.compose.ui.graphics.F f14 = this.f28186o;
        androidx.compose.ui.graphics.drawscope.b bVar = dVar2.getF39478c().f39485a;
        float f15 = jVar.f413390a;
        float f16 = jVar.f413391b;
        bVar.f(f15, f16);
        try {
            try {
                androidx.compose.ui.graphics.drawscope.g.X0(dVar2, hVar.f406842b, 0L, j12, 0L, 0L, 0.0f, null, f14, 0, 0, 890);
                dVar2.getF39478c().f39485a.f(-f15, -f16);
                return kotlin.G0.f406611a;
            } catch (Throwable th2) {
                th = th2;
                f12 = f16;
                f13 = f15;
                dVar2.getF39478c().f39485a.f(-f13, -f12);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            f12 = f16;
            f13 = f15;
        }
    }
}
