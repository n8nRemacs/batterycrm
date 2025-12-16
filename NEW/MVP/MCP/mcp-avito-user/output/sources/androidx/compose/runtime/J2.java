package androidx.compose.runtime;

import kotlin.Metadata;

/* compiled from: Composer.kt */
@X41.g
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087@\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/runtime/J2;", "T", "", "composer", "Landroidx/compose/runtime/A;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class J2<T> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final A f37995a;

    private /* synthetic */ J2(A a12) {
        this.f37995a = a12;
    }

    public static final /* synthetic */ J2 a(A a12) {
        return new J2(a12);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof J2) {
            return kotlin.jvm.internal.L.f(this.f37995a, ((J2) obj).f37995a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f37995a.hashCode();
    }

    public final String toString() {
        return "SkippableUpdater(composer=" + this.f37995a + ')';
    }
}
