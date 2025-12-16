package kotlinx.serialization.internal;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.text.C43066x;
import kotlinx.serialization.InterfaceC43387f;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.p;

/* compiled from: CollectionDescriptors.kt */
@InterfaceC43387f
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001\u0082\u0001\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lkotlinx/serialization/internal/h0;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lkotlinx/serialization/internal/d;", "Lkotlinx/serialization/internal/e;", "Lkotlinx/serialization/internal/Q;", "Lkotlinx/serialization/internal/f0;", "Lkotlinx/serialization/internal/I0;", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlinx.serialization.internal.h0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC43406h0 implements SerialDescriptor {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final SerialDescriptor f412863a;

    public AbstractC43406h0(SerialDescriptor serialDescriptor, C42822w c42822w) {
        this.f412863a = serialDescriptor;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean b() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int c() {
        return 1;
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
        StringBuilder sbJ = androidx.camera.camera2.internal.G.j(i12, "Illegal index ", ", ");
        sbJ.append(getF412890a());
        sbJ.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbJ.toString().toString());
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC43406h0)) {
            return false;
        }
        AbstractC43406h0 abstractC43406h0 = (AbstractC43406h0) obj;
        return kotlin.jvm.internal.L.f(this.f412863a, abstractC43406h0.f412863a) && kotlin.jvm.internal.L.f(getF412890a(), abstractC43406h0.getF412890a());
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int g(@Y61.k String str) {
        Integer numY0 = C43066x.y0(str);
        if (numY0 != null) {
            return numY0.intValue();
        }
        throw new IllegalArgumentException(str.concat(" is not a valid list index"));
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @Y61.k
    public final List<Annotation> getAnnotations() {
        return C42784z0.f406748b;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @Y61.k
    public final kotlinx.serialization.descriptors.o getKind() {
        return p.b.f412752a;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @Y61.k
    public final SerialDescriptor h(int i12) {
        if (i12 >= 0) {
            return this.f412863a;
        }
        StringBuilder sbJ = androidx.camera.camera2.internal.G.j(i12, "Illegal index ", ", ");
        sbJ.append(getF412890a());
        sbJ.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbJ.toString().toString());
    }

    public final int hashCode() {
        return getF412890a().hashCode() + (this.f412863a.hashCode() * 31);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean i(int i12) {
        if (i12 >= 0) {
            return false;
        }
        StringBuilder sbJ = androidx.camera.camera2.internal.G.j(i12, "Illegal index ", ", ");
        sbJ.append(getF412890a());
        sbJ.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbJ.toString().toString());
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isInline() {
        return false;
    }

    @Y61.k
    public final String toString() {
        return getF412890a() + '(' + this.f412863a + ')';
    }
}
