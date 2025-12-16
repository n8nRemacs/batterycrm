package androidx.compose.ui.input.key;

import Y61.l;
import androidx.compose.ui.node.AbstractC22430p0;
import androidx.compose.ui.v;
import kotlin.Metadata;

/* compiled from: KeyInputModifier.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/key/KeyInputElement;", "Landroidx/compose/ui/node/p0;", "Landroidx/compose/ui/input/key/h;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class KeyInputElement extends AbstractC22430p0<h> {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Y41.l<c, Boolean> f40048b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Y41.l<c, Boolean> f40049c;

    /* JADX WARN: Multi-variable type inference failed */
    public KeyInputElement(@l Y41.l<? super c, Boolean> lVar, @l Y41.l<? super c, Boolean> lVar2) {
        this.f40048b = lVar;
        this.f40049c = lVar2;
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final v.d a() {
        h hVar = new h();
        hVar.f40073p = this.f40048b;
        hVar.f40074q = this.f40049c;
        return hVar;
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final void b(v.d dVar) {
        h hVar = (h) dVar;
        hVar.f40073p = this.f40048b;
        hVar.f40074q = this.f40049c;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyInputElement)) {
            return false;
        }
        KeyInputElement keyInputElement = (KeyInputElement) obj;
        return this.f40048b == keyInputElement.f40048b && this.f40049c == keyInputElement.f40049c;
    }

    public final int hashCode() {
        Y41.l<c, Boolean> lVar = this.f40048b;
        int iHashCode = (lVar != null ? lVar.hashCode() : 0) * 31;
        Y41.l<c, Boolean> lVar2 = this.f40049c;
        return iHashCode + (lVar2 != null ? lVar2.hashCode() : 0);
    }
}
