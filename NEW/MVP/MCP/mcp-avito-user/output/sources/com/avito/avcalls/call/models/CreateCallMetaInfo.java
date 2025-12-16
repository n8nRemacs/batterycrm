package com.avito.avcalls.call.models;

import X41.f;
import X41.n;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.Map;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.d;
import kotlinx.serialization.internal.C43400e0;
import kotlinx.serialization.internal.C43412k0;
import kotlinx.serialization.internal.E0;
import kotlinx.serialization.internal.P0;
import kotlinx.serialization.internal.V0;
import kotlinx.serialization.w;

/* compiled from: CreateCallMetaInfo.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002*)B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u001c\b\u0002\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007¢\u0006\u0004\b\t\u0010\nBK\b\u0011\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u001a\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ(\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013HÁ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010%R+\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006j\u0004\u0018\u0001`\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b'\u0010(¨\u0006+"}, d2 = {"Lcom/avito/avcalls/call/models/CreateCallMetaInfo;", "", "", "scenario", "", "itemId", "", "Lcom/avito/avcalls/call/models/ExtraMetaInfo;", "extraInfo", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/util/Map;)V", "", "seen1", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/Long;Ljava/util/Map;Lkotlinx/serialization/internal/P0;)V", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lkotlin/G0;", "write$Self$sdk_release", "(Lcom/avito/avcalls/call/models/CreateCallMetaInfo;Lkotlinx/serialization/encoding/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getScenario", "Ljava/lang/Long;", "getItemId", "()Ljava/lang/Long;", "Ljava/util/Map;", "getExtraInfo", "()Ljava/util/Map;", "Companion", "$serializer", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@w
/* loaded from: classes5.dex */
public final /* data */ class CreateCallMetaInfo {

    @f
    @k
    private static final KSerializer<Object>[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    @l
    private final Map<String, String> extraInfo;

    @l
    private final Long itemId;

    @k
    private final String scenario;

    /* compiled from: CreateCallMetaInfo.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/avito/avcalls/call/models/CreateCallMetaInfo$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/avito/avcalls/call/models/CreateCallMetaInfo;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @k
        public final KSerializer<CreateCallMetaInfo> serializer() {
            return CreateCallMetaInfo$$serializer.INSTANCE;
        }

        public Companion() {
        }
    }

    static {
        V0 v02 = V0.f412822a;
        $childSerializers = new KSerializer[]{null, null, new C43400e0(v02, v02)};
    }

    @InterfaceC42830m
    public /* synthetic */ CreateCallMetaInfo(int i12, String str, Long l12, Map map, P0 p02) {
        if (3 != (i12 & 3)) {
            E0.b(i12, 3, CreateCallMetaInfo$$serializer.INSTANCE.getF412706c());
            throw null;
        }
        this.scenario = str;
        this.itemId = l12;
        if ((i12 & 4) == 0) {
            this.extraInfo = null;
        } else {
            this.extraInfo = map;
        }
    }

    @n
    public static final /* synthetic */ void write$Self$sdk_release(CreateCallMetaInfo self, d output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        output.l(serialDesc, 0, self.scenario);
        output.p(serialDesc, 1, C43412k0.f412877a, self.itemId);
        if (!output.u() && self.extraInfo == null) {
            return;
        }
        output.p(serialDesc, 2, kSerializerArr[2], self.extraInfo);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateCallMetaInfo)) {
            return false;
        }
        CreateCallMetaInfo createCallMetaInfo = (CreateCallMetaInfo) other;
        return L.f(this.scenario, createCallMetaInfo.scenario) && L.f(this.itemId, createCallMetaInfo.itemId) && L.f(this.extraInfo, createCallMetaInfo.extraInfo);
    }

    @l
    public final Map<String, String> getExtraInfo() {
        return this.extraInfo;
    }

    @l
    public final Long getItemId() {
        return this.itemId;
    }

    @k
    public final String getScenario() {
        return this.scenario;
    }

    public int hashCode() {
        int iHashCode = this.scenario.hashCode() * 31;
        Long l12 = this.itemId;
        int iHashCode2 = (iHashCode + (l12 == null ? 0 : l12.hashCode())) * 31;
        Map<String, String> map = this.extraInfo;
        return iHashCode2 + (map != null ? map.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("CreateCallMetaInfo(scenario=" + this.scenario);
        if (this.itemId != null) {
            sb2.append(", itemId=" + this.itemId);
        }
        Map<String, String> map = this.extraInfo;
        if (map != null) {
            sb2.append(", extraInfo=".concat(com.avito.avcalls.utils.l.b(map)));
        }
        sb2.append(")");
        return sb2.toString();
    }

    public CreateCallMetaInfo(@k String str, @l Long l12, @l Map<String, String> map) {
        this.scenario = str;
        this.itemId = l12;
        this.extraInfo = map;
    }

    public /* synthetic */ CreateCallMetaInfo(String str, Long l12, Map map, int i12, C42822w c42822w) {
        this(str, l12, (i12 & 4) != 0 ? null : map);
    }
}
