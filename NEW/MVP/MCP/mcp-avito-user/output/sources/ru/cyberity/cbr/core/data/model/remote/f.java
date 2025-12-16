package ru.cyberity.cbr.core.data.model.remote;

import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.AvatarStatus;
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
import kotlinx.serialization.internal.C43407i;
import kotlinx.serialization.internal.E0;
import kotlinx.serialization.internal.G0;
import kotlinx.serialization.internal.N;
import kotlinx.serialization.internal.P0;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.V0;
import kotlinx.serialization.internal.Y;
import kotlinx.serialization.v;
import kotlinx.serialization.w;
import ru.cyberity.cbr.core.data.model.DocumentType;
import ru.cyberity.cbr.core.data.model.FlowActionType;
import ru.cyberity.cbr.core.data.model.VideoRequiredType;
import ru.cyberity.cbr.core.data.serializer.FlowActionTypeSerializer;

/* compiled from: RemoteAction.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0087\b\u0018\u0000 A2\u00020\u0001:\u0004\u001a\u001d\u001e B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eBo\b\u0017\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J(\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017HÇ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001cJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001cJ\u0010\u0010\"\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b$\u0010%JV\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u001a\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010\u001cJ\u0010\u0010(\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010.\u0012\u0004\b0\u00101\u001a\u0004\b/\u0010\u001cR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010.\u0012\u0004\b3\u00101\u001a\u0004\b2\u0010\u001cR \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001e\u00104\u0012\u0004\b6\u00101\u001a\u0004\b5\u0010\u001fR \u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b \u0010.\u0012\u0004\b8\u00101\u001a\u0004\b7\u0010\u001cR \u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b!\u0010.\u0012\u0004\b:\u00101\u001a\u0004\b9\u0010\u001cR \u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\"\u0010;\u0012\u0004\b=\u00101\u001a\u0004\b<\u0010#R \u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b$\u0010>\u0012\u0004\b@\u00101\u001a\u0004\b?\u0010%¨\u0006B"}, d2 = {"Lru/cyberity/cbr/core/data/model/remote/f;", "", "", "id", "applicantId", "Lru/cyberity/cbr/core/data/model/FlowActionType;", "type", "createdAt", "externalActionId", "Lru/cyberity/cbr/core/data/model/remote/f$c;", "requiredIdDocs", "Lru/cyberity/cbr/core/data/model/remote/f$d;", AvatarStatus.REVIEW, "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/cyberity/cbr/core/data/model/FlowActionType;Ljava/lang/String;Ljava/lang/String;Lru/cyberity/cbr/core/data/model/remote/f$c;Lru/cyberity/cbr/core/data/model/remote/f$d;)V", "", "seen1", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lru/cyberity/cbr/core/data/model/FlowActionType;Ljava/lang/String;Ljava/lang/String;Lru/cyberity/cbr/core/data/model/remote/f$c;Lru/cyberity/cbr/core/data/model/remote/f$d;Lkotlinx/serialization/internal/P0;)V", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lkotlin/G0;", "a", "(Lru/cyberity/cbr/core/data/model/remote/f;Lkotlinx/serialization/encoding/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "()Ljava/lang/String;", "b", "c", "()Lru/cyberity/cbr/core/data/model/FlowActionType;", "d", "e", "f", "()Lru/cyberity/cbr/core/data/model/remote/f$c;", "g", "()Lru/cyberity/cbr/core/data/model/remote/f$d;", "(Ljava/lang/String;Ljava/lang/String;Lru/cyberity/cbr/core/data/model/FlowActionType;Ljava/lang/String;Ljava/lang/String;Lru/cyberity/cbr/core/data/model/remote/f$c;Lru/cyberity/cbr/core/data/model/remote/f$d;)Lru/cyberity/cbr/core/data/model/remote/f;", "toString", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "n", "getId$annotations", "()V", "h", "getApplicantId$annotations", "Lru/cyberity/cbr/core/data/model/FlowActionType;", "t", "getType$annotations", "j", "getCreatedAt$annotations", "l", "getExternalActionId$annotations", "Lru/cyberity/cbr/core/data/model/remote/f$c;", "p", "getRequiredIdDocs$annotations", "Lru/cyberity/cbr/core/data/model/remote/f$d;", "r", "getReview$annotations", "Companion", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
@w
/* loaded from: classes9.dex */
public final /* data */ class f {

    /* renamed from: Companion, reason: from kotlin metadata */
    @Y61.k
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final String id;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final String applicantId;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final FlowActionType type;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final String createdAt;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final String externalActionId;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final c requiredIdDocs;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final d review;

    /* compiled from: RemoteAction.kt */
    @Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000b\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"ru/cyberity/cbr/core/data/model/remote/RemoteAction.$serializer", "Lkotlinx/serialization/internal/N;", "Lru/cyberity/cbr/core/data/model/remote/f;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "a", "(Lkotlinx/serialization/encoding/Decoder;)Lru/cyberity/cbr/core/data/model/remote/f;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlin/G0;", "(Lkotlinx/serialization/encoding/Encoder;Lru/cyberity/cbr/core/data/model/remote/f;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    @InterfaceC42830m
    public static final class a implements N<f> {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final a f433222a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ SerialDescriptor f433223b;

        static {
            a aVar = new a();
            f433222a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.cyberity.cbr.core.data.model.remote.RemoteAction", aVar, 7);
            pluginGeneratedSerialDescriptor.j("id", false);
            pluginGeneratedSerialDescriptor.j("applicantId", false);
            pluginGeneratedSerialDescriptor.j("type", false);
            pluginGeneratedSerialDescriptor.j("createdAt", false);
            pluginGeneratedSerialDescriptor.j("externalActionId", false);
            pluginGeneratedSerialDescriptor.j("requiredIdDocs", false);
            pluginGeneratedSerialDescriptor.j(AvatarStatus.REVIEW, false);
            f433223b = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // kotlinx.serialization.InterfaceC43386e
        @Y61.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public f deserialize(@Y61.k Decoder decoder) {
            SerialDescriptor f412706c = getF412706c();
            kotlinx.serialization.encoding.c cVarC = decoder.c(f412706c);
            Object objV = null;
            boolean z12 = true;
            int i12 = 0;
            Object objV2 = null;
            Object objV3 = null;
            String strS = null;
            String strS2 = null;
            String strS3 = null;
            String strS4 = null;
            while (z12) {
                int iJ2 = cVarC.j(f412706c);
                switch (iJ2) {
                    case -1:
                        z12 = false;
                        break;
                    case 0:
                        strS = cVarC.s(f412706c, 0);
                        i12 |= 1;
                        break;
                    case 1:
                        strS2 = cVarC.s(f412706c, 1);
                        i12 |= 2;
                        break;
                    case 2:
                        objV = cVarC.v(f412706c, 2, FlowActionTypeSerializer.INSTANCE, objV);
                        i12 |= 4;
                        break;
                    case 3:
                        strS3 = cVarC.s(f412706c, 3);
                        i12 |= 8;
                        break;
                    case 4:
                        strS4 = cVarC.s(f412706c, 4);
                        i12 |= 16;
                        break;
                    case 5:
                        objV2 = cVarC.v(f412706c, 5, c.a.f433225a, objV2);
                        i12 |= 32;
                        break;
                    case 6:
                        objV3 = cVarC.v(f412706c, 6, d.a.f433237a, objV3);
                        i12 |= 64;
                        break;
                    default:
                        throw new UnknownFieldException(iJ2);
                }
            }
            cVarC.d(f412706c);
            return new f(i12, strS, strS2, (FlowActionType) objV, strS3, strS4, (c) objV2, (d) objV3, null);
        }

        @Override // kotlinx.serialization.internal.N
        @Y61.k
        public KSerializer<?>[] childSerializers() {
            V0 v02 = V0.f412822a;
            return new KSerializer[]{v02, v02, FlowActionTypeSerializer.INSTANCE, v02, v02, c.a.f433225a, d.a.f433237a};
        }

        @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
        @Y61.k
        /* renamed from: getDescriptor */
        public SerialDescriptor getF412706c() {
            return f433223b;
        }

        @Override // kotlinx.serialization.internal.N
        @Y61.k
        public KSerializer<?>[] typeParametersSerializers() {
            return G0.f412773a;
        }

        @Override // kotlinx.serialization.x
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void serialize(@Y61.k Encoder encoder, @Y61.k f value) {
            SerialDescriptor f412706c = getF412706c();
            kotlinx.serialization.encoding.d dVarC = encoder.c(f412706c);
            f.a(value, dVarC, f412706c);
            dVarC.d(f412706c);
        }
    }

    /* compiled from: RemoteAction.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lru/cyberity/cbr/core/data/model/remote/f$b;", "", "Lkotlinx/serialization/KSerializer;", "Lru/cyberity/cbr/core/data/model/remote/f;", "serializer", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: ru.cyberity.cbr.core.data.model.remote.f$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @Y61.k
        public final KSerializer<f> serializer() {
            return a.f433222a;
        }

        private Companion() {
        }
    }

    /* compiled from: RemoteAction.kt */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0003\u0012 $B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B-\b\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0010\b\u0001\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ(\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fHÇ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0014J \u0010\u0012\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u001f\u0012\u0004\b!\u0010\"\u001a\u0004\b \u0010\u0014¨\u0006%"}, d2 = {"Lru/cyberity/cbr/core/data/model/remote/f$c;", "", "", "Lru/cyberity/cbr/core/data/model/remote/f$c$c;", "docSets", "<init>", "(Ljava/util/List;)V", "", "seen1", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "(ILjava/util/List;Lkotlinx/serialization/internal/P0;)V", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lkotlin/G0;", "a", "(Lru/cyberity/cbr/core/data/model/remote/f$c;Lkotlinx/serialization/encoding/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "()Ljava/util/List;", "(Ljava/util/List;)Lru/cyberity/cbr/core/data/model/remote/f$c;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "b", "getDocSets$annotations", "()V", "Companion", "c", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    @w
    public static final /* data */ class c {

        /* renamed from: Companion, reason: from kotlin metadata */
        @Y61.k
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Y61.k
        private final List<C12456c> docSets;

        /* compiled from: RemoteAction.kt */
        @Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000b\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"ru/cyberity/cbr/core/data/model/remote/RemoteAction.RequiredIdDocs.$serializer", "Lkotlinx/serialization/internal/N;", "Lru/cyberity/cbr/core/data/model/remote/f$c;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "a", "(Lkotlinx/serialization/encoding/Decoder;)Lru/cyberity/cbr/core/data/model/remote/f$c;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlin/G0;", "(Lkotlinx/serialization/encoding/Encoder;Lru/cyberity/cbr/core/data/model/remote/f$c;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
        @InterfaceC42830m
        public static final class a implements N<c> {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final a f433225a;

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ SerialDescriptor f433226b;

            static {
                a aVar = new a();
                f433225a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.cyberity.cbr.core.data.model.remote.RemoteAction.RequiredIdDocs", aVar, 1);
                pluginGeneratedSerialDescriptor.j("docSets", false);
                f433226b = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            @Override // kotlinx.serialization.InterfaceC43386e
            @Y61.k
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public c deserialize(@Y61.k Decoder decoder) {
                SerialDescriptor f412706c = getF412706c();
                kotlinx.serialization.encoding.c cVarC = decoder.c(f412706c);
                P0 p02 = null;
                boolean z12 = true;
                int i12 = 0;
                Object objV = null;
                while (z12) {
                    int iJ2 = cVarC.j(f412706c);
                    if (iJ2 == -1) {
                        z12 = false;
                    } else {
                        if (iJ2 != 0) {
                            throw new UnknownFieldException(iJ2);
                        }
                        objV = cVarC.v(f412706c, 0, new C43401f(C12456c.a.f433230a), objV);
                        i12 = 1;
                    }
                }
                cVarC.d(f412706c);
                return new c(i12, (List) objV, p02);
            }

            @Override // kotlinx.serialization.internal.N
            @Y61.k
            public KSerializer<?>[] childSerializers() {
                return new KSerializer[]{new C43401f(C12456c.a.f433230a)};
            }

            @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
            @Y61.k
            /* renamed from: getDescriptor */
            public SerialDescriptor getF412706c() {
                return f433226b;
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

        /* compiled from: RemoteAction.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lru/cyberity/cbr/core/data/model/remote/f$c$b;", "", "Lkotlinx/serialization/KSerializer;", "Lru/cyberity/cbr/core/data/model/remote/f$c;", "serializer", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
        /* renamed from: ru.cyberity.cbr.core.data.model.remote.f$c$b, reason: from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(C42822w c42822w) {
                this();
            }

            @Y61.k
            public final KSerializer<c> serializer() {
                return a.f433225a;
            }

            private Companion() {
            }
        }

        /* compiled from: RemoteAction.kt */
        @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 02\u00020\u0001:\u0002\u0016\u0019B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nBE\b\u0017\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0001\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ(\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013HÇ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0018J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ4\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010&\u0012\u0004\b(\u0010)\u001a\u0004\b'\u0010\u0018R&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010*\u0012\u0004\b,\u0010)\u001a\u0004\b+\u0010\u001aR \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010-\u0012\u0004\b/\u0010)\u001a\u0004\b.\u0010\u001c¨\u00061"}, d2 = {"Lru/cyberity/cbr/core/data/model/remote/f$c$c;", "", "Lru/cyberity/cbr/core/data/model/DocumentType;", "idDocSetType", "", "", "types", "Lru/cyberity/cbr/core/data/model/VideoRequiredType;", "videoRequired", "<init>", "(Lru/cyberity/cbr/core/data/model/DocumentType;Ljava/util/List;Lru/cyberity/cbr/core/data/model/VideoRequiredType;)V", "", "seen1", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "(ILru/cyberity/cbr/core/data/model/DocumentType;Ljava/util/List;Lru/cyberity/cbr/core/data/model/VideoRequiredType;Lkotlinx/serialization/internal/P0;)V", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lkotlin/G0;", "a", "(Lru/cyberity/cbr/core/data/model/remote/f$c$c;Lkotlinx/serialization/encoding/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "()Lru/cyberity/cbr/core/data/model/DocumentType;", "b", "()Ljava/util/List;", "c", "()Lru/cyberity/cbr/core/data/model/VideoRequiredType;", "(Lru/cyberity/cbr/core/data/model/DocumentType;Ljava/util/List;Lru/cyberity/cbr/core/data/model/VideoRequiredType;)Lru/cyberity/cbr/core/data/model/remote/f$c$c;", "toString", "()Ljava/lang/String;", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Lru/cyberity/cbr/core/data/model/DocumentType;", "d", "getIdDocSetType$annotations", "()V", "Ljava/util/List;", "f", "getTypes$annotations", "Lru/cyberity/cbr/core/data/model/VideoRequiredType;", "h", "getVideoRequired$annotations", "Companion", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
        @w
        /* renamed from: ru.cyberity.cbr.core.data.model.remote.f$c$c, reason: collision with other inner class name */
        public static final /* data */ class C12456c {

            /* renamed from: Companion, reason: from kotlin metadata */
            @Y61.k
            public static final Companion INSTANCE = new Companion(null);

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            @Y61.k
            private final DocumentType idDocSetType;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            @Y61.k
            private final List<String> types;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata */
            @Y61.k
            private final VideoRequiredType videoRequired;

            /* compiled from: RemoteAction.kt */
            @Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000b\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"ru/cyberity/cbr/core/data/model/remote/RemoteAction.RequiredIdDocs.DocSetsItem.$serializer", "Lkotlinx/serialization/internal/N;", "Lru/cyberity/cbr/core/data/model/remote/f$c$c;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "a", "(Lkotlinx/serialization/encoding/Decoder;)Lru/cyberity/cbr/core/data/model/remote/f$c$c;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlin/G0;", "(Lkotlinx/serialization/encoding/Encoder;Lru/cyberity/cbr/core/data/model/remote/f$c$c;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
            @InterfaceC42830m
            /* renamed from: ru.cyberity.cbr.core.data.model.remote.f$c$c$a */
            public static final class a implements N<C12456c> {

                /* renamed from: a, reason: collision with root package name */
                @Y61.k
                public static final a f433230a;

                /* renamed from: b, reason: collision with root package name */
                public static final /* synthetic */ SerialDescriptor f433231b;

                static {
                    a aVar = new a();
                    f433230a = aVar;
                    PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.cyberity.cbr.core.data.model.remote.RemoteAction.RequiredIdDocs.DocSetsItem", aVar, 3);
                    pluginGeneratedSerialDescriptor.j("idDocSetType", false);
                    pluginGeneratedSerialDescriptor.j("types", false);
                    pluginGeneratedSerialDescriptor.j("videoRequired", false);
                    f433231b = pluginGeneratedSerialDescriptor;
                }

                private a() {
                }

                @Override // kotlinx.serialization.InterfaceC43386e
                @Y61.k
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public C12456c deserialize(@Y61.k Decoder decoder) {
                    SerialDescriptor f412706c = getF412706c();
                    kotlinx.serialization.encoding.c cVarC = decoder.c(f412706c);
                    Object objV = null;
                    boolean z12 = true;
                    int i12 = 0;
                    Object objV2 = null;
                    Object objV3 = null;
                    while (z12) {
                        int iJ2 = cVarC.j(f412706c);
                        if (iJ2 == -1) {
                            z12 = false;
                        } else if (iJ2 == 0) {
                            objV = cVarC.v(f412706c, 0, DocumentType.Companion.C12445a.f432990a, objV);
                            i12 |= 1;
                        } else if (iJ2 == 1) {
                            objV2 = cVarC.v(f412706c, 1, new C43401f(V0.f412822a), objV2);
                            i12 |= 2;
                        } else {
                            if (iJ2 != 2) {
                                throw new UnknownFieldException(iJ2);
                            }
                            objV3 = cVarC.v(f412706c, 2, VideoRequiredType.a.f433006a, objV3);
                            i12 |= 4;
                        }
                    }
                    cVarC.d(f412706c);
                    return new C12456c(i12, (DocumentType) objV, (List) objV2, (VideoRequiredType) objV3, null);
                }

                @Override // kotlinx.serialization.internal.N
                @Y61.k
                public KSerializer<?>[] childSerializers() {
                    return new KSerializer[]{DocumentType.Companion.C12445a.f432990a, new C43401f(V0.f412822a), VideoRequiredType.a.f433006a};
                }

                @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
                @Y61.k
                /* renamed from: getDescriptor */
                public SerialDescriptor getF412706c() {
                    return f433231b;
                }

                @Override // kotlinx.serialization.internal.N
                @Y61.k
                public KSerializer<?>[] typeParametersSerializers() {
                    return G0.f412773a;
                }

                @Override // kotlinx.serialization.x
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public void serialize(@Y61.k Encoder encoder, @Y61.k C12456c value) {
                    SerialDescriptor f412706c = getF412706c();
                    kotlinx.serialization.encoding.d dVarC = encoder.c(f412706c);
                    C12456c.a(value, dVarC, f412706c);
                    dVarC.d(f412706c);
                }
            }

            /* compiled from: RemoteAction.kt */
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lru/cyberity/cbr/core/data/model/remote/f$c$c$b;", "", "Lkotlinx/serialization/KSerializer;", "Lru/cyberity/cbr/core/data/model/remote/f$c$c;", "serializer", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
            /* renamed from: ru.cyberity.cbr.core.data.model.remote.f$c$c$b, reason: from kotlin metadata */
            public static final class Companion {
                public /* synthetic */ Companion(C42822w c42822w) {
                    this();
                }

                @Y61.k
                public final KSerializer<C12456c> serializer() {
                    return a.f433230a;
                }

                private Companion() {
                }
            }

            @InterfaceC42830m
            public /* synthetic */ C12456c(int i12, @v DocumentType documentType, @v List list, @v VideoRequiredType videoRequiredType, P0 p02) {
                if (7 != (i12 & 7)) {
                    E0.b(i12, 7, a.f433230a.getF412706c());
                    throw null;
                }
                this.idDocSetType = documentType;
                this.types = list;
                this.videoRequired = videoRequiredType;
            }

            @Y61.k
            /* renamed from: a, reason: from getter */
            public final DocumentType getIdDocSetType() {
                return this.idDocSetType;
            }

            @Y61.k
            public final List<String> b() {
                return this.types;
            }

            @Y61.k
            /* renamed from: c, reason: from getter */
            public final VideoRequiredType getVideoRequired() {
                return this.videoRequired;
            }

            @Y61.k
            public final DocumentType d() {
                return this.idDocSetType;
            }

            public boolean equals(@Y61.l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof C12456c)) {
                    return false;
                }
                C12456c c12456c = (C12456c) other;
                return L.f(this.idDocSetType, c12456c.idDocSetType) && L.f(this.types, c12456c.types) && this.videoRequired == c12456c.videoRequired;
            }

            @Y61.k
            public final List<String> f() {
                return this.types;
            }

            @Y61.k
            public final VideoRequiredType h() {
                return this.videoRequired;
            }

            public int hashCode() {
                return this.videoRequired.hashCode() + H.e(this.idDocSetType.hashCode() * 31, 31, this.types);
            }

            @Y61.k
            public String toString() {
                return "DocSetsItem(idDocSetType=" + this.idDocSetType + ", types=" + this.types + ", videoRequired=" + this.videoRequired + ')';
            }

            public C12456c(@Y61.k DocumentType documentType, @Y61.k List<String> list, @Y61.k VideoRequiredType videoRequiredType) {
                this.idDocSetType = documentType;
                this.types = list;
                this.videoRequired = videoRequiredType;
            }

            @Y61.k
            public final C12456c a(@Y61.k DocumentType idDocSetType, @Y61.k List<String> types, @Y61.k VideoRequiredType videoRequired) {
                return new C12456c(idDocSetType, types, videoRequired);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ C12456c a(C12456c c12456c, DocumentType documentType, List list, VideoRequiredType videoRequiredType, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    documentType = c12456c.idDocSetType;
                }
                if ((i12 & 2) != 0) {
                    list = c12456c.types;
                }
                if ((i12 & 4) != 0) {
                    videoRequiredType = c12456c.videoRequired;
                }
                return c12456c.a(documentType, (List<String>) list, videoRequiredType);
            }

            @X41.n
            public static final void a(@Y61.k C12456c self, @Y61.k kotlinx.serialization.encoding.d output, @Y61.k SerialDescriptor serialDesc) {
                output.F(serialDesc, 0, DocumentType.Companion.C12445a.f432990a, self.idDocSetType);
                output.F(serialDesc, 1, new C43401f(V0.f412822a), self.types);
                output.F(serialDesc, 2, VideoRequiredType.a.f433006a, self.videoRequired);
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

        @InterfaceC42830m
        public /* synthetic */ c(int i12, @v List list, P0 p02) {
            if (1 == (i12 & 1)) {
                this.docSets = list;
            } else {
                E0.b(i12, 1, a.f433225a.getF412706c());
                throw null;
            }
        }

        @Y61.k
        public final List<C12456c> a() {
            return this.docSets;
        }

        @Y61.k
        public final List<C12456c> b() {
            return this.docSets;
        }

        public boolean equals(@Y61.l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof c) && L.f(this.docSets, ((c) other).docSets);
        }

        public int hashCode() {
            return this.docSets.hashCode();
        }

        @Y61.k
        public String toString() {
            return H.p(new StringBuilder("RequiredIdDocs(docSets="), this.docSets, ')');
        }

        public c(@Y61.k List<C12456c> list) {
            this.docSets = list;
        }

        @Y61.k
        public final c a(@Y61.k List<C12456c> docSets) {
            return new c(docSets);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ c a(c cVar, List list, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                list = cVar.docSets;
            }
            return cVar.a(list);
        }

        @X41.n
        public static final void a(@Y61.k c self, @Y61.k kotlinx.serialization.encoding.d output, @Y61.k SerialDescriptor serialDesc) {
            output.F(serialDesc, 0, new C43401f(C12456c.a.f433230a), self.docSets);
        }

        @v
        public static /* synthetic */ void c() {
        }
    }

    /* compiled from: RemoteAction.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \b\u0087\b\u0018\u0000 42\u00020\u0001:\u0002\u0016\u0019BC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bBW\b\u0017\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\n\u0010\u000fJ(\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013HÇ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0018J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJL\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b \u0010\u001cJ\u0010\u0010!\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010$\u001a\u00020\u00022\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010&\u0012\u0004\b(\u0010)\u001a\u0004\b'\u0010\u0018R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010*\u0012\u0004\b,\u0010)\u001a\u0004\b+\u0010\u001aR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010-\u0012\u0004\b/\u0010)\u001a\u0004\b.\u0010\u001cR\"\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010&\u0012\u0004\b1\u0010)\u001a\u0004\b0\u0010\u0018R\"\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010-\u0012\u0004\b3\u0010)\u001a\u0004\b2\u0010\u001c¨\u00065"}, d2 = {"Lru/cyberity/cbr/core/data/model/remote/f$d;", "", "", "reprocessing", "", "notificationFailureCnt", "", "reviewStatus", "autoChecked", "createDate", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V", "seen1", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lkotlinx/serialization/internal/P0;)V", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lkotlin/G0;", "a", "(Lru/cyberity/cbr/core/data/model/remote/f$d;Lkotlinx/serialization/encoding/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "()Ljava/lang/Boolean;", "b", "()Ljava/lang/Integer;", "c", "()Ljava/lang/String;", "d", "e", "(Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)Lru/cyberity/cbr/core/data/model/remote/f$d;", "toString", "hashCode", "()I", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Boolean;", "l", "getReprocessing$annotations", "()V", "Ljava/lang/Integer;", "j", "getNotificationFailureCnt$annotations", "Ljava/lang/String;", "n", "getReviewStatus$annotations", "f", "getAutoChecked$annotations", "h", "getCreateDate$annotations", "Companion", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    @w
    public static final /* data */ class d {

        /* renamed from: Companion, reason: from kotlin metadata */
        @Y61.k
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Y61.l
        private final Boolean reprocessing;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @Y61.l
        private final Integer notificationFailureCnt;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @Y61.l
        private final String reviewStatus;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @Y61.l
        private final Boolean autoChecked;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        @Y61.l
        private final String createDate;

        /* compiled from: RemoteAction.kt */
        @Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000b\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"ru/cyberity/cbr/core/data/model/remote/RemoteAction.Review.$serializer", "Lkotlinx/serialization/internal/N;", "Lru/cyberity/cbr/core/data/model/remote/f$d;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "a", "(Lkotlinx/serialization/encoding/Decoder;)Lru/cyberity/cbr/core/data/model/remote/f$d;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlin/G0;", "(Lkotlinx/serialization/encoding/Encoder;Lru/cyberity/cbr/core/data/model/remote/f$d;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
        @InterfaceC42830m
        public static final class a implements N<d> {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final a f433237a;

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ SerialDescriptor f433238b;

            static {
                a aVar = new a();
                f433237a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.cyberity.cbr.core.data.model.remote.RemoteAction.Review", aVar, 5);
                pluginGeneratedSerialDescriptor.j("reprocessing", true);
                pluginGeneratedSerialDescriptor.j("notificationFailureCnt", true);
                pluginGeneratedSerialDescriptor.j("reviewStatus", true);
                pluginGeneratedSerialDescriptor.j("autoChecked", true);
                pluginGeneratedSerialDescriptor.j("createDate", true);
                f433238b = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            @Override // kotlinx.serialization.InterfaceC43386e
            @Y61.k
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public d deserialize(@Y61.k Decoder decoder) {
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
                        objF = cVarC.f(f412706c, 0, C43407i.f412866a, objF);
                        i12 |= 1;
                    } else if (iJ2 == 1) {
                        objF2 = cVarC.f(f412706c, 1, Y.f412835a, objF2);
                        i12 |= 2;
                    } else if (iJ2 == 2) {
                        objF3 = cVarC.f(f412706c, 2, V0.f412822a, objF3);
                        i12 |= 4;
                    } else if (iJ2 == 3) {
                        objF4 = cVarC.f(f412706c, 3, C43407i.f412866a, objF4);
                        i12 |= 8;
                    } else {
                        if (iJ2 != 4) {
                            throw new UnknownFieldException(iJ2);
                        }
                        objF5 = cVarC.f(f412706c, 4, V0.f412822a, objF5);
                        i12 |= 16;
                    }
                }
                cVarC.d(f412706c);
                return new d(i12, (Boolean) objF, (Integer) objF2, (String) objF3, (Boolean) objF4, (String) objF5, (P0) null);
            }

            @Override // kotlinx.serialization.internal.N
            @Y61.k
            public KSerializer<?>[] childSerializers() {
                C43407i c43407i = C43407i.f412866a;
                KSerializer<?> kSerializerA = L51.a.a(c43407i);
                KSerializer<?> kSerializerA2 = L51.a.a(Y.f412835a);
                V0 v02 = V0.f412822a;
                return new KSerializer[]{kSerializerA, kSerializerA2, L51.a.a(v02), L51.a.a(c43407i), L51.a.a(v02)};
            }

            @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
            @Y61.k
            /* renamed from: getDescriptor */
            public SerialDescriptor getF412706c() {
                return f433238b;
            }

            @Override // kotlinx.serialization.internal.N
            @Y61.k
            public KSerializer<?>[] typeParametersSerializers() {
                return G0.f412773a;
            }

            @Override // kotlinx.serialization.x
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public void serialize(@Y61.k Encoder encoder, @Y61.k d value) {
                SerialDescriptor f412706c = getF412706c();
                kotlinx.serialization.encoding.d dVarC = encoder.c(f412706c);
                d.a(value, dVarC, f412706c);
                dVarC.d(f412706c);
            }
        }

        /* compiled from: RemoteAction.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lru/cyberity/cbr/core/data/model/remote/f$d$b;", "", "Lkotlinx/serialization/KSerializer;", "Lru/cyberity/cbr/core/data/model/remote/f$d;", "serializer", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
        /* renamed from: ru.cyberity.cbr.core.data.model.remote.f$d$b, reason: from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(C42822w c42822w) {
                this();
            }

            @Y61.k
            public final KSerializer<d> serializer() {
                return a.f433237a;
            }

            private Companion() {
            }
        }

        public d() {
            this((Boolean) null, (Integer) null, (String) null, (Boolean) null, (String) null, 31, (C42822w) null);
        }

        @Y61.l
        /* renamed from: a, reason: from getter */
        public final Boolean getReprocessing() {
            return this.reprocessing;
        }

        @Y61.l
        /* renamed from: b, reason: from getter */
        public final Integer getNotificationFailureCnt() {
            return this.notificationFailureCnt;
        }

        @Y61.l
        /* renamed from: c, reason: from getter */
        public final String getReviewStatus() {
            return this.reviewStatus;
        }

        @Y61.l
        /* renamed from: d, reason: from getter */
        public final Boolean getAutoChecked() {
            return this.autoChecked;
        }

        @Y61.l
        /* renamed from: e, reason: from getter */
        public final String getCreateDate() {
            return this.createDate;
        }

        public boolean equals(@Y61.l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof d)) {
                return false;
            }
            d dVar = (d) other;
            return L.f(this.reprocessing, dVar.reprocessing) && L.f(this.notificationFailureCnt, dVar.notificationFailureCnt) && L.f(this.reviewStatus, dVar.reviewStatus) && L.f(this.autoChecked, dVar.autoChecked) && L.f(this.createDate, dVar.createDate);
        }

        @Y61.l
        public final Boolean f() {
            return this.autoChecked;
        }

        @Y61.l
        public final String h() {
            return this.createDate;
        }

        public int hashCode() {
            Boolean bool = this.reprocessing;
            int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            Integer num = this.notificationFailureCnt;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            String str = this.reviewStatus;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            Boolean bool2 = this.autoChecked;
            int iHashCode4 = (iHashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            String str2 = this.createDate;
            return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
        }

        @Y61.l
        public final Integer j() {
            return this.notificationFailureCnt;
        }

        @Y61.l
        public final Boolean l() {
            return this.reprocessing;
        }

        @Y61.l
        public final String n() {
            return this.reviewStatus;
        }

        @Y61.k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Review(reprocessing=");
            sb2.append(this.reprocessing);
            sb2.append(", notificationFailureCnt=");
            sb2.append(this.notificationFailureCnt);
            sb2.append(", reviewStatus=");
            sb2.append(this.reviewStatus);
            sb2.append(", autoChecked=");
            sb2.append(this.autoChecked);
            sb2.append(", createDate=");
            return C22026a.c(sb2, this.createDate, ')');
        }

        @InterfaceC42830m
        public /* synthetic */ d(int i12, @v Boolean bool, @v Integer num, @v String str, @v Boolean bool2, @v String str2, P0 p02) {
            if ((i12 & 1) == 0) {
                this.reprocessing = null;
            } else {
                this.reprocessing = bool;
            }
            if ((i12 & 2) == 0) {
                this.notificationFailureCnt = null;
            } else {
                this.notificationFailureCnt = num;
            }
            if ((i12 & 4) == 0) {
                this.reviewStatus = null;
            } else {
                this.reviewStatus = str;
            }
            if ((i12 & 8) == 0) {
                this.autoChecked = null;
            } else {
                this.autoChecked = bool2;
            }
            if ((i12 & 16) == 0) {
                this.createDate = null;
            } else {
                this.createDate = str2;
            }
        }

        @Y61.k
        public final d a(@Y61.l Boolean reprocessing, @Y61.l Integer notificationFailureCnt, @Y61.l String reviewStatus, @Y61.l Boolean autoChecked, @Y61.l String createDate) {
            return new d(reprocessing, notificationFailureCnt, reviewStatus, autoChecked, createDate);
        }

        public d(@Y61.l Boolean bool, @Y61.l Integer num, @Y61.l String str, @Y61.l Boolean bool2, @Y61.l String str2) {
            this.reprocessing = bool;
            this.notificationFailureCnt = num;
            this.reviewStatus = str;
            this.autoChecked = bool2;
            this.createDate = str2;
        }

        public static /* synthetic */ d a(d dVar, Boolean bool, Integer num, String str, Boolean bool2, String str2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                bool = dVar.reprocessing;
            }
            if ((i12 & 2) != 0) {
                num = dVar.notificationFailureCnt;
            }
            Integer num2 = num;
            if ((i12 & 4) != 0) {
                str = dVar.reviewStatus;
            }
            String str3 = str;
            if ((i12 & 8) != 0) {
                bool2 = dVar.autoChecked;
            }
            Boolean bool3 = bool2;
            if ((i12 & 16) != 0) {
                str2 = dVar.createDate;
            }
            return dVar.a(bool, num2, str3, bool3, str2);
        }

        @X41.n
        public static final void a(@Y61.k d self, @Y61.k kotlinx.serialization.encoding.d output, @Y61.k SerialDescriptor serialDesc) {
            if (output.u() || self.reprocessing != null) {
                output.p(serialDesc, 0, C43407i.f412866a, self.reprocessing);
            }
            if (output.u() || self.notificationFailureCnt != null) {
                output.p(serialDesc, 1, Y.f412835a, self.notificationFailureCnt);
            }
            if (output.u() || self.reviewStatus != null) {
                output.p(serialDesc, 2, V0.f412822a, self.reviewStatus);
            }
            if (output.u() || self.autoChecked != null) {
                output.p(serialDesc, 3, C43407i.f412866a, self.autoChecked);
            }
            if (!output.u() && self.createDate == null) {
                return;
            }
            output.p(serialDesc, 4, V0.f412822a, self.createDate);
        }

        public /* synthetic */ d(Boolean bool, Integer num, String str, Boolean bool2, String str2, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : bool, (i12 & 2) != 0 ? null : num, (i12 & 4) != 0 ? null : str, (i12 & 8) != 0 ? null : bool2, (i12 & 16) != 0 ? null : str2);
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

    @InterfaceC42830m
    public /* synthetic */ f(int i12, @v String str, @v String str2, @v FlowActionType flowActionType, @v String str3, @v String str4, @v c cVar, @v d dVar, P0 p02) {
        if (127 != (i12 & 127)) {
            E0.b(i12, 127, a.f433222a.getF412706c());
            throw null;
        }
        this.id = str;
        this.applicantId = str2;
        this.type = flowActionType;
        this.createdAt = str3;
        this.externalActionId = str4;
        this.requiredIdDocs = cVar;
        this.review = dVar;
    }

    @Y61.k
    /* renamed from: a, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final String getApplicantId() {
        return this.applicantId;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final FlowActionType getType() {
        return this.type;
    }

    @Y61.k
    /* renamed from: d, reason: from getter */
    public final String getCreatedAt() {
        return this.createdAt;
    }

    @Y61.k
    /* renamed from: e, reason: from getter */
    public final String getExternalActionId() {
        return this.externalActionId;
    }

    public boolean equals(@Y61.l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof f)) {
            return false;
        }
        f fVar = (f) other;
        return L.f(this.id, fVar.id) && L.f(this.applicantId, fVar.applicantId) && L.f(this.type, fVar.type) && L.f(this.createdAt, fVar.createdAt) && L.f(this.externalActionId, fVar.externalActionId) && L.f(this.requiredIdDocs, fVar.requiredIdDocs) && L.f(this.review, fVar.review);
    }

    @Y61.k
    /* renamed from: f, reason: from getter */
    public final c getRequiredIdDocs() {
        return this.requiredIdDocs;
    }

    @Y61.k
    /* renamed from: g, reason: from getter */
    public final d getReview() {
        return this.review;
    }

    @Y61.k
    public final String h() {
        return this.applicantId;
    }

    public int hashCode() {
        return this.review.hashCode() + ((this.requiredIdDocs.hashCode() + H.d(H.d((this.type.hashCode() + H.d(this.id.hashCode() * 31, 31, this.applicantId)) * 31, 31, this.createdAt), 31, this.externalActionId)) * 31);
    }

    @Y61.k
    public final String j() {
        return this.createdAt;
    }

    @Y61.k
    public final String l() {
        return this.externalActionId;
    }

    @Y61.k
    public final String n() {
        return this.id;
    }

    @Y61.k
    public final c p() {
        return this.requiredIdDocs;
    }

    @Y61.k
    public final d r() {
        return this.review;
    }

    @Y61.k
    public final FlowActionType t() {
        return this.type;
    }

    @Y61.k
    public String toString() {
        return "RemoteAction(id=" + this.id + ", applicantId=" + this.applicantId + ", type=" + this.type + ", createdAt=" + this.createdAt + ", externalActionId=" + this.externalActionId + ", requiredIdDocs=" + this.requiredIdDocs + ", review=" + this.review + ')';
    }

    public f(@Y61.k String str, @Y61.k String str2, @Y61.k FlowActionType flowActionType, @Y61.k String str3, @Y61.k String str4, @Y61.k c cVar, @Y61.k d dVar) {
        this.id = str;
        this.applicantId = str2;
        this.type = flowActionType;
        this.createdAt = str3;
        this.externalActionId = str4;
        this.requiredIdDocs = cVar;
        this.review = dVar;
    }

    @Y61.k
    public final f a(@Y61.k String id2, @Y61.k String applicantId, @Y61.k FlowActionType type, @Y61.k String createdAt, @Y61.k String externalActionId, @Y61.k c requiredIdDocs, @Y61.k d review) {
        return new f(id2, applicantId, type, createdAt, externalActionId, requiredIdDocs, review);
    }

    public static /* synthetic */ f a(f fVar, String str, String str2, FlowActionType flowActionType, String str3, String str4, c cVar, d dVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = fVar.id;
        }
        if ((i12 & 2) != 0) {
            str2 = fVar.applicantId;
        }
        String str5 = str2;
        if ((i12 & 4) != 0) {
            flowActionType = fVar.type;
        }
        FlowActionType flowActionType2 = flowActionType;
        if ((i12 & 8) != 0) {
            str3 = fVar.createdAt;
        }
        String str6 = str3;
        if ((i12 & 16) != 0) {
            str4 = fVar.externalActionId;
        }
        String str7 = str4;
        if ((i12 & 32) != 0) {
            cVar = fVar.requiredIdDocs;
        }
        c cVar2 = cVar;
        if ((i12 & 64) != 0) {
            dVar = fVar.review;
        }
        return fVar.a(str, str5, flowActionType2, str6, str7, cVar2, dVar);
    }

    @X41.n
    public static final void a(@Y61.k f self, @Y61.k kotlinx.serialization.encoding.d output, @Y61.k SerialDescriptor serialDesc) {
        output.l(serialDesc, 0, self.id);
        output.l(serialDesc, 1, self.applicantId);
        output.F(serialDesc, 2, FlowActionTypeSerializer.INSTANCE, self.type);
        output.l(serialDesc, 3, self.createdAt);
        output.l(serialDesc, 4, self.externalActionId);
        output.F(serialDesc, 5, c.a.f433225a, self.requiredIdDocs);
        output.F(serialDesc, 6, d.a.f433237a, self.review);
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

    @v
    public static /* synthetic */ void q() {
    }

    @v
    public static /* synthetic */ void s() {
    }

    @v
    public static /* synthetic */ void u() {
    }
}
