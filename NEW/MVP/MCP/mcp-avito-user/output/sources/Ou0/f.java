package OU0;

import Y61.k;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.m0;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* compiled from: KotlinxJson.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class f {
    @k
    public static final JsonElement a(@k PU0.f fVar) {
        if (fVar instanceof j) {
            return ((j) fVar).f12294b;
        }
        if (fVar instanceof c) {
            return ((c) fVar).f12288b;
        }
        if (fVar instanceof h) {
            return ((h) fVar).f12292b;
        }
        if (fVar instanceof g) {
            return JsonNull.INSTANCE;
        }
        throw new IllegalArgumentException("Converting to KmmJsonElement wrong type: " + m0.f406844a.b(fVar.getClass()).l0());
    }

    @k
    public static final e b(@k JsonElement jsonElement) {
        e hVar;
        if (jsonElement instanceof JsonNull) {
            return g.f12291b;
        }
        if (jsonElement instanceof JsonPrimitive) {
            hVar = new j((JsonPrimitive) jsonElement);
        } else if (jsonElement instanceof JsonArray) {
            hVar = new c((JsonArray) jsonElement);
        } else {
            if (!(jsonElement instanceof JsonObject)) {
                throw new NoWhenBranchMatchedException();
            }
            hVar = new h((JsonObject) jsonElement);
        }
        return hVar;
    }
}
