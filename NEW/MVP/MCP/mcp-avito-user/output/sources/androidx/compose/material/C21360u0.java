package androidx.compose.material;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.unit.C22712b;
import androidx.compose.ui.v;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: BackdropScaffold.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/compose/ui/unit/b;", "constraints", "", "backLayerHeight", "Lkotlin/G0;", "invoke-jYbf7pk", "(JFLandroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: androidx.compose.material.u0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21360u0 extends kotlin.jvm.internal.N implements Y41.r<C22712b, Float, androidx.compose.runtime.A, Integer, kotlin.G0> {
    public C21360u0() {
        throw null;
    }

    @Override // Y41.r
    public final kotlin.G0 invoke(C22712b c22712b, Float f12, androidx.compose.runtime.A a12, Integer num) {
        int i12;
        long j12 = c22712b.f42843a;
        float fFloatValue = f12.floatValue();
        androidx.compose.runtime.A a13 = a12;
        int iIntValue = num.intValue();
        if ((iIntValue & 6) == 0) {
            i12 = (a13.n(j12) ? 4 : 2) | iIntValue;
        } else {
            i12 = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i12 |= a13.k(fFloatValue) ? 32 : 16;
        }
        if (!a13.p(i12 & 1, (i12 & 147) != 146)) {
            a13.f();
            return kotlin.G0.f406611a;
        }
        l0.e eVar = new l0.e();
        eVar.f406839b = C22712b.i(j12) - 0.0f;
        v.a aVar = androidx.compose.ui.v.f42878y1;
        Orientation orientation = Orientation.f27425b;
        DraggableAnchorsElement draggableAnchorsElement = new DraggableAnchorsElement(null, new C21228k0(0.0f, null, eVar));
        aVar.getClass();
        C21385w.c(draggableAnchorsElement, null, orientation, false, false, 56);
        throw null;
    }
}
