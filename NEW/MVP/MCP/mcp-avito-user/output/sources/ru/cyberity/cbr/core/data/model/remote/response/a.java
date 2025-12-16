package ru.cyberity.cbr.core.data.model.remote.response;

import X41.n;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.context.ChannelContext;
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
import kotlinx.serialization.v;
import kotlinx.serialization.w;

/* compiled from: AccessTokenResponse.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002\u0012\u0015B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B3\b\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ(\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fHÇ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J(\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0014J\u0010\u0010\u0018\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u001e\u0012\u0004\b \u0010!\u001a\u0004\b\u001f\u0010\u0014R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010\u001e\u0012\u0004\b#\u0010!\u001a\u0004\b\"\u0010\u0014¨\u0006%"}, d2 = {"Lru/cyberity/cbr/core/data/model/remote/response/a;", "", "", "token", ChannelContext.Item.USER_ID, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen1", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/P0;)V", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lkotlin/G0;", "a", "(Lru/cyberity/cbr/core/data/model/remote/response/a;Lkotlinx/serialization/encoding/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "()Ljava/lang/String;", "b", "(Ljava/lang/String;Ljava/lang/String;)Lru/cyberity/cbr/core/data/model/remote/response/a;", "toString", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "c", "getToken$annotations", "()V", "e", "getUserId$annotations", "Companion", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
@w
/* loaded from: classes9.dex */
public final /* data */ class a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    private final String token;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private final String userId;

    /* compiled from: AccessTokenResponse.kt */
    @Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000b\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"ru/cyberity/cbr/core/data/model/remote/response/AccessTokenResponse.$serializer", "Lkotlinx/serialization/internal/N;", "Lru/cyberity/cbr/core/data/model/remote/response/a;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "a", "(Lkotlinx/serialization/encoding/Decoder;)Lru/cyberity/cbr/core/data/model/remote/response/a;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlin/G0;", "(Lkotlinx/serialization/encoding/Encoder;Lru/cyberity/cbr/core/data/model/remote/response/a;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    @InterfaceC42830m
    /* renamed from: ru.cyberity.cbr.core.data.model.remote.response.a$a, reason: collision with other inner class name */
    public static final class C12457a implements N<a> {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C12457a f433290a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ SerialDescriptor f433291b;

        static {
            C12457a c12457a = new C12457a();
            f433290a = c12457a;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.cyberity.cbr.core.data.model.remote.response.AccessTokenResponse", c12457a, 2);
            pluginGeneratedSerialDescriptor.j("token", true);
            pluginGeneratedSerialDescriptor.j(ChannelContext.Item.USER_ID, true);
            f433291b = pluginGeneratedSerialDescriptor;
        }

        private C12457a() {
        }

        @Override // kotlinx.serialization.InterfaceC43386e
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a deserialize(@k Decoder decoder) {
            SerialDescriptor f412706c = getF412706c();
            kotlinx.serialization.encoding.c cVarC = decoder.c(f412706c);
            P0 p02 = null;
            boolean z12 = true;
            int i12 = 0;
            Object objF = null;
            Object objF2 = null;
            while (z12) {
                int iJ2 = cVarC.j(f412706c);
                if (iJ2 == -1) {
                    z12 = false;
                } else if (iJ2 == 0) {
                    objF = cVarC.f(f412706c, 0, V0.f412822a, objF);
                    i12 |= 1;
                } else {
                    if (iJ2 != 1) {
                        throw new UnknownFieldException(iJ2);
                    }
                    objF2 = cVarC.f(f412706c, 1, V0.f412822a, objF2);
                    i12 |= 2;
                }
            }
            cVarC.d(f412706c);
            return new a(i12, (String) objF, (String) objF2, p02);
        }

        @Override // kotlinx.serialization.internal.N
        @k
        public KSerializer<?>[] childSerializers() {
            V0 v02 = V0.f412822a;
            return new KSerializer[]{L51.a.a(v02), L51.a.a(v02)};
        }

        @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
        @k
        /* renamed from: getDescriptor */
        public SerialDescriptor getF412706c() {
            return f433291b;
        }

        @Override // kotlinx.serialization.internal.N
        @k
        public KSerializer<?>[] typeParametersSerializers() {
            return G0.f412773a;
        }

        @Override // kotlinx.serialization.x
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void serialize(@k Encoder encoder, @k a value) {
            SerialDescriptor f412706c = getF412706c();
            kotlinx.serialization.encoding.d dVarC = encoder.c(f412706c);
            a.a(value, dVarC, f412706c);
            dVarC.d(f412706c);
        }
    }

    /* compiled from: AccessTokenResponse.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lru/cyberity/cbr/core/data/model/remote/response/a$b;", "", "Lkotlinx/serialization/KSerializer;", "Lru/cyberity/cbr/core/data/model/remote/response/a;", "serializer", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: ru.cyberity.cbr.core.data.model.remote.response.a$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @k
        public final KSerializer<a> serializer() {
            return C12457a.f433290a;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a() {
        this((String) null, (String) (0 == true ? 1 : 0), 3, (C42822w) (0 == true ? 1 : 0));
    }

    @l
    /* renamed from: a, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    @l
    public final String c() {
        return this.token;
    }

    @l
    public final String e() {
        return this.userId;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof a)) {
            return false;
        }
        a aVar = (a) other;
        return L.f(this.token, aVar.token) && L.f(this.userId, aVar.userId);
    }

    public int hashCode() {
        String str = this.token;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.userId;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("AccessTokenResponse(token=");
        sb2.append(this.token);
        sb2.append(", userId=");
        return C22026a.c(sb2, this.userId, ')');
    }

    @InterfaceC42830m
    public /* synthetic */ a(int i12, @v String str, @v String str2, P0 p02) {
        if ((i12 & 1) == 0) {
            this.token = null;
        } else {
            this.token = str;
        }
        if ((i12 & 2) == 0) {
            this.userId = null;
        } else {
            this.userId = str2;
        }
    }

    @k
    public final a a(@l String token, @l String userId) {
        return new a(token, userId);
    }

    public a(@l String str, @l String str2) {
        this.token = str;
        this.userId = str2;
    }

    public static /* synthetic */ a a(a aVar, String str, String str2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = aVar.token;
        }
        if ((i12 & 2) != 0) {
            str2 = aVar.userId;
        }
        return aVar.a(str, str2);
    }

    @n
    public static final void a(@k a self, @k kotlinx.serialization.encoding.d output, @k SerialDescriptor serialDesc) {
        if (output.u() || self.token != null) {
            output.p(serialDesc, 0, V0.f412822a, self.token);
        }
        if (!output.u() && self.userId == null) {
            return;
        }
        output.p(serialDesc, 1, V0.f412822a, self.userId);
    }

    public /* synthetic */ a(String str, String str2, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : str2);
    }

    @v
    public static /* synthetic */ void d() {
    }

    @v
    public static /* synthetic */ void f() {
    }
}
