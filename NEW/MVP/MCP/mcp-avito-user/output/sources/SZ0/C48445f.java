package sz0;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.deep_linking.links.DeepLink;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrSellerOrdersResponse.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lsz0/f;", "", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: sz0.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* data */ class C48445f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final List<AbstractC48441b> f438996a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f438997b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final List<InterfaceC48440a> f438998c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final DeepLink f438999d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final C48443d f439000e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f439001f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final List<C48446g> f439002g;

    /* JADX WARN: Multi-variable type inference failed */
    public C48445f(@k List<? extends AbstractC48441b> list, @l String str, @l List<? extends InterfaceC48440a> list2, @l DeepLink deepLink, @k C48443d c48443d, @l String str2, @l List<C48446g> list3) {
        this.f438996a = list;
        this.f438997b = str;
        this.f438998c = list2;
        this.f438999d = deepLink;
        this.f439000e = c48443d;
        this.f439001f = str2;
        this.f439002g = list3;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C48445f)) {
            return false;
        }
        C48445f c48445f = (C48445f) obj;
        return L.f(this.f438996a, c48445f.f438996a) && L.f(this.f438997b, c48445f.f438997b) && L.f(this.f438998c, c48445f.f438998c) && L.f(this.f438999d, c48445f.f438999d) && L.f(this.f439000e, c48445f.f439000e) && L.f(this.f439001f, c48445f.f439001f) && L.f(this.f439002g, c48445f.f439002g);
    }

    public final int hashCode() {
        int iHashCode = this.f438996a.hashCode() * 31;
        String str = this.f438997b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<InterfaceC48440a> list = this.f438998c;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        DeepLink deepLink = this.f438999d;
        int iHashCode4 = (this.f439000e.hashCode() + ((iHashCode3 + (deepLink == null ? 0 : deepLink.hashCode())) * 31)) * 31;
        String str2 = this.f439001f;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<C48446g> list2 = this.f439002g;
        return iHashCode5 + (list2 != null ? list2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StrSellerOrdersResponse(filters=");
        sb2.append(this.f438996a);
        sb2.append(", header=");
        sb2.append(this.f438997b);
        sb2.append(", items=");
        sb2.append(this.f438998c);
        sb2.append(", onboardingDeepLink=");
        sb2.append(this.f438999d);
        sb2.append(", pagination=");
        sb2.append(this.f439000e);
        sb2.append(", title=");
        sb2.append(this.f439001f);
        sb2.append(", widgets=");
        return H.p(sb2, this.f439002g, ')');
    }
}
