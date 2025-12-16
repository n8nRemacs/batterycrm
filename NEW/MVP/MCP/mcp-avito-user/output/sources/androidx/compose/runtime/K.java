package androidx.compose.runtime;

import kotlin.Metadata;

/* compiled from: Composer.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/K;", "Landroidx/compose/runtime/tooling/a;", "Landroidx/compose/runtime/tooling/d;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class K implements androidx.compose.runtime.tooling.a, androidx.compose.runtime.tooling.d {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final M f37996b;

    public K(@Y61.k M m12) {
        this.f37996b = m12;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (obj instanceof K) {
            if (this.f37996b.equals(((K) obj).f37996b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f37996b.hashCode() * 31;
    }
}
