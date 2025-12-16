package androidx.compose.foundation.text.selection;

import androidx.compose.ui.graphics.InterfaceC22280q0;
import androidx.compose.ui.graphics.drawscope.a;
import kotlin.Metadata;

/* compiled from: AndroidSelectionHandles.android.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/d;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/graphics/drawscope/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: androidx.compose.foundation.text.selection.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21009f extends kotlin.jvm.internal.N implements Y41.l<androidx.compose.ui.graphics.drawscope.d, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.a<Boolean> f31978l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f31979m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22280q0 f31980n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.graphics.F f31981o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21009f(Y41.a aVar, boolean z12, InterfaceC22280q0 interfaceC22280q0, androidx.compose.ui.graphics.F f12) {
        super(1);
        this.f31978l = aVar;
        this.f31979m = z12;
        this.f31980n = interfaceC22280q0;
        this.f31981o = f12;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(androidx.compose.ui.graphics.drawscope.d dVar) {
        androidx.compose.ui.graphics.drawscope.d dVar2 = dVar;
        dVar2.y1();
        if (this.f31978l.invoke().booleanValue()) {
            boolean z12 = this.f31979m;
            androidx.compose.ui.graphics.F f12 = this.f31981o;
            InterfaceC22280q0 interfaceC22280q0 = this.f31980n;
            if (z12) {
                long jV1 = dVar2.v1();
                a.b f39478c = dVar2.getF39478c();
                long jE2 = f39478c.e();
                f39478c.a().k();
                try {
                    f39478c.f39485a.e(-1.0f, 1.0f, jV1);
                    androidx.compose.ui.graphics.drawscope.g.l0(dVar2, interfaceC22280q0, f12);
                } finally {
                    androidx.compose.foundation.H.C(f39478c, jE2);
                }
            } else {
                androidx.compose.ui.graphics.drawscope.g.l0(dVar2, interfaceC22280q0, f12);
            }
        }
        return kotlin.G0.f406611a;
    }
}
