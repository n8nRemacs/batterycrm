package androidx.compose.ui;

import androidx.compose.runtime.internal.P;
import androidx.compose.ui.node.AbstractC22430p0;
import androidx.compose.ui.v;
import kotlin.Metadata;

/* compiled from: ZIndexModifier.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/ZIndexElement;", "Landroidx/compose/ui/node/p0;", "Landroidx/compose/ui/F;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class ZIndexElement extends AbstractC22430p0<F> {

    /* renamed from: b, reason: collision with root package name */
    public final float f38822b;

    public ZIndexElement(float f12) {
        this.f38822b = f12;
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final v.d a() {
        F f12 = new F();
        f12.f38819p = this.f38822b;
        return f12;
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final void b(v.d dVar) {
        ((F) dVar).f38819p = this.f38822b;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ZIndexElement) && Float.compare(this.f38822b, ((ZIndexElement) obj).f38822b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f38822b);
    }

    @Y61.k
    public final String toString() {
        return androidx.appcompat.app.r.k(')', this.f38822b, new StringBuilder("ZIndexElement(zIndex="));
    }
}
