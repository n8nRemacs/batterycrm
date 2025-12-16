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
import ru.cyberity.cbr.prooface.data.d8gDEgxuRMWxWXii0;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0002 !B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B3\b\u0017\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÇ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u0015\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u0012\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001c\u0010\u001d¨\u0006\""}, d2 = {"Lru/cyberity/cbr/prooface/data/W6LpgmOhfkE9MxK;", "", "", "faceStatus", "Lru/cyberity/cbr/prooface/data/d8gDEgxuRMWxWXii0;", "faceMesh", "<init>", "(Ljava/lang/String;Lru/cyberity/cbr/prooface/data/d8gDEgxuRMWxWXii0;)V", "", "seen1", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "(ILjava/lang/String;Lru/cyberity/cbr/prooface/data/d8gDEgxuRMWxWXii0;Lkotlinx/serialization/internal/P0;)V", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lkotlin/G0;", "AnZ4ntgRZiVOQFYAd", "(Lru/cyberity/cbr/prooface/data/W6LpgmOhfkE9MxK;Lkotlinx/serialization/encoding/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getFaceStatus", "()Ljava/lang/String;", "getFaceStatus$annotations", "()V", "uz93gWN1OYgIQ", "Lru/cyberity/cbr/prooface/data/d8gDEgxuRMWxWXii0;", "getFaceMesh", "()Lru/cyberity/cbr/prooface/data/d8gDEgxuRMWxWXii0;", "getFaceMesh$annotations", "Companion", "VEkdd97RzWe", "ar2zdFahlgqFwCDaNcK2mMj8NV2W", "cyberity-mobile-sdk-prooface_release"}, k = 1, mv = {1, 7, 1})
@w
/* loaded from: classes9.dex */
public final class W6LpgmOhfkE9MxK {

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: AnZ4ntgRZiVOQFYAd, reason: from kotlin metadata */
    @l
    private final String faceStatus;

    /* renamed from: uz93gWN1OYgIQ, reason: from kotlin metadata */
    @l
    private final d8gDEgxuRMWxWXii0 faceMesh;

    @Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000b\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"ru/cyberity/cbr/prooface/data/FilterOutput.$serializer", "Lkotlinx/serialization/internal/N;", "Lru/cyberity/cbr/prooface/data/W6LpgmOhfkE9MxK;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "AnZ4ntgRZiVOQFYAd", "(Lkotlinx/serialization/encoding/Decoder;)Lru/cyberity/cbr/prooface/data/W6LpgmOhfkE9MxK;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlin/G0;", "(Lkotlinx/serialization/encoding/Encoder;Lru/cyberity/cbr/prooface/data/W6LpgmOhfkE9MxK;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "cyberity-mobile-sdk-prooface_release"}, k = 1, mv = {1, 7, 1})
    @InterfaceC42830m
    public static final class VEkdd97RzWe implements N<W6LpgmOhfkE9MxK> {

        @k
        public static final VEkdd97RzWe AnZ4ntgRZiVOQFYAd;
        public static final /* synthetic */ SerialDescriptor uz93gWN1OYgIQ;

        static {
            VEkdd97RzWe vEkdd97RzWe = new VEkdd97RzWe();
            AnZ4ntgRZiVOQFYAd = vEkdd97RzWe;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.cyberity.cbr.prooface.data.FilterOutput", vEkdd97RzWe, 2);
            pluginGeneratedSerialDescriptor.j("faceStatus", true);
            pluginGeneratedSerialDescriptor.j("faceMesh", true);
            uz93gWN1OYgIQ = pluginGeneratedSerialDescriptor;
        }

        private VEkdd97RzWe() {
        }

        @Override // kotlinx.serialization.InterfaceC43386e
        @k
        /* renamed from: AnZ4ntgRZiVOQFYAd, reason: merged with bridge method [inline-methods] */
        public W6LpgmOhfkE9MxK deserialize(@k Decoder decoder) {
            SerialDescriptor f332717a = getF332717a();
            c cVarC = decoder.c(f332717a);
            P0 p02 = null;
            boolean z12 = true;
            int i12 = 0;
            Object objF = null;
            Object objF2 = null;
            while (z12) {
                int iJ2 = cVarC.j(f332717a);
                if (iJ2 == -1) {
                    z12 = false;
                } else if (iJ2 == 0) {
                    objF = cVarC.f(f332717a, 0, V0.f412822a, objF);
                    i12 |= 1;
                } else {
                    if (iJ2 != 1) {
                        throw new UnknownFieldException(iJ2);
                    }
                    objF2 = cVarC.f(f332717a, 1, d8gDEgxuRMWxWXii0.VEkdd97RzWe.AnZ4ntgRZiVOQFYAd, objF2);
                    i12 |= 2;
                }
            }
            cVarC.d(f332717a);
            return new W6LpgmOhfkE9MxK(i12, (String) objF, (d8gDEgxuRMWxWXii0) objF2, p02);
        }

        @Override // kotlinx.serialization.internal.N
        @k
        public KSerializer<?>[] childSerializers() {
            return new KSerializer[]{a.a(V0.f412822a), a.a(d8gDEgxuRMWxWXii0.VEkdd97RzWe.AnZ4ntgRZiVOQFYAd)};
        }

        @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
        @k
        /* renamed from: getDescriptor */
        public SerialDescriptor getF332717a() {
            return uz93gWN1OYgIQ;
        }

        @Override // kotlinx.serialization.internal.N
        @k
        public KSerializer<?>[] typeParametersSerializers() {
            return G0.f412773a;
        }

        @Override // kotlinx.serialization.x
        /* renamed from: AnZ4ntgRZiVOQFYAd, reason: merged with bridge method [inline-methods] */
        public void serialize(@k Encoder encoder, @k W6LpgmOhfkE9MxK value) {
            SerialDescriptor f332717a = getF332717a();
            d dVarC = encoder.c(f332717a);
            W6LpgmOhfkE9MxK.AnZ4ntgRZiVOQFYAd(value, dVarC, f332717a);
            dVarC.d(f332717a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lru/cyberity/cbr/prooface/data/W6LpgmOhfkE9MxK$ar2zdFahlgqFwCDaNcK2mMj8NV2W;", "", "Lkotlinx/serialization/KSerializer;", "Lru/cyberity/cbr/prooface/data/W6LpgmOhfkE9MxK;", "serializer", "<init>", "()V", "cyberity-mobile-sdk-prooface_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: ru.cyberity.cbr.prooface.data.W6LpgmOhfkE9MxK$ar2zdFahlgqFwCDaNcK2mMj8NV2W, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @k
        public final KSerializer<W6LpgmOhfkE9MxK> serializer() {
            return VEkdd97RzWe.AnZ4ntgRZiVOQFYAd;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public W6LpgmOhfkE9MxK() {
        this((String) null, (d8gDEgxuRMWxWXii0) (0 == true ? 1 : 0), 3, (C42822w) (0 == true ? 1 : 0));
    }

    @n
    public static final void AnZ4ntgRZiVOQFYAd(@k W6LpgmOhfkE9MxK self, @k d output, @k SerialDescriptor serialDesc) {
        if (output.u() || self.faceStatus != null) {
            output.p(serialDesc, 0, V0.f412822a, self.faceStatus);
        }
        if (!output.u() && self.faceMesh == null) {
            return;
        }
        output.p(serialDesc, 1, d8gDEgxuRMWxWXii0.VEkdd97RzWe.AnZ4ntgRZiVOQFYAd, self.faceMesh);
    }

    @InterfaceC42830m
    public /* synthetic */ W6LpgmOhfkE9MxK(int i12, @v String str, @v d8gDEgxuRMWxWXii0 d8gdegxurmwxwxii0, P0 p02) {
        if ((i12 & 1) == 0) {
            this.faceStatus = null;
        } else {
            this.faceStatus = str;
        }
        if ((i12 & 2) == 0) {
            this.faceMesh = null;
        } else {
            this.faceMesh = d8gdegxurmwxwxii0;
        }
    }

    public W6LpgmOhfkE9MxK(@l String str, @l d8gDEgxuRMWxWXii0 d8gdegxurmwxwxii0) {
        this.faceStatus = str;
        this.faceMesh = d8gdegxurmwxwxii0;
    }

    public /* synthetic */ W6LpgmOhfkE9MxK(String str, d8gDEgxuRMWxWXii0 d8gdegxurmwxwxii0, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : d8gdegxurmwxwxii0);
    }
}
