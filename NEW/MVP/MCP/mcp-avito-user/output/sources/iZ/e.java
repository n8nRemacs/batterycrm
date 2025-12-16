package Iz;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.deep_linking.links.DeepLink;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: EsiaRedirectState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIz/e;", "", "_avito_gig_esia-redirect-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final List<com.avito.conveyor_item.a> f8683a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<com.avito.conveyor_item.a> f8684b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final DeepLink f8685c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.avito.android.lib.design.nav_bar.a f8686d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f8687e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f8688f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f8689g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f8690h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f8691i;

    /* JADX WARN: Multi-variable type inference failed */
    public e(@k List<? extends com.avito.conveyor_item.a> list, @k List<? extends com.avito.conveyor_item.a> list2, @l DeepLink deepLink, @k com.avito.android.lib.design.nav_bar.a aVar, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        this.f8683a = list;
        this.f8684b = list2;
        this.f8685c = deepLink;
        this.f8686d = aVar;
        this.f8687e = z12;
        this.f8688f = z13;
        this.f8689g = z14;
        this.f8690h = z15;
        this.f8691i = z16;
    }

    public static e a(e eVar, boolean z12, boolean z13, boolean z14) {
        List<com.avito.conveyor_item.a> list = eVar.f8683a;
        List<com.avito.conveyor_item.a> list2 = eVar.f8684b;
        DeepLink deepLink = eVar.f8685c;
        com.avito.android.lib.design.nav_bar.a aVar = eVar.f8686d;
        eVar.getClass();
        return new e(list, list2, deepLink, aVar, false, false, z12, z13, z14);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return L.f(this.f8683a, eVar.f8683a) && L.f(this.f8684b, eVar.f8684b) && L.f(this.f8685c, eVar.f8685c) && L.f(this.f8686d, eVar.f8686d) && this.f8687e == eVar.f8687e && this.f8688f == eVar.f8688f && this.f8689g == eVar.f8689g && this.f8690h == eVar.f8690h && this.f8691i == eVar.f8691i;
    }

    public final int hashCode() {
        int iE2 = H.e(this.f8683a.hashCode() * 31, 31, this.f8684b);
        DeepLink deepLink = this.f8685c;
        return Boolean.hashCode(this.f8691i) + r.i(r.i(r.i(r.i((this.f8686d.hashCode() + ((iE2 + (deepLink == null ? 0 : deepLink.hashCode())) * 31)) * 31, 31, this.f8687e), 31, this.f8688f), 31, this.f8689g), 31, this.f8690h);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EsiaRedirectState(content=");
        sb2.append(this.f8683a);
        sb2.append(", buttons=");
        sb2.append(this.f8684b);
        sb2.append(", supportButtonDeepLink=");
        sb2.append(this.f8685c);
        sb2.append(", navBarState=");
        sb2.append(this.f8686d);
        sb2.append(", needShowNavBarRightButtons=");
        sb2.append(this.f8687e);
        sb2.append(", isContent=");
        sb2.append(this.f8688f);
        sb2.append(", isLoading=");
        sb2.append(this.f8689g);
        sb2.append(", isError=");
        sb2.append(this.f8690h);
        sb2.append(", isUnauthorized=");
        return r.x(sb2, this.f8691i, ')');
    }

    public e(List list, List list2, DeepLink deepLink, com.avito.android.lib.design.nav_bar.a aVar, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? C42784z0.f406748b : list, (i12 & 2) != 0 ? C42784z0.f406748b : list2, (i12 & 4) != 0 ? null : deepLink, aVar, (i12 & 16) != 0 ? false : z12, (i12 & 32) != 0 ? false : z13, (i12 & 64) != 0 ? false : z14, (i12 & 128) != 0 ? false : z15, (i12 & 256) != 0 ? false : z16);
    }
}
