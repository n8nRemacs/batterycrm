package C41;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
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
import kotlinx.serialization.w;
import s2.AbstractC47961a;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0081\b\u0018\u0000 \u00162\u00020\u0001:\u0002\u0017\u0018B\u009d\u0001\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"LC41/d;", "", "", "seen1", "", "apiKey", "platform", "browser", "operationSystem", "operationSystemVersion", "systemLanguage", "deviceVendor", "deviceModel", "screenSize", "deviceMemorySize", "deviceAbi", "applicationName", "timeStamp", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/P0;)V", "Companion", "a", "b", "clickstreamLite"}, k = 1, mv = {1, 8, 0})
@w
/* loaded from: classes8.dex */
public final /* data */ class d {

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f1949a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f1950b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f1951c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f1952d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f1953e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f1954f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final String f1955g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final String f1956h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final String f1957i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final String f1958j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final String f1959k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final String f1960l;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final String f1961m;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"ru/sber/platform/clickstream/clickstreamlite/internal/models/MetaData.$serializer", "Lkotlinx/serialization/internal/N;", "LC41/d;", "<init>", "()V", "clickstreamLite"}, k = 1, mv = {1, 8, 0})
    @InterfaceC42830m
    public static final class a implements N<d> {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f1962a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ PluginGeneratedSerialDescriptor f1963b;

        static {
            a aVar = new a();
            f1962a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.sber.platform.clickstream.clickstreamlite.internal.models.MetaData", aVar, 13);
            pluginGeneratedSerialDescriptor.j("apiKey", true);
            pluginGeneratedSerialDescriptor.j("platform", true);
            pluginGeneratedSerialDescriptor.j("browser", true);
            pluginGeneratedSerialDescriptor.j("operationSystem", true);
            pluginGeneratedSerialDescriptor.j("operationSystemVersion", true);
            pluginGeneratedSerialDescriptor.j("systemLanguage", true);
            pluginGeneratedSerialDescriptor.j("deviceVendor", true);
            pluginGeneratedSerialDescriptor.j("deviceModel", true);
            pluginGeneratedSerialDescriptor.j("screenSize", true);
            pluginGeneratedSerialDescriptor.j("deviceMemorySize", true);
            pluginGeneratedSerialDescriptor.j("deviceAbi", true);
            pluginGeneratedSerialDescriptor.j("applicationName", true);
            pluginGeneratedSerialDescriptor.j("timeStamp", true);
            f1963b = pluginGeneratedSerialDescriptor;
        }

        @Override // kotlinx.serialization.internal.N
        @k
        public final KSerializer<?>[] childSerializers() {
            V0 v02 = V0.f412822a;
            return new KSerializer[]{v02, v02, v02, v02, v02, v02, v02, v02, v02, v02, v02, v02, v02};
        }

        @Override // kotlinx.serialization.InterfaceC43386e
        public final Object deserialize(Decoder decoder) {
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f1963b;
            kotlinx.serialization.encoding.c cVarC = decoder.c(pluginGeneratedSerialDescriptor);
            int i12 = 0;
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
            String strS12 = null;
            String strS13 = null;
            boolean z12 = true;
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
                        strS11 = cVarC.s(pluginGeneratedSerialDescriptor, 10);
                        i12 |= 1024;
                        break;
                    case 11:
                        strS12 = cVarC.s(pluginGeneratedSerialDescriptor, 11);
                        i12 |= 2048;
                        break;
                    case 12:
                        strS13 = cVarC.s(pluginGeneratedSerialDescriptor, 12);
                        i12 |= 4096;
                        break;
                    default:
                        throw new UnknownFieldException(iJ2);
                }
            }
            cVarC.d(pluginGeneratedSerialDescriptor);
            return new d(i12, strS, strS2, strS3, strS4, strS5, strS6, strS7, strS8, strS9, strS10, strS11, strS12, strS13, (P0) null);
        }

        @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
        @k
        /* renamed from: getDescriptor */
        public final SerialDescriptor getF412706c() {
            return f1963b;
        }

        @Override // kotlinx.serialization.x
        public final void serialize(Encoder encoder, Object obj) {
            d dVar = (d) obj;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f1963b;
            kotlinx.serialization.encoding.d dVarC = encoder.c(pluginGeneratedSerialDescriptor);
            Companion companion = d.INSTANCE;
            boolean zU2 = dVarC.u();
            String str = dVar.f1949a;
            if (zU2 || !L.f(str, "")) {
                dVarC.l(pluginGeneratedSerialDescriptor, 0, str);
            }
            boolean zU3 = dVarC.u();
            String str2 = dVar.f1950b;
            if (zU3 || !L.f(str2, "")) {
                dVarC.l(pluginGeneratedSerialDescriptor, 1, str2);
            }
            boolean zU4 = dVarC.u();
            String str3 = dVar.f1951c;
            if (zU4 || !L.f(str3, "")) {
                dVarC.l(pluginGeneratedSerialDescriptor, 2, str3);
            }
            boolean zU5 = dVarC.u();
            String str4 = dVar.f1952d;
            if (zU5 || !L.f(str4, "")) {
                dVarC.l(pluginGeneratedSerialDescriptor, 3, str4);
            }
            boolean zU6 = dVarC.u();
            String str5 = dVar.f1953e;
            if (zU6 || !L.f(str5, "")) {
                dVarC.l(pluginGeneratedSerialDescriptor, 4, str5);
            }
            boolean zU7 = dVarC.u();
            String str6 = dVar.f1954f;
            if (zU7 || !L.f(str6, "")) {
                dVarC.l(pluginGeneratedSerialDescriptor, 5, str6);
            }
            boolean zU8 = dVarC.u();
            String str7 = dVar.f1955g;
            if (zU8 || !L.f(str7, "")) {
                dVarC.l(pluginGeneratedSerialDescriptor, 6, str7);
            }
            boolean zU9 = dVarC.u();
            String str8 = dVar.f1956h;
            if (zU9 || !L.f(str8, "")) {
                dVarC.l(pluginGeneratedSerialDescriptor, 7, str8);
            }
            boolean zU10 = dVarC.u();
            String str9 = dVar.f1957i;
            if (zU10 || !L.f(str9, "")) {
                dVarC.l(pluginGeneratedSerialDescriptor, 8, str9);
            }
            boolean zU11 = dVarC.u();
            String str10 = dVar.f1958j;
            if (zU11 || !L.f(str10, "")) {
                dVarC.l(pluginGeneratedSerialDescriptor, 9, str10);
            }
            boolean zU12 = dVarC.u();
            String str11 = dVar.f1959k;
            if (zU12 || !L.f(str11, "")) {
                dVarC.l(pluginGeneratedSerialDescriptor, 10, str11);
            }
            boolean zU13 = dVarC.u();
            String str12 = dVar.f1960l;
            if (zU13 || !L.f(str12, "")) {
                dVarC.l(pluginGeneratedSerialDescriptor, 11, str12);
            }
            boolean zU14 = dVarC.u();
            String str13 = dVar.f1961m;
            if (zU14 || !L.f(str13, N51.c.a())) {
                dVarC.l(pluginGeneratedSerialDescriptor, 12, str13);
            }
            dVarC.d(pluginGeneratedSerialDescriptor);
        }

        @Override // kotlinx.serialization.internal.N
        @k
        public final KSerializer<?>[] typeParametersSerializers() {
            return G0.f412773a;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LC41/d$b;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "LC41/d;", "serializer", "()Lkotlinx/serialization/KSerializer;", "clickstreamLite"}, k = 1, mv = {1, 8, 0})
    /* renamed from: C41.d$b, reason: from kotlin metadata */
    public static final class Companion {
        public Companion() {
        }

        @k
        public final KSerializer<d> serializer() {
            return a.f1962a;
        }

        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }
    }

    public d() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 8191, (C42822w) null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f1949a, dVar.f1949a) && L.f(this.f1950b, dVar.f1950b) && L.f(this.f1951c, dVar.f1951c) && L.f(this.f1952d, dVar.f1952d) && L.f(this.f1953e, dVar.f1953e) && L.f(this.f1954f, dVar.f1954f) && L.f(this.f1955g, dVar.f1955g) && L.f(this.f1956h, dVar.f1956h) && L.f(this.f1957i, dVar.f1957i) && L.f(this.f1958j, dVar.f1958j) && L.f(this.f1959k, dVar.f1959k) && L.f(this.f1960l, dVar.f1960l) && L.f(this.f1961m, dVar.f1961m);
    }

    public final int hashCode() {
        return this.f1961m.hashCode() + AbstractC47961a.a(this.f1960l, AbstractC47961a.a(this.f1959k, AbstractC47961a.a(this.f1958j, AbstractC47961a.a(this.f1957i, AbstractC47961a.a(this.f1956h, AbstractC47961a.a(this.f1955g, AbstractC47961a.a(this.f1954f, AbstractC47961a.a(this.f1953e, AbstractC47961a.a(this.f1952d, AbstractC47961a.a(this.f1951c, AbstractC47961a.a(this.f1950b, this.f1949a.hashCode() * 31)))))))))));
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MetaData(apiKey=");
        sb2.append(this.f1949a);
        sb2.append(", platform=");
        sb2.append(this.f1950b);
        sb2.append(", browser=");
        sb2.append(this.f1951c);
        sb2.append(", operationSystem=");
        sb2.append(this.f1952d);
        sb2.append(", operationSystemVersion=");
        sb2.append(this.f1953e);
        sb2.append(", systemLanguage=");
        sb2.append(this.f1954f);
        sb2.append(", deviceVendor=");
        sb2.append(this.f1955g);
        sb2.append(", deviceModel=");
        sb2.append(this.f1956h);
        sb2.append(", screenSize=");
        sb2.append(this.f1957i);
        sb2.append(", deviceMemorySize=");
        sb2.append(this.f1958j);
        sb2.append(", deviceAbi=");
        sb2.append(this.f1959k);
        sb2.append(", applicationName=");
        sb2.append(this.f1960l);
        sb2.append(", timeStamp=");
        return C22026a.c(sb2, this.f1961m, ')');
    }

    @InterfaceC42830m
    public /* synthetic */ d(int i12, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, P0 p02) {
        if ((i12 & 1) == 0) {
            this.f1949a = "";
        } else {
            this.f1949a = str;
        }
        if ((i12 & 2) == 0) {
            this.f1950b = "";
        } else {
            this.f1950b = str2;
        }
        if ((i12 & 4) == 0) {
            this.f1951c = "";
        } else {
            this.f1951c = str3;
        }
        if ((i12 & 8) == 0) {
            this.f1952d = "";
        } else {
            this.f1952d = str4;
        }
        if ((i12 & 16) == 0) {
            this.f1953e = "";
        } else {
            this.f1953e = str5;
        }
        if ((i12 & 32) == 0) {
            this.f1954f = "";
        } else {
            this.f1954f = str6;
        }
        if ((i12 & 64) == 0) {
            this.f1955g = "";
        } else {
            this.f1955g = str7;
        }
        if ((i12 & 128) == 0) {
            this.f1956h = "";
        } else {
            this.f1956h = str8;
        }
        if ((i12 & 256) == 0) {
            this.f1957i = "";
        } else {
            this.f1957i = str9;
        }
        if ((i12 & 512) == 0) {
            this.f1958j = "";
        } else {
            this.f1958j = str10;
        }
        if ((i12 & 1024) == 0) {
            this.f1959k = "";
        } else {
            this.f1959k = str11;
        }
        if ((i12 & 2048) == 0) {
            this.f1960l = "";
        } else {
            this.f1960l = str12;
        }
        this.f1961m = (i12 & 4096) == 0 ? N51.c.a() : str13;
    }

    public d(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, int i12, C42822w c42822w) {
        String str14 = (i12 & 1) != 0 ? "" : str;
        String str15 = (i12 & 2) != 0 ? "" : str2;
        String str16 = (i12 & 4) != 0 ? "" : str3;
        String str17 = (i12 & 8) != 0 ? "" : str4;
        String str18 = (i12 & 16) != 0 ? "" : str5;
        String str19 = (i12 & 32) != 0 ? "" : str6;
        String str20 = (i12 & 64) != 0 ? "" : str7;
        String str21 = (i12 & 128) != 0 ? "" : str8;
        String str22 = (i12 & 256) != 0 ? "" : str9;
        String str23 = (i12 & 512) != 0 ? "" : str10;
        String str24 = (i12 & 1024) != 0 ? "" : str11;
        String str25 = (i12 & 2048) == 0 ? str12 : "";
        String strA = (i12 & 4096) != 0 ? N51.c.a() : str13;
        this.f1949a = str14;
        this.f1950b = str15;
        this.f1951c = str16;
        this.f1952d = str17;
        this.f1953e = str18;
        this.f1954f = str19;
        this.f1955g = str20;
        this.f1956h = str21;
        this.f1957i = str22;
        this.f1958j = str23;
        this.f1959k = str24;
        this.f1960l = str25;
        this.f1961m = strA;
    }
}
