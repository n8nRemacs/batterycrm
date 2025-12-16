package ru.cyberity.cbr.core.data.model.remote.response;

import X41.n;
import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.media3.exoplayer.analytics.m;
import com.avito.android.publish.drafts.LocalPublishState;
import com.avito.android.remote.model.AvatarStatus;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.RequestReviewResultKt;
import java.util.List;
import java.util.Map;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.m0;
import kotlinx.serialization.C43385d;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.C43400e0;
import kotlinx.serialization.internal.C43401f;
import kotlinx.serialization.internal.C43407i;
import kotlinx.serialization.internal.C43412k0;
import kotlinx.serialization.internal.E0;
import kotlinx.serialization.internal.G0;
import kotlinx.serialization.internal.N;
import kotlinx.serialization.internal.P0;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.V0;
import kotlinx.serialization.internal.Y;
import kotlinx.serialization.v;
import kotlinx.serialization.w;
import okhttp3.internal.http2.Http2;
import ru.cyberity.cbr.core.data.model.IdentitySide;
import ru.cyberity.cbr.core.data.model.ReviewAnswerType;
import ru.cyberity.cbr.core.data.model.ReviewRejectType;
import ru.cyberity.cbr.core.data.model.ReviewStatusType;
import ru.cyberity.cbr.core.data.model.b;
import ru.cyberity.cbr.core.data.model.h;
import ru.cyberity.cbr.core.data.model.remote.e;
import ru.cyberity.cbr.core.data.source.applicant.remote.r;
import shark.AndroidResourceIdNames;

