package pw0;

import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.short_term_rent.soft_booking.entity.StrSoftBookingContactFieldType;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ContactsData.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lpw0/b;", "", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: pw0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* data */ class C47158b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f428855a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f428856b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final StrSoftBookingContactFieldType f428857c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f428858d;

    public C47158b(@Y61.k String str, @Y61.k String str2, @Y61.k StrSoftBookingContactFieldType strSoftBookingContactFieldType, @Y61.l String str3) {
        this.f428855a = str;
        this.f428856b = str2;
        this.f428857c = strSoftBookingContactFieldType;
        this.f428858d = str3;
    }

    public static C47158b a(C47158b c47158b, String str, String str2, int i12) {
        String str3 = c47158b.f428855a;
        if ((i12 & 2) != 0) {
            str = c47158b.f428856b;
        }
        StrSoftBookingContactFieldType strSoftBookingContactFieldType = c47158b.f428857c;
        if ((i12 & 8) != 0) {
            str2 = c47158b.f428858d;
        }
        c47158b.getClass();
        return new C47158b(str3, str, strSoftBookingContactFieldType, str2);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C47158b)) {
            return false;
        }
        C47158b c47158b = (C47158b) obj;
        return L.f(this.f428855a, c47158b.f428855a) && L.f(this.f428856b, c47158b.f428856b) && this.f428857c == c47158b.f428857c && L.f(this.f428858d, c47158b.f428858d);
    }

    public final int hashCode() {
        int iHashCode = (this.f428857c.hashCode() + H.d(this.f428855a.hashCode() * 31, 31, this.f428856b)) * 31;
        String str = this.f428858d;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ContactFieldData(id=");
        sb2.append(this.f428855a);
        sb2.append(", text=");
        sb2.append(this.f428856b);
        sb2.append(", type=");
        sb2.append(this.f428857c);
        sb2.append(", errorMessage=");
        return C22026a.c(sb2, this.f428858d, ')');
    }
}
