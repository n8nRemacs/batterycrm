package kotlinx.serialization.descriptors;

import java.util.Iterator;
import kotlin.Metadata;
import kotlinx.serialization.internal.EnumDescriptor;

/* compiled from: SerialDescriptor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0010\u000e\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lkotlinx/serialization/descriptors/h;", "", "", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class h implements Iterator<String>, Z41.a {

    /* renamed from: b, reason: collision with root package name */
    public int f412744b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ EnumDescriptor f412745c;

    public h(EnumDescriptor enumDescriptor) {
        this.f412745c = enumDescriptor;
        this.f412744b = enumDescriptor.f412801c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f412744b > 0;
    }

    @Override // java.util.Iterator
    public final String next() {
        EnumDescriptor enumDescriptor = this.f412745c;
        int i12 = this.f412744b;
        this.f412744b = i12 - 1;
        return enumDescriptor.f412803e[enumDescriptor.f412801c - i12];
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
