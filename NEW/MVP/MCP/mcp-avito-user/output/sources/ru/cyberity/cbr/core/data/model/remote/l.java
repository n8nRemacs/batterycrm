package ru.cyberity.cbr.core.data.model.remote;

import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.List;
import java.util.Map;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.C43400e0;
import kotlinx.serialization.internal.C43401f;
import kotlinx.serialization.internal.G0;
import kotlinx.serialization.internal.N;
import kotlinx.serialization.internal.P0;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.V0;
import kotlinx.serialization.internal.Y;
import kotlinx.serialization.v;
import kotlinx.serialization.w;
import ru.cyberity.cbr.core.data.model.ReviewAnswerType;

/* compiled from: RemoteRequiredDoc.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u0000 92\u00020\u0001:\u0003\u0018\u001b\u001dBU\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rBi\b\u0017\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0001\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u0016\b\u0001\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\f\u0010\u0011J(\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015HÇ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0018\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u001e\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0002\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b \u0010!J^\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0002\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u0018\u0010\"J\u0010\u0010#\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b#\u0010\u001cJ\u0010\u0010$\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010*\u0012\u0004\b,\u0010-\u001a\u0004\b+\u0010\u001aR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010.\u0012\u0004\b0\u0010-\u001a\u0004\b/\u0010\u001cR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010.\u0012\u0004\b2\u0010-\u001a\u0004\b1\u0010\u001cR(\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001e\u00103\u0012\u0004\b5\u0010-\u001a\u0004\b4\u0010\u001fR.\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b \u00106\u0012\u0004\b8\u0010-\u001a\u0004\b7\u0010!¨\u0006:"}, d2 = {"Lru/cyberity/cbr/core/data/model/remote/l;", "", "Lru/cyberity/cbr/core/data/model/remote/l$c;", "reviewResult", "", "country", "identity", "", "", "imageIds", "", "imageReviewResults", "<init>", "(Lru/cyberity/cbr/core/data/model/remote/l$c;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;)V", "seen1", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "(ILru/cyberity/cbr/core/data/model/remote/l$c;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Lkotlinx/serialization/internal/P0;)V", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lkotlin/G0;", "a", "(Lru/cyberity/cbr/core/data/model/remote/l;Lkotlinx/serialization/encoding/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "()Lru/cyberity/cbr/core/data/model/remote/l$c;", "b", "()Ljava/lang/String;", "c", "d", "()Ljava/util/List;", "e", "()Ljava/util/Map;", "(Lru/cyberity/cbr/core/data/model/remote/l$c;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;)Lru/cyberity/cbr/core/data/model/remote/l;", "toString", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Lru/cyberity/cbr/core/data/model/remote/l$c;", "n", "getReviewResult$annotations", "()V", "Ljava/lang/String;", "f", "getCountry$annotations", "h", "getIdentity$annotations", "Ljava/util/List;", "j", "getImageIds$annotations", "Ljava/util/Map;", "l", "getImageReviewResults$annotations", "Companion", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
@w
/* loaded from: classes9.dex */
public final /* data */ class l {

    /* renamed from: Companion, reason: from kotlin metadata */
    @Y61.k
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final c reviewResult;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final String country;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final String identity;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final List<Integer> imageIds;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final Map<Integer, c> imageReviewResults;

    /* compiled from: RemoteRequiredDoc.kt */
    @Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000b\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"ru/cyberity/cbr/core/data/model/remote/RemoteRequiredDoc.$serializer", "Lkotlinx/serialization/internal/N;", "Lru/cyberity/cbr/core/data/model/remote/l;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "a", "(Lkotlinx/serialization/encoding/Decoder;)Lru/cyberity/cbr/core/data/model/remote/l;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlin/G0;", "(Lkotlinx/serialization/encoding/Encoder;Lru/cyberity/cbr/core/data/model/remote/l;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    @InterfaceC42830m
    public static final class a implements N<l> {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final a f433278a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ SerialDescriptor f433279b;

        static {
            a aVar = new a();
            f433278a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.cyberity.cbr.core.data.model.remote.RemoteRequiredDoc", aVar, 5);
            pluginGeneratedSerialDescriptor.j("reviewResult", true);
            pluginGeneratedSerialDescriptor.j("country", true);
            pluginGeneratedSerialDescriptor.j("idDocType", true);
            pluginGeneratedSerialDescriptor.j("imageIds", true);
            pluginGeneratedSerialDescriptor.j("imageReviewResults", true);
            f433279b = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // kotlinx.serialization.InterfaceC43386e
        @Y61.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public l deserialize(@Y61.k Decoder decoder) {
            SerialDescriptor f412706c = getF412706c();
            kotlinx.serialization.encoding.c cVarC = decoder.c(f412706c);
            Object objF = null;
            boolean z12 = true;
            int i12 = 0;
            Object objF2 = null;
            Object objF3 = null;
            Object objF4 = null;
            Object objF5 = null;
            while (z12) {
                int iJ2 = cVarC.j(f412706c);
                if (iJ2 == -1) {
                    z12 = false;
                } else if (iJ2 == 0) {
                    objF = cVarC.f(f412706c, 0, c.a.f433284a, objF);
                    i12 |= 1;
                } else if (iJ2 == 1) {
                    objF2 = cVarC.f(f412706c, 1, V0.f412822a, objF2);
                    i12 |= 2;
                } else if (iJ2 == 2) {
                    objF3 = cVarC.f(f412706c, 2, V0.f412822a, objF3);
                    i12 |= 4;
                } else if (iJ2 == 3) {
                    objF4 = cVarC.f(f412706c, 3, new C43401f(Y.f412835a), objF4);
                    i12 |= 8;
                } else {
                    if (iJ2 != 4) {
                        throw new UnknownFieldException(iJ2);
                    }
                    objF5 = cVarC.f(f412706c, 4, new C43400e0(Y.f412835a, c.a.f433284a), objF5);
                    i12 |= 16;
                }
            }
            cVarC.d(f412706c);
            return new l(i12, (c) objF, (String) objF2, (String) objF3, (List) objF4, (Map) objF5, (P0) null);
        }

        @Override // kotlinx.serialization.internal.N
        @Y61.k
        public KSerializer<?>[] childSerializers() {
            c.a aVar = c.a.f433284a;
            KSerializer<?> kSerializerA = L51.a.a(aVar);
            V0 v02 = V0.f412822a;
            KSerializer<?> kSerializerA2 = L51.a.a(v02);
            KSerializer<?> kSerializerA3 = L51.a.a(v02);
            Y y12 = Y.f412835a;
            return new KSerializer[]{kSerializerA, kSerializerA2, kSerializerA3, L51.a.a(new C43401f(y12)), L51.a.a(new C43400e0(y12, aVar))};
        }

        @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
        @Y61.k
        /* renamed from: getDescriptor */
        public SerialDescriptor getF412706c() {
            return f433279b;
        }

        @Override // kotlinx.serialization.internal.N
        @Y61.k
        public KSerializer<?>[] typeParametersSerializers() {
            return G0.f412773a;
        }

        @Override // kotlinx.serialization.x
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void serialize(@Y61.k Encoder encoder, @Y61.k l value) {
            SerialDescriptor f412706c = getF412706c();
            kotlinx.serialization.encoding.d dVarC = encoder.c(f412706c);
            l.a(value, dVarC, f412706c);
            dVarC.d(f412706c);
        }
    }

    /* compiled from: RemoteRequiredDoc.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lru/cyberity/cbr/core/data/model/remote/l$b;", "", "Lkotlinx/serialization/KSerializer;", "Lru/cyberity/cbr/core/data/model/remote/l;", "serializer", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: ru.cyberity.cbr.core.data.model.remote.l$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @Y61.k
        public final KSerializer<l> serializer() {
            return a.f433278a;
        }

        private Companion() {
        }
    }

    /* compiled from: RemoteRequiredDoc.kt */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 22\u00020\u0001:\u0002\u0016\u0019B=\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nBQ\b\u0017\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0001\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ(\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013HÇ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0018\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJF\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u001aJ\u0010\u0010 \u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010&\u0012\u0004\b(\u0010)\u001a\u0004\b'\u0010\u0018R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010*\u0012\u0004\b,\u0010)\u001a\u0004\b+\u0010\u001aR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010*\u0012\u0004\b.\u0010)\u001a\u0004\b-\u0010\u001aR(\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010/\u0012\u0004\b1\u0010)\u001a\u0004\b0\u0010\u001d¨\u00063"}, d2 = {"Lru/cyberity/cbr/core/data/model/remote/l$c;", "", "Lru/cyberity/cbr/core/data/model/ReviewAnswerType;", "answer", "", "moderationComment", "clientComment", "", "rejectLabels", "<init>", "(Lru/cyberity/cbr/core/data/model/ReviewAnswerType;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "seen1", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "(ILru/cyberity/cbr/core/data/model/ReviewAnswerType;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/P0;)V", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lkotlin/G0;", "a", "(Lru/cyberity/cbr/core/data/model/remote/l$c;Lkotlinx/serialization/encoding/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "()Lru/cyberity/cbr/core/data/model/ReviewAnswerType;", "b", "()Ljava/lang/String;", "c", "d", "()Ljava/util/List;", "(Lru/cyberity/cbr/core/data/model/ReviewAnswerType;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lru/cyberity/cbr/core/data/model/remote/l$c;", "toString", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Lru/cyberity/cbr/core/data/model/ReviewAnswerType;", "e", "getAnswer$annotations", "()V", "Ljava/lang/String;", "i", "getModerationComment$annotations", "g", "getClientComment$annotations", "Ljava/util/List;", "k", "getRejectLabels$annotations", "Companion", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    @w
    public static final /* data */ class c {

        /* renamed from: Companion, reason: from kotlin metadata */
        @Y61.k
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Y61.l
        private final ReviewAnswerType answer;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @Y61.l
        private final String moderationComment;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @Y61.l
        private final String clientComment;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @Y61.l
        private final List<String> rejectLabels;

        /* compiled from: RemoteRequiredDoc.kt */
        @Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000b\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"ru/cyberity/cbr/core/data/model/remote/RemoteRequiredDoc.ReviewResult.$serializer", "Lkotlinx/serialization/internal/N;", "Lru/cyberity/cbr/core/data/model/remote/l$c;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "a", "(Lkotlinx/serialization/encoding/Decoder;)Lru/cyberity/cbr/core/data/model/remote/l$c;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlin/G0;", "(Lkotlinx/serialization/encoding/Encoder;Lru/cyberity/cbr/core/data/model/remote/l$c;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
        @InterfaceC42830m
        public static final class a implements N<c> {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final a f433284a;

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ SerialDescriptor f433285b;

            static {
                a aVar = new a();
                f433284a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.cyberity.cbr.core.data.model.remote.RemoteRequiredDoc.ReviewResult", aVar, 4);
                pluginGeneratedSerialDescriptor.j("reviewAnswer", true);
                pluginGeneratedSerialDescriptor.j("moderationComment", true);
                pluginGeneratedSerialDescriptor.j("clientComment", true);
                pluginGeneratedSerialDescriptor.j("rejectLabels", true);
                f433285b = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            @Override // kotlinx.serialization.InterfaceC43386e
            @Y61.k
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public c deserialize(@Y61.k Decoder decoder) {
                SerialDescriptor f412706c = getF412706c();
                kotlinx.serialization.encoding.c cVarC = decoder.c(f412706c);
                Object objF = null;
                boolean z12 = true;
                int i12 = 0;
                Object objF2 = null;
                Object objF3 = null;
                Object objF4 = null;
                while (z12) {
                    int iJ2 = cVarC.j(f412706c);
                    if (iJ2 == -1) {
                        z12 = false;
                    } else if (iJ2 == 0) {
                        objF = cVarC.f(f412706c, 0, ReviewAnswerType.a.f433000a, objF);
                        i12 |= 1;
                    } else if (iJ2 == 1) {
                        objF2 = cVarC.f(f412706c, 1, V0.f412822a, objF2);
                        i12 |= 2;
                    } else if (iJ2 == 2) {
                        objF3 = cVarC.f(f412706c, 2, V0.f412822a, objF3);
                        i12 |= 4;
                    } else {
                        if (iJ2 != 3) {
                            throw new UnknownFieldException(iJ2);
                        }
                        objF4 = cVarC.f(f412706c, 3, new C43401f(V0.f412822a), objF4);
                        i12 |= 8;
                    }
                }
                cVarC.d(f412706c);
                return new c(i12, (ReviewAnswerType) objF, (String) objF2, (String) objF3, (List) objF4, (P0) null);
            }

            @Override // kotlinx.serialization.internal.N
            @Y61.k
            public KSerializer<?>[] childSerializers() {
                KSerializer<?> kSerializerA = L51.a.a(ReviewAnswerType.a.f433000a);
                V0 v02 = V0.f412822a;
                return new KSerializer[]{kSerializerA, L51.a.a(v02), L51.a.a(v02), L51.a.a(new C43401f(v02))};
            }

            @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
            @Y61.k
            /* renamed from: getDescriptor */
            public SerialDescriptor getF412706c() {
                return f433285b;
            }

            @Override // kotlinx.serialization.internal.N
            @Y61.k
            public KSerializer<?>[] typeParametersSerializers() {
                return G0.f412773a;
            }

            @Override // kotlinx.serialization.x
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public void serialize(@Y61.k Encoder encoder, @Y61.k c value) {
                SerialDescriptor f412706c = getF412706c();
                kotlinx.serialization.encoding.d dVarC = encoder.c(f412706c);
                c.a(value, dVarC, f412706c);
                dVarC.d(f412706c);
            }
        }

        /* compiled from: RemoteRequiredDoc.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lru/cyberity/cbr/core/data/model/remote/l$c$b;", "", "Lkotlinx/serialization/KSerializer;", "Lru/cyberity/cbr/core/data/model/remote/l$c;", "serializer", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
        /* renamed from: ru.cyberity.cbr.core.data.model.remote.l$c$b, reason: from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(C42822w c42822w) {
                this();
            }

            @Y61.k
            public final KSerializer<c> serializer() {
                return a.f433284a;
            }

            private Companion() {
            }
        }

        public c() {
            this((ReviewAnswerType) null, (String) null, (String) null, (List) null, 15, (C42822w) null);
        }

        @Y61.l
        /* renamed from: a, reason: from getter */
        public final ReviewAnswerType getAnswer() {
            return this.answer;
        }

        @Y61.l
        /* renamed from: b, reason: from getter */
        public final String getModerationComment() {
            return this.moderationComment;
        }

        @Y61.l
        /* renamed from: c, reason: from getter */
        public final String getClientComment() {
            return this.clientComment;
        }

        @Y61.l
        public final List<String> d() {
            return this.rejectLabels;
        }

        @Y61.l
        public final ReviewAnswerType e() {
            return this.answer;
        }

        public boolean equals(@Y61.l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return this.answer == cVar.answer && L.f(this.moderationComment, cVar.moderationComment) && L.f(this.clientComment, cVar.clientComment) && L.f(this.rejectLabels, cVar.rejectLabels);
        }

        @Y61.l
        public final String g() {
            return this.clientComment;
        }

        public int hashCode() {
            ReviewAnswerType reviewAnswerType = this.answer;
            int iHashCode = (reviewAnswerType == null ? 0 : reviewAnswerType.hashCode()) * 31;
            String str = this.moderationComment;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.clientComment;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            List<String> list = this.rejectLabels;
            return iHashCode3 + (list != null ? list.hashCode() : 0);
        }

        @Y61.l
        public final String i() {
            return this.moderationComment;
        }

        @Y61.l
        public final List<String> k() {
            return this.rejectLabels;
        }

        @Y61.k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("ReviewResult(answer=");
            sb2.append(this.answer);
            sb2.append(", moderationComment=");
            sb2.append(this.moderationComment);
            sb2.append(", clientComment=");
            sb2.append(this.clientComment);
            sb2.append(", rejectLabels=");
            return H.p(sb2, this.rejectLabels, ')');
        }

        @InterfaceC42830m
        public /* synthetic */ c(int i12, @v ReviewAnswerType reviewAnswerType, @v String str, @v String str2, @v List list, P0 p02) {
            if ((i12 & 1) == 0) {
                this.answer = null;
            } else {
                this.answer = reviewAnswerType;
            }
            if ((i12 & 2) == 0) {
                this.moderationComment = null;
            } else {
                this.moderationComment = str;
            }
            if ((i12 & 4) == 0) {
                this.clientComment = null;
            } else {
                this.clientComment = str2;
            }
            if ((i12 & 8) == 0) {
                this.rejectLabels = null;
            } else {
                this.rejectLabels = list;
            }
        }

        @Y61.k
        public final c a(@Y61.l ReviewAnswerType answer, @Y61.l String moderationComment, @Y61.l String clientComment, @Y61.l List<String> rejectLabels) {
            return new c(answer, moderationComment, clientComment, rejectLabels);
        }

        public c(@Y61.l ReviewAnswerType reviewAnswerType, @Y61.l String str, @Y61.l String str2, @Y61.l List<String> list) {
            this.answer = reviewAnswerType;
            this.moderationComment = str;
            this.clientComment = str2;
            this.rejectLabels = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ c a(c cVar, ReviewAnswerType reviewAnswerType, String str, String str2, List list, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                reviewAnswerType = cVar.answer;
            }
            if ((i12 & 2) != 0) {
                str = cVar.moderationComment;
            }
            if ((i12 & 4) != 0) {
                str2 = cVar.clientComment;
            }
            if ((i12 & 8) != 0) {
                list = cVar.rejectLabels;
            }
            return cVar.a(reviewAnswerType, str, str2, list);
        }

        @X41.n
        public static final void a(@Y61.k c self, @Y61.k kotlinx.serialization.encoding.d output, @Y61.k SerialDescriptor serialDesc) {
            if (output.u() || self.answer != null) {
                output.p(serialDesc, 0, ReviewAnswerType.a.f433000a, self.answer);
            }
            if (output.u() || self.moderationComment != null) {
                output.p(serialDesc, 1, V0.f412822a, self.moderationComment);
            }
            if (output.u() || self.clientComment != null) {
                output.p(serialDesc, 2, V0.f412822a, self.clientComment);
            }
            if (!output.u() && self.rejectLabels == null) {
                return;
            }
            output.p(serialDesc, 3, new C43401f(V0.f412822a), self.rejectLabels);
        }

        public /* synthetic */ c(ReviewAnswerType reviewAnswerType, String str, String str2, List list, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : reviewAnswerType, (i12 & 2) != 0 ? null : str, (i12 & 4) != 0 ? null : str2, (i12 & 8) != 0 ? null : list);
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

    public l() {
        this((c) null, (String) null, (String) null, (List) null, (Map) null, 31, (C42822w) null);
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final c getReviewResult() {
        return this.reviewResult;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final String getIdentity() {
        return this.identity;
    }

    @Y61.l
    public final List<Integer> d() {
        return this.imageIds;
    }

    @Y61.l
    public final Map<Integer, c> e() {
        return this.imageReviewResults;
    }

    public boolean equals(@Y61.l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof l)) {
            return false;
        }
        l lVar = (l) other;
        return L.f(this.reviewResult, lVar.reviewResult) && L.f(this.country, lVar.country) && L.f(this.identity, lVar.identity) && L.f(this.imageIds, lVar.imageIds) && L.f(this.imageReviewResults, lVar.imageReviewResults);
    }

    @Y61.l
    public final String f() {
        return this.country;
    }

    @Y61.l
    public final String h() {
        return this.identity;
    }

    public int hashCode() {
        c cVar = this.reviewResult;
        int iHashCode = (cVar == null ? 0 : cVar.hashCode()) * 31;
        String str = this.country;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.identity;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<Integer> list = this.imageIds;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        Map<Integer, c> map = this.imageReviewResults;
        return iHashCode4 + (map != null ? map.hashCode() : 0);
    }

    @Y61.l
    public final List<Integer> j() {
        return this.imageIds;
    }

    @Y61.l
    public final Map<Integer, c> l() {
        return this.imageReviewResults;
    }

    @Y61.l
    public final c n() {
        return this.reviewResult;
    }

    @Y61.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("RemoteRequiredDoc(reviewResult=");
        sb2.append(this.reviewResult);
        sb2.append(", country=");
        sb2.append(this.country);
        sb2.append(", identity=");
        sb2.append(this.identity);
        sb2.append(", imageIds=");
        sb2.append(this.imageIds);
        sb2.append(", imageReviewResults=");
        return r.w(sb2, this.imageReviewResults, ')');
    }

    @InterfaceC42830m
    public /* synthetic */ l(int i12, @v c cVar, @v String str, @v String str2, @v List list, @v Map map, P0 p02) {
        if ((i12 & 1) == 0) {
            this.reviewResult = null;
        } else {
            this.reviewResult = cVar;
        }
        if ((i12 & 2) == 0) {
            this.country = null;
        } else {
            this.country = str;
        }
        if ((i12 & 4) == 0) {
            this.identity = null;
        } else {
            this.identity = str2;
        }
        if ((i12 & 8) == 0) {
            this.imageIds = null;
        } else {
            this.imageIds = list;
        }
        if ((i12 & 16) == 0) {
            this.imageReviewResults = null;
        } else {
            this.imageReviewResults = map;
        }
    }

    @Y61.k
    public final l a(@Y61.l c reviewResult, @Y61.l String country, @Y61.l String identity, @Y61.l List<Integer> imageIds, @Y61.l Map<Integer, c> imageReviewResults) {
        return new l(reviewResult, country, identity, imageIds, imageReviewResults);
    }

    public l(@Y61.l c cVar, @Y61.l String str, @Y61.l String str2, @Y61.l List<Integer> list, @Y61.l Map<Integer, c> map) {
        this.reviewResult = cVar;
        this.country = str;
        this.identity = str2;
        this.imageIds = list;
        this.imageReviewResults = map;
    }

    public static /* synthetic */ l a(l lVar, c cVar, String str, String str2, List list, Map map, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            cVar = lVar.reviewResult;
        }
        if ((i12 & 2) != 0) {
            str = lVar.country;
        }
        String str3 = str;
        if ((i12 & 4) != 0) {
            str2 = lVar.identity;
        }
        String str4 = str2;
        if ((i12 & 8) != 0) {
            list = lVar.imageIds;
        }
        List list2 = list;
        if ((i12 & 16) != 0) {
            map = lVar.imageReviewResults;
        }
        return lVar.a(cVar, str3, str4, list2, map);
    }

    @X41.n
    public static final void a(@Y61.k l self, @Y61.k kotlinx.serialization.encoding.d output, @Y61.k SerialDescriptor serialDesc) {
        if (output.u() || self.reviewResult != null) {
            output.p(serialDesc, 0, c.a.f433284a, self.reviewResult);
        }
        if (output.u() || self.country != null) {
            output.p(serialDesc, 1, V0.f412822a, self.country);
        }
        if (output.u() || self.identity != null) {
            output.p(serialDesc, 2, V0.f412822a, self.identity);
        }
        if (output.u() || self.imageIds != null) {
            output.p(serialDesc, 3, new C43401f(Y.f412835a), self.imageIds);
        }
        if (!output.u() && self.imageReviewResults == null) {
            return;
        }
        output.p(serialDesc, 4, new C43400e0(Y.f412835a, c.a.f433284a), self.imageReviewResults);
    }

    public /* synthetic */ l(c cVar, String str, String str2, List list, Map map, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : cVar, (i12 & 2) != 0 ? null : str, (i12 & 4) != 0 ? null : str2, (i12 & 8) != 0 ? null : list, (i12 & 16) != 0 ? null : map);
    }

    @v
    public static /* synthetic */ void g() {
    }

    @v
    public static /* synthetic */ void i() {
    }

    @v
    public static /* synthetic */ void k() {
    }

    @v
    public static /* synthetic */ void m() {
    }

    @v
    public static /* synthetic */ void o() {
    }
}
