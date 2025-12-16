package Pr;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CptButtonAction.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LPr/a;", "", "_avito_cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Pr.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* data */ class C14830a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f13334a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f13335b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final DeepLink f13336c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f13337d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Boolean f13338e;

    public C14830a(String str, String str2, DeepLink deepLink, String str3, Boolean bool, int i12, C42822w c42822w) {
        str2 = (i12 & 2) != 0 ? null : str2;
        deepLink = (i12 & 4) != 0 ? null : deepLink;
        str3 = (i12 & 8) != 0 ? null : str3;
        bool = (i12 & 16) != 0 ? null : bool;
        this.f13334a = str;
        this.f13335b = str2;
        this.f13336c = deepLink;
        this.f13337d = str3;
        this.f13338e = bool;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14830a)) {
            return false;
        }
        C14830a c14830a = (C14830a) obj;
        return L.f(this.f13334a, c14830a.f13334a) && L.f(this.f13335b, c14830a.f13335b) && L.f(this.f13336c, c14830a.f13336c) && L.f(this.f13337d, c14830a.f13337d) && L.f(this.f13338e, c14830a.f13338e);
    }

    public final int hashCode() {
        int iHashCode = this.f13334a.hashCode() * 31;
        String str = this.f13335b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        DeepLink deepLink = this.f13336c;
        int iHashCode3 = (iHashCode2 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        String str2 = this.f13337d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.f13338e;
        return iHashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CptButtonAction(title=");
        sb2.append(this.f13334a);
        sb2.append(", subtitle=");
        sb2.append(this.f13335b);
        sb2.append(", deeplink=");
        sb2.append(this.f13336c);
        sb2.append(", style=");
        sb2.append(this.f13337d);
        sb2.append(", isEnabled=");
        return C0.g(sb2, this.f13338e, ')');
    }
}
