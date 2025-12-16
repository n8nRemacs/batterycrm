package ru.cyberity.cbr.core.data.model.remote.response;

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
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.C43400e0;
import kotlinx.serialization.internal.G0;
import kotlinx.serialization.internal.N;
import kotlinx.serialization.internal.P0;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.v;
import kotlinx.serialization.w;
import ru.cyberity.cbr.core.data.model.DocumentType;
import ru.cyberity.cbr.core.data.model.remote.l;
import ru.cyberity.cbr.core.data.model.remote.response.c;
import ru.cyberity.cbr.core.data.model.remote.response.h;

/* compiled from: RequiredIdDocsStatusResponse.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 22\u00020\u0001:\u0002\u0017\u001aB7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bBM\b\u0017\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0018\b\u0001\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0004\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J(\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014HÇ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0019J\u001e\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ@\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0017\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010(\u0012\u0004\b*\u0010+\u001a\u0004\b)\u0010\u0019R.\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010,\u0012\u0004\b.\u0010+\u001a\u0004\b-\u0010\u001bR\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010/\u0012\u0004\b1\u0010+\u001a\u0004\b0\u0010\u001d¨\u00063"}, d2 = {"Lru/cyberity/cbr/core/data/model/remote/response/f;", "", "Lru/cyberity/cbr/core/data/model/remote/response/c;", "inspectionReview", "", "Lru/cyberity/cbr/core/data/model/DocumentType;", "Lru/cyberity/cbr/core/data/model/remote/l;", "requiredIdDocsStatus", "Lru/cyberity/cbr/core/data/model/remote/response/h;", "workflowStatus", "<init>", "(Lru/cyberity/cbr/core/data/model/remote/response/c;Ljava/util/Map;Lru/cyberity/cbr/core/data/model/remote/response/h;)V", "", "seen1", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "(ILru/cyberity/cbr/core/data/model/remote/response/c;Ljava/util/Map;Lru/cyberity/cbr/core/data/model/remote/response/h;Lkotlinx/serialization/internal/P0;)V", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lkotlin/G0;", "a", "(Lru/cyberity/cbr/core/data/model/remote/response/f;Lkotlinx/serialization/encoding/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "()Lru/cyberity/cbr/core/data/model/remote/response/c;", "b", "()Ljava/util/Map;", "c", "()Lru/cyberity/cbr/core/data/model/remote/response/h;", "(Lru/cyberity/cbr/core/data/model/remote/response/c;Ljava/util/Map;Lru/cyberity/cbr/core/data/model/remote/response/h;)Lru/cyberity/cbr/core/data/model/remote/response/f;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Lru/cyberity/cbr/core/data/model/remote/response/c;", "d", "getInspectionReview$annotations", "()V", "Ljava/util/Map;", "f", "getRequiredIdDocsStatus$annotations", "Lru/cyberity/cbr/core/data/model/remote/response/h;", "h", "getWorkflowStatus$annotations", "Companion", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
@w
/* loaded from: classes9.dex */
public final /* data */ class f {

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    private final c inspectionReview;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @k
    private final Map<DocumentType, ru.cyberity.cbr.core.data.model.remote.l> requiredIdDocsStatus;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @l
    private final h workflowStatus;

    /* compiled from: RequiredIdDocsStatusResponse.kt */
    @Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000b\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"ru/cyberity/cbr/core/data/model/remote/response/RequiredIdDocsStatusResponse.$serializer", "Lkotlinx/serialization/internal/N;", "Lru/cyberity/cbr/core/data/model/remote/response/f;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "a", "(Lkotlinx/serialization/encoding/Decoder;)Lru/cyberity/cbr/core/data/model/remote/response/f;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlin/G0;", "(Lkotlinx/serialization/encoding/Encoder;Lru/cyberity/cbr/core/data/model/remote/response/f;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    @InterfaceC42830m
    public static final class a implements N<f> {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f433389a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ SerialDescriptor f433390b;

        static {
            a aVar = new a();
            f433389a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.cyberity.cbr.core.data.model.remote.response.RequiredIdDocsStatusResponse", aVar, 3);
            pluginGeneratedSerialDescriptor.j("inspectionReview", true);
            pluginGeneratedSerialDescriptor.j("requiredIdDocsStatus", true);
            pluginGeneratedSerialDescriptor.j("workflowStatus", true);
            f433390b = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // kotlinx.serialization.InterfaceC43386e
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public f deserialize(@k Decoder decoder) {
            SerialDescriptor f332717a = getF332717a();
            kotlinx.serialization.encoding.c cVarC = decoder.c(f332717a);
            Object objF = null;
            boolean z12 = true;
            int i12 = 0;
            Object objV = null;
            Object objF2 = null;
            while (z12) {
                int iJ2 = cVarC.j(f332717a);
                if (iJ2 == -1) {
                    z12 = false;
                } else if (iJ2 == 0) {
                    objF = cVarC.f(f332717a, 0, c.a.f433300a, objF);
                    i12 |= 1;
                } else if (iJ2 == 1) {
                    objV = cVarC.v(f332717a, 1, new C43400e0(DocumentType.Companion.C12445a.f432990a, L51.a.a(l.a.f433278a)), objV);
                    i12 |= 2;
                } else {
                    if (iJ2 != 2) {
                        throw new UnknownFieldException(iJ2);
                    }
                    objF2 = cVarC.f(f332717a, 2, h.a.f433404a, objF2);
                    i12 |= 4;
                }
            }
            cVarC.d(f332717a);
            return new f(i12, (c) objF, (Map) objV, (h) objF2, (P0) null);
        }

        @Override // kotlinx.serialization.internal.N
        @k
        public KSerializer<?>[] childSerializers() {
            return new KSerializer[]{L51.a.a(c.a.f433300a), new C43400e0(DocumentType.Companion.C12445a.f432990a, L51.a.a(l.a.f433278a)), L51.a.a(h.a.f433404a)};
        }

        @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
        @k
        /* renamed from: getDescriptor */
        public SerialDescriptor getF332717a() {
            return f433390b;
        }

        @Override // kotlinx.serialization.internal.N
        @k
        public KSerializer<?>[] typeParametersSerializers() {
            return G0.f412773a;
        }

        @Override // kotlinx.serialization.x
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void serialize(@k Encoder encoder, @k f value) {
            SerialDescriptor f332717a = getF332717a();
            kotlinx.serialization.encoding.d dVarC = encoder.c(f332717a);
            f.a(value, dVarC, f332717a);
            dVarC.d(f332717a);
        }
    }

    /* compiled from: RequiredIdDocsStatusResponse.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lru/cyberity/cbr/core/data/model/remote/response/f$b;", "", "Lkotlinx/serialization/KSerializer;", "Lru/cyberity/cbr/core/data/model/remote/response/f;", "serializer", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: ru.cyberity.cbr.core.data.model.remote.response.f$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @k
        public final KSerializer<f> serializer() {
            return a.f433389a;
        }

        private Companion() {
        }
    }

    public f() {
        this((c) null, (Map) null, (h) null, 7, (C42822w) null);
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final c getInspectionReview() {
        return this.inspectionReview;
    }

    @k
    public final Map<DocumentType, ru.cyberity.cbr.core.data.model.remote.l> b() {
        return this.requiredIdDocsStatus;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final h getWorkflowStatus() {
        return this.workflowStatus;
    }

    @Y61.l
    public final c d() {
        return this.inspectionReview;
    }

    public boolean equals(@Y61.l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof f)) {
            return false;
        }
        f fVar = (f) other;
        return L.f(this.inspectionReview, fVar.inspectionReview) && L.f(this.requiredIdDocsStatus, fVar.requiredIdDocsStatus) && L.f(this.workflowStatus, fVar.workflowStatus);
    }

    @k
    public final Map<DocumentType, ru.cyberity.cbr.core.data.model.remote.l> f() {
        return this.requiredIdDocsStatus;
    }

    @Y61.l
    public final h h() {
        return this.workflowStatus;
    }

    public int hashCode() {
        c cVar = this.inspectionReview;
        int iC2 = AK.c.c((cVar == null ? 0 : cVar.hashCode()) * 31, 31, this.requiredIdDocsStatus);
        h hVar = this.workflowStatus;
        return iC2 + (hVar != null ? hVar.hashCode() : 0);
    }

    @k
    public String toString() {
        return "RequiredIdDocsStatusResponse(inspectionReview=" + this.inspectionReview + ", requiredIdDocsStatus=" + this.requiredIdDocsStatus + ", workflowStatus=" + this.workflowStatus + ')';
    }

    @InterfaceC42830m
    public /* synthetic */ f(int i12, @v c cVar, @v Map map, @v h hVar, P0 p02) {
        if ((i12 & 1) == 0) {
            this.inspectionReview = null;
        } else {
            this.inspectionReview = cVar;
        }
        if ((i12 & 2) == 0) {
            this.requiredIdDocsStatus = kotlin.collections.P0.c();
        } else {
            this.requiredIdDocsStatus = map;
        }
        if ((i12 & 4) == 0) {
            this.workflowStatus = null;
        } else {
            this.workflowStatus = hVar;
        }
    }

    @k
    public final f a(@Y61.l c inspectionReview, @k Map<DocumentType, ru.cyberity.cbr.core.data.model.remote.l> requiredIdDocsStatus, @Y61.l h workflowStatus) {
        return new f(inspectionReview, requiredIdDocsStatus, workflowStatus);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ f a(f fVar, c cVar, Map map, h hVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            cVar = fVar.inspectionReview;
        }
        if ((i12 & 2) != 0) {
            map = fVar.requiredIdDocsStatus;
        }
        if ((i12 & 4) != 0) {
            hVar = fVar.workflowStatus;
        }
        return fVar.a(cVar, (Map<DocumentType, ru.cyberity.cbr.core.data.model.remote.l>) map, hVar);
    }

    @n
    public static final void a(@k f self, @k kotlinx.serialization.encoding.d output, @k SerialDescriptor serialDesc) {
        if (output.u() || self.inspectionReview != null) {
            output.p(serialDesc, 0, c.a.f433300a, self.inspectionReview);
        }
        if (output.u() || !L.f(self.requiredIdDocsStatus, kotlin.collections.P0.c())) {
            output.F(serialDesc, 1, new C43400e0(DocumentType.Companion.C12445a.f432990a, L51.a.a(l.a.f433278a)), self.requiredIdDocsStatus);
        }
        if (!output.u() && self.workflowStatus == null) {
            return;
        }
        output.p(serialDesc, 2, h.a.f433404a, self.workflowStatus);
    }

    public f(@Y61.l c cVar, @k Map<DocumentType, ru.cyberity.cbr.core.data.model.remote.l> map, @Y61.l h hVar) {
        this.inspectionReview = cVar;
        this.requiredIdDocsStatus = map;
        this.workflowStatus = hVar;
    }

    public /* synthetic */ f(c cVar, Map map, h hVar, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : cVar, (i12 & 2) != 0 ? kotlin.collections.P0.c() : map, (i12 & 4) != 0 ? null : hVar);
    }

    @v
    public static /* synthetic */ void e() {
    }

    @v
    public static /* synthetic */ void g() {
    }

    @v
    public static /* synthetic */ void i() {
    }
}
