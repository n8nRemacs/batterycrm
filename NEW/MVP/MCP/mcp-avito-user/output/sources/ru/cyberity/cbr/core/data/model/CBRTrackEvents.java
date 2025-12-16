package ru.cyberity.cbr.core.data.model;

import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.Map;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.m0;
import kotlinx.serialization.C43385d;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.C43400e0;
import kotlinx.serialization.internal.E0;
import kotlinx.serialization.internal.P0;
import kotlinx.serialization.internal.V0;
import kotlinx.serialization.v;
import kotlinx.serialization.w;
import ru.cyberity.cbr.core.PublicApi;

/* compiled from: CBRTrackEvents.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002*)B8\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u001b\b\u0002\u0010\u0007\u001a\u0015\u0012\u0004\u0012\u00020\u0002\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u0006\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tBP\b\u0017\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u001b\b\u0001\u0010\u0007\u001a\u0015\u0012\u0004\u0012\u00020\u0002\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u0006\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ(\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012HÇ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001f\u0012\u0004\b!\u0010\"\u001a\u0004\b \u0010\u0018R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u001f\u0012\u0004\b$\u0010\"\u001a\u0004\b#\u0010\u0018R3\u0010\u0007\u001a\u0015\u0012\u0004\u0012\u00020\u0002\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010%\u0012\u0004\b(\u0010\"\u001a\u0004\b&\u0010'¨\u0006+"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRTrackEvents;", "", "", "activity", "ts", "", "Lkotlinx/serialization/b;", "payload", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "", "seen1", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/Map;Lkotlinx/serialization/internal/P0;)V", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lkotlin/G0;", "write$Self", "(Lru/cyberity/cbr/core/data/model/CBRTrackEvents;Lkotlinx/serialization/encoding/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getActivity", "getActivity$annotations", "()V", "getTs", "getTs$annotations", "Ljava/util/Map;", "getPayload", "()Ljava/util/Map;", "getPayload$annotations", "Companion", "$serializer", "cyberity-mobile-sdk-publicapi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@w
@PublicApi
/* loaded from: classes9.dex */
public final /* data */ class CBRTrackEvents {

    /* renamed from: Companion, reason: from kotlin metadata */
    @Y61.k
    public static final Companion INSTANCE = new Companion(null);

    @Y61.k
    private final String activity;

    @Y61.l
    private final Map<String, Object> payload;

    @Y61.l
    private final String ts;

    /* compiled from: CBRTrackEvents.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRTrackEvents$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lru/cyberity/cbr/core/data/model/CBRTrackEvents;", "cyberity-mobile-sdk-publicapi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @Y61.k
        public final KSerializer<CBRTrackEvents> serializer() {
            return CBRTrackEvents$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @InterfaceC42830m
    public /* synthetic */ CBRTrackEvents(int i12, @v String str, @v String str2, @v Map map, P0 p02) {
        if (1 != (i12 & 1)) {
            E0.b(i12, 1, CBRTrackEvents$$serializer.INSTANCE.getF412706c());
            throw null;
        }
        this.activity = str;
        if ((i12 & 2) == 0) {
            this.ts = null;
        } else {
            this.ts = str2;
        }
        if ((i12 & 4) == 0) {
            this.payload = null;
        } else {
            this.payload = map;
        }
    }

    @X41.n
    public static final void write$Self(@Y61.k CBRTrackEvents self, @Y61.k kotlinx.serialization.encoding.d output, @Y61.k SerialDescriptor serialDesc) {
        output.l(serialDesc, 0, self.activity);
        if (output.u() || self.ts != null) {
            output.p(serialDesc, 1, V0.f412822a, self.ts);
        }
        if (!output.u() && self.payload == null) {
            return;
        }
        output.p(serialDesc, 2, new C43400e0(V0.f412822a, new C43385d(m0.f406844a.b(Object.class), new KSerializer[0])), self.payload);
    }

    public boolean equals(@Y61.l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CBRTrackEvents)) {
            return false;
        }
        CBRTrackEvents cBRTrackEvents = (CBRTrackEvents) other;
        return L.f(this.activity, cBRTrackEvents.activity) && L.f(this.ts, cBRTrackEvents.ts) && L.f(this.payload, cBRTrackEvents.payload);
    }

    @Y61.k
    public final String getActivity() {
        return this.activity;
    }

    @Y61.l
    public final Map<String, Object> getPayload() {
        return this.payload;
    }

    public int hashCode() {
        int iHashCode = this.activity.hashCode() * 31;
        String str = this.ts;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Map<String, Object> map = this.payload;
        return iHashCode2 + (map != null ? map.hashCode() : 0);
    }

    @Y61.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("CBRTrackEvents(activity=");
        sb2.append(this.activity);
        sb2.append(", ts=");
        sb2.append(this.ts);
        sb2.append(", payload=");
        return androidx.appcompat.app.r.w(sb2, this.payload, ')');
    }

    public CBRTrackEvents(@Y61.k String str, @Y61.l String str2, @Y61.l Map<String, ? extends Object> map) {
        this.activity = str;
        this.ts = str2;
        this.payload = map;
    }

    public /* synthetic */ CBRTrackEvents(String str, String str2, Map map, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : map);
    }
}
