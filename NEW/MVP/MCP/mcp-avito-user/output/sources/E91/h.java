package E91;

import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import java.util.List;
import kotlin.jvm.internal.L;

/* loaded from: classes9.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f3851a;

    /* renamed from: b, reason: collision with root package name */
    public final float f3852b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3853c;

    /* renamed from: d, reason: collision with root package name */
    public final String f3854d;

    /* renamed from: e, reason: collision with root package name */
    public final String f3855e;

    /* renamed from: f, reason: collision with root package name */
    public final String f3856f;

    /* renamed from: g, reason: collision with root package name */
    public final String f3857g;

    /* renamed from: h, reason: collision with root package name */
    public final String f3858h;

    /* renamed from: i, reason: collision with root package name */
    public final List f3859i;

    public h(String str, float f12, int i12, String str2, String str3, String str4, String str5, String str6, List list) {
        this.f3851a = str;
        this.f3852b = f12;
        this.f3853c = i12;
        this.f3854d = str2;
        this.f3855e = str3;
        this.f3856f = str4;
        this.f3857g = str5;
        this.f3858h = str6;
        this.f3859i = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return L.f(this.f3851a, hVar.f3851a) && Float.compare(this.f3852b, hVar.f3852b) == 0 && this.f3853c == hVar.f3853c && L.f(this.f3854d, hVar.f3854d) && L.f(this.f3855e, hVar.f3855e) && L.f(this.f3856f, hVar.f3856f) && L.f(this.f3857g, hVar.f3857g) && L.f(this.f3858h, hVar.f3858h) && L.f(this.f3859i, hVar.f3859i);
    }

    public final int hashCode() {
        int iE2 = r.e(this.f3853c, r.d(this.f3852b, this.f3851a.hashCode() * 31, 31), 31);
        String str = this.f3854d;
        int iHashCode = (iE2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f3855e;
        int iD2 = H.d((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f3856f);
        String str3 = this.f3857g;
        int iHashCode2 = (iD2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f3858h;
        int iHashCode3 = (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List list = this.f3859i;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PhotoCaptureState(type=");
        sb2.append(this.f3851a);
        sb2.append(", ratio=");
        sb2.append(this.f3852b);
        sb2.append(", photoCount=");
        sb2.append(this.f3853c);
        sb2.append(", navBarText=");
        sb2.append(this.f3854d);
        sb2.append(", textPrimary=");
        sb2.append(this.f3855e);
        sb2.append(", textSecondary=");
        sb2.append(this.f3856f);
        sb2.append(", textSuccess=");
        sb2.append(this.f3857g);
        sb2.append(", textProcessing=");
        sb2.append(this.f3858h);
        sb2.append(", recommendations=");
        return H.p(sb2, this.f3859i, ')');
    }
}
