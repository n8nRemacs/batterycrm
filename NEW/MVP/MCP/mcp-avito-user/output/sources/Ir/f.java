package ir;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.AvatarShape;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.advert_details.UserIconType;
import com.avito.android.remote.model.badge_bar.SerpBadge;
import com.avito.android.remote.model.service_seller_type.ServiceSellerType;
import hw.InterfaceC41178c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import okhttp3.internal.http2.Http2;
import shark.AndroidResourceIdNames;

/* compiled from: ProfileSnippetData.kt */
@InterfaceC41178c
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lir/f;", "", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class f {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final String f405273a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f405274b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f405275c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f405276d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f405277e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f405278f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final UserIconType f405279g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final Image f405280h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final AvatarShape f405281i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final Float f405282j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public final String f405283k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f405284l;

    /* renamed from: m, reason: collision with root package name */
    @l
    public final List<SerpBadge> f405285m;

    /* renamed from: n, reason: collision with root package name */
    @l
    public final ServiceSellerType f405286n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f405287o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f405288p;

    /* renamed from: q, reason: collision with root package name */
    @l
    public final String f405289q;

    /* renamed from: r, reason: collision with root package name */
    @l
    public final DeepLink f405290r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f405291s;

    public f() {
        this(null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, false, null, null, false, 524287, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return L.f(this.f405273a, fVar.f405273a) && L.f(this.f405274b, fVar.f405274b) && L.f(this.f405275c, fVar.f405275c) && L.f(this.f405276d, fVar.f405276d) && L.f(this.f405277e, fVar.f405277e) && L.f(this.f405278f, fVar.f405278f) && this.f405279g == fVar.f405279g && L.f(this.f405280h, fVar.f405280h) && this.f405281i == fVar.f405281i && L.f(this.f405282j, fVar.f405282j) && L.f(this.f405283k, fVar.f405283k) && this.f405284l == fVar.f405284l && L.f(this.f405285m, fVar.f405285m) && L.f(this.f405286n, fVar.f405286n) && this.f405287o == fVar.f405287o && this.f405288p == fVar.f405288p && L.f(this.f405289q, fVar.f405289q) && L.f(this.f405290r, fVar.f405290r) && this.f405291s == fVar.f405291s;
    }

    public final int hashCode() {
        String str = this.f405273a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f405274b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f405275c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f405276d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f405277e;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f405278f;
        int iHashCode6 = (this.f405279g.hashCode() + ((iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31)) * 31;
        Image image = this.f405280h;
        int iHashCode7 = (iHashCode6 + (image == null ? 0 : image.hashCode())) * 31;
        AvatarShape avatarShape = this.f405281i;
        int iHashCode8 = (iHashCode7 + (avatarShape == null ? 0 : avatarShape.hashCode())) * 31;
        Float f12 = this.f405282j;
        int iHashCode9 = (iHashCode8 + (f12 == null ? 0 : f12.hashCode())) * 31;
        String str7 = this.f405283k;
        int i12 = r.i((iHashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31, 31, this.f405284l);
        List<SerpBadge> list = this.f405285m;
        int iHashCode10 = (i12 + (list == null ? 0 : list.hashCode())) * 31;
        ServiceSellerType serviceSellerType = this.f405286n;
        int i13 = r.i(r.i((iHashCode10 + (serviceSellerType == null ? 0 : serviceSellerType.hashCode())) * 31, 31, this.f405287o), 31, this.f405288p);
        String str8 = this.f405289q;
        int iHashCode11 = (i13 + (str8 == null ? 0 : str8.hashCode())) * 31;
        DeepLink deepLink = this.f405290r;
        return Boolean.hashCode(this.f405291s) + ((iHashCode11 + (deepLink != null ? deepLink.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ProfileSnippetData(title=");
        sb2.append(this.f405273a);
        sb2.append(", companyName=");
        sb2.append(this.f405274b);
        sb2.append(", subtitle=");
        sb2.append(this.f405275c);
        sb2.append(", summary=");
        sb2.append(this.f405276d);
        sb2.append(", contactTitle=");
        sb2.append(this.f405277e);
        sb2.append(", contactSubtitle=");
        sb2.append(this.f405278f);
        sb2.append(", iconType=");
        sb2.append(this.f405279g);
        sb2.append(", avatar=");
        sb2.append(this.f405280h);
        sb2.append(", avatarShape=");
        sb2.append(this.f405281i);
        sb2.append(", ratingScore=");
        sb2.append(this.f405282j);
        sb2.append(", ratingText=");
        sb2.append(this.f405283k);
        sb2.append(", isVerified=");
        sb2.append(this.f405284l);
        sb2.append(", badges=");
        sb2.append(this.f405285m);
        sb2.append(", sellerType=");
        sb2.append(this.f405286n);
        sb2.append(", isRedesign=");
        sb2.append(this.f405287o);
        sb2.append(", isRestyle=");
        sb2.append(this.f405288p);
        sb2.append(", subscriptionAction=");
        sb2.append(this.f405289q);
        sb2.append(", entryPointShowEvent=");
        sb2.append(this.f405290r);
        sb2.append(", isServicesRedesign=");
        return r.x(sb2, this.f405291s, ')');
    }

    public f(String str, String str2, String str3, String str4, String str5, String str6, UserIconType userIconType, Image image, AvatarShape avatarShape, Float f12, String str7, boolean z12, List list, ServiceSellerType serviceSellerType, boolean z13, boolean z14, String str8, DeepLink deepLink, boolean z15, int i12, C42822w c42822w) {
        String str9 = (i12 & 1) != 0 ? null : str;
        String str10 = (i12 & 2) != 0 ? null : str2;
        String str11 = (i12 & 4) != 0 ? null : str3;
        String str12 = (i12 & 8) != 0 ? null : str4;
        String str13 = (i12 & 16) != 0 ? null : str5;
        String str14 = (i12 & 32) != 0 ? null : str6;
        UserIconType userIconType2 = (i12 & 64) != 0 ? UserIconType.PRIVATE : userIconType;
        Image image2 = (i12 & 128) != 0 ? null : image;
        AvatarShape avatarShape2 = (i12 & 256) != 0 ? null : avatarShape;
        Float f13 = (i12 & 512) != 0 ? null : f12;
        String str15 = (i12 & 1024) != 0 ? null : str7;
        boolean z16 = (i12 & 2048) != 0 ? false : z12;
        List list2 = (i12 & 4096) != 0 ? null : list;
        ServiceSellerType serviceSellerType2 = (i12 & 8192) != 0 ? null : serviceSellerType;
        boolean z17 = (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? false : z13;
        boolean z18 = (i12 & 32768) != 0 ? false : z14;
        String str16 = (i12 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? null : str8;
        DeepLink deepLink2 = (i12 & 131072) != 0 ? null : deepLink;
        boolean z19 = (i12 & 262144) != 0 ? false : z15;
        this.f405273a = str9;
        this.f405274b = str10;
        this.f405275c = str11;
        this.f405276d = str12;
        this.f405277e = str13;
        this.f405278f = str14;
        this.f405279g = userIconType2;
        this.f405280h = image2;
        this.f405281i = avatarShape2;
        this.f405282j = f13;
        this.f405283k = str15;
        this.f405284l = z16;
        this.f405285m = list2;
        this.f405286n = serviceSellerType2;
        this.f405287o = z17;
        this.f405288p = z18;
        this.f405289q = str16;
        this.f405290r = deepLink2;
        this.f405291s = z19;
    }
}
