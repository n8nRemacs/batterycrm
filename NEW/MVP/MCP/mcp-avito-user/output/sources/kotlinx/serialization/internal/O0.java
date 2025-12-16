package kotlinx.serialization.internal;

import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlinx.serialization.InterfaceC43387f;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: NullableSerializer.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/serialization/internal/O0;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lkotlinx/serialization/internal/n;", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class O0 implements SerialDescriptor, InterfaceC43417n {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final SerialDescriptor f412795a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f412796b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Set<String> f412797c;

    public O0(@Y61.k SerialDescriptor serialDescriptor) {
        this.f412795a = serialDescriptor;
        this.f412796b = serialDescriptor.getF412788a() + '?';
        this.f412797c = D0.a(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.InterfaceC43417n
    @Y61.k
    public final Set<String> a() {
        return this.f412797c;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean b() {
        return true;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: c */
    public final int getF412801c() {
        return this.f412795a.getF412801c();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @InterfaceC43387f
    @Y61.k
    public final String d(int i12) {
        return this.f412795a.d(i12);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @InterfaceC43387f
    @Y61.k
    public final List<Annotation> e(int i12) {
        return this.f412795a.e(i12);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof O0) {
            return kotlin.jvm.internal.L.f(this.f412795a, ((O0) obj).f412795a);
        }
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @Y61.k
    /* renamed from: f, reason: from getter */
    public final String getF412788a() {
        return this.f412796b;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @InterfaceC43387f
    public final int g(@Y61.k String str) {
        return this.f412795a.g(str);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @Y61.k
    public final List<Annotation> getAnnotations() {
        return this.f412795a.getAnnotations();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @Y61.k
    public final kotlinx.serialization.descriptors.o getKind() {
        return this.f412795a.getKind();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @InterfaceC43387f
    @Y61.k
    public final SerialDescriptor h(int i12) {
        return this.f412795a.h(i12);
    }

    public final int hashCode() {
        return this.f412795a.hashCode() * 31;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @InterfaceC43387f
    public final boolean i(int i12) {
        return this.f412795a.i(i12);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: isInline */
    public final boolean getF412817l() {
        return this.f412795a.getF412817l();
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f412795a);
        sb2.append('?');
        return sb2.toString();
    }
}
