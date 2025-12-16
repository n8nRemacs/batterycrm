package Fx;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.document_verification_status_screen.models.ButtonAction;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: VerificationStatusUiState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LFx/d;", "", "_avito_gig_document-verification-status-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f6055a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f6056b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final List<ButtonAction> f6057c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f6058d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f6059e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final DeepLink f6060f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final com.avito.android.lib.design.nav_bar.a f6061g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f6062h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f6063i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f6064j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f6065k;

    public d(@k String str, @k String str2, @k List<ButtonAction> list, @k String str3, @l String str4, @l DeepLink deepLink, @k com.avito.android.lib.design.nav_bar.a aVar, boolean z12, boolean z13, boolean z14, boolean z15) {
        this.f6055a = str;
        this.f6056b = str2;
        this.f6057c = list;
        this.f6058d = str3;
        this.f6059e = str4;
        this.f6060f = deepLink;
        this.f6061g = aVar;
        this.f6062h = z12;
        this.f6063i = z13;
        this.f6064j = z14;
        this.f6065k = z15;
    }

    public static d a(d dVar, boolean z12, boolean z13) {
        String str = dVar.f6055a;
        String str2 = dVar.f6056b;
        List<ButtonAction> list = dVar.f6057c;
        String str3 = dVar.f6058d;
        String str4 = dVar.f6059e;
        DeepLink deepLink = dVar.f6060f;
        com.avito.android.lib.design.nav_bar.a aVar = dVar.f6061g;
        dVar.getClass();
        return new d(str, str2, list, str3, str4, deepLink, aVar, false, false, z12, z13);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f6055a, dVar.f6055a) && L.f(this.f6056b, dVar.f6056b) && L.f(this.f6057c, dVar.f6057c) && L.f(this.f6058d, dVar.f6058d) && L.f(this.f6059e, dVar.f6059e) && L.f(this.f6060f, dVar.f6060f) && L.f(this.f6061g, dVar.f6061g) && this.f6062h == dVar.f6062h && this.f6063i == dVar.f6063i && this.f6064j == dVar.f6064j && this.f6065k == dVar.f6065k;
    }

    public final int hashCode() {
        int iD2 = H.d(H.e(H.d(this.f6055a.hashCode() * 31, 31, this.f6056b), 31, this.f6057c), 31, this.f6058d);
        String str = this.f6059e;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        DeepLink deepLink = this.f6060f;
        return Boolean.hashCode(this.f6065k) + r.i(r.i(r.i((this.f6061g.hashCode() + ((iHashCode + (deepLink != null ? deepLink.hashCode() : 0)) * 31)) * 31, 31, this.f6062h), 31, this.f6063i), 31, this.f6064j);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VerificationStatusUiState(title=");
        sb2.append(this.f6055a);
        sb2.append(", description=");
        sb2.append(this.f6056b);
        sb2.append(", actions=");
        sb2.append(this.f6057c);
        sb2.append(", logoUrl=");
        sb2.append(this.f6058d);
        sb2.append(", status=");
        sb2.append(this.f6059e);
        sb2.append(", supportButtonDeepLink=");
        sb2.append(this.f6060f);
        sb2.append(", navBarState=");
        sb2.append(this.f6061g);
        sb2.append(", needShowNavBarRightButtons=");
        sb2.append(this.f6062h);
        sb2.append(", isContent=");
        sb2.append(this.f6063i);
        sb2.append(", isLoading=");
        sb2.append(this.f6064j);
        sb2.append(", isError=");
        return r.x(sb2, this.f6065k, ')');
    }

    public d(String str, String str2, List list, String str3, String str4, DeepLink deepLink, com.avito.android.lib.design.nav_bar.a aVar, boolean z12, boolean z13, boolean z14, boolean z15, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? "" : str, (i12 & 2) != 0 ? "" : str2, (i12 & 4) != 0 ? C42784z0.f406748b : list, (i12 & 8) != 0 ? "" : str3, (i12 & 16) != 0 ? null : str4, (i12 & 32) != 0 ? null : deepLink, aVar, (i12 & 128) != 0 ? false : z12, (i12 & 256) != 0 ? false : z13, (i12 & 512) != 0 ? true : z14, (i12 & 1024) != 0 ? false : z15);
    }
}
