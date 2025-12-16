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
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LYE0/i;", "", "_avito_travel-onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class i {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final AttributedText f19407a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final AttributedText f19408b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final UniversalImage f19409c;

    public i(@k AttributedText attributedText, @l AttributedText attributedText2, @l UniversalImage universalImage) {
        this.f19407a = attributedText;
        this.f19408b = attributedText2;
        this.f19409c = universalImage;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return L.f(this.f19407a, iVar.f19407a) && L.f(this.f19408b, iVar.f19408b) && L.f(this.f19409c, iVar.f19409c);
    }

    public final int hashCode() {
        int iHashCode = this.f19407a.hashCode() * 31;
        AttributedText attributedText = this.f19408b;
        int iHashCode2 = (iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        UniversalImage universalImage = this.f19409c;
        return iHashCode2 + (universalImage != null ? universalImage.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TravelOnboardingHeaderBlock(title=");
        sb2.append(this.f19407a);
        sb2.append(", subtitle=");
        sb2.append(this.f19408b);
        sb2.append(", image=");
        return com.avito.android.advert.item.delivery_suggests.l.s(sb2, this.f19409c, ')');
    }
}
