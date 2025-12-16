package NP0;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FlexSearchParameter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LNP0/i;", "LNP0/t;", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class i implements t {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final String f11458a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f11459b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f11460c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f11461d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f11462e;

    /* renamed from: f, reason: collision with root package name */
    public final int f11463f;

    /* renamed from: g, reason: collision with root package name */
    public final int f11464g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final ArrayList f11465h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final s f11466i;

    public i(@Y61.l String str, boolean z12, boolean z13, boolean z14, @Y61.l String str2, int i12, int i13, @Y61.k ArrayList arrayList, @Y61.l s sVar) {
        this.f11458a = str;
        this.f11459b = z12;
        this.f11460c = z13;
        this.f11461d = z14;
        this.f11462e = str2;
        this.f11463f = i12;
        this.f11464g = i13;
        this.f11465h = arrayList;
        this.f11466i = sVar;
    }

    public static i a(i iVar, int i12) {
        String str = iVar.f11458a;
        boolean z12 = iVar.f11459b;
        boolean z13 = iVar.f11460c;
        boolean z14 = iVar.f11461d;
        String str2 = iVar.f11462e;
        int i13 = iVar.f11463f;
        ArrayList arrayList = iVar.f11465h;
        s sVar = iVar.f11466i;
        iVar.getClass();
        return new i(str, z12, z13, z14, str2, i13, i12, arrayList, sVar);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return L.f(this.f11458a, iVar.f11458a) && this.f11459b == iVar.f11459b && this.f11460c == iVar.f11460c && this.f11461d == iVar.f11461d && L.f(this.f11462e, iVar.f11462e) && this.f11463f == iVar.f11463f && this.f11464g == iVar.f11464g && this.f11465h.equals(iVar.f11465h) && L.f(this.f11466i, iVar.f11466i);
    }

    public final int hashCode() {
        String str = this.f11458a;
        int i12 = androidx.appcompat.app.r.i(androidx.appcompat.app.r.i(androidx.appcompat.app.r.i((str == null ? 0 : str.hashCode()) * 31, 31, this.f11459b), 31, this.f11460c), 31, this.f11461d);
        String str2 = this.f11462e;
        int iG2 = androidx.compose.ui.graphics.colorspace.e.g(this.f11465h, androidx.appcompat.app.r.e(this.f11464g, androidx.appcompat.app.r.e(this.f11463f, (i12 + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31), 31);
        s sVar = this.f11466i;
        return iG2 + (sVar != null ? sVar.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        return "FlexSearchParameter(id=" + this.f11458a + ", isRequired=" + this.f11459b + ", updatesForm=" + this.f11460c + ", isVisible=" + this.f11461d + ", notSelectedErrorText=" + this.f11462e + ", defaultValue=" + this.f11463f + ", selectedValue=" + this.f11464g + ", options=" + this.f11465h + ", onboarding=" + this.f11466i + ')';
    }
}
