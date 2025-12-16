package ru.cyberity.cbr.prooface.data;

import L51.a;
import X41.n;
import Y61.k;
import Y61.l;
import java.util.List;
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
import kotlinx.serialization.internal.C43401f;
import kotlinx.serialization.internal.G0;
import kotlinx.serialization.internal.N;
import kotlinx.serialization.internal.P0;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.V0;
import kotlinx.serialization.v;
import kotlinx.serialization.w;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0007\u0018\u0000 $2\u00020\u0001:\u0003%&'B1\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tBE\b\u0017\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0001\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ(\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012HÇ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010\u0017\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u0017\u0012\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001d\u0010\u0019R(\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010 \u0012\u0004\b#\u0010\u001b\u001a\u0004\b!\u0010\"¨\u0006("}, d2 = {"Lru/cyberity/cbr/prooface/data/P5t5x18Nr9Zgcg9u0Pj;", "", "", "clientErrorName", "clientErrorMessage", "", "Lru/cyberity/cbr/prooface/data/P5t5x18Nr9Zgcg9u0Pj$d8gDEgxuRMWxWXii0;", "videoDevices", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "seen1", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/P0;)V", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lkotlin/G0;", "AnZ4ntgRZiVOQFYAd", "(Lru/cyberity/cbr/prooface/data/P5t5x18Nr9Zgcg9u0Pj;Lkotlinx/serialization/encoding/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getClientErrorName", "()Ljava/lang/String;", "getClientErrorName$annotations", "()V", "uz93gWN1OYgIQ", "getClientErrorMessage", "getClientErrorMessage$annotations", "peujtyiBSfZOKD0yphJi2", "Ljava/util/List;", "getVideoDevices", "()Ljava/util/List;", "getVideoDevices$annotations", "Companion", "VEkdd97RzWe", "ar2zdFahlgqFwCDaNcK2mMj8NV2W", "d8gDEgxuRMWxWXii0", "cyberity-mobile-sdk-prooface_release"}, k = 1, mv = {1, 7, 1})
@w
/* loaded from: classes9.dex */
public final class P5t5x18Nr9Zgcg9u0Pj {

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: AnZ4ntgRZiVOQFYAd, reason: from kotlin metadata */
    @l
    private final String clientErrorName;

    /* renamed from: peujtyiBSfZOKD0yphJi2, reason: from kotlin metadata */
    @l
    private final List<d8gDEgxuRMWxWXii0> videoDevices;

    /* renamed from: uz93gWN1OYgIQ, reason: from kotlin metadata */
    @l
    private final String clientErrorMessage;

