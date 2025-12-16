package kotlinx.serialization.internal;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.p;

/* compiled from: NothingSerialDescriptor.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/serialization/internal/t0;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "<init>", "()V", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlinx.serialization.internal.t0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43429t0 implements SerialDescriptor {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C43429t0 f412911a = new C43429t0();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final p.d f412912b = p.d.f412754a;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final String f412913c = "kotlin.Nothing";

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
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @Y61.k
    public final List<Annotation> e(int i12) {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    public final boolean equals(@Y61.l Object obj) {
        return this == obj;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @Y61.k
    /* renamed from: f */
    public final String getF412799a() {
        return f412913c;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int g(@Y61.k String str) {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @Y61.k
    public final List<Annotation> getAnnotations() {
        return C42784z0.f406748b;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @Y61.k
    public final kotlinx.serialization.descriptors.o getKind() {
        return f412912b;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @Y61.k
    public final SerialDescriptor h(int i12) {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    public final int hashCode() {
        return (f412912b.hashCode() * 31) + f412913c.hashCode();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean i(int i12) {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: isInline */
    public final boolean getF412817l() {
        return false;
    }

    @Y61.k
    public final String toString() {
        return "NothingSerialDescriptor";
    }
}
