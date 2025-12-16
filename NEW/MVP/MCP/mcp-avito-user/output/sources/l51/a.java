package L51;

import Y61.k;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.C43433v0;

/* compiled from: BuiltinSerializers.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-serialization-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class a {
    @k
    public static final <T> KSerializer<T> a(@k KSerializer<T> kSerializer) {
        return kSerializer.getF332717a().b() ? kSerializer : new C43433v0(kSerializer);
    }
}
