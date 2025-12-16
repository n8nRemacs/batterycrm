package Lb1;

import Lb1.a;
import Y61.k;
import Y61.l;
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
import kotlinx.serialization.internal.C43407i;
import kotlinx.serialization.internal.G0;
import kotlinx.serialization.internal.N;
import kotlinx.serialization.internal.P0;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.v;
import kotlinx.serialization.w;

@P
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \f2\u00020\u0001:\u0002\r\u000eB3\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"LLb1/b;", "", "", "seen1", "", "success", "LLb1/a;", "data", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/Boolean;LLb1/a;Lkotlinx/serialization/internal/P0;)V", "Companion", "a", "b", "SberIdSDK_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@w
/* loaded from: classes9.dex */
public final /* data */ class b {

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    @l
    public final Boolean f10004a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Lb1.a f10005b;

    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"sberid/sdk/app_token/domain/models/network/AppTokenResponse.$serializer", "Lkotlinx/serialization/internal/N;", "LLb1/b;", "<init>", "()V", "SberIdSDK_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @InterfaceC42830m
    public static final class a implements N<b> {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f10006a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ PluginGeneratedSerialDescriptor f10007b;

        static {
            a aVar = new a();
            f10006a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("sberid.sdk.app_token.domain.models.network.AppTokenResponse", aVar, 2);
            pluginGeneratedSerialDescriptor.j("success", true);
            pluginGeneratedSerialDescriptor.j("data", true);
            f10007b = pluginGeneratedSerialDescriptor;
        }

        @Override // kotlinx.serialization.internal.N
        @k
        public final KSerializer<?>[] childSerializers() {
            return new KSerializer[]{L51.a.a(C43407i.f412866a), L51.a.a(a.C0618a.f10002a)};
        }

        @Override // kotlinx.serialization.InterfaceC43386e
        public final Object deserialize(Decoder decoder) {
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f10007b;
            kotlinx.serialization.encoding.c cVarC = decoder.c(pluginGeneratedSerialDescriptor);
            P0 p02 = null;
            boolean z12 = true;
            Boolean bool = null;
            Lb1.a aVar = null;
            int i12 = 0;
            while (z12) {
                int iJ2 = cVarC.j(pluginGeneratedSerialDescriptor);
                if (iJ2 == -1) {
                    z12 = false;
                } else if (iJ2 == 0) {
                    bool = (Boolean) cVarC.f(pluginGeneratedSerialDescriptor, 0, C43407i.f412866a, bool);
                    i12 |= 1;
                } else {
                    if (iJ2 != 1) {
                        throw new UnknownFieldException(iJ2);
                    }
                    aVar = (Lb1.a) cVarC.f(pluginGeneratedSerialDescriptor, 1, a.C0618a.f10002a, aVar);
                    i12 |= 2;
                }
            }
            cVarC.d(pluginGeneratedSerialDescriptor);
            return new b(i12, bool, aVar, p02);
        }

        @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
        @k
        /* renamed from: getDescriptor */
        public final SerialDescriptor getF332717a() {
            return f10007b;
        }

        @Override // kotlinx.serialization.x
        public final void serialize(Encoder encoder, Object obj) {
            b bVar = (b) obj;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f10007b;
            kotlinx.serialization.encoding.d dVarC = encoder.c(pluginGeneratedSerialDescriptor);
            Companion companion = b.INSTANCE;
            boolean zU2 = dVarC.u();
            Boolean bool = bVar.f10004a;
            if (zU2 || bool != null) {
                dVarC.p(pluginGeneratedSerialDescriptor, 0, C43407i.f412866a, bool);
            }
            boolean zU3 = dVarC.u();
            Lb1.a aVar = bVar.f10005b;
            if (zU3 || aVar != null) {
                dVarC.p(pluginGeneratedSerialDescriptor, 1, a.C0618a.f10002a, aVar);
            }
            dVarC.d(pluginGeneratedSerialDescriptor);
        }

        @Override // kotlinx.serialization.internal.N
        @k
        public final KSerializer<?>[] typeParametersSerializers() {
            return G0.f412773a;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LLb1/b$b;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "LLb1/b;", "serializer", "()Lkotlinx/serialization/KSerializer;", "SberIdSDK_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Lb1.b$b, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        public Companion() {
        }

        @k
        public final KSerializer<b> serializer() {
            return a.f10006a;
        }

        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }
    }

    public b() {
        this((Boolean) null, (Lb1.a) null, 3, (C42822w) null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return L.f(this.f10004a, bVar.f10004a) && L.f(this.f10005b, bVar.f10005b);
    }

    public final int hashCode() {
        Boolean bool = this.f10004a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Lb1.a aVar = this.f10005b;
        return iHashCode + (aVar != null ? aVar.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "AppTokenResponse(success=" + this.f10004a + ", data=" + this.f10005b + ")";
    }

    @InterfaceC42830m
    public /* synthetic */ b(int i12, @v Boolean bool, @v Lb1.a aVar, P0 p02) {
        if ((i12 & 1) == 0) {
            this.f10004a = null;
        } else {
            this.f10004a = bool;
        }
        if ((i12 & 2) == 0) {
            this.f10005b = null;
        } else {
            this.f10005b = aVar;
        }
    }

    public b(Boolean bool, Lb1.a aVar, int i12, C42822w c42822w) {
        bool = (i12 & 1) != 0 ? null : bool;
        aVar = (i12 & 2) != 0 ? null : aVar;
        this.f10004a = bool;
        this.f10005b = aVar;
    }
}
