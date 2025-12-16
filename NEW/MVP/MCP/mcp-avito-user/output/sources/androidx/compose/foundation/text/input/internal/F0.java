package androidx.compose.foundation.text.input.internal;

import kotlin.Metadata;

/* compiled from: TransformedTextFieldState.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/input/internal/F0;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class F0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final WedgeAffinity f30818a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final WedgeAffinity f30819b;

    public F0(@Y61.k WedgeAffinity wedgeAffinity, @Y61.k WedgeAffinity wedgeAffinity2) {
        this.f30818a = wedgeAffinity;
        this.f30819b = wedgeAffinity2;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F0)) {
            return false;
        }
        F0 f02 = (F0) obj;
        return this.f30818a == f02.f30818a && this.f30819b == f02.f30819b;
    }

    public final int hashCode() {
        return this.f30819b.hashCode() + (this.f30818a.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        return "SelectionWedgeAffinity(startAffinity=" + this.f30818a + ", endAffinity=" + this.f30819b + ')';
    }
}
