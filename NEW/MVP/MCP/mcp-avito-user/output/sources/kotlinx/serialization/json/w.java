package kotlinx.serialization.json;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.internal.n0;
import kotlinx.serialization.json.internal.o0;

/* compiled from: JsonElement.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/json/w;", "Lkotlinx/serialization/json/JsonPrimitive;", "kotlinx-serialization-json"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class w extends JsonPrimitive {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f413142b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final SerialDescriptor f413143c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f413144d;

    public /* synthetic */ w(Object obj, boolean z12, SerialDescriptor serialDescriptor, int i12, C42822w c42822w) {
        this(obj, z12, (i12 & 4) != 0 ? null : serialDescriptor);
    }

    @Override // kotlinx.serialization.json.JsonPrimitive
    @Y61.k
    /* renamed from: b, reason: from getter */
    public final String getF413144d() {
        return this.f413144d;
    }

    @Override // kotlinx.serialization.json.JsonPrimitive
    /* renamed from: d, reason: from getter */
    public final boolean getF413142b() {
        return this.f413142b;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || w.class != obj.getClass()) {
            return false;
        }
        w wVar = (w) obj;
        return this.f413142b == wVar.f413142b && L.f(this.f413144d, wVar.f413144d);
    }

    @o0
    public final int hashCode() {
        return this.f413144d.hashCode() + (Boolean.hashCode(this.f413142b) * 31);
    }

    @Override // kotlinx.serialization.json.JsonPrimitive
    @Y61.k
    public final String toString() {
        String str = this.f413144d;
        if (!this.f413142b) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        n0.a(sb2, str);
        return sb2.toString();
    }

    public w(@Y61.k Object obj, boolean z12, @Y61.l SerialDescriptor serialDescriptor) {
        super(null);
        this.f413142b = z12;
        this.f413143c = serialDescriptor;
        this.f413144d = obj.toString();
        if (serialDescriptor != null && !serialDescriptor.getF412817l()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }
}
