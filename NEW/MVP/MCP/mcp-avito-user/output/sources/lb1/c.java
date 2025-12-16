package Lb1;

import Lb1.d;
import X41.f;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
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
import kotlinx.serialization.internal.G0;
import kotlinx.serialization.internal.N;
import kotlinx.serialization.internal.P0;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.V0;
import kotlinx.serialization.internal.Y;
import kotlinx.serialization.v;
import kotlinx.serialization.w;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0081\b\u0018\u0000 \u000f2\u00020\u0001:\u0002\u0010\u0011BQ\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0001\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"LLb1/c;", "", "", "seen1", "", "accessToken", "", "LLb1/d;", "scope", "tokenType", "expiresIn", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Lkotlinx/serialization/internal/P0;)V", "Companion", "a", "b", "SberIdSDK_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@w
/* loaded from: classes9.dex */
public final /* data */ class c {

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: e, reason: collision with root package name */
    @f
    @k
    public static final KSerializer<Object>[] f10008e = {null, new C43401f(d.a.f10016a), null, null};

    /* renamed from: a, reason: collision with root package name */
    @l
    public final String f10009a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final List<d> f10010b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f10011c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Integer f10012d;

    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"sberid/sdk/app_token/domain/models/network/ExchangeTokenResponse.$serializer", "Lkotlinx/serialization/internal/N;", "LLb1/c;", "<init>", "()V", "SberIdSDK_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @InterfaceC42830m
    public static final class a implements N<c> {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f10013a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ PluginGeneratedSerialDescriptor f10014b;

        static {
            a aVar = new a();
            f10013a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("sberid.sdk.app_token.domain.models.network.ExchangeTokenResponse", aVar, 4);
            pluginGeneratedSerialDescriptor.j("access_token", true);
            pluginGeneratedSerialDescriptor.j("scope", true);
            pluginGeneratedSerialDescriptor.j("token_type", true);
            pluginGeneratedSerialDescriptor.j("expires_in", true);
            f10014b = pluginGeneratedSerialDescriptor;
        }

        @Override // kotlinx.serialization.internal.N
        @k
        public final KSerializer<?>[] childSerializers() {
            KSerializer<Object>[] kSerializerArr = c.f10008e;
            V0 v02 = V0.f412822a;
            return new KSerializer[]{L51.a.a(v02), L51.a.a(kSerializerArr[1]), L51.a.a(v02), L51.a.a(Y.f412835a)};
        }

        @Override // kotlinx.serialization.InterfaceC43386e
        public final Object deserialize(Decoder decoder) {
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f10014b;
            kotlinx.serialization.encoding.c cVarC = decoder.c(pluginGeneratedSerialDescriptor);
            KSerializer<Object>[] kSerializerArr = c.f10008e;
            String str = null;
            List list = null;
            String str2 = null;
            Integer num = null;
            int i12 = 0;
            boolean z12 = true;
            while (z12) {
                int iJ2 = cVarC.j(pluginGeneratedSerialDescriptor);
                if (iJ2 == -1) {
                    z12 = false;
                } else if (iJ2 == 0) {
                    str = (String) cVarC.f(pluginGeneratedSerialDescriptor, 0, V0.f412822a, str);
                    i12 |= 1;
                } else if (iJ2 == 1) {
                    list = (List) cVarC.f(pluginGeneratedSerialDescriptor, 1, kSerializerArr[1], list);
                    i12 |= 2;
                } else if (iJ2 == 2) {
                    str2 = (String) cVarC.f(pluginGeneratedSerialDescriptor, 2, V0.f412822a, str2);
                    i12 |= 4;
                } else {
                    if (iJ2 != 3) {
                        throw new UnknownFieldException(iJ2);
                    }
                    num = (Integer) cVarC.f(pluginGeneratedSerialDescriptor, 3, Y.f412835a, num);
                    i12 |= 8;
                }
            }
            cVarC.d(pluginGeneratedSerialDescriptor);
            return new c(i12, str, list, str2, num, (P0) null);
        }

        @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
        @k
        /* renamed from: getDescriptor */
        public final SerialDescriptor getF332717a() {
            return f10014b;
        }

        @Override // kotlinx.serialization.x
        public final void serialize(Encoder encoder, Object obj) {
            c cVar = (c) obj;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f10014b;
            kotlinx.serialization.encoding.d dVarC = encoder.c(pluginGeneratedSerialDescriptor);
            Companion companion = c.INSTANCE;
            boolean zU2 = dVarC.u();
            String str = cVar.f10009a;
            if (zU2 || str != null) {
                dVarC.p(pluginGeneratedSerialDescriptor, 0, V0.f412822a, str);
            }
            boolean zU3 = dVarC.u();
            List<d> list = cVar.f10010b;
            if (zU3 || list != null) {
                dVarC.p(pluginGeneratedSerialDescriptor, 1, c.f10008e[1], list);
            }
            boolean zU4 = dVarC.u();
            String str2 = cVar.f10011c;
            if (zU4 || str2 != null) {
                dVarC.p(pluginGeneratedSerialDescriptor, 2, V0.f412822a, str2);
            }
            boolean zU5 = dVarC.u();
            Integer num = cVar.f10012d;
            if (zU5 || num != null) {
                dVarC.p(pluginGeneratedSerialDescriptor, 3, Y.f412835a, num);
            }
            dVarC.d(pluginGeneratedSerialDescriptor);
        }

        @Override // kotlinx.serialization.internal.N
        @k
        public final KSerializer<?>[] typeParametersSerializers() {
            return G0.f412773a;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LLb1/c$b;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "LLb1/c;", "serializer", "()Lkotlinx/serialization/KSerializer;", "SberIdSDK_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Lb1.c$b, reason: from kotlin metadata */
    public static final class Companion {
        public Companion() {
        }

        @k
        public final KSerializer<c> serializer() {
            return a.f10013a;
        }

        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }
    }

    public c() {
        this((String) null, (List) null, (String) null, (Integer) null, 15, (C42822w) null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f10009a, cVar.f10009a) && L.f(this.f10010b, cVar.f10010b) && L.f(this.f10011c, cVar.f10011c) && L.f(this.f10012d, cVar.f10012d);
    }

    public final int hashCode() {
        String str = this.f10009a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<d> list = this.f10010b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.f10011c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f10012d;
        return iHashCode3 + (num != null ? num.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "ExchangeTokenResponse(accessToken=" + this.f10009a + ", scope=" + this.f10010b + ", tokenType=" + this.f10011c + ", expiresIn=" + this.f10012d + ")";
    }

    @InterfaceC42830m
    public /* synthetic */ c(int i12, @v String str, @v List list, @v String str2, @v Integer num, P0 p02) {
        if ((i12 & 1) == 0) {
            this.f10009a = null;
        } else {
            this.f10009a = str;
        }
        if ((i12 & 2) == 0) {
            this.f10010b = null;
        } else {
            this.f10010b = list;
        }
        if ((i12 & 4) == 0) {
            this.f10011c = null;
        } else {
            this.f10011c = str2;
        }
        if ((i12 & 8) == 0) {
            this.f10012d = null;
        } else {
            this.f10012d = num;
        }
    }

    public c(String str, List list, String str2, Integer num, int i12, C42822w c42822w) {
        str = (i12 & 1) != 0 ? null : str;
        list = (i12 & 2) != 0 ? null : list;
        str2 = (i12 & 4) != 0 ? null : str2;
        num = (i12 & 8) != 0 ? null : num;
        this.f10009a = str;
        this.f10010b = list;
        this.f10011c = str2;
        this.f10012d = num;
    }
}
