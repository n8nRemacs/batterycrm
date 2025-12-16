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
import kotlinx.serialization.internal.G0;
import kotlinx.serialization.internal.N;
import kotlinx.serialization.internal.P0;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.V0;
import kotlinx.serialization.v;
import kotlinx.serialization.w;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0002\u0019\u001aB\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B'\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÇ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u0013\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001b"}, d2 = {"Lru/cyberity/cbr/prooface/data/b8k1CqqNgacAsHleVkUzBdlNS;", "", "", "payload", "<init>", "(Ljava/lang/String;)V", "", "seen1", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "(ILjava/lang/String;Lkotlinx/serialization/internal/P0;)V", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lkotlin/G0;", "AnZ4ntgRZiVOQFYAd", "(Lru/cyberity/cbr/prooface/data/b8k1CqqNgacAsHleVkUzBdlNS;Lkotlinx/serialization/encoding/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getPayload", "()Ljava/lang/String;", "getPayload$annotations", "()V", "Companion", "VEkdd97RzWe", "ar2zdFahlgqFwCDaNcK2mMj8NV2W", "cyberity-mobile-sdk-prooface_release"}, k = 1, mv = {1, 7, 1})
@w
/* loaded from: classes9.dex */
public final class b8k1CqqNgacAsHleVkUzBdlNS {

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: AnZ4ntgRZiVOQFYAd, reason: from kotlin metadata */
    @l
    private final String payload;

    @Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000b\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"ru/cyberity/cbr/prooface/data/LivenessFragment.$serializer", "Lkotlinx/serialization/internal/N;", "Lru/cyberity/cbr/prooface/data/b8k1CqqNgacAsHleVkUzBdlNS;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "AnZ4ntgRZiVOQFYAd", "(Lkotlinx/serialization/encoding/Decoder;)Lru/cyberity/cbr/prooface/data/b8k1CqqNgacAsHleVkUzBdlNS;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlin/G0;", "(Lkotlinx/serialization/encoding/Encoder;Lru/cyberity/cbr/prooface/data/b8k1CqqNgacAsHleVkUzBdlNS;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "cyberity-mobile-sdk-prooface_release"}, k = 1, mv = {1, 7, 1})
    @InterfaceC42830m
    public static final class VEkdd97RzWe implements N<b8k1CqqNgacAsHleVkUzBdlNS> {

        @k
        public static final VEkdd97RzWe AnZ4ntgRZiVOQFYAd;
        public static final /* synthetic */ SerialDescriptor uz93gWN1OYgIQ;

        static {
            VEkdd97RzWe vEkdd97RzWe = new VEkdd97RzWe();
            AnZ4ntgRZiVOQFYAd = vEkdd97RzWe;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.cyberity.cbr.prooface.data.LivenessFragment", vEkdd97RzWe, 1);
            pluginGeneratedSerialDescriptor.j("payload", true);
            uz93gWN1OYgIQ = pluginGeneratedSerialDescriptor;
        }

        private VEkdd97RzWe() {
        }

        @Override // kotlinx.serialization.InterfaceC43386e
        @k
        /* renamed from: AnZ4ntgRZiVOQFYAd, reason: merged with bridge method [inline-methods] */
        public b8k1CqqNgacAsHleVkUzBdlNS deserialize(@k Decoder decoder) {
            SerialDescriptor f412706c = getF412706c();
            c cVarC = decoder.c(f412706c);
            P0 p02 = null;
            boolean z12 = true;
            int i12 = 0;
            Object objF = null;
            while (z12) {
                int iJ2 = cVarC.j(f412706c);
                if (iJ2 == -1) {
                    z12 = false;
                } else {
                    if (iJ2 != 0) {
                        throw new UnknownFieldException(iJ2);
                    }
                    objF = cVarC.f(f412706c, 0, V0.f412822a, objF);
                    i12 = 1;
                }
            }
            cVarC.d(f412706c);
            return new b8k1CqqNgacAsHleVkUzBdlNS(i12, (String) objF, p02);
        }

        @Override // kotlinx.serialization.internal.N
        @k
        public KSerializer<?>[] childSerializers() {
            return new KSerializer[]{a.a(V0.f412822a)};
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
        public void serialize(@k Encoder encoder, @k b8k1CqqNgacAsHleVkUzBdlNS value) {
            SerialDescriptor f412706c = getF412706c();
            d dVarC = encoder.c(f412706c);
            b8k1CqqNgacAsHleVkUzBdlNS.AnZ4ntgRZiVOQFYAd(value, dVarC, f412706c);
            dVarC.d(f412706c);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lru/cyberity/cbr/prooface/data/b8k1CqqNgacAsHleVkUzBdlNS$ar2zdFahlgqFwCDaNcK2mMj8NV2W;", "", "Lkotlinx/serialization/KSerializer;", "Lru/cyberity/cbr/prooface/data/b8k1CqqNgacAsHleVkUzBdlNS;", "serializer", "<init>", "()V", "cyberity-mobile-sdk-prooface_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: ru.cyberity.cbr.prooface.data.b8k1CqqNgacAsHleVkUzBdlNS$ar2zdFahlgqFwCDaNcK2mMj8NV2W, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @k
        public final KSerializer<b8k1CqqNgacAsHleVkUzBdlNS> serializer() {
            return VEkdd97RzWe.AnZ4ntgRZiVOQFYAd;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b8k1CqqNgacAsHleVkUzBdlNS() {
        this((String) null, 1, (C42822w) (0 == true ? 1 : 0));
    }

    @n
    public static final void AnZ4ntgRZiVOQFYAd(@k b8k1CqqNgacAsHleVkUzBdlNS self, @k d output, @k SerialDescriptor serialDesc) {
        if (!output.u() && self.payload == null) {
            return;
        }
        output.p(serialDesc, 0, V0.f412822a, self.payload);
    }

    @InterfaceC42830m
    public /* synthetic */ b8k1CqqNgacAsHleVkUzBdlNS(int i12, @v String str, P0 p02) {
        if ((i12 & 1) == 0) {
            this.payload = null;
        } else {
            this.payload = str;
        }
    }

    public b8k1CqqNgacAsHleVkUzBdlNS(@l String str) {
        this.payload = str;
    }

    public /* synthetic */ b8k1CqqNgacAsHleVkUzBdlNS(String str, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str);
    }
}
