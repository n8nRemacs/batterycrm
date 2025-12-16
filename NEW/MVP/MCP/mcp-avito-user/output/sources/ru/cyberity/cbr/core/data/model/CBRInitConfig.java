package ru.cyberity.cbr.core.data.model;

import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.Map;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.C43400e0;
import kotlinx.serialization.internal.P0;
import kotlinx.serialization.internal.V0;
import kotlinx.serialization.v;
import kotlinx.serialization.w;
import ru.cyberity.cbr.core.PublicApi;

/* compiled from: CBRInitConfig.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)(B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bBK\b\u0017\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0016\b\u0001\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ(\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011HÇ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001e\u0012\u0004\b \u0010!\u001a\u0004\b\u001f\u0010\u0017R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u001e\u0012\u0004\b#\u0010!\u001a\u0004\b\"\u0010\u0017R.\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010$\u0012\u0004\b'\u0010!\u001a\u0004\b%\u0010&¨\u0006*"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRInitConfig;", "", "", "email", "phone", "", "strings", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "", "seen1", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/Map;Lkotlinx/serialization/internal/P0;)V", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lkotlin/G0;", "write$Self", "(Lru/cyberity/cbr/core/data/model/CBRInitConfig;Lkotlinx/serialization/encoding/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getEmail", "getEmail$annotations", "()V", "getPhone", "getPhone$annotations", "Ljava/util/Map;", "getStrings", "()Ljava/util/Map;", "getStrings$annotations", "Companion", "$serializer", "cyberity-mobile-sdk-publicapi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@w
@PublicApi
/* loaded from: classes9.dex */
public final /* data */ class CBRInitConfig {

    /* renamed from: Companion, reason: from kotlin metadata */
    @Y61.k
    public static final Companion INSTANCE = new Companion(null);

    @Y61.l
    private final String email;

    @Y61.l
    private final String phone;

    @Y61.l
    private final Map<String, String> strings;

    /* compiled from: CBRInitConfig.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRInitConfig$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lru/cyberity/cbr/core/data/model/CBRInitConfig;", "cyberity-mobile-sdk-publicapi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @Y61.k
        public final KSerializer<CBRInitConfig> serializer() {
            return CBRInitConfig$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public CBRInitConfig() {
        this((String) null, (String) null, (Map) null, 7, (C42822w) null);
    }

    @X41.n
    public static final void write$Self(@Y61.k CBRInitConfig self, @Y61.k kotlinx.serialization.encoding.d output, @Y61.k SerialDescriptor serialDesc) {
        if (output.u() || self.email != null) {
            output.p(serialDesc, 0, V0.f412822a, self.email);
        }
        if (output.u() || self.phone != null) {
            output.p(serialDesc, 1, V0.f412822a, self.phone);
        }
        if (!output.u() && self.strings == null) {
            return;
        }
        V0 v02 = V0.f412822a;
        output.p(serialDesc, 2, new C43400e0(v02, v02), self.strings);
    }

    public boolean equals(@Y61.l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CBRInitConfig)) {
            return false;
        }
        CBRInitConfig cBRInitConfig = (CBRInitConfig) other;
        return L.f(this.email, cBRInitConfig.email) && L.f(this.phone, cBRInitConfig.phone) && L.f(this.strings, cBRInitConfig.strings);
    }

    @Y61.l
    public final Map<String, String> getStrings() {
        return this.strings;
    }

    public int hashCode() {
        String str = this.email;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.phone;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Map<String, String> map = this.strings;
        return iHashCode2 + (map != null ? map.hashCode() : 0);
    }

    @Y61.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("CBRInitConfig(email=");
        sb2.append(this.email);
        sb2.append(", phone=");
        sb2.append(this.phone);
        sb2.append(", strings=");
        return androidx.appcompat.app.r.w(sb2, this.strings, ')');
    }

    @InterfaceC42830m
    public /* synthetic */ CBRInitConfig(int i12, @v String str, @v String str2, @v Map map, P0 p02) {
        if ((i12 & 1) == 0) {
            this.email = null;
        } else {
            this.email = str;
        }
        if ((i12 & 2) == 0) {
            this.phone = null;
        } else {
            this.phone = str2;
        }
        if ((i12 & 4) == 0) {
            this.strings = null;
        } else {
            this.strings = map;
        }
    }

    public CBRInitConfig(@Y61.l String str, @Y61.l String str2, @Y61.l Map<String, String> map) {
        this.email = str;
        this.phone = str2;
        this.strings = map;
    }

    public /* synthetic */ CBRInitConfig(String str, String str2, Map map, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : map);
    }
}
