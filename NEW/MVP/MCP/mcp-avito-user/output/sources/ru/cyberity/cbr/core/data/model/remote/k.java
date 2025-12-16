package ru.cyberity.cbr.core.data.model.remote;

import androidx.compose.runtime.C22026a;
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
import ru.cyberity.cbr.core.data.model.IdentitySide;
import ru.cyberity.cbr.core.data.model.remote.e;

/* compiled from: RemoteIdDoc.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0087\b\u0018\u0000 E2\u00020\u0001:\u0002\u0014\u0016Bm\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000eB\u0081\u0001\b\u0017\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0001\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007\u0012\u0010\b\u0001\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007\u0012\u0010\b\u0001\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0018\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0015Jv\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00072\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00072\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0015J\u0010\u0010 \u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%J(\u0010\u0014\u001a\u00020+2\u0006\u0010&\u001a\u00020\u00002\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)HÇ\u0001¢\u0006\u0004\b\u0014\u0010,R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010-\u0012\u0004\b/\u00100\u001a\u0004\b.\u0010\u0015R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010-\u0012\u0004\b2\u00100\u001a\u0004\b1\u0010\u0015R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u00103\u0012\u0004\b5\u00100\u001a\u0004\b4\u0010\u0018R(\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u00106\u0012\u0004\b8\u00100\u001a\u0004\b7\u0010\u001aR(\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u00106\u0012\u0004\b:\u00100\u001a\u0004\b9\u0010\u001aR(\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u00106\u0012\u0004\b<\u00100\u001a\u0004\b;\u0010\u001aR*\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u001d\u0010-\u0012\u0004\b?\u00100\u001a\u0004\b=\u0010\u0015\"\u0004\b\u0014\u0010>R\u0011\u0010B\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0011\u0010D\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\bC\u0010A¨\u0006F"}, d2 = {"Lru/cyberity/cbr/core/data/model/remote/k;", "", "", "idDocType", "country", "Lru/cyberity/cbr/core/data/model/IdentitySide;", "idDocSubType", "", "warnings", "errors", "Lru/cyberity/cbr/core/data/model/remote/e;", "metadata", "imageId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/cyberity/cbr/core/data/model/IdentitySide;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "", "seen1", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lru/cyberity/cbr/core/data/model/IdentitySide;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lkotlinx/serialization/internal/P0;)V", "a", "()Ljava/lang/String;", "b", "c", "()Lru/cyberity/cbr/core/data/model/IdentitySide;", "d", "()Ljava/util/List;", "e", "f", "g", "(Ljava/lang/String;Ljava/lang/String;Lru/cyberity/cbr/core/data/model/IdentitySide;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)Lru/cyberity/cbr/core/data/model/remote/k;", "toString", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lkotlin/G0;", "(Lru/cyberity/cbr/core/data/model/remote/k;Lkotlinx/serialization/encoding/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "o", "getIdDocType$annotations", "()V", "h", "getCountry$annotations", "Lru/cyberity/cbr/core/data/model/IdentitySide;", "m", "getIdDocSubType$annotations", "Ljava/util/List;", "u", "getWarnings$annotations", "j", "getErrors$annotations", "s", "getMetadata$annotations", "q", "(Ljava/lang/String;)V", "getImageId$annotations", "w", "()Z", "isFatal", "l", "hasErrors", "Companion", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
@w
/* loaded from: classes9.dex */
public final /* data */ class k {

    /* renamed from: Companion, reason: from kotlin metadata */
    @Y61.k
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final String idDocType;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final String country;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final IdentitySide idDocSubType;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final List<String> warnings;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final List<String> errors;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final List<e> metadata;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private String imageId;

    /* compiled from: RemoteIdDoc.kt */
    @Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000b\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"ru/cyberity/cbr/core/data/model/remote/RemoteIdDoc.$serializer", "Lkotlinx/serialization/internal/N;", "Lru/cyberity/cbr/core/data/model/remote/k;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "a", "(Lkotlinx/serialization/encoding/Decoder;)Lru/cyberity/cbr/core/data/model/remote/k;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlin/G0;", "(Lkotlinx/serialization/encoding/Encoder;Lru/cyberity/cbr/core/data/model/remote/k;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    @InterfaceC42830m
    public static final class a implements N<k> {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final a f433271a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ SerialDescriptor f433272b;

        static {
            a aVar = new a();
            f433271a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.cyberity.cbr.core.data.model.remote.RemoteIdDoc", aVar, 7);
            pluginGeneratedSerialDescriptor.j("idDocType", true);
            pluginGeneratedSerialDescriptor.j("country", true);
            pluginGeneratedSerialDescriptor.j("idDocSubType", true);
            pluginGeneratedSerialDescriptor.j("warnings", true);
            pluginGeneratedSerialDescriptor.j("errors", true);
            pluginGeneratedSerialDescriptor.j("metadata", true);
            pluginGeneratedSerialDescriptor.j("imageId", true);
            f433272b = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // kotlinx.serialization.InterfaceC43386e
        @Y61.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public k deserialize(@Y61.k Decoder decoder) {
            SerialDescriptor f412706c = getF332717a();
            kotlinx.serialization.encoding.c cVarC = decoder.c(f412706c);
            Object objF = null;
            boolean z12 = true;
            int i12 = 0;
            Object objF2 = null;
            Object objF3 = null;
            Object objF4 = null;
            Object objF5 = null;
            Object objF6 = null;
            Object objF7 = null;
            while (z12) {
                int iJ2 = cVarC.j(f412706c);
                switch (iJ2) {
                    case -1:
                        z12 = false;
                        break;
                    case 0:
                        objF = cVarC.f(f412706c, 0, V0.f412822a, objF);
                        i12 |= 1;
                        break;
                    case 1:
                        objF2 = cVarC.f(f412706c, 1, V0.f412822a, objF2);
                        i12 |= 2;
                        break;
                    case 2:
                        objF3 = cVarC.f(f412706c, 2, IdentitySide.a.f432994a, objF3);
                        i12 |= 4;
                        break;
                    case 3:
                        objF4 = cVarC.f(f412706c, 3, new C43401f(V0.f412822a), objF4);
                        i12 |= 8;
                        break;
                    case 4:
                        objF5 = cVarC.f(f412706c, 4, new C43401f(V0.f412822a), objF5);
                        i12 |= 16;
                        break;
                    case 5:
                        objF6 = cVarC.f(f412706c, 5, new C43401f(e.a.f433213a), objF6);
                        i12 |= 32;
                        break;
                    case 6:
                        objF7 = cVarC.f(f412706c, 6, V0.f412822a, objF7);
                        i12 |= 64;
                        break;
                    default:
                        throw new UnknownFieldException(iJ2);
                }
            }
            cVarC.d(f412706c);
            return new k(i12, (String) objF, (String) objF2, (IdentitySide) objF3, (List) objF4, (List) objF5, (List) objF6, (String) objF7, (P0) null);
        }

        @Override // kotlinx.serialization.internal.N
        @Y61.k
        public KSerializer<?>[] childSerializers() {
            V0 v02 = V0.f412822a;
            return new KSerializer[]{L51.a.a(v02), L51.a.a(v02), L51.a.a(IdentitySide.a.f432994a), L51.a.a(new C43401f(v02)), L51.a.a(new C43401f(v02)), L51.a.a(new C43401f(e.a.f433213a)), L51.a.a(v02)};
        }

        @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
        @Y61.k
        /* renamed from: getDescriptor */
        public SerialDescriptor getF332717a() {
            return f433272b;
        }

        @Override // kotlinx.serialization.internal.N
        @Y61.k
        public KSerializer<?>[] typeParametersSerializers() {
            return G0.f412773a;
        }

        @Override // kotlinx.serialization.x
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void serialize(@Y61.k Encoder encoder, @Y61.k k value) {
            SerialDescriptor f412706c = getF332717a();
            kotlinx.serialization.encoding.d dVarC = encoder.c(f412706c);
            k.a(value, dVarC, f412706c);
            dVarC.d(f412706c);
        }
    }

    /* compiled from: RemoteIdDoc.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lru/cyberity/cbr/core/data/model/remote/k$b;", "", "Lkotlinx/serialization/KSerializer;", "Lru/cyberity/cbr/core/data/model/remote/k;", "serializer", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: ru.cyberity.cbr.core.data.model.remote.k$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @Y61.k
        public final KSerializer<k> serializer() {
            return a.f433271a;
        }

        private Companion() {
        }
    }

    public k() {
        this((String) null, (String) null, (IdentitySide) null, (List) null, (List) null, (List) null, (String) null, 127, (C42822w) null);
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final String getIdDocType() {
        return this.idDocType;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final IdentitySide getIdDocSubType() {
        return this.idDocSubType;
    }

    @Y61.l
    public final List<String> d() {
        return this.warnings;
    }

    @Y61.l
    public final List<String> e() {
        return this.errors;
    }

    public boolean equals(@Y61.l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof k)) {
            return false;
        }
        k kVar = (k) other;
        return L.f(this.idDocType, kVar.idDocType) && L.f(this.country, kVar.country) && this.idDocSubType == kVar.idDocSubType && L.f(this.warnings, kVar.warnings) && L.f(this.errors, kVar.errors) && L.f(this.metadata, kVar.metadata) && L.f(this.imageId, kVar.imageId);
    }

    @Y61.l
    public final List<e> f() {
        return this.metadata;
    }

    @Y61.l
    /* renamed from: g, reason: from getter */
    public final String getImageId() {
        return this.imageId;
    }

    @Y61.l
    public final String h() {
        return this.country;
    }

    public int hashCode() {
        String str = this.idDocType;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.country;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        IdentitySide identitySide = this.idDocSubType;
        int iHashCode3 = (iHashCode2 + (identitySide == null ? 0 : identitySide.hashCode())) * 31;
        List<String> list = this.warnings;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.errors;
        int iHashCode5 = (iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<e> list3 = this.metadata;
        int iHashCode6 = (iHashCode5 + (list3 == null ? 0 : list3.hashCode())) * 31;
        String str3 = this.imageId;
        return iHashCode6 + (str3 != null ? str3.hashCode() : 0);
    }

    @Y61.l
    public final List<String> j() {
        return this.errors;
    }

    public final boolean l() {
        List<String> list = this.errors;
        boolean z12 = list == null || list.isEmpty();
        List<String> list2 = this.warnings;
        return !(z12 & (list2 == null || list2.isEmpty()));
    }

    @Y61.l
    public final IdentitySide m() {
        return this.idDocSubType;
    }

    @Y61.l
    public final String o() {
        return this.idDocType;
    }

    @Y61.l
    public final String q() {
        return this.imageId;
    }

    @Y61.l
    public final List<e> s() {
        return this.metadata;
    }

    @Y61.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("RemoteIdDoc(idDocType=");
        sb2.append(this.idDocType);
        sb2.append(", country=");
        sb2.append(this.country);
        sb2.append(", idDocSubType=");
        sb2.append(this.idDocSubType);
        sb2.append(", warnings=");
        sb2.append(this.warnings);
        sb2.append(", errors=");
        sb2.append(this.errors);
        sb2.append(", metadata=");
        sb2.append(this.metadata);
        sb2.append(", imageId=");
        return C22026a.c(sb2, this.imageId, ')');
    }

    @Y61.l
    public final List<String> u() {
        return this.warnings;
    }

    public final boolean w() {
        List<String> list = this.errors;
        return !(list == null || list.isEmpty());
    }

    @InterfaceC42830m
    public /* synthetic */ k(int i12, @v String str, @v String str2, @v IdentitySide identitySide, @v List list, @v List list2, @v List list3, @v String str3, P0 p02) {
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
        if ((i12 & 4) == 0) {
            this.idDocSubType = null;
        } else {
            this.idDocSubType = identitySide;
        }
        if ((i12 & 8) == 0) {
            this.warnings = null;
        } else {
            this.warnings = list;
        }
        if ((i12 & 16) == 0) {
            this.errors = null;
        } else {
            this.errors = list2;
        }
        if ((i12 & 32) == 0) {
            this.metadata = null;
        } else {
            this.metadata = list3;
        }
        if ((i12 & 64) == 0) {
            this.imageId = null;
        } else {
            this.imageId = str3;
        }
    }

    @Y61.k
    public final k a(@Y61.l String idDocType, @Y61.l String country, @Y61.l IdentitySide idDocSubType, @Y61.l List<String> warnings, @Y61.l List<String> errors, @Y61.l List<e> metadata, @Y61.l String imageId) {
        return new k(idDocType, country, idDocSubType, warnings, errors, metadata, imageId);
    }

    public k(@Y61.l String str, @Y61.l String str2, @Y61.l IdentitySide identitySide, @Y61.l List<String> list, @Y61.l List<String> list2, @Y61.l List<e> list3, @Y61.l String str3) {
        this.idDocType = str;
        this.country = str2;
        this.idDocSubType = identitySide;
        this.warnings = list;
        this.errors = list2;
        this.metadata = list3;
        this.imageId = str3;
    }

    public static /* synthetic */ k a(k kVar, String str, String str2, IdentitySide identitySide, List list, List list2, List list3, String str3, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = kVar.idDocType;
        }
        if ((i12 & 2) != 0) {
            str2 = kVar.country;
        }
        String str4 = str2;
        if ((i12 & 4) != 0) {
            identitySide = kVar.idDocSubType;
        }
        IdentitySide identitySide2 = identitySide;
        if ((i12 & 8) != 0) {
            list = kVar.warnings;
        }
        List list4 = list;
        if ((i12 & 16) != 0) {
            list2 = kVar.errors;
        }
        List list5 = list2;
        if ((i12 & 32) != 0) {
            list3 = kVar.metadata;
        }
        List list6 = list3;
        if ((i12 & 64) != 0) {
            str3 = kVar.imageId;
        }
        return kVar.a(str, str4, identitySide2, list4, list5, list6, str3);
    }

    @X41.n
    public static final void a(@Y61.k k self, @Y61.k kotlinx.serialization.encoding.d output, @Y61.k SerialDescriptor serialDesc) {
        if (output.u() || self.idDocType != null) {
            output.p(serialDesc, 0, V0.f412822a, self.idDocType);
        }
        if (output.u() || self.country != null) {
            output.p(serialDesc, 1, V0.f412822a, self.country);
        }
        if (output.u() || self.idDocSubType != null) {
            output.p(serialDesc, 2, IdentitySide.a.f432994a, self.idDocSubType);
        }
        if (output.u() || self.warnings != null) {
            output.p(serialDesc, 3, new C43401f(V0.f412822a), self.warnings);
        }
        if (output.u() || self.errors != null) {
            output.p(serialDesc, 4, new C43401f(V0.f412822a), self.errors);
        }
        if (output.u() || self.metadata != null) {
            output.p(serialDesc, 5, new C43401f(e.a.f433213a), self.metadata);
        }
        if (!output.u() && self.imageId == null) {
            return;
        }
        output.p(serialDesc, 6, V0.f412822a, self.imageId);
    }

    public final void a(@Y61.l String str) {
        this.imageId = str;
    }

    public /* synthetic */ k(String str, String str2, IdentitySide identitySide, List list, List list2, List list3, String str3, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : identitySide, (i12 & 8) != 0 ? null : list, (i12 & 16) != 0 ? null : list2, (i12 & 32) != 0 ? null : list3, (i12 & 64) != 0 ? null : str3);
    }

    @v
    public static /* synthetic */ void i() {
    }

    @v
    public static /* synthetic */ void k() {
    }

    @v
    public static /* synthetic */ void n() {
    }

    @v
    public static /* synthetic */ void p() {
    }

    @v
    public static /* synthetic */ void r() {
    }

    @v
    public static /* synthetic */ void t() {
    }

    @v
    public static /* synthetic */ void v() {
    }
}
