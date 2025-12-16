package hi;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.Intent;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.avito.android.bottom_navigation.NavigationTab;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.PresentationType;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.search.map.Area;
import com.avito.android.search.filter.FilterAnalyticsData;
import com.avito.android.search.filter.InterfaceC34598u;
import i.AbstractC41201a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SearchFilterActivityContract.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lhi/b;", "Li/a;", "Lhi/b$a;", "Lcom/avito/android/deep_linking/links/DeepLink;", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: hi.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C40942b extends AbstractC41201a<a, DeepLink> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC34598u f397361b;

    /* compiled from: SearchFilterActivityContract.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lhi/b$a;", "", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: hi.b$a */
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final SearchParams f397362a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Area f397363b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f397364c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f397365d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final FilterAnalyticsData f397366e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final NavigationTab f397367f;

        /* renamed from: g, reason: collision with root package name */
        @l
        public final PresentationType f397368g;

        /* renamed from: h, reason: collision with root package name */
        @l
        public final String f397369h;

        /* renamed from: i, reason: collision with root package name */
        @l
        public final String f397370i;

        /* renamed from: j, reason: collision with root package name */
        @l
        public final String f397371j;

        public a(SearchParams searchParams, Area area, String str, boolean z12, FilterAnalyticsData filterAnalyticsData, NavigationTab navigationTab, PresentationType presentationType, String str2, String str3, String str4, int i12, C42822w c42822w) {
            area = (i12 & 2) != 0 ? null : area;
            str = (i12 & 4) != 0 ? null : str;
            z12 = (i12 & 8) != 0 ? false : z12;
            navigationTab = (i12 & 32) != 0 ? null : navigationTab;
            presentationType = (i12 & 64) != 0 ? null : presentationType;
            str2 = (i12 & 128) != 0 ? null : str2;
            str3 = (i12 & 256) != 0 ? null : str3;
            str4 = (i12 & 512) != 0 ? null : str4;
            this.f397362a = searchParams;
            this.f397363b = area;
            this.f397364c = str;
            this.f397365d = z12;
            this.f397366e = filterAnalyticsData;
            this.f397367f = navigationTab;
            this.f397368g = presentationType;
            this.f397369h = str2;
            this.f397370i = str3;
            this.f397371j = str4;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f397362a, aVar.f397362a) && L.f(this.f397363b, aVar.f397363b) && L.f(this.f397364c, aVar.f397364c) && this.f397365d == aVar.f397365d && L.f(this.f397366e, aVar.f397366e) && this.f397367f == aVar.f397367f && this.f397368g == aVar.f397368g && L.f(this.f397369h, aVar.f397369h) && L.f(this.f397370i, aVar.f397370i) && L.f(this.f397371j, aVar.f397371j);
        }

        public final int hashCode() {
            int iHashCode = this.f397362a.hashCode() * 31;
            Area area = this.f397363b;
            int iHashCode2 = (iHashCode + (area == null ? 0 : area.hashCode())) * 31;
            String str = this.f397364c;
            int iHashCode3 = (this.f397366e.hashCode() + r.i((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f397365d)) * 31;
            NavigationTab navigationTab = this.f397367f;
            int iHashCode4 = (iHashCode3 + (navigationTab == null ? 0 : navigationTab.hashCode())) * 31;
            PresentationType presentationType = this.f397368g;
            int iHashCode5 = (iHashCode4 + (presentationType == null ? 0 : presentationType.hashCode())) * 31;
            String str2 = this.f397369h;
            int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f397370i;
            int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f397371j;
            return iHashCode7 + (str4 != null ? str4.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Params(searchParams=");
            sb2.append(this.f397362a);
            sb2.append(", searchArea=");
            sb2.append(this.f397363b);
            sb2.append(", mapSerpState=");
            sb2.append(this.f397364c);
            sb2.append(", isOnlySortShown=");
            sb2.append(this.f397365d);
            sb2.append(", analyticsData=");
            sb2.append(this.f397366e);
            sb2.append(", tab=");
            sb2.append(this.f397367f);
            sb2.append(", presentationType=");
            sb2.append(this.f397368g);
            sb2.append(", scrollToParameterWithId=");
            sb2.append(this.f397369h);
            sb2.append(", infoModelForm=");
            sb2.append(this.f397370i);
            sb2.append(", context=");
            return C22026a.c(sb2, this.f397371j, ')');
        }
    }

    @Inject
    public C40942b(@k InterfaceC34598u interfaceC34598u) {
        this.f397361b = interfaceC34598u;
    }

    @Override // i.AbstractC41201a
    public final Intent createIntent(Context context, a aVar) {
        a aVar2 = aVar;
        FilterAnalyticsData filterAnalyticsData = aVar2.f397366e;
        if (filterAnalyticsData.f261808d == null) {
            return this.f397361b.a(aVar2.f397362a, aVar2.f397363b, aVar2.f397364c, aVar2.f397365d, filterAnalyticsData, aVar2.f397367f, aVar2.f397368g, aVar2.f397369h, aVar2.f397371j);
        }
        String str = aVar2.f397369h;
        return this.f397361b.b(aVar2.f397362a, (512 & 2) != 0 ? null : aVar2.f397363b, (512 & 4) != 0 ? null : aVar2.f397364c, (512 & 8) != 0 ? false : aVar2.f397365d, filterAnalyticsData, (512 & 32) != 0 ? null : aVar2.f397367f, (512 & 64) != 0 ? null : aVar2.f397368g, (512 & 128) != 0 ? null : str, aVar2.f397370i);
    }

    @Override // i.AbstractC41201a
    public final DeepLink parseResult(int i12, Intent intent) {
        if (i12 != -1 || intent == null) {
            return null;
        }
        new IE.a();
        return IE.a.a(intent);
    }
}
