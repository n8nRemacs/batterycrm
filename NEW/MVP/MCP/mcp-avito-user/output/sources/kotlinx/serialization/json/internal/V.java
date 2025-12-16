package kotlinx.serialization.json.internal;

import java.util.LinkedHashMap;
import kotlin.G0;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.AbstractC43443a;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

/* compiled from: TreeJsonEncoder.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0012\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/json/internal/V;", "Lkotlinx/serialization/json/internal/d;", "kotlinx-serialization-json"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
class V extends AbstractC43453d {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f413030f;

    public V(@Y61.k AbstractC43443a abstractC43443a, @Y61.k Y41.l<? super JsonElement, G0> lVar) {
        super(abstractC43443a, lVar, null);
        this.f413030f = new LinkedHashMap();
    }

    @Override // kotlinx.serialization.json.internal.AbstractC43453d
    @Y61.k
    public JsonElement Z() {
        return new JsonObject(this.f413030f);
    }

    @Override // kotlinx.serialization.json.internal.AbstractC43453d
    public void a0(@Y61.k String str, @Y61.k JsonElement jsonElement) {
        this.f413030f.put(str, jsonElement);
    }

    @Override // kotlinx.serialization.internal.Y0, kotlinx.serialization.encoding.d
    public final <T> void p(@Y61.k SerialDescriptor serialDescriptor, int i12, @Y61.k kotlinx.serialization.x<? super T> xVar, @Y61.l T t12) {
        if (t12 != null || this.f413072d.f412986f) {
            super.p(serialDescriptor, i12, xVar, t12);
        }
    }
}
