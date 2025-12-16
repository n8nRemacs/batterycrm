package ru.cyberity.cbr.core.data.model.remote;

import androidx.compose.foundation.H;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.List;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.C43401f;
import kotlinx.serialization.internal.E0;
import kotlinx.serialization.internal.G0;
import kotlinx.serialization.internal.N;
import kotlinx.serialization.internal.P0;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.V0;
import kotlinx.serialization.v;
import kotlinx.serialization.w;
import ru.cyberity.cbr.core.data.model.remote.e;

/* compiled from: Metadata.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 02\u00020\u0001:\u0002\u0016\u0019B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nBQ\b\u0017\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0001\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ(\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013HÇ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJB\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u0018R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010%\u0012\u0004\b*\u0010(\u001a\u0004\b)\u0010\u0018R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010%\u0012\u0004\b,\u0010(\u001a\u0004\b+\u0010\u0018R&\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010-\u0012\u0004\b/\u0010(\u001a\u0004\b.\u0010\u001c¨\u00061"}, d2 = {"Lru/cyberity/cbr/core/data/model/remote/d;", "", "", "id", "email", "phone", "", "Lru/cyberity/cbr/core/data/model/remote/e;", "metadata", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "seen1", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/P0;)V", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lkotlin/G0;", "a", "(Lru/cyberity/cbr/core/data/model/remote/d;Lkotlinx/serialization/encoding/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "()Ljava/lang/String;", "b", "c", "d", "()Ljava/util/List;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lru/cyberity/cbr/core/data/model/remote/d;", "toString", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "g", "getId$annotations", "()V", "e", "getEmail$annotations", "k", "getPhone$annotations", "Ljava/util/List;", "i", "getMetadata$annotations", "Companion", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
@w
/* loaded from: classes9.dex */
public final /* data */ class d {

    /* renamed from: Companion, reason: from kotlin metadata */
    @Y61.k
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final String id;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final String email;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final String phone;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final List<e> metadata;

    /* compiled from: Metadata.kt */
    @Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000b\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"ru/cyberity/cbr/core/data/model/remote/Metadata.$serializer", "Lkotlinx/serialization/internal/N;", "Lru/cyberity/cbr/core/data/model/remote/d;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "a", "(Lkotlinx/serialization/encoding/Decoder;)Lru/cyberity/cbr/core/data/model/remote/d;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlin/G0;", "(Lkotlinx/serialization/encoding/Encoder;Lru/cyberity/cbr/core/data/model/remote/d;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    @InterfaceC42830m
    public static final class a implements N<d> {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final a f433209a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ SerialDescriptor f433210b;

        static {
            a aVar = new a();
            f433209a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.cyberity.cbr.core.data.model.remote.Metadata", aVar, 4);
            pluginGeneratedSerialDescriptor.j("id", false);
            pluginGeneratedSerialDescriptor.j("email", true);
            pluginGeneratedSerialDescriptor.j("phone", true);
            pluginGeneratedSerialDescriptor.j("metadata", true);
            f433210b = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // kotlinx.serialization.InterfaceC43386e
        @Y61.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public d deserialize(@Y61.k Decoder decoder) {
            SerialDescriptor f332717a = getF332717a();
            kotlinx.serialization.encoding.c cVarC = decoder.c(f332717a);
            Object objF = null;
            boolean z12 = true;
            int i12 = 0;
            Object objF2 = null;
            Object objV = null;
            String strS = null;
            while (z12) {
                int iJ2 = cVarC.j(f332717a);
                if (iJ2 == -1) {
                    z12 = false;
                } else if (iJ2 == 0) {
                    strS = cVarC.s(f332717a, 0);
                    i12 |= 1;
                } else if (iJ2 == 1) {
                    objF = cVarC.f(f332717a, 1, V0.f412822a, objF);
                    i12 |= 2;
                } else if (iJ2 == 2) {
                    objF2 = cVarC.f(f332717a, 2, V0.f412822a, objF2);
                    i12 |= 4;
                } else {
                    if (iJ2 != 3) {
                        throw new UnknownFieldException(iJ2);
                    }
                    objV = cVarC.v(f332717a, 3, new C43401f(e.a.f433213a), objV);
                    i12 |= 8;
                }
            }
            cVarC.d(f332717a);
            return new d(i12, strS, (String) objF, (String) objF2, (List) objV, (P0) null);
        }

        @Override // kotlinx.serialization.internal.N
        @Y61.k
        public KSerializer<?>[] childSerializers() {
            V0 v02 = V0.f412822a;
            return new KSerializer[]{v02, L51.a.a(v02), L51.a.a(v02), new C43401f(e.a.f433213a)};
        }

        @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
        @Y61.k
        /* renamed from: getDescriptor */
        public SerialDescriptor getF332717a() {
            return f433210b;
        }

        @Override // kotlinx.serialization.internal.N
        @Y61.k
        public KSerializer<?>[] typeParametersSerializers() {
            return G0.f412773a;
        }

        @Override // kotlinx.serialization.x
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void serialize(@Y61.k Encoder encoder, @Y61.k d value) {
            SerialDescriptor f332717a = getF332717a();
            kotlinx.serialization.encoding.d dVarC = encoder.c(f332717a);
            d.a(value, dVarC, f332717a);
            dVarC.d(f332717a);
        }
    }

    /* compiled from: Metadata.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lru/cyberity/cbr/core/data/model/remote/d$b;", "", "Lkotlinx/serialization/KSerializer;", "Lru/cyberity/cbr/core/data/model/remote/d;", "serializer", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: ru.cyberity.cbr.core.data.model.remote.d$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @Y61.k
        public final KSerializer<d> serializer() {
            return a.f433209a;
        }

        private Companion() {
        }
    }

    @InterfaceC42830m
    public d(int i12, @v String str, @v String str2, @v String str3, @v List list, P0 p02) {
        if (1 != (i12 & 1)) {
            E0.b(i12, 1, a.f433209a.getF332717a());
            throw null;
        }
        this.id = str;
        if ((i12 & 2) == 0) {
            this.email = null;
        } else {
            this.email = str2;
        }
        if ((i12 & 4) == 0) {
            this.phone = null;
        } else {
            this.phone = str3;
        }
        if ((i12 & 8) == 0) {
            this.metadata = C42784z0.f406748b;
        } else {
            this.metadata = list;
        }
    }

    @Y61.k
    /* renamed from: a, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }

    @Y61.k
    public final List<e> d() {
        return this.metadata;
    }

    @Y61.l
    public final String e() {
        return this.email;
    }

    public boolean equals(@Y61.l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof d)) {
            return false;
        }
        d dVar = (d) other;
        return L.f(this.id, dVar.id) && L.f(this.email, dVar.email) && L.f(this.phone, dVar.phone) && L.f(this.metadata, dVar.metadata);
    }

    @Y61.k
    public final String g() {
        return this.id;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.email;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.phone;
        return this.metadata.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Y61.k
    public final List<e> i() {
        return this.metadata;
    }

    @Y61.l
    public final String k() {
        return this.phone;
    }

    @Y61.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Metadata(id=");
        sb2.append(this.id);
        sb2.append(", email=");
        sb2.append(this.email);
        sb2.append(", phone=");
        sb2.append(this.phone);
        sb2.append(", metadata=");
        return H.p(sb2, this.metadata, ')');
    }

    @Y61.k
    public final d a(@Y61.k String id2, @Y61.l String email, @Y61.l String phone, @Y61.k List<e> metadata) {
        return new d(id2, email, phone, metadata);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ d a(d dVar, String str, String str2, String str3, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = dVar.id;
        }
        if ((i12 & 2) != 0) {
            str2 = dVar.email;
        }
        if ((i12 & 4) != 0) {
            str3 = dVar.phone;
        }
        if ((i12 & 8) != 0) {
            list = dVar.metadata;
        }
        return dVar.a(str, str2, str3, list);
    }

    @X41.n
    public static final void a(@Y61.k d self, @Y61.k kotlinx.serialization.encoding.d output, @Y61.k SerialDescriptor serialDesc) {
        output.l(serialDesc, 0, self.id);
        if (output.u() || self.email != null) {
            output.p(serialDesc, 1, V0.f412822a, self.email);
        }
        if (output.u() || self.phone != null) {
            output.p(serialDesc, 2, V0.f412822a, self.phone);
        }
        if (!output.u() && L.f(self.metadata, C42784z0.f406748b)) {
            return;
        }
        output.F(serialDesc, 3, new C43401f(e.a.f433213a), self.metadata);
    }

    public d(@Y61.k String str, @Y61.l String str2, @Y61.l String str3, @Y61.k List<e> list) {
        this.id = str;
        this.email = str2;
        this.phone = str3;
        this.metadata = list;
    }

    public d(String str, String str2, String str3, List list, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : str3, (i12 & 8) != 0 ? C42784z0.f406748b : list);
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
