package ru.cyberity.cbr.core.data.model;

import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.SearchParamsConverterKt;
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

/* compiled from: Agreement.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0087\b\u0018\u0000 62\u00020\u0001:\u0002\u0017%BU\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bBi\b\u0017\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0001\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J(\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014HÇ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010!\u0012\u0004\b#\u0010$\u001a\u0004\b\"\u0010\u001aR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b%\u0010!\u0012\u0004\b'\u0010$\u001a\u0004\b&\u0010\u001aR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b(\u0010!\u0012\u0004\b*\u0010$\u001a\u0004\b)\u0010\u001aR(\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b+\u0010,\u0012\u0004\b/\u0010$\u001a\u0004\b-\u0010.R\"\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b0\u0010!\u0012\u0004\b2\u0010$\u001a\u0004\b1\u0010\u001aR\"\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b3\u0010!\u0012\u0004\b5\u0010$\u001a\u0004\b4\u0010\u001a¨\u00067"}, d2 = {"Lru/cyberity/cbr/core/data/model/b;", "", "", "content", "createdAt", SearchParamsConverterKt.SOURCE, "", "targets", "link", "titleKey", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "", "seen1", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/P0;)V", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lkotlin/G0;", "a", "(Lru/cyberity/cbr/core/data/model/b;Lkotlinx/serialization/encoding/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "g", "getContent$annotations", "()V", "b", "i", "getCreatedAt$annotations", "c", "m", "getSource$annotations", "d", "Ljava/util/List;", "o", "()Ljava/util/List;", "getTargets$annotations", "e", "k", "getLink$annotations", "f", "q", "getTitleKey$annotations", "Companion", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
@w
/* loaded from: classes9.dex */
public final /* data */ class b {

    /* renamed from: Companion, reason: from kotlin metadata */
    @Y61.k
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final String content;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final String createdAt;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final String source;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final List<String> targets;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final String link;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final String titleKey;

    /* compiled from: Agreement.kt */
    @Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000b\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"ru/cyberity/cbr/core/data/model/Agreement.$serializer", "Lkotlinx/serialization/internal/N;", "Lru/cyberity/cbr/core/data/model/b;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "a", "(Lkotlinx/serialization/encoding/Decoder;)Lru/cyberity/cbr/core/data/model/b;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlin/G0;", "(Lkotlinx/serialization/encoding/Encoder;Lru/cyberity/cbr/core/data/model/b;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    @InterfaceC42830m
    public static final class a implements N<b> {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final a f433029a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ SerialDescriptor f433030b;

        static {
            a aVar = new a();
            f433029a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.cyberity.cbr.core.data.model.Agreement", aVar, 6);
            pluginGeneratedSerialDescriptor.j("content", true);
            pluginGeneratedSerialDescriptor.j("createdAt", true);
            pluginGeneratedSerialDescriptor.j(SearchParamsConverterKt.SOURCE, true);
            pluginGeneratedSerialDescriptor.j("targets", true);
            pluginGeneratedSerialDescriptor.j("link", true);
            pluginGeneratedSerialDescriptor.j("titleKey", true);
            f433030b = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // kotlinx.serialization.InterfaceC43386e
        @Y61.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b deserialize(@Y61.k Decoder decoder) {
            SerialDescriptor f332717a = getF332717a();
            kotlinx.serialization.encoding.c cVarC = decoder.c(f332717a);
            Object objF = null;
            boolean z12 = true;
            int i12 = 0;
            Object objF2 = null;
            Object objF3 = null;
            Object objF4 = null;
            Object objF5 = null;
            Object objF6 = null;
            while (z12) {
                int iJ2 = cVarC.j(f332717a);
                switch (iJ2) {
                    case -1:
                        z12 = false;
                        break;
                    case 0:
                        objF = cVarC.f(f332717a, 0, V0.f412822a, objF);
                        i12 |= 1;
                        break;
                    case 1:
                        objF2 = cVarC.f(f332717a, 1, V0.f412822a, objF2);
                        i12 |= 2;
                        break;
                    case 2:
                        objF3 = cVarC.f(f332717a, 2, V0.f412822a, objF3);
                        i12 |= 4;
                        break;
                    case 3:
                        objF4 = cVarC.f(f332717a, 3, new C43401f(V0.f412822a), objF4);
                        i12 |= 8;
                        break;
                    case 4:
                        objF5 = cVarC.f(f332717a, 4, V0.f412822a, objF5);
                        i12 |= 16;
                        break;
                    case 5:
                        objF6 = cVarC.f(f332717a, 5, V0.f412822a, objF6);
                        i12 |= 32;
                        break;
                    default:
                        throw new UnknownFieldException(iJ2);
                }
            }
            cVarC.d(f332717a);
            return new b(i12, (String) objF, (String) objF2, (String) objF3, (List) objF4, (String) objF5, (String) objF6, (P0) null);
        }

        @Override // kotlinx.serialization.internal.N
        @Y61.k
        public KSerializer<?>[] childSerializers() {
            V0 v02 = V0.f412822a;
            return new KSerializer[]{L51.a.a(v02), L51.a.a(v02), L51.a.a(v02), L51.a.a(new C43401f(v02)), L51.a.a(v02), L51.a.a(v02)};
        }

        @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
        @Y61.k
        /* renamed from: getDescriptor */
        public SerialDescriptor getF332717a() {
            return f433030b;
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

    /* compiled from: Agreement.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lru/cyberity/cbr/core/data/model/b$b;", "", "Lkotlinx/serialization/KSerializer;", "Lru/cyberity/cbr/core/data/model/b;", "serializer", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: ru.cyberity.cbr.core.data.model.b$b, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @Y61.k
        public final KSerializer<b> serializer() {
            return a.f433029a;
        }

        private Companion() {
        }
    }

    public b() {
        this((String) null, (String) null, (String) null, (List) null, (String) null, (String) null, 63, (C42822w) null);
    }

    @X41.n
    public static final void a(@Y61.k b self, @Y61.k kotlinx.serialization.encoding.d output, @Y61.k SerialDescriptor serialDesc) {
        if (output.u() || self.content != null) {
            output.p(serialDesc, 0, V0.f412822a, self.content);
        }
        if (output.u() || self.createdAt != null) {
            output.p(serialDesc, 1, V0.f412822a, self.createdAt);
        }
        if (output.u() || !L.f(self.source, "msdk")) {
            output.p(serialDesc, 2, V0.f412822a, self.source);
        }
        if (output.u() || self.targets != null) {
            output.p(serialDesc, 3, new C43401f(V0.f412822a), self.targets);
        }
        if (output.u() || self.link != null) {
            output.p(serialDesc, 4, V0.f412822a, self.link);
        }
        if (!output.u() && self.titleKey == null) {
            return;
        }
        output.p(serialDesc, 5, V0.f412822a, self.titleKey);
    }

    public boolean equals(@Y61.l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof b)) {
            return false;
        }
        b bVar = (b) other;
        return L.f(this.content, bVar.content) && L.f(this.createdAt, bVar.createdAt) && L.f(this.source, bVar.source) && L.f(this.targets, bVar.targets) && L.f(this.link, bVar.link) && L.f(this.titleKey, bVar.titleKey);
    }

    @Y61.l
    /* renamed from: g, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    public int hashCode() {
        String str = this.content;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.createdAt;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.source;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<String> list = this.targets;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str4 = this.link;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.titleKey;
        return iHashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    @Y61.l
    /* renamed from: k, reason: from getter */
    public final String getLink() {
        return this.link;
    }

    @Y61.l
    /* renamed from: q, reason: from getter */
    public final String getTitleKey() {
        return this.titleKey;
    }

    @Y61.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Agreement(content=");
        sb2.append(this.content);
        sb2.append(", createdAt=");
        sb2.append(this.createdAt);
        sb2.append(", source=");
        sb2.append(this.source);
        sb2.append(", targets=");
        sb2.append(this.targets);
        sb2.append(", link=");
        sb2.append(this.link);
        sb2.append(", titleKey=");
        return C22026a.c(sb2, this.titleKey, ')');
    }

    @InterfaceC42830m
    public /* synthetic */ b(int i12, @v String str, @v String str2, @v String str3, @v List list, @v String str4, @v String str5, P0 p02) {
        if ((i12 & 1) == 0) {
            this.content = null;
        } else {
            this.content = str;
        }
        if ((i12 & 2) == 0) {
            this.createdAt = null;
        } else {
            this.createdAt = str2;
        }
        if ((i12 & 4) == 0) {
            this.source = "msdk";
        } else {
            this.source = str3;
        }
        if ((i12 & 8) == 0) {
            this.targets = null;
        } else {
            this.targets = list;
        }
        if ((i12 & 16) == 0) {
            this.link = null;
        } else {
            this.link = str4;
        }
        if ((i12 & 32) == 0) {
            this.titleKey = null;
        } else {
            this.titleKey = str5;
        }
    }

    public b(@Y61.l String str, @Y61.l String str2, @Y61.l String str3, @Y61.l List<String> list, @Y61.l String str4, @Y61.l String str5) {
        this.content = str;
        this.createdAt = str2;
        this.source = str3;
        this.targets = list;
        this.link = str4;
        this.titleKey = str5;
    }

    public /* synthetic */ b(String str, String str2, String str3, List list, String str4, String str5, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? "msdk" : str3, (i12 & 8) != 0 ? null : list, (i12 & 16) != 0 ? null : str4, (i12 & 32) != 0 ? null : str5);
    }
}
