package kotlinx.serialization.json.internal;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.AbstractC43443a;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* compiled from: TreeJsonDecoder.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-serialization-json"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class p0 {
    @E
    public static final Object a(@Y61.k AbstractC43443a abstractC43443a, @Y61.k JsonElement jsonElement, @Y61.k KSerializer kSerializer) {
        kotlinx.serialization.json.h n12;
        if (jsonElement instanceof JsonObject) {
            n12 = new U(abstractC43443a, (JsonObject) jsonElement, null, null, 12, null);
        } else if (jsonElement instanceof JsonArray) {
            n12 = new W(abstractC43443a, (JsonArray) jsonElement);
        } else {
            if (!(jsonElement instanceof kotlinx.serialization.json.w ? true : jsonElement.equals(JsonNull.INSTANCE))) {
                throw new NoWhenBranchMatchedException();
            }
            n12 = new N(abstractC43443a, (JsonPrimitive) jsonElement);
        }
        return d0.d(n12, kSerializer);
    }
}
