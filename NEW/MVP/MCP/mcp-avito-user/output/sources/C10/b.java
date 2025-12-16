package C10;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.graphics.colorspace.e;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: OffersModel.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LC10/b;", "", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final AttributedText f1868a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f1869b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ArrayList f1870c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f1871d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final ArrayList f1872e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final DeepLink f1873f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final DeepLink f1874g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final H10.a f1875h;

    public b(@k AttributedText attributedText, @l String str, @k ArrayList arrayList, @k String str2, @k ArrayList arrayList2, @k DeepLink deepLink, @l DeepLink deepLink2, @l H10.a aVar) {
        this.f1868a = attributedText;
        this.f1869b = str;
        this.f1870c = arrayList;
        this.f1871d = str2;
        this.f1872e = arrayList2;
        this.f1873f = deepLink;
        this.f1874g = deepLink2;
        this.f1875h = aVar;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return L.f(this.f1868a, bVar.f1868a) && L.f(this.f1869b, bVar.f1869b) && this.f1870c.equals(bVar.f1870c) && L.f(this.f1871d, bVar.f1871d) && this.f1872e.equals(bVar.f1872e) && L.f(this.f1873f, bVar.f1873f) && L.f(this.f1874g, bVar.f1874g) && this.f1875h.equals(bVar.f1875h);
    }

    public final int hashCode() {
        int iHashCode = this.f1868a.hashCode() * 31;
        String str = this.f1869b;
        int iE2 = com.avito.android.actions_sheet.a.e(this.f1873f, e.g(this.f1872e, H.d(e.g(this.f1870c, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.f1871d), 31), 31);
        DeepLink deepLink = this.f1874g;
        return this.f1875h.hashCode() + ((iE2 + (deepLink != null ? deepLink.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        return "OffersModel(title=" + this.f1868a + ", banksImage=" + this.f1869b + ", offers=" + this.f1870c + ", offersDescriptionTitle=" + this.f1871d + ", offersDescriptions=" + this.f1872e + ", primaryActionLink=" + this.f1873f + ", secondaryActionLink=" + this.f1874g + ", snippet=" + this.f1875h + ')';
    }
}
