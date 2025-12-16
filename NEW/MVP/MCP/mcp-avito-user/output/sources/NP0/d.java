package NP0;

import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CategoryParameter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LNP0/d;", "LNP0/t;", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class d implements t {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final String f11432a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f11433b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f11434c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f11435d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f11436e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final List<c> f11437f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final List<c> f11438g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f11439h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final String f11440i;

    public d(@Y61.l String str, boolean z12, boolean z13, boolean z14, @Y61.l String str2, @Y61.k List<c> list, @Y61.k List<c> list2, boolean z15, @Y61.l String str3) {
        this.f11432a = str;
        this.f11433b = z12;
        this.f11434c = z13;
        this.f11435d = z14;
        this.f11436e = str2;
        this.f11437f = list;
        this.f11438g = list2;
        this.f11439h = z15;
        this.f11440i = str3;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f11432a, dVar.f11432a) && this.f11433b == dVar.f11433b && this.f11434c == dVar.f11434c && this.f11435d == dVar.f11435d && L.f(this.f11436e, dVar.f11436e) && L.f(this.f11437f, dVar.f11437f) && L.f(this.f11438g, dVar.f11438g) && this.f11439h == dVar.f11439h && L.f(this.f11440i, dVar.f11440i);
    }

    public final int hashCode() {
        String str = this.f11432a;
        int i12 = androidx.appcompat.app.r.i(androidx.appcompat.app.r.i(androidx.appcompat.app.r.i((str == null ? 0 : str.hashCode()) * 31, 31, this.f11433b), 31, this.f11434c), 31, this.f11435d);
        String str2 = this.f11436e;
        int i13 = androidx.appcompat.app.r.i(H.e(H.e((i12 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f11437f), 31, this.f11438g), 31, this.f11439h);
        String str3 = this.f11440i;
        return i13 + (str3 != null ? str3.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CategoryParameter(id=");
        sb2.append(this.f11432a);
        sb2.append(", isRequired=");
        sb2.append(this.f11433b);
        sb2.append(", updatesForm=");
        sb2.append(this.f11434c);
        sb2.append(", isVisible=");
        sb2.append(this.f11435d);
        sb2.append(", notSelectedErrorText=");
        sb2.append(this.f11436e);
        sb2.append(", categories=");
        sb2.append(this.f11437f);
        sb2.append(", selectedCategories=");
        sb2.append(this.f11438g);
        sb2.append(", isMultiselect=");
        sb2.append(this.f11439h);
        sb2.append(", hintText=");
        return C22026a.c(sb2, this.f11440i, ')');
    }
}
