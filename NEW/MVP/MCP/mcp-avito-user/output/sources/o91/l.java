package O91;

import java.util.ArrayList;

/* loaded from: classes9.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f12052a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f12053b;

    public l(ArrayList arrayList, ArrayList arrayList2) {
        this.f12052a = arrayList;
        this.f12053b = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f12052a.equals(lVar.f12052a) && this.f12053b.equals(lVar.f12053b);
    }

    public final int hashCode() {
        return this.f12053b.hashCode() + (this.f12052a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Data(countries=");
        sb2.append(this.f12052a);
        sb2.append(", documentTypes=");
        return androidx.compose.ui.graphics.colorspace.e.p(sb2, this.f12053b, ')');
    }
}
