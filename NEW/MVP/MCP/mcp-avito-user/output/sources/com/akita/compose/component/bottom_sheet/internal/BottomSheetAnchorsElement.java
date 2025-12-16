package com.akita.compose.component.bottom_sheet.internal;

import androidx.compose.ui.node.AbstractC22430p0;
import androidx.compose.ui.v;
import com.akita.compose.component.bottom_sheet.I;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BottomSheetAnchors.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/akita/compose/component/bottom_sheet/internal/BottomSheetAnchorsElement;", "Landroidx/compose/ui/node/p0;", "Lcom/akita/compose/component/bottom_sheet/internal/b;", "bottom-sheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class BottomSheetAnchorsElement extends AbstractC22430p0<b> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final I f60608b;

    public BottomSheetAnchorsElement(@Y61.k I i12) {
        this.f60608b = i12;
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final v.d a() {
        b bVar = new b();
        bVar.f60609p = this.f60608b;
        return bVar;
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final void b(v.d dVar) {
        ((b) dVar).f60609p = this.f60608b;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (BottomSheetAnchorsElement.class.equals(obj != null ? obj.getClass() : null)) {
            return L.f(this.f60608b, ((BottomSheetAnchorsElement) obj).f60608b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f60608b.hashCode();
    }
}
