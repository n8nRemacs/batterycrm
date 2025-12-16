package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlinx.serialization.InterfaceC43389h;
import kotlinx.serialization.KSerializer;

/* compiled from: InlineClassDescriptor.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-serialization-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class V {
    @InterfaceC43389h
    @Y61.k
    public static final T a(@Y61.k String str, @Y61.k KSerializer kSerializer) {
        return new T(str, new U(kSerializer));
    }
}
