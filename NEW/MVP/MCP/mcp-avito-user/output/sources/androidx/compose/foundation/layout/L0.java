package androidx.compose.foundation.layout;

import kotlin.Metadata;

/* compiled from: FlowLayout.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/layout/L0;", "", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class L0 {

    /* renamed from: a, reason: collision with root package name */
    public float f28366a;

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof L0) && Float.compare(this.f28366a, ((L0) obj).f28366a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f28366a);
    }

    @Y61.k
    public final String toString() {
        return androidx.appcompat.app.r.k(')', this.f28366a, new StringBuilder("FlowLayoutData(fillCrossAxisFraction="));
    }
}
