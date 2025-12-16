package kotlinx.serialization.internal;

import androidx.compose.runtime.C22026a;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: Primitives.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/internal/L0;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class L0 implements SerialDescriptor {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f412788a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final kotlinx.serialization.descriptors.e f412789b;

    public L0(@Y61.k String str, @Y61.k kotlinx.serialization.descriptors.e eVar) {
        this.f412788a = str;
        this.f412789b = eVar;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean b() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: c */
    public final int getF412801c() {
        return 0;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @Y61.k
    public final String d(int i12) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @Y61.k
    public final List<Annotation> e(int i12) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof L0)) {
            return false;
        }
        L0 l02 = (L0) obj;
        if (kotlin.jvm.internal.L.f(this.f412788a, l02.f412788a)) {
            if (kotlin.jvm.internal.L.f(this.f412789b, l02.f412789b)) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @Y61.k
    /* renamed from: f, reason: from getter */
    public final String getF412799a() {
        return this.f412788a;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int g(@Y61.k String str) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @Y61.k
    public final List<Annotation> getAnnotations() {
        return C42784z0.f406748b;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final kotlinx.serialization.descriptors.o getKind() {
        return this.f412789b;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @Y61.k
    public final SerialDescriptor h(int i12) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    public final int hashCode() {
        return (this.f412789b.hashCode() * 31) + this.f412788a.hashCode();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean i(int i12) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: isInline */
    public final boolean getF412817l() {
        return false;
    }

    @Y61.k
    public final String toString() {
        return C22026a.c(new StringBuilder("PrimitiveDescriptor("), this.f412788a, ')');
    }
}
