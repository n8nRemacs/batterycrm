package ru.cyberity.cbr.prooface.data;

import L51.a;
import X41.n;
import Y61.k;
import Y61.l;
import java.util.Map;
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
import kotlinx.serialization.internal.C43400e0;
import kotlinx.serialization.internal.F;
import kotlinx.serialization.internal.G0;
import kotlinx.serialization.internal.N;
import kotlinx.serialization.internal.P0;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.V0;
import kotlinx.serialization.internal.Y;
import kotlinx.serialization.v;
import kotlinx.serialization.w;
import ru.cyberity.cbr.prooface.data.VEkdd97RzWe;
import ru.cyberity.cbr.prooface.data.W6LpgmOhfkE9MxK;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b9\b\u0007\u0018\u0000 V2\u00020\u0001:\u0002WXB±\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0018\b\u0002\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016BÅ\u0001\b\u0017\u0012\u0006\u0010\u0017\u001a\u00020\u0006\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0018\b\u0001\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0013\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0015\u0010\u001aJ(\u0010!\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eHÇ\u0001¢\u0006\u0004\b!\u0010\"R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b!\u0010#\u0012\u0004\b&\u0010'\u001a\u0004\b$\u0010%R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b(\u0010#\u0012\u0004\b*\u0010'\u001a\u0004\b)\u0010%R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b+\u0010#\u0012\u0004\b-\u0010'\u001a\u0004\b,\u0010%R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b.\u0010/\u0012\u0004\b2\u0010'\u001a\u0004\b0\u00101R\"\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b3\u0010/\u0012\u0004\b5\u0010'\u001a\u0004\b4\u00101R\"\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b6\u0010#\u0012\u0004\b8\u0010'\u001a\u0004\b7\u0010%R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b9\u0010:\u0012\u0004\b=\u0010'\u001a\u0004\b;\u0010<R\"\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b>\u0010#\u0012\u0004\b@\u0010'\u001a\u0004\b?\u0010%R\"\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bA\u0010/\u0012\u0004\bC\u0010'\u001a\u0004\bB\u00101R\"\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bD\u0010/\u0012\u0004\bF\u0010'\u001a\u0004\bE\u00101R\"\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bG\u0010H\u0012\u0004\bK\u0010'\u001a\u0004\bI\u0010JR\"\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bL\u0010M\u0012\u0004\bP\u0010'\u001a\u0004\bN\u0010OR0\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bQ\u0010R\u0012\u0004\bU\u0010'\u001a\u0004\bS\u0010T¨\u0006Y"}, d2 = {"Lru/cyberity/cbr/prooface/data/gCh8O9vEEXKO12FpnjmYuc29DG;", "", "", "userAgent", "trackLabel", "trackDeviceId", "", "trackWidth", "trackHeight", "trackFacingMode", "", "trackFrameRate", "createdAt", "imageWidth", "imageHeight", "Lru/cyberity/cbr/prooface/data/W6LpgmOhfkE9MxK;", "filter", "Lru/cyberity/cbr/prooface/data/VEkdd97RzWe;", "calibration", "", "fingerprint", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lru/cyberity/cbr/prooface/data/W6LpgmOhfkE9MxK;Lru/cyberity/cbr/prooface/data/VEkdd97RzWe;Ljava/util/Map;)V", "seen1", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lru/cyberity/cbr/prooface/data/W6LpgmOhfkE9MxK;Lru/cyberity/cbr/prooface/data/VEkdd97RzWe;Ljava/util/Map;Lkotlinx/serialization/internal/P0;)V", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lkotlin/G0;", "AnZ4ntgRZiVOQFYAd", "(Lru/cyberity/cbr/prooface/data/gCh8O9vEEXKO12FpnjmYuc29DG;Lkotlinx/serialization/encoding/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getUserAgent", "()Ljava/lang/String;", "getUserAgent$annotations", "()V", "uz93gWN1OYgIQ", "getTrackLabel", "getTrackLabel$annotations", "peujtyiBSfZOKD0yphJi2", "getTrackDeviceId", "getTrackDeviceId$annotations", "MyHc7quGyJKbnAIkFgd", "Ljava/lang/Integer;", "getTrackWidth", "()Ljava/lang/Integer;", "getTrackWidth$annotations", "U4mhkUewPl2fPUTo32", "getTrackHeight", "getTrackHeight$annotations", "E9gFqwO2FE5yBJACCUilu8lqyiR", "getTrackFacingMode", "getTrackFacingMode$annotations", "Hxrfc64cpBNzdXtCQnYxNm1uSR", "Ljava/lang/Double;", "getTrackFrameRate", "()Ljava/lang/Double;", "getTrackFrameRate$annotations", "hKhP1IV1YI8WgJ4nSpWmOP", "getCreatedAt", "getCreatedAt$annotations", "qDU6tWL1eFyUpkx72FqDl7Rs8Zhj", "getImageWidth", "getImageWidth$annotations", "wHwI6WiVaPW36cHlnYtNbdyeJ6", "getImageHeight", "getImageHeight$annotations", "ro5yTlDmHIztT", "Lru/cyberity/cbr/prooface/data/W6LpgmOhfkE9MxK;", "getFilter", "()Lru/cyberity/cbr/prooface/data/W6LpgmOhfkE9MxK;", "getFilter$annotations", "ixRCtjLaoPvSdVLG7eWTMMZt4s", "Lru/cyberity/cbr/prooface/data/VEkdd97RzWe;", "getCalibration", "()Lru/cyberity/cbr/prooface/data/VEkdd97RzWe;", "getCalibration$annotations", "lx7eKxkYx4Q7d70nzPK5p4g6", "Ljava/util/Map;", "getFingerprint", "()Ljava/util/Map;", "getFingerprint$annotations", "Companion", "VEkdd97RzWe", "ar2zdFahlgqFwCDaNcK2mMj8NV2W", "cyberity-mobile-sdk-prooface_release"}, k = 1, mv = {1, 7, 1})
@w
/* loaded from: classes9.dex */
public final class gCh8O9vEEXKO12FpnjmYuc29DG {

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: AnZ4ntgRZiVOQFYAd, reason: from kotlin metadata */
    @l
    private final String userAgent;

    /* renamed from: E9gFqwO2FE5yBJACCUilu8lqyiR, reason: from kotlin metadata */
    @l
    private final String trackFacingMode;

    /* renamed from: Hxrfc64cpBNzdXtCQnYxNm1uSR, reason: from kotlin metadata */
    @l
    private final Double trackFrameRate;

    /* renamed from: MyHc7quGyJKbnAIkFgd, reason: from kotlin metadata */
    @l
    private final Integer trackWidth;

    /* renamed from: U4mhkUewPl2fPUTo32, reason: from kotlin metadata */
    @l
    private final Integer trackHeight;

    /* renamed from: hKhP1IV1YI8WgJ4nSpWmOP, reason: from kotlin metadata */
    @l
    private final String createdAt;

    /* renamed from: ixRCtjLaoPvSdVLG7eWTMMZt4s, reason: from kotlin metadata */
    @l
    private final ru.cyberity.cbr.prooface.data.VEkdd97RzWe calibration;

    /* renamed from: lx7eKxkYx4Q7d70nzPK5p4g6, reason: from kotlin metadata */
    @l
    private final Map<String, String> fingerprint;

    /* renamed from: peujtyiBSfZOKD0yphJi2, reason: from kotlin metadata */
    @l
    private final String trackDeviceId;

    /* renamed from: qDU6tWL1eFyUpkx72FqDl7Rs8Zhj, reason: from kotlin metadata */
    @l
    private final Integer imageWidth;

    /* renamed from: ro5yTlDmHIztT, reason: from kotlin metadata */
    @l
    private final W6LpgmOhfkE9MxK filter;

    /* renamed from: uz93gWN1OYgIQ, reason: from kotlin metadata */
    @l
    private final String trackLabel;

    /* renamed from: wHwI6WiVaPW36cHlnYtNbdyeJ6, reason: from kotlin metadata */
    @l
    private final Integer imageHeight;

    @Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000b\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"ru/cyberity/cbr/prooface/data/LivenessFragmentMetadata.$serializer", "Lkotlinx/serialization/internal/N;", "Lru/cyberity/cbr/prooface/data/gCh8O9vEEXKO12FpnjmYuc29DG;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "AnZ4ntgRZiVOQFYAd", "(Lkotlinx/serialization/encoding/Decoder;)Lru/cyberity/cbr/prooface/data/gCh8O9vEEXKO12FpnjmYuc29DG;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlin/G0;", "(Lkotlinx/serialization/encoding/Encoder;Lru/cyberity/cbr/prooface/data/gCh8O9vEEXKO12FpnjmYuc29DG;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "cyberity-mobile-sdk-prooface_release"}, k = 1, mv = {1, 7, 1})
    @InterfaceC42830m
    public static final class VEkdd97RzWe implements N<gCh8O9vEEXKO12FpnjmYuc29DG> {

        @k
        public static final VEkdd97RzWe AnZ4ntgRZiVOQFYAd;
        public static final /* synthetic */ SerialDescriptor uz93gWN1OYgIQ;

        static {
            VEkdd97RzWe vEkdd97RzWe = new VEkdd97RzWe();
            AnZ4ntgRZiVOQFYAd = vEkdd97RzWe;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.cyberity.cbr.prooface.data.LivenessFragmentMetadata", vEkdd97RzWe, 13);
            pluginGeneratedSerialDescriptor.j("userAgent", true);
            pluginGeneratedSerialDescriptor.j("trackLabel", true);
            pluginGeneratedSerialDescriptor.j("trackDeviceId", true);
            pluginGeneratedSerialDescriptor.j("trackWidth", true);
            pluginGeneratedSerialDescriptor.j("trackHeight", true);
            pluginGeneratedSerialDescriptor.j("trackFacingMode", true);
            pluginGeneratedSerialDescriptor.j("trackFrameRate", true);
            pluginGeneratedSerialDescriptor.j("createdAt", true);
            pluginGeneratedSerialDescriptor.j("imageWidth", true);
            pluginGeneratedSerialDescriptor.j("imageHeight", true);
            pluginGeneratedSerialDescriptor.j("filter", true);
            pluginGeneratedSerialDescriptor.j("calibration", true);
            pluginGeneratedSerialDescriptor.j("fingerprint", true);
            uz93gWN1OYgIQ = pluginGeneratedSerialDescriptor;
        }

        private VEkdd97RzWe() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r4v0 */
        /* JADX WARN: Type inference failed for: r4v1 */
        /* JADX WARN: Type inference failed for: r4v19 */
        /* JADX WARN: Type inference failed for: r4v20 */
        /* JADX WARN: Type inference failed for: r4v4 */
        /* JADX WARN: Type inference failed for: r4v5 */
        /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r4v9 */
        @Override // kotlinx.serialization.InterfaceC43386e
        @k
        /* renamed from: AnZ4ntgRZiVOQFYAd, reason: merged with bridge method [inline-methods] */
        public gCh8O9vEEXKO12FpnjmYuc29DG deserialize(@k Decoder decoder) {
            String str;
            SerialDescriptor f332717a = getF332717a();
            c cVarC = decoder.c(f332717a);
            String strF = 0;
            Object objF = null;
            String strF2 = null;
            Object objF2 = null;
            Object objF3 = null;
            Object objF4 = null;
            Object objF5 = null;
            Object objF6 = null;
            Object objF7 = null;
            Object objF8 = null;
            Object objF9 = null;
            Object objF10 = null;
            Object objF11 = null;
            int i12 = 0;
            boolean z12 = true;
            while (z12) {
                Object obj = strF;
                int iJ2 = cVarC.j(f332717a);
                switch (iJ2) {
                    case -1:
                        z12 = false;
                        strF = obj;
                        objF11 = objF11;
                        strF2 = strF2;
                        objF = objF;
                        continue;
                    case 0:
                        strF = cVarC.f(f332717a, 0, V0.f412822a, obj);
                        i12 |= 1;
                        strF2 = strF2;
                        objF = objF;
                        objF11 = objF11;
                        continue;
                    case 1:
                        i12 |= 2;
                        strF2 = cVarC.f(f332717a, 1, V0.f412822a, strF2);
                        objF = objF;
                        strF = obj;
                        continue;
                    case 2:
                        str = strF2;
                        objF2 = cVarC.f(f332717a, 2, V0.f412822a, objF2);
                        i12 |= 4;
                        break;
                    case 3:
                        str = strF2;
                        objF3 = cVarC.f(f332717a, 3, Y.f412835a, objF3);
                        i12 |= 8;
                        break;
                    case 4:
                        str = strF2;
                        objF4 = cVarC.f(f332717a, 4, Y.f412835a, objF4);
                        i12 |= 16;
                        break;
                    case 5:
                        str = strF2;
                        objF5 = cVarC.f(f332717a, 5, V0.f412822a, objF5);
                        i12 |= 32;
                        break;
                    case 6:
                        str = strF2;
                        objF6 = cVarC.f(f332717a, 6, F.f412769a, objF6);
                        i12 |= 64;
                        break;
                    case 7:
                        str = strF2;
                        objF7 = cVarC.f(f332717a, 7, V0.f412822a, objF7);
                        i12 |= 128;
                        break;
                    case 8:
                        str = strF2;
                        objF8 = cVarC.f(f332717a, 8, Y.f412835a, objF8);
                        i12 |= 256;
                        break;
                    case 9:
                        str = strF2;
                        objF9 = cVarC.f(f332717a, 9, Y.f412835a, objF9);
                        i12 |= 512;
                        break;
                    case 10:
                        str = strF2;
                        objF10 = cVarC.f(f332717a, 10, W6LpgmOhfkE9MxK.VEkdd97RzWe.AnZ4ntgRZiVOQFYAd, objF10);
                        i12 |= 1024;
                        break;
                    case 11:
                        str = strF2;
                        objF11 = cVarC.f(f332717a, 11, VEkdd97RzWe.C12542VEkdd97RzWe.AnZ4ntgRZiVOQFYAd, objF11);
                        i12 |= 2048;
                        break;
                    case 12:
                        String str2 = strF2;
                        V0 v02 = V0.f412822a;
                        objF = cVarC.f(f332717a, 12, new C43400e0(v02, a.a(v02)), objF);
                        i12 |= 4096;
                        strF = obj;
                        strF2 = str2;
                        objF2 = objF2;
                        continue;
                    default:
                        throw new UnknownFieldException(iJ2);
                }
                strF = obj;
                strF2 = str;
            }
            Object obj2 = objF;
            Object obj3 = objF11;
            cVarC.d(f332717a);
            return new gCh8O9vEEXKO12FpnjmYuc29DG(i12, strF, strF2, (String) objF2, (Integer) objF3, (Integer) objF4, (String) objF5, (Double) objF6, (String) objF7, (Integer) objF8, (Integer) objF9, (W6LpgmOhfkE9MxK) objF10, (ru.cyberity.cbr.prooface.data.VEkdd97RzWe) obj3, (Map) obj2, (P0) null);
        }

        @Override // kotlinx.serialization.internal.N
        @k
        public KSerializer<?>[] childSerializers() {
            V0 v02 = V0.f412822a;
            KSerializer<?> kSerializerA = a.a(v02);
            KSerializer<?> kSerializerA2 = a.a(v02);
            KSerializer<?> kSerializerA3 = a.a(v02);
            Y y12 = Y.f412835a;
            return new KSerializer[]{kSerializerA, kSerializerA2, kSerializerA3, a.a(y12), a.a(y12), a.a(v02), a.a(F.f412769a), a.a(v02), a.a(y12), a.a(y12), a.a(W6LpgmOhfkE9MxK.VEkdd97RzWe.AnZ4ntgRZiVOQFYAd), a.a(VEkdd97RzWe.C12542VEkdd97RzWe.AnZ4ntgRZiVOQFYAd), a.a(new C43400e0(v02, a.a(v02)))};
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
        public void serialize(@k Encoder encoder, @k gCh8O9vEEXKO12FpnjmYuc29DG value) {
            SerialDescriptor f332717a = getF332717a();
            d dVarC = encoder.c(f332717a);
            gCh8O9vEEXKO12FpnjmYuc29DG.AnZ4ntgRZiVOQFYAd(value, dVarC, f332717a);
            dVarC.d(f332717a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lru/cyberity/cbr/prooface/data/gCh8O9vEEXKO12FpnjmYuc29DG$ar2zdFahlgqFwCDaNcK2mMj8NV2W;", "", "Lkotlinx/serialization/KSerializer;", "Lru/cyberity/cbr/prooface/data/gCh8O9vEEXKO12FpnjmYuc29DG;", "serializer", "<init>", "()V", "cyberity-mobile-sdk-prooface_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: ru.cyberity.cbr.prooface.data.gCh8O9vEEXKO12FpnjmYuc29DG$ar2zdFahlgqFwCDaNcK2mMj8NV2W, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @k
        public final KSerializer<gCh8O9vEEXKO12FpnjmYuc29DG> serializer() {
            return VEkdd97RzWe.AnZ4ntgRZiVOQFYAd;
        }

        private Companion() {
        }
    }

    public gCh8O9vEEXKO12FpnjmYuc29DG() {
        this((String) null, (String) null, (String) null, (Integer) null, (Integer) null, (String) null, (Double) null, (String) null, (Integer) null, (Integer) null, (W6LpgmOhfkE9MxK) null, (ru.cyberity.cbr.prooface.data.VEkdd97RzWe) null, (Map) null, 8191, (C42822w) null);
    }

    @n
    public static final void AnZ4ntgRZiVOQFYAd(@k gCh8O9vEEXKO12FpnjmYuc29DG self, @k d output, @k SerialDescriptor serialDesc) {
        if (output.u() || self.userAgent != null) {
            output.p(serialDesc, 0, V0.f412822a, self.userAgent);
        }
        if (output.u() || self.trackLabel != null) {
            output.p(serialDesc, 1, V0.f412822a, self.trackLabel);
        }
        if (output.u() || self.trackDeviceId != null) {
            output.p(serialDesc, 2, V0.f412822a, self.trackDeviceId);
        }
        if (output.u() || self.trackWidth != null) {
            output.p(serialDesc, 3, Y.f412835a, self.trackWidth);
        }
        if (output.u() || self.trackHeight != null) {
            output.p(serialDesc, 4, Y.f412835a, self.trackHeight);
        }
        if (output.u() || self.trackFacingMode != null) {
            output.p(serialDesc, 5, V0.f412822a, self.trackFacingMode);
        }
        if (output.u() || self.trackFrameRate != null) {
            output.p(serialDesc, 6, F.f412769a, self.trackFrameRate);
        }
        if (output.u() || self.createdAt != null) {
            output.p(serialDesc, 7, V0.f412822a, self.createdAt);
        }
        if (output.u() || self.imageWidth != null) {
            output.p(serialDesc, 8, Y.f412835a, self.imageWidth);
        }
        if (output.u() || self.imageHeight != null) {
            output.p(serialDesc, 9, Y.f412835a, self.imageHeight);
        }
        if (output.u() || self.filter != null) {
            output.p(serialDesc, 10, W6LpgmOhfkE9MxK.VEkdd97RzWe.AnZ4ntgRZiVOQFYAd, self.filter);
        }
        if (output.u() || self.calibration != null) {
            output.p(serialDesc, 11, VEkdd97RzWe.C12542VEkdd97RzWe.AnZ4ntgRZiVOQFYAd, self.calibration);
        }
        if (!output.u() && self.fingerprint == null) {
            return;
        }
        V0 v02 = V0.f412822a;
        output.p(serialDesc, 12, new C43400e0(v02, a.a(v02)), self.fingerprint);
    }

    @InterfaceC42830m
    public /* synthetic */ gCh8O9vEEXKO12FpnjmYuc29DG(int i12, @v String str, @v String str2, @v String str3, @v Integer num, @v Integer num2, @v String str4, @v Double d12, @v String str5, @v Integer num3, @v Integer num4, @v W6LpgmOhfkE9MxK w6LpgmOhfkE9MxK, @v ru.cyberity.cbr.prooface.data.VEkdd97RzWe vEkdd97RzWe, @v Map map, P0 p02) {
        if ((i12 & 1) == 0) {
            this.userAgent = null;
        } else {
            this.userAgent = str;
        }
        if ((i12 & 2) == 0) {
            this.trackLabel = null;
        } else {
            this.trackLabel = str2;
        }
        if ((i12 & 4) == 0) {
            this.trackDeviceId = null;
        } else {
            this.trackDeviceId = str3;
        }
        if ((i12 & 8) == 0) {
            this.trackWidth = null;
        } else {
            this.trackWidth = num;
        }
        if ((i12 & 16) == 0) {
            this.trackHeight = null;
        } else {
            this.trackHeight = num2;
        }
        if ((i12 & 32) == 0) {
            this.trackFacingMode = null;
        } else {
            this.trackFacingMode = str4;
        }
        if ((i12 & 64) == 0) {
            this.trackFrameRate = null;
        } else {
            this.trackFrameRate = d12;
        }
        if ((i12 & 128) == 0) {
            this.createdAt = null;
        } else {
            this.createdAt = str5;
        }
        if ((i12 & 256) == 0) {
            this.imageWidth = null;
        } else {
            this.imageWidth = num3;
        }
        if ((i12 & 512) == 0) {
            this.imageHeight = null;
        } else {
            this.imageHeight = num4;
        }
        if ((i12 & 1024) == 0) {
            this.filter = null;
        } else {
            this.filter = w6LpgmOhfkE9MxK;
        }
        if ((i12 & 2048) == 0) {
            this.calibration = null;
        } else {
            this.calibration = vEkdd97RzWe;
        }
        if ((i12 & 4096) == 0) {
            this.fingerprint = null;
        } else {
            this.fingerprint = map;
        }
    }

    public gCh8O9vEEXKO12FpnjmYuc29DG(@l String str, @l String str2, @l String str3, @l Integer num, @l Integer num2, @l String str4, @l Double d12, @l String str5, @l Integer num3, @l Integer num4, @l W6LpgmOhfkE9MxK w6LpgmOhfkE9MxK, @l ru.cyberity.cbr.prooface.data.VEkdd97RzWe vEkdd97RzWe, @l Map<String, String> map) {
        this.userAgent = str;
        this.trackLabel = str2;
        this.trackDeviceId = str3;
        this.trackWidth = num;
        this.trackHeight = num2;
        this.trackFacingMode = str4;
        this.trackFrameRate = d12;
        this.createdAt = str5;
        this.imageWidth = num3;
        this.imageHeight = num4;
        this.filter = w6LpgmOhfkE9MxK;
        this.calibration = vEkdd97RzWe;
        this.fingerprint = map;
    }

    public /* synthetic */ gCh8O9vEEXKO12FpnjmYuc29DG(String str, String str2, String str3, Integer num, Integer num2, String str4, Double d12, String str5, Integer num3, Integer num4, W6LpgmOhfkE9MxK w6LpgmOhfkE9MxK, ru.cyberity.cbr.prooface.data.VEkdd97RzWe vEkdd97RzWe, Map map, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : str3, (i12 & 8) != 0 ? null : num, (i12 & 16) != 0 ? null : num2, (i12 & 32) != 0 ? null : str4, (i12 & 64) != 0 ? null : d12, (i12 & 128) != 0 ? null : str5, (i12 & 256) != 0 ? null : num3, (i12 & 512) != 0 ? null : num4, (i12 & 1024) != 0 ? null : w6LpgmOhfkE9MxK, (i12 & 2048) != 0 ? null : vEkdd97RzWe, (i12 & 4096) == 0 ? map : null);
    }
}
