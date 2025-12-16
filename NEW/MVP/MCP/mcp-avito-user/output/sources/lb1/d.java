package Lb1;

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
import kotlinx.serialization.internal.G0;
import kotlinx.serialization.internal.N;
import kotlinx.serialization.internal.P0;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.V0;
import kotlinx.serialization.v;
import kotlinx.serialization.w;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0081\b\u0018\u0000 \n2\u00020\u0001:\u0002\u000b\fB'\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"LLb1/d;", "", "", "seen1", "", "type", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Lkotlinx/serialization/internal/P0;)V", "Companion", "a", "b", "SberIdSDK_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@w
/* loaded from: classes9.dex */
public final /* data */ class d {

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    @l
    public final String f10015a;

    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"sberid/sdk/app_token/domain/models/network/ScopeItem.$serializer", "Lkotlinx/serialization/internal/N;", "LLb1/d;", "<init>", "()V", "SberIdSDK_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @InterfaceC42830m
    public static final class a implements N<d> {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f10016a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ PluginGeneratedSerialDescriptor f10017b;

        static {
            a aVar = new a();
            f10016a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("sberid.sdk.app_token.domain.models.network.ScopeItem", aVar, 1);
            pluginGeneratedSerialDescriptor.j("type", true);
            f10017b = pluginGeneratedSerialDescriptor;
        }

        @Override // kotlinx.serialization.internal.N
        @k
        public final KSerializer<?>[] childSerializers() {
            return new KSerializer[]{L51.a.a(V0.f412822a)};
        }

        @Override // kotlinx.serialization.InterfaceC43386e
        public final Object deserialize(Decoder decoder) {
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f10017b;
            kotlinx.serialization.encoding.c cVarC = decoder.c(pluginGeneratedSerialDescriptor);
            P0 p02 = null;
            String str = null;
            boolean z12 = true;
            int i12 = 0;
            while (z12) {
                int iJ2 = cVarC.j(pluginGeneratedSerialDescriptor);
                if (iJ2 == -1) {
                    z12 = false;
                } else {
                    if (iJ2 != 0) {
                        throw new UnknownFieldException(iJ2);
                    }
                    str = (String) cVarC.f(pluginGeneratedSerialDescriptor, 0, V0.f412822a, str);
                    i12 = 1;
                }
            }
            cVarC.d(pluginGeneratedSerialDescriptor);
            return new d(i12, str, p02);
        }

        @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
        @k
        /* renamed from: getDescriptor */
        public final SerialDescriptor getF332717a() {
            return f10017b;
        }

        @Override // kotlinx.serialization.x
        public final void serialize(Encoder encoder, Object obj) {
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f10017b;
            kotlinx.serialization.encoding.d dVarC = encoder.c(pluginGeneratedSerialDescriptor);
            Companion companion = d.INSTANCE;
            boolean zU2 = dVarC.u();
            String str = ((d) obj).f10015a;
            if (zU2 || str != null) {
                dVarC.p(pluginGeneratedSerialDescriptor, 0, V0.f412822a, str);
            }
            dVarC.d(pluginGeneratedSerialDescriptor);
        }

        @Override // kotlinx.serialization.internal.N
        @k
        public final KSerializer<?>[] typeParametersSerializers() {
            return G0.f412773a;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LLb1/d$b;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "LLb1/d;", "serializer", "()Lkotlinx/serialization/KSerializer;", "SberIdSDK_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Lb1.d$b, reason: from kotlin metadata */
    public static final class Companion {
        public Companion() {
        }

        @k
        public final KSerializer<d> serializer() {
            return a.f10016a;
        }

        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d() {
        this((String) null, 1, (C42822w) (0 == true ? 1 : 0));
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && L.f(this.f10015a, ((d) obj).f10015a);
    }

    public final int hashCode() {
        String str = this.f10015a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @k
    public final String toString() {
        return AK.c.s(new StringBuilder("ScopeItem(type="), this.f10015a, ")");
    }

    @InterfaceC42830m
    public /* synthetic */ d(int i12, @v String str, P0 p02) {
        if ((i12 & 1) == 0) {
            this.f10015a = null;
        } else {
            this.f10015a = str;
        }
    }

    public d(@l String str) {
        this.f10015a = str;
    }

    public /* synthetic */ d(String str, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str);
    }
}
