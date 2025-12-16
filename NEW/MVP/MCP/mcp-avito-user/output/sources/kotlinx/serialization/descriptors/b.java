package kotlinx.serialization.descriptors;

import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlinx.serialization.internal.O0;

/* compiled from: ContextAware.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-serialization-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class b {
    @Y61.l
    public static final kotlin.reflect.d<?> a(@Y61.k SerialDescriptor serialDescriptor) {
        if (serialDescriptor instanceof c) {
            return ((c) serialDescriptor).f412715b;
        }
        if (serialDescriptor instanceof O0) {
            return a(((O0) serialDescriptor).f412795a);
        }
        return null;
    }

    @Y61.k
    public static final SerialDescriptor b(@Y61.k f fVar, @Y61.k kotlin.reflect.d dVar) {
        return new c(fVar, dVar);
    }
}
