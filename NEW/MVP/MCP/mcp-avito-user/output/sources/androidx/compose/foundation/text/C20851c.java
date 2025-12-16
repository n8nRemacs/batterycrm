package androidx.compose.foundation.text;

import androidx.compose.ui.graphics.InterfaceC22280q0;
import androidx.compose.ui.graphics.drawscope.a;
import kotlin.Metadata;

/* compiled from: AndroidCursorHandle.android.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/d;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/graphics/drawscope/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: androidx.compose.foundation.text.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C20851c extends kotlin.jvm.internal.N implements Y41.l<androidx.compose.ui.graphics.drawscope.d, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ float f30656l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22280q0 f30657m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.graphics.F f30658n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20851c(float f12, InterfaceC22280q0 interfaceC22280q0, androidx.compose.ui.graphics.F f13) {
        super(1);
        this.f30656l = f12;
        this.f30657m = interfaceC22280q0;
        this.f30658n = f13;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(androidx.compose.ui.graphics.drawscope.d dVar) {
        androidx.compose.ui.graphics.drawscope.d dVar2 = dVar;
        dVar2.y1();
        float f12 = this.f30656l;
        InterfaceC22280q0 interfaceC22280q0 = this.f30657m;
        androidx.compose.ui.graphics.F f13 = this.f30658n;
        a.b f39478c = dVar2.getF39478c();
        long jE2 = f39478c.e();
        f39478c.a().k();
        try {
            androidx.compose.ui.graphics.drawscope.b bVar = f39478c.f39485a;
            bVar.f(f12, 0.0f);
            l0.g.f413384b.getClass();
            bVar.d(0L, 45.0f);
            androidx.compose.ui.graphics.drawscope.g.l0(dVar2, interfaceC22280q0, f13);
            androidx.compose.foundation.H.C(f39478c, jE2);
            return kotlin.G0.f406611a;
        } catch (Throwable th2) {
            androidx.compose.foundation.H.C(f39478c, jE2);
            throw th2;
        }
    }
}
