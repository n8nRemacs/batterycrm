package rp;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PromoModel.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lrp/f;", "", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: rp.f, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* data */ class C47703f {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final String f430209a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f430210b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AttributedText f430211c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f430212d;

    public C47703f(@l String str, @l String str2, @k AttributedText attributedText, @l String str3) {
        this.f430209a = str;
        this.f430210b = str2;
        this.f430211c = attributedText;
        this.f430212d = str3;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C47703f)) {
            return false;
        }
        C47703f c47703f = (C47703f) obj;
        return L.f(this.f430209a, c47703f.f430209a) && L.f(this.f430210b, c47703f.f430210b) && L.f(null, null) && this.f430211c.equals(c47703f.f430211c) && L.f(this.f430212d, c47703f.f430212d);
    }

    public final int hashCode() {
        String str = this.f430209a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f430210b;
        int iB2 = com.avito.android.actions_sheet.a.b((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 961, 31, this.f430211c);
        String str3 = this.f430212d;
        return iB2 + (str3 != null ? str3.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PhoneInput(title=");
        sb2.append(this.f430209a);
        sb2.append(", subtitle=");
        sb2.append(this.f430210b);
        sb2.append(", value=null, hint=");
        sb2.append(this.f430211c);
        sb2.append(", placeholder=");
        return C22026a.c(sb2, this.f430212d, ')');
    }
}
