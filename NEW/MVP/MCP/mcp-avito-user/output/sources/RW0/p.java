package rw0;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: RulesInfo.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lrw0/p;", "", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class p {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final AttributedText f437243a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final DeepLink f437244b;

    public p(@Y61.l AttributedText attributedText, @Y61.l DeepLink deepLink) {
        this.f437243a = attributedText;
        this.f437244b = deepLink;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return L.f(this.f437243a, pVar.f437243a) && L.f(this.f437244b, pVar.f437244b);
    }

    public final int hashCode() {
        AttributedText attributedText = this.f437243a;
        int iHashCode = (attributedText == null ? 0 : attributedText.hashCode()) * 31;
        DeepLink deepLink = this.f437244b;
        return iHashCode + (deepLink != null ? deepLink.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RulesInfoItem(text=");
        sb2.append(this.f437243a);
        sb2.append(", deeplink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f437244b, ')');
    }
}
