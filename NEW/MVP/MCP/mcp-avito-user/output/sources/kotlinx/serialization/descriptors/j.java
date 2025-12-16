package kotlinx.serialization.descriptors;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlinx.serialization.internal.EnumDescriptor;

/* compiled from: Iterables.kt */
@s0
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0010\u001c\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"kotlin/collections/j0", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class j implements Iterable<String>, Z41.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EnumDescriptor f412747b;

    public j(EnumDescriptor enumDescriptor) {
        this.f412747b = enumDescriptor;
    }

    @Override // java.lang.Iterable
    @Y61.k
    public final Iterator<String> iterator() {
        return new h(this.f412747b);
    }
}
