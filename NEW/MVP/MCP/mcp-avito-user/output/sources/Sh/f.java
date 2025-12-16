package sH;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: MotivationPayment.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LsH/f;", "", "_avito_gig_motivation-payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f437582a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final UniversalImage f437583b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final DeepLink f437584c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final AttributedText f437585d;

    public f(@l DeepLink deepLink, @l UniversalImage universalImage, @l AttributedText attributedText, @k String str) {
        this.f437582a = str;
        this.f437583b = universalImage;
        this.f437584c = deepLink;
        this.f437585d = attributedText;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return L.f(this.f437582a, fVar.f437582a) && L.f(this.f437583b, fVar.f437583b) && L.f(this.f437584c, fVar.f437584c) && L.f(this.f437585d, fVar.f437585d);
    }

    public final int hashCode() {
        int iHashCode = this.f437582a.hashCode() * 31;
        UniversalImage universalImage = this.f437583b;
        int iHashCode2 = (iHashCode + (universalImage == null ? 0 : universalImage.hashCode())) * 31;
        DeepLink deepLink = this.f437584c;
        int iHashCode3 = (iHashCode2 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        AttributedText attributedText = this.f437585d;
        return iHashCode3 + (attributedText != null ? attributedText.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PaymentInfoRequisites(title=");
        sb2.append(this.f437582a);
        sb2.append(", image=");
        sb2.append(this.f437583b);
        sb2.append(", deeplink=");
        sb2.append(this.f437584c);
        sb2.append(", subtitle=");
        return com.avito.android.actions_sheet.a.w(sb2, this.f437585d, ')');
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ f(String str, UniversalImage universalImage, DeepLink deepLink, AttributedText attributedText, int i12, C42822w c42822w) {
        str = (i12 & 1) != 0 ? "" : str;
        this((i12 & 4) != 0 ? null : deepLink, (i12 & 2) != 0 ? null : universalImage, attributedText, str);
    }
}
