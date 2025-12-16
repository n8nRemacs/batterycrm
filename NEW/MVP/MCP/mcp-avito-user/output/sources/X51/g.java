package X51;

import java.util.Map;
import java.util.Set;
import kotlin.collections.B0;
import kotlin.jvm.internal.L;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.C43400e0;
import kotlinx.serialization.internal.C43404g0;
import kotlinx.serialization.internal.E0;
import kotlinx.serialization.internal.V0;
import kotlinx.serialization.w;
import s2.AbstractC47961a;

@w
/* loaded from: classes8.dex */
public final class g {

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public static final f f18614l = new f();

    /* renamed from: m, reason: collision with root package name */
    public static final KSerializer[] f18615m;

    /* renamed from: a, reason: collision with root package name */
    public final Set f18616a;

    /* renamed from: b, reason: collision with root package name */
    public final String f18617b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f18618c;

    /* renamed from: d, reason: collision with root package name */
    public final m f18619d;

    /* renamed from: e, reason: collision with root package name */
    public final p f18620e;

    /* renamed from: f, reason: collision with root package name */
    public final String f18621f;

    /* renamed from: g, reason: collision with root package name */
    public final j f18622g;

    /* renamed from: h, reason: collision with root package name */
    public final Set f18623h;

    /* renamed from: i, reason: collision with root package name */
    public final Set f18624i;

    /* renamed from: j, reason: collision with root package name */
    public final Integer f18625j;

    /* renamed from: k, reason: collision with root package name */
    public final Map f18626k;

    static {
        V0 v02 = V0.f412822a;
        f18615m = new KSerializer[]{new C43404g0(v02), null, new C43400e0(v02, v02), null, null, null, null, new C43404g0(v02), new C43404g0(v02), null, new C43400e0(v02, v02)};
    }

    public g(int i12, Set set, String str, Map map, m mVar, p pVar, String str2, j jVar, Set set2, Set set3, Integer num, Map map2) {
        if (1681 != (i12 & 1681)) {
            e.f18612a.getClass();
            E0.b(i12, 1681, e.f18613b);
            throw null;
        }
        this.f18616a = set;
        if ((i12 & 2) == 0) {
            this.f18617b = null;
        } else {
            this.f18617b = str;
        }
        if ((i12 & 4) == 0) {
            this.f18618c = null;
        } else {
            this.f18618c = map;
        }
        if ((i12 & 8) == 0) {
            this.f18619d = null;
        } else {
            this.f18619d = mVar;
        }
        this.f18620e = pVar;
        if ((i12 & 32) == 0) {
            this.f18621f = "browser";
        } else {
            this.f18621f = str2;
        }
        if ((i12 & 64) == 0) {
            this.f18622g = new j(this.f18621f);
        } else {
            this.f18622g = jVar;
        }
        this.f18623h = set2;
        if ((i12 & 256) == 0) {
            this.f18624i = B0.f406639b;
        } else {
            this.f18624i = set3;
        }
        this.f18625j = num;
        this.f18626k = map2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return L.f(this.f18616a, gVar.f18616a) && L.f(this.f18617b, gVar.f18617b) && L.f(this.f18618c, gVar.f18618c) && L.f(this.f18619d, gVar.f18619d) && L.f(this.f18620e, gVar.f18620e) && L.f(this.f18621f, gVar.f18621f) && L.f(this.f18622g, gVar.f18622g) && L.f(this.f18623h, gVar.f18623h) && L.f(this.f18624i, gVar.f18624i) && L.f(this.f18625j, gVar.f18625j) && L.f(this.f18626k, gVar.f18626k);
    }

    public final int hashCode() {
        int iHashCode = this.f18616a.hashCode() * 31;
        String str = this.f18617b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Map map = this.f18618c;
        int iHashCode3 = (iHashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        m mVar = this.f18619d;
        int iG2 = androidx.media3.exoplayer.analytics.m.g(this.f18624i, androidx.media3.exoplayer.analytics.m.g(this.f18623h, AbstractC47961a.a(this.f18622g.f18629a, AbstractC47961a.a(this.f18621f, (this.f18620e.f18639a.hashCode() + ((iHashCode3 + (mVar == null ? 0 : mVar.hashCode())) * 31)) * 31)), 31), 31);
        Integer num = this.f18625j;
        int iHashCode4 = (iG2 + (num == null ? 0 : num.hashCode())) * 31;
        Map map2 = this.f18626k;
        return iHashCode4 + (map2 != null ? map2.hashCode() : 0);
    }

    public final String toString() {
        return "ConfigResponse(blackList=" + this.f18616a + ", sberIDOidcWebUrl=" + this.f18617b + ", oidcUrlMap=" + this.f18618c + ", toggles=" + this.f18619d + ", versionData=" + this.f18620e + ", ssoOpenIn=" + this.f18621f + ", defaults=" + this.f18622g + ", hostWhiteList=" + this.f18623h + ", app2appDialogList=" + this.f18624i + ", updateTimeAppToken=" + this.f18625j + ", updateTimeAppTokenMap=" + this.f18626k + ")";
    }
}
