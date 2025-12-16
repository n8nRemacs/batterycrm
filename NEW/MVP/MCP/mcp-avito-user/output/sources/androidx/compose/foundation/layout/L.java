package androidx.compose.foundation.layout;

import androidx.compose.runtime.F3;
import kotlin.Metadata;

/* compiled from: WindowInsetsPadding.kt */
@F3
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/layout/L;", "Landroidx/compose/ui/modifier/d;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class L implements androidx.compose.ui.modifier.d {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.l<InterfaceC20639x2, kotlin.G0> f28364b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public InterfaceC20639x2 f28365c;

    /* JADX WARN: Multi-variable type inference failed */
    public L(@Y61.k Y41.l<? super InterfaceC20639x2, kotlin.G0> lVar) {
        this.f28364b = lVar;
    }

    @Override // androidx.compose.ui.modifier.d
    public final void Q1(@Y61.k androidx.compose.ui.modifier.q qVar) {
        InterfaceC20639x2 interfaceC20639x2 = (InterfaceC20639x2) qVar.G(N2.f28440a);
        if (kotlin.jvm.internal.L.f(interfaceC20639x2, this.f28365c)) {
            return;
        }
        this.f28365c = interfaceC20639x2;
        this.f28364b.invoke(interfaceC20639x2);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof L) && ((L) obj).f28364b == this.f28364b;
    }

    public final int hashCode() {
        return this.f28364b.hashCode();
    }
}
