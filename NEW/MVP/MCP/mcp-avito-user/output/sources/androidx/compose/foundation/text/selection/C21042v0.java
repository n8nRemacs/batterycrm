package androidx.compose.foundation.text.selection;

import kotlin.Metadata;

/* compiled from: SelectionManager.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000 \n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"", "isInTouchMode", "Landroidx/compose/ui/layout/A;", "layoutCoordinates", "Ll0/g;", "rawPosition", "Landroidx/compose/foundation/text/selection/z;", "selectionMode", "Lkotlin/G0;", "invoke-Rg1IO4c", "(ZLandroidx/compose/ui/layout/A;JLandroidx/compose/foundation/text/selection/z;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: androidx.compose.foundation.text.selection.v0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21042v0 extends kotlin.jvm.internal.N implements Y41.r<Boolean, androidx.compose.ui.layout.A, l0.g, InterfaceC21049z, kotlin.G0> {
    @Override // Y41.r
    public final kotlin.G0 invoke(Boolean bool, androidx.compose.ui.layout.A a12, l0.g gVar, InterfaceC21049z interfaceC21049z) {
        bool.booleanValue();
        androidx.compose.ui.layout.A a13 = a12;
        long jA2 = gVar.f413387a;
        long jA3 = a13.a();
        l0.j jVar = new l0.j(0.0f, 0.0f, (int) (jA3 >> 32), (int) (jA3 & 4294967295L));
        if (!M0.a(jA2, jVar)) {
            jA2 = androidx.compose.foundation.text.input.internal.q1.a(jA2, jVar);
        }
        if ((L0.a(null, a13, jA2) & 9223372034707292159L) == 9205357640488583168L) {
            return kotlin.G0.f406611a;
        }
        throw null;
    }
}
