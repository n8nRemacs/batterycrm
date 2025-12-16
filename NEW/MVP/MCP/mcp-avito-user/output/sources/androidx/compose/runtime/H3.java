package androidx.compose.runtime;

import java.util.ArrayList;
import kotlin.Metadata;

/* compiled from: Stack.kt */
@X41.g
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081@\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002\u0088\u0001\u0003\u0092\u0001\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/runtime/H3;", "T", "", "backing", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class H3<T> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ArrayList<T> f37978a;

    public final boolean equals(Object obj) {
        if (obj instanceof H3) {
            return kotlin.jvm.internal.L.f(this.f37978a, ((H3) obj).f37978a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f37978a.hashCode();
    }

    public final String toString() {
        return "Stack(backing=" + this.f37978a + ')';
    }
}
