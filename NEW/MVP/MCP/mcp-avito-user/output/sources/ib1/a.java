package Ib1;

import X41.f;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.c;
import kotlinx.serialization.encoding.d;
import kotlinx.serialization.internal.C43412k0;
import kotlinx.serialization.internal.E0;
import kotlinx.serialization.internal.G0;
import kotlinx.serialization.internal.I;
import kotlinx.serialization.internal.N;
import kotlinx.serialization.internal.P0;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.V0;
import kotlinx.serialization.v;
import kotlinx.serialization.w;
import sberid.sdk.app_token.domain.models.models.TypeAuth;

@P
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u000e2\u00020\u0001:\u0002\u000f\u0010B=\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"LIb1/a;", "", "", "seen1", "", "token", "", "expiresTime", "Lsberid/sdk/app_token/domain/models/models/TypeAuth;", "typeAuth", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;JLsberid/sdk/app_token/domain/models/models/TypeAuth;Lkotlinx/serialization/internal/P0;)V", "Companion", "a", "b", "SberIdSDK_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@w
/* loaded from: classes9.dex */
public final /* data */ class a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: d, reason: collision with root package name */
    @f
    @k
    public static final KSerializer<Object>[] f8207d = {null, null, new I("sberid.sdk.app_token.domain.models.models.TypeAuth", TypeAuth.values())};

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f8208a;

    /* renamed from: b, reason: collision with root package name */
    public final long f8209b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final TypeAuth f8210c;

    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"sberid/sdk/app_token/data/models/entities/AppTokenEntity.$serializer", "Lkotlinx/serialization/internal/N;", "LIb1/a;", "<init>", "()V", "SberIdSDK_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @InterfaceC42830m
    /* renamed from: Ib1.a$a, reason: collision with other inner class name */
    public static final class C0467a implements N<a> {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C0467a f8211a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ PluginGeneratedSerialDescriptor f8212b;

        static {
            C0467a c0467a = new C0467a();
            f8211a = c0467a;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("sberid.sdk.app_token.data.models.entities.AppTokenEntity", c0467a, 3);
            pluginGeneratedSerialDescriptor.j("token", false);
            pluginGeneratedSerialDescriptor.j("expiresTime", false);
            pluginGeneratedSerialDescriptor.j("typeAuth", false);
            f8212b = pluginGeneratedSerialDescriptor;
        }

        @Override // kotlinx.serialization.internal.N
        @k
        public final KSerializer<?>[] childSerializers() {
            return new KSerializer[]{V0.f412822a, C43412k0.f412877a, L51.a.a(a.f8207d[2])};
        }

        @Override // kotlinx.serialization.InterfaceC43386e
        public final Object deserialize(Decoder decoder) {
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f8212b;
            c cVarC = decoder.c(pluginGeneratedSerialDescriptor);
            KSerializer<Object>[] kSerializerArr = a.f8207d;
            String strS = null;
            TypeAuth typeAuth = null;
            int i12 = 0;
            long jP2 = 0;
            boolean z12 = true;
            while (z12) {
                int iJ2 = cVarC.j(pluginGeneratedSerialDescriptor);
                if (iJ2 == -1) {
                    z12 = false;
                } else if (iJ2 == 0) {
                    strS = cVarC.s(pluginGeneratedSerialDescriptor, 0);
                    i12 |= 1;
                } else if (iJ2 == 1) {
                    jP2 = cVarC.p(pluginGeneratedSerialDescriptor, 1);
                    i12 |= 2;
                } else {
                    if (iJ2 != 2) {
                        throw new UnknownFieldException(iJ2);
                    }
                    typeAuth = (TypeAuth) cVarC.f(pluginGeneratedSerialDescriptor, 2, kSerializerArr[2], typeAuth);
                    i12 |= 4;
                }
            }
            cVarC.d(pluginGeneratedSerialDescriptor);
            return new a(i12, strS, jP2, typeAuth, null);
        }

        @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
        @k
        /* renamed from: getDescriptor */
        public final SerialDescriptor getF332717a() {
            return f8212b;
        }

        @Override // kotlinx.serialization.x
        public final void serialize(Encoder encoder, Object obj) {
            a aVar = (a) obj;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f8212b;
            d dVarC = encoder.c(pluginGeneratedSerialDescriptor);
            dVarC.l(pluginGeneratedSerialDescriptor, 0, aVar.f8208a);
            dVarC.o(pluginGeneratedSerialDescriptor, 1, aVar.f8209b);
            dVarC.p(pluginGeneratedSerialDescriptor, 2, a.f8207d[2], aVar.f8210c);
            dVarC.d(pluginGeneratedSerialDescriptor);
        }

        @Override // kotlinx.serialization.internal.N
        @k
        public final KSerializer<?>[] typeParametersSerializers() {
            return G0.f412773a;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LIb1/a$b;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "LIb1/a;", "serializer", "()Lkotlinx/serialization/KSerializer;", "SberIdSDK_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ib1.a$b, reason: from kotlin metadata */
    public static final class Companion {
        public Companion() {
        }

        @k
        public final KSerializer<a> serializer() {
            return C0467a.f8211a;
        }

        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }
    }

    @InterfaceC42830m
    public a(int i12, @v String str, @v long j12, @v TypeAuth typeAuth, P0 p02) {
        if (7 != (i12 & 7)) {
            C0467a.f8211a.getClass();
            E0.b(i12, 7, C0467a.f8212b);
            throw null;
        }
        this.f8208a = str;
        this.f8209b = j12;
        this.f8210c = typeAuth;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f8208a, aVar.f8208a) && this.f8209b == aVar.f8209b && this.f8210c == aVar.f8210c;
    }

    public final int hashCode() {
        int iG2 = r.g(this.f8208a.hashCode() * 31, 31, this.f8209b);
        TypeAuth typeAuth = this.f8210c;
        return iG2 + (typeAuth == null ? 0 : typeAuth.hashCode());
    }

    @k
    public final String toString() {
        return "AppTokenEntity(token=" + this.f8208a + ", expiresTime=" + this.f8209b + ", typeAuth=" + this.f8210c + ")";
    }

    public a(@k String str, long j12, @l TypeAuth typeAuth) {
        this.f8208a = str;
        this.f8209b = j12;
        this.f8210c = typeAuth;
    }
}
