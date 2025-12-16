package SN;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.F3;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.ColoredIcon;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: InstallmentsFakedoor.kt */
@F3
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LSN/d;", "", "_avito_installments_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f14945a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final AttributedText f14946b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final DeepLink f14947c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final ColoredIcon f14948d;

    public d(@k String str, @l AttributedText attributedText, @k DeepLink deepLink, @l ColoredIcon coloredIcon) {
        this.f14945a = str;
        this.f14946b = attributedText;
        this.f14947c = deepLink;
        this.f14948d = coloredIcon;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f14945a, dVar.f14945a) && L.f(this.f14946b, dVar.f14946b) && L.f(this.f14947c, dVar.f14947c) && L.f(this.f14948d, dVar.f14948d);
    }

    public final int hashCode() {
        int iHashCode = this.f14945a.hashCode() * 31;
        AttributedText attributedText = this.f14946b;
        int iE2 = com.avito.android.actions_sheet.a.e(this.f14947c, (iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31, 31);
        ColoredIcon coloredIcon = this.f14948d;
        return iE2 + (coloredIcon != null ? coloredIcon.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "InstallmentsFakedoorWidget(title=" + this.f14945a + ", subtitle=" + this.f14946b + ", deepLink=" + this.f14947c + ", icon=" + this.f14948d + ')';
    }
}
