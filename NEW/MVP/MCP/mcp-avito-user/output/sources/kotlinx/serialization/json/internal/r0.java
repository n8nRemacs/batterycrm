package kotlinx.serialization.json.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.AbstractC43443a;
import kotlinx.serialization.json.JsonElement;

/* compiled from: TreeJsonEncoder.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-serialization-json"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class r0 {
    /* JADX WARN: Multi-variable type inference failed */
    @Y61.k
    @E
    public static final JsonElement a(@Y61.k AbstractC43443a abstractC43443a, Object obj, @Y61.k KSerializer kSerializer) {
        l0.h hVar = new l0.h();
        new V(abstractC43443a, new q0(hVar)).f(kSerializer, obj);
        T t12 = hVar.f406842b;
        if (t12 == 0) {
            return null;
        }
        return (JsonElement) t12;
    }
}
