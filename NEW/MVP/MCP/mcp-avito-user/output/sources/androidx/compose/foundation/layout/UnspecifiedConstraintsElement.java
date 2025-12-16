package androidx.compose.foundation.layout;

import androidx.compose.ui.node.AbstractC22430p0;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: Size.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/foundation/layout/UnspecifiedConstraintsElement;", "Landroidx/compose/ui/node/p0;", "Landroidx/compose/foundation/layout/u2;", "Landroidx/compose/ui/unit/h;", "minWidth", "minHeight", "<init>", "(FFLkotlin/jvm/internal/w;)V", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class UnspecifiedConstraintsElement extends AbstractC22430p0<C20627u2> {

    /* renamed from: b, reason: collision with root package name */
    public final float f28516b;

    /* renamed from: c, reason: collision with root package name */
    public final float f28517c;

    /* JADX WARN: Illegal instructions before constructor call */
    public UnspecifiedConstraintsElement(float f12, float f13, int i12, C42822w c42822w) {
        if ((i12 & 1) != 0) {
            androidx.compose.ui.unit.h.f42849c.getClass();
            f12 = androidx.compose.ui.unit.h.f42851e;
        }
        if ((i12 & 2) != 0) {
            androidx.compose.ui.unit.h.f42849c.getClass();
            f13 = androidx.compose.ui.unit.h.f42851e;
        }
        this(f12, f13, null);
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final v.d a() {
        return new C20627u2(this.f28516b, this.f28517c, null);
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final void b(v.d dVar) {
        C20627u2 c20627u2 = (C20627u2) dVar;
        c20627u2.f28749p = this.f28516b;
        c20627u2.f28750q = this.f28517c;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (!(obj instanceof UnspecifiedConstraintsElement)) {
            return false;
        }
        UnspecifiedConstraintsElement unspecifiedConstraintsElement = (UnspecifiedConstraintsElement) obj;
        return androidx.compose.ui.unit.h.b(this.f28516b, unspecifiedConstraintsElement.f28516b) && androidx.compose.ui.unit.h.b(this.f28517c, unspecifiedConstraintsElement.f28517c);
    }

    public final int hashCode() {
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        return Float.hashCode(this.f28517c) + (Float.hashCode(this.f28516b) * 31);
    }

    public UnspecifiedConstraintsElement(float f12, float f13, C42822w c42822w) {
        this.f28516b = f12;
        this.f28517c = f13;
    }
}
