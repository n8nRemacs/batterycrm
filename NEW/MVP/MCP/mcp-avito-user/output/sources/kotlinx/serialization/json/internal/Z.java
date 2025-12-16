package kotlinx.serialization.json.internal;

import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.serialization.json.C43445c;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* compiled from: TreeJsonEncoder.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/json/internal/Z;", "Lkotlinx/serialization/json/internal/V;", "kotlinx-serialization-json"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
final class Z extends V {

    /* renamed from: g, reason: collision with root package name */
    public String f413047g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f413048h;

    public Z() {
        throw null;
    }

    @Override // kotlinx.serialization.json.internal.V, kotlinx.serialization.json.internal.AbstractC43453d
    @Y61.k
    public final JsonElement Z() {
        return new JsonObject(this.f413030f);
    }

    @Override // kotlinx.serialization.json.internal.V, kotlinx.serialization.json.internal.AbstractC43453d
    public final void a0(@Y61.k String str, @Y61.k JsonElement jsonElement) {
        if (!this.f413048h) {
            LinkedHashMap linkedHashMap = this.f413030f;
            String str2 = this.f413047g;
            if (str2 == null) {
                str2 = null;
            }
            linkedHashMap.put(str2, jsonElement);
            this.f413048h = true;
            return;
        }
        if (jsonElement instanceof JsonPrimitive) {
            this.f413047g = ((JsonPrimitive) jsonElement).getF413144d();
            this.f413048h = false;
        } else {
            if (jsonElement instanceof JsonObject) {
                kotlinx.serialization.json.C.f412932a.getClass();
                throw D.b(kotlinx.serialization.json.C.f412933b);
            }
            if (!(jsonElement instanceof JsonArray)) {
                throw new NoWhenBranchMatchedException();
            }
            C43445c.f412959a.getClass();
            throw D.b(C43445c.f412960b);
        }
    }
}
