package kotlinx.serialization.json.internal;

import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.AbstractC43443a;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;

/* compiled from: TreeJsonEncoder.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/json/internal/X;", "Lkotlinx/serialization/json/internal/d;", "kotlinx-serialization-json"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
final class X extends AbstractC43453d {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final ArrayList<JsonElement> f413042f;

    public X(@Y61.k AbstractC43443a abstractC43443a, @Y61.k Y41.l<? super JsonElement, G0> lVar) {
        super(abstractC43443a, lVar, null);
        this.f413042f = new ArrayList<>();
    }

    @Override // kotlinx.serialization.json.internal.AbstractC43453d, kotlinx.serialization.internal.AbstractC43425r0
    @Y61.k
    public final String Y(@Y61.k SerialDescriptor serialDescriptor, int i12) {
        return String.valueOf(i12);
    }

    @Override // kotlinx.serialization.json.internal.AbstractC43453d
    @Y61.k
    public final JsonElement Z() {
        return new JsonArray(this.f413042f);
    }

    @Override // kotlinx.serialization.json.internal.AbstractC43453d
    public final void a0(@Y61.k String str, @Y61.k JsonElement jsonElement) throws NumberFormatException {
        this.f413042f.add(Integer.parseInt(str), jsonElement);
    }
}
