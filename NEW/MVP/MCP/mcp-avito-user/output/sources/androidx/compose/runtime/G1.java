package androidx.compose.runtime;

import kotlin.Metadata;

/* compiled from: OpaqueKey.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/G1;", "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class G1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f37976a;

    public G1(@Y61.k String str) {
        this.f37976a = str;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof G1) && kotlin.jvm.internal.L.f(this.f37976a, ((G1) obj).f37976a);
    }

    public final int hashCode() {
        return this.f37976a.hashCode();
    }

    @Y61.k
    public final String toString() {
        return C22026a.c(new StringBuilder("OpaqueKey(key="), this.f37976a, ')');
    }
}
