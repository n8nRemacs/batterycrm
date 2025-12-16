package C41;

import C41.b;
import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import java.util.List;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.C43401f;
import kotlinx.serialization.internal.E0;
import kotlinx.serialization.internal.G0;
import kotlinx.serialization.internal.N;
import kotlinx.serialization.internal.P0;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.V0;
import kotlinx.serialization.w;
import s2.AbstractC47961a;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0081\b\u0018\u0000 \u00172\u00020\u0001:\u0002\u0018\u0019B\u0099\u0001\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"LC41/a;", "", "", "seen1", "", "eventAction", "eventType", "geoLatitude", "geoLongitude", "cellularProvider", "batteryLevel", "connectionType", "internalIP", "eventCategory", "value", "", "LC41/b;", "properties", "timeStamp", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lkotlinx/serialization/internal/P0;)V", "Companion", "a", "b", "clickstreamLite"}, k = 1, mv = {1, 8, 0})
@w
/* loaded from: classes8.dex */
public final /* data */ class a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f1926a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f1927b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public String f1928c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public String f1929d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public String f1930e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public String f1931f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public String f1932g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public String f1933h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final String f1934i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final String f1935j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final List<b> f1936k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final String f1937l;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"ru/sber/platform/clickstream/clickstreamlite/internal/models/Event.$serializer", "Lkotlinx/serialization/internal/N;", "LC41/a;", "<init>", "()V", "clickstreamLite"}, k = 1, mv = {1, 8, 0})
    @InterfaceC42830m
    /* renamed from: C41.a$a, reason: collision with other inner class name */
    public static final class C0090a implements N<a> {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C0090a f1938a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ PluginGeneratedSerialDescriptor f1939b;

        static {
            C0090a c0090a = new C0090a();
            f1938a = c0090a;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.sber.platform.clickstream.clickstreamlite.internal.models.Event", c0090a, 12);
            pluginGeneratedSerialDescriptor.j("eventAction", false);
            pluginGeneratedSerialDescriptor.j("eventType", true);
            pluginGeneratedSerialDescriptor.j("geoLatitude", true);
            pluginGeneratedSerialDescriptor.j("geoLongitude", true);
            pluginGeneratedSerialDescriptor.j("cellularProvider", true);
            pluginGeneratedSerialDescriptor.j("batteryLevel", true);
            pluginGeneratedSerialDescriptor.j("connectionType", true);
            pluginGeneratedSerialDescriptor.j("internalIP", true);
            pluginGeneratedSerialDescriptor.j("eventCategory", true);
            pluginGeneratedSerialDescriptor.j("value", true);
            pluginGeneratedSerialDescriptor.j("properties", true);
            pluginGeneratedSerialDescriptor.j("timeStamp", true);
            f1939b = pluginGeneratedSerialDescriptor;
        }

        @Override // kotlinx.serialization.internal.N
        @k
        public final KSerializer<?>[] childSerializers() {
            C43401f c43401f = new C43401f(b.a.f1942a);
            V0 v02 = V0.f412822a;
            return new KSerializer[]{v02, v02, v02, v02, v02, v02, v02, v02, v02, v02, c43401f, v02};
        }

        @Override // kotlinx.serialization.InterfaceC43386e
        public final Object deserialize(Decoder decoder) {
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f1939b;
            kotlinx.serialization.encoding.c cVarC = decoder.c(pluginGeneratedSerialDescriptor);
            Object objV = null;
            String strS = null;
            String strS2 = null;
            String strS3 = null;
            String strS4 = null;
            String strS5 = null;
            String strS6 = null;
            String strS7 = null;
            String strS8 = null;
            String strS9 = null;
            String strS10 = null;
            String strS11 = null;
            boolean z12 = true;
            int i12 = 0;
            while (z12) {
                int iJ2 = cVarC.j(pluginGeneratedSerialDescriptor);
                switch (iJ2) {
                    case -1:
                        z12 = false;
                        break;
                    case 0:
                        strS = cVarC.s(pluginGeneratedSerialDescriptor, 0);
                        i12 |= 1;
                        break;
                    case 1:
                        strS2 = cVarC.s(pluginGeneratedSerialDescriptor, 1);
                        i12 |= 2;
                        break;
                    case 2:
                        strS3 = cVarC.s(pluginGeneratedSerialDescriptor, 2);
                        i12 |= 4;
                        break;
                    case 3:
                        strS4 = cVarC.s(pluginGeneratedSerialDescriptor, 3);
                        i12 |= 8;
                        break;
                    case 4:
                        strS5 = cVarC.s(pluginGeneratedSerialDescriptor, 4);
                        i12 |= 16;
                        break;
                    case 5:
                        strS6 = cVarC.s(pluginGeneratedSerialDescriptor, 5);
                        i12 |= 32;
                        break;
                    case 6:
                        strS7 = cVarC.s(pluginGeneratedSerialDescriptor, 6);
                        i12 |= 64;
                        break;
                    case 7:
                        strS8 = cVarC.s(pluginGeneratedSerialDescriptor, 7);
                        i12 |= 128;
                        break;
                    case 8:
                        strS9 = cVarC.s(pluginGeneratedSerialDescriptor, 8);
                        i12 |= 256;
                        break;
                    case 9:
                        strS10 = cVarC.s(pluginGeneratedSerialDescriptor, 9);
                        i12 |= 512;
                        break;
                    case 10:
                        objV = cVarC.v(pluginGeneratedSerialDescriptor, 10, new C43401f(b.a.f1942a), objV);
                        i12 |= 1024;
                        break;
                    case 11:
                        strS11 = cVarC.s(pluginGeneratedSerialDescriptor, 11);
                        i12 |= 2048;
                        break;
                    default:
                        throw new UnknownFieldException(iJ2);
                }
            }
            cVarC.d(pluginGeneratedSerialDescriptor);
            return new a(i12, strS, strS2, strS3, strS4, strS5, strS6, strS7, strS8, strS9, strS10, (List) objV, strS11, (P0) null);
        }

        @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
        @k
        /* renamed from: getDescriptor */
        public final SerialDescriptor getF332717a() {
            return f1939b;
        }

        @Override // kotlinx.serialization.x
        public final void serialize(Encoder encoder, Object obj) {
            a aVar = (a) obj;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f1939b;
            kotlinx.serialization.encoding.d dVarC = encoder.c(pluginGeneratedSerialDescriptor);
            dVarC.l(pluginGeneratedSerialDescriptor, 0, aVar.f1926a);
            boolean zU2 = dVarC.u();
            String str = aVar.f1927b;
            if (zU2 || !L.f(str, "")) {
                dVarC.l(pluginGeneratedSerialDescriptor, 1, str);
            }
            if (dVarC.u() || !L.f(aVar.f1928c, "")) {
                dVarC.l(pluginGeneratedSerialDescriptor, 2, aVar.f1928c);
            }
            if (dVarC.u() || !L.f(aVar.f1929d, "")) {
                dVarC.l(pluginGeneratedSerialDescriptor, 3, aVar.f1929d);
            }
            if (dVarC.u() || !L.f(aVar.f1930e, "")) {
                dVarC.l(pluginGeneratedSerialDescriptor, 4, aVar.f1930e);
            }
            if (dVarC.u() || !L.f(aVar.f1931f, "")) {
                dVarC.l(pluginGeneratedSerialDescriptor, 5, aVar.f1931f);
            }
            if (dVarC.u() || !L.f(aVar.f1932g, "")) {
                dVarC.l(pluginGeneratedSerialDescriptor, 6, aVar.f1932g);
            }
            if (dVarC.u() || !L.f(aVar.f1933h, "")) {
                dVarC.l(pluginGeneratedSerialDescriptor, 7, aVar.f1933h);
            }
            boolean zU3 = dVarC.u();
            String str2 = aVar.f1934i;
            if (zU3 || !L.f(str2, "")) {
                dVarC.l(pluginGeneratedSerialDescriptor, 8, str2);
            }
            boolean zU4 = dVarC.u();
            String str3 = aVar.f1935j;
            if (zU4 || !L.f(str3, "")) {
                dVarC.l(pluginGeneratedSerialDescriptor, 9, str3);
            }
            boolean zU5 = dVarC.u();
            List<b> list = aVar.f1936k;
            if (zU5 || !L.f(list, C42784z0.f406748b)) {
                dVarC.F(pluginGeneratedSerialDescriptor, 10, new C43401f(b.a.f1942a), list);
            }
            boolean zU6 = dVarC.u();
            String str4 = aVar.f1937l;
            if (zU6 || !L.f(str4, N51.c.a())) {
                dVarC.l(pluginGeneratedSerialDescriptor, 11, str4);
            }
            dVarC.d(pluginGeneratedSerialDescriptor);
        }

        @Override // kotlinx.serialization.internal.N
        @k
        public final KSerializer<?>[] typeParametersSerializers() {
            return G0.f412773a;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LC41/a$b;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "LC41/a;", "serializer", "()Lkotlinx/serialization/KSerializer;", "clickstreamLite"}, k = 1, mv = {1, 8, 0})
    /* renamed from: C41.a$b, reason: from kotlin metadata */
    public static final class Companion {
        public Companion() {
        }

        @k
        public final KSerializer<a> serializer() {
            return C0090a.f1938a;
        }

        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }
    }

    public a() {
        throw null;
    }

    @InterfaceC42830m
    public a(int i12, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, List list, String str11, P0 p02) {
        if (1 != (i12 & 1)) {
            C0090a.f1938a.getClass();
            E0.b(i12, 1, C0090a.f1939b);
            throw null;
        }
        this.f1926a = str;
        if ((i12 & 2) == 0) {
            this.f1927b = "";
        } else {
            this.f1927b = str2;
        }
        if ((i12 & 4) == 0) {
            this.f1928c = "";
        } else {
            this.f1928c = str3;
        }
        if ((i12 & 8) == 0) {
            this.f1929d = "";
        } else {
            this.f1929d = str4;
        }
        if ((i12 & 16) == 0) {
            this.f1930e = "";
        } else {
            this.f1930e = str5;
        }
        if ((i12 & 32) == 0) {
            this.f1931f = "";
        } else {
            this.f1931f = str6;
        }
        if ((i12 & 64) == 0) {
            this.f1932g = "";
        } else {
            this.f1932g = str7;
        }
        if ((i12 & 128) == 0) {
            this.f1933h = "";
        } else {
            this.f1933h = str8;
        }
        if ((i12 & 256) == 0) {
            this.f1934i = "";
        } else {
            this.f1934i = str9;
        }
        if ((i12 & 512) == 0) {
            this.f1935j = "";
        } else {
            this.f1935j = str10;
        }
        if ((i12 & 1024) == 0) {
            this.f1936k = C42784z0.f406748b;
        } else {
            this.f1936k = list;
        }
        if ((i12 & 2048) == 0) {
            this.f1937l = N51.c.a();
        } else {
            this.f1937l = str11;
        }
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f1926a, aVar.f1926a) && L.f(this.f1927b, aVar.f1927b) && L.f(this.f1928c, aVar.f1928c) && L.f(this.f1929d, aVar.f1929d) && L.f(this.f1930e, aVar.f1930e) && L.f(this.f1931f, aVar.f1931f) && L.f(this.f1932g, aVar.f1932g) && L.f(this.f1933h, aVar.f1933h) && L.f(this.f1934i, aVar.f1934i) && L.f(this.f1935j, aVar.f1935j) && L.f(this.f1936k, aVar.f1936k) && L.f(this.f1937l, aVar.f1937l);
    }

    public final int hashCode() {
        return this.f1937l.hashCode() + H.e(AbstractC47961a.a(this.f1935j, AbstractC47961a.a(this.f1934i, AbstractC47961a.a(this.f1933h, AbstractC47961a.a(this.f1932g, AbstractC47961a.a(this.f1931f, AbstractC47961a.a(this.f1930e, AbstractC47961a.a(this.f1929d, AbstractC47961a.a(this.f1928c, AbstractC47961a.a(this.f1927b, this.f1926a.hashCode() * 31))))))))), 31, this.f1936k);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Event(eventAction=");
        sb2.append(this.f1926a);
        sb2.append(", eventType=");
        sb2.append(this.f1927b);
        sb2.append(", geoLatitude=");
        sb2.append(this.f1928c);
        sb2.append(", geoLongitude=");
        sb2.append(this.f1929d);
        sb2.append(", cellularProvider=");
        sb2.append(this.f1930e);
        sb2.append(", batteryLevel=");
        sb2.append(this.f1931f);
        sb2.append(", connectionType=");
        sb2.append(this.f1932g);
        sb2.append(", internalIP=");
        sb2.append(this.f1933h);
        sb2.append(", eventCategory=");
        sb2.append(this.f1934i);
        sb2.append(", value=");
        sb2.append(this.f1935j);
        sb2.append(", properties=");
        sb2.append(this.f1936k);
        sb2.append(", timeStamp=");
        return C22026a.c(sb2, this.f1937l, ')');
    }

    public a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, List list, String str11, int i12, C42822w c42822w) {
        str2 = (i12 & 2) != 0 ? "" : str2;
        str3 = (i12 & 4) != 0 ? "" : str3;
        str4 = (i12 & 8) != 0 ? "" : str4;
        str5 = (i12 & 16) != 0 ? "" : str5;
        str6 = (i12 & 32) != 0 ? "" : str6;
        str7 = (i12 & 64) != 0 ? "" : str7;
        str8 = (i12 & 128) != 0 ? "" : str8;
        str9 = (i12 & 256) != 0 ? "" : str9;
        str10 = (i12 & 512) != 0 ? "" : str10;
        list = (i12 & 1024) != 0 ? C42784z0.f406748b : list;
        str11 = (i12 & 2048) != 0 ? N51.c.a() : str11;
        this.f1926a = str;
        this.f1927b = str2;
        this.f1928c = str3;
        this.f1929d = str4;
        this.f1930e = str5;
        this.f1931f = str6;
        this.f1932g = str7;
        this.f1933h = str8;
        this.f1934i = str9;
        this.f1935j = str10;
        this.f1936k = list;
        this.f1937l = str11;
    }
}
