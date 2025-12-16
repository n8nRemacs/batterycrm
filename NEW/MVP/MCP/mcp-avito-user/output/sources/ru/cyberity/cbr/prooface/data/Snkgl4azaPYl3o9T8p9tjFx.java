package ru.cyberity.cbr.prooface.data;

import L51.a;
import X41.n;
import Y61.k;
import Y61.l;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.c;
import kotlinx.serialization.encoding.d;
import kotlinx.serialization.internal.C43407i;
import kotlinx.serialization.internal.G0;
import kotlinx.serialization.internal.N;
import kotlinx.serialization.internal.P0;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.V0;
import kotlinx.serialization.internal.Y;
import kotlinx.serialization.v;
import kotlinx.serialization.w;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0007\u0018\u0000 ,2\u00020\u0001:\u0002-.BO\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fBc\b\u0017\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000b\u0010\u0010J(\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014HÇ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010\u0019\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001bR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010\u0019\u0012\u0004\b \u0010\u001d\u001a\u0004\b\u001f\u0010\u001bR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b!\u0010\"\u0012\u0004\b$\u0010\u001d\u001a\u0004\b!\u0010#R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010\u0019\u0012\u0004\b%\u0010\u001d\u001a\u0004\b\u001e\u0010\u001bR\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b&\u0010'\u0012\u0004\b)\u0010\u001d\u001a\u0004\b\u0017\u0010(R\"\u0010\n\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b*\u0010'\u0012\u0004\b+\u0010\u001d\u001a\u0004\b&\u0010(¨\u0006/"}, d2 = {"Lru/cyberity/cbr/prooface/data/Snkgl4azaPYl3o9T8p9tjFx;", "", "", "sessionId", "sessionKey", "", "requiredFragments", "answer", "", "allowContinuing", "skipCalibration", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "seen1", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lkotlinx/serialization/internal/P0;)V", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lkotlin/G0;", "AnZ4ntgRZiVOQFYAd", "(Lru/cyberity/cbr/prooface/data/Snkgl4azaPYl3o9T8p9tjFx;Lkotlinx/serialization/encoding/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getSessionId", "()Ljava/lang/String;", "getSessionId$annotations", "()V", "uz93gWN1OYgIQ", "MyHc7quGyJKbnAIkFgd", "getSessionKey$annotations", "peujtyiBSfZOKD0yphJi2", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "getRequiredFragments$annotations", "getAnswer$annotations", "U4mhkUewPl2fPUTo32", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "getAllowContinuing$annotations", "E9gFqwO2FE5yBJACCUilu8lqyiR", "getSkipCalibration$annotations", "Companion", "VEkdd97RzWe", "ar2zdFahlgqFwCDaNcK2mMj8NV2W", "cyberity-mobile-sdk-prooface_release"}, k = 1, mv = {1, 7, 1})
@w
/* loaded from: classes9.dex */
public final class Snkgl4azaPYl3o9T8p9tjFx {

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: AnZ4ntgRZiVOQFYAd, reason: from kotlin metadata */
    @l
    private final String sessionId;

    /* renamed from: E9gFqwO2FE5yBJACCUilu8lqyiR, reason: from kotlin metadata */
    @l
    private final Boolean skipCalibration;

    /* renamed from: MyHc7quGyJKbnAIkFgd, reason: from kotlin metadata */
    @l
    private final String answer;

    /* renamed from: U4mhkUewPl2fPUTo32, reason: from kotlin metadata */
    @l
    private final Boolean allowContinuing;

    /* renamed from: peujtyiBSfZOKD0yphJi2, reason: from kotlin metadata */
    @l
    private final Integer requiredFragments;

    /* renamed from: uz93gWN1OYgIQ, reason: from kotlin metadata */
    @l
    private final String sessionKey;

