package FA;

import Y61.k;
import Y61.l;
import com.akita.compose.theme.re23.style.C0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ExtendedProfileDisclaimerPhoneDialogAnalyticParams.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LFA/a;", "", "_avito_extended-profile-phone-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f4581a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f4582b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f4583c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Boolean f4584d;

    public a(@k String str, @l String str2, @l String str3, @l Boolean bool) {
        this.f4581a = str;
        this.f4582b = str2;
        this.f4583c = str3;
        this.f4584d = bool;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f4581a, aVar.f4581a) && L.f(this.f4582b, aVar.f4582b) && L.f(this.f4583c, aVar.f4583c) && L.f(this.f4584d, aVar.f4584d);
    }

    public final int hashCode() {
        int iHashCode = this.f4581a.hashCode() * 31;
        String str = this.f4582b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f4583c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.f4584d;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ExtendedProfileDisclaimerPhoneDialogAnalyticParams(userKey=");
        sb2.append(this.f4581a);
        sb2.append(", userId=");
        sb2.append(this.f4582b);
        sb2.append(", fromPage=");
        sb2.append(this.f4583c);
        sb2.append(", isAnonymous=");
        return C0.g(sb2, this.f4584d, ')');
    }
}
