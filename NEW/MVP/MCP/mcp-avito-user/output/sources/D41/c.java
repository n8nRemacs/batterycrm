package D41;

import X51.j;
import X51.m;
import X51.p;
import Y61.k;
import androidx.appcompat.app.r;
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
import sberid.sdk.global.models.StandName;

@w
/* loaded from: classes8.dex */
public final class c {

    /* renamed from: n, reason: collision with root package name */
    @k
    public static final b f2914n = new b();

    /* renamed from: o, reason: collision with root package name */
    public static final KSerializer[] f2915o;

    /* renamed from: a, reason: collision with root package name */
    public final Set f2916a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2917b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f2918c;

    /* renamed from: d, reason: collision with root package name */
    public final m f2919d;

    /* renamed from: e, reason: collision with root package name */
    public final p f2920e;

    /* renamed from: f, reason: collision with root package name */
    public final String f2921f;

    /* renamed from: g, reason: collision with root package name */
    public final j f2922g;

    /* renamed from: h, reason: collision with root package name */
    public final Set f2923h;

    /* renamed from: i, reason: collision with root package name */
    public final Set f2924i;

    /* renamed from: j, reason: collision with root package name */
    public final Integer f2925j;

    /* renamed from: k, reason: collision with root package name */
    public final Map f2926k;

    /* renamed from: l, reason: collision with root package name */
    public final long f2927l;

    /* renamed from: m, reason: collision with root package name */
    public final StandName f2928m;

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.C] */
    static {
        V0 v02 = V0.f412822a;
        C43404g0 c43404g0 = new C43404g0(v02);
        C43400e0 c43400e0 = new C43400e0(v02, v02);
        C43404g0 c43404g02 = new C43404g0(v02);
        C43404g0 c43404g03 = new C43404g0(v02);
        C43400e0 c43400e02 = new C43400e0(v02, v02);
        StandName.f437762c.getClass();
        f2915o = new KSerializer[]{c43404g0, null, c43400e0, null, null, null, null, c43404g02, c43404g03, null, c43400e02, null, (KSerializer) StandName.f437763d.getValue()};
    }

    public c(int i12, Set set, String str, Map map, m mVar, p pVar, String str2, j jVar, Set set2, Set set3, Integer num, Map map2, long j12, StandName standName) {
        if (1681 != (i12 & 1681)) {
            a.f2912a.getClass();
            E0.b(i12, 1681, a.f2913b);
            throw null;
        }
        this.f2916a = set;
        if ((i12 & 2) == 0) {
            this.f2917b = null;
        } else {
            this.f2917b = str;
        }
        if ((i12 & 4) == 0) {
            this.f2918c = null;
        } else {
            this.f2918c = map;
        }
        if ((i12 & 8) == 0) {
            this.f2919d = null;
        } else {
            this.f2919d = mVar;
        }
        this.f2920e = pVar;
        this.f2921f = (i12 & 32) == 0 ? "browser" : str2;
        this.f2922g = (i12 & 64) == 0 ? new j(this.f2921f) : jVar;
        this.f2923h = set2;
        this.f2924i = (i12 & 256) == 0 ? B0.f406639b : set3;
        this.f2925j = num;
        this.f2926k = map2;
        this.f2927l = (i12 & 2048) == 0 ? -1L : j12;
        this.f2928m = (i12 & 4096) == 0 ? StandName.f437764e : standName;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f2916a, cVar.f2916a) && L.f(this.f2917b, cVar.f2917b) && L.f(this.f2918c, cVar.f2918c) && L.f(this.f2919d, cVar.f2919d) && L.f(this.f2920e, cVar.f2920e) && L.f(this.f2921f, cVar.f2921f) && L.f(this.f2922g, cVar.f2922g) && L.f(this.f2923h, cVar.f2923h) && L.f(this.f2924i, cVar.f2924i) && L.f(this.f2925j, cVar.f2925j) && L.f(this.f2926k, cVar.f2926k) && this.f2927l == cVar.f2927l && this.f2928m == cVar.f2928m;
    }

    public final int hashCode() {
        int iHashCode = this.f2916a.hashCode() * 31;
        String str = this.f2917b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Map map = this.f2918c;
        int iHashCode3 = (iHashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        m mVar = this.f2919d;
        int iG2 = androidx.media3.exoplayer.analytics.m.g(this.f2924i, androidx.media3.exoplayer.analytics.m.g(this.f2923h, AbstractC47961a.a(this.f2922g.f18629a, AbstractC47961a.a(this.f2921f, (this.f2920e.f18639a.hashCode() + ((iHashCode3 + (mVar == null ? 0 : mVar.hashCode())) * 31)) * 31)), 31), 31);
        Integer num = this.f2925j;
        int iHashCode4 = (iG2 + (num == null ? 0 : num.hashCode())) * 31;
        Map map2 = this.f2926k;
        return this.f2928m.hashCode() + r.g((iHashCode4 + (map2 != null ? map2.hashCode() : 0)) * 31, 31, this.f2927l);
    }

    public final String toString() {
        return "ConfigEntity(blackList=" + this.f2916a + ", sberIDOidcWebUrl=" + this.f2917b + ", oidcUrlMap=" + this.f2918c + ", toggles=" + this.f2919d + ", versionData=" + this.f2920e + ", ssoOpenIn=" + this.f2921f + ", defaults=" + this.f2922g + ", hostWhiteList=" + this.f2923h + ", app2appDialogList=" + this.f2924i + ", updateTimeAppToken=" + this.f2925j + ", updateTimeAppTokenMap=" + this.f2926k + ", cacheTime=" + this.f2927l + ", stand=" + this.f2928m + ")";
    }

    public c(Set set, String str, Map map, m mVar, p pVar, String str2, j jVar, Set set2, Set set3, Integer num, Map map2, long j12, StandName standName) {
        this.f2916a = set;
        this.f2917b = str;
        this.f2918c = map;
        this.f2919d = mVar;
        this.f2920e = pVar;
        this.f2921f = str2;
        this.f2922g = jVar;
        this.f2923h = set2;
        this.f2924i = set3;
        this.f2925j = num;
        this.f2926k = map2;
        this.f2927l = j12;
        this.f2928m = standName;
    }
}
