package NP0;

import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AnimalsParameter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LNP0/b;", "LNP0/t;", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class b implements t {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final String f11420a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f11421b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f11422c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f11423d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f11424e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final String f11425f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f11426g;

    public b(@Y61.l String str, boolean z12, boolean z13, boolean z14, @Y61.l String str2, @Y61.l String str3, boolean z15) {
        this.f11420a = str;
        this.f11421b = z12;
        this.f11422c = z13;
        this.f11423d = z14;
        this.f11424e = str2;
        this.f11425f = str3;
        this.f11426g = z15;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return L.f(this.f11420a, bVar.f11420a) && this.f11421b == bVar.f11421b && this.f11422c == bVar.f11422c && this.f11423d == bVar.f11423d && L.f(this.f11424e, bVar.f11424e) && L.f(this.f11425f, bVar.f11425f) && this.f11426g == bVar.f11426g;
    }

    public final int hashCode() {
        String str = this.f11420a;
        int i12 = androidx.appcompat.app.r.i(androidx.appcompat.app.r.i(androidx.appcompat.app.r.i((str == null ? 0 : str.hashCode()) * 31, 31, this.f11421b), 31, this.f11422c), 31, this.f11423d);
        String str2 = this.f11424e;
        int iHashCode = (i12 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f11425f;
        return Boolean.hashCode(this.f11426g) + ((iHashCode + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AnimalsParameter(id=");
        sb2.append(this.f11420a);
        sb2.append(", isRequired=");
        sb2.append(this.f11421b);
        sb2.append(", updatesForm=");
        sb2.append(this.f11422c);
        sb2.append(", isVisible=");
        sb2.append(this.f11423d);
        sb2.append(", notSelectedErrorText=");
        sb2.append(this.f11424e);
        sb2.append(", title=");
        sb2.append(this.f11425f);
        sb2.append(", isSelected=");
        return androidx.appcompat.app.r.x(sb2, this.f11426g, ')');
    }
}
