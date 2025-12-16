package kotlinx.serialization.internal;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.text.C43066x;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.p;

/* compiled from: CollectionDescriptors.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001\u0082\u0001\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/serialization/internal/m0;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lkotlinx/serialization/internal/O;", "Lkotlinx/serialization/internal/d0;", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlinx.serialization.internal.m0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC43416m0 implements SerialDescriptor {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f412890a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final SerialDescriptor f412891b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final SerialDescriptor f412892c;

    public AbstractC43416m0(String str, SerialDescriptor serialDescriptor, SerialDescriptor serialDescriptor2, C42822w c42822w) {
        this.f412890a = str;
        this.f412891b = serialDescriptor;
        this.f412892c = serialDescriptor2;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean b() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int c() {
        return 2;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @Y61.k
    public final String d(int i12) {
        return String.valueOf(i12);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @Y61.k
    public final List<Annotation> e(int i12) {
        if (i12 >= 0) {
            return C42784z0.f406748b;
        }
        throw new IllegalArgumentException(AK.c.s(androidx.camera.camera2.internal.G.j(i12, "Illegal index ", ", "), this.f412890a, " expects only non-negative indices").toString());
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC43416m0)) {
            return false;
        }
        AbstractC43416m0 abstractC43416m0 = (AbstractC43416m0) obj;
        return kotlin.jvm.internal.L.f(this.f412890a, abstractC43416m0.f412890a) && kotlin.jvm.internal.L.f(this.f412891b, abstractC43416m0.f412891b) && kotlin.jvm.internal.L.f(this.f412892c, abstractC43416m0.f412892c);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @Y61.k
    /* renamed from: f, reason: from getter */
    public final String getF412890a() {
        return this.f412890a;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int g(@Y61.k String str) {
        Integer numY0 = C43066x.y0(str);
        if (numY0 != null) {
            return numY0.intValue();
        }
        throw new IllegalArgumentException(str.concat(" is not a valid map index"));
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @Y61.k
    public final List<Annotation> getAnnotations() {
        return C42784z0.f406748b;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @Y61.k
    public final kotlinx.serialization.descriptors.o getKind() {
        return p.c.f412753a;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @Y61.k
    public final SerialDescriptor h(int i12) {
        if (i12 < 0) {
            throw new IllegalArgumentException(AK.c.s(androidx.camera.camera2.internal.G.j(i12, "Illegal index ", ", "), this.f412890a, " expects only non-negative indices").toString());
        }
        int i13 = i12 % 2;
        if (i13 == 0) {
            return this.f412891b;
        }
        if (i13 == 1) {
            return this.f412892c;
        }
        throw new IllegalStateException("Unreached");
    }

    public final int hashCode() {
        return this.f412892c.hashCode() + ((this.f412891b.hashCode() + (this.f412890a.hashCode() * 31)) * 31);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean i(int i12) {
        if (i12 >= 0) {
            return false;
        }
        throw new IllegalArgumentException(AK.c.s(androidx.camera.camera2.internal.G.j(i12, "Illegal index ", ", "), this.f412890a, " expects only non-negative indices").toString());
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isInline() {
        return false;
    }

    @Y61.k
    public final String toString() {
        return this.f412890a + '(' + this.f412891b + ", " + this.f412892c + ')';
    }
}
