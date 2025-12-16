package androidx.compose.foundation.text.input.internal;

import android.view.DragEvent;
import androidx.compose.foundation.text.input.internal.R0;
import kotlin.Metadata;

/* compiled from: TextFieldDragAndDropNode.android.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/input/internal/e1;", "Landroidx/compose/ui/draganddrop/o;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class e1 implements androidx.compose.ui.draganddrop.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Y41.l<androidx.compose.ui.draganddrop.b, kotlin.G0> f31067b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Y41.p<androidx.compose.ui.platform.K0, androidx.compose.ui.platform.L0, Boolean> f31068c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Y41.l<androidx.compose.ui.draganddrop.b, kotlin.G0> f31069d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Y41.l<l0.g, kotlin.G0> f31070e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Y41.l<androidx.compose.ui.draganddrop.b, kotlin.G0> f31071f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Y41.l<androidx.compose.ui.draganddrop.b, kotlin.G0> f31072g;

    public e1(Y41.l lVar, Y41.p pVar, Y41.l lVar2, Y41.l lVar3, Y41.l lVar4, Y41.l lVar5) {
        this.f31067b = lVar;
        this.f31068c = pVar;
        this.f31069d = lVar2;
        this.f31070e = lVar3;
        this.f31071f = lVar4;
        this.f31072g = lVar5;
    }

    @Override // androidx.compose.ui.draganddrop.o
    public final void D1(androidx.compose.ui.draganddrop.b bVar) {
        Y41.l<l0.g, kotlin.G0> lVar = this.f31070e;
        DragEvent dragEvent = bVar.f38999a;
        float x12 = dragEvent.getX();
        float y12 = dragEvent.getY();
        ((R0.r) lVar).invoke(l0.g.a((Float.floatToRawIntBits(x12) << 32) | (Float.floatToRawIntBits(y12) & 4294967295L)));
        kotlin.G0 g02 = kotlin.G0.f406611a;
    }

    @Override // androidx.compose.ui.draganddrop.o
    public final void T(androidx.compose.ui.draganddrop.b bVar) {
        ((R0.s) this.f31071f).invoke(bVar);
        kotlin.G0 g02 = kotlin.G0.f406611a;
    }

    @Override // androidx.compose.ui.draganddrop.o
    public final boolean a0(androidx.compose.ui.draganddrop.b bVar) {
        ((R0.p) this.f31067b).invoke(bVar);
        DragEvent dragEvent = bVar.f38999a;
        androidx.compose.ui.platform.K0 k02 = new androidx.compose.ui.platform.K0(dragEvent.getClipData());
        dragEvent.getClipDescription();
        return ((Boolean) ((R0.o) this.f31068c).invoke(k02, new androidx.compose.ui.platform.L0())).booleanValue();
    }

    @Override // androidx.compose.ui.draganddrop.o
    public final void m0(androidx.compose.ui.draganddrop.b bVar) {
        ((R0.t) this.f31072g).invoke(bVar);
        kotlin.G0 g02 = kotlin.G0.f406611a;
    }

    @Override // androidx.compose.ui.draganddrop.o
    public final void w0(androidx.compose.ui.draganddrop.b bVar) {
        ((R0.q) this.f31069d).invoke(bVar);
        kotlin.G0 g02 = kotlin.G0.f406611a;
    }

    @Override // androidx.compose.ui.draganddrop.o
    public final void R(androidx.compose.ui.draganddrop.b bVar) {
    }
}
