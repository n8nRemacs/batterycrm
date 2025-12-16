package ru.cyberity.cbr.core.data.source.applicant.remote;

import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.RequestReviewResultKt;
import java.util.Map;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlinx.serialization.C43385d;
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
import kotlinx.serialization.internal.V0;

/* compiled from: ApplicantDataSubmitModel.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002\u0014#BA\u0012\u001b\b\u0002\u0010\u0005\u001a\u0015\u0012\u0004\u0012\u00020\u0003\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u0004\u0018\u00010\u0002\u0012\u001b\b\u0002\u0010\u0006\u001a\u0015\u0012\u0004\u0012\u00020\u0003\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bBU\b\u0017\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u001b\b\u0001\u0010\u0005\u001a\u0015\u0012\u0004\u0012\u00020\u0003\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u0004\u0018\u00010\u0002\u0012\u001b\b\u0001\u0010\u0006\u001a\u0015\u0012\u0004\u0012\u00020\u0003\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ(\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011HÇ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR3\u0010\u0005\u001a\u0015\u0012\u0004\u0012\u00020\u0003\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010\u001e\u0012\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 R3\u0010\u0006\u001a\u0015\u0012\u0004\u0012\u00020\u0003\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b#\u0010\u001e\u0012\u0004\b%\u0010\"\u001a\u0004\b$\u0010 ¨\u0006'"}, d2 = {"Lru/cyberity/cbr/core/data/source/applicant/remote/b;", "", "", "", "Lkotlinx/serialization/b;", "idDoc", RequestReviewResultKt.INFO_TYPE, "<init>", "(Ljava/util/Map;Ljava/util/Map;)V", "", "seen1", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "(ILjava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/P0;)V", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lkotlin/G0;", "a", "(Lru/cyberity/cbr/core/data/source/applicant/remote/b;Lkotlinx/serialization/encoding/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Map;", "c", "()Ljava/util/Map;", "getIdDoc$annotations", "()V", "b", "e", "getInfo$annotations", "Companion", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
@kotlinx.serialization.w
/* loaded from: classes9.dex */
public final /* data */ class b {

    /* renamed from: Companion, reason: from kotlin metadata */
    @Y61.k
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final Map<String, Object> idDoc;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final Map<String, Object> info;

    /* compiled from: ApplicantDataSubmitModel.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lru/cyberity/cbr/core/data/source/applicant/remote/b$b;", "", "Lkotlinx/serialization/KSerializer;", "Lru/cyberity/cbr/core/data/source/applicant/remote/b;", "serializer", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: ru.cyberity.cbr.core.data.source.applicant.remote.b$b, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @Y61.k
        public final KSerializer<b> serializer() {
            return a.f433456a;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b() {
        this((Map) null, (Map) (0 == true ? 1 : 0), 3, (C42822w) (0 == true ? 1 : 0));
    }

    @X41.n
    public static final void a(@Y61.k b self, @Y61.k kotlinx.serialization.encoding.d output, @Y61.k SerialDescriptor serialDesc) {
        if (output.u() || self.idDoc != null) {
            output.p(serialDesc, 0, new C43400e0(V0.f412822a, new C43385d(m0.f406844a.b(Object.class), new KSerializer[0])), self.idDoc);
        }
        if (!output.u() && self.info == null) {
            return;
        }
        output.p(serialDesc, 1, new C43400e0(V0.f412822a, new C43385d(m0.f406844a.b(Object.class), new KSerializer[0])), self.info);
    }

    public boolean equals(@Y61.l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof b)) {
            return false;
        }
        b bVar = (b) other;
        return L.f(this.idDoc, bVar.idDoc) && L.f(this.info, bVar.info);
    }

    public int hashCode() {
        Map<String, Object> map = this.idDoc;
        int iHashCode = (map == null ? 0 : map.hashCode()) * 31;
        Map<String, Object> map2 = this.info;
        return iHashCode + (map2 != null ? map2.hashCode() : 0);
    }

    @Y61.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ApplicantDataSubmitModel(idDoc=");
        sb2.append(this.idDoc);
        sb2.append(", info=");
        return androidx.appcompat.app.r.w(sb2, this.info, ')');
    }

    @InterfaceC42830m
    public /* synthetic */ b(int i12, @kotlinx.serialization.v Map map, @kotlinx.serialization.v Map map2, P0 p02) {
        if ((i12 & 1) == 0) {
            this.idDoc = null;
        } else {
            this.idDoc = map;
        }
        if ((i12 & 2) == 0) {
            this.info = null;
        } else {
            this.info = map2;
        }
    }

    public b(@Y61.l Map<String, ? extends Object> map, @Y61.l Map<String, ? extends Object> map2) {
        this.idDoc = map;
        this.info = map2;
    }

    /* compiled from: ApplicantDataSubmitModel.kt */
    @Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000b\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"ru/cyberity/cbr/core/data/source/applicant/remote/ApplicantDataSubmitModel.$serializer", "Lkotlinx/serialization/internal/N;", "Lru/cyberity/cbr/core/data/source/applicant/remote/b;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "a", "(Lkotlinx/serialization/encoding/Decoder;)Lru/cyberity/cbr/core/data/source/applicant/remote/b;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlin/G0;", "(Lkotlinx/serialization/encoding/Encoder;Lru/cyberity/cbr/core/data/source/applicant/remote/b;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    @InterfaceC42830m
    public static final class a implements N<b> {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final a f433456a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ SerialDescriptor f433457b;

        static {
            a aVar = new a();
            f433456a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.cyberity.cbr.core.data.source.applicant.remote.ApplicantDataSubmitModel", aVar, 2);
            pluginGeneratedSerialDescriptor.j("idDoc", true);
            pluginGeneratedSerialDescriptor.j(RequestReviewResultKt.INFO_TYPE, true);
            f433457b = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // kotlinx.serialization.InterfaceC43386e
        @Y61.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b deserialize(@Y61.k Decoder decoder) {
            SerialDescriptor f412706c = getF332717a();
            kotlinx.serialization.encoding.c cVarC = decoder.c(f412706c);
            P0 p02 = null;
            boolean z12 = true;
            int i12 = 0;
            Object objF = null;
            Object objF2 = null;
            while (z12) {
                int iJ2 = cVarC.j(f412706c);
                if (iJ2 == -1) {
                    z12 = false;
                } else if (iJ2 == 0) {
                    objF = cVarC.f(f412706c, 0, new C43400e0(V0.f412822a, new C43385d(m0.f406844a.b(Object.class), new KSerializer[0])), objF);
                    i12 |= 1;
                } else {
                    if (iJ2 != 1) {
                        throw new UnknownFieldException(iJ2);
                    }
                    objF2 = cVarC.f(f412706c, 1, new C43400e0(V0.f412822a, new C43385d(m0.f406844a.b(Object.class), new KSerializer[0])), objF2);
                    i12 |= 2;
                }
            }
            cVarC.d(f412706c);
            return new b(i12, (Map) objF, (Map) objF2, p02);
        }

        @Override // kotlinx.serialization.internal.N
        @Y61.k
        public KSerializer<?>[] childSerializers() {
            V0 v02 = V0.f412822a;
            n0 n0Var = m0.f406844a;
            return new KSerializer[]{L51.a.a(new C43400e0(v02, new C43385d(n0Var.b(Object.class), new KSerializer[0]))), L51.a.a(new C43400e0(v02, new C43385d(n0Var.b(Object.class), new KSerializer[0])))};
        }

        @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
        @Y61.k
        /* renamed from: getDescriptor */
        public SerialDescriptor getF332717a() {
            return f433457b;
        }

        @Override // kotlinx.serialization.internal.N
        @Y61.k
        public KSerializer<?>[] typeParametersSerializers() {
            return G0.f412773a;
        }

        @Override // kotlinx.serialization.x
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void serialize(@Y61.k Encoder encoder, @Y61.k b value) {
            SerialDescriptor f412706c = getF332717a();
            kotlinx.serialization.encoding.d dVarC = encoder.c(f412706c);
            b.a(value, dVarC, f412706c);
            dVarC.d(f412706c);
        }
    }

    public /* synthetic */ b(Map map, Map map2, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : map, (i12 & 2) != 0 ? null : map2);
    }
}
