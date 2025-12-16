package kotlinx.serialization.json.internal;

import kotlin.G0;
import kotlin.Metadata;
import kotlinx.serialization.json.AbstractC43443a;
import kotlinx.serialization.json.JsonElement;

/* compiled from: TreeJsonEncoder.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/json/internal/O;", "Lkotlinx/serialization/json/internal/d;", "kotlinx-serialization-json"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
final class O extends AbstractC43453d {

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public JsonElement f413021f;

    public O(@Y61.k AbstractC43443a abstractC43443a, @Y61.k Y41.l<? super JsonElement, G0> lVar) {
        super(abstractC43443a, lVar, null);
        this.f412837a.add("primitive");
    }

    @Override // kotlinx.serialization.json.internal.AbstractC43453d
    @Y61.k
    public final JsonElement Z() {
        JsonElement jsonElement = this.f413021f;
        if (jsonElement != null) {
            return jsonElement;
        }
        throw new IllegalArgumentException("Primitive element has not been recorded. Is call to .encodeXxx is missing in serializer?");
    }

    @Override // kotlinx.serialization.json.internal.AbstractC43453d
    public final void a0(@Y61.k String str, @Y61.k JsonElement jsonElement) {
        if (str != "primitive") {
            throw new IllegalArgumentException("This output can only consume primitives with 'primitive' tag");
        }
        if (this.f413021f != null) {
            throw new IllegalArgumentException("Primitive element was already recorded. Does call to .encodeXxx happen more than once?");
        }
        this.f413021f = jsonElement;
        this.f413071c.invoke(jsonElement);
    }
}
