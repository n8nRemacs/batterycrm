package YE0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TravelOnboardingBlocksInfo.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LYE0/g;", "", "_avito_travel-onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class g {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final AttributedText f19402a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final AttributedText f19403b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final UniversalImage f19404c;

    public g(@k AttributedText attributedText, @k AttributedText attributedText2, @l UniversalImage universalImage) {
        this.f19402a = attributedText;
        this.f19403b = attributedText2;
        this.f19404c = universalImage;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return L.f(this.f19402a, gVar.f19402a) && L.f(this.f19403b, gVar.f19403b) && L.f(this.f19404c, gVar.f19404c);
    }

    public final int hashCode() {
        int iB2 = com.avito.android.actions_sheet.a.b(this.f19402a.hashCode() * 31, 31, this.f19403b);
        UniversalImage universalImage = this.f19404c;
        return iB2 + (universalImage == null ? 0 : universalImage.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TravelOnboardingConditionsItem(title=");
        sb2.append(this.f19402a);
        sb2.append(", subtitle=");
        sb2.append(this.f19403b);
        sb2.append(", image=");
        return com.avito.android.advert.item.delivery_suggests.l.s(sb2, this.f19404c, ')');
    }
}
