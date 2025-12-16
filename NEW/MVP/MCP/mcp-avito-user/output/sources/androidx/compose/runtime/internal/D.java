package androidx.compose.runtime.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.text.C43044a;

/* compiled from: IntRef.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/internal/D;", "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class D {

    /* renamed from: a, reason: collision with root package name */
    public int f38422a;

    public D() {
        this(0, 1, null);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IntRef(element = ");
        sb2.append(this.f38422a);
        sb2.append(")@");
        int iHashCode = hashCode();
        C43044a.a(16);
        sb2.append(Integer.toString(iHashCode, 16));
        return sb2.toString();
    }

    public D(int i12) {
        this.f38422a = i12;
    }

    public /* synthetic */ D(int i12, int i13, C42822w c42822w) {
        this((i13 & 1) != 0 ? 0 : i12);
    }
}
