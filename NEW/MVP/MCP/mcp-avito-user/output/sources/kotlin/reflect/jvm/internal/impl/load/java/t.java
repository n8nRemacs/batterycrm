package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.Collection;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier;

/* compiled from: AnnotationQualifiersFqNames.kt */
/* loaded from: classes8.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.j f408304a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Collection<AnnotationQualifierApplicabilityType> f408305b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f408306c;

    public t(kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.j jVar, Collection collection, boolean z12, int i12, C42822w c42822w) {
        this(jVar, collection, (i12 & 4) != 0 ? jVar.f408345a == NullabilityQualifier.f408313d : z12);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return L.f(this.f408304a, tVar.f408304a) && L.f(this.f408305b, tVar.f408305b) && this.f408306c == tVar.f408306c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f408306c) + ((this.f408305b.hashCode() + (this.f408304a.hashCode() * 31)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("JavaDefaultQualifiers(nullabilityQualifier=");
        sb2.append(this.f408304a);
        sb2.append(", qualifierApplicabilityTypes=");
        sb2.append(this.f408305b);
        sb2.append(", definitelyNotNull=");
        return androidx.appcompat.app.r.x(sb2, this.f408306c, ')');
    }

    /* JADX WARN: Multi-variable type inference failed */
    public t(@Y61.k kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.j jVar, @Y61.k Collection<? extends AnnotationQualifierApplicabilityType> collection, boolean z12) {
        this.f408304a = jVar;
        this.f408305b = collection;
        this.f408306c = z12;
    }
}
