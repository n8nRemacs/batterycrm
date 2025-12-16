package N41;

import androidx.appcompat.app.r;
import kotlin.jvm.internal.L;

/* loaded from: classes8.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f11194a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f11195b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f11196c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f11197d;

    public /* synthetic */ g() {
        this(null, null, false, null);
    }

    public static g a(g gVar, String str, Integer num, Integer num2, int i12) {
        if ((i12 & 2) != 0) {
            str = gVar.f11194a;
        }
        if ((i12 & 4) != 0) {
            num = gVar.f11195b;
        }
        if ((i12 & 8) != 0) {
            num2 = gVar.f11196c;
        }
        return new g(num, num2, gVar.f11197d, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        gVar.getClass();
        return L.f(null, null) && L.f(this.f11194a, gVar.f11194a) && L.f(this.f11195b, gVar.f11195b) && L.f(this.f11196c, gVar.f11196c) && this.f11197d == gVar.f11197d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        String str = this.f11194a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f11195b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f11196c;
        int iHashCode3 = (iHashCode2 + (num2 != null ? num2.hashCode() : 0)) * 31;
        boolean z12 = this.f11197d;
        int i12 = z12;
        if (z12 != 0) {
            i12 = 1;
        }
        return iHashCode3 + i12;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PartnerProperty(partnerProfileUrl=null, partnerName=");
        sb2.append(this.f11194a);
        sb2.append(", themeColorLight=");
        sb2.append(this.f11195b);
        sb2.append(", themeColorDark=");
        sb2.append(this.f11196c);
        sb2.append(", isShowErrorOnMain=");
        return r.s(")", sb2, this.f11197d);
    }

    public g(Integer num, Integer num2, boolean z12, String str) {
        this.f11194a = str;
        this.f11195b = num;
        this.f11196c = num2;
        this.f11197d = z12;
    }
}
