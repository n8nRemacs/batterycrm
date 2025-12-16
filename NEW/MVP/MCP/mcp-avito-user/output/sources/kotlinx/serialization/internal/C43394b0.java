package kotlinx.serialization.internal;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.InterfaceC42819t;

/* compiled from: Caching.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/internal/b0;", "Lkotlin/reflect/r;", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlinx.serialization.internal.b0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C43394b0 implements kotlin.reflect.r {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.r f412844b;

    public C43394b0(@Y61.k kotlin.reflect.r rVar) {
        this.f412844b = rVar;
    }

    @Override // kotlin.reflect.r
    @Y61.k
    public final List<kotlin.reflect.t> D() {
        return this.f412844b.D();
    }

    @Override // kotlin.reflect.r
    @Y61.l
    public final kotlin.reflect.g K() {
        return this.f412844b.K();
    }

    @Override // kotlin.reflect.r
    public final boolean d() {
        return this.f412844b.d();
    }

    public final boolean equals(@Y61.l Object obj) {
        if (obj == null) {
            return false;
        }
        C43394b0 c43394b0 = obj instanceof C43394b0 ? (C43394b0) obj : null;
        kotlin.reflect.r rVar = c43394b0 != null ? c43394b0.f412844b : null;
        kotlin.reflect.r rVar2 = this.f412844b;
        if (!kotlin.jvm.internal.L.f(rVar2, rVar)) {
            return false;
        }
        kotlin.reflect.g gVarK = rVar2.K();
        if (gVarK instanceof kotlin.reflect.d) {
            kotlin.reflect.r rVar3 = obj instanceof kotlin.reflect.r ? (kotlin.reflect.r) obj : null;
            kotlin.reflect.g gVarK2 = rVar3 != null ? rVar3.K() : null;
            if (gVarK2 != null && (gVarK2 instanceof kotlin.reflect.d)) {
                return ((InterfaceC42819t) ((kotlin.reflect.d) gVarK)).f().equals(((InterfaceC42819t) ((kotlin.reflect.d) gVarK2)).f());
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f412844b.hashCode();
    }

    @Y61.k
    public final String toString() {
        return "KTypeWrapper: " + this.f412844b;
    }
}
