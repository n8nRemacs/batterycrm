package Cp0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.category_parameters.Badge;
import com.avito.android.search.filter.converter.ParameterElement;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BannerCheckBoxWithImageItem.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"LCp0/a;", "Lcom/avito/conveyor_item/a;", "Lcom/avito/android/search/filter/converter/ParameterElement$m;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Cp0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* data */ class C13337a implements com.avito.conveyor_item.a, ParameterElement.m {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f2687b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f2688c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f2689d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f2690e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f2691f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f2692g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final Badge f2693h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final UniversalImage f2694i;

    public C13337a(@k String str, @l String str2, @k String str3, boolean z12, @l String str4, @l String str5, @l Badge badge, @l UniversalImage universalImage) {
        this.f2687b = str;
        this.f2688c = str2;
        this.f2689d = str3;
        this.f2690e = z12;
        this.f2691f = str4;
        this.f2692g = str5;
        this.f2693h = badge;
        this.f2694i = universalImage;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13337a)) {
            return false;
        }
        C13337a c13337a = (C13337a) obj;
        return L.f(this.f2687b, c13337a.f2687b) && L.f(this.f2688c, c13337a.f2688c) && L.f(this.f2689d, c13337a.f2689d) && this.f2690e == c13337a.f2690e && L.f(this.f2691f, c13337a.f2691f) && L.f(this.f2692g, c13337a.f2692g) && L.f(this.f2693h, c13337a.f2693h) && L.f(this.f2694i, c13337a.f2694i);
    }

    @Override // com.avito.android.search.filter.converter.ParameterElement.m
    @l
    /* renamed from: getGroupId, reason: from getter */
    public final String getF262959j() {
        return this.f2688c;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF124042b() {
        return getF258479b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF258479b() {
        return this.f2687b;
    }

    public final int hashCode() {
        int iHashCode = this.f2687b.hashCode() * 31;
        String str = this.f2688c;
        int i12 = r.i(H.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f2689d), 31, this.f2690e);
        String str2 = this.f2691f;
        int iHashCode2 = (i12 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f2692g;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Badge badge = this.f2693h;
        int iHashCode4 = (iHashCode3 + (badge == null ? 0 : badge.hashCode())) * 31;
        UniversalImage universalImage = this.f2694i;
        return iHashCode4 + (universalImage != null ? universalImage.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BannerCheckBoxWithImageItem(stringId=");
        sb2.append(this.f2687b);
        sb2.append(", groupId=");
        sb2.append(this.f2688c);
        sb2.append(", title=");
        sb2.append(this.f2689d);
        sb2.append(", isChecked=");
        sb2.append(this.f2690e);
        sb2.append(", label=");
        sb2.append(this.f2691f);
        sb2.append(", subtitle=");
        sb2.append(this.f2692g);
        sb2.append(", badge=");
        sb2.append(this.f2693h);
        sb2.append(", universalImage=");
        return com.avito.android.advert.item.delivery_suggests.l.s(sb2, this.f2694i, ')');
    }

    public /* synthetic */ C13337a(String str, String str2, String str3, boolean z12, String str4, String str5, Badge badge, UniversalImage universalImage, int i12, C42822w c42822w) {
        this(str, str2, str3, (i12 & 8) != 0 ? false : z12, (i12 & 16) != 0 ? null : str4, (i12 & 32) != 0 ? null : str5, (i12 & 64) != 0 ? null : badge, (i12 & 128) != 0 ? null : universalImage);
    }
}
