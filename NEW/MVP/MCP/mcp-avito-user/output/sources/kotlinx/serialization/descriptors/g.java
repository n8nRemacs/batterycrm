package kotlinx.serialization.descriptors;

import java.util.Iterator;
import kotlin.Metadata;

/* compiled from: SerialDescriptor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lkotlinx/serialization/descriptors/g;", "", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class g implements Iterator<SerialDescriptor>, Z41.a {

    /* renamed from: b, reason: collision with root package name */
    public int f412742b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SerialDescriptor f412743c;

    public g(SerialDescriptor serialDescriptor) {
        this.f412743c = serialDescriptor;
        this.f412742b = serialDescriptor.c();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f412742b > 0;
    }

    @Override // java.util.Iterator
    public final SerialDescriptor next() {
        SerialDescriptor serialDescriptor = this.f412743c;
        int iC2 = serialDescriptor.c();
        int i12 = this.f412742b;
        this.f412742b = i12 - 1;
        return serialDescriptor.h(iC2 - i12);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
