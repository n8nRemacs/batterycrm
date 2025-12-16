package kotlinx.serialization.json.internal;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.AbstractC43443a;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

/* compiled from: TreeJsonDecoder.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/json/internal/Y;", "Lkotlinx/serialization/json/internal/U;", "kotlinx-serialization-json"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
final class Y extends U {

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final JsonObject f413043k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final List<String> f413044l;

    /* renamed from: m, reason: collision with root package name */
    public final int f413045m;

    /* renamed from: n, reason: collision with root package name */
    public int f413046n;

    public Y(@Y61.k AbstractC43443a abstractC43443a, @Y61.k JsonObject jsonObject) {
        super(abstractC43443a, jsonObject, null, null, 12, null);
        this.f413043k = jsonObject;
        List<String> listM0 = C42745f0.M0(jsonObject.f412952b.keySet());
        this.f413044l = listM0;
        this.f413045m = listM0.size() * 2;
        this.f413046n = -1;
    }

    @Override // kotlinx.serialization.json.internal.U, kotlinx.serialization.internal.AbstractC43424q0
    @Y61.k
    public final String V(@Y61.k SerialDescriptor serialDescriptor, int i12) {
        return this.f413044l.get(i12 / 2);
    }

    @Override // kotlinx.serialization.json.internal.U, kotlinx.serialization.json.internal.AbstractC43452c
    @Y61.k
    public final JsonElement W(@Y61.k String str) {
        return this.f413046n % 2 == 0 ? kotlinx.serialization.json.k.c(str) : (JsonElement) P0.d(this.f413043k, str);
    }

    @Override // kotlinx.serialization.json.internal.U, kotlinx.serialization.json.internal.AbstractC43452c
    /* renamed from: Z */
    public final JsonElement getF413025f() {
        return this.f413043k;
    }

    @Override // kotlinx.serialization.json.internal.U
    @Y61.k
    /* renamed from: b0, reason: from getter */
    public final JsonObject getF413043k() {
        return this.f413043k;
    }

    @Override // kotlinx.serialization.json.internal.U, kotlinx.serialization.encoding.c
    public final int j(@Y61.k SerialDescriptor serialDescriptor) {
        int i12 = this.f413046n;
        if (i12 >= this.f413045m - 1) {
            return -1;
        }
        int i13 = i12 + 1;
        this.f413046n = i13;
        return i13;
    }

    @Override // kotlinx.serialization.json.internal.U, kotlinx.serialization.json.internal.AbstractC43452c, kotlinx.serialization.internal.X0, kotlinx.serialization.encoding.c
    public final void d(@Y61.k SerialDescriptor serialDescriptor) {
    }
}
