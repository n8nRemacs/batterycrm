package androidx.compose.ui.layout;

import androidx.compose.ui.node.AbstractC22430p0;
import androidx.compose.ui.unit.u;
import androidx.compose.ui.v;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;

/* compiled from: OnRemeasuredModifier.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/OnSizeChangedModifier;", "Landroidx/compose/ui/node/p0;", "Landroidx/compose/ui/layout/F0;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class OnSizeChangedModifier extends AbstractC22430p0<F0> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.l<androidx.compose.ui.unit.u, kotlin.G0> f40359b;

    /* JADX WARN: Multi-variable type inference failed */
    public OnSizeChangedModifier(@Y61.k Y41.l<? super androidx.compose.ui.unit.u, kotlin.G0> lVar) {
        this.f40359b = lVar;
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final v.d a() {
        return new F0(this.f40359b);
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final void b(v.d dVar) {
        F0 f02 = (F0) dVar;
        f02.f40329p = this.f40359b;
        long j12 = BeduinInputModel.MIN_TEXT_VERSION;
        u.a aVar = androidx.compose.ui.unit.u.f42871b;
        f02.f40331r = (j12 & 4294967295L) | (j12 << 32);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnSizeChangedModifier) {
            return this.f40359b == ((OnSizeChangedModifier) obj).f40359b;
        }
        return false;
    }

    public final int hashCode() {
        return this.f40359b.hashCode();
    }
}
