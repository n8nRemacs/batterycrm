package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: CollectionDescriptors.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/internal/I0;", "Lkotlinx/serialization/internal/h0;", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class I0 extends AbstractC43406h0 {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f412783b;

    public I0(@Y61.k SerialDescriptor serialDescriptor) {
        super(serialDescriptor, null);
        this.f412783b = serialDescriptor.getF412783b() + "Array";
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @Y61.k
    /* renamed from: f, reason: from getter */
    public final String getF412783b() {
        return this.f412783b;
    }
}
