package ru.cyberity.cbr.core.data.model.remote;

import androidx.compose.foundation.H;
import com.avito.android.publish.drafts.LocalPublishState;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.List;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.C43401f;
import kotlinx.serialization.internal.G0;
import kotlinx.serialization.internal.N;
import kotlinx.serialization.internal.P0;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.V0;
import kotlinx.serialization.v;
import kotlinx.serialization.w;
import ru.cyberity.cbr.core.data.model.h;
import ru.cyberity.cbr.core.data.source.applicant.remote.ConfirmationType;

/* compiled from: EKycConfig.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 32\u00020\u0001:\u0002\u0017\u001aB=\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bBQ\b\u0017\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0001\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J(\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014HÇ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJF\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010'\u0012\u0004\b)\u0010*\u001a\u0004\b(\u0010\u0019R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010'\u0012\u0004\b,\u0010*\u001a\u0004\b+\u0010\u0019R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010-\u0012\u0004\b/\u0010*\u001a\u0004\b.\u0010\u001cR(\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001d\u00100\u0012\u0004\b2\u0010*\u001a\u0004\b1\u0010\u001e¨\u00064"}, d2 = {"Lru/cyberity/cbr/core/data/model/remote/h;", "", "", "sourceId", "docType", "Lru/cyberity/cbr/core/data/source/applicant/remote/ConfirmationType;", "confirmationType", "", "Lru/cyberity/cbr/core/data/model/h$d;", LocalPublishState.FIELDS, "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/cyberity/cbr/core/data/source/applicant/remote/ConfirmationType;Ljava/util/List;)V", "", "seen1", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lru/cyberity/cbr/core/data/source/applicant/remote/ConfirmationType;Ljava/util/List;Lkotlinx/serialization/internal/P0;)V", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lkotlin/G0;", "a", "(Lru/cyberity/cbr/core/data/model/remote/h;Lkotlinx/serialization/encoding/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "()Ljava/lang/String;", "b", "c", "()Lru/cyberity/cbr/core/data/source/applicant/remote/ConfirmationType;", "d", "()Ljava/util/List;", "(Ljava/lang/String;Ljava/lang/String;Lru/cyberity/cbr/core/data/source/applicant/remote/ConfirmationType;Ljava/util/List;)Lru/cyberity/cbr/core/data/model/remote/h;", "toString", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "k", "getSourceId$annotations", "()V", "g", "getDocType$annotations", "Lru/cyberity/cbr/core/data/source/applicant/remote/ConfirmationType;", "e", "getConfirmationType$annotations", "Ljava/util/List;", "i", "getFields$annotations", "Companion", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
@w
/* loaded from: classes9.dex */
public final /* data */ class h {

    /* renamed from: Companion, reason: from kotlin metadata */
    @Y61.k
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final String sourceId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final String docType;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final ConfirmationType confirmationType;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final List<h.d> fields;

    /* compiled from: EKycConfig.kt */
    @Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000b\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"ru/cyberity/cbr/core/data/model/remote/RemoteApplicantDataSource.$serializer", "Lkotlinx/serialization/internal/N;", "Lru/cyberity/cbr/core/data/model/remote/h;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "a", "(Lkotlinx/serialization/encoding/Decoder;)Lru/cyberity/cbr/core/data/model/remote/h;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlin/G0;", "(Lkotlinx/serialization/encoding/Encoder;Lru/cyberity/cbr/core/data/model/remote/h;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    @InterfaceC42830m
    public static final class a implements N<h> {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final a f433243a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ SerialDescriptor f433244b;

        static {
            a aVar = new a();
            f433243a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.cyberity.cbr.core.data.model.remote.RemoteApplicantDataSource", aVar, 4);
            pluginGeneratedSerialDescriptor.j("sourceId", true);
            pluginGeneratedSerialDescriptor.j("docType", true);
            pluginGeneratedSerialDescriptor.j("confirmationType", true);
            pluginGeneratedSerialDescriptor.j(LocalPublishState.FIELDS, true);
            f433244b = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // kotlinx.serialization.InterfaceC43386e
        @Y61.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public h deserialize(@Y61.k Decoder decoder) {
            SerialDescriptor f332717a = getF332717a();
            kotlinx.serialization.encoding.c cVarC = decoder.c(f332717a);
            Object objF = null;
            boolean z12 = true;
            int i12 = 0;
            Object objF2 = null;
            Object objF3 = null;
            Object objF4 = null;
            while (z12) {
                int iJ2 = cVarC.j(f332717a);
                if (iJ2 == -1) {
                    z12 = false;
                } else if (iJ2 == 0) {
                    objF = cVarC.f(f332717a, 0, V0.f412822a, objF);
                    i12 |= 1;
                } else if (iJ2 == 1) {
                    objF2 = cVarC.f(f332717a, 1, V0.f412822a, objF2);
                    i12 |= 2;
                } else if (iJ2 == 2) {
                    objF3 = cVarC.f(f332717a, 2, ConfirmationType.a.f433436a, objF3);
                    i12 |= 4;
                } else {
                    if (iJ2 != 3) {
                        throw new UnknownFieldException(iJ2);
                    }
                    objF4 = cVarC.f(f332717a, 3, new C43401f(h.d.a.f433130a), objF4);
                    i12 |= 8;
                }
            }
            cVarC.d(f332717a);
            return new h(i12, (String) objF, (String) objF2, (ConfirmationType) objF3, (List) objF4, (P0) null);
        }

        @Override // kotlinx.serialization.internal.N
        @Y61.k
        public KSerializer<?>[] childSerializers() {
            V0 v02 = V0.f412822a;
            return new KSerializer[]{L51.a.a(v02), L51.a.a(v02), L51.a.a(ConfirmationType.a.f433436a), L51.a.a(new C43401f(h.d.a.f433130a))};
        }

        @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
        @Y61.k
        /* renamed from: getDescriptor */
        public SerialDescriptor getF332717a() {
            return f433244b;
        }

        @Override // kotlinx.serialization.internal.N
        @Y61.k
        public KSerializer<?>[] typeParametersSerializers() {
            return G0.f412773a;
        }

        @Override // kotlinx.serialization.x
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void serialize(@Y61.k Encoder encoder, @Y61.k h value) {
            SerialDescriptor f332717a = getF332717a();
            kotlinx.serialization.encoding.d dVarC = encoder.c(f332717a);
            h.a(value, dVarC, f332717a);
            dVarC.d(f332717a);
        }
    }

    /* compiled from: EKycConfig.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lru/cyberity/cbr/core/data/model/remote/h$b;", "", "Lkotlinx/serialization/KSerializer;", "Lru/cyberity/cbr/core/data/model/remote/h;", "serializer", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: ru.cyberity.cbr.core.data.model.remote.h$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @Y61.k
        public final KSerializer<h> serializer() {
            return a.f433243a;
        }

        private Companion() {
        }
    }

    public h() {
        this((String) null, (String) null, (ConfirmationType) null, (List) null, 15, (C42822w) null);
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final String getSourceId() {
        return this.sourceId;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final String getDocType() {
        return this.docType;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final ConfirmationType getConfirmationType() {
        return this.confirmationType;
    }

    @Y61.l
    public final List<h.d> d() {
        return this.fields;
    }

    @Y61.l
    public final ConfirmationType e() {
        return this.confirmationType;
    }

    public boolean equals(@Y61.l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof h)) {
            return false;
        }
        h hVar = (h) other;
        return L.f(this.sourceId, hVar.sourceId) && L.f(this.docType, hVar.docType) && this.confirmationType == hVar.confirmationType && L.f(this.fields, hVar.fields);
    }

    @Y61.l
    public final String g() {
        return this.docType;
    }

    public int hashCode() {
        String str = this.sourceId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.docType;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        ConfirmationType confirmationType = this.confirmationType;
        int iHashCode3 = (iHashCode2 + (confirmationType == null ? 0 : confirmationType.hashCode())) * 31;
        List<h.d> list = this.fields;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    @Y61.l
    public final List<h.d> i() {
        return this.fields;
    }

    @Y61.l
    public final String k() {
        return this.sourceId;
    }

    @Y61.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("RemoteApplicantDataSource(sourceId=");
        sb2.append(this.sourceId);
        sb2.append(", docType=");
        sb2.append(this.docType);
        sb2.append(", confirmationType=");
        sb2.append(this.confirmationType);
        sb2.append(", fields=");
        return H.p(sb2, this.fields, ')');
    }

    @InterfaceC42830m
    public /* synthetic */ h(int i12, @v String str, @v String str2, @v ConfirmationType confirmationType, @v List list, P0 p02) {
        if ((i12 & 1) == 0) {
            this.sourceId = null;
        } else {
            this.sourceId = str;
        }
        if ((i12 & 2) == 0) {
            this.docType = null;
        } else {
            this.docType = str2;
        }
        if ((i12 & 4) == 0) {
            this.confirmationType = null;
        } else {
            this.confirmationType = confirmationType;
        }
        if ((i12 & 8) == 0) {
            this.fields = null;
        } else {
            this.fields = list;
        }
    }

    @Y61.k
    public final h a(@Y61.l String sourceId, @Y61.l String docType, @Y61.l ConfirmationType confirmationType, @Y61.l List<h.d> fields) {
        return new h(sourceId, docType, confirmationType, fields);
    }

    public h(@Y61.l String str, @Y61.l String str2, @Y61.l ConfirmationType confirmationType, @Y61.l List<h.d> list) {
        this.sourceId = str;
        this.docType = str2;
        this.confirmationType = confirmationType;
        this.fields = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ h a(h hVar, String str, String str2, ConfirmationType confirmationType, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = hVar.sourceId;
        }
        if ((i12 & 2) != 0) {
            str2 = hVar.docType;
        }
        if ((i12 & 4) != 0) {
            confirmationType = hVar.confirmationType;
        }
        if ((i12 & 8) != 0) {
            list = hVar.fields;
        }
        return hVar.a(str, str2, confirmationType, list);
    }

    @X41.n
    public static final void a(@Y61.k h self, @Y61.k kotlinx.serialization.encoding.d output, @Y61.k SerialDescriptor serialDesc) {
        if (output.u() || self.sourceId != null) {
            output.p(serialDesc, 0, V0.f412822a, self.sourceId);
        }
        if (output.u() || self.docType != null) {
            output.p(serialDesc, 1, V0.f412822a, self.docType);
        }
        if (output.u() || self.confirmationType != null) {
            output.p(serialDesc, 2, ConfirmationType.a.f433436a, self.confirmationType);
        }
        if (!output.u() && self.fields == null) {
            return;
        }
        output.p(serialDesc, 3, new C43401f(h.d.a.f433130a), self.fields);
    }

    public /* synthetic */ h(String str, String str2, ConfirmationType confirmationType, List list, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : confirmationType, (i12 & 8) != 0 ? null : list);
    }

    @v
    public static /* synthetic */ void f() {
    }

    @v
    public static /* synthetic */ void h() {
    }

    @v
    public static /* synthetic */ void j() {
    }

    @v
    public static /* synthetic */ void l() {
    }
}
