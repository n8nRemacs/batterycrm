package NP0;

import androidx.compose.foundation.H;
import androidx.media3.common.C23088b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: LocationParameter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LNP0/m;", "LNP0/t;", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class m implements t {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final String f11492a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f11493b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f11494c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f11495d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f11496e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final String f11497f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final String f11498g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final l f11499h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final ArrayList f11500i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final Object f11501j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final List<o> f11502k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f11503l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final p f11504m;

    public m(@Y61.l String str, boolean z12, boolean z13, boolean z14, @Y61.l String str2, @Y61.l String str3, @Y61.l String str4, @Y61.l l lVar, @Y61.k ArrayList arrayList, @Y61.k List list, @Y61.k List list2, boolean z15, @Y61.k p pVar) {
        this.f11492a = str;
        this.f11493b = z12;
        this.f11494c = z13;
        this.f11495d = z14;
        this.f11496e = str2;
        this.f11497f = str3;
        this.f11498g = str4;
        this.f11499h = lVar;
        this.f11500i = arrayList;
        this.f11501j = list;
        this.f11502k = list2;
        this.f11503l = z15;
        this.f11504m = pVar;
    }

    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, java.util.List] */
    public static m a(m mVar, String str, l lVar, List list, boolean z12, p pVar, int i12) {
        String str2 = mVar.f11492a;
        boolean z13 = mVar.f11493b;
        boolean z14 = mVar.f11494c;
        boolean z15 = mVar.f11495d;
        String str3 = mVar.f11496e;
        String str4 = (i12 & 32) != 0 ? mVar.f11497f : str;
        String str5 = mVar.f11498g;
        l lVar2 = (i12 & 128) != 0 ? mVar.f11499h : lVar;
        ArrayList arrayList = mVar.f11500i;
        ?? r112 = mVar.f11501j;
        List list2 = (i12 & 1024) != 0 ? mVar.f11502k : list;
        boolean z16 = (i12 & 2048) != 0 ? mVar.f11503l : z12;
        p pVar2 = (i12 & 4096) != 0 ? mVar.f11504m : pVar;
        mVar.getClass();
        return new m(str2, z13, z14, z15, str3, str4, str5, lVar2, arrayList, r112, list2, z16, pVar2);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return L.f(this.f11492a, mVar.f11492a) && this.f11493b == mVar.f11493b && this.f11494c == mVar.f11494c && this.f11495d == mVar.f11495d && L.f(this.f11496e, mVar.f11496e) && L.f(this.f11497f, mVar.f11497f) && L.f(this.f11498g, mVar.f11498g) && L.f(this.f11499h, mVar.f11499h) && this.f11500i.equals(mVar.f11500i) && L.f(this.f11501j, mVar.f11501j) && L.f(this.f11502k, mVar.f11502k) && this.f11503l == mVar.f11503l && L.f(this.f11504m, mVar.f11504m);
    }

    public final int hashCode() {
        String str = this.f11492a;
        int i12 = androidx.appcompat.app.r.i(androidx.appcompat.app.r.i(androidx.appcompat.app.r.i((str == null ? 0 : str.hashCode()) * 31, 31, this.f11493b), 31, this.f11494c), 31, this.f11495d);
        String str2 = this.f11496e;
        int iHashCode = (i12 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f11497f;
        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f11498g;
        int iHashCode3 = (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        l lVar = this.f11499h;
        return this.f11504m.hashCode() + androidx.appcompat.app.r.i(H.e(C23088b.a(androidx.compose.ui.graphics.colorspace.e.g(this.f11500i, (iHashCode3 + (lVar != null ? lVar.hashCode() : 0)) * 31, 31), 31, this.f11501j), 31, this.f11502k), 31, this.f11503l);
    }

    @Y61.k
    public final String toString() {
        return "LocationParameter(id=" + this.f11492a + ", isRequired=" + this.f11493b + ", updatesForm=" + this.f11494c + ", isVisible=" + this.f11495d + ", notSelectedErrorText=" + this.f11496e + ", searchInputText=" + this.f11497f + ", searchInputHint=" + this.f11498g + ", selectedLocation=" + this.f11499h + ", popularLocations=" + this.f11500i + ", fastRecentSearches=" + this.f11501j + ", suggestedLocations=" + this.f11502k + ", hasSuggestedRecentSearchItem=" + this.f11503l + ", suggestsState=" + this.f11504m + ')';
    }
}
