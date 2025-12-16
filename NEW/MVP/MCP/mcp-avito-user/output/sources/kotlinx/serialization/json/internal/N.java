package kotlinx.serialization.json.internal;

import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.AbstractC43443a;
import kotlinx.serialization.json.JsonElement;

/* compiled from: TreeJsonDecoder.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/json/internal/N;", "Lkotlinx/serialization/json/internal/c;", "kotlinx-serialization-json"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
final class N extends AbstractC43452c {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final JsonElement f413020f;

    public N(@Y61.k AbstractC43443a abstractC43443a, @Y61.k JsonElement jsonElement) {
        super(abstractC43443a, jsonElement, null);
        this.f413020f = jsonElement;
        this.f412827a.add("primitive");
    }

    @Override // kotlinx.serialization.json.internal.AbstractC43452c
    @Y61.k
    public final JsonElement W(@Y61.k String str) {
        if (str == "primitive") {
            return this.f413020f;
        }
        throw new IllegalArgumentException("This input can only handle primitives with 'primitive' tag");
    }

    @Override // kotlinx.serialization.json.internal.AbstractC43452c
    @Y61.k
    /* renamed from: Z, reason: from getter */
    public final JsonElement getF413064d() {
        return this.f413020f;
    }

    @Override // kotlinx.serialization.encoding.c
    public final int j(@Y61.k SerialDescriptor serialDescriptor) {
        return 0;
    }
}
