package iC0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: TariffCptButtonAction.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LiC0/a;", "", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: iC0.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* data */ class C41267a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f398436a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final DeepLink f398437b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f398438c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Boolean f398439d;

    public C41267a(@k String str, @l DeepLink deepLink, @l String str2, @l Boolean bool) {
        this.f398436a = str;
        this.f398437b = deepLink;
        this.f398438c = str2;
        this.f398439d = bool;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C41267a)) {
            return false;
        }
        C41267a c41267a = (C41267a) obj;
        return L.f(this.f398436a, c41267a.f398436a) && L.f(this.f398437b, c41267a.f398437b) && L.f(this.f398438c, c41267a.f398438c) && L.f(this.f398439d, c41267a.f398439d);
    }

    public final int hashCode() {
        int iHashCode = this.f398436a.hashCode() * 31;
        DeepLink deepLink = this.f398437b;
        int iHashCode2 = (iHashCode + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        String str = this.f398438c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.f398439d;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TariffCptButtonAction(title=");
        sb2.append(this.f398436a);
        sb2.append(", deeplink=");
        sb2.append(this.f398437b);
        sb2.append(", style=");
        sb2.append(this.f398438c);
        sb2.append(", isEnabled=");
        return C0.g(sb2, this.f398439d, ')');
    }

    public /* synthetic */ C41267a(String str, DeepLink deepLink, String str2, Boolean bool, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? null : deepLink, (i12 & 4) != 0 ? null : str2, (i12 & 8) != 0 ? null : bool);
    }
}
