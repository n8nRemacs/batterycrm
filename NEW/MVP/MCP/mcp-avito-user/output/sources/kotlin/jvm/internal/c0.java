package kotlin.jvm.internal;

import kotlin.InterfaceC42733c0;
import kotlin.Metadata;

/* compiled from: PackageReference.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/jvm/internal/c0;", "Lkotlin/jvm/internal/t;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42733c0
/* loaded from: classes8.dex */
public final class c0 implements InterfaceC42819t {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Class<?> f406825b;

    public c0(@Y61.k Class cls) {
        this.f406825b = cls;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (obj instanceof c0) {
            if (L.f(this.f406825b, ((c0) obj).f406825b)) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.jvm.internal.InterfaceC42819t
    @Y61.k
    public final Class<?> f() {
        return this.f406825b;
    }

    public final int hashCode() {
        return this.f406825b.hashCode();
    }

    @Y61.k
    public final String toString() {
        return this.f406825b.toString() + " (Kotlin reflection is not available)";
    }
}
