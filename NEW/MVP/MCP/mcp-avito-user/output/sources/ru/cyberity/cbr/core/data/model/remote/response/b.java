package ru.cyberity.cbr.core.data.model.remote.response;

import X41.n;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
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
import kotlinx.serialization.internal.Y;
import kotlinx.serialization.v;
import kotlinx.serialization.w;

/* compiled from: ApiErrorResponse.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 22\u00020\u0001:\u0002\u0015\u0018BC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nBW\b\u0017\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\t\u0010\u000eJ(\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012HÇ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0017J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0017JL\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0017J\u0010\u0010\u001f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u0017R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010)\u0012\u0004\b+\u0010(\u001a\u0004\b*\u0010\u0019R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010%\u0012\u0004\b-\u0010(\u001a\u0004\b,\u0010\u0017R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010)\u0012\u0004\b/\u0010(\u001a\u0004\b.\u0010\u0019R\"\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010%\u0012\u0004\b1\u0010(\u001a\u0004\b0\u0010\u0017¨\u00063"}, d2 = {"Lru/cyberity/cbr/core/data/model/remote/response/b;", "", "", "description", "", "code", "correlationId", "errorCode", "errorName", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "seen1", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lkotlinx/serialization/internal/P0;)V", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lkotlin/G0;", "a", "(Lru/cyberity/cbr/core/data/model/remote/response/b;Lkotlinx/serialization/encoding/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "()Ljava/lang/String;", "b", "()Ljava/lang/Integer;", "c", "d", "e", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lru/cyberity/cbr/core/data/model/remote/response/b;", "toString", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "j", "getDescription$annotations", "()V", "Ljava/lang/Integer;", "f", "getCode$annotations", "h", "getCorrelationId$annotations", "l", "getErrorCode$annotations", "n", "getErrorName$annotations", "Companion", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
@w
/* loaded from: classes9.dex */
public final /* data */ class b {

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    private final String description;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private final Integer code;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @l
    private final String correlationId;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @l
    private final Integer errorCode;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @l
    private final String errorName;

    /* compiled from: ApiErrorResponse.kt */
    @Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000b\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"ru/cyberity/cbr/core/data/model/remote/response/ApiErrorResponse.$serializer", "Lkotlinx/serialization/internal/N;", "Lru/cyberity/cbr/core/data/model/remote/response/b;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "a", "(Lkotlinx/serialization/encoding/Decoder;)Lru/cyberity/cbr/core/data/model/remote/response/b;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlin/G0;", "(Lkotlinx/serialization/encoding/Encoder;Lru/cyberity/cbr/core/data/model/remote/response/b;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    @InterfaceC42830m
    public static final class a implements N<b> {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f433297a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ SerialDescriptor f433298b;

        static {
            a aVar = new a();
            f433297a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.cyberity.cbr.core.data.model.remote.response.ApiErrorResponse", aVar, 5);
            pluginGeneratedSerialDescriptor.j("description", true);
            pluginGeneratedSerialDescriptor.j("code", true);
            pluginGeneratedSerialDescriptor.j("correlationId", true);
            pluginGeneratedSerialDescriptor.j("errorCode", true);
            pluginGeneratedSerialDescriptor.j("errorName", true);
            f433298b = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // kotlinx.serialization.InterfaceC43386e
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b deserialize(@k Decoder decoder) {
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
                    objF = cVarC.f(f412706c, 0, V0.f412822a, objF);
                    i12 |= 1;
                } else if (iJ2 == 1) {
                    objF2 = cVarC.f(f412706c, 1, Y.f412835a, objF2);
                    i12 |= 2;
                } else if (iJ2 == 2) {
                    objF3 = cVarC.f(f412706c, 2, V0.f412822a, objF3);
                    i12 |= 4;
                } else if (iJ2 == 3) {
                    objF4 = cVarC.f(f412706c, 3, Y.f412835a, objF4);
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
            return new b(i12, (String) objF, (Integer) objF2, (String) objF3, (Integer) objF4, (String) objF5, (P0) null);
        }

        @Override // kotlinx.serialization.internal.N
        @k
        public KSerializer<?>[] childSerializers() {
            V0 v02 = V0.f412822a;
            KSerializer<?> kSerializerA = L51.a.a(v02);
            Y y12 = Y.f412835a;
            return new KSerializer[]{kSerializerA, L51.a.a(y12), L51.a.a(v02), L51.a.a(y12), L51.a.a(v02)};
        }

        @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
        @k
        /* renamed from: getDescriptor */
        public SerialDescriptor getF412706c() {
            return f433298b;
        }

        @Override // kotlinx.serialization.internal.N
        @k
        public KSerializer<?>[] typeParametersSerializers() {
            return G0.f412773a;
        }

        @Override // kotlinx.serialization.x
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void serialize(@k Encoder encoder, @k b value) {
            SerialDescriptor f412706c = getF412706c();
            kotlinx.serialization.encoding.d dVarC = encoder.c(f412706c);
            b.a(value, dVarC, f412706c);
            dVarC.d(f412706c);
        }
    }

    /* compiled from: ApiErrorResponse.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lru/cyberity/cbr/core/data/model/remote/response/b$b;", "", "Lkotlinx/serialization/KSerializer;", "Lru/cyberity/cbr/core/data/model/remote/response/b;", "serializer", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: ru.cyberity.cbr.core.data.model.remote.response.b$b, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @k
        public final KSerializer<b> serializer() {
            return a.f433297a;
        }

        private Companion() {
        }
    }

    public b() {
        this((String) null, (Integer) null, (String) null, (Integer) null, (String) null, 31, (C42822w) null);
    }

    @l
    /* renamed from: a, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final Integer getCode() {
        return this.code;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final String getCorrelationId() {
        return this.correlationId;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final Integer getErrorCode() {
        return this.errorCode;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final String getErrorName() {
        return this.errorName;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof b)) {
            return false;
        }
        b bVar = (b) other;
        return L.f(this.description, bVar.description) && L.f(this.code, bVar.code) && L.f(this.correlationId, bVar.correlationId) && L.f(this.errorCode, bVar.errorCode) && L.f(this.errorName, bVar.errorName);
    }

    @l
    public final Integer f() {
        return this.code;
    }

    @l
    public final String h() {
        return this.correlationId;
    }

    public int hashCode() {
        String str = this.description;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.code;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.correlationId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.errorCode;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str3 = this.errorName;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    @l
    public final String j() {
        return this.description;
    }

    @l
    public final Integer l() {
        return this.errorCode;
    }

    @l
    public final String n() {
        return this.errorName;
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ApiErrorResponse(description=");
        sb2.append(this.description);
        sb2.append(", code=");
        sb2.append(this.code);
        sb2.append(", correlationId=");
        sb2.append(this.correlationId);
        sb2.append(", errorCode=");
        sb2.append(this.errorCode);
        sb2.append(", errorName=");
        return C22026a.c(sb2, this.errorName, ')');
    }

    @InterfaceC42830m
    public /* synthetic */ b(int i12, @v String str, @v Integer num, @v String str2, @v Integer num2, @v String str3, P0 p02) {
        if ((i12 & 1) == 0) {
            this.description = null;
        } else {
            this.description = str;
        }
        if ((i12 & 2) == 0) {
            this.code = null;
        } else {
            this.code = num;
        }
        if ((i12 & 4) == 0) {
            this.correlationId = null;
        } else {
            this.correlationId = str2;
        }
        if ((i12 & 8) == 0) {
            this.errorCode = null;
        } else {
            this.errorCode = num2;
        }
        if ((i12 & 16) == 0) {
            this.errorName = null;
        } else {
            this.errorName = str3;
        }
    }

    @k
    public final b a(@l String description, @l Integer code, @l String correlationId, @l Integer errorCode, @l String errorName) {
        return new b(description, code, correlationId, errorCode, errorName);
    }

    public b(@l String str, @l Integer num, @l String str2, @l Integer num2, @l String str3) {
        this.description = str;
        this.code = num;
        this.correlationId = str2;
        this.errorCode = num2;
        this.errorName = str3;
    }

    public static /* synthetic */ b a(b bVar, String str, Integer num, String str2, Integer num2, String str3, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = bVar.description;
        }
        if ((i12 & 2) != 0) {
            num = bVar.code;
        }
        Integer num3 = num;
        if ((i12 & 4) != 0) {
            str2 = bVar.correlationId;
        }
        String str4 = str2;
        if ((i12 & 8) != 0) {
            num2 = bVar.errorCode;
        }
        Integer num4 = num2;
        if ((i12 & 16) != 0) {
            str3 = bVar.errorName;
        }
        return bVar.a(str, num3, str4, num4, str3);
    }

    @n
    public static final void a(@k b self, @k kotlinx.serialization.encoding.d output, @k SerialDescriptor serialDesc) {
        if (output.u() || self.description != null) {
            output.p(serialDesc, 0, V0.f412822a, self.description);
        }
        if (output.u() || self.code != null) {
            output.p(serialDesc, 1, Y.f412835a, self.code);
        }
        if (output.u() || self.correlationId != null) {
            output.p(serialDesc, 2, V0.f412822a, self.correlationId);
        }
        if (output.u() || self.errorCode != null) {
            output.p(serialDesc, 3, Y.f412835a, self.errorCode);
        }
        if (!output.u() && self.errorName == null) {
            return;
        }
        output.p(serialDesc, 4, V0.f412822a, self.errorName);
    }

    public /* synthetic */ b(String str, Integer num, String str2, Integer num2, String str3, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : num, (i12 & 4) != 0 ? null : str2, (i12 & 8) != 0 ? null : num2, (i12 & 16) != 0 ? null : str3);
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
