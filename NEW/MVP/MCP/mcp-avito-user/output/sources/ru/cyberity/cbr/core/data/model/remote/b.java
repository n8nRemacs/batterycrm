package ru.cyberity.cbr.core.data.model.remote;

import androidx.compose.foundation.H;
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
import kotlinx.serialization.internal.E0;
import kotlinx.serialization.internal.G0;
import kotlinx.serialization.internal.N;
import kotlinx.serialization.internal.P0;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.V0;
import kotlinx.serialization.v;
import kotlinx.serialization.w;

/* compiled from: MRTDData.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u0002\u0015\u0018B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\b\u0010\tBQ\b\u0017\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0001\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ(\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012HÇ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ>\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J\u0010\u0010\u001e\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010$\u0012\u0004\b&\u0010'\u001a\u0004\b%\u0010\u0017R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010$\u0012\u0004\b)\u0010'\u001a\u0004\b(\u0010\u0017R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010$\u0012\u0004\b+\u0010'\u001a\u0004\b*\u0010\u0017R&\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010,\u0012\u0004\b.\u0010'\u001a\u0004\b-\u0010\u001b¨\u00060"}, d2 = {"Lru/cyberity/cbr/core/data/model/remote/b;", "", "", "imageId", "country", "idDocType", "", "data", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "seen1", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/P0;)V", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lkotlin/G0;", "a", "(Lru/cyberity/cbr/core/data/model/remote/b;Lkotlinx/serialization/encoding/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "()Ljava/lang/String;", "b", "c", "d", "()Ljava/util/List;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lru/cyberity/cbr/core/data/model/remote/b;", "toString", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "k", "getImageId$annotations", "()V", "e", "getCountry$annotations", "i", "getIdDocType$annotations", "Ljava/util/List;", "g", "getData$annotations", "Companion", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
@w
/* loaded from: classes9.dex */
public final /* data */ class b {

    /* renamed from: Companion, reason: from kotlin metadata */
    @Y61.k
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final String imageId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final String country;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final String idDocType;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final List<String> data;

    /* compiled from: MRTDData.kt */
    @Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000b\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"ru/cyberity/cbr/core/data/model/remote/MRTDData.$serializer", "Lkotlinx/serialization/internal/N;", "Lru/cyberity/cbr/core/data/model/remote/b;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "a", "(Lkotlinx/serialization/encoding/Decoder;)Lru/cyberity/cbr/core/data/model/remote/b;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlin/G0;", "(Lkotlinx/serialization/encoding/Encoder;Lru/cyberity/cbr/core/data/model/remote/b;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    @InterfaceC42830m
    public static final class a implements N<b> {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final a f433199a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ SerialDescriptor f433200b;

        static {
            a aVar = new a();
            f433199a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.cyberity.cbr.core.data.model.remote.MRTDData", aVar, 4);
            pluginGeneratedSerialDescriptor.j("imageId", false);
            pluginGeneratedSerialDescriptor.j("country", false);
            pluginGeneratedSerialDescriptor.j("idDocType", false);
            pluginGeneratedSerialDescriptor.j("data", false);
            f433200b = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // kotlinx.serialization.InterfaceC43386e
        @Y61.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b deserialize(@Y61.k Decoder decoder) {
            SerialDescriptor f332717a = getF332717a();
            kotlinx.serialization.encoding.c cVarC = decoder.c(f332717a);
            Object objV = null;
            boolean z12 = true;
            int i12 = 0;
            String strS = null;
            String strS2 = null;
            String strS3 = null;
            while (z12) {
                int iJ2 = cVarC.j(f332717a);
                if (iJ2 == -1) {
                    z12 = false;
                } else if (iJ2 == 0) {
                    strS = cVarC.s(f332717a, 0);
                    i12 |= 1;
                } else if (iJ2 == 1) {
                    strS2 = cVarC.s(f332717a, 1);
                    i12 |= 2;
                } else if (iJ2 == 2) {
                    strS3 = cVarC.s(f332717a, 2);
                    i12 |= 4;
                } else {
                    if (iJ2 != 3) {
                        throw new UnknownFieldException(iJ2);
                    }
                    objV = cVarC.v(f332717a, 3, new C43401f(V0.f412822a), objV);
                    i12 |= 8;
                }
            }
            cVarC.d(f332717a);
            return new b(i12, strS, strS2, strS3, (List) objV, null);
        }

        @Override // kotlinx.serialization.internal.N
        @Y61.k
        public KSerializer<?>[] childSerializers() {
            V0 v02 = V0.f412822a;
            return new KSerializer[]{v02, v02, v02, new C43401f(v02)};
        }

        @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
        @Y61.k
        /* renamed from: getDescriptor */
        public SerialDescriptor getF332717a() {
            return f433200b;
        }

        @Override // kotlinx.serialization.internal.N
        @Y61.k
        public KSerializer<?>[] typeParametersSerializers() {
            return G0.f412773a;
        }

        @Override // kotlinx.serialization.x
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void serialize(@Y61.k Encoder encoder, @Y61.k b value) {
            SerialDescriptor f332717a = getF332717a();
            kotlinx.serialization.encoding.d dVarC = encoder.c(f332717a);
            b.a(value, dVarC, f332717a);
            dVarC.d(f332717a);
        }
    }

    /* compiled from: MRTDData.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lru/cyberity/cbr/core/data/model/remote/b$b;", "", "Lkotlinx/serialization/KSerializer;", "Lru/cyberity/cbr/core/data/model/remote/b;", "serializer", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: ru.cyberity.cbr.core.data.model.remote.b$b, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @Y61.k
        public final KSerializer<b> serializer() {
            return a.f433199a;
        }

        private Companion() {
        }
    }

    @InterfaceC42830m
    public /* synthetic */ b(int i12, @v String str, @v String str2, @v String str3, @v List list, P0 p02) {
        if (15 != (i12 & 15)) {
            E0.b(i12, 15, a.f433199a.getF332717a());
            throw null;
        }
        this.imageId = str;
        this.country = str2;
        this.idDocType = str3;
        this.data = list;
    }

    @Y61.k
    /* renamed from: a, reason: from getter */
    public final String getImageId() {
        return this.imageId;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final String getIdDocType() {
        return this.idDocType;
    }

    @Y61.k
    public final List<String> d() {
        return this.data;
    }

    @Y61.k
    public final String e() {
        return this.country;
    }

    public boolean equals(@Y61.l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof b)) {
            return false;
        }
        b bVar = (b) other;
        return L.f(this.imageId, bVar.imageId) && L.f(this.country, bVar.country) && L.f(this.idDocType, bVar.idDocType) && L.f(this.data, bVar.data);
    }

    @Y61.k
    public final List<String> g() {
        return this.data;
    }

    public int hashCode() {
        return this.data.hashCode() + H.d(H.d(this.imageId.hashCode() * 31, 31, this.country), 31, this.idDocType);
    }

    @Y61.k
    public final String i() {
        return this.idDocType;
    }

    @Y61.k
    public final String k() {
        return this.imageId;
    }

    @Y61.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("MRTDData(imageId=");
        sb2.append(this.imageId);
        sb2.append(", country=");
        sb2.append(this.country);
        sb2.append(", idDocType=");
        sb2.append(this.idDocType);
        sb2.append(", data=");
        return H.p(sb2, this.data, ')');
    }

    public b(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.k List<String> list) {
        this.imageId = str;
        this.country = str2;
        this.idDocType = str3;
        this.data = list;
    }

    @Y61.k
    public final b a(@Y61.k String imageId, @Y61.k String country, @Y61.k String idDocType, @Y61.k List<String> data) {
        return new b(imageId, country, idDocType, data);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ b a(b bVar, String str, String str2, String str3, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = bVar.imageId;
        }
        if ((i12 & 2) != 0) {
            str2 = bVar.country;
        }
        if ((i12 & 4) != 0) {
            str3 = bVar.idDocType;
        }
        if ((i12 & 8) != 0) {
            list = bVar.data;
        }
        return bVar.a(str, str2, str3, list);
    }

    @X41.n
    public static final void a(@Y61.k b self, @Y61.k kotlinx.serialization.encoding.d output, @Y61.k SerialDescriptor serialDesc) {
        output.l(serialDesc, 0, self.imageId);
        output.l(serialDesc, 1, self.country);
        output.l(serialDesc, 2, self.idDocType);
        output.F(serialDesc, 3, new C43401f(V0.f412822a), self.data);
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
