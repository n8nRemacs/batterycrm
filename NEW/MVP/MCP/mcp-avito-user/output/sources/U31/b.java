package U31;

import Y61.k;
import Y61.l;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.reflect.r;

/* compiled from: Type.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LU31/b;", "", "ktor-utils"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final kotlin.reflect.d<?> f16154a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Type f16155b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final r f16156c;

    public b(@k kotlin.reflect.d<?> dVar, @k Type type, @l r rVar) {
        this.f16154a = dVar;
        this.f16155b = type;
        this.f16156c = rVar;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return L.f(this.f16154a, bVar.f16154a) && L.f(this.f16155b, bVar.f16155b) && L.f(this.f16156c, bVar.f16156c);
    }

    public final int hashCode() {
        int iHashCode = (this.f16155b.hashCode() + (this.f16154a.hashCode() * 31)) * 31;
        r rVar = this.f16156c;
        return iHashCode + (rVar == null ? 0 : rVar.hashCode());
    }

    @k
    public final String toString() {
        return "TypeInfo(type=" + this.f16154a + ", reifiedType=" + this.f16155b + ", kotlinType=" + this.f16156c + ')';
    }

    public /* synthetic */ b(kotlin.reflect.d dVar, Type type, r rVar, int i12, C42822w c42822w) {
        this(dVar, type, (i12 & 4) != 0 ? null : rVar);
    }
}
