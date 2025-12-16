package Pb1;

import X41.j;
import Y61.k;
import Y61.l;
import androidx.camera.camera2.internal.G;
import androidx.compose.runtime.internal.P;
import androidx.media3.exoplayer.analytics.m;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LPb1/b;", "", "SberIdSDK_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class b {

    /* renamed from: a, reason: collision with root package name */
    @l
    public Boolean f13155a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public String f13156b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public String f13157c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public String f13158d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public String f13159e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public String f13160f;

    @j
    public b() {
        this(null, null, null, null, null, null, 63, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return L.f(this.f13155a, bVar.f13155a) && L.f(this.f13156b, bVar.f13156b) && L.f(this.f13157c, bVar.f13157c) && L.f(this.f13158d, bVar.f13158d) && L.f(this.f13159e, bVar.f13159e) && L.f(this.f13160f, bVar.f13160f);
    }

    public final int hashCode() {
        Boolean bool = this.f13155a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.f13156b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f13157c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f13158d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f13159e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f13160f;
        return iHashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    @k
    public final String toString() {
        Boolean bool = this.f13155a;
        String str = this.f13156b;
        String str2 = this.f13157c;
        String str3 = this.f13158d;
        String str4 = this.f13159e;
        String str5 = this.f13160f;
        StringBuilder sb2 = new StringBuilder("SberIDResultModel(isSuccess=");
        sb2.append(bool);
        sb2.append(", state=");
        sb2.append(str);
        sb2.append(", nonce=");
        m.p(sb2, str2, ", authCode=", str3, ", errorDescription=");
        return G.h(sb2, str4, ", errorCode=", str5, ")");
    }

    public b(Boolean bool, String str, String str2, String str3, String str4, String str5, int i12, C42822w c42822w) {
        bool = (i12 & 1) != 0 ? null : bool;
        str = (i12 & 2) != 0 ? null : str;
        str2 = (i12 & 4) != 0 ? null : str2;
        str3 = (i12 & 8) != 0 ? null : str3;
        str4 = (i12 & 16) != 0 ? null : str4;
        str5 = (i12 & 32) != 0 ? null : str5;
        this.f13155a = bool;
        this.f13156b = str;
        this.f13157c = str2;
        this.f13158d = str3;
        this.f13159e = str4;
        this.f13160f = str5;
    }
}