    @Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000b\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"ru/cyberity/cbr/prooface/data/LivenessClientError.$serializer", "Lkotlinx/serialization/internal/N;", "Lru/cyberity/cbr/prooface/data/P5t5x18Nr9Zgcg9u0Pj;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "AnZ4ntgRZiVOQFYAd", "(Lkotlinx/serialization/encoding/Decoder;)Lru/cyberity/cbr/prooface/data/P5t5x18Nr9Zgcg9u0Pj;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlin/G0;", "(Lkotlinx/serialization/encoding/Encoder;Lru/cyberity/cbr/prooface/data/P5t5x18Nr9Zgcg9u0Pj;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "cyberity-mobile-sdk-prooface_release"}, k = 1, mv = {1, 7, 1})
    @InterfaceC42830m
    public static final class VEkdd97RzWe implements N<P5t5x18Nr9Zgcg9u0Pj> {

        @k
        public static final VEkdd97RzWe AnZ4ntgRZiVOQFYAd;
        public static final /* synthetic */ SerialDescriptor uz93gWN1OYgIQ;

        static {
            VEkdd97RzWe vEkdd97RzWe = new VEkdd97RzWe();
            AnZ4ntgRZiVOQFYAd = vEkdd97RzWe;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.cyberity.cbr.prooface.data.LivenessClientError", vEkdd97RzWe, 3);
            pluginGeneratedSerialDescriptor.j("clientErrorName", true);
            pluginGeneratedSerialDescriptor.j("clientErrorMessage", true);
            pluginGeneratedSerialDescriptor.j("videoDevices", true);
            uz93gWN1OYgIQ = pluginGeneratedSerialDescriptor;
        }

        private VEkdd97RzWe() {
        }

        @Override // kotlinx.serialization.InterfaceC43386e
        @k
        /* renamed from: AnZ4ntgRZiVOQFYAd, reason: merged with bridge method [inline-methods] */
        public P5t5x18Nr9Zgcg9u0Pj deserialize(@k Decoder decoder) {
            SerialDescriptor f412706c = getF412706c();
            c cVarC = decoder.c(f412706c);
            Object objF = null;
            boolean z12 = true;
            int i12 = 0;
            Object objF2 = null;
            Object objF3 = null;
            while (z12) {
                int iJ2 = cVarC.j(f412706c);
                if (iJ2 == -1) {
                    z12 = false;
                } else if (iJ2 == 0) {
                    objF = cVarC.f(f412706c, 0, V0.f412822a, objF);
                    i12 |= 1;
                } else if (iJ2 == 1) {
                    objF2 = cVarC.f(f412706c, 1, V0.f412822a, objF2);
                    i12 |= 2;
                } else {
                    if (iJ2 != 2) {
                        throw new UnknownFieldException(iJ2);
                    }
                    objF3 = cVarC.f(f412706c, 2, new C43401f(d8gDEgxuRMWxWXii0.VEkdd97RzWe.AnZ4ntgRZiVOQFYAd), objF3);
                    i12 |= 4;
                }
            }
            cVarC.d(f412706c);
            return new P5t5x18Nr9Zgcg9u0Pj(i12, (String) objF, (String) objF2, (List) objF3, (P0) null);
        }

        @Override // kotlinx.serialization.internal.N
        @k
        public KSerializer<?>[] childSerializers() {
            V0 v02 = V0.f412822a;
            return new KSerializer[]{a.a(v02), a.a(v02), a.a(new C43401f(d8gDEgxuRMWxWXii0.VEkdd97RzWe.AnZ4ntgRZiVOQFYAd))};
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
        public void serialize(@k Encoder encoder, @k P5t5x18Nr9Zgcg9u0Pj value) {
            SerialDescriptor f412706c = getF412706c();
            d dVarC = encoder.c(f412706c);
            P5t5x18Nr9Zgcg9u0Pj.AnZ4ntgRZiVOQFYAd(value, dVarC, f412706c);
            dVarC.d(f412706c);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lru/cyberity/cbr/prooface/data/P5t5x18Nr9Zgcg9u0Pj$ar2zdFahlgqFwCDaNcK2mMj8NV2W;", "", "Lkotlinx/serialization/KSerializer;", "Lru/cyberity/cbr/prooface/data/P5t5x18Nr9Zgcg9u0Pj;", "serializer", "<init>", "()V", "cyberity-mobile-sdk-prooface_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: ru.cyberity.cbr.prooface.data.P5t5x18Nr9Zgcg9u0Pj$ar2zdFahlgqFwCDaNcK2mMj8NV2W, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @k
        public final KSerializer<P5t5x18Nr9Zgcg9u0Pj> serializer() {
            return VEkdd97RzWe.AnZ4ntgRZiVOQFYAd;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0002\u0019\u001aB\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B'\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÇ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u0013\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001b"}, d2 = {"Lru/cyberity/cbr/prooface/data/P5t5x18Nr9Zgcg9u0Pj$d8gDEgxuRMWxWXii0;", "", "", "label", "<init>", "(Ljava/lang/String;)V", "", "seen1", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "(ILjava/lang/String;Lkotlinx/serialization/internal/P0;)V", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lkotlin/G0;", "AnZ4ntgRZiVOQFYAd", "(Lru/cyberity/cbr/prooface/data/P5t5x18Nr9Zgcg9u0Pj$d8gDEgxuRMWxWXii0;Lkotlinx/serialization/encoding/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getLabel", "()Ljava/lang/String;", "getLabel$annotations", "()V", "Companion", "VEkdd97RzWe", "ar2zdFahlgqFwCDaNcK2mMj8NV2W", "cyberity-mobile-sdk-prooface_release"}, k = 1, mv = {1, 7, 1})
    @w
    public static final class d8gDEgxuRMWxWXii0 {

        /* renamed from: Companion, reason: from kotlin metadata */
        @k
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: AnZ4ntgRZiVOQFYAd, reason: from kotlin metadata */
        @l
        private final String label;

        @Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000b\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"ru/cyberity/cbr/prooface/data/LivenessClientError.VideoDevice.$serializer", "Lkotlinx/serialization/internal/N;", "Lru/cyberity/cbr/prooface/data/P5t5x18Nr9Zgcg9u0Pj$d8gDEgxuRMWxWXii0;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "AnZ4ntgRZiVOQFYAd", "(Lkotlinx/serialization/encoding/Decoder;)Lru/cyberity/cbr/prooface/data/P5t5x18Nr9Zgcg9u0Pj$d8gDEgxuRMWxWXii0;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlin/G0;", "(Lkotlinx/serialization/encoding/Encoder;Lru/cyberity/cbr/prooface/data/P5t5x18Nr9Zgcg9u0Pj$d8gDEgxuRMWxWXii0;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "cyberity-mobile-sdk-prooface_release"}, k = 1, mv = {1, 7, 1})
        @InterfaceC42830m
        public static final class VEkdd97RzWe implements N<d8gDEgxuRMWxWXii0> {

            @k
            public static final VEkdd97RzWe AnZ4ntgRZiVOQFYAd;
            public static final /* synthetic */ SerialDescriptor uz93gWN1OYgIQ;

            static {
                VEkdd97RzWe vEkdd97RzWe = new VEkdd97RzWe();
                AnZ4ntgRZiVOQFYAd = vEkdd97RzWe;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.cyberity.cbr.prooface.data.LivenessClientError.VideoDevice", vEkdd97RzWe, 1);
                pluginGeneratedSerialDescriptor.j("label", true);
                uz93gWN1OYgIQ = pluginGeneratedSerialDescriptor;
            }

            private VEkdd97RzWe() {
            }

            @Override // kotlinx.serialization.InterfaceC43386e
            @k
            /* renamed from: AnZ4ntgRZiVOQFYAd, reason: merged with bridge method [inline-methods] */
            public d8gDEgxuRMWxWXii0 deserialize(@k Decoder decoder) {
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
                return new d8gDEgxuRMWxWXii0(i12, (String) objF, p02);
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
            public void serialize(@k Encoder encoder, @k d8gDEgxuRMWxWXii0 value) {
                SerialDescriptor f412706c = getF412706c();
                d dVarC = encoder.c(f412706c);
                d8gDEgxuRMWxWXii0.AnZ4ntgRZiVOQFYAd(value, dVarC, f412706c);
                dVarC.d(f412706c);
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lru/cyberity/cbr/prooface/data/P5t5x18Nr9Zgcg9u0Pj$d8gDEgxuRMWxWXii0$ar2zdFahlgqFwCDaNcK2mMj8NV2W;", "", "Lkotlinx/serialization/KSerializer;", "Lru/cyberity/cbr/prooface/data/P5t5x18Nr9Zgcg9u0Pj$d8gDEgxuRMWxWXii0;", "serializer", "<init>", "()V", "cyberity-mobile-sdk-prooface_release"}, k = 1, mv = {1, 7, 1})
        /* renamed from: ru.cyberity.cbr.prooface.data.P5t5x18Nr9Zgcg9u0Pj$d8gDEgxuRMWxWXii0$ar2zdFahlgqFwCDaNcK2mMj8NV2W, reason: from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(C42822w c42822w) {
                this();
            }

            @k
            public final KSerializer<d8gDEgxuRMWxWXii0> serializer() {
                return VEkdd97RzWe.AnZ4ntgRZiVOQFYAd;
            }

            private Companion() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public d8gDEgxuRMWxWXii0() {
            this((String) null, 1, (C42822w) (0 == true ? 1 : 0));
        }

        @n
        public static final void AnZ4ntgRZiVOQFYAd(@k d8gDEgxuRMWxWXii0 self, @k d output, @k SerialDescriptor serialDesc) {
            if (!output.u() && self.label == null) {
                return;
            }
            output.p(serialDesc, 0, V0.f412822a, self.label);
        }

        @InterfaceC42830m
        public /* synthetic */ d8gDEgxuRMWxWXii0(int i12, @v String str, P0 p02) {
            if ((i12 & 1) == 0) {
                this.label = null;
            } else {
                this.label = str;
            }
        }

        public d8gDEgxuRMWxWXii0(@l String str) {
            this.label = str;
        }

        public /* synthetic */ d8gDEgxuRMWxWXii0(String str, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : str);
        }
    }

    public P5t5x18Nr9Zgcg9u0Pj() {
        this((String) null, (String) null, (List) null, 7, (C42822w) null);
    }

    @n
    public static final void AnZ4ntgRZiVOQFYAd(@k P5t5x18Nr9Zgcg9u0Pj self, @k d output, @k SerialDescriptor serialDesc) {
        if (output.u() || self.clientErrorName != null) {
            output.p(serialDesc, 0, V0.f412822a, self.clientErrorName);
        }
        if (output.u() || self.clientErrorMessage != null) {
            output.p(serialDesc, 1, V0.f412822a, self.clientErrorMessage);
        }
        if (!output.u() && self.videoDevices == null) {
            return;
        }
        output.p(serialDesc, 2, new C43401f(d8gDEgxuRMWxWXii0.VEkdd97RzWe.AnZ4ntgRZiVOQFYAd), self.videoDevices);
    }

    @InterfaceC42830m
    public /* synthetic */ P5t5x18Nr9Zgcg9u0Pj(int i12, @v String str, @v String str2, @v List list, P0 p02) {
        if ((i12 & 1) == 0) {
            this.clientErrorName = null;
        } else {
            this.clientErrorName = str;
        }
        if ((i12 & 2) == 0) {
            this.clientErrorMessage = null;
        } else {
            this.clientErrorMessage = str2;
        }
        if ((i12 & 4) == 0) {
            this.videoDevices = null;
        } else {
            this.videoDevices = list;
        }
    }

    public P5t5x18Nr9Zgcg9u0Pj(@l String str, @l String str2, @l List<d8gDEgxuRMWxWXii0> list) {
        this.clientErrorName = str;
        this.clientErrorMessage = str2;
        this.videoDevices = list;
    }

    public /* synthetic */ P5t5x18Nr9Zgcg9u0Pj(String str, String str2, List list, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : list);
    }
}
