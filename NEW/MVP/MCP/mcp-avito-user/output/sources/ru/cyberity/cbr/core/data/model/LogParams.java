package ru.cyberity.cbr.core.data.model;

import androidx.annotation.Keep;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.message.MessageBody;
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
import kotlinx.serialization.w;

/* compiled from: LogParams.kt */
@Keep
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 52\u00020\u0001:\u000267BW\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fBk\b\u0017\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J(\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015HÇ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001bJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001bJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001bJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001bJf\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u001bJ\u0010\u0010&\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010,\u001a\u0004\b.\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b/\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b0\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b1\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b2\u0010\u001bR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b3\u0010\u001bR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010,\u001a\u0004\b4\u0010\u001b¨\u00068"}, d2 = {"Lru/cyberity/cbr/core/data/model/LogParams;", "", "", "errorType", "location", "externalUserId", "fileName", "applicantId", "message", MessageBody.Location.KIND, "stacktrace", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen1", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/P0;)V", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lkotlin/G0;", "write$Self", "(Lru/cyberity/cbr/core/data/model/LogParams;Lkotlinx/serialization/encoding/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lru/cyberity/cbr/core/data/model/LogParams;", "toString", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getErrorType", "getLocation", "getExternalUserId", "getFileName", "getApplicantId", "getMessage", "getKind", "getStacktrace", "Companion", "a", "b", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
@w
/* loaded from: classes9.dex */
public final /* data */ class LogParams {

    /* renamed from: Companion, reason: from kotlin metadata */
    @Y61.k
    public static final Companion INSTANCE = new Companion(null);

    @Y61.k
    private final String applicantId;

    @Y61.k
    private final String errorType;

    @Y61.l
    private final String externalUserId;

    @Y61.l
    private final String fileName;

    @Y61.k
    private final String kind;

    @Y61.k
    private final String location;

    @Y61.k
    private final String message;

    @Y61.l
    private final String stacktrace;

    /* compiled from: LogParams.kt */
    @Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000b\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"ru/cyberity/cbr/core/data/model/LogParams.$serializer", "Lkotlinx/serialization/internal/N;", "Lru/cyberity/cbr/core/data/model/LogParams;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "a", "(Lkotlinx/serialization/encoding/Decoder;)Lru/cyberity/cbr/core/data/model/LogParams;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlin/G0;", "(Lkotlinx/serialization/encoding/Encoder;Lru/cyberity/cbr/core/data/model/LogParams;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    @InterfaceC42830m
    public static final class a implements N<LogParams> {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final a f432996a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ SerialDescriptor f432997b;

        static {
            a aVar = new a();
            f432996a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.cyberity.cbr.core.data.model.LogParams", aVar, 8);
            pluginGeneratedSerialDescriptor.j("errorType", true);
            pluginGeneratedSerialDescriptor.j("location", false);
            pluginGeneratedSerialDescriptor.j("externalUserId", true);
            pluginGeneratedSerialDescriptor.j("fileName", true);
            pluginGeneratedSerialDescriptor.j("applicantId", false);
            pluginGeneratedSerialDescriptor.j("message", false);
            pluginGeneratedSerialDescriptor.j(MessageBody.Location.KIND, true);
            pluginGeneratedSerialDescriptor.j("stacktrace", true);
            f432997b = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // kotlinx.serialization.InterfaceC43386e
        @Y61.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public LogParams deserialize(@Y61.k Decoder decoder) {
            SerialDescriptor f332717a = getF412706c();
            kotlinx.serialization.encoding.c cVarC = decoder.c(f332717a);
            Object objF = null;
            boolean z12 = true;
            int i12 = 0;
            Object objF2 = null;
            Object objF3 = null;
            String strS = null;
            String strS2 = null;
            String strS3 = null;
            String strS4 = null;
            String strS5 = null;
            while (z12) {
                int iJ2 = cVarC.j(f332717a);
                switch (iJ2) {
                    case -1:
                        z12 = false;
                        break;
                    case 0:
                        strS = cVarC.s(f332717a, 0);
                        i12 |= 1;
                        break;
                    case 1:
                        strS2 = cVarC.s(f332717a, 1);
                        i12 |= 2;
                        break;
                    case 2:
                        objF = cVarC.f(f332717a, 2, V0.f412822a, objF);
                        i12 |= 4;
                        break;
                    case 3:
                        objF2 = cVarC.f(f332717a, 3, V0.f412822a, objF2);
                        i12 |= 8;
                        break;
                    case 4:
                        strS3 = cVarC.s(f332717a, 4);
                        i12 |= 16;
                        break;
                    case 5:
                        strS4 = cVarC.s(f332717a, 5);
                        i12 |= 32;
                        break;
                    case 6:
                        strS5 = cVarC.s(f332717a, 6);
                        i12 |= 64;
                        break;
                    case 7:
                        objF3 = cVarC.f(f332717a, 7, V0.f412822a, objF3);
                        i12 |= 128;
                        break;
                    default:
                        throw new UnknownFieldException(iJ2);
                }
            }
            cVarC.d(f332717a);
            return new LogParams(i12, strS, strS2, (String) objF, (String) objF2, strS3, strS4, strS5, (String) objF3, (P0) null);
        }

        @Override // kotlinx.serialization.internal.N
        @Y61.k
        public KSerializer<?>[] childSerializers() {
            V0 v02 = V0.f412822a;
            return new KSerializer[]{v02, v02, L51.a.a(v02), L51.a.a(v02), v02, v02, v02, L51.a.a(v02)};
        }

        @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
        @Y61.k
        /* renamed from: getDescriptor */
        public SerialDescriptor getF412706c() {
            return f432997b;
        }

        @Override // kotlinx.serialization.internal.N
        @Y61.k
        public KSerializer<?>[] typeParametersSerializers() {
            return G0.f412773a;
        }

        @Override // kotlinx.serialization.x
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void serialize(@Y61.k Encoder encoder, @Y61.k LogParams value) {
            SerialDescriptor f332717a = getF412706c();
            kotlinx.serialization.encoding.d dVarC = encoder.c(f332717a);
            LogParams.write$Self(value, dVarC, f332717a);
            dVarC.d(f332717a);
        }
    }

    /* compiled from: LogParams.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lru/cyberity/cbr/core/data/model/LogParams$b;", "", "Lkotlinx/serialization/KSerializer;", "Lru/cyberity/cbr/core/data/model/LogParams;", "serializer", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: ru.cyberity.cbr.core.data.model.LogParams$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @Y61.k
        public final KSerializer<LogParams> serializer() {
            return a.f432996a;
        }

        private Companion() {
        }
    }

    @InterfaceC42830m
    public /* synthetic */ LogParams(int i12, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, P0 p02) {
        if (50 != (i12 & 50)) {
            E0.b(i12, 50, a.f432996a.getF412706c());
            throw null;
        }
        this.errorType = (i12 & 1) == 0 ? "msdkError" : str;
        this.location = str2;
        if ((i12 & 4) == 0) {
            this.externalUserId = null;
        } else {
            this.externalUserId = str3;
        }
        if ((i12 & 8) == 0) {
            this.fileName = null;
        } else {
            this.fileName = str4;
        }
        this.applicantId = str5;
        this.message = str6;
        if ((i12 & 64) == 0) {
            this.kind = "sdk";
        } else {
            this.kind = str7;
        }
        if ((i12 & 128) == 0) {
            this.stacktrace = null;
        } else {
            this.stacktrace = str8;
        }
    }

    @X41.n
    public static final void write$Self(@Y61.k LogParams self, @Y61.k kotlinx.serialization.encoding.d output, @Y61.k SerialDescriptor serialDesc) {
        if (output.u() || !L.f(self.errorType, "msdkError")) {
            output.l(serialDesc, 0, self.errorType);
        }
        output.l(serialDesc, 1, self.location);
        if (output.u() || self.externalUserId != null) {
            output.p(serialDesc, 2, V0.f412822a, self.externalUserId);
        }
        if (output.u() || self.fileName != null) {
            output.p(serialDesc, 3, V0.f412822a, self.fileName);
        }
        output.l(serialDesc, 4, self.applicantId);
        output.l(serialDesc, 5, self.message);
        if (output.u() || !L.f(self.kind, "sdk")) {
            output.l(serialDesc, 6, self.kind);
        }
        if (!output.u() && self.stacktrace == null) {
            return;
        }
        output.p(serialDesc, 7, V0.f412822a, self.stacktrace);
    }

    @Y61.k
    /* renamed from: component1, reason: from getter */
    public final String getErrorType() {
        return this.errorType;
    }

    @Y61.k
    /* renamed from: component2, reason: from getter */
    public final String getLocation() {
        return this.location;
    }

    @Y61.l
    /* renamed from: component3, reason: from getter */
    public final String getExternalUserId() {
        return this.externalUserId;
    }

    @Y61.l
    /* renamed from: component4, reason: from getter */
    public final String getFileName() {
        return this.fileName;
    }

    @Y61.k
    /* renamed from: component5, reason: from getter */
    public final String getApplicantId() {
        return this.applicantId;
    }

    @Y61.k
    /* renamed from: component6, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @Y61.k
    /* renamed from: component7, reason: from getter */
    public final String getKind() {
        return this.kind;
    }

    @Y61.l
    /* renamed from: component8, reason: from getter */
    public final String getStacktrace() {
        return this.stacktrace;
    }

    @Y61.k
    public final LogParams copy(@Y61.k String errorType, @Y61.k String location, @Y61.l String externalUserId, @Y61.l String fileName, @Y61.k String applicantId, @Y61.k String message, @Y61.k String kind, @Y61.l String stacktrace) {
        return new LogParams(errorType, location, externalUserId, fileName, applicantId, message, kind, stacktrace);
    }

    public boolean equals(@Y61.l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LogParams)) {
            return false;
        }
        LogParams logParams = (LogParams) other;
        return L.f(this.errorType, logParams.errorType) && L.f(this.location, logParams.location) && L.f(this.externalUserId, logParams.externalUserId) && L.f(this.fileName, logParams.fileName) && L.f(this.applicantId, logParams.applicantId) && L.f(this.message, logParams.message) && L.f(this.kind, logParams.kind) && L.f(this.stacktrace, logParams.stacktrace);
    }

    @Y61.k
    public final String getApplicantId() {
        return this.applicantId;
    }

    @Y61.k
    public final String getErrorType() {
        return this.errorType;
    }

    @Y61.l
    public final String getExternalUserId() {
        return this.externalUserId;
    }

    @Y61.l
    public final String getFileName() {
        return this.fileName;
    }

    @Y61.k
    public final String getKind() {
        return this.kind;
    }

    @Y61.k
    public final String getLocation() {
        return this.location;
    }

    @Y61.k
    public final String getMessage() {
        return this.message;
    }

    @Y61.l
    public final String getStacktrace() {
        return this.stacktrace;
    }

    public int hashCode() {
        int iD2 = H.d(this.errorType.hashCode() * 31, 31, this.location);
        String str = this.externalUserId;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.fileName;
        int iD3 = H.d(H.d(H.d((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.applicantId), 31, this.message), 31, this.kind);
        String str3 = this.stacktrace;
        return iD3 + (str3 != null ? str3.hashCode() : 0);
    }

    @Y61.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("LogParams(errorType=");
        sb2.append(this.errorType);
        sb2.append(", location=");
        sb2.append(this.location);
        sb2.append(", externalUserId=");
        sb2.append(this.externalUserId);
        sb2.append(", fileName=");
        sb2.append(this.fileName);
        sb2.append(", applicantId=");
        sb2.append(this.applicantId);
        sb2.append(", message=");
        sb2.append(this.message);
        sb2.append(", kind=");
        sb2.append(this.kind);
        sb2.append(", stacktrace=");
        return C22026a.c(sb2, this.stacktrace, ')');
    }

    public LogParams(@Y61.k String str, @Y61.k String str2, @Y61.l String str3, @Y61.l String str4, @Y61.k String str5, @Y61.k String str6, @Y61.k String str7, @Y61.l String str8) {
        this.errorType = str;
        this.location = str2;
        this.externalUserId = str3;
        this.fileName = str4;
        this.applicantId = str5;
        this.message = str6;
        this.kind = str7;
        this.stacktrace = str8;
    }

    public /* synthetic */ LogParams(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? "msdkError" : str, str2, (i12 & 4) != 0 ? null : str3, (i12 & 8) != 0 ? null : str4, str5, str6, (i12 & 64) != 0 ? "sdk" : str7, (i12 & 128) != 0 ? null : str8);
    }
}
