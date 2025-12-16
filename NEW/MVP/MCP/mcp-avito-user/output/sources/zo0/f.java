package ZO0;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: WalletPageViewState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZO0/f;", "", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final AttributedText f20138a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final AttributedText f20139b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final g f20140c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final h f20141d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final h f20142e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final DeepLink f20143f;

    public f(@Y61.k AttributedText attributedText, @Y61.l AttributedText attributedText2, @Y61.l g gVar, @Y61.l h hVar, @Y61.l h hVar2, @Y61.l DeepLink deepLink) {
        this.f20138a = attributedText;
        this.f20139b = attributedText2;
        this.f20140c = gVar;
        this.f20141d = hVar;
        this.f20142e = hVar2;
        this.f20143f = deepLink;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return L.f(this.f20138a, fVar.f20138a) && L.f(this.f20139b, fVar.f20139b) && L.f(this.f20140c, fVar.f20140c) && L.f(this.f20141d, fVar.f20141d) && L.f(this.f20142e, fVar.f20142e) && L.f(this.f20143f, fVar.f20143f);
    }

    public final int hashCode() {
        int iHashCode = this.f20138a.hashCode() * 31;
        AttributedText attributedText = this.f20139b;
        int iHashCode2 = (iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        g gVar = this.f20140c;
        int iHashCode3 = (iHashCode2 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        h hVar = this.f20141d;
        int iHashCode4 = (iHashCode3 + (hVar == null ? 0 : hVar.hashCode())) * 31;
        h hVar2 = this.f20142e;
        int iHashCode5 = (iHashCode4 + (hVar2 == null ? 0 : hVar2.hashCode())) * 31;
        DeepLink deepLink = this.f20143f;
        return iHashCode5 + (deepLink != null ? deepLink.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("WalletPagePromoBanner(title=");
        sb2.append(this.f20138a);
        sb2.append(", subTitle=");
        sb2.append(this.f20139b);
        sb2.append(", backgroundColor=");
        sb2.append(this.f20140c);
        sb2.append(", leftIcon=");
        sb2.append(this.f20141d);
        sb2.append(", rightIcon=");
        sb2.append(this.f20142e);
        sb2.append(", actionLink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f20143f, ')');
    }
}
