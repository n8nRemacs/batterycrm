package ru.cyberity.cbr.core.data.model;

import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.P0;
import kotlinx.serialization.internal.V0;
import kotlinx.serialization.v;
import kotlinx.serialization.w;
import ru.cyberity.cbr.core.PublicApi;

/* compiled from: CBRDocumentDefinition.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002#\"B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B3\b\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ(\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fHÇ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001c\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001d\u0010\u0015R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u001c\u0012\u0004\b!\u0010\u001f\u001a\u0004\b \u0010\u0015¨\u0006$"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRDocumentDefinition;", "", "", "idDocType", "country", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen1", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/P0;)V", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lkotlin/G0;", "write$Self", "(Lru/cyberity/cbr/core/data/model/CBRDocumentDefinition;Lkotlinx/serialization/encoding/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getIdDocType", "getIdDocType$annotations", "()V", "getCountry", "getCountry$annotations", "Companion", "$serializer", "cyberity-mobile-sdk-publicapi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@w
@PublicApi
/* loaded from: classes9.dex */
public final /* data */ class CBRDocumentDefinition {

    /* renamed from: Companion, reason: from kotlin metadata */
    @Y61.k
    public static final Companion INSTANCE = new Companion(null);

    @Y61.l
    private final String country;

    @Y61.l
    private final String idDocType;

    /* compiled from: CBRDocumentDefinition.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRDocumentDefinition$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lru/cyberity/cbr/core/data/model/CBRDocumentDefinition;", "cyberity-mobile-sdk-publicapi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @Y61.k
        public final KSerializer<CBRDocumentDefinition> serializer() {
            return CBRDocumentDefinition$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CBRDocumentDefinition() {
        this((String) null, (String) (0 == true ? 1 : 0), 3, (C42822w) (0 == true ? 1 : 0));
    }

    @X41.n
    public static final void write$Self(@Y61.k CBRDocumentDefinition self, @Y61.k kotlinx.serialization.encoding.d output, @Y61.k SerialDescriptor serialDesc) {
        if (output.u() || self.idDocType != null) {
            output.p(serialDesc, 0, V0.f412822a, self.idDocType);
        }
        if (!output.u() && self.country == null) {
            return;
        }
        output.p(serialDesc, 1, V0.f412822a, self.country);
    }

    public boolean equals(@Y61.l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CBRDocumentDefinition)) {
            return false;
        }
        CBRDocumentDefinition cBRDocumentDefinition = (CBRDocumentDefinition) other;
        return L.f(this.idDocType, cBRDocumentDefinition.idDocType) && L.f(this.country, cBRDocumentDefinition.country);
    }

    @Y61.l
    public final String getCountry() {
        return this.country;
    }

    @Y61.l
    public final String getIdDocType() {
        return this.idDocType;
    }

    public int hashCode() {
        String str = this.idDocType;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.country;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Y61.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("CBRDocumentDefinition(idDocType=");
        sb2.append(this.idDocType);
        sb2.append(", country=");
        return C22026a.c(sb2, this.country, ')');
    }

    @InterfaceC42830m
    public /* synthetic */ CBRDocumentDefinition(int i12, @v String str, @v String str2, P0 p02) {
        if ((i12 & 1) == 0) {
            this.idDocType = null;
        } else {
            this.idDocType = str;
        }
        if ((i12 & 2) == 0) {
            this.country = null;
        } else {
            this.country = str2;
        }
    }

    public CBRDocumentDefinition(@Y61.l String str, @Y61.l String str2) {
        this.idDocType = str;
        this.country = str2;
    }

    public /* synthetic */ CBRDocumentDefinition(String str, String str2, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : str2);
    }
}
