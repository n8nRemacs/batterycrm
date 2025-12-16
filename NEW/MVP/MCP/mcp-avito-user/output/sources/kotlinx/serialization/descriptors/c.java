package kotlinx.serialization.descriptors;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlinx.serialization.InterfaceC43387f;

/* compiled from: ContextAware.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/descriptors/c;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
final class c implements SerialDescriptor {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final f f412714a;

    /* renamed from: b, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final kotlin.reflect.d<?> f412715b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f412716c;

    public c(@Y61.k f fVar, @Y61.k kotlin.reflect.d dVar) {
        this.f412714a = fVar;
        this.f412715b = dVar;
        this.f412716c = fVar.f412728a + '<' + dVar.l0() + '>';
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean b() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: c */
    public final int getF412730c() {
        return this.f412714a.f412730c;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @InterfaceC43387f
    @Y61.k
    public final String d(int i12) {
        return this.f412714a.f412733f[i12];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @InterfaceC43387f
    @Y61.k
    public final List<Annotation> e(int i12) {
        return this.f412714a.f412735h[i12];
    }

    public final boolean equals(@Y61.l Object obj) {
        c cVar = obj instanceof c ? (c) obj : null;
        return cVar != null && this.f412714a.equals(cVar.f412714a) && L.f(cVar.f412715b, this.f412715b);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @Y61.k
    /* renamed from: f, reason: from getter */
    public final String getF412716c() {
        return this.f412716c;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @InterfaceC43387f
    public final int g(@Y61.k String str) {
        return this.f412714a.g(str);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @Y61.k
    public final List<Annotation> getAnnotations() {
        return this.f412714a.f412731d;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @Y61.k
    /* renamed from: getKind */
    public final o getF412729b() {
        return this.f412714a.f412729b;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @InterfaceC43387f
    @Y61.k
    public final SerialDescriptor h(int i12) {
        return this.f412714a.f412734g[i12];
    }

    public final int hashCode() {
        return this.f412716c.hashCode() + (this.f412715b.hashCode() * 31);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @InterfaceC43387f
    public final boolean i(int i12) {
        return this.f412714a.f412736i[i12];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: isInline */
    public final boolean getF412817l() {
        return false;
    }

    @Y61.k
    public final String toString() {
        return "ContextDescriptor(kClass: " + this.f412715b + ", original: " + this.f412714a + ')';
    }
}