    @Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000b\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"ru/cyberity/cbr/prooface/data/LivenessSession.$serializer", "Lkotlinx/serialization/internal/N;", "Lru/cyberity/cbr/prooface/data/Snkgl4azaPYl3o9T8p9tjFx;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "AnZ4ntgRZiVOQFYAd", "(Lkotlinx/serialization/encoding/Decoder;)Lru/cyberity/cbr/prooface/data/Snkgl4azaPYl3o9T8p9tjFx;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlin/G0;", "(Lkotlinx/serialization/encoding/Encoder;Lru/cyberity/cbr/prooface/data/Snkgl4azaPYl3o9T8p9tjFx;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "cyberity-mobile-sdk-prooface_release"}, k = 1, mv = {1, 7, 1})
    @InterfaceC42830m
    public static final class VEkdd97RzWe implements N<Snkgl4azaPYl3o9T8p9tjFx> {

        @k
        public static final VEkdd97RzWe AnZ4ntgRZiVOQFYAd;
        public static final /* synthetic */ SerialDescriptor uz93gWN1OYgIQ;

        static {
            VEkdd97RzWe vEkdd97RzWe = new VEkdd97RzWe();
            AnZ4ntgRZiVOQFYAd = vEkdd97RzWe;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.cyberity.cbr.prooface.data.LivenessSession", vEkdd97RzWe, 6);
            pluginGeneratedSerialDescriptor.j("sessionId", true);
            pluginGeneratedSerialDescriptor.j("sessionKey", true);
            pluginGeneratedSerialDescriptor.j("requiredFragments", true);
            pluginGeneratedSerialDescriptor.j("answer", true);
            pluginGeneratedSerialDescriptor.j("allowContinuing", true);
            pluginGeneratedSerialDescriptor.j("skipCalibration", true);
            uz93gWN1OYgIQ = pluginGeneratedSerialDescriptor;
        }

        private VEkdd97RzWe() {
        }

        @Override // kotlinx.serialization.InterfaceC43386e
        @k
        /* renamed from: AnZ4ntgRZiVOQFYAd, reason: merged with bridge method [inline-methods] */
        public Snkgl4azaPYl3o9T8p9tjFx deserialize(@k Decoder decoder) {
            SerialDescriptor f412706c = getF412706c();
            c cVarC = decoder.c(f412706c);
            Object objF = null;
            boolean z12 = true;
            int i12 = 0;
            Object objF2 = null;
            Object objF3 = null;
            Object objF4 = null;
            Object objF5 = null;
            Object objF6 = null;
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
                        objF3 = cVarC.f(f412706c, 2, Y.f412835a, objF3);
                        i12 |= 4;
                        break;
                    case 3:
                        objF4 = cVarC.f(f412706c, 3, V0.f412822a, objF4);
                        i12 |= 8;
                        break;
                    case 4:
                        objF5 = cVarC.f(f412706c, 4, C43407i.f412866a, objF5);
                        i12 |= 16;
                        break;
                    case 5:
                        objF6 = cVarC.f(f412706c, 5, C43407i.f412866a, objF6);
                        i12 |= 32;
                        break;
                    default:
                        throw new UnknownFieldException(iJ2);
                }
            }
            cVarC.d(f412706c);
            return new Snkgl4azaPYl3o9T8p9tjFx(i12, (String) objF, (String) objF2, (Integer) objF3, (String) objF4, (Boolean) objF5, (Boolean) objF6, (P0) null);
        }

        @Override // kotlinx.serialization.internal.N
        @k
        public KSerializer<?>[] childSerializers() {
            V0 v02 = V0.f412822a;
            KSerializer<?> kSerializerA = a.a(v02);
            KSerializer<?> kSerializerA2 = a.a(v02);
            KSerializer<?> kSerializerA3 = a.a(Y.f412835a);
            KSerializer<?> kSerializerA4 = a.a(v02);
            C43407i c43407i = C43407i.f412866a;
            return new KSerializer[]{kSerializerA, kSerializerA2, kSerializerA3, kSerializerA4, a.a(c43407i), a.a(c43407i)};
        }

        @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
        @k
        /* renamed from: getDescriptor */
        public SerialDescriptor getF412706c() {
            return uz93gWN1OYgIQ;
        }

        @Override // kotlinx.serialization.internal.N
        @k
        public KSerializer<?>[] typeParametersSerializers() {
            return G0.f412773a;
        }

        @Override // kotlinx.serialization.x
        /* renamed from: AnZ4ntgRZiVOQFYAd, reason: merged with bridge method [inline-methods] */
        public void serialize(@k Encoder encoder, @k Snkgl4azaPYl3o9T8p9tjFx value) {
            SerialDescriptor f412706c = getF412706c();
            d dVarC = encoder.c(f412706c);
            Snkgl4azaPYl3o9T8p9tjFx.AnZ4ntgRZiVOQFYAd(value, dVarC, f412706c);
            dVarC.d(f412706c);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lru/cyberity/cbr/prooface/data/Snkgl4azaPYl3o9T8p9tjFx$ar2zdFahlgqFwCDaNcK2mMj8NV2W;", "", "Lkotlinx/serialization/KSerializer;", "Lru/cyberity/cbr/prooface/data/Snkgl4azaPYl3o9T8p9tjFx;", "serializer", "<init>", "()V", "cyberity-mobile-sdk-prooface_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: ru.cyberity.cbr.prooface.data.Snkgl4azaPYl3o9T8p9tjFx$ar2zdFahlgqFwCDaNcK2mMj8NV2W, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @k
        public final KSerializer<Snkgl4azaPYl3o9T8p9tjFx> serializer() {
            return VEkdd97RzWe.AnZ4ntgRZiVOQFYAd;
        }

        private Companion() {
        }
    }

    public Snkgl4azaPYl3o9T8p9tjFx() {
        this((String) null, (String) null, (Integer) null, (String) null, (Boolean) null, (Boolean) null, 63, (C42822w) null);
    }

    @n
    public static final void AnZ4ntgRZiVOQFYAd(@k Snkgl4azaPYl3o9T8p9tjFx self, @k d output, @k SerialDescriptor serialDesc) {
        if (output.u() || self.sessionId != null) {
            output.p(serialDesc, 0, V0.f412822a, self.sessionId);
        }
        if (output.u() || self.sessionKey != null) {
            output.p(serialDesc, 1, V0.f412822a, self.sessionKey);
        }
        if (output.u() || self.requiredFragments != null) {
            output.p(serialDesc, 2, Y.f412835a, self.requiredFragments);
        }
        if (output.u() || self.answer != null) {
            output.p(serialDesc, 3, V0.f412822a, self.answer);
        }
        if (output.u() || self.allowContinuing != null) {
            output.p(serialDesc, 4, C43407i.f412866a, self.allowContinuing);
        }
        if (!output.u() && self.skipCalibration == null) {
            return;
        }
        output.p(serialDesc, 5, C43407i.f412866a, self.skipCalibration);
    }

    @l
    /* renamed from: MyHc7quGyJKbnAIkFgd, reason: from getter */
    public final String getSessionKey() {
        return this.sessionKey;
    }

    @l
    /* renamed from: U4mhkUewPl2fPUTo32, reason: from getter */
    public final Boolean getSkipCalibration() {
        return this.skipCalibration;
    }

    @l
    /* renamed from: peujtyiBSfZOKD0yphJi2, reason: from getter */
    public final Integer getRequiredFragments() {
        return this.requiredFragments;
    }

    @l
    /* renamed from: uz93gWN1OYgIQ, reason: from getter */
    public final String getAnswer() {
        return this.answer;
    }

    @InterfaceC42830m
    public /* synthetic */ Snkgl4azaPYl3o9T8p9tjFx(int i12, @v String str, @v String str2, @v Integer num, @v String str3, @v Boolean bool, @v Boolean bool2, P0 p02) {
        if ((i12 & 1) == 0) {
            this.sessionId = null;
        } else {
            this.sessionId = str;
        }
        if ((i12 & 2) == 0) {
            this.sessionKey = null;
        } else {
            this.sessionKey = str2;
        }
        if ((i12 & 4) == 0) {
            this.requiredFragments = null;
        } else {
            this.requiredFragments = num;
        }
        if ((i12 & 8) == 0) {
            this.answer = null;
        } else {
            this.answer = str3;
        }
        if ((i12 & 16) == 0) {
            this.allowContinuing = null;
        } else {
            this.allowContinuing = bool;
        }
        if ((i12 & 32) == 0) {
            this.skipCalibration = null;
        } else {
            this.skipCalibration = bool2;
        }
    }

    @l
    /* renamed from: AnZ4ntgRZiVOQFYAd, reason: from getter */
    public final Boolean getAllowContinuing() {
        return this.allowContinuing;
    }

    public Snkgl4azaPYl3o9T8p9tjFx(@l String str, @l String str2, @l Integer num, @l String str3, @l Boolean bool, @l Boolean bool2) {
        this.sessionId = str;
        this.sessionKey = str2;
        this.requiredFragments = num;
        this.answer = str3;
        this.allowContinuing = bool;
        this.skipCalibration = bool2;
    }

    public /* synthetic */ Snkgl4azaPYl3o9T8p9tjFx(String str, String str2, Integer num, String str3, Boolean bool, Boolean bool2, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : num, (i12 & 8) != 0 ? null : str3, (i12 & 16) != 0 ? null : bool, (i12 & 32) != 0 ? null : bool2);
    }
}
