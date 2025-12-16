package sz0;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrSellerOrdersResponse.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lsz0/g;", "", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: sz0.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* data */ class C48446g {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final DeepLink f439003a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f439004b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f439005c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final UniversalImage f439006d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final AttributedText f439007e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final AttributedText f439008f;

    public C48446g(@l DeepLink deepLink, @l UniversalImage universalImage, @l AttributedText attributedText, @l AttributedText attributedText2, @l String str, @l String str2) {
        this.f439003a = deepLink;
        this.f439004b = str;
        this.f439005c = str2;
        this.f439006d = universalImage;
        this.f439007e = attributedText;
        this.f439008f = attributedText2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C48446g)) {
            return false;
        }
        C48446g c48446g = (C48446g) obj;
        return L.f(this.f439003a, c48446g.f439003a) && L.f(this.f439004b, c48446g.f439004b) && L.f(this.f439005c, c48446g.f439005c) && L.f(this.f439006d, c48446g.f439006d) && L.f(this.f439007e, c48446g.f439007e) && L.f(this.f439008f, c48446g.f439008f);
    }

    public final int hashCode() {
        DeepLink deepLink = this.f439003a;
        int iHashCode = (deepLink == null ? 0 : deepLink.hashCode()) * 31;
        String str = this.f439004b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f439005c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        UniversalImage universalImage = this.f439006d;
        int iHashCode4 = (iHashCode3 + (universalImage == null ? 0 : universalImage.hashCode())) * 31;
        AttributedText attributedText = this.f439007e;
        int iHashCode5 = (iHashCode4 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        AttributedText attributedText2 = this.f439008f;
        return iHashCode5 + (attributedText2 != null ? attributedText2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Widget(deepLink=");
        sb2.append(this.f439003a);
        sb2.append(", icon=");
        sb2.append(this.f439004b);
        sb2.append(", iconName=");
        sb2.append(this.f439005c);
        sb2.append(", image=");
        sb2.append(this.f439006d);
        sb2.append(", subtitle=");
        sb2.append(this.f439007e);
        sb2.append(", title=");
        return com.avito.android.actions_sheet.a.w(sb2, this.f439008f, ')');
    }
}
