package OG0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.upload_doc.view.checkbox.GigUploadDocCheckboxItem;
import com.avito.android.upload_doc.view.sections.GigUploadDocSectionsItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: GigUploadDocState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LOG0/d;", "Lcom/avito/android/analytics/screens/mvi/q;", "_avito_gig_upload-doc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class d extends q {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f12136b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f12137c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final List<GigUploadDocSectionsItem> f12138d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final List<GigUploadDocCheckboxItem> f12139e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f12140f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f12141g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final DeepLink f12142h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f12143i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f12144j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f12145k;

    public d(@k String str, @l String str2, @k List<GigUploadDocSectionsItem> list, @k List<GigUploadDocCheckboxItem> list2, @k String str3, boolean z12, @l DeepLink deepLink, boolean z13, boolean z14, boolean z15) {
        this.f12136b = str;
        this.f12137c = str2;
        this.f12138d = list;
        this.f12139e = list2;
        this.f12140f = str3;
        this.f12141g = z12;
        this.f12142h = deepLink;
        this.f12143i = z13;
        this.f12144j = z14;
        this.f12145k = z15;
    }

    public static d a(d dVar, ArrayList arrayList, ArrayList arrayList2, boolean z12, boolean z13, boolean z14, int i12) {
        String str = dVar.f12136b;
        String str2 = dVar.f12137c;
        List<GigUploadDocSectionsItem> list = (i12 & 4) != 0 ? dVar.f12138d : arrayList;
        List<GigUploadDocCheckboxItem> list2 = (i12 & 8) != 0 ? dVar.f12139e : arrayList2;
        String str3 = dVar.f12140f;
        boolean z15 = (i12 & 32) != 0 ? dVar.f12141g : z12;
        DeepLink deepLink = dVar.f12142h;
        boolean z16 = (i12 & 128) != 0 ? dVar.f12143i : false;
        boolean z17 = (i12 & 256) != 0 ? dVar.f12144j : z13;
        boolean z18 = (i12 & 512) != 0 ? dVar.f12145k : z14;
        dVar.getClass();
        return new d(str, str2, list, list2, str3, z15, deepLink, z16, z17, z18);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f12136b, dVar.f12136b) && L.f(this.f12137c, dVar.f12137c) && L.f(this.f12138d, dVar.f12138d) && L.f(this.f12139e, dVar.f12139e) && L.f(this.f12140f, dVar.f12140f) && this.f12141g == dVar.f12141g && L.f(this.f12142h, dVar.f12142h) && this.f12143i == dVar.f12143i && this.f12144j == dVar.f12144j && this.f12145k == dVar.f12145k;
    }

    public final int hashCode() {
        int iHashCode = this.f12136b.hashCode() * 31;
        String str = this.f12137c;
        int i12 = r.i(H.d(H.e(H.e((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f12138d), 31, this.f12139e), 31, this.f12140f), 31, this.f12141g);
        DeepLink deepLink = this.f12142h;
        return Boolean.hashCode(this.f12145k) + r.i(r.i((i12 + (deepLink != null ? deepLink.hashCode() : 0)) * 31, 31, this.f12143i), 31, this.f12144j);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GigUploadDocState(title=");
        sb2.append(this.f12136b);
        sb2.append(", description=");
        sb2.append(this.f12137c);
        sb2.append(", sections=");
        sb2.append(this.f12138d);
        sb2.append(", checkboxes=");
        sb2.append(this.f12139e);
        sb2.append(", buttonText=");
        sb2.append(this.f12140f);
        sb2.append(", isButtonEnabled=");
        sb2.append(this.f12141g);
        sb2.append(", supportButtonDeepLink=");
        sb2.append(this.f12142h);
        sb2.append(", needShowNavBarRightButtons=");
        sb2.append(this.f12143i);
        sb2.append(", isLoading=");
        sb2.append(this.f12144j);
        sb2.append(", isError=");
        return r.x(sb2, this.f12145k, ')');
    }
}
