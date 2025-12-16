package ru.cyberity.cbr.core.data.model;

import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.G0;
import kotlinx.serialization.internal.N;
import kotlinx.serialization.internal.P0;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.V0;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.v;
import kotlinx.serialization.w;

/* compiled from: CBRMessage.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0003\u0018\u0000 \u001f2\u00020\u0001:\u0002\u0013\u001aB\u0007¢\u0006\u0004\b\u0002\u0010\u0003B3\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0002\u0010\fJ(\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÇ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R(\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0013\u0010\u0015\u0012\u0004\b\u0019\u0010\u0003\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0013\u0010\u0018R*\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u001a\u0010\u001b\u0012\u0004\b\u001e\u0010\u0003\u001a\u0004\b\u0013\u0010\u001c\"\u0004\b\u0013\u0010\u001d¨\u0006 "}, d2 = {"Lru/cyberity/cbr/core/data/model/m;", "", "<init>", "()V", "", "seen1", "", "type", "Lkotlinx/serialization/json/JsonElement;", "payload", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "(ILjava/lang/String;Lkotlinx/serialization/json/JsonElement;Lkotlinx/serialization/internal/P0;)V", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lkotlin/G0;", "a", "(Lru/cyberity/cbr/core/data/model/m;Lkotlinx/serialization/encoding/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "(Ljava/lang/String;)V", "getType$annotations", "b", "Lkotlinx/serialization/json/JsonElement;", "()Lkotlinx/serialization/json/JsonElement;", "(Lkotlinx/serialization/json/JsonElement;)V", "getPayload$annotations", "Companion", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
@w
/* loaded from: classes9.dex */
final class m {

    /* renamed from: Companion, reason: from kotlin metadata */
    @Y61.k
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private String type;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private JsonElement payload;

    /* compiled from: CBRMessage.kt */
    @Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000b\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"ru/cyberity/cbr/core/data/model/CBRMessageModel.$serializer", "Lkotlinx/serialization/internal/N;", "Lru/cyberity/cbr/core/data/model/m;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "a", "(Lkotlinx/serialization/encoding/Decoder;)Lru/cyberity/cbr/core/data/model/m;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlin/G0;", "(Lkotlinx/serialization/encoding/Encoder;Lru/cyberity/cbr/core/data/model/m;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    @InterfaceC42830m
    public static final class a implements N<m> {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final a f433152a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ SerialDescriptor f433153b;

        static {
            a aVar = new a();
            f433152a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.cyberity.cbr.core.data.model.CBRMessageModel", aVar, 2);
            pluginGeneratedSerialDescriptor.j("type", true);
            pluginGeneratedSerialDescriptor.j("payload", true);
            f433153b = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // kotlinx.serialization.InterfaceC43386e
        @Y61.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public m deserialize(@Y61.k Decoder decoder) {
            SerialDescriptor f332717a = getF332717a();
            kotlinx.serialization.encoding.c cVarC = decoder.c(f332717a);
            P0 p02 = null;
            boolean z12 = true;
            int i12 = 0;
            String strS = null;
            Object objF = null;
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
                    objF = cVarC.f(f332717a, 1, kotlinx.serialization.json.q.f413138a, objF);
                    i12 |= 2;
                }
            }
            cVarC.d(f332717a);
            return new m(i12, strS, (JsonElement) objF, p02);
        }

        @Override // kotlinx.serialization.internal.N
        @Y61.k
        public KSerializer<?>[] childSerializers() {
            return new KSerializer[]{V0.f412822a, L51.a.a(kotlinx.serialization.json.q.f413138a)};
        }

        @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
        @Y61.k
        /* renamed from: getDescriptor */
        public SerialDescriptor getF332717a() {
            return f433153b;
        }

        @Override // kotlinx.serialization.internal.N
        @Y61.k
        public KSerializer<?>[] typeParametersSerializers() {
            return G0.f412773a;
        }

        @Override // kotlinx.serialization.x
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void serialize(@Y61.k Encoder encoder, @Y61.k m value) {
            SerialDescriptor f332717a = getF332717a();
            kotlinx.serialization.encoding.d dVarC = encoder.c(f332717a);
            m.a(value, dVarC, f332717a);
            dVarC.d(f332717a);
        }
    }

    /* compiled from: CBRMessage.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lru/cyberity/cbr/core/data/model/m$b;", "", "Lkotlinx/serialization/KSerializer;", "Lru/cyberity/cbr/core/data/model/m;", "serializer", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: ru.cyberity.cbr.core.data.model.m$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @Y61.k
        public final KSerializer<m> serializer() {
            return a.f433152a;
        }

        private Companion() {
        }
    }

    public m() {
        this.type = "";
    }

    @X41.n
    public static final void a(@Y61.k m self, @Y61.k kotlinx.serialization.encoding.d output, @Y61.k SerialDescriptor serialDesc) {
        if (output.u() || !L.f(self.type, "")) {
            output.l(serialDesc, 0, self.type);
        }
        if (!output.u() && self.payload == null) {
            return;
        }
        output.p(serialDesc, 1, kotlinx.serialization.json.q.f413138a, self.payload);
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @InterfaceC42830m
    public /* synthetic */ m(int i12, @v String str, @v JsonElement jsonElement, P0 p02) {
        this.type = (i12 & 1) == 0 ? "" : str;
        if ((i12 & 2) == 0) {
            this.payload = null;
        } else {
            this.payload = jsonElement;
        }
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final JsonElement getPayload() {
        return this.payload;
    }
}