/* compiled from: ListApplicantsResponse.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0003\u0011\u001f#B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B'\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÇ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0013J\u001c\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u001e\u0012\u0004\b \u0010!\u001a\u0004\b\u001f\u0010\u0013¨\u0006$"}, d2 = {"Lru/cyberity/cbr/core/data/model/remote/response/d;", "", "Lru/cyberity/cbr/core/data/model/remote/response/d$c;", "data", "<init>", "(Lru/cyberity/cbr/core/data/model/remote/response/d$c;)V", "", "seen1", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "(ILru/cyberity/cbr/core/data/model/remote/response/d$c;Lkotlinx/serialization/internal/P0;)V", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lkotlin/G0;", "a", "(Lru/cyberity/cbr/core/data/model/remote/response/d;Lkotlinx/serialization/encoding/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "()Lru/cyberity/cbr/core/data/model/remote/response/d$c;", "(Lru/cyberity/cbr/core/data/model/remote/response/d$c;)Lru/cyberity/cbr/core/data/model/remote/response/d;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Lru/cyberity/cbr/core/data/model/remote/response/d$c;", "b", "getData$annotations", "()V", "Companion", "c", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
@w
/* loaded from: classes9.dex */
public final /* data */ class d {

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    private final c data;

    /* compiled from: ListApplicantsResponse.kt */
    @Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000b\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"ru/cyberity/cbr/core/data/model/remote/response/ListApplicantsResponse.$serializer", "Lkotlinx/serialization/internal/N;", "Lru/cyberity/cbr/core/data/model/remote/response/d;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "a", "(Lkotlinx/serialization/encoding/Decoder;)Lru/cyberity/cbr/core/data/model/remote/response/d;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlin/G0;", "(Lkotlinx/serialization/encoding/Encoder;Lru/cyberity/cbr/core/data/model/remote/response/d;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    @InterfaceC42830m
    public static final class a implements N<d> {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f433303a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ SerialDescriptor f433304b;

        static {
            a aVar = new a();
            f433303a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.cyberity.cbr.core.data.model.remote.response.ListApplicantsResponse", aVar, 1);
            pluginGeneratedSerialDescriptor.j("list", true);
            f433304b = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // kotlinx.serialization.InterfaceC43386e
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public d deserialize(@k Decoder decoder) {
            SerialDescriptor f332717a = getF332717a();
            kotlinx.serialization.encoding.c cVarC = decoder.c(f332717a);
            P0 p02 = null;
            boolean z12 = true;
            int i12 = 0;
            Object objF = null;
            while (z12) {
                int iJ2 = cVarC.j(f332717a);
                if (iJ2 == -1) {
                    z12 = false;
                } else {
                    if (iJ2 != 0) {
                        throw new UnknownFieldException(iJ2);
                    }
                    objF = cVarC.f(f332717a, 0, c.a.f433306a, objF);
                    i12 = 1;
                }
            }
            cVarC.d(f332717a);
            return new d(i12, (c) objF, p02);
        }

        @Override // kotlinx.serialization.internal.N
        @k
        public KSerializer<?>[] childSerializers() {
            return new KSerializer[]{L51.a.a(c.a.f433306a)};
        }

        @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
        @k
        /* renamed from: getDescriptor */
        public SerialDescriptor getF332717a() {
            return f433304b;
        }

        @Override // kotlinx.serialization.internal.N
        @k
        public KSerializer<?>[] typeParametersSerializers() {
            return G0.f412773a;
        }

        @Override // kotlinx.serialization.x
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void serialize(@k Encoder encoder, @k d value) {
            SerialDescriptor f332717a = getF332717a();
            kotlinx.serialization.encoding.d dVarC = encoder.c(f332717a);
            d.a(value, dVarC, f332717a);
            dVarC.d(f332717a);
        }
    }

    /* compiled from: ListApplicantsResponse.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lru/cyberity/cbr/core/data/model/remote/response/d$b;", "", "Lkotlinx/serialization/KSerializer;", "Lru/cyberity/cbr/core/data/model/remote/response/d;", "serializer", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: ru.cyberity.cbr.core.data.model.remote.response.d$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @k
        public final KSerializer<d> serializer() {
            return a.f433303a;
        }

        private Companion() {
        }
    }

    /* compiled from: ListApplicantsResponse.kt */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0006\u0012 $%&'B\u0019\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B-\b\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0010\b\u0001\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ(\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fHÇ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0014J\"\u0010\u0012\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR(\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u001f\u0012\u0004\b!\u0010\"\u001a\u0004\b \u0010\u0014¨\u0006("}, d2 = {"Lru/cyberity/cbr/core/data/model/remote/response/d$c;", "", "", "Lru/cyberity/cbr/core/data/model/remote/response/d$c$d;", "items", "<init>", "(Ljava/util/List;)V", "", "seen1", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "(ILjava/util/List;Lkotlinx/serialization/internal/P0;)V", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lkotlin/G0;", "a", "(Lru/cyberity/cbr/core/data/model/remote/response/d$c;Lkotlinx/serialization/encoding/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "()Ljava/util/List;", "(Ljava/util/List;)Lru/cyberity/cbr/core/data/model/remote/response/d$c;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "b", "getItems$annotations", "()V", "Companion", "c", "d", "e", "f", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    @w
    public static final /* data */ class c {

        /* renamed from: Companion, reason: from kotlin metadata */
        @k
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @l
        private final List<C12460d> items;

        /* compiled from: ListApplicantsResponse.kt */
        @Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000b\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"ru/cyberity/cbr/core/data/model/remote/response/ListApplicantsResponse.Data.$serializer", "Lkotlinx/serialization/internal/N;", "Lru/cyberity/cbr/core/data/model/remote/response/d$c;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "a", "(Lkotlinx/serialization/encoding/Decoder;)Lru/cyberity/cbr/core/data/model/remote/response/d$c;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlin/G0;", "(Lkotlinx/serialization/encoding/Encoder;Lru/cyberity/cbr/core/data/model/remote/response/d$c;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
        @InterfaceC42830m
        public static final class a implements N<c> {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final a f433306a;

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ SerialDescriptor f433307b;

            static {
                a aVar = new a();
                f433306a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.cyberity.cbr.core.data.model.remote.response.ListApplicantsResponse.Data", aVar, 1);
                pluginGeneratedSerialDescriptor.j("items", true);
                f433307b = pluginGeneratedSerialDescriptor;
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
                Object objF = null;
                while (z12) {
                    int iJ2 = cVarC.j(f332717a);
                    if (iJ2 == -1) {
                        z12 = false;
                    } else {
                        if (iJ2 != 0) {
                            throw new UnknownFieldException(iJ2);
                        }
                        objF = cVarC.f(f332717a, 0, new C43401f(C12460d.a.f433345a), objF);
                        i12 = 1;
                    }
                }
                cVarC.d(f332717a);
                return new c(i12, (List) objF, p02);
            }

            @Override // kotlinx.serialization.internal.N
            @k
            public KSerializer<?>[] childSerializers() {
                return new KSerializer[]{L51.a.a(new C43401f(C12460d.a.f433345a))};
            }

            @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
            @k
            /* renamed from: getDescriptor */
            public SerialDescriptor getF332717a() {
                return f433307b;
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

        /* compiled from: ListApplicantsResponse.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lru/cyberity/cbr/core/data/model/remote/response/d$c$b;", "", "Lkotlinx/serialization/KSerializer;", "Lru/cyberity/cbr/core/data/model/remote/response/d$c;", "serializer", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
        /* renamed from: ru.cyberity.cbr.core.data.model.remote.response.d$c$b, reason: from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(C42822w c42822w) {
                this();
            }

            @k
            public final KSerializer<c> serializer() {
                return a.f433306a;
            }

            private Companion() {
            }
        }

        /* compiled from: ListApplicantsResponse.kt */
        @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \b\u0087\b\u0018\u0000 U2\u00020\u0001:\u0002\u001a$B¼\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012#\b\u0002\u0010\u0011\u001a\u001d\u0012\u0017\u0012\u0015\u0012\u0004\u0012\u00020\u0002\u0012\u000b\u0012\t\u0018\u00010\u0001¢\u0006\u0002\b\u00100\u000f\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0013\u0010\u0014BÐ\u0001\b\u0017\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012#\b\u0001\u0010\u0011\u001a\u001d\u0012\u0017\u0012\u0015\u0012\u0004\u0012\u00020\u0002\u0012\u000b\u0012\t\u0018\u00010\u0001¢\u0006\u0002\b\u00100\u000f\u0018\u00010\u000e\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0013\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001bJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001bJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001bJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001bJ\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001bJ\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001bJ\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u001bJ+\u0010&\u001a\u001d\u0012\u0017\u0012\u0015\u0012\u0004\u0012\u00020\u0002\u0012\u000b\u0012\t\u0018\u00010\u0001¢\u0006\u0002\b\u00100\u000f\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010\u001bJÅ\u0001\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022#\b\u0002\u0010\u0011\u001a\u001d\u0012\u0017\u0012\u0015\u0012\u0004\u0012\u00020\u0002\u0012\u000b\u0012\t\u0018\u00010\u0001¢\u0006\u0002\b\u00100\u000f\u0018\u00010\u000e2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001a\u0010)J\u0010\u0010*\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b*\u0010\u001bJ\u0010\u0010+\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b+\u0010,J\u001a\u0010/\u001a\u00020.2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b/\u00100J(\u0010\u001a\u001a\u0002062\u0006\u00101\u001a\u00020\u00002\u0006\u00103\u001a\u0002022\u0006\u00105\u001a\u000204HÇ\u0001¢\u0006\u0004\b\u001a\u00107R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u00108\u0012\u0004\b:\u0010;\u001a\u0004\b9\u0010\u001bR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b$\u00108\u0012\u0004\b=\u0010;\u001a\u0004\b<\u0010\u001bR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b%\u00108\u0012\u0004\b?\u0010;\u001a\u0004\b>\u0010\u001bR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b&\u00108\u0012\u0004\bA\u0010;\u001a\u0004\b@\u0010\u001bR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b(\u00108\u0012\u0004\bC\u0010;\u001a\u0004\bB\u0010\u001bR\"\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u00108\u0012\u0004\bE\u0010;\u001a\u0004\bD\u0010\u001bR\"\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001d\u00108\u0012\u0004\bG\u0010;\u001a\u0004\bF\u0010\u001bR\"\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001e\u00108\u0012\u0004\bI\u0010;\u001a\u0004\bH\u0010\u001bR\"\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001f\u00108\u0012\u0004\bK\u0010;\u001a\u0004\bJ\u0010\u001bR\"\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b \u00108\u0012\u0004\bM\u0010;\u001a\u0004\bL\u0010\u001bR\"\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b!\u00108\u0012\u0004\bO\u0010;\u001a\u0004\bN\u0010\u001bR;\u0010\u0011\u001a\u001d\u0012\u0017\u0012\u0015\u0012\u0004\u0012\u00020\u0002\u0012\u000b\u0012\t\u0018\u00010\u0001¢\u0006\u0002\b\u00100\u000f\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\"\u0010P\u0012\u0004\bR\u0010;\u001a\u0004\bQ\u0010'R\"\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b#\u00108\u0012\u0004\bT\u0010;\u001a\u0004\bS\u0010\u001b¨\u0006V"}, d2 = {"Lru/cyberity/cbr/core/data/model/remote/response/d$c$c;", "", "", "country", "firstName", "lastName", "middleName", "legalName", "gender", "dob", "placeOfBirth", "countryOfBirth", "stateOfBirth", "nationality", "", "", "Lkotlinx/serialization/b;", "addresses", "tin", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "", "seen1", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lkotlinx/serialization/internal/P0;)V", "a", "()Ljava/lang/String;", "f", "g", "h", "i", "j", "k", "l", "m", "b", "c", "d", "()Ljava/util/List;", "e", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Lru/cyberity/cbr/core/data/model/remote/response/d$c$c;", "toString", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lkotlin/G0;", "(Lru/cyberity/cbr/core/data/model/remote/response/d$c$c;Lkotlinx/serialization/encoding/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "p", "getCountry$annotations", "()V", "v", "getFirstName$annotations", "z", "getLastName$annotations", "D", "getMiddleName$annotations", "B", "getLegalName$annotations", "x", "getGender$annotations", "t", "getDob$annotations", "H", "getPlaceOfBirth$annotations", "r", "getCountryOfBirth$annotations", "J", "getStateOfBirth$annotations", "F", "getNationality$annotations", "Ljava/util/List;", "n", "getAddresses$annotations", "L", "getTin$annotations", "Companion", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
        @w
        /* renamed from: ru.cyberity.cbr.core.data.model.remote.response.d$c$c, reason: collision with other inner class name */
        public static final /* data */ class C12459c {

            /* renamed from: Companion, reason: from kotlin metadata */
            @k
            public static final Companion INSTANCE = new Companion(null);

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            @l
            private final String country;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            @l
            private final String firstName;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata */
            @l
            private final String lastName;

            /* renamed from: d, reason: collision with root package name and from kotlin metadata */
            @l
            private final String middleName;

            /* renamed from: e, reason: collision with root package name and from kotlin metadata */
            @l
            private final String legalName;

            /* renamed from: f, reason: collision with root package name and from kotlin metadata */
            @l
            private final String gender;

            /* renamed from: g, reason: collision with root package name and from kotlin metadata */
            @l
            private final String dob;

            /* renamed from: h, reason: collision with root package name and from kotlin metadata */
            @l
            private final String placeOfBirth;

            /* renamed from: i, reason: collision with root package name and from kotlin metadata */
            @l
            private final String countryOfBirth;

            /* renamed from: j, reason: collision with root package name and from kotlin metadata */
            @l
            private final String stateOfBirth;

            /* renamed from: k, reason: collision with root package name and from kotlin metadata */
            @l
            private final String nationality;

            /* renamed from: l, reason: collision with root package name and from kotlin metadata */
            @l
            private final List<Map<String, Object>> addresses;

            /* renamed from: m, reason: collision with root package name and from kotlin metadata */
            @l
            private final String tin;

            /* compiled from: ListApplicantsResponse.kt */
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lru/cyberity/cbr/core/data/model/remote/response/d$c$c$b;", "", "Lkotlinx/serialization/KSerializer;", "Lru/cyberity/cbr/core/data/model/remote/response/d$c$c;", "serializer", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
            /* renamed from: ru.cyberity.cbr.core.data.model.remote.response.d$c$c$b, reason: from kotlin metadata */
            public static final class Companion {
                public /* synthetic */ Companion(C42822w c42822w) {
                    this();
                }

                @k
                public final KSerializer<C12459c> serializer() {
                    return a.f433321a;
                }

                private Companion() {
                }
            }

            public C12459c() {
                this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, 8191, (C42822w) null);
            }

            @l
            /* renamed from: B, reason: from getter */
            public final String getLegalName() {
                return this.legalName;
            }

            @l
            /* renamed from: D, reason: from getter */
            public final String getMiddleName() {
                return this.middleName;
            }

            @l
            /* renamed from: F, reason: from getter */
            public final String getNationality() {
                return this.nationality;
            }

            @l
            /* renamed from: H, reason: from getter */
            public final String getPlaceOfBirth() {
                return this.placeOfBirth;
            }

            @l
            /* renamed from: J, reason: from getter */
            public final String getStateOfBirth() {
                return this.stateOfBirth;
            }

            @l
            /* renamed from: L, reason: from getter */
            public final String getTin() {
                return this.tin;
            }

            @l
            /* renamed from: a, reason: from getter */
            public final String getCountry() {
                return this.country;
            }

            @l
            public final String b() {
                return this.stateOfBirth;
            }

            @l
            public final String c() {
                return this.nationality;
            }

            @l
            public final List<Map<String, Object>> d() {
                return this.addresses;
            }

            @l
            public final String e() {
                return this.tin;
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof C12459c)) {
                    return false;
                }
                C12459c c12459c = (C12459c) other;
                return L.f(this.country, c12459c.country) && L.f(this.firstName, c12459c.firstName) && L.f(this.lastName, c12459c.lastName) && L.f(this.middleName, c12459c.middleName) && L.f(this.legalName, c12459c.legalName) && L.f(this.gender, c12459c.gender) && L.f(this.dob, c12459c.dob) && L.f(this.placeOfBirth, c12459c.placeOfBirth) && L.f(this.countryOfBirth, c12459c.countryOfBirth) && L.f(this.stateOfBirth, c12459c.stateOfBirth) && L.f(this.nationality, c12459c.nationality) && L.f(this.addresses, c12459c.addresses) && L.f(this.tin, c12459c.tin);
            }

            @l
            /* renamed from: f, reason: from getter */
            public final String getFirstName() {
                return this.firstName;
            }

            @l
            /* renamed from: g, reason: from getter */
            public final String getLastName() {
                return this.lastName;
            }

            @l
            public final String h() {
                return this.middleName;
            }

            public int hashCode() {
                String str = this.country;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.firstName;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.lastName;
                int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.middleName;
                int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
                String str5 = this.legalName;
                int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
                String str6 = this.gender;
                int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
                String str7 = this.dob;
                int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
                String str8 = this.placeOfBirth;
                int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
                String str9 = this.countryOfBirth;
                int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
                String str10 = this.stateOfBirth;
                int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
                String str11 = this.nationality;
                int iHashCode11 = (iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
                List<Map<String, Object>> list = this.addresses;
                int iHashCode12 = (iHashCode11 + (list == null ? 0 : list.hashCode())) * 31;
                String str12 = this.tin;
                return iHashCode12 + (str12 != null ? str12.hashCode() : 0);
            }

            @l
            public final String i() {
                return this.legalName;
            }

            @l
            /* renamed from: j, reason: from getter */
            public final String getGender() {
                return this.gender;
            }

            @l
            /* renamed from: k, reason: from getter */
            public final String getDob() {
                return this.dob;
            }

            @l
            public final String l() {
                return this.placeOfBirth;
            }

            @l
            /* renamed from: m, reason: from getter */
            public final String getCountryOfBirth() {
                return this.countryOfBirth;
            }

            @l
            public final List<Map<String, Object>> n() {
                return this.addresses;
            }

            @l
            public final String p() {
                return this.country;
            }

            @l
            public final String r() {
                return this.countryOfBirth;
            }

            @l
            public final String t() {
                return this.dob;
            }

            @k
            public String toString() {
                StringBuilder sb2 = new StringBuilder("Info(country=");
                sb2.append(this.country);
                sb2.append(", firstName=");
                sb2.append(this.firstName);
                sb2.append(", lastName=");
                sb2.append(this.lastName);
                sb2.append(", middleName=");
                sb2.append(this.middleName);
                sb2.append(", legalName=");
                sb2.append(this.legalName);
                sb2.append(", gender=");
                sb2.append(this.gender);
                sb2.append(", dob=");
                sb2.append(this.dob);
                sb2.append(", placeOfBirth=");
                sb2.append(this.placeOfBirth);
                sb2.append(", countryOfBirth=");
                sb2.append(this.countryOfBirth);
                sb2.append(", stateOfBirth=");
                sb2.append(this.stateOfBirth);
                sb2.append(", nationality=");
                sb2.append(this.nationality);
                sb2.append(", addresses=");
                sb2.append(this.addresses);
                sb2.append(", tin=");
                return C22026a.c(sb2, this.tin, ')');
            }

            @l
            public final String v() {
                return this.firstName;
            }

            @l
            public final String x() {
                return this.gender;
            }

            @l
            public final String z() {
                return this.lastName;
            }

            @InterfaceC42830m
            public /* synthetic */ C12459c(int i12, @v String str, @v String str2, @v String str3, @v String str4, @v String str5, @v String str6, @v String str7, @v String str8, @v String str9, @v String str10, @v String str11, @v List list, @v String str12, P0 p02) {
                if ((i12 & 1) == 0) {
                    this.country = null;
                } else {
                    this.country = str;
                }
                if ((i12 & 2) == 0) {
                    this.firstName = null;
                } else {
                    this.firstName = str2;
                }
                if ((i12 & 4) == 0) {
                    this.lastName = null;
                } else {
                    this.lastName = str3;
                }
                if ((i12 & 8) == 0) {
                    this.middleName = null;
                } else {
                    this.middleName = str4;
                }
                if ((i12 & 16) == 0) {
                    this.legalName = null;
                } else {
                    this.legalName = str5;
                }
                if ((i12 & 32) == 0) {
                    this.gender = null;
                } else {
                    this.gender = str6;
                }
                if ((i12 & 64) == 0) {
                    this.dob = null;
                } else {
                    this.dob = str7;
                }
                if ((i12 & 128) == 0) {
                    this.placeOfBirth = null;
                } else {
                    this.placeOfBirth = str8;
                }
                if ((i12 & 256) == 0) {
                    this.countryOfBirth = null;
                } else {
                    this.countryOfBirth = str9;
                }
                if ((i12 & 512) == 0) {
                    this.stateOfBirth = null;
                } else {
                    this.stateOfBirth = str10;
                }
                if ((i12 & 1024) == 0) {
                    this.nationality = null;
                } else {
                    this.nationality = str11;
                }
                if ((i12 & 2048) == 0) {
                    this.addresses = null;
                } else {
                    this.addresses = list;
                }
                if ((i12 & 4096) == 0) {
                    this.tin = null;
                } else {
                    this.tin = str12;
                }
            }

            @k
            public final C12459c a(@l String country, @l String firstName, @l String lastName, @l String middleName, @l String legalName, @l String gender, @l String dob, @l String placeOfBirth, @l String countryOfBirth, @l String stateOfBirth, @l String nationality, @l List<? extends Map<String, ? extends Object>> addresses, @l String tin) {
                return new C12459c(country, firstName, lastName, middleName, legalName, gender, dob, placeOfBirth, countryOfBirth, stateOfBirth, nationality, addresses, tin);
            }

            /* compiled from: ListApplicantsResponse.kt */
            @Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000b\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"ru/cyberity/cbr/core/data/model/remote/response/ListApplicantsResponse.Data.Info.$serializer", "Lkotlinx/serialization/internal/N;", "Lru/cyberity/cbr/core/data/model/remote/response/d$c$c;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "a", "(Lkotlinx/serialization/encoding/Decoder;)Lru/cyberity/cbr/core/data/model/remote/response/d$c$c;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlin/G0;", "(Lkotlinx/serialization/encoding/Encoder;Lru/cyberity/cbr/core/data/model/remote/response/d$c$c;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
            @InterfaceC42830m
            /* renamed from: ru.cyberity.cbr.core.data.model.remote.response.d$c$c$a */
            public static final class a implements N<C12459c> {

                /* renamed from: a, reason: collision with root package name */
                @k
                public static final a f433321a;

                /* renamed from: b, reason: collision with root package name */
                public static final /* synthetic */ SerialDescriptor f433322b;

                static {
                    a aVar = new a();
                    f433321a = aVar;
                    PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.cyberity.cbr.core.data.model.remote.response.ListApplicantsResponse.Data.Info", aVar, 13);
                    pluginGeneratedSerialDescriptor.j("country", true);
                    pluginGeneratedSerialDescriptor.j("firstName", true);
                    pluginGeneratedSerialDescriptor.j("lastName", true);
                    pluginGeneratedSerialDescriptor.j("middleName", true);
                    pluginGeneratedSerialDescriptor.j("legalName", true);
                    pluginGeneratedSerialDescriptor.j("gender", true);
                    pluginGeneratedSerialDescriptor.j("dob", true);
                    pluginGeneratedSerialDescriptor.j("placeOfBirth", true);
                    pluginGeneratedSerialDescriptor.j("countryOfBirth", true);
                    pluginGeneratedSerialDescriptor.j("stateOfBirth", true);
                    pluginGeneratedSerialDescriptor.j("nationality", true);
                    pluginGeneratedSerialDescriptor.j("addresses", true);
                    pluginGeneratedSerialDescriptor.j("tin", true);
                    f433322b = pluginGeneratedSerialDescriptor;
                }

                private a() {
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlinx.serialization.InterfaceC43386e
                @k
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public C12459c deserialize(@k Decoder decoder) {
                    Object obj;
                    SerialDescriptor f332717a = getF332717a();
                    kotlinx.serialization.encoding.c cVarC = decoder.c(f332717a);
                    String strF = null;
                    Object objF = null;
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
                    Object objF12 = null;
                    int i12 = 0;
                    boolean z12 = true;
                    while (z12) {
                        String str = strF;
                        int iJ2 = cVarC.j(f332717a);
                        switch (iJ2) {
                            case -1:
                                z12 = false;
                                strF = str;
                                objF12 = objF12;
                            case 0:
                                obj = objF;
                                i12 |= 1;
                                strF = cVarC.f(f332717a, 0, V0.f412822a, str);
                                objF12 = objF12;
                                objF = obj;
                            case 1:
                                obj = objF;
                                objF2 = cVarC.f(f332717a, 1, V0.f412822a, objF2);
                                i12 |= 2;
                                strF = str;
                                objF = obj;
                            case 2:
                                obj = objF;
                                objF3 = cVarC.f(f332717a, 2, V0.f412822a, objF3);
                                i12 |= 4;
                                strF = str;
                                objF = obj;
                            case 3:
                                obj = objF;
                                objF4 = cVarC.f(f332717a, 3, V0.f412822a, objF4);
                                i12 |= 8;
                                strF = str;
                                objF = obj;
                            case 4:
                                obj = objF;
                                objF5 = cVarC.f(f332717a, 4, V0.f412822a, objF5);
                                i12 |= 16;
                                strF = str;
                                objF = obj;
                            case 5:
                                obj = objF;
                                objF6 = cVarC.f(f332717a, 5, V0.f412822a, objF6);
                                i12 |= 32;
                                strF = str;
                                objF = obj;
                            case 6:
                                obj = objF;
                                objF7 = cVarC.f(f332717a, 6, V0.f412822a, objF7);
                                i12 |= 64;
                                strF = str;
                                objF = obj;
                            case 7:
                                obj = objF;
                                objF8 = cVarC.f(f332717a, 7, V0.f412822a, objF8);
                                i12 |= 128;
                                strF = str;
                                objF = obj;
                            case 8:
                                obj = objF;
                                objF9 = cVarC.f(f332717a, 8, V0.f412822a, objF9);
                                i12 |= 256;
                                strF = str;
                                objF = obj;
                            case 9:
                                obj = objF;
                                objF10 = cVarC.f(f332717a, 9, V0.f412822a, objF10);
                                i12 |= 512;
                                strF = str;
                                objF = obj;
                            case 10:
                                obj = objF;
                                objF11 = cVarC.f(f332717a, 10, V0.f412822a, objF11);
                                i12 |= 1024;
                                strF = str;
                                objF = obj;
                            case 11:
                                objF12 = cVarC.f(f332717a, 11, new C43401f(new C43400e0(V0.f412822a, L51.a.a(new C43385d(m0.f406844a.b(Object.class), new KSerializer[0])))), objF12);
                                i12 |= 2048;
                                strF = str;
                                objF2 = objF2;
                                objF = objF;
                                objF3 = objF3;
                                objF4 = objF4;
                                objF5 = objF5;
                                objF6 = objF6;
                            case 12:
                                objF = cVarC.f(f332717a, 12, V0.f412822a, objF);
                                i12 |= 4096;
                                strF = str;
                                objF2 = objF2;
                            default:
                                throw new UnknownFieldException(iJ2);
                        }
                    }
                    Object obj2 = objF12;
                    cVarC.d(f332717a);
                    return new C12459c(i12, strF, (String) objF2, (String) objF3, (String) objF4, (String) objF5, (String) objF6, (String) objF7, (String) objF8, (String) objF9, (String) objF10, (String) objF11, (List) obj2, (String) objF, (P0) null);
                }

                @Override // kotlinx.serialization.internal.N
                @k
                public KSerializer<?>[] childSerializers() {
                    V0 v02 = V0.f412822a;
                    return new KSerializer[]{L51.a.a(v02), L51.a.a(v02), L51.a.a(v02), L51.a.a(v02), L51.a.a(v02), L51.a.a(v02), L51.a.a(v02), L51.a.a(v02), L51.a.a(v02), L51.a.a(v02), L51.a.a(v02), L51.a.a(new C43401f(new C43400e0(v02, L51.a.a(new C43385d(m0.f406844a.b(Object.class), new KSerializer[0]))))), L51.a.a(v02)};
                }

                @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
                @k
                /* renamed from: getDescriptor */
                public SerialDescriptor getF332717a() {
                    return f433322b;
                }

                @Override // kotlinx.serialization.internal.N
                @k
                public KSerializer<?>[] typeParametersSerializers() {
                    return G0.f412773a;
                }

                @Override // kotlinx.serialization.x
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public void serialize(@k Encoder encoder, @k C12459c value) {
                    SerialDescriptor f332717a = getF332717a();
                    kotlinx.serialization.encoding.d dVarC = encoder.c(f332717a);
                    C12459c.a(value, dVarC, f332717a);
                    dVarC.d(f332717a);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public C12459c(@l String str, @l String str2, @l String str3, @l String str4, @l String str5, @l String str6, @l String str7, @l String str8, @l String str9, @l String str10, @l String str11, @l List<? extends Map<String, ? extends Object>> list, @l String str12) {
                this.country = str;
                this.firstName = str2;
                this.lastName = str3;
                this.middleName = str4;
                this.legalName = str5;
                this.gender = str6;
                this.dob = str7;
                this.placeOfBirth = str8;
                this.countryOfBirth = str9;
                this.stateOfBirth = str10;
                this.nationality = str11;
                this.addresses = list;
                this.tin = str12;
            }

            @n
            public static final void a(@k C12459c self, @k kotlinx.serialization.encoding.d output, @k SerialDescriptor serialDesc) {
                if (output.u() || self.country != null) {
                    output.p(serialDesc, 0, V0.f412822a, self.country);
                }
                if (output.u() || self.firstName != null) {
                    output.p(serialDesc, 1, V0.f412822a, self.firstName);
                }
                if (output.u() || self.lastName != null) {
                    output.p(serialDesc, 2, V0.f412822a, self.lastName);
                }
                if (output.u() || self.middleName != null) {
                    output.p(serialDesc, 3, V0.f412822a, self.middleName);
                }
                if (output.u() || self.legalName != null) {
                    output.p(serialDesc, 4, V0.f412822a, self.legalName);
                }
                if (output.u() || self.gender != null) {
                    output.p(serialDesc, 5, V0.f412822a, self.gender);
                }
                if (output.u() || self.dob != null) {
                    output.p(serialDesc, 6, V0.f412822a, self.dob);
                }
                if (output.u() || self.placeOfBirth != null) {
                    output.p(serialDesc, 7, V0.f412822a, self.placeOfBirth);
                }
                if (output.u() || self.countryOfBirth != null) {
                    output.p(serialDesc, 8, V0.f412822a, self.countryOfBirth);
                }
                if (output.u() || self.stateOfBirth != null) {
                    output.p(serialDesc, 9, V0.f412822a, self.stateOfBirth);
                }
                if (output.u() || self.nationality != null) {
                    output.p(serialDesc, 10, V0.f412822a, self.nationality);
                }
                if (output.u() || self.addresses != null) {
                    output.p(serialDesc, 11, new C43401f(new C43400e0(V0.f412822a, L51.a.a(new C43385d(m0.f406844a.b(Object.class), new KSerializer[0])))), self.addresses);
                }
                if (!output.u() && self.tin == null) {
                    return;
                }
                output.p(serialDesc, 12, V0.f412822a, self.tin);
            }

            public /* synthetic */ C12459c(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, List list, String str12, int i12, C42822w c42822w) {
                this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : str3, (i12 & 8) != 0 ? null : str4, (i12 & 16) != 0 ? null : str5, (i12 & 32) != 0 ? null : str6, (i12 & 64) != 0 ? null : str7, (i12 & 128) != 0 ? null : str8, (i12 & 256) != 0 ? null : str9, (i12 & 512) != 0 ? null : str10, (i12 & 1024) != 0 ? null : str11, (i12 & 2048) != 0 ? null : list, (i12 & 4096) == 0 ? str12 : null);
            }

            @v
            public static /* synthetic */ void A() {
            }

            @v
            public static /* synthetic */ void C() {
            }

            @v
            public static /* synthetic */ void E() {
            }

            @v
            public static /* synthetic */ void G() {
            }

            @v
            public static /* synthetic */ void I() {
            }

            @v
            public static /* synthetic */ void K() {
            }

            @v
            public static /* synthetic */ void M() {
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

            @v
            public static /* synthetic */ void w() {
            }

            @v
            public static /* synthetic */ void y() {
            }
        }

        /* compiled from: ListApplicantsResponse.kt */
        @Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b6\b\u0087\b\u0018\u0000 \u0086\u00012\u00020\u0001:\u0002(4B\u008f\u0002\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e¢\u0006\u0004\b!\u0010\"B¯\u0002\b\u0017\u0012\u0006\u0010$\u001a\u00020#\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0001\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\u0010\b\u0001\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e\u0012\b\u0010&\u001a\u0004\u0018\u00010%¢\u0006\u0004\b!\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b*\u0010)J\u0010\u0010+\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b-\u0010)J\u0012\u0010.\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b.\u0010)J\u0010\u0010/\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b1\u0010)J\u0010\u00102\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b2\u0010)J\u0012\u00103\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b3\u0010)J\u0012\u00104\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b4\u0010)J\u0012\u00105\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b5\u00106J\u0012\u00107\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b7\u00106J\u0012\u00108\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b8\u0010)J\u0018\u00109\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b9\u0010:J\u0012\u0010;\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b;\u0010)J\u0012\u0010<\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b<\u0010)J\u0012\u0010=\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b=\u0010)J\u0012\u0010>\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b>\u0010)J\u0012\u0010?\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b?\u0010)J\u0012\u0010@\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b@\u0010)J\u0012\u0010A\u001a\u0004\u0018\u00010\u001cHÆ\u0003¢\u0006\u0004\bA\u0010BJ\u0018\u0010C\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001eHÆ\u0003¢\u0006\u0004\bC\u0010:J\u009c\u0002\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001eHÆ\u0001¢\u0006\u0004\b(\u0010DJ\u0010\u0010E\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bE\u0010)J\u0010\u0010F\u001a\u00020#HÖ\u0001¢\u0006\u0004\bF\u0010GJ\u001a\u0010J\u001a\u00020I2\b\u0010H\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bJ\u0010KJ(\u0010(\u001a\u00020Q2\u0006\u0010L\u001a\u00020\u00002\u0006\u0010N\u001a\u00020M2\u0006\u0010P\u001a\u00020OHÇ\u0001¢\u0006\u0004\b(\u0010RR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b(\u0010S\u0012\u0004\bU\u0010V\u001a\u0004\bT\u0010)R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b4\u0010S\u0012\u0004\bX\u0010V\u001a\u0004\bW\u0010)R \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b5\u0010Y\u0012\u0004\b[\u0010V\u001a\u0004\bZ\u0010,R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b7\u0010S\u0012\u0004\b]\u0010V\u001a\u0004\b\\\u0010)R\"\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b8\u0010S\u0012\u0004\b_\u0010V\u001a\u0004\b^\u0010)R \u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b9\u0010`\u0012\u0004\bb\u0010V\u001a\u0004\ba\u00100R \u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b;\u0010S\u0012\u0004\bd\u0010V\u001a\u0004\bc\u0010)R \u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b<\u0010S\u0012\u0004\bf\u0010V\u001a\u0004\be\u0010)R\"\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b=\u0010S\u0012\u0004\bh\u0010V\u001a\u0004\bg\u0010)R\"\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b>\u0010S\u0012\u0004\bj\u0010V\u001a\u0004\bi\u0010)R\"\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b?\u0010k\u0012\u0004\bm\u0010V\u001a\u0004\bl\u00106R\"\u0010\u0011\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b*\u0010k\u0012\u0004\bo\u0010V\u001a\u0004\bn\u00106R\"\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b@\u0010S\u0012\u0004\bq\u0010V\u001a\u0004\bp\u0010)R(\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bA\u0010r\u0012\u0004\bt\u0010V\u001a\u0004\bs\u0010:R\"\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bC\u0010S\u0012\u0004\bv\u0010V\u001a\u0004\bu\u0010)R\"\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b+\u0010S\u0012\u0004\bx\u0010V\u001a\u0004\bw\u0010)R\"\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b-\u0010S\u0012\u0004\bz\u0010V\u001a\u0004\by\u0010)R\"\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b.\u0010S\u0012\u0004\b|\u0010V\u001a\u0004\b{\u0010)R\"\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b/\u0010S\u0012\u0004\b~\u0010V\u001a\u0004\b}\u0010)R#\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0013\n\u0004\b1\u0010S\u0012\u0005\b\u0080\u0001\u0010V\u001a\u0004\b\u007f\u0010)R%\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b2\u0010\u0081\u0001\u0012\u0005\b\u0083\u0001\u0010V\u001a\u0005\b\u0082\u0001\u0010BR*\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b3\u0010r\u0012\u0005\b\u0085\u0001\u0010V\u001a\u0005\b\u0084\u0001\u0010:¨\u0006\u0087\u0001"}, d2 = {"Lru/cyberity/cbr/core/data/model/remote/response/d$c$d;", "", "", "createdAt", "inspectionId", "Lru/cyberity/cbr/core/data/model/remote/response/d$c$e;", "requiredIdDocs", "clientId", "externalUserId", "Lru/cyberity/cbr/core/data/model/remote/response/d$c$f;", AvatarStatus.REVIEW, "id", "applicantId", "env", "type", "Lru/cyberity/cbr/core/data/model/remote/response/d$c$c;", RequestReviewResultKt.INFO_TYPE, "fixedInfo", "lang", "", "Lru/cyberity/cbr/core/data/model/remote/e;", "metadata", "email", "tin", "phone", "key", "applicantPlatform", "ipCountry", "Lru/cyberity/cbr/core/data/model/b;", "agreement", "", "Lru/cyberity/cbr/core/data/source/applicant/remote/r;", "questionnaires", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/cyberity/cbr/core/data/model/remote/response/d$c$e;Ljava/lang/String;Ljava/lang/String;Lru/cyberity/cbr/core/data/model/remote/response/d$c$f;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/cyberity/cbr/core/data/model/remote/response/d$c$c;Lru/cyberity/cbr/core/data/model/remote/response/d$c$c;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/cyberity/cbr/core/data/model/b;Ljava/util/List;)V", "", "seen1", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lru/cyberity/cbr/core/data/model/remote/response/d$c$e;Ljava/lang/String;Ljava/lang/String;Lru/cyberity/cbr/core/data/model/remote/response/d$c$f;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/cyberity/cbr/core/data/model/remote/response/d$c$c;Lru/cyberity/cbr/core/data/model/remote/response/d$c$c;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/cyberity/cbr/core/data/model/b;Ljava/util/List;Lkotlinx/serialization/internal/P0;)V", "a", "()Ljava/lang/String;", "l", "p", "()Lru/cyberity/cbr/core/data/model/remote/response/d$c$e;", "q", "r", "s", "()Lru/cyberity/cbr/core/data/model/remote/response/d$c$f;", "t", "u", "v", "b", "c", "()Lru/cyberity/cbr/core/data/model/remote/response/d$c$c;", "d", "e", "f", "()Ljava/util/List;", "g", "h", "i", "j", "k", "m", "n", "()Lru/cyberity/cbr/core/data/model/b;", "o", "(Ljava/lang/String;Ljava/lang/String;Lru/cyberity/cbr/core/data/model/remote/response/d$c$e;Ljava/lang/String;Ljava/lang/String;Lru/cyberity/cbr/core/data/model/remote/response/d$c$f;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/cyberity/cbr/core/data/model/remote/response/d$c$c;Lru/cyberity/cbr/core/data/model/remote/response/d$c$c;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/cyberity/cbr/core/data/model/b;Ljava/util/List;)Lru/cyberity/cbr/core/data/model/remote/response/d$c$d;", "toString", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lkotlin/G0;", "(Lru/cyberity/cbr/core/data/model/remote/response/d$c$d;Lkotlinx/serialization/encoding/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "E", "getCreatedAt$annotations", "()V", "S", "getInspectionId$annotations", "Lru/cyberity/cbr/core/data/model/remote/response/d$c$e;", "g0", "getRequiredIdDocs$annotations", "C", "getClientId$annotations", "K", "getExternalUserId$annotations", "Lru/cyberity/cbr/core/data/model/remote/response/d$c$f;", "i0", "getReview$annotations", "O", "getId$annotations", "y", "getApplicantId$annotations", "I", "getEnv$annotations", "m0", "getType$annotations", "Lru/cyberity/cbr/core/data/model/remote/response/d$c$c;", "Q", "getInfo$annotations", "M", "getFixedInfo$annotations", "Y", "getLang$annotations", "Ljava/util/List;", "a0", "getMetadata$annotations", "G", "getEmail$annotations", "k0", "getTin$annotations", "c0", "getPhone$annotations", "W", "getKey$annotations", "A", "getApplicantPlatform$annotations", "U", "getIpCountry$annotations", "Lru/cyberity/cbr/core/data/model/b;", "w", "getAgreement$annotations", "e0", "getQuestionnaires$annotations", "Companion", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
        @w
        /* renamed from: ru.cyberity.cbr.core.data.model.remote.response.d$c$d, reason: collision with other inner class name */
        public static final /* data */ class C12460d {

            /* renamed from: Companion, reason: from kotlin metadata */
            @k
            public static final Companion INSTANCE = new Companion(null);

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            @l
            private final String createdAt;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            @l
            private final String inspectionId;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata */
            @k
            private final e requiredIdDocs;

            /* renamed from: d, reason: collision with root package name and from kotlin metadata */
            @l
            private final String clientId;

            /* renamed from: e, reason: collision with root package name and from kotlin metadata */
            @l
            private final String externalUserId;

            /* renamed from: f, reason: collision with root package name and from kotlin metadata */
            @k
            private final f review;

            /* renamed from: g, reason: collision with root package name and from kotlin metadata */
            @k
            private final String id;

            /* renamed from: h, reason: collision with root package name and from kotlin metadata */
            @k
            private final String applicantId;

            /* renamed from: i, reason: collision with root package name and from kotlin metadata */
            @l
            private final String env;

            /* renamed from: j, reason: collision with root package name and from kotlin metadata */
            @l
            private final String type;

            /* renamed from: k, reason: collision with root package name and from kotlin metadata */
            @l
            private final C12459c info;

            /* renamed from: l, reason: collision with root package name and from kotlin metadata */
            @l
            private final C12459c fixedInfo;

            /* renamed from: m, reason: collision with root package name and from kotlin metadata */
            @l
            private final String lang;

            /* renamed from: n, reason: collision with root package name and from kotlin metadata */
            @l
            private final List<ru.cyberity.cbr.core.data.model.remote.e> metadata;

            /* renamed from: o, reason: collision with root package name and from kotlin metadata */
            @l
            private final String email;

            /* renamed from: p, reason: collision with root package name and from kotlin metadata */
            @l
            private final String tin;

            /* renamed from: q, reason: collision with root package name and from kotlin metadata */
            @l
            private final String phone;

            /* renamed from: r, reason: collision with root package name and from kotlin metadata */
            @l
            private final String key;

            /* renamed from: s, reason: collision with root package name and from kotlin metadata */
            @l
            private final String applicantPlatform;

            /* renamed from: t, reason: collision with root package name and from kotlin metadata */
            @l
            private final String ipCountry;

            /* renamed from: u, reason: collision with root package name and from kotlin metadata */
            @l
            private final ru.cyberity.cbr.core.data.model.b agreement;

            /* renamed from: v, reason: collision with root package name and from kotlin metadata */
            @l
            private final List<r> questionnaires;

            /* compiled from: ListApplicantsResponse.kt */
            @Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000b\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"ru/cyberity/cbr/core/data/model/remote/response/ListApplicantsResponse.Data.Item.$serializer", "Lkotlinx/serialization/internal/N;", "Lru/cyberity/cbr/core/data/model/remote/response/d$c$d;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "a", "(Lkotlinx/serialization/encoding/Decoder;)Lru/cyberity/cbr/core/data/model/remote/response/d$c$d;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlin/G0;", "(Lkotlinx/serialization/encoding/Encoder;Lru/cyberity/cbr/core/data/model/remote/response/d$c$d;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
            @InterfaceC42830m
            /* renamed from: ru.cyberity.cbr.core.data.model.remote.response.d$c$d$a */
            public static final class a implements N<C12460d> {

                /* renamed from: a, reason: collision with root package name */
                @k
                public static final a f433345a;

                /* renamed from: b, reason: collision with root package name */
                public static final /* synthetic */ SerialDescriptor f433346b;

                static {
                    a aVar = new a();
                    f433345a = aVar;
                    PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.cyberity.cbr.core.data.model.remote.response.ListApplicantsResponse.Data.Item", aVar, 22);
                    pluginGeneratedSerialDescriptor.j("createdAt", true);
                    pluginGeneratedSerialDescriptor.j("inspectionId", true);
                    pluginGeneratedSerialDescriptor.j("requiredIdDocs", false);
                    pluginGeneratedSerialDescriptor.j("clientId", true);
                    pluginGeneratedSerialDescriptor.j("externalUserId", true);
                    pluginGeneratedSerialDescriptor.j(AvatarStatus.REVIEW, false);
                    pluginGeneratedSerialDescriptor.j("id", true);
                    pluginGeneratedSerialDescriptor.j("applicantId", true);
                    pluginGeneratedSerialDescriptor.j("env", true);
                    pluginGeneratedSerialDescriptor.j("type", true);
                    pluginGeneratedSerialDescriptor.j(RequestReviewResultKt.INFO_TYPE, true);
                    pluginGeneratedSerialDescriptor.j("fixedInfo", true);
                    pluginGeneratedSerialDescriptor.j("lang", true);
                    pluginGeneratedSerialDescriptor.j("metadata", true);
                    pluginGeneratedSerialDescriptor.j("email", true);
                    pluginGeneratedSerialDescriptor.j("tin", true);
                    pluginGeneratedSerialDescriptor.j("phone", true);
                    pluginGeneratedSerialDescriptor.j("key", true);
                    pluginGeneratedSerialDescriptor.j("applicantPlatform", true);
                    pluginGeneratedSerialDescriptor.j("ipCountry", true);
                    pluginGeneratedSerialDescriptor.j("agreement", true);
                    pluginGeneratedSerialDescriptor.j("questionnaires", true);
                    f433346b = pluginGeneratedSerialDescriptor;
                }

                private a() {
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlinx.serialization.InterfaceC43386e
                @k
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public C12460d deserialize(@k Decoder decoder) {
                    Object obj;
                    int i12;
                    String strF;
                    String strF2;
                    int i13;
                    SerialDescriptor f332717a = getF332717a();
                    kotlinx.serialization.encoding.c cVarC = decoder.c(f332717a);
                    Object objF = null;
                    Object objF2 = null;
                    Object objF3 = null;
                    Object objF4 = null;
                    Object objF5 = null;
                    Object objF6 = null;
                    Object objF7 = null;
                    Object objF8 = null;
                    Object objF9 = null;
                    String str = null;
                    String strF3 = null;
                    C12459c c12459cF = null;
                    C12459c c12459cF2 = null;
                    String str2 = null;
                    String strF4 = null;
                    String strS = null;
                    String str3 = null;
                    e eVarV = null;
                    String strF5 = null;
                    String str4 = null;
                    f fVarV = null;
                    String strS2 = null;
                    boolean z12 = true;
                    int i14 = 0;
                    while (z12) {
                        String strF6 = str;
                        int iJ2 = cVarC.j(f332717a);
                        String strF7 = str2;
                        switch (iJ2) {
                            case -1:
                                z12 = false;
                                c12459cF = c12459cF;
                                str = strF6;
                                strF5 = strF5;
                                str2 = strF7;
                                strF4 = strF4;
                                strF3 = strF3;
                            case 0:
                                obj = objF8;
                                strF3 = strF3;
                                c12459cF2 = c12459cF2;
                                strF4 = cVarC.f(f332717a, 0, V0.f412822a, strF4);
                                strF5 = strF5;
                                objF9 = objF9;
                                i12 = 1;
                                str4 = str4;
                                strF = str3;
                                c12459cF = c12459cF;
                                i14 |= i12;
                                str3 = strF;
                                str = strF6;
                                str2 = strF7;
                                objF8 = obj;
                            case 1:
                                obj = objF8;
                                String str5 = str4;
                                c12459cF = c12459cF;
                                c12459cF2 = c12459cF2;
                                strF5 = strF5;
                                i12 = 2;
                                str4 = str5;
                                strF = cVarC.f(f332717a, 1, V0.f412822a, str3);
                                objF9 = objF9;
                                i14 |= i12;
                                str3 = strF;
                                str = strF6;
                                str2 = strF7;
                                objF8 = obj;
                            case 2:
                                obj = objF8;
                                eVarV = cVarC.v(f332717a, 2, e.a.f433353a, eVarV);
                                c12459cF2 = c12459cF2;
                                objF9 = objF9;
                                str4 = str4;
                                strF5 = strF5;
                                strF = str3;
                                i12 = 4;
                                i14 |= i12;
                                str3 = strF;
                                str = strF6;
                                str2 = strF7;
                                objF8 = obj;
                            case 3:
                                obj = objF8;
                                strF2 = str4;
                                strF5 = cVarC.f(f332717a, 3, V0.f412822a, strF5);
                                objF9 = objF9;
                                i12 = 8;
                                str4 = strF2;
                                strF = str3;
                                i14 |= i12;
                                str3 = strF;
                                str = strF6;
                                str2 = strF7;
                                objF8 = obj;
                            case 4:
                                obj = objF8;
                                objF9 = objF9;
                                i12 = 16;
                                strF2 = cVarC.f(f332717a, 4, V0.f412822a, str4);
                                str4 = strF2;
                                strF = str3;
                                i14 |= i12;
                                str3 = strF;
                                str = strF6;
                                str2 = strF7;
                                objF8 = obj;
                            case 5:
                                obj = objF8;
                                i12 = 32;
                                fVarV = cVarC.v(f332717a, 5, f.a.f433377a, fVarV);
                                strF = str3;
                                i14 |= i12;
                                str3 = strF;
                                str = strF6;
                                str2 = strF7;
                                objF8 = obj;
                            case 6:
                                obj = objF8;
                                i13 = 64;
                                strS = cVarC.s(f332717a, 6);
                                strF = str3;
                                i12 = i13;
                                i14 |= i12;
                                str3 = strF;
                                str = strF6;
                                str2 = strF7;
                                objF8 = obj;
                            case 7:
                                obj = objF8;
                                i13 = 128;
                                strS2 = cVarC.s(f332717a, 7);
                                strF = str3;
                                i12 = i13;
                                i14 |= i12;
                                str3 = strF;
                                str = strF6;
                                str2 = strF7;
                                objF8 = obj;
                            case 8:
                                obj = objF8;
                                i12 = 256;
                                strF6 = cVarC.f(f332717a, 8, V0.f412822a, strF6);
                                strF = str3;
                                i14 |= i12;
                                str3 = strF;
                                str = strF6;
                                str2 = strF7;
                                objF8 = obj;
                            case 9:
                                obj = objF8;
                                i12 = 512;
                                strF7 = cVarC.f(f332717a, 9, V0.f412822a, strF7);
                                strF = str3;
                                i14 |= i12;
                                str3 = strF;
                                str = strF6;
                                str2 = strF7;
                                objF8 = obj;
                            case 10:
                                i12 = 1024;
                                obj = objF8;
                                c12459cF = cVarC.f(f332717a, 10, C12459c.a.f433321a, c12459cF);
                                strF = str3;
                                i14 |= i12;
                                str3 = strF;
                                str = strF6;
                                str2 = strF7;
                                objF8 = obj;
                            case 11:
                                i12 = 2048;
                                obj = objF8;
                                c12459cF2 = cVarC.f(f332717a, 11, C12459c.a.f433321a, c12459cF2);
                                strF = str3;
                                i14 |= i12;
                                str3 = strF;
                                str = strF6;
                                str2 = strF7;
                                objF8 = obj;
                            case 12:
                                i12 = 4096;
                                obj = objF8;
                                strF3 = cVarC.f(f332717a, 12, V0.f412822a, strF3);
                                strF = str3;
                                i14 |= i12;
                                str3 = strF;
                                str = strF6;
                                str2 = strF7;
                                objF8 = obj;
                            case 13:
                                objF9 = cVarC.f(f332717a, 13, new C43401f(e.a.f433213a), objF9);
                                i12 = 8192;
                                obj = objF8;
                                strF = str3;
                                i14 |= i12;
                                str3 = strF;
                                str = strF6;
                                str2 = strF7;
                                objF8 = obj;
                            case 14:
                                objF3 = cVarC.f(f332717a, 14, V0.f412822a, objF3);
                                i12 = Http2.INITIAL_MAX_FRAME_SIZE;
                                obj = objF8;
                                strF = str3;
                                i14 |= i12;
                                str3 = strF;
                                str = strF6;
                                str2 = strF7;
                                objF8 = obj;
                            case 15:
                                objF2 = cVarC.f(f332717a, 15, V0.f412822a, objF2);
                                i12 = 32768;
                                obj = objF8;
                                strF = str3;
                                i14 |= i12;
                                str3 = strF;
                                str = strF6;
                                str2 = strF7;
                                objF8 = obj;
                            case 16:
                                objF = cVarC.f(f332717a, 16, V0.f412822a, objF);
                                i12 = AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR;
                                obj = objF8;
                                strF = str3;
                                i14 |= i12;
                                str3 = strF;
                                str = strF6;
                                str2 = strF7;
                                objF8 = obj;
                            case 17:
                                objF4 = cVarC.f(f332717a, 17, V0.f412822a, objF4);
                                i12 = 131072;
                                obj = objF8;
                                strF = str3;
                                i14 |= i12;
                                str3 = strF;
                                str = strF6;
                                str2 = strF7;
                                objF8 = obj;
                            case 18:
                                objF5 = cVarC.f(f332717a, 18, V0.f412822a, objF5);
                                i12 = 262144;
                                obj = objF8;
                                strF = str3;
                                i14 |= i12;
                                str3 = strF;
                                str = strF6;
                                str2 = strF7;
                                objF8 = obj;
                            case 19:
                                objF6 = cVarC.f(f332717a, 19, V0.f412822a, objF6);
                                i12 = 524288;
                                obj = objF8;
                                strF = str3;
                                i14 |= i12;
                                str3 = strF;
                                str = strF6;
                                str2 = strF7;
                                objF8 = obj;
                            case 20:
                                objF7 = cVarC.f(f332717a, 20, b.a.f433029a, objF7);
                                i12 = 1048576;
                                obj = objF8;
                                strF = str3;
                                i14 |= i12;
                                str3 = strF;
                                str = strF6;
                                str2 = strF7;
                                objF8 = obj;
                            case 21:
                                objF8 = cVarC.f(f332717a, 21, new C43401f(r.a.f433558a), objF8);
                                i14 |= 2097152;
                                str = strF6;
                                str2 = strF7;
                            default:
                                throw new UnknownFieldException(iJ2);
                        }
                    }
                    Object obj2 = objF8;
                    C12459c c12459c = c12459cF;
                    String str6 = str2;
                    String str7 = strF5;
                    String str8 = str4;
                    C12459c c12459c2 = c12459cF2;
                    String str9 = strF4;
                    String str10 = strF3;
                    cVarC.d(f332717a);
                    return new C12460d(i14, str9, str3, eVarV, str7, str8, fVarV, strS, strS2, str, str6, c12459c, c12459c2, str10, (List) objF9, (String) objF3, (String) objF2, (String) objF, (String) objF4, (String) objF5, (String) objF6, (ru.cyberity.cbr.core.data.model.b) objF7, (List) obj2, (P0) null);
                }

                @Override // kotlinx.serialization.internal.N
                @k
                public KSerializer<?>[] childSerializers() {
                    V0 v02 = V0.f412822a;
                    KSerializer<?> kSerializerA = L51.a.a(v02);
                    KSerializer<?> kSerializerA2 = L51.a.a(v02);
                    KSerializer<?> kSerializerA3 = L51.a.a(v02);
                    KSerializer<?> kSerializerA4 = L51.a.a(v02);
                    KSerializer<?> kSerializerA5 = L51.a.a(v02);
                    KSerializer<?> kSerializerA6 = L51.a.a(v02);
                    C12459c.a aVar = C12459c.a.f433321a;
                    return new KSerializer[]{kSerializerA, kSerializerA2, e.a.f433353a, kSerializerA3, kSerializerA4, f.a.f433377a, v02, v02, kSerializerA5, kSerializerA6, L51.a.a(aVar), L51.a.a(aVar), L51.a.a(v02), L51.a.a(new C43401f(e.a.f433213a)), L51.a.a(v02), L51.a.a(v02), L51.a.a(v02), L51.a.a(v02), L51.a.a(v02), L51.a.a(v02), L51.a.a(b.a.f433029a), L51.a.a(new C43401f(r.a.f433558a))};
                }

                @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
                @k
                /* renamed from: getDescriptor */
                public SerialDescriptor getF332717a() {
                    return f433346b;
                }

                @Override // kotlinx.serialization.internal.N
                @k
                public KSerializer<?>[] typeParametersSerializers() {
                    return G0.f412773a;
                }

                @Override // kotlinx.serialization.x
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public void serialize(@k Encoder encoder, @k C12460d value) {
                    SerialDescriptor f332717a = getF332717a();
                    kotlinx.serialization.encoding.d dVarC = encoder.c(f332717a);
                    C12460d.a(value, dVarC, f332717a);
                    dVarC.d(f332717a);
                }
            }

            /* compiled from: ListApplicantsResponse.kt */
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lru/cyberity/cbr/core/data/model/remote/response/d$c$d$b;", "", "Lkotlinx/serialization/KSerializer;", "Lru/cyberity/cbr/core/data/model/remote/response/d$c$d;", "serializer", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
            /* renamed from: ru.cyberity.cbr.core.data.model.remote.response.d$c$d$b, reason: from kotlin metadata */
            public static final class Companion {
                public /* synthetic */ Companion(C42822w c42822w) {
                    this();
                }

                @k
                public final KSerializer<C12460d> serializer() {
                    return a.f433345a;
                }

                private Companion() {
                }
            }

            @InterfaceC42830m
            public /* synthetic */ C12460d(int i12, @v String str, @v String str2, @v e eVar, @v String str3, @v String str4, @v f fVar, @v String str5, @v String str6, @v String str7, @v String str8, @v C12459c c12459c, @v C12459c c12459c2, @v String str9, @v List list, @v String str10, @v String str11, @v String str12, @v String str13, @v String str14, @v String str15, @v ru.cyberity.cbr.core.data.model.b bVar, @v List list2, P0 p02) {
                if (36 != (i12 & 36)) {
                    E0.b(i12, 36, a.f433345a.getF332717a());
                    throw null;
                }
                if ((i12 & 1) == 0) {
                    this.createdAt = null;
                } else {
                    this.createdAt = str;
                }
                if ((i12 & 2) == 0) {
                    this.inspectionId = null;
                } else {
                    this.inspectionId = str2;
                }
                this.requiredIdDocs = eVar;
                if ((i12 & 8) == 0) {
                    this.clientId = null;
                } else {
                    this.clientId = str3;
                }
                if ((i12 & 16) == 0) {
                    this.externalUserId = null;
                } else {
                    this.externalUserId = str4;
                }
                this.review = fVar;
                if ((i12 & 64) == 0) {
                    this.id = "";
                } else {
                    this.id = str5;
                }
                if ((i12 & 128) == 0) {
                    this.applicantId = "";
                } else {
                    this.applicantId = str6;
                }
                if ((i12 & 256) == 0) {
                    this.env = null;
                } else {
                    this.env = str7;
                }
                if ((i12 & 512) == 0) {
                    this.type = null;
                } else {
                    this.type = str8;
                }
                if ((i12 & 1024) == 0) {
                    this.info = null;
                } else {
                    this.info = c12459c;
                }
                if ((i12 & 2048) == 0) {
                    this.fixedInfo = null;
                } else {
                    this.fixedInfo = c12459c2;
                }
                if ((i12 & 4096) == 0) {
                    this.lang = null;
                } else {
                    this.lang = str9;
                }
                if ((i12 & 8192) == 0) {
                    this.metadata = null;
                } else {
                    this.metadata = list;
                }
                if ((i12 & Http2.INITIAL_MAX_FRAME_SIZE) == 0) {
                    this.email = null;
                } else {
                    this.email = str10;
                }
                if ((32768 & i12) == 0) {
                    this.tin = null;
                } else {
                    this.tin = str11;
                }
                if ((65536 & i12) == 0) {
                    this.phone = null;
                } else {
                    this.phone = str12;
                }
                if ((131072 & i12) == 0) {
                    this.key = null;
                } else {
                    this.key = str13;
                }
                if ((262144 & i12) == 0) {
                    this.applicantPlatform = null;
                } else {
                    this.applicantPlatform = str14;
                }
                if ((524288 & i12) == 0) {
                    this.ipCountry = null;
                } else {
                    this.ipCountry = str15;
                }
                if ((1048576 & i12) == 0) {
                    this.agreement = null;
                } else {
                    this.agreement = bVar;
                }
                if ((i12 & 2097152) == 0) {
                    this.questionnaires = null;
                } else {
                    this.questionnaires = list2;
                }
            }

            @l
            /* renamed from: A, reason: from getter */
            public final String getApplicantPlatform() {
                return this.applicantPlatform;
            }

            @l
            /* renamed from: C, reason: from getter */
            public final String getClientId() {
                return this.clientId;
            }

            @l
            /* renamed from: E, reason: from getter */
            public final String getCreatedAt() {
                return this.createdAt;
            }

            @l
            /* renamed from: G, reason: from getter */
            public final String getEmail() {
                return this.email;
            }

            @l
            /* renamed from: I, reason: from getter */
            public final String getEnv() {
                return this.env;
            }

            @l
            /* renamed from: K, reason: from getter */
            public final String getExternalUserId() {
                return this.externalUserId;
            }

            @l
            /* renamed from: M, reason: from getter */
            public final C12459c getFixedInfo() {
                return this.fixedInfo;
            }

            @k
            /* renamed from: O, reason: from getter */
            public final String getId() {
                return this.id;
            }

            @l
            /* renamed from: Q, reason: from getter */
            public final C12459c getInfo() {
                return this.info;
            }

            @l
            /* renamed from: S, reason: from getter */
            public final String getInspectionId() {
                return this.inspectionId;
            }

            @l
            /* renamed from: U, reason: from getter */
            public final String getIpCountry() {
                return this.ipCountry;
            }

            @l
            /* renamed from: W, reason: from getter */
            public final String getKey() {
                return this.key;
            }

            @l
            /* renamed from: Y, reason: from getter */
            public final String getLang() {
                return this.lang;
            }

            @l
            public final String a() {
                return this.createdAt;
            }

            @l
            public final List<ru.cyberity.cbr.core.data.model.remote.e> a0() {
                return this.metadata;
            }

            @l
            /* renamed from: b, reason: from getter */
            public final String getType() {
                return this.type;
            }

            @l
            public final C12459c c() {
                return this.info;
            }

            @l
            /* renamed from: c0, reason: from getter */
            public final String getPhone() {
                return this.phone;
            }

            @l
            public final C12459c d() {
                return this.fixedInfo;
            }

            @l
            public final String e() {
                return this.lang;
            }

            @l
            public final List<r> e0() {
                return this.questionnaires;
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof C12460d)) {
                    return false;
                }
                C12460d c12460d = (C12460d) other;
                return L.f(this.createdAt, c12460d.createdAt) && L.f(this.inspectionId, c12460d.inspectionId) && L.f(this.requiredIdDocs, c12460d.requiredIdDocs) && L.f(this.clientId, c12460d.clientId) && L.f(this.externalUserId, c12460d.externalUserId) && L.f(this.review, c12460d.review) && L.f(this.id, c12460d.id) && L.f(this.applicantId, c12460d.applicantId) && L.f(this.env, c12460d.env) && L.f(this.type, c12460d.type) && L.f(this.info, c12460d.info) && L.f(this.fixedInfo, c12460d.fixedInfo) && L.f(this.lang, c12460d.lang) && L.f(this.metadata, c12460d.metadata) && L.f(this.email, c12460d.email) && L.f(this.tin, c12460d.tin) && L.f(this.phone, c12460d.phone) && L.f(this.key, c12460d.key) && L.f(this.applicantPlatform, c12460d.applicantPlatform) && L.f(this.ipCountry, c12460d.ipCountry) && L.f(this.agreement, c12460d.agreement) && L.f(this.questionnaires, c12460d.questionnaires);
            }

            @l
            public final List<ru.cyberity.cbr.core.data.model.remote.e> f() {
                return this.metadata;
            }

            @l
            public final String g() {
                return this.email;
            }

            @k
            /* renamed from: g0, reason: from getter */
            public final e getRequiredIdDocs() {
                return this.requiredIdDocs;
            }

            @l
            /* renamed from: h, reason: from getter */
            public final String getTin() {
                return this.tin;
            }

            public int hashCode() {
                String str = this.createdAt;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.inspectionId;
                int iHashCode2 = (this.requiredIdDocs.hashCode() + ((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
                String str3 = this.clientId;
                int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.externalUserId;
                int iD2 = H.d(H.d((this.review.hashCode() + ((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31)) * 31, 31, this.id), 31, this.applicantId);
                String str5 = this.env;
                int iHashCode4 = (iD2 + (str5 == null ? 0 : str5.hashCode())) * 31;
                String str6 = this.type;
                int iHashCode5 = (iHashCode4 + (str6 == null ? 0 : str6.hashCode())) * 31;
                C12459c c12459c = this.info;
                int iHashCode6 = (iHashCode5 + (c12459c == null ? 0 : c12459c.hashCode())) * 31;
                C12459c c12459c2 = this.fixedInfo;
                int iHashCode7 = (iHashCode6 + (c12459c2 == null ? 0 : c12459c2.hashCode())) * 31;
                String str7 = this.lang;
                int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
                List<ru.cyberity.cbr.core.data.model.remote.e> list = this.metadata;
                int iHashCode9 = (iHashCode8 + (list == null ? 0 : list.hashCode())) * 31;
                String str8 = this.email;
                int iHashCode10 = (iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
                String str9 = this.tin;
                int iHashCode11 = (iHashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
                String str10 = this.phone;
                int iHashCode12 = (iHashCode11 + (str10 == null ? 0 : str10.hashCode())) * 31;
                String str11 = this.key;
                int iHashCode13 = (iHashCode12 + (str11 == null ? 0 : str11.hashCode())) * 31;
                String str12 = this.applicantPlatform;
                int iHashCode14 = (iHashCode13 + (str12 == null ? 0 : str12.hashCode())) * 31;
                String str13 = this.ipCountry;
                int iHashCode15 = (iHashCode14 + (str13 == null ? 0 : str13.hashCode())) * 31;
                ru.cyberity.cbr.core.data.model.b bVar = this.agreement;
                int iHashCode16 = (iHashCode15 + (bVar == null ? 0 : bVar.hashCode())) * 31;
                List<r> list2 = this.questionnaires;
                return iHashCode16 + (list2 != null ? list2.hashCode() : 0);
            }

            @l
            public final String i() {
                return this.phone;
            }

            @k
            /* renamed from: i0, reason: from getter */
            public final f getReview() {
                return this.review;
            }

            @l
            public final String j() {
                return this.key;
            }

            @l
            public final String k() {
                return this.applicantPlatform;
            }

            @l
            public final String k0() {
                return this.tin;
            }

            @l
            public final String l() {
                return this.inspectionId;
            }

            @l
            public final String m() {
                return this.ipCountry;
            }

            @l
            public final String m0() {
                return this.type;
            }

            @l
            /* renamed from: n, reason: from getter */
            public final ru.cyberity.cbr.core.data.model.b getAgreement() {
                return this.agreement;
            }

            @l
            public final List<r> o() {
                return this.questionnaires;
            }

            @k
            public final e p() {
                return this.requiredIdDocs;
            }

            @l
            public final String q() {
                return this.clientId;
            }

            @l
            public final String r() {
                return this.externalUserId;
            }

            @k
            public final f s() {
                return this.review;
            }

            @k
            public final String t() {
                return this.id;
            }

            @k
            public String toString() {
                StringBuilder sb2 = new StringBuilder("Item(createdAt=");
                sb2.append(this.createdAt);
                sb2.append(", inspectionId=");
                sb2.append(this.inspectionId);
                sb2.append(", requiredIdDocs=");
                sb2.append(this.requiredIdDocs);
                sb2.append(", clientId=");
                sb2.append(this.clientId);
                sb2.append(", externalUserId=");
                sb2.append(this.externalUserId);
                sb2.append(", review=");
                sb2.append(this.review);
                sb2.append(", id=");
                sb2.append(this.id);
                sb2.append(", applicantId=");
                sb2.append(this.applicantId);
                sb2.append(", env=");
                sb2.append(this.env);
                sb2.append(", type=");
                sb2.append(this.type);
                sb2.append(", info=");
                sb2.append(this.info);
                sb2.append(", fixedInfo=");
                sb2.append(this.fixedInfo);
                sb2.append(", lang=");
                sb2.append(this.lang);
                sb2.append(", metadata=");
                sb2.append(this.metadata);
                sb2.append(", email=");
                sb2.append(this.email);
                sb2.append(", tin=");
                sb2.append(this.tin);
                sb2.append(", phone=");
                sb2.append(this.phone);
                sb2.append(", key=");
                sb2.append(this.key);
                sb2.append(", applicantPlatform=");
                sb2.append(this.applicantPlatform);
                sb2.append(", ipCountry=");
                sb2.append(this.ipCountry);
                sb2.append(", agreement=");
                sb2.append(this.agreement);
                sb2.append(", questionnaires=");
                return H.p(sb2, this.questionnaires, ')');
            }

            @k
            /* renamed from: u, reason: from getter */
            public final String getApplicantId() {
                return this.applicantId;
            }

            @l
            public final String v() {
                return this.env;
            }

            @l
            public final ru.cyberity.cbr.core.data.model.b w() {
                return this.agreement;
            }

            @k
            public final String y() {
                return this.applicantId;
            }

            public C12460d(@l String str, @l String str2, @k e eVar, @l String str3, @l String str4, @k f fVar, @k String str5, @k String str6, @l String str7, @l String str8, @l C12459c c12459c, @l C12459c c12459c2, @l String str9, @l List<ru.cyberity.cbr.core.data.model.remote.e> list, @l String str10, @l String str11, @l String str12, @l String str13, @l String str14, @l String str15, @l ru.cyberity.cbr.core.data.model.b bVar, @l List<r> list2) {
                this.createdAt = str;
                this.inspectionId = str2;
                this.requiredIdDocs = eVar;
                this.clientId = str3;
                this.externalUserId = str4;
                this.review = fVar;
                this.id = str5;
                this.applicantId = str6;
                this.env = str7;
                this.type = str8;
                this.info = c12459c;
                this.fixedInfo = c12459c2;
                this.lang = str9;
                this.metadata = list;
                this.email = str10;
                this.tin = str11;
                this.phone = str12;
                this.key = str13;
                this.applicantPlatform = str14;
                this.ipCountry = str15;
                this.agreement = bVar;
                this.questionnaires = list2;
            }

            @k
            public final C12460d a(@l String createdAt, @l String inspectionId, @k e requiredIdDocs, @l String clientId, @l String externalUserId, @k f review, @k String id2, @k String applicantId, @l String env, @l String type, @l C12459c info, @l C12459c fixedInfo, @l String lang, @l List<ru.cyberity.cbr.core.data.model.remote.e> metadata, @l String email, @l String tin, @l String phone, @l String key, @l String applicantPlatform, @l String ipCountry, @l ru.cyberity.cbr.core.data.model.b agreement, @l List<r> questionnaires) {
                return new C12460d(createdAt, inspectionId, requiredIdDocs, clientId, externalUserId, review, id2, applicantId, env, type, info, fixedInfo, lang, metadata, email, tin, phone, key, applicantPlatform, ipCountry, agreement, questionnaires);
            }

            @n
            public static final void a(@k C12460d self, @k kotlinx.serialization.encoding.d output, @k SerialDescriptor serialDesc) {
                if (output.u() || self.createdAt != null) {
                    output.p(serialDesc, 0, V0.f412822a, self.createdAt);
                }
                if (output.u() || self.inspectionId != null) {
                    output.p(serialDesc, 1, V0.f412822a, self.inspectionId);
                }
                output.F(serialDesc, 2, e.a.f433353a, self.requiredIdDocs);
                if (output.u() || self.clientId != null) {
                    output.p(serialDesc, 3, V0.f412822a, self.clientId);
                }
                if (output.u() || self.externalUserId != null) {
                    output.p(serialDesc, 4, V0.f412822a, self.externalUserId);
                }
                output.F(serialDesc, 5, f.a.f433377a, self.review);
                if (output.u() || !L.f(self.id, "")) {
                    output.l(serialDesc, 6, self.id);
                }
                if (output.u() || !L.f(self.applicantId, "")) {
                    output.l(serialDesc, 7, self.applicantId);
                }
                if (output.u() || self.env != null) {
                    output.p(serialDesc, 8, V0.f412822a, self.env);
                }
                if (output.u() || self.type != null) {
                    output.p(serialDesc, 9, V0.f412822a, self.type);
                }
                if (output.u() || self.info != null) {
                    output.p(serialDesc, 10, C12459c.a.f433321a, self.info);
                }
                if (output.u() || self.fixedInfo != null) {
                    output.p(serialDesc, 11, C12459c.a.f433321a, self.fixedInfo);
                }
                if (output.u() || self.lang != null) {
                    output.p(serialDesc, 12, V0.f412822a, self.lang);
                }
                if (output.u() || self.metadata != null) {
                    output.p(serialDesc, 13, new C43401f(e.a.f433213a), self.metadata);
                }
                if (output.u() || self.email != null) {
                    output.p(serialDesc, 14, V0.f412822a, self.email);
                }
                if (output.u() || self.tin != null) {
                    output.p(serialDesc, 15, V0.f412822a, self.tin);
                }
                if (output.u() || self.phone != null) {
                    output.p(serialDesc, 16, V0.f412822a, self.phone);
                }
                if (output.u() || self.key != null) {
                    output.p(serialDesc, 17, V0.f412822a, self.key);
                }
                if (output.u() || self.applicantPlatform != null) {
                    output.p(serialDesc, 18, V0.f412822a, self.applicantPlatform);
                }
                if (output.u() || self.ipCountry != null) {
                    output.p(serialDesc, 19, V0.f412822a, self.ipCountry);
                }
                if (output.u() || self.agreement != null) {
                    output.p(serialDesc, 20, b.a.f433029a, self.agreement);
                }
                if (!output.u() && self.questionnaires == null) {
                    return;
                }
                output.p(serialDesc, 21, new C43401f(r.a.f433558a), self.questionnaires);
            }

            @v
            public static /* synthetic */ void B() {
            }

            @v
            public static /* synthetic */ void D() {
            }

            @v
            public static /* synthetic */ void F() {
            }

            @v
            public static /* synthetic */ void H() {
            }

            @v
            public static /* synthetic */ void J() {
            }

            @v
            public static /* synthetic */ void L() {
            }

            @v
            public static /* synthetic */ void N() {
            }

            @v
            public static /* synthetic */ void P() {
            }

            @v
            public static /* synthetic */ void R() {
            }

            @v
            public static /* synthetic */ void T() {
            }

            @v
            public static /* synthetic */ void V() {
            }

            @v
            public static /* synthetic */ void X() {
            }

            @v
            public static /* synthetic */ void Z() {
            }

            @v
            public static /* synthetic */ void b0() {
            }

            @v
            public static /* synthetic */ void d0() {
            }

            @v
            public static /* synthetic */ void f0() {
            }

            @v
            public static /* synthetic */ void h0() {
            }

            @v
            public static /* synthetic */ void j0() {
            }

            @v
            public static /* synthetic */ void l0() {
            }

            @v
            public static /* synthetic */ void n0() {
            }

            @v
            public static /* synthetic */ void x() {
            }

            @v
            public static /* synthetic */ void z() {
            }

            public /* synthetic */ C12460d(String str, String str2, e eVar, String str3, String str4, f fVar, String str5, String str6, String str7, String str8, C12459c c12459c, C12459c c12459c2, String str9, List list, String str10, String str11, String str12, String str13, String str14, String str15, ru.cyberity.cbr.core.data.model.b bVar, List list2, int i12, C42822w c42822w) {
                this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : str2, eVar, (i12 & 8) != 0 ? null : str3, (i12 & 16) != 0 ? null : str4, fVar, (i12 & 64) != 0 ? "" : str5, (i12 & 128) != 0 ? "" : str6, (i12 & 256) != 0 ? null : str7, (i12 & 512) != 0 ? null : str8, (i12 & 1024) != 0 ? null : c12459c, (i12 & 2048) != 0 ? null : c12459c2, (i12 & 4096) != 0 ? null : str9, (i12 & 8192) != 0 ? null : list, (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : str10, (32768 & i12) != 0 ? null : str11, (65536 & i12) != 0 ? null : str12, (131072 & i12) != 0 ? null : str13, (262144 & i12) != 0 ? null : str14, (524288 & i12) != 0 ? null : str15, (1048576 & i12) != 0 ? null : bVar, (i12 & 2097152) != 0 ? null : list2);
            }
        }

        /* compiled from: ListApplicantsResponse.kt */
        @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\b\u0087\b\u0018\u0000 92\u00020\u0001:\u0003\u0019\u001c\u001eBm\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rB\u0081\u0001\b\u0017\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0010\b\u0001\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0001\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002\u0012\u0010\b\u0001\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002\u0012\u0010\b\u0001\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002\u0012\u0010\b\u0001\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J(\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016HÇ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJ\u0018\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001bJ\u0018\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001bJ\u0018\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001bJv\u0010\u0019\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00022\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00022\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00022\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0019\u0010\"J\u0010\u0010#\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010(\u001a\u00020\u00052\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R(\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010*\u0012\u0004\b,\u0010-\u001a\u0004\b+\u0010\u001bR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010.\u0012\u0004\b0\u0010-\u001a\u0004\b/\u0010\u001dR(\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010*\u0012\u0004\b2\u0010-\u001a\u0004\b1\u0010\u001bR(\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010*\u0012\u0004\b4\u0010-\u001a\u0004\b3\u0010\u001bR(\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b \u0010*\u0012\u0004\b6\u0010-\u001a\u0004\b5\u0010\u001bR(\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b!\u0010*\u0012\u0004\b8\u0010-\u001a\u0004\b7\u0010\u001b¨\u0006:"}, d2 = {"Lru/cyberity/cbr/core/data/model/remote/response/d$c$e;", "", "", "Lru/cyberity/cbr/core/data/model/remote/response/d$c$e$c;", "docSets", "", "videoIdent", "", "videoIdentUploadTypes", "stepsOutsideVideoId", "includedCountries", "excludedCountries", "<init>", "(Ljava/util/List;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "", "seen1", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lkotlinx/serialization/internal/P0;)V", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lkotlin/G0;", "a", "(Lru/cyberity/cbr/core/data/model/remote/response/d$c$e;Lkotlinx/serialization/encoding/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "()Ljava/util/List;", "b", "()Ljava/lang/Boolean;", "c", "d", "e", "f", "(Ljava/util/List;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lru/cyberity/cbr/core/data/model/remote/response/d$c$e;", "toString", "()Ljava/lang/String;", "hashCode", "()I", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "g", "getDocSets$annotations", "()V", "Ljava/lang/Boolean;", "o", "getVideoIdent$annotations", "q", "getVideoIdentUploadTypes$annotations", "m", "getStepsOutsideVideoId$annotations", "k", "getIncludedCountries$annotations", "i", "getExcludedCountries$annotations", "Companion", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
        @w
        public static final /* data */ class e {

            /* renamed from: Companion, reason: from kotlin metadata */
            @k
            public static final Companion INSTANCE = new Companion(null);

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            @l
            private final List<C12461c> docSets;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            @l
            private final Boolean videoIdent;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata */
            @l
            private final List<String> videoIdentUploadTypes;

            /* renamed from: d, reason: collision with root package name and from kotlin metadata */
            @l
            private final List<String> stepsOutsideVideoId;

            /* renamed from: e, reason: collision with root package name and from kotlin metadata */
            @l
            private final List<String> includedCountries;

            /* renamed from: f, reason: collision with root package name and from kotlin metadata */
            @l
            private final List<String> excludedCountries;

            /* compiled from: ListApplicantsResponse.kt */
            @Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000b\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"ru/cyberity/cbr/core/data/model/remote/response/ListApplicantsResponse.Data.RequiredIdDocs.$serializer", "Lkotlinx/serialization/internal/N;", "Lru/cyberity/cbr/core/data/model/remote/response/d$c$e;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "a", "(Lkotlinx/serialization/encoding/Decoder;)Lru/cyberity/cbr/core/data/model/remote/response/d$c$e;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlin/G0;", "(Lkotlinx/serialization/encoding/Encoder;Lru/cyberity/cbr/core/data/model/remote/response/d$c$e;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
            @InterfaceC42830m
            public static final class a implements N<e> {

                /* renamed from: a, reason: collision with root package name */
                @k
                public static final a f433353a;

                /* renamed from: b, reason: collision with root package name */
                public static final /* synthetic */ SerialDescriptor f433354b;

                static {
                    a aVar = new a();
                    f433353a = aVar;
                    PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.cyberity.cbr.core.data.model.remote.response.ListApplicantsResponse.Data.RequiredIdDocs", aVar, 6);
                    pluginGeneratedSerialDescriptor.j("docSets", true);
                    pluginGeneratedSerialDescriptor.j("videoIdent", true);
                    pluginGeneratedSerialDescriptor.j("videoIdentUploadTypes", true);
                    pluginGeneratedSerialDescriptor.j("stepsOutsideVideoId", true);
                    pluginGeneratedSerialDescriptor.j("includedCountries", true);
                    pluginGeneratedSerialDescriptor.j("excludedCountries", true);
                    f433354b = pluginGeneratedSerialDescriptor;
                }

                private a() {
                }

                @Override // kotlinx.serialization.InterfaceC43386e
                @k
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public e deserialize(@k Decoder decoder) {
                    SerialDescriptor f332717a = getF332717a();
                    kotlinx.serialization.encoding.c cVarC = decoder.c(f332717a);
                    Object objF = null;
                    boolean z12 = true;
                    int i12 = 0;
                    Object objF2 = null;
                    Object objF3 = null;
                    Object objF4 = null;
                    Object objF5 = null;
                    Object objF6 = null;
                    while (z12) {
                        int iJ2 = cVarC.j(f332717a);
                        switch (iJ2) {
                            case -1:
                                z12 = false;
                                break;
                            case 0:
                                objF = cVarC.f(f332717a, 0, new C43401f(C12461c.a.f433364a), objF);
                                i12 |= 1;
                                break;
                            case 1:
                                objF2 = cVarC.f(f332717a, 1, C43407i.f412866a, objF2);
                                i12 |= 2;
                                break;
                            case 2:
                                objF3 = cVarC.f(f332717a, 2, new C43401f(V0.f412822a), objF3);
                                i12 |= 4;
                                break;
                            case 3:
                                objF4 = cVarC.f(f332717a, 3, new C43401f(V0.f412822a), objF4);
                                i12 |= 8;
                                break;
                            case 4:
                                objF5 = cVarC.f(f332717a, 4, new C43401f(V0.f412822a), objF5);
                                i12 |= 16;
                                break;
                            case 5:
                                objF6 = cVarC.f(f332717a, 5, new C43401f(V0.f412822a), objF6);
                                i12 |= 32;
                                break;
                            default:
                                throw new UnknownFieldException(iJ2);
                        }
                    }
                    cVarC.d(f332717a);
                    return new e(i12, (List) objF, (Boolean) objF2, (List) objF3, (List) objF4, (List) objF5, (List) objF6, (P0) null);
                }

                @Override // kotlinx.serialization.internal.N
                @k
                public KSerializer<?>[] childSerializers() {
                    KSerializer<?> kSerializerA = L51.a.a(new C43401f(C12461c.a.f433364a));
                    KSerializer<?> kSerializerA2 = L51.a.a(C43407i.f412866a);
                    V0 v02 = V0.f412822a;
                    return new KSerializer[]{kSerializerA, kSerializerA2, L51.a.a(new C43401f(v02)), L51.a.a(new C43401f(v02)), L51.a.a(new C43401f(v02)), L51.a.a(new C43401f(v02))};
                }

                @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
                @k
                /* renamed from: getDescriptor */
                public SerialDescriptor getF332717a() {
                    return f433354b;
                }

                @Override // kotlinx.serialization.internal.N
                @k
                public KSerializer<?>[] typeParametersSerializers() {
                    return G0.f412773a;
                }

                @Override // kotlinx.serialization.x
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public void serialize(@k Encoder encoder, @k e value) {
                    SerialDescriptor f332717a = getF332717a();
                    kotlinx.serialization.encoding.d dVarC = encoder.c(f332717a);
                    e.a(value, dVarC, f332717a);
                    dVarC.d(f332717a);
                }
            }

            /* compiled from: ListApplicantsResponse.kt */
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lru/cyberity/cbr/core/data/model/remote/response/d$c$e$b;", "", "Lkotlinx/serialization/KSerializer;", "Lru/cyberity/cbr/core/data/model/remote/response/d$c$e;", "serializer", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
            /* renamed from: ru.cyberity.cbr.core.data.model.remote.response.d$c$e$b, reason: from kotlin metadata */
            public static final class Companion {
                public /* synthetic */ Companion(C42822w c42822w) {
                    this();
                }

                @k
                public final KSerializer<e> serializer() {
                    return a.f433353a;
                }

                private Companion() {
                }
            }

            /* compiled from: ListApplicantsResponse.kt */
            @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0087\b\u0018\u0000 F2\u00020\u0001:\u0002\u0017\u0019B\u008b\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0010\u0010\u0011B\u009f\u0001\b\u0017\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0001\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\u0010\b\u0001\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0001\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0004\u0012\u0010\b\u0001\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0004\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0010\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0018J\u0018\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0018\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001aJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0018J\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0018J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u0018J\u0094\u0001\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00042\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00042\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u0018J\u0010\u0010$\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)J(\u0010\u0017\u001a\u00020/2\u0006\u0010*\u001a\u00020\u00002\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-HÇ\u0001¢\u0006\u0004\b\u0017\u00100R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u00101\u0012\u0004\b3\u00104\u001a\u0004\b2\u0010\u0018R(\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u00105\u0012\u0004\b7\u00104\u001a\u0004\b6\u0010\u001aR(\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u00105\u0012\u0004\b9\u00104\u001a\u0004\b8\u0010\u001aR\"\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u00101\u0012\u0004\b;\u00104\u001a\u0004\b:\u0010\u0018R(\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001d\u00105\u0012\u0004\b=\u00104\u001a\u0004\b<\u0010\u001aR(\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001e\u00105\u0012\u0004\b?\u00104\u001a\u0004\b>\u0010\u001aR\"\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001f\u00101\u0012\u0004\bA\u00104\u001a\u0004\b@\u0010\u0018R\"\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b \u00101\u0012\u0004\bC\u00104\u001a\u0004\bB\u0010\u0018R\"\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b!\u00101\u0012\u0004\bE\u00104\u001a\u0004\bD\u0010\u0018¨\u0006G"}, d2 = {"Lru/cyberity/cbr/core/data/model/remote/response/d$c$e$c;", "", "", "idDocSetType", "", "types", "Lru/cyberity/cbr/core/data/model/IdentitySide;", "sides", "videoRequired", "Lru/cyberity/cbr/core/data/model/h$d;", LocalPublishState.FIELDS, "Lru/cyberity/cbr/core/data/model/h$c;", "customFields", "questionnaireId", "questionnaireDefId", "captureMode", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen1", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/P0;)V", "a", "()Ljava/lang/String;", "b", "()Ljava/util/List;", "c", "d", "e", "f", "g", "h", "i", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lru/cyberity/cbr/core/data/model/remote/response/d$c$e$c;", "toString", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lkotlin/G0;", "(Lru/cyberity/cbr/core/data/model/remote/response/d$c$e$c;Lkotlinx/serialization/encoding/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "p", "getIdDocSetType$annotations", "()V", "Ljava/util/List;", "x", "getTypes$annotations", "v", "getSides$annotations", "z", "getVideoRequired$annotations", "n", "getFields$annotations", "l", "getCustomFields$annotations", "t", "getQuestionnaireId$annotations", "r", "getQuestionnaireDefId$annotations", "j", "getCaptureMode$annotations", "Companion", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
            @w
            /* renamed from: ru.cyberity.cbr.core.data.model.remote.response.d$c$e$c, reason: collision with other inner class name */
            public static final /* data */ class C12461c {

                /* renamed from: Companion, reason: from kotlin metadata */
                @k
                public static final Companion INSTANCE = new Companion(null);

                /* renamed from: a, reason: collision with root package name and from kotlin metadata */
                @l
                private final String idDocSetType;

                /* renamed from: b, reason: collision with root package name and from kotlin metadata */
                @l
                private final List<String> types;

                /* renamed from: c, reason: collision with root package name and from kotlin metadata */
                @l
                private final List<IdentitySide> sides;

                /* renamed from: d, reason: collision with root package name and from kotlin metadata */
                @l
                private final String videoRequired;

                /* renamed from: e, reason: collision with root package name and from kotlin metadata */
                @l
                private final List<h.d> fields;

                /* renamed from: f, reason: collision with root package name and from kotlin metadata */
                @l
                private final List<h.c> customFields;

                /* renamed from: g, reason: collision with root package name and from kotlin metadata */
                @l
                private final String questionnaireId;

                /* renamed from: h, reason: collision with root package name and from kotlin metadata */
                @l
                private final String questionnaireDefId;

                /* renamed from: i, reason: collision with root package name and from kotlin metadata */
                @l
                private final String captureMode;

                /* compiled from: ListApplicantsResponse.kt */
                @Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000b\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"ru/cyberity/cbr/core/data/model/remote/response/ListApplicantsResponse.Data.RequiredIdDocs.DocSetsItem.$serializer", "Lkotlinx/serialization/internal/N;", "Lru/cyberity/cbr/core/data/model/remote/response/d$c$e$c;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "a", "(Lkotlinx/serialization/encoding/Decoder;)Lru/cyberity/cbr/core/data/model/remote/response/d$c$e$c;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlin/G0;", "(Lkotlinx/serialization/encoding/Encoder;Lru/cyberity/cbr/core/data/model/remote/response/d$c$e$c;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
                @InterfaceC42830m
                /* renamed from: ru.cyberity.cbr.core.data.model.remote.response.d$c$e$c$a */
                public static final class a implements N<C12461c> {

                    /* renamed from: a, reason: collision with root package name */
                    @k
                    public static final a f433364a;

                    /* renamed from: b, reason: collision with root package name */
                    public static final /* synthetic */ SerialDescriptor f433365b;

                    static {
                        a aVar = new a();
                        f433364a = aVar;
                        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.cyberity.cbr.core.data.model.remote.response.ListApplicantsResponse.Data.RequiredIdDocs.DocSetsItem", aVar, 9);
                        pluginGeneratedSerialDescriptor.j("idDocSetType", true);
                        pluginGeneratedSerialDescriptor.j("types", true);
                        pluginGeneratedSerialDescriptor.j("subTypes", true);
                        pluginGeneratedSerialDescriptor.j("videoRequired", true);
                        pluginGeneratedSerialDescriptor.j(LocalPublishState.FIELDS, true);
                        pluginGeneratedSerialDescriptor.j("customFields", true);
                        pluginGeneratedSerialDescriptor.j("questionnaireId", true);
                        pluginGeneratedSerialDescriptor.j("questionnaireDefId", true);
                        pluginGeneratedSerialDescriptor.j("captureMode", true);
                        f433365b = pluginGeneratedSerialDescriptor;
                    }

                    private a() {
                    }

                    @Override // kotlinx.serialization.InterfaceC43386e
                    @k
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public C12461c deserialize(@k Decoder decoder) {
                        SerialDescriptor f332717a = getF332717a();
                        kotlinx.serialization.encoding.c cVarC = decoder.c(f332717a);
                        Object objF = null;
                        boolean z12 = true;
                        Object objF2 = null;
                        Object objF3 = null;
                        Object objF4 = null;
                        Object objF5 = null;
                        Object objF6 = null;
                        Object objF7 = null;
                        Object objF8 = null;
                        Object objF9 = null;
                        int i12 = 0;
                        while (z12) {
                            int iJ2 = cVarC.j(f332717a);
                            switch (iJ2) {
                                case -1:
                                    z12 = false;
                                    break;
                                case 0:
                                    objF = cVarC.f(f332717a, 0, V0.f412822a, objF);
                                    i12 |= 1;
                                    break;
                                case 1:
                                    objF2 = cVarC.f(f332717a, 1, new C43401f(V0.f412822a), objF2);
                                    i12 |= 2;
                                    break;
                                case 2:
                                    objF3 = cVarC.f(f332717a, 2, new C43401f(IdentitySide.a.f432994a), objF3);
                                    i12 |= 4;
                                    break;
                                case 3:
                                    objF4 = cVarC.f(f332717a, 3, V0.f412822a, objF4);
                                    i12 |= 8;
                                    break;
                                case 4:
                                    objF5 = cVarC.f(f332717a, 4, new C43401f(h.d.a.f433130a), objF5);
                                    i12 |= 16;
                                    break;
                                case 5:
                                    objF6 = cVarC.f(f332717a, 5, new C43401f(h.c.a.f433121a), objF6);
                                    i12 |= 32;
                                    break;
                                case 6:
                                    objF7 = cVarC.f(f332717a, 6, V0.f412822a, objF7);
                                    i12 |= 64;
                                    break;
                                case 7:
                                    objF8 = cVarC.f(f332717a, 7, V0.f412822a, objF8);
                                    i12 |= 128;
                                    break;
                                case 8:
                                    objF9 = cVarC.f(f332717a, 8, V0.f412822a, objF9);
                                    i12 |= 256;
                                    break;
                                default:
                                    throw new UnknownFieldException(iJ2);
                            }
                        }
                        cVarC.d(f332717a);
                        return new C12461c(i12, (String) objF, (List) objF2, (List) objF3, (String) objF4, (List) objF5, (List) objF6, (String) objF7, (String) objF8, (String) objF9, (P0) null);
                    }

                    @Override // kotlinx.serialization.internal.N
                    @k
                    public KSerializer<?>[] childSerializers() {
                        V0 v02 = V0.f412822a;
                        return new KSerializer[]{L51.a.a(v02), L51.a.a(new C43401f(v02)), L51.a.a(new C43401f(IdentitySide.a.f432994a)), L51.a.a(v02), L51.a.a(new C43401f(h.d.a.f433130a)), L51.a.a(new C43401f(h.c.a.f433121a)), L51.a.a(v02), L51.a.a(v02), L51.a.a(v02)};
                    }

                    @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
                    @k
                    /* renamed from: getDescriptor */
                    public SerialDescriptor getF332717a() {
                        return f433365b;
                    }

                    @Override // kotlinx.serialization.internal.N
                    @k
                    public KSerializer<?>[] typeParametersSerializers() {
                        return G0.f412773a;
                    }

                    @Override // kotlinx.serialization.x
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public void serialize(@k Encoder encoder, @k C12461c value) {
                        SerialDescriptor f332717a = getF332717a();
                        kotlinx.serialization.encoding.d dVarC = encoder.c(f332717a);
                        C12461c.a(value, dVarC, f332717a);
                        dVarC.d(f332717a);
                    }
                }

                /* compiled from: ListApplicantsResponse.kt */
                @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lru/cyberity/cbr/core/data/model/remote/response/d$c$e$c$b;", "", "Lkotlinx/serialization/KSerializer;", "Lru/cyberity/cbr/core/data/model/remote/response/d$c$e$c;", "serializer", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
                /* renamed from: ru.cyberity.cbr.core.data.model.remote.response.d$c$e$c$b, reason: from kotlin metadata */
                public static final class Companion {
                    public /* synthetic */ Companion(C42822w c42822w) {
                        this();
                    }

                    @k
                    public final KSerializer<C12461c> serializer() {
                        return a.f433364a;
                    }

                    private Companion() {
                    }
                }

                public C12461c() {
                    this((String) null, (List) null, (List) null, (String) null, (List) null, (List) null, (String) null, (String) null, (String) null, 511, (C42822w) null);
                }

                @l
                /* renamed from: a, reason: from getter */
                public final String getIdDocSetType() {
                    return this.idDocSetType;
                }

                @l
                public final List<String> b() {
                    return this.types;
                }

                @l
                public final List<IdentitySide> c() {
                    return this.sides;
                }

                @l
                /* renamed from: d, reason: from getter */
                public final String getVideoRequired() {
                    return this.videoRequired;
                }

                @l
                public final List<h.d> e() {
                    return this.fields;
                }

                public boolean equals(@l Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof C12461c)) {
                        return false;
                    }
                    C12461c c12461c = (C12461c) other;
                    return L.f(this.idDocSetType, c12461c.idDocSetType) && L.f(this.types, c12461c.types) && L.f(this.sides, c12461c.sides) && L.f(this.videoRequired, c12461c.videoRequired) && L.f(this.fields, c12461c.fields) && L.f(this.customFields, c12461c.customFields) && L.f(this.questionnaireId, c12461c.questionnaireId) && L.f(this.questionnaireDefId, c12461c.questionnaireDefId) && L.f(this.captureMode, c12461c.captureMode);
                }

                @l
                public final List<h.c> f() {
                    return this.customFields;
                }

                @l
                /* renamed from: g, reason: from getter */
                public final String getQuestionnaireId() {
                    return this.questionnaireId;
                }

                @l
                /* renamed from: h, reason: from getter */
                public final String getQuestionnaireDefId() {
                    return this.questionnaireDefId;
                }

                public int hashCode() {
                    String str = this.idDocSetType;
                    int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                    List<String> list = this.types;
                    int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
                    List<IdentitySide> list2 = this.sides;
                    int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
                    String str2 = this.videoRequired;
                    int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
                    List<h.d> list3 = this.fields;
                    int iHashCode5 = (iHashCode4 + (list3 == null ? 0 : list3.hashCode())) * 31;
                    List<h.c> list4 = this.customFields;
                    int iHashCode6 = (iHashCode5 + (list4 == null ? 0 : list4.hashCode())) * 31;
                    String str3 = this.questionnaireId;
                    int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
                    String str4 = this.questionnaireDefId;
                    int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
                    String str5 = this.captureMode;
                    return iHashCode8 + (str5 != null ? str5.hashCode() : 0);
                }

                @l
                /* renamed from: i, reason: from getter */
                public final String getCaptureMode() {
                    return this.captureMode;
                }

                @l
                public final String j() {
                    return this.captureMode;
                }

                @l
                public final List<h.c> l() {
                    return this.customFields;
                }

                @l
                public final List<h.d> n() {
                    return this.fields;
                }

                @l
                public final String p() {
                    return this.idDocSetType;
                }

                @l
                public final String r() {
                    return this.questionnaireDefId;
                }

                @l
                public final String t() {
                    return this.questionnaireId;
                }

                @k
                public String toString() {
                    StringBuilder sb2 = new StringBuilder("DocSetsItem(idDocSetType=");
                    sb2.append(this.idDocSetType);
                    sb2.append(", types=");
                    sb2.append(this.types);
                    sb2.append(", sides=");
                    sb2.append(this.sides);
                    sb2.append(", videoRequired=");
                    sb2.append(this.videoRequired);
                    sb2.append(", fields=");
                    sb2.append(this.fields);
                    sb2.append(", customFields=");
                    sb2.append(this.customFields);
                    sb2.append(", questionnaireId=");
                    sb2.append(this.questionnaireId);
                    sb2.append(", questionnaireDefId=");
                    sb2.append(this.questionnaireDefId);
                    sb2.append(", captureMode=");
                    return C22026a.c(sb2, this.captureMode, ')');
                }

                @l
                public final List<IdentitySide> v() {
                    return this.sides;
                }

                @l
                public final List<String> x() {
                    return this.types;
                }

                @l
                public final String z() {
                    return this.videoRequired;
                }

                @InterfaceC42830m
                public /* synthetic */ C12461c(int i12, @v String str, @v List list, @v List list2, @v String str2, @v List list3, @v List list4, @v String str3, @v String str4, @v String str5, P0 p02) {
                    if ((i12 & 1) == 0) {
                        this.idDocSetType = null;
                    } else {
                        this.idDocSetType = str;
                    }
                    if ((i12 & 2) == 0) {
                        this.types = null;
                    } else {
                        this.types = list;
                    }
                    if ((i12 & 4) == 0) {
                        this.sides = null;
                    } else {
                        this.sides = list2;
                    }
                    if ((i12 & 8) == 0) {
                        this.videoRequired = null;
                    } else {
                        this.videoRequired = str2;
                    }
                    if ((i12 & 16) == 0) {
                        this.fields = null;
                    } else {
                        this.fields = list3;
                    }
                    if ((i12 & 32) == 0) {
                        this.customFields = null;
                    } else {
                        this.customFields = list4;
                    }
                    if ((i12 & 64) == 0) {
                        this.questionnaireId = null;
                    } else {
                        this.questionnaireId = str3;
                    }
                    if ((i12 & 128) == 0) {
                        this.questionnaireDefId = null;
                    } else {
                        this.questionnaireDefId = str4;
                    }
                    if ((i12 & 256) == 0) {
                        this.captureMode = null;
                    } else {
                        this.captureMode = str5;
                    }
                }

                @k
                public final C12461c a(@l String idDocSetType, @l List<String> types, @l List<? extends IdentitySide> sides, @l String videoRequired, @l List<h.d> fields, @l List<h.c> customFields, @l String questionnaireId, @l String questionnaireDefId, @l String captureMode) {
                    return new C12461c(idDocSetType, types, sides, videoRequired, fields, customFields, questionnaireId, questionnaireDefId, captureMode);
                }

                /* JADX WARN: Multi-variable type inference failed */
                public C12461c(@l String str, @l List<String> list, @l List<? extends IdentitySide> list2, @l String str2, @l List<h.d> list3, @l List<h.c> list4, @l String str3, @l String str4, @l String str5) {
                    this.idDocSetType = str;
                    this.types = list;
                    this.sides = list2;
                    this.videoRequired = str2;
                    this.fields = list3;
                    this.customFields = list4;
                    this.questionnaireId = str3;
                    this.questionnaireDefId = str4;
                    this.captureMode = str5;
                }

                @n
                public static final void a(@k C12461c self, @k kotlinx.serialization.encoding.d output, @k SerialDescriptor serialDesc) {
                    if (output.u() || self.idDocSetType != null) {
                        output.p(serialDesc, 0, V0.f412822a, self.idDocSetType);
                    }
                    if (output.u() || self.types != null) {
                        output.p(serialDesc, 1, new C43401f(V0.f412822a), self.types);
                    }
                    if (output.u() || self.sides != null) {
                        output.p(serialDesc, 2, new C43401f(IdentitySide.a.f432994a), self.sides);
                    }
                    if (output.u() || self.videoRequired != null) {
                        output.p(serialDesc, 3, V0.f412822a, self.videoRequired);
                    }
                    if (output.u() || self.fields != null) {
                        output.p(serialDesc, 4, new C43401f(h.d.a.f433130a), self.fields);
                    }
                    if (output.u() || self.customFields != null) {
                        output.p(serialDesc, 5, new C43401f(h.c.a.f433121a), self.customFields);
                    }
                    if (output.u() || self.questionnaireId != null) {
                        output.p(serialDesc, 6, V0.f412822a, self.questionnaireId);
                    }
                    if (output.u() || self.questionnaireDefId != null) {
                        output.p(serialDesc, 7, V0.f412822a, self.questionnaireDefId);
                    }
                    if (!output.u() && self.captureMode == null) {
                        return;
                    }
                    output.p(serialDesc, 8, V0.f412822a, self.captureMode);
                }

                public /* synthetic */ C12461c(String str, List list, List list2, String str2, List list3, List list4, String str3, String str4, String str5, int i12, C42822w c42822w) {
                    this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : list, (i12 & 4) != 0 ? null : list2, (i12 & 8) != 0 ? null : str2, (i12 & 16) != 0 ? null : list3, (i12 & 32) != 0 ? null : list4, (i12 & 64) != 0 ? null : str3, (i12 & 128) != 0 ? null : str4, (i12 & 256) == 0 ? str5 : null);
                }

                @v
                public static /* synthetic */ void A() {
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

                @v
                public static /* synthetic */ void w() {
                }

                @v
                public static /* synthetic */ void y() {
                }
            }

            public e() {
                this((List) null, (Boolean) null, (List) null, (List) null, (List) null, (List) null, 63, (C42822w) null);
            }

            @l
            public final List<C12461c> a() {
                return this.docSets;
            }

            @l
            /* renamed from: b, reason: from getter */
            public final Boolean getVideoIdent() {
                return this.videoIdent;
            }

            @l
            public final List<String> c() {
                return this.videoIdentUploadTypes;
            }

            @l
            public final List<String> d() {
                return this.stepsOutsideVideoId;
            }

            @l
            public final List<String> e() {
                return this.includedCountries;
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof e)) {
                    return false;
                }
                e eVar = (e) other;
                return L.f(this.docSets, eVar.docSets) && L.f(this.videoIdent, eVar.videoIdent) && L.f(this.videoIdentUploadTypes, eVar.videoIdentUploadTypes) && L.f(this.stepsOutsideVideoId, eVar.stepsOutsideVideoId) && L.f(this.includedCountries, eVar.includedCountries) && L.f(this.excludedCountries, eVar.excludedCountries);
            }

            @l
            public final List<String> f() {
                return this.excludedCountries;
            }

            @l
            public final List<C12461c> g() {
                return this.docSets;
            }

            public int hashCode() {
                List<C12461c> list = this.docSets;
                int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
                Boolean bool = this.videoIdent;
                int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
                List<String> list2 = this.videoIdentUploadTypes;
                int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
                List<String> list3 = this.stepsOutsideVideoId;
                int iHashCode4 = (iHashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31;
                List<String> list4 = this.includedCountries;
                int iHashCode5 = (iHashCode4 + (list4 == null ? 0 : list4.hashCode())) * 31;
                List<String> list5 = this.excludedCountries;
                return iHashCode5 + (list5 != null ? list5.hashCode() : 0);
            }

            @l
            public final List<String> i() {
                return this.excludedCountries;
            }

            @l
            public final List<String> k() {
                return this.includedCountries;
            }

            @l
            public final List<String> m() {
                return this.stepsOutsideVideoId;
            }

            @l
            public final Boolean o() {
                return this.videoIdent;
            }

            @l
            public final List<String> q() {
                return this.videoIdentUploadTypes;
            }

            @k
            public String toString() {
                StringBuilder sb2 = new StringBuilder("RequiredIdDocs(docSets=");
                sb2.append(this.docSets);
                sb2.append(", videoIdent=");
                sb2.append(this.videoIdent);
                sb2.append(", videoIdentUploadTypes=");
                sb2.append(this.videoIdentUploadTypes);
                sb2.append(", stepsOutsideVideoId=");
                sb2.append(this.stepsOutsideVideoId);
                sb2.append(", includedCountries=");
                sb2.append(this.includedCountries);
                sb2.append(", excludedCountries=");
                return H.p(sb2, this.excludedCountries, ')');
            }

            @InterfaceC42830m
            public /* synthetic */ e(int i12, @v List list, @v Boolean bool, @v List list2, @v List list3, @v List list4, @v List list5, P0 p02) {
                if ((i12 & 1) == 0) {
                    this.docSets = null;
                } else {
                    this.docSets = list;
                }
                if ((i12 & 2) == 0) {
                    this.videoIdent = Boolean.FALSE;
                } else {
                    this.videoIdent = bool;
                }
                if ((i12 & 4) == 0) {
                    this.videoIdentUploadTypes = null;
                } else {
                    this.videoIdentUploadTypes = list2;
                }
                if ((i12 & 8) == 0) {
                    this.stepsOutsideVideoId = null;
                } else {
                    this.stepsOutsideVideoId = list3;
                }
                if ((i12 & 16) == 0) {
                    this.includedCountries = null;
                } else {
                    this.includedCountries = list4;
                }
                if ((i12 & 32) == 0) {
                    this.excludedCountries = null;
                } else {
                    this.excludedCountries = list5;
                }
            }

            @k
            public final e a(@l List<C12461c> docSets, @l Boolean videoIdent, @l List<String> videoIdentUploadTypes, @l List<String> stepsOutsideVideoId, @l List<String> includedCountries, @l List<String> excludedCountries) {
                return new e(docSets, videoIdent, videoIdentUploadTypes, stepsOutsideVideoId, includedCountries, excludedCountries);
            }

            public static /* synthetic */ e a(e eVar, List list, Boolean bool, List list2, List list3, List list4, List list5, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    list = eVar.docSets;
                }
                if ((i12 & 2) != 0) {
                    bool = eVar.videoIdent;
                }
                Boolean bool2 = bool;
                if ((i12 & 4) != 0) {
                    list2 = eVar.videoIdentUploadTypes;
                }
                List list6 = list2;
                if ((i12 & 8) != 0) {
                    list3 = eVar.stepsOutsideVideoId;
                }
                List list7 = list3;
                if ((i12 & 16) != 0) {
                    list4 = eVar.includedCountries;
                }
                List list8 = list4;
                if ((i12 & 32) != 0) {
                    list5 = eVar.excludedCountries;
                }
                return eVar.a(list, bool2, list6, list7, list8, list5);
            }

            @n
            public static final void a(@k e self, @k kotlinx.serialization.encoding.d output, @k SerialDescriptor serialDesc) {
                if (output.u() || self.docSets != null) {
                    output.p(serialDesc, 0, new C43401f(C12461c.a.f433364a), self.docSets);
                }
                if (output.u() || !L.f(self.videoIdent, Boolean.FALSE)) {
                    output.p(serialDesc, 1, C43407i.f412866a, self.videoIdent);
                }
                if (output.u() || self.videoIdentUploadTypes != null) {
                    output.p(serialDesc, 2, new C43401f(V0.f412822a), self.videoIdentUploadTypes);
                }
                if (output.u() || self.stepsOutsideVideoId != null) {
                    output.p(serialDesc, 3, new C43401f(V0.f412822a), self.stepsOutsideVideoId);
                }
                if (output.u() || self.includedCountries != null) {
                    output.p(serialDesc, 4, new C43401f(V0.f412822a), self.includedCountries);
                }
                if (!output.u() && self.excludedCountries == null) {
                    return;
                }
                output.p(serialDesc, 5, new C43401f(V0.f412822a), self.excludedCountries);
            }

            public e(@l List<C12461c> list, @l Boolean bool, @l List<String> list2, @l List<String> list3, @l List<String> list4, @l List<String> list5) {
                this.docSets = list;
                this.videoIdent = bool;
                this.videoIdentUploadTypes = list2;
                this.stepsOutsideVideoId = list3;
                this.includedCountries = list4;
                this.excludedCountries = list5;
            }

            public /* synthetic */ e(List list, Boolean bool, List list2, List list3, List list4, List list5, int i12, C42822w c42822w) {
                this((i12 & 1) != 0 ? null : list, (i12 & 2) != 0 ? Boolean.FALSE : bool, (i12 & 4) != 0 ? null : list2, (i12 & 8) != 0 ? null : list3, (i12 & 16) != 0 ? null : list4, (i12 & 32) != 0 ? null : list5);
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

            @v
            public static /* synthetic */ void n() {
            }

            @v
            public static /* synthetic */ void p() {
            }

            @v
            public static /* synthetic */ void r() {
            }
        }

        /* compiled from: ListApplicantsResponse.kt */
        @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \b\u0087\b\u0018\u0000 U2\u00020\u0001:\u0003\u0019')B\u008b\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0013\u0010\u0014B\u009f\u0001\b\u0017\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0013\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\"\u0010\u001fJ\u0012\u0010#\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b%\u0010\u001fJ\u0012\u0010&\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b&\u0010$J\u0012\u0010'\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b)\u0010(J\u0094\u0001\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0004\b\u0019\u0010*J\u0010\u0010+\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b+\u0010\u001fJ\u0010\u0010,\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u0010/\u001a\u00020\f2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b/\u00100J(\u0010\u0019\u001a\u0002062\u0006\u00101\u001a\u00020\u00002\u0006\u00103\u001a\u0002022\u0006\u00105\u001a\u000204HÇ\u0001¢\u0006\u0004\b\u0019\u00107R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u00108\u0012\u0004\b:\u0010;\u001a\u0004\b9\u0010\u001aR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b'\u0010<\u0012\u0004\b>\u0010;\u001a\u0004\b=\u0010\u001cR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b)\u00108\u0012\u0004\b@\u0010;\u001a\u0004\b?\u0010\u001aR\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010A\u0012\u0004\bC\u0010;\u001a\u0004\bB\u0010\u001fR\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010D\u0012\u0004\bF\u0010;\u001a\u0004\bE\u0010!R\"\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010A\u0012\u0004\bH\u0010;\u001a\u0004\bG\u0010\u001fR\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b \u0010I\u0012\u0004\bK\u0010;\u001a\u0004\bJ\u0010$R\"\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\"\u0010A\u0012\u0004\bM\u0010;\u001a\u0004\bL\u0010\u001fR\"\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b#\u0010I\u0012\u0004\bO\u0010;\u001a\u0004\bN\u0010$R\"\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b%\u0010P\u0012\u0004\bR\u0010;\u001a\u0004\bQ\u0010(R\"\u0010\u0012\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b&\u0010P\u0012\u0004\bT\u0010;\u001a\u0004\bS\u0010(¨\u0006V"}, d2 = {"Lru/cyberity/cbr/core/data/model/remote/response/d$c$f;", "", "", "notificationFailureCnt", "Lru/cyberity/cbr/core/data/model/ReviewStatusType;", "reviewStatus", "priority", "", "createDate", "Lru/cyberity/cbr/core/data/model/remote/response/d$c$f$c;", "result", "reviewId", "", "reprocessing", "levelName", "autoChecked", "", "elapsedSinceQueuedMs", "elapsedSincePendingMs", "<init>", "(Ljava/lang/Integer;Lru/cyberity/cbr/core/data/model/ReviewStatusType;Ljava/lang/Integer;Ljava/lang/String;Lru/cyberity/cbr/core/data/model/remote/response/d$c$f$c;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Long;)V", "seen1", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "(ILjava/lang/Integer;Lru/cyberity/cbr/core/data/model/ReviewStatusType;Ljava/lang/Integer;Ljava/lang/String;Lru/cyberity/cbr/core/data/model/remote/response/d$c$f$c;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Long;Lkotlinx/serialization/internal/P0;)V", "a", "()Ljava/lang/Integer;", "d", "()Lru/cyberity/cbr/core/data/model/ReviewStatusType;", "e", "f", "()Ljava/lang/String;", "g", "()Lru/cyberity/cbr/core/data/model/remote/response/d$c$f$c;", "h", "i", "()Ljava/lang/Boolean;", "j", "k", "b", "()Ljava/lang/Long;", "c", "(Ljava/lang/Integer;Lru/cyberity/cbr/core/data/model/ReviewStatusType;Ljava/lang/Integer;Ljava/lang/String;Lru/cyberity/cbr/core/data/model/remote/response/d$c$f$c;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Long;)Lru/cyberity/cbr/core/data/model/remote/response/d$c$f;", "toString", "hashCode", "()I", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lkotlin/G0;", "(Lru/cyberity/cbr/core/data/model/remote/response/d$c$f;Lkotlinx/serialization/encoding/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/Integer;", "v", "getNotificationFailureCnt$annotations", "()V", "Lru/cyberity/cbr/core/data/model/ReviewStatusType;", "F", "getReviewStatus$annotations", "x", "getPriority$annotations", "Ljava/lang/String;", "n", "getCreateDate$annotations", "Lru/cyberity/cbr/core/data/model/remote/response/d$c$f$c;", "B", "getResult$annotations", "D", "getReviewId$annotations", "Ljava/lang/Boolean;", "z", "getReprocessing$annotations", "t", "getLevelName$annotations", "l", "getAutoChecked$annotations", "Ljava/lang/Long;", "r", "getElapsedSinceQueuedMs$annotations", "p", "getElapsedSincePendingMs$annotations", "Companion", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
        @w
        public static final /* data */ class f {

            /* renamed from: Companion, reason: from kotlin metadata */
            @k
            public static final Companion INSTANCE = new Companion(null);

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            @l
            private final Integer notificationFailureCnt;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            @l
            private final ReviewStatusType reviewStatus;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata */
            @l
            private final Integer priority;

            /* renamed from: d, reason: collision with root package name and from kotlin metadata */
            @l
            private final String createDate;

            /* renamed from: e, reason: collision with root package name and from kotlin metadata */
            @l
            private final C12462c result;

            /* renamed from: f, reason: collision with root package name and from kotlin metadata */
            @l
            private final String reviewId;

            /* renamed from: g, reason: collision with root package name and from kotlin metadata */
            @l
            private final Boolean reprocessing;

            /* renamed from: h, reason: collision with root package name and from kotlin metadata */
            @l
            private final String levelName;

            /* renamed from: i, reason: collision with root package name and from kotlin metadata */
            @l
            private final Boolean autoChecked;

            /* renamed from: j, reason: collision with root package name and from kotlin metadata */
            @l
            private final Long elapsedSinceQueuedMs;

            /* renamed from: k, reason: collision with root package name and from kotlin metadata */
            @l
            private final Long elapsedSincePendingMs;

            /* compiled from: ListApplicantsResponse.kt */
            @Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000b\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"ru/cyberity/cbr/core/data/model/remote/response/ListApplicantsResponse.Data.Review.$serializer", "Lkotlinx/serialization/internal/N;", "Lru/cyberity/cbr/core/data/model/remote/response/d$c$f;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "a", "(Lkotlinx/serialization/encoding/Decoder;)Lru/cyberity/cbr/core/data/model/remote/response/d$c$f;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlin/G0;", "(Lkotlinx/serialization/encoding/Encoder;Lru/cyberity/cbr/core/data/model/remote/response/d$c$f;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
            @InterfaceC42830m
            public static final class a implements N<f> {

                /* renamed from: a, reason: collision with root package name */
                @k
                public static final a f433377a;

                /* renamed from: b, reason: collision with root package name */
                public static final /* synthetic */ SerialDescriptor f433378b;

                static {
                    a aVar = new a();
                    f433377a = aVar;
                    PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.cyberity.cbr.core.data.model.remote.response.ListApplicantsResponse.Data.Review", aVar, 11);
                    pluginGeneratedSerialDescriptor.j("notificationFailureCnt", true);
                    pluginGeneratedSerialDescriptor.j("reviewStatus", true);
                    pluginGeneratedSerialDescriptor.j("priority", true);
                    pluginGeneratedSerialDescriptor.j("createDate", true);
                    pluginGeneratedSerialDescriptor.j("reviewResult", true);
                    pluginGeneratedSerialDescriptor.j("reviewId", true);
                    pluginGeneratedSerialDescriptor.j("reprocessing", true);
                    pluginGeneratedSerialDescriptor.j("levelName", true);
                    pluginGeneratedSerialDescriptor.j("autoChecked", true);
                    pluginGeneratedSerialDescriptor.j("elapsedSinceQueuedMs", true);
                    pluginGeneratedSerialDescriptor.j("elapsedSincePendingMs", true);
                    f433378b = pluginGeneratedSerialDescriptor;
                }

                private a() {
                }

                @Override // kotlinx.serialization.InterfaceC43386e
                @k
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public f deserialize(@k Decoder decoder) {
                    boolean z12;
                    SerialDescriptor f332717a = getF332717a();
                    kotlinx.serialization.encoding.c cVarC = decoder.c(f332717a);
                    Object objF = null;
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
                    boolean z13 = true;
                    while (z13) {
                        int iJ2 = cVarC.j(f332717a);
                        switch (iJ2) {
                            case -1:
                                z13 = false;
                                continue;
                            case 0:
                                z12 = z13;
                                objF = cVarC.f(f332717a, 0, Y.f412835a, objF);
                                i12 |= 1;
                                break;
                            case 1:
                                z12 = z13;
                                objF2 = cVarC.f(f332717a, 1, ReviewStatusType.a.f433004a, objF2);
                                i12 |= 2;
                                break;
                            case 2:
                                z12 = z13;
                                objF3 = cVarC.f(f332717a, 2, Y.f412835a, objF3);
                                i12 |= 4;
                                break;
                            case 3:
                                z12 = z13;
                                objF4 = cVarC.f(f332717a, 3, V0.f412822a, objF4);
                                i12 |= 8;
                                break;
                            case 4:
                                z12 = z13;
                                objF5 = cVarC.f(f332717a, 4, C12462c.a.f433384a, objF5);
                                i12 |= 16;
                                break;
                            case 5:
                                z12 = z13;
                                objF6 = cVarC.f(f332717a, 5, V0.f412822a, objF6);
                                i12 |= 32;
                                break;
                            case 6:
                                z12 = z13;
                                objF7 = cVarC.f(f332717a, 6, C43407i.f412866a, objF7);
                                i12 |= 64;
                                break;
                            case 7:
                                z12 = z13;
                                objF8 = cVarC.f(f332717a, 7, V0.f412822a, objF8);
                                i12 |= 128;
                                break;
                            case 8:
                                z12 = z13;
                                objF9 = cVarC.f(f332717a, 8, C43407i.f412866a, objF9);
                                i12 |= 256;
                                break;
                            case 9:
                                z12 = z13;
                                objF10 = cVarC.f(f332717a, 9, C43412k0.f412877a, objF10);
                                i12 |= 512;
                                break;
                            case 10:
                                z12 = z13;
                                objF11 = cVarC.f(f332717a, 10, C43412k0.f412877a, objF11);
                                i12 |= 1024;
                                break;
                            default:
                                throw new UnknownFieldException(iJ2);
                        }
                        z13 = z12;
                    }
                    cVarC.d(f332717a);
                    return new f(i12, (Integer) objF, (ReviewStatusType) objF2, (Integer) objF3, (String) objF4, (C12462c) objF5, (String) objF6, (Boolean) objF7, (String) objF8, (Boolean) objF9, (Long) objF10, (Long) objF11, (P0) null);
                }

                @Override // kotlinx.serialization.internal.N
                @k
                public KSerializer<?>[] childSerializers() {
                    Y y12 = Y.f412835a;
                    KSerializer<?> kSerializerA = L51.a.a(y12);
                    KSerializer<?> kSerializerA2 = L51.a.a(ReviewStatusType.a.f433004a);
                    KSerializer<?> kSerializerA3 = L51.a.a(y12);
                    V0 v02 = V0.f412822a;
                    KSerializer<?> kSerializerA4 = L51.a.a(v02);
                    KSerializer<?> kSerializerA5 = L51.a.a(C12462c.a.f433384a);
                    KSerializer<?> kSerializerA6 = L51.a.a(v02);
                    C43407i c43407i = C43407i.f412866a;
                    KSerializer<?> kSerializerA7 = L51.a.a(c43407i);
                    KSerializer<?> kSerializerA8 = L51.a.a(v02);
                    KSerializer<?> kSerializerA9 = L51.a.a(c43407i);
                    C43412k0 c43412k0 = C43412k0.f412877a;
                    return new KSerializer[]{kSerializerA, kSerializerA2, kSerializerA3, kSerializerA4, kSerializerA5, kSerializerA6, kSerializerA7, kSerializerA8, kSerializerA9, L51.a.a(c43412k0), L51.a.a(c43412k0)};
                }

                @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
                @k
                /* renamed from: getDescriptor */
                public SerialDescriptor getF332717a() {
                    return f433378b;
                }

                @Override // kotlinx.serialization.internal.N
                @k
                public KSerializer<?>[] typeParametersSerializers() {
                    return G0.f412773a;
                }

                @Override // kotlinx.serialization.x
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public void serialize(@k Encoder encoder, @k f value) {
                    SerialDescriptor f332717a = getF332717a();
                    kotlinx.serialization.encoding.d dVarC = encoder.c(f332717a);
                    f.a(value, dVarC, f332717a);
                    dVarC.d(f332717a);
                }
            }

            /* compiled from: ListApplicantsResponse.kt */
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lru/cyberity/cbr/core/data/model/remote/response/d$c$f$b;", "", "Lkotlinx/serialization/KSerializer;", "Lru/cyberity/cbr/core/data/model/remote/response/d$c$f;", "serializer", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
            /* renamed from: ru.cyberity.cbr.core.data.model.remote.response.d$c$f$b, reason: from kotlin metadata */
            public static final class Companion {
                public /* synthetic */ Companion(C42822w c42822w) {
                    this();
                }

                @k
                public final KSerializer<f> serializer() {
                    return a.f433377a;
                }

                private Companion() {
                }
            }

            /* compiled from: ListApplicantsResponse.kt */
            @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u0000 92\u00020\u0001:\u0002\u0018\u001bBI\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fB]\b\u0017\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0001\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J(\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015HÇ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b \u0010!JR\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u0018\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u001aJ\u0010\u0010$\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010*\u0012\u0004\b,\u0010-\u001a\u0004\b+\u0010\u001aR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010*\u0012\u0004\b/\u0010-\u001a\u0004\b.\u0010\u001aR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u00100\u0012\u0004\b2\u0010-\u001a\u0004\b1\u0010\u001dR(\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001e\u00103\u0012\u0004\b5\u0010-\u001a\u0004\b4\u0010\u001fR\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b \u00106\u0012\u0004\b8\u0010-\u001a\u0004\b7\u0010!¨\u0006:"}, d2 = {"Lru/cyberity/cbr/core/data/model/remote/response/d$c$f$c;", "", "", "moderationComment", "clientComment", "Lru/cyberity/cbr/core/data/model/ReviewAnswerType;", "reviewAnswer", "", "rejectLabels", "Lru/cyberity/cbr/core/data/model/ReviewRejectType;", "reviewRejectType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/cyberity/cbr/core/data/model/ReviewAnswerType;Ljava/util/List;Lru/cyberity/cbr/core/data/model/ReviewRejectType;)V", "", "seen1", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lru/cyberity/cbr/core/data/model/ReviewAnswerType;Ljava/util/List;Lru/cyberity/cbr/core/data/model/ReviewRejectType;Lkotlinx/serialization/internal/P0;)V", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lkotlin/G0;", "a", "(Lru/cyberity/cbr/core/data/model/remote/response/d$c$f$c;Lkotlinx/serialization/encoding/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "()Ljava/lang/String;", "b", "c", "()Lru/cyberity/cbr/core/data/model/ReviewAnswerType;", "d", "()Ljava/util/List;", "e", "()Lru/cyberity/cbr/core/data/model/ReviewRejectType;", "(Ljava/lang/String;Ljava/lang/String;Lru/cyberity/cbr/core/data/model/ReviewAnswerType;Ljava/util/List;Lru/cyberity/cbr/core/data/model/ReviewRejectType;)Lru/cyberity/cbr/core/data/model/remote/response/d$c$f$c;", "toString", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "h", "getModerationComment$annotations", "()V", "f", "getClientComment$annotations", "Lru/cyberity/cbr/core/data/model/ReviewAnswerType;", "l", "getReviewAnswer$annotations", "Ljava/util/List;", "j", "getRejectLabels$annotations", "Lru/cyberity/cbr/core/data/model/ReviewRejectType;", "n", "getReviewRejectType$annotations", "Companion", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
            @w
            /* renamed from: ru.cyberity.cbr.core.data.model.remote.response.d$c$f$c, reason: collision with other inner class name */
            public static final /* data */ class C12462c {

                /* renamed from: Companion, reason: from kotlin metadata */
                @k
                public static final Companion INSTANCE = new Companion(null);

                /* renamed from: a, reason: collision with root package name and from kotlin metadata */
                @l
                private final String moderationComment;

                /* renamed from: b, reason: collision with root package name and from kotlin metadata */
                @l
                private final String clientComment;

                /* renamed from: c, reason: collision with root package name and from kotlin metadata */
                @l
                private final ReviewAnswerType reviewAnswer;

                /* renamed from: d, reason: collision with root package name and from kotlin metadata */
                @l
                private final List<String> rejectLabels;

                /* renamed from: e, reason: collision with root package name and from kotlin metadata */
                @l
                private final ReviewRejectType reviewRejectType;

                /* compiled from: ListApplicantsResponse.kt */
                @Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000b\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"ru/cyberity/cbr/core/data/model/remote/response/ListApplicantsResponse.Data.Review.Result.$serializer", "Lkotlinx/serialization/internal/N;", "Lru/cyberity/cbr/core/data/model/remote/response/d$c$f$c;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "a", "(Lkotlinx/serialization/encoding/Decoder;)Lru/cyberity/cbr/core/data/model/remote/response/d$c$f$c;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlin/G0;", "(Lkotlinx/serialization/encoding/Encoder;Lru/cyberity/cbr/core/data/model/remote/response/d$c$f$c;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
                @InterfaceC42830m
                /* renamed from: ru.cyberity.cbr.core.data.model.remote.response.d$c$f$c$a */
                public static final class a implements N<C12462c> {

                    /* renamed from: a, reason: collision with root package name */
                    @k
                    public static final a f433384a;

                    /* renamed from: b, reason: collision with root package name */
                    public static final /* synthetic */ SerialDescriptor f433385b;

                    static {
                        a aVar = new a();
                        f433384a = aVar;
                        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.cyberity.cbr.core.data.model.remote.response.ListApplicantsResponse.Data.Review.Result", aVar, 5);
                        pluginGeneratedSerialDescriptor.j("moderationComment", true);
                        pluginGeneratedSerialDescriptor.j("clientComment", true);
                        pluginGeneratedSerialDescriptor.j("reviewAnswer", true);
                        pluginGeneratedSerialDescriptor.j("rejectLabels", true);
                        pluginGeneratedSerialDescriptor.j("reviewRejectType", true);
                        f433385b = pluginGeneratedSerialDescriptor;
                    }

                    private a() {
                    }

                    @Override // kotlinx.serialization.InterfaceC43386e
                    @k
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public C12462c deserialize(@k Decoder decoder) {
                        SerialDescriptor f332717a = getF332717a();
                        kotlinx.serialization.encoding.c cVarC = decoder.c(f332717a);
                        Object objF = null;
                        boolean z12 = true;
                        int i12 = 0;
                        Object objF2 = null;
                        Object objF3 = null;
                        Object objF4 = null;
                        Object objF5 = null;
                        while (z12) {
                            int iJ2 = cVarC.j(f332717a);
                            if (iJ2 == -1) {
                                z12 = false;
                            } else if (iJ2 == 0) {
                                objF = cVarC.f(f332717a, 0, V0.f412822a, objF);
                                i12 |= 1;
                            } else if (iJ2 == 1) {
                                objF2 = cVarC.f(f332717a, 1, V0.f412822a, objF2);
                                i12 |= 2;
                            } else if (iJ2 == 2) {
                                objF3 = cVarC.f(f332717a, 2, ReviewAnswerType.a.f433000a, objF3);
                                i12 |= 4;
                            } else if (iJ2 == 3) {
                                objF4 = cVarC.f(f332717a, 3, new C43401f(V0.f412822a), objF4);
                                i12 |= 8;
                            } else {
                                if (iJ2 != 4) {
                                    throw new UnknownFieldException(iJ2);
                                }
                                objF5 = cVarC.f(f332717a, 4, ReviewRejectType.a.f433002a, objF5);
                                i12 |= 16;
                            }
                        }
                        cVarC.d(f332717a);
                        return new C12462c(i12, (String) objF, (String) objF2, (ReviewAnswerType) objF3, (List) objF4, (ReviewRejectType) objF5, (P0) null);
                    }

                    @Override // kotlinx.serialization.internal.N
                    @k
                    public KSerializer<?>[] childSerializers() {
                        V0 v02 = V0.f412822a;
                        return new KSerializer[]{L51.a.a(v02), L51.a.a(v02), L51.a.a(ReviewAnswerType.a.f433000a), L51.a.a(new C43401f(v02)), L51.a.a(ReviewRejectType.a.f433002a)};
                    }

                    @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
                    @k
                    /* renamed from: getDescriptor */
                    public SerialDescriptor getF332717a() {
                        return f433385b;
                    }

                    @Override // kotlinx.serialization.internal.N
                    @k
                    public KSerializer<?>[] typeParametersSerializers() {
                        return G0.f412773a;
                    }

                    @Override // kotlinx.serialization.x
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public void serialize(@k Encoder encoder, @k C12462c value) {
                        SerialDescriptor f332717a = getF332717a();
                        kotlinx.serialization.encoding.d dVarC = encoder.c(f332717a);
                        C12462c.a(value, dVarC, f332717a);
                        dVarC.d(f332717a);
                    }
                }

                /* compiled from: ListApplicantsResponse.kt */
                @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lru/cyberity/cbr/core/data/model/remote/response/d$c$f$c$b;", "", "Lkotlinx/serialization/KSerializer;", "Lru/cyberity/cbr/core/data/model/remote/response/d$c$f$c;", "serializer", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
                /* renamed from: ru.cyberity.cbr.core.data.model.remote.response.d$c$f$c$b, reason: from kotlin metadata */
                public static final class Companion {
                    public /* synthetic */ Companion(C42822w c42822w) {
                        this();
                    }

                    @k
                    public final KSerializer<C12462c> serializer() {
                        return a.f433384a;
                    }

                    private Companion() {
                    }
                }

                public C12462c() {
                    this((String) null, (String) null, (ReviewAnswerType) null, (List) null, (ReviewRejectType) null, 31, (C42822w) null);
                }

                @l
                /* renamed from: a, reason: from getter */
                public final String getModerationComment() {
                    return this.moderationComment;
                }

                @l
                /* renamed from: b, reason: from getter */
                public final String getClientComment() {
                    return this.clientComment;
                }

                @l
                /* renamed from: c, reason: from getter */
                public final ReviewAnswerType getReviewAnswer() {
                    return this.reviewAnswer;
                }

                @l
                public final List<String> d() {
                    return this.rejectLabels;
                }

                @l
                /* renamed from: e, reason: from getter */
                public final ReviewRejectType getReviewRejectType() {
                    return this.reviewRejectType;
                }

                public boolean equals(@l Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof C12462c)) {
                        return false;
                    }
                    C12462c c12462c = (C12462c) other;
                    return L.f(this.moderationComment, c12462c.moderationComment) && L.f(this.clientComment, c12462c.clientComment) && this.reviewAnswer == c12462c.reviewAnswer && L.f(this.rejectLabels, c12462c.rejectLabels) && this.reviewRejectType == c12462c.reviewRejectType;
                }

                @l
                public final String f() {
                    return this.clientComment;
                }

                @l
                public final String h() {
                    return this.moderationComment;
                }

                public int hashCode() {
                    String str = this.moderationComment;
                    int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                    String str2 = this.clientComment;
                    int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                    ReviewAnswerType reviewAnswerType = this.reviewAnswer;
                    int iHashCode3 = (iHashCode2 + (reviewAnswerType == null ? 0 : reviewAnswerType.hashCode())) * 31;
                    List<String> list = this.rejectLabels;
                    int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
                    ReviewRejectType reviewRejectType = this.reviewRejectType;
                    return iHashCode4 + (reviewRejectType != null ? reviewRejectType.hashCode() : 0);
                }

                @l
                public final List<String> j() {
                    return this.rejectLabels;
                }

                @l
                public final ReviewAnswerType l() {
                    return this.reviewAnswer;
                }

                @l
                public final ReviewRejectType n() {
                    return this.reviewRejectType;
                }

                @k
                public String toString() {
                    return "Result(moderationComment=" + this.moderationComment + ", clientComment=" + this.clientComment + ", reviewAnswer=" + this.reviewAnswer + ", rejectLabels=" + this.rejectLabels + ", reviewRejectType=" + this.reviewRejectType + ')';
                }

                @InterfaceC42830m
                public /* synthetic */ C12462c(int i12, @v String str, @v String str2, @v ReviewAnswerType reviewAnswerType, @v List list, @v ReviewRejectType reviewRejectType, P0 p02) {
                    if ((i12 & 1) == 0) {
                        this.moderationComment = null;
                    } else {
                        this.moderationComment = str;
                    }
                    if ((i12 & 2) == 0) {
                        this.clientComment = null;
                    } else {
                        this.clientComment = str2;
                    }
                    if ((i12 & 4) == 0) {
                        this.reviewAnswer = null;
                    } else {
                        this.reviewAnswer = reviewAnswerType;
                    }
                    if ((i12 & 8) == 0) {
                        this.rejectLabels = null;
                    } else {
                        this.rejectLabels = list;
                    }
                    if ((i12 & 16) == 0) {
                        this.reviewRejectType = null;
                    } else {
                        this.reviewRejectType = reviewRejectType;
                    }
                }

                @k
                public final C12462c a(@l String moderationComment, @l String clientComment, @l ReviewAnswerType reviewAnswer, @l List<String> rejectLabels, @l ReviewRejectType reviewRejectType) {
                    return new C12462c(moderationComment, clientComment, reviewAnswer, rejectLabels, reviewRejectType);
                }

                public C12462c(@l String str, @l String str2, @l ReviewAnswerType reviewAnswerType, @l List<String> list, @l ReviewRejectType reviewRejectType) {
                    this.moderationComment = str;
                    this.clientComment = str2;
                    this.reviewAnswer = reviewAnswerType;
                    this.rejectLabels = list;
                    this.reviewRejectType = reviewRejectType;
                }

                public static /* synthetic */ C12462c a(C12462c c12462c, String str, String str2, ReviewAnswerType reviewAnswerType, List list, ReviewRejectType reviewRejectType, int i12, Object obj) {
                    if ((i12 & 1) != 0) {
                        str = c12462c.moderationComment;
                    }
                    if ((i12 & 2) != 0) {
                        str2 = c12462c.clientComment;
                    }
                    String str3 = str2;
                    if ((i12 & 4) != 0) {
                        reviewAnswerType = c12462c.reviewAnswer;
                    }
                    ReviewAnswerType reviewAnswerType2 = reviewAnswerType;
                    if ((i12 & 8) != 0) {
                        list = c12462c.rejectLabels;
                    }
                    List list2 = list;
                    if ((i12 & 16) != 0) {
                        reviewRejectType = c12462c.reviewRejectType;
                    }
                    return c12462c.a(str, str3, reviewAnswerType2, list2, reviewRejectType);
                }

                @n
                public static final void a(@k C12462c self, @k kotlinx.serialization.encoding.d output, @k SerialDescriptor serialDesc) {
                    if (output.u() || self.moderationComment != null) {
                        output.p(serialDesc, 0, V0.f412822a, self.moderationComment);
                    }
                    if (output.u() || self.clientComment != null) {
                        output.p(serialDesc, 1, V0.f412822a, self.clientComment);
                    }
                    if (output.u() || self.reviewAnswer != null) {
                        output.p(serialDesc, 2, ReviewAnswerType.a.f433000a, self.reviewAnswer);
                    }
                    if (output.u() || self.rejectLabels != null) {
                        output.p(serialDesc, 3, new C43401f(V0.f412822a), self.rejectLabels);
                    }
                    if (!output.u() && self.reviewRejectType == null) {
                        return;
                    }
                    output.p(serialDesc, 4, ReviewRejectType.a.f433002a, self.reviewRejectType);
                }

                public /* synthetic */ C12462c(String str, String str2, ReviewAnswerType reviewAnswerType, List list, ReviewRejectType reviewRejectType, int i12, C42822w c42822w) {
                    this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : reviewAnswerType, (i12 & 8) != 0 ? null : list, (i12 & 16) != 0 ? null : reviewRejectType);
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

            public f() {
                this((Integer) null, (ReviewStatusType) null, (Integer) null, (String) null, (C12462c) null, (String) null, (Boolean) null, (String) null, (Boolean) null, (Long) null, (Long) null, 2047, (C42822w) null);
            }

            @l
            /* renamed from: B, reason: from getter */
            public final C12462c getResult() {
                return this.result;
            }

            @l
            /* renamed from: D, reason: from getter */
            public final String getReviewId() {
                return this.reviewId;
            }

            @l
            /* renamed from: F, reason: from getter */
            public final ReviewStatusType getReviewStatus() {
                return this.reviewStatus;
            }

            @l
            /* renamed from: a, reason: from getter */
            public final Integer getNotificationFailureCnt() {
                return this.notificationFailureCnt;
            }

            @l
            /* renamed from: b, reason: from getter */
            public final Long getElapsedSinceQueuedMs() {
                return this.elapsedSinceQueuedMs;
            }

            @l
            /* renamed from: c, reason: from getter */
            public final Long getElapsedSincePendingMs() {
                return this.elapsedSincePendingMs;
            }

            @l
            public final ReviewStatusType d() {
                return this.reviewStatus;
            }

            @l
            /* renamed from: e, reason: from getter */
            public final Integer getPriority() {
                return this.priority;
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof f)) {
                    return false;
                }
                f fVar = (f) other;
                return L.f(this.notificationFailureCnt, fVar.notificationFailureCnt) && this.reviewStatus == fVar.reviewStatus && L.f(this.priority, fVar.priority) && L.f(this.createDate, fVar.createDate) && L.f(this.result, fVar.result) && L.f(this.reviewId, fVar.reviewId) && L.f(this.reprocessing, fVar.reprocessing) && L.f(this.levelName, fVar.levelName) && L.f(this.autoChecked, fVar.autoChecked) && L.f(this.elapsedSinceQueuedMs, fVar.elapsedSinceQueuedMs) && L.f(this.elapsedSincePendingMs, fVar.elapsedSincePendingMs);
            }

            @l
            /* renamed from: f, reason: from getter */
            public final String getCreateDate() {
                return this.createDate;
            }

            @l
            public final C12462c g() {
                return this.result;
            }

            @l
            public final String h() {
                return this.reviewId;
            }

            public int hashCode() {
                Integer num = this.notificationFailureCnt;
                int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
                ReviewStatusType reviewStatusType = this.reviewStatus;
                int iHashCode2 = (iHashCode + (reviewStatusType == null ? 0 : reviewStatusType.hashCode())) * 31;
                Integer num2 = this.priority;
                int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
                String str = this.createDate;
                int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
                C12462c c12462c = this.result;
                int iHashCode5 = (iHashCode4 + (c12462c == null ? 0 : c12462c.hashCode())) * 31;
                String str2 = this.reviewId;
                int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
                Boolean bool = this.reprocessing;
                int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
                String str3 = this.levelName;
                int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
                Boolean bool2 = this.autoChecked;
                int iHashCode9 = (iHashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
                Long l12 = this.elapsedSinceQueuedMs;
                int iHashCode10 = (iHashCode9 + (l12 == null ? 0 : l12.hashCode())) * 31;
                Long l13 = this.elapsedSincePendingMs;
                return iHashCode10 + (l13 != null ? l13.hashCode() : 0);
            }

            @l
            /* renamed from: i, reason: from getter */
            public final Boolean getReprocessing() {
                return this.reprocessing;
            }

            @l
            /* renamed from: j, reason: from getter */
            public final String getLevelName() {
                return this.levelName;
            }

            @l
            /* renamed from: k, reason: from getter */
            public final Boolean getAutoChecked() {
                return this.autoChecked;
            }

            @l
            public final Boolean l() {
                return this.autoChecked;
            }

            @l
            public final String n() {
                return this.createDate;
            }

            @l
            public final Long p() {
                return this.elapsedSincePendingMs;
            }

            @l
            public final Long r() {
                return this.elapsedSinceQueuedMs;
            }

            @l
            public final String t() {
                return this.levelName;
            }

            @k
            public String toString() {
                StringBuilder sb2 = new StringBuilder("Review(notificationFailureCnt=");
                sb2.append(this.notificationFailureCnt);
                sb2.append(", reviewStatus=");
                sb2.append(this.reviewStatus);
                sb2.append(", priority=");
                sb2.append(this.priority);
                sb2.append(", createDate=");
                sb2.append(this.createDate);
                sb2.append(", result=");
                sb2.append(this.result);
                sb2.append(", reviewId=");
                sb2.append(this.reviewId);
                sb2.append(", reprocessing=");
                sb2.append(this.reprocessing);
                sb2.append(", levelName=");
                sb2.append(this.levelName);
                sb2.append(", autoChecked=");
                sb2.append(this.autoChecked);
                sb2.append(", elapsedSinceQueuedMs=");
                sb2.append(this.elapsedSinceQueuedMs);
                sb2.append(", elapsedSincePendingMs=");
                return m.m(sb2, this.elapsedSincePendingMs, ')');
            }

            @l
            public final Integer v() {
                return this.notificationFailureCnt;
            }

            @l
            public final Integer x() {
                return this.priority;
            }

            @l
            public final Boolean z() {
                return this.reprocessing;
            }

            @InterfaceC42830m
            public /* synthetic */ f(int i12, @v Integer num, @v ReviewStatusType reviewStatusType, @v Integer num2, @v String str, @v C12462c c12462c, @v String str2, @v Boolean bool, @v String str3, @v Boolean bool2, @v Long l12, @v Long l13, P0 p02) {
                if ((i12 & 1) == 0) {
                    this.notificationFailureCnt = null;
                } else {
                    this.notificationFailureCnt = num;
                }
                if ((i12 & 2) == 0) {
                    this.reviewStatus = null;
                } else {
                    this.reviewStatus = reviewStatusType;
                }
                if ((i12 & 4) == 0) {
                    this.priority = null;
                } else {
                    this.priority = num2;
                }
                if ((i12 & 8) == 0) {
                    this.createDate = null;
                } else {
                    this.createDate = str;
                }
                if ((i12 & 16) == 0) {
                    this.result = null;
                } else {
                    this.result = c12462c;
                }
                if ((i12 & 32) == 0) {
                    this.reviewId = null;
                } else {
                    this.reviewId = str2;
                }
                if ((i12 & 64) == 0) {
                    this.reprocessing = null;
                } else {
                    this.reprocessing = bool;
                }
                if ((i12 & 128) == 0) {
                    this.levelName = null;
                } else {
                    this.levelName = str3;
                }
                if ((i12 & 256) == 0) {
                    this.autoChecked = null;
                } else {
                    this.autoChecked = bool2;
                }
                if ((i12 & 512) == 0) {
                    this.elapsedSinceQueuedMs = null;
                } else {
                    this.elapsedSinceQueuedMs = l12;
                }
                if ((i12 & 1024) == 0) {
                    this.elapsedSincePendingMs = null;
                } else {
                    this.elapsedSincePendingMs = l13;
                }
            }

            @k
            public final f a(@l Integer notificationFailureCnt, @l ReviewStatusType reviewStatus, @l Integer priority, @l String createDate, @l C12462c result, @l String reviewId, @l Boolean reprocessing, @l String levelName, @l Boolean autoChecked, @l Long elapsedSinceQueuedMs, @l Long elapsedSincePendingMs) {
                return new f(notificationFailureCnt, reviewStatus, priority, createDate, result, reviewId, reprocessing, levelName, autoChecked, elapsedSinceQueuedMs, elapsedSincePendingMs);
            }

            public f(@l Integer num, @l ReviewStatusType reviewStatusType, @l Integer num2, @l String str, @l C12462c c12462c, @l String str2, @l Boolean bool, @l String str3, @l Boolean bool2, @l Long l12, @l Long l13) {
                this.notificationFailureCnt = num;
                this.reviewStatus = reviewStatusType;
                this.priority = num2;
                this.createDate = str;
                this.result = c12462c;
                this.reviewId = str2;
                this.reprocessing = bool;
                this.levelName = str3;
                this.autoChecked = bool2;
                this.elapsedSinceQueuedMs = l12;
                this.elapsedSincePendingMs = l13;
            }

            @n
            public static final void a(@k f self, @k kotlinx.serialization.encoding.d output, @k SerialDescriptor serialDesc) {
                if (output.u() || self.notificationFailureCnt != null) {
                    output.p(serialDesc, 0, Y.f412835a, self.notificationFailureCnt);
                }
                if (output.u() || self.reviewStatus != null) {
                    output.p(serialDesc, 1, ReviewStatusType.a.f433004a, self.reviewStatus);
                }
                if (output.u() || self.priority != null) {
                    output.p(serialDesc, 2, Y.f412835a, self.priority);
                }
                if (output.u() || self.createDate != null) {
                    output.p(serialDesc, 3, V0.f412822a, self.createDate);
                }
                if (output.u() || self.result != null) {
                    output.p(serialDesc, 4, C12462c.a.f433384a, self.result);
                }
                if (output.u() || self.reviewId != null) {
                    output.p(serialDesc, 5, V0.f412822a, self.reviewId);
                }
                if (output.u() || self.reprocessing != null) {
                    output.p(serialDesc, 6, C43407i.f412866a, self.reprocessing);
                }
                if (output.u() || self.levelName != null) {
                    output.p(serialDesc, 7, V0.f412822a, self.levelName);
                }
                if (output.u() || self.autoChecked != null) {
                    output.p(serialDesc, 8, C43407i.f412866a, self.autoChecked);
                }
                if (output.u() || self.elapsedSinceQueuedMs != null) {
                    output.p(serialDesc, 9, C43412k0.f412877a, self.elapsedSinceQueuedMs);
                }
                if (!output.u() && self.elapsedSincePendingMs == null) {
                    return;
                }
                output.p(serialDesc, 10, C43412k0.f412877a, self.elapsedSincePendingMs);
            }

            public /* synthetic */ f(Integer num, ReviewStatusType reviewStatusType, Integer num2, String str, C12462c c12462c, String str2, Boolean bool, String str3, Boolean bool2, Long l12, Long l13, int i12, C42822w c42822w) {
                this((i12 & 1) != 0 ? null : num, (i12 & 2) != 0 ? null : reviewStatusType, (i12 & 4) != 0 ? null : num2, (i12 & 8) != 0 ? null : str, (i12 & 16) != 0 ? null : c12462c, (i12 & 32) != 0 ? null : str2, (i12 & 64) != 0 ? null : bool, (i12 & 128) != 0 ? null : str3, (i12 & 256) != 0 ? null : bool2, (i12 & 512) != 0 ? null : l12, (i12 & 1024) == 0 ? l13 : null);
            }

            @v
            public static /* synthetic */ void A() {
            }

            @v
            public static /* synthetic */ void C() {
            }

            @v
            public static /* synthetic */ void E() {
            }

            @v
            public static /* synthetic */ void G() {
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

            @v
            public static /* synthetic */ void w() {
            }

            @v
            public static /* synthetic */ void y() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public c() {
            this((List) null, 1, (C42822w) (0 == true ? 1 : 0));
        }

        @l
        public final List<C12460d> a() {
            return this.items;
        }

        @l
        public final List<C12460d> b() {
            return this.items;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof c) && L.f(this.items, ((c) other).items);
        }

        public int hashCode() {
            List<C12460d> list = this.items;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        @k
        public String toString() {
            return H.p(new StringBuilder("Data(items="), this.items, ')');
        }

        @InterfaceC42830m
        public /* synthetic */ c(int i12, @v List list, P0 p02) {
            if ((i12 & 1) == 0) {
                this.items = null;
            } else {
                this.items = list;
            }
        }

        @k
        public final c a(@l List<C12460d> items) {
            return new c(items);
        }

        public c(@l List<C12460d> list) {
            this.items = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ c a(c cVar, List list, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                list = cVar.items;
            }
            return cVar.a(list);
        }

        @n
        public static final void a(@k c self, @k kotlinx.serialization.encoding.d output, @k SerialDescriptor serialDesc) {
            if (!output.u() && self.items == null) {
                return;
            }
            output.p(serialDesc, 0, new C43401f(C12460d.a.f433345a), self.items);
        }

        public /* synthetic */ c(List list, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : list);
        }

        @v
        public static /* synthetic */ void c() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d() {
        this((c) null, 1, (C42822w) (0 == true ? 1 : 0));
    }

    @l
    /* renamed from: a, reason: from getter */
    public final c getData() {
        return this.data;
    }

    @l
    public final c b() {
        return this.data;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof d) && L.f(this.data, ((d) other).data);
    }

    public int hashCode() {
        c cVar = this.data;
        if (cVar == null) {
            return 0;
        }
        return cVar.hashCode();
    }

    @k
    public String toString() {
        return "ListApplicantsResponse(data=" + this.data + ')';
    }

    @InterfaceC42830m
    public /* synthetic */ d(int i12, @v c cVar, P0 p02) {
        if ((i12 & 1) == 0) {
            this.data = null;
        } else {
            this.data = cVar;
        }
    }

    @k
    public final d a(@l c data) {
        return new d(data);
    }

    public d(@l c cVar) {
        this.data = cVar;
    }

    public static /* synthetic */ d a(d dVar, c cVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            cVar = dVar.data;
        }
        return dVar.a(cVar);
    }

    @n
    public static final void a(@k d self, @k kotlinx.serialization.encoding.d output, @k SerialDescriptor serialDesc) {
        if (!output.u() && self.data == null) {
            return;
        }
        output.p(serialDesc, 0, c.a.f433306a, self.data);
    }

    public /* synthetic */ d(c cVar, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : cVar);
    }

    @v
    public static /* synthetic */ void c() {
    }
}
