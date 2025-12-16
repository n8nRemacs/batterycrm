package kotlinx.serialization.internal;

import java.util.Arrays;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: InlineClassDescriptor.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/internal/T;", "Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlin.X
/* loaded from: classes8.dex */
public final class T extends PluginGeneratedSerialDescriptor {

    /* renamed from: l, reason: collision with root package name */
    public final boolean f412817l;

    public T(@Y61.k String str, @Y61.k U u12) {
        super(str, u12, 1);
        this.f412817l = true;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, kotlin.C] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, kotlin.C] */
    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof T) {
            SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
            if (kotlin.jvm.internal.L.f(this.f412799a, serialDescriptor.getF412799a())) {
                T t12 = (T) obj;
                if (t12.f412817l && Arrays.equals((SerialDescriptor[]) this.f412808j.getValue(), (SerialDescriptor[]) t12.f412808j.getValue())) {
                    int f412801c = serialDescriptor.getF412801c();
                    int i12 = this.f412801c;
                    if (i12 == f412801c) {
                        for (int i13 = 0; i13 < i12; i13++) {
                            if (kotlin.jvm.internal.L.f(h(i13).getF412799a(), serialDescriptor.h(i13).getF412799a()) && kotlin.jvm.internal.L.f(h(i13).getKind(), serialDescriptor.h(i13).getKind())) {
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    public final int hashCode() {
        return super.hashCode() * 31;
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor, kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: isInline, reason: from getter */
    public final boolean getF412817l() {
        return this.f412817l;
    }
}
