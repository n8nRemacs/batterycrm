package ru.cyberity.cbr.core.data.model.remote.response;

import X41.n;
import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.E0;
import kotlinx.serialization.internal.G0;
import kotlinx.serialization.internal.N;
import kotlinx.serialization.internal.P0;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.V0;
import kotlinx.serialization.v;
import kotlinx.serialization.w;

/* compiled from: StringResourcesResponse.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0003\u0014\u0017\u0018B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB?\b\u0017\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ(\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011HÇ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J.\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0016J\u0010\u0010\u001c\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010\"\u0012\u0004\b$\u0010%\u001a\u0004\b#\u0010\u0016R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010\"\u0012\u0004\b'\u0010%\u001a\u0004\b&\u0010\u0016R \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010(\u0012\u0004\b*\u0010%\u001a\u0004\b)\u0010\u0019¨\u0006,"}, d2 = {"Lru/cyberity/cbr/core/data/model/remote/response/g;", "", "", "type", "lang", "Lru/cyberity/cbr/core/data/model/remote/response/g$c;", "conf", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/cyberity/cbr/core/data/model/remote/response/g$c;)V", "", "seen1", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lru/cyberity/cbr/core/data/model/remote/response/g$c;Lkotlinx/serialization/internal/P0;)V", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lkotlin/G0;", "a", "(Lru/cyberity/cbr/core/data/model/remote/response/g;Lkotlinx/serialization/encoding/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "()Ljava/lang/String;", "b", "c", "()Lru/cyberity/cbr/core/data/model/remote/response/g$c;", "(Ljava/lang/String;Ljava/lang/String;Lru/cyberity/cbr/core/data/model/remote/response/g$c;)Lru/cyberity/cbr/core/data/model/remote/response/g;", "toString", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "h", "getType$annotations", "()V", "f", "getLang$annotations", "Lru/cyberity/cbr/core/data/model/remote/response/g$c;", "d", "getConf$annotations", "Companion", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
@w
/* loaded from: classes9.dex */
public final /* data */ class g {

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @k
    private final String type;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @k
    private final String lang;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @k
    private final c conf;

    /* compiled from: StringResourcesResponse.kt */
    @Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000b\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"ru/cyberity/cbr/core/data/model/remote/response/StringResourcesResponse.$serializer", "Lkotlinx/serialization/internal/N;", "Lru/cyberity/cbr/core/data/model/remote/response/g;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "a", "(Lkotlinx/serialization/encoding/Decoder;)Lru/cyberity/cbr/core/data/model/remote/response/g;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlin/G0;", "(Lkotlinx/serialization/encoding/Encoder;Lru/cyberity/cbr/core/data/model/remote/response/g;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    @InterfaceC42830m
    public static final class a implements N<g> {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f433394a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ SerialDescriptor f433395b;

        static {
            a aVar = new a();
            f433394a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.cyberity.cbr.core.data.model.remote.response.StringResourcesResponse", aVar, 3);
            pluginGeneratedSerialDescriptor.j("type", false);
            pluginGeneratedSerialDescriptor.j("lang", false);
            pluginGeneratedSerialDescriptor.j("conf", false);
            f433395b = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // kotlinx.serialization.InterfaceC43386e
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public g deserialize(@k Decoder decoder) {
            SerialDescriptor f332717a = getF332717a();
            kotlinx.serialization.encoding.c cVarC = decoder.c(f332717a);
            Object objV = null;
            boolean z12 = true;
            int i12 = 0;
            String strS = null;
            String strS2 = null;
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
                } else {
                    if (iJ2 != 2) {
                        throw new UnknownFieldException(iJ2);
                    }
                    objV = cVarC.v(f332717a, 2, c.a.f433398a, objV);
                    i12 |= 4;
                }
            }
            cVarC.d(f332717a);
            return new g(i12, strS, strS2, (c) objV, null);
        }

        @Override // kotlinx.serialization.internal.N
        @k
        public KSerializer<?>[] childSerializers() {
            V0 v02 = V0.f412822a;
            return new KSerializer[]{v02, v02, c.a.f433398a};
        }

        @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
        @k
        /* renamed from: getDescriptor */
        public SerialDescriptor getF332717a() {
            return f433395b;
        }

        @Override // kotlinx.serialization.internal.N
        @k
        public KSerializer<?>[] typeParametersSerializers() {
            return G0.f412773a;
        }

        @Override // kotlinx.serialization.x
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void serialize(@k Encoder encoder, @k g value) {
            SerialDescriptor f332717a = getF332717a();
            kotlinx.serialization.encoding.d dVarC = encoder.c(f332717a);
            g.a(value, dVarC, f332717a);
            dVarC.d(f332717a);
        }
    }

    /* compiled from: StringResourcesResponse.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lru/cyberity/cbr/core/data/model/remote/response/g$b;", "", "Lkotlinx/serialization/KSerializer;", "Lru/cyberity/cbr/core/data/model/remote/response/g;", "serializer", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: ru.cyberity.cbr.core.data.model.remote.response.g$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @k
        public final KSerializer<g> serializer() {
            return a.f433394a;
        }

        private Companion() {
        }
    }

    /* compiled from: StringResourcesResponse.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002\u0012\u0015B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B3\b\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ(\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fHÇ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J$\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0014J\u0010\u0010\u0018\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u001e\u0012\u0004\b \u0010!\u001a\u0004\b\u001f\u0010\u0014R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010\u001e\u0012\u0004\b#\u0010!\u001a\u0004\b\"\u0010\u0014¨\u0006%"}, d2 = {"Lru/cyberity/cbr/core/data/model/remote/response/g$c;", "", "", "gtc", "pp", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen1", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/P0;)V", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lkotlin/G0;", "a", "(Lru/cyberity/cbr/core/data/model/remote/response/g$c;Lkotlinx/serialization/encoding/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "()Ljava/lang/String;", "b", "(Ljava/lang/String;Ljava/lang/String;)Lru/cyberity/cbr/core/data/model/remote/response/g$c;", "toString", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "c", "getGtc$annotations", "()V", "e", "getPp$annotations", "Companion", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    @w
    public static final /* data */ class c {

        /* renamed from: Companion, reason: from kotlin metadata */
        @k
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @k
        private final String gtc;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @k
        private final String pp;

        /* compiled from: StringResourcesResponse.kt */
        @Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000b\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"ru/cyberity/cbr/core/data/model/remote/response/StringResourcesResponse.Conf.$serializer", "Lkotlinx/serialization/internal/N;", "Lru/cyberity/cbr/core/data/model/remote/response/g$c;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "a", "(Lkotlinx/serialization/encoding/Decoder;)Lru/cyberity/cbr/core/data/model/remote/response/g$c;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlin/G0;", "(Lkotlinx/serialization/encoding/Encoder;Lru/cyberity/cbr/core/data/model/remote/response/g$c;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
        @InterfaceC42830m
        public static final class a implements N<c> {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final a f433398a;

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ SerialDescriptor f433399b;

            static {
                a aVar = new a();
                f433398a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.cyberity.cbr.core.data.model.remote.response.StringResourcesResponse.Conf", aVar, 2);
                pluginGeneratedSerialDescriptor.j("gtc", false);
                pluginGeneratedSerialDescriptor.j("pp", false);
                f433399b = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            @Override // kotlinx.serialization.InterfaceC43386e
            @k
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public c deserialize(@k Decoder decoder) {
                SerialDescriptor f332717a = getF332717a();
                kotlinx.serialization.encoding.c cVarC = decoder.c(f332717a);
                P0 p02 = null;
                boolean z12 = true;
                int i12 = 0;
                String strS = null;
                String strS2 = null;
                while (z12) {
                    int iJ2 = cVarC.j(f332717a);
                    if (iJ2 == -1) {
                        z12 = false;
                    } else if (iJ2 == 0) {
                        strS = cVarC.s(f332717a, 0);
                        i12 |= 1;
                    } else {
                        if (iJ2 != 1) {
                            throw new UnknownFieldException(iJ2);
                        }
                        strS2 = cVarC.s(f332717a, 1);
                        i12 |= 2;
                    }
                }
                cVarC.d(f332717a);
                return new c(i12, strS, strS2, p02);
            }

            @Override // kotlinx.serialization.internal.N
            @k
            public KSerializer<?>[] childSerializers() {
                V0 v02 = V0.f412822a;
                return new KSerializer[]{v02, v02};
            }

            @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
            @k
            /* renamed from: getDescriptor */
            public SerialDescriptor getF332717a() {
                return f433399b;
            }

            @Override // kotlinx.serialization.internal.N
            @k
            public KSerializer<?>[] typeParametersSerializers() {
                return G0.f412773a;
            }

            @Override // kotlinx.serialization.x
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public void serialize(@k Encoder encoder, @k c value) {
                SerialDescriptor f332717a = getF332717a();
                kotlinx.serialization.encoding.d dVarC = encoder.c(f332717a);
                c.a(value, dVarC, f332717a);
                dVarC.d(f332717a);
            }
        }

        /* compiled from: StringResourcesResponse.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lru/cyberity/cbr/core/data/model/remote/response/g$c$b;", "", "Lkotlinx/serialization/KSerializer;", "Lru/cyberity/cbr/core/data/model/remote/response/g$c;", "serializer", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
        /* renamed from: ru.cyberity.cbr.core.data.model.remote.response.g$c$b, reason: from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(C42822w c42822w) {
                this();
            }

            @k
            public final KSerializer<c> serializer() {
                return a.f433398a;
            }

            private Companion() {
            }
        }

        @InterfaceC42830m
        public /* synthetic */ c(int i12, @v String str, @v String str2, P0 p02) {
            if (3 != (i12 & 3)) {
                E0.b(i12, 3, a.f433398a.getF332717a());
                throw null;
            }
            this.gtc = str;
            this.pp = str2;
        }

        @k
        /* renamed from: a, reason: from getter */
        public final String getGtc() {
            return this.gtc;
        }

        @k
        /* renamed from: b, reason: from getter */
        public final String getPp() {
            return this.pp;
        }

        @k
        public final String c() {
            return this.gtc;
        }

        @k
        public final String e() {
            return this.pp;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return L.f(this.gtc, cVar.gtc) && L.f(this.pp, cVar.pp);
        }

        public int hashCode() {
            return this.pp.hashCode() + (this.gtc.hashCode() * 31);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Conf(gtc=");
            sb2.append(this.gtc);
            sb2.append(", pp=");
            return C22026a.c(sb2, this.pp, ')');
        }

        public c(@k String str, @k String str2) {
            this.gtc = str;
            this.pp = str2;
        }

        @k
        public final c a(@k String gtc, @k String pp2) {
            return new c(gtc, pp2);
        }

        public static /* synthetic */ c a(c cVar, String str, String str2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = cVar.gtc;
            }
            if ((i12 & 2) != 0) {
                str2 = cVar.pp;
            }
            return cVar.a(str, str2);
        }

        @n
        public static final void a(@k c self, @k kotlinx.serialization.encoding.d output, @k SerialDescriptor serialDesc) {
            output.l(serialDesc, 0, self.gtc);
            output.l(serialDesc, 1, self.pp);
        }

        @v
        public static /* synthetic */ void d() {
        }

        @v
        public static /* synthetic */ void f() {
        }
    }

    @InterfaceC42830m
    public /* synthetic */ g(int i12, @v String str, @v String str2, @v c cVar, P0 p02) {
        if (7 != (i12 & 7)) {
            E0.b(i12, 7, a.f433394a.getF332717a());
            throw null;
        }
        this.type = str;
        this.lang = str2;
        this.conf = cVar;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final String getLang() {
        return this.lang;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final c getConf() {
        return this.conf;
    }

    @k
    public final c d() {
        return this.conf;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof g)) {
            return false;
        }
        g gVar = (g) other;
        return L.f(this.type, gVar.type) && L.f(this.lang, gVar.lang) && L.f(this.conf, gVar.conf);
    }

    @k
    public final String f() {
        return this.lang;
    }

    @k
    public final String h() {
        return this.type;
    }

    public int hashCode() {
        return this.conf.hashCode() + H.d(this.type.hashCode() * 31, 31, this.lang);
    }

    @k
    public String toString() {
        return "StringResourcesResponse(type=" + this.type + ", lang=" + this.lang + ", conf=" + this.conf + ')';
    }

    public g(@k String str, @k String str2, @k c cVar) {
        this.type = str;
        this.lang = str2;
        this.conf = cVar;
    }

    @k
    public final g a(@k String type, @k String lang, @k c conf) {
        return new g(type, lang, conf);
    }

    public static /* synthetic */ g a(g gVar, String str, String str2, c cVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = gVar.type;
        }
        if ((i12 & 2) != 0) {
            str2 = gVar.lang;
        }
        if ((i12 & 4) != 0) {
            cVar = gVar.conf;
        }
        return gVar.a(str, str2, cVar);
    }

    @n
    public static final void a(@k g self, @k kotlinx.serialization.encoding.d output, @k SerialDescriptor serialDesc) {
        output.l(serialDesc, 0, self.type);
        output.l(serialDesc, 1, self.lang);
        output.F(serialDesc, 2, c.a.f433398a, self.conf);
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
