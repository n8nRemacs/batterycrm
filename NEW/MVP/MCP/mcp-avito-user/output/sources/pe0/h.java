package PE0;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ProfileHeaderBlock.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LPE0/h;", "LOE0/a;", "_avito_travel-guest-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class h implements OE0.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final AttributedText f12901a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final AttributedText f12902b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AttributedText f12903c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final AttributedText f12904d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Image f12905e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final List<f> f12906f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final g f12907g;

    public h(@k AttributedText attributedText, @l AttributedText attributedText2, @k AttributedText attributedText3, @k AttributedText attributedText4, @k Image image, @k List<f> list, @l g gVar) {
        this.f12901a = attributedText;
        this.f12902b = attributedText2;
        this.f12903c = attributedText3;
        this.f12904d = attributedText4;
        this.f12905e = image;
        this.f12906f = list;
        this.f12907g = gVar;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return L.f(this.f12901a, hVar.f12901a) && L.f(this.f12902b, hVar.f12902b) && L.f(this.f12903c, hVar.f12903c) && L.f(this.f12904d, hVar.f12904d) && L.f(this.f12905e, hVar.f12905e) && L.f(this.f12906f, hVar.f12906f) && L.f(this.f12907g, hVar.f12907g);
    }

    public final int hashCode() {
        int iHashCode = this.f12901a.hashCode() * 31;
        AttributedText attributedText = this.f12902b;
        int iE2 = H.e(com.avito.android.actions_sheet.a.g(this.f12905e, com.avito.android.actions_sheet.a.b(com.avito.android.actions_sheet.a.b((iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31, 31, this.f12903c), 31, this.f12904d), 31), 31, this.f12906f);
        g gVar = this.f12907g;
        return iE2 + (gVar != null ? gVar.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "ProfileHeaderBlock(userName=" + this.f12901a + ", rating=" + this.f12902b + ", personalInfo=" + this.f12903c + ", additionalInfo=" + this.f12904d + ", avatar=" + this.f12905e + ", badges=" + this.f12906f + ", blackListInfo=" + this.f12907g + ')';
    }
}
