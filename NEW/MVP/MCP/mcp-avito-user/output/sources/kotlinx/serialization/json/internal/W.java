package kotlinx.serialization.json.internal;

import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.AbstractC43443a;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;

/* compiled from: TreeJsonDecoder.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/json/internal/W;", "Lkotlinx/serialization/json/internal/c;", "kotlinx-serialization-json"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
final class W extends AbstractC43452c {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final JsonArray f413031f;

    /* renamed from: g, reason: collision with root package name */
    public final int f413032g;

    /* renamed from: h, reason: collision with root package name */
    public int f413033h;

    public W(@Y61.k AbstractC43443a abstractC43443a, @Y61.k JsonArray jsonArray) {
        super(abstractC43443a, jsonArray, null);
        this.f413031f = jsonArray;
        this.f413032g = jsonArray.f412948b.size();
        this.f413033h = -1;
    }

    @Override // kotlinx.serialization.internal.AbstractC43424q0
    @Y61.k
    public final String V(@Y61.k SerialDescriptor serialDescriptor, int i12) {
        return String.valueOf(i12);
    }

    @Override // kotlinx.serialization.json.internal.AbstractC43452c
    @Y61.k
    public final JsonElement W(@Y61.k String str) throws NumberFormatException {
        return this.f413031f.f412948b.get(Integer.parseInt(str));
    }

    @Override // kotlinx.serialization.json.internal.AbstractC43452c
    /* renamed from: Z */
    public final JsonElement getF413064d() {
        return this.f413031f;
    }

    @Override // kotlinx.serialization.encoding.c
    public final int j(@Y61.k SerialDescriptor serialDescriptor) {
        int i12 = this.f413033h;
        if (i12 >= this.f413032g - 1) {
            return -1;
        }
        int i13 = i12 + 1;
        this.f413033h = i13;
        return i13;
    }
}
