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
import kotlinx.serialization.internal.E0;
import kotlinx.serialization.internal.G0;
import kotlinx.serialization.internal.N;
import kotlinx.serialization.internal.P0;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.V0;
import kotlinx.serialization.w;
import s2.AbstractC47961a;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0081\b\u0018\u0000 \u00172\u00020\u0001:\u0002\u0018\u0019B§\u0001\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"LC41/e;", "", "", "seen1", "", "deviceId", "applicationLanguage", "clientBlock", "sessionId", "partnerId", "appId", "sapId", "subId", "adId", "hashEfsId", "appVersion", "appVersionNumber", "hashEpkId", "hashUserLoginId", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/P0;)V", "Companion", "a", "b", "clickstreamLite"}, k = 1, mv = {1, 8, 0})
@w
/* loaded from: classes8.dex */
public final /* data */ class e {

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f1964a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f1965b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f1966c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f1967d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f1968e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f1969f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final String f1970g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final String f1971h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final String f1972i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final String f1973j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final String f1974k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final String f1975l;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final String f1976m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final String f1977n;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"ru/sber/platform/clickstream/clickstreamlite/internal/models/ProfileData.$serializer", "Lkotlinx/serialization/internal/N;", "LC41/e;", "<init>", "()V", "clickstreamLite"}, k = 1, mv = {1, 8, 0})
    @InterfaceC42830m
    public static final class a implements N<e> {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f1978a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ PluginGeneratedSerialDescriptor f1979b;

        static {
            a aVar = new a();
            f1978a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.sber.platform.clickstream.clickstreamlite.internal.models.ProfileData", aVar, 14);
            pluginGeneratedSerialDescriptor.j("deviceId", false);
            pluginGeneratedSerialDescriptor.j("applicationLanguage", false);
            pluginGeneratedSerialDescriptor.j("clientBlock", true);
            pluginGeneratedSerialDescriptor.j("sessionId", true);
            pluginGeneratedSerialDescriptor.j("partnerId", true);
            pluginGeneratedSerialDescriptor.j("appId", true);
            pluginGeneratedSerialDescriptor.j("sapId", true);
            pluginGeneratedSerialDescriptor.j("subId", true);
            pluginGeneratedSerialDescriptor.j("adId", true);
            pluginGeneratedSerialDescriptor.j("hashEfsId", true);
            pluginGeneratedSerialDescriptor.j("appVersion", true);
            pluginGeneratedSerialDescriptor.j("appVersionNumber", true);
            pluginGeneratedSerialDescriptor.j("hashEpkId", true);
            pluginGeneratedSerialDescriptor.j("hashUserLoginId", true);
            f1979b = pluginGeneratedSerialDescriptor;
        }

        @Override // kotlinx.serialization.internal.N
        @k
        public final KSerializer<?>[] childSerializers() {
            V0 v02 = V0.f412822a;
            return new KSerializer[]{v02, v02, v02, v02, v02, v02, v02, v02, v02, v02, v02, v02, v02, v02};
        }

        @Override // kotlinx.serialization.InterfaceC43386e
        public final Object deserialize(Decoder decoder) {
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f1979b;
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
            String strS14 = null;
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
                    case 13:
                        strS14 = cVarC.s(pluginGeneratedSerialDescriptor, 13);
                        i12 |= 8192;
                        break;
                    default:
                        throw new UnknownFieldException(iJ2);
                }
            }
            cVarC.d(pluginGeneratedSerialDescriptor);
            return new e(i12, strS, strS2, strS3, strS4, strS5, strS6, strS7, strS8, strS9, strS10, strS11, strS12, strS13, strS14, (P0) null);
        }

        @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
        @k
        /* renamed from: getDescriptor */
        public final SerialDescriptor getF412706c() {
            return f1979b;
        }

        @Override // kotlinx.serialization.x
        public final void serialize(Encoder encoder, Object obj) {
            e eVar = (e) obj;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f1979b;
            kotlinx.serialization.encoding.d dVarC = encoder.c(pluginGeneratedSerialDescriptor);
            dVarC.l(pluginGeneratedSerialDescriptor, 0, eVar.f1964a);
            dVarC.l(pluginGeneratedSerialDescriptor, 1, eVar.f1965b);
            boolean zU2 = dVarC.u();
            String str = eVar.f1966c;
            if (zU2 || !L.f(str, "")) {
                dVarC.l(pluginGeneratedSerialDescriptor, 2, str);
            }
            boolean zU3 = dVarC.u();
            String str2 = eVar.f1967d;
            if (zU3 || !L.f(str2, "")) {
                dVarC.l(pluginGeneratedSerialDescriptor, 3, str2);
            }
            boolean zU4 = dVarC.u();
            String str3 = eVar.f1968e;
            if (zU4 || !L.f(str3, "")) {
                dVarC.l(pluginGeneratedSerialDescriptor, 4, str3);
            }
            boolean zU5 = dVarC.u();
            String str4 = eVar.f1969f;
            if (zU5 || !L.f(str4, "")) {
                dVarC.l(pluginGeneratedSerialDescriptor, 5, str4);
            }
            boolean zU6 = dVarC.u();
            String str5 = eVar.f1970g;
            if (zU6 || !L.f(str5, "")) {
                dVarC.l(pluginGeneratedSerialDescriptor, 6, str5);
            }
            boolean zU7 = dVarC.u();
            String str6 = eVar.f1971h;
            if (zU7 || !L.f(str6, "")) {
                dVarC.l(pluginGeneratedSerialDescriptor, 7, str6);
            }
            boolean zU8 = dVarC.u();
            String str7 = eVar.f1972i;
            if (zU8 || !L.f(str7, "")) {
                dVarC.l(pluginGeneratedSerialDescriptor, 8, str7);
            }
            boolean zU9 = dVarC.u();
            String str8 = eVar.f1973j;
            if (zU9 || !L.f(str8, "")) {
                dVarC.l(pluginGeneratedSerialDescriptor, 9, str8);
            }
            boolean zU10 = dVarC.u();
            String str9 = eVar.f1974k;
            if (zU10 || !L.f(str9, "")) {
                dVarC.l(pluginGeneratedSerialDescriptor, 10, str9);
            }
            boolean zU11 = dVarC.u();
            String str10 = eVar.f1975l;
            if (zU11 || !L.f(str10, "")) {
                dVarC.l(pluginGeneratedSerialDescriptor, 11, str10);
            }
            boolean zU12 = dVarC.u();
            String str11 = eVar.f1976m;
            if (zU12 || !L.f(str11, "")) {
                dVarC.l(pluginGeneratedSerialDescriptor, 12, str11);
            }
            boolean zU13 = dVarC.u();
            String str12 = eVar.f1977n;
            if (zU13 || !L.f(str12, "")) {
                dVarC.l(pluginGeneratedSerialDescriptor, 13, str12);
            }
            dVarC.d(pluginGeneratedSerialDescriptor);
        }

        @Override // kotlinx.serialization.internal.N
        @k
        public final KSerializer<?>[] typeParametersSerializers() {
            return G0.f412773a;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LC41/e$b;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "LC41/e;", "serializer", "()Lkotlinx/serialization/KSerializer;", "clickstreamLite"}, k = 1, mv = {1, 8, 0})
    /* renamed from: C41.e$b, reason: from kotlin metadata */
    public static final class Companion {
        public Companion() {
        }

        @k
        public final KSerializer<e> serializer() {
            return a.f1978a;
        }

        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }
    }

    @InterfaceC42830m
    public e(int i12, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, P0 p02) {
        if (3 != (i12 & 3)) {
            a.f1978a.getClass();
            E0.b(i12, 3, a.f1979b);
            throw null;
        }
        this.f1964a = str;
        this.f1965b = str2;
        if ((i12 & 4) == 0) {
            this.f1966c = "";
        } else {
            this.f1966c = str3;
        }
        if ((i12 & 8) == 0) {
            this.f1967d = "";
        } else {
            this.f1967d = str4;
        }
        if ((i12 & 16) == 0) {
            this.f1968e = "";
        } else {
            this.f1968e = str5;
        }
        if ((i12 & 32) == 0) {
            this.f1969f = "";
        } else {
            this.f1969f = str6;
        }
        if ((i12 & 64) == 0) {
            this.f1970g = "";
        } else {
            this.f1970g = str7;
        }
        if ((i12 & 128) == 0) {
            this.f1971h = "";
        } else {
            this.f1971h = str8;
        }
        if ((i12 & 256) == 0) {
            this.f1972i = "";
        } else {
            this.f1972i = str9;
        }
        if ((i12 & 512) == 0) {
            this.f1973j = "";
        } else {
            this.f1973j = str10;
        }
        if ((i12 & 1024) == 0) {
            this.f1974k = "";
        } else {
            this.f1974k = str11;
        }
        if ((i12 & 2048) == 0) {
            this.f1975l = "";
        } else {
            this.f1975l = str12;
        }
        if ((i12 & 4096) == 0) {
            this.f1976m = "";
        } else {
            this.f1976m = str13;
        }
        if ((i12 & 8192) == 0) {
            this.f1977n = "";
        } else {
            this.f1977n = str14;
        }
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return L.f(this.f1964a, eVar.f1964a) && L.f(this.f1965b, eVar.f1965b) && L.f(this.f1966c, eVar.f1966c) && L.f(this.f1967d, eVar.f1967d) && L.f(this.f1968e, eVar.f1968e) && L.f(this.f1969f, eVar.f1969f) && L.f(this.f1970g, eVar.f1970g) && L.f(this.f1971h, eVar.f1971h) && L.f(this.f1972i, eVar.f1972i) && L.f(this.f1973j, eVar.f1973j) && L.f(this.f1974k, eVar.f1974k) && L.f(this.f1975l, eVar.f1975l) && L.f(this.f1976m, eVar.f1976m) && L.f(this.f1977n, eVar.f1977n);
    }

    public final int hashCode() {
        return this.f1977n.hashCode() + AbstractC47961a.a(this.f1976m, AbstractC47961a.a(this.f1975l, AbstractC47961a.a(this.f1974k, AbstractC47961a.a(this.f1973j, AbstractC47961a.a(this.f1972i, AbstractC47961a.a(this.f1971h, AbstractC47961a.a(this.f1970g, AbstractC47961a.a(this.f1969f, AbstractC47961a.a(this.f1968e, AbstractC47961a.a(this.f1967d, AbstractC47961a.a(this.f1966c, AbstractC47961a.a(this.f1965b, this.f1964a.hashCode() * 31))))))))))));
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ProfileData(deviceId=");
        sb2.append(this.f1964a);
        sb2.append(", applicationLanguage=");
        sb2.append(this.f1965b);
        sb2.append(", clientBlock=");
        sb2.append(this.f1966c);
        sb2.append(", sessionId=");
        sb2.append(this.f1967d);
        sb2.append(", partnerId=");
        sb2.append(this.f1968e);
        sb2.append(", appId=");
        sb2.append(this.f1969f);
        sb2.append(", sapId=");
        sb2.append(this.f1970g);
        sb2.append(", subId=");
        sb2.append(this.f1971h);
        sb2.append(", adId=");
        sb2.append(this.f1972i);
        sb2.append(", hashEfsId=");
        sb2.append(this.f1973j);
        sb2.append(", appVersion=");
        sb2.append(this.f1974k);
        sb2.append(", appVersionNumber=");
        sb2.append(this.f1975l);
        sb2.append(", hashEpkId=");
        sb2.append(this.f1976m);
        sb2.append(", hashUserLoginId=");
        return C22026a.c(sb2, this.f1977n, ')');
    }

    public e(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, int i12, C42822w c42822w) {
        String str15 = (i12 & 4) != 0 ? "" : str3;
        String str16 = (i12 & 8) != 0 ? "" : str4;
        String str17 = (i12 & 16) != 0 ? "" : str5;
        String str18 = (i12 & 32) != 0 ? "" : str6;
        String str19 = (i12 & 64) != 0 ? "" : str7;
        String str20 = (i12 & 128) != 0 ? "" : str8;
        String str21 = (i12 & 256) != 0 ? "" : str9;
        String str22 = (i12 & 512) != 0 ? "" : str10;
        String str23 = (i12 & 1024) != 0 ? "" : str11;
        String str24 = (i12 & 2048) != 0 ? "" : str12;
        String str25 = (i12 & 4096) != 0 ? "" : str13;
        String str26 = (i12 & 8192) == 0 ? str14 : "";
        this.f1964a = str;
        this.f1965b = str2;
        this.f1966c = str15;
        this.f1967d = str16;
        this.f1968e = str17;
        this.f1969f = str18;
        this.f1970g = str19;
        this.f1971h = str20;
        this.f1972i = str21;
        this.f1973j = str22;
        this.f1974k = str23;
        this.f1975l = str24;
        this.f1976m = str25;
        this.f1977n = str26;
    }
}
