package uI;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.historical_suggests.model.AddressType;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: Suggestion.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LuI/b;", "", "_avito_historical-suggests_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: uI.b, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final /* data */ class C48901b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f439879a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f439880b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final C48902c f439881c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f439882d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Long f439883e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f439884f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final AddressType f439885g;

    /* renamed from: h, reason: collision with root package name */
    public final int f439886h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final String f439887i;

    public C48901b(@k String str, @k String str2, @l C48902c c48902c, @l String str3, @l Long l12, boolean z12, @l AddressType addressType, int i12, @l String str4) {
        this.f439879a = str;
        this.f439880b = str2;
        this.f439881c = c48902c;
        this.f439882d = str3;
        this.f439883e = l12;
        this.f439884f = z12;
        this.f439885g = addressType;
        this.f439886h = i12;
        this.f439887i = str4;
    }

    @k
    public final String a() {
        String str = this.f439887i;
        if (str != null) {
            return str;
        }
        String str2 = this.f439879a;
        int length = str2.length();
        String str3 = this.f439880b;
        if (length == 0 || str3.length() == 0) {
            return str2.length() == 0 ? str3.length() == 0 ? "" : str3 : str2;
        }
        return str3 + ", " + str2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C48901b)) {
            return false;
        }
        C48901b c48901b = (C48901b) obj;
        return L.f(this.f439879a, c48901b.f439879a) && L.f(this.f439880b, c48901b.f439880b) && L.f(this.f439881c, c48901b.f439881c) && L.f(this.f439882d, c48901b.f439882d) && L.f(this.f439883e, c48901b.f439883e) && this.f439884f == c48901b.f439884f && this.f439885g == c48901b.f439885g && this.f439886h == c48901b.f439886h && L.f(this.f439887i, c48901b.f439887i);
    }

    public final int hashCode() {
        int iD2 = H.d(this.f439879a.hashCode() * 31, 31, this.f439880b);
        C48902c c48902c = this.f439881c;
        int iHashCode = (iD2 + (c48902c == null ? 0 : c48902c.hashCode())) * 31;
        String str = this.f439882d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l12 = this.f439883e;
        int i12 = r.i((iHashCode2 + (l12 == null ? 0 : l12.hashCode())) * 31, 31, this.f439884f);
        AddressType addressType = this.f439885g;
        int iE2 = r.e(this.f439886h, (i12 + (addressType == null ? 0 : addressType.hashCode())) * 31, 31);
        String str2 = this.f439887i;
        return iE2 + (str2 != null ? str2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Suggestion(title=");
        sb2.append(this.f439879a);
        sb2.append(", subtitle=");
        sb2.append(this.f439880b);
        sb2.append(", coordinates=");
        sb2.append(this.f439881c);
        sb2.append(", jsonWebToken=");
        sb2.append(this.f439882d);
        sb2.append(", id=");
        sb2.append(this.f439883e);
        sb2.append(", isDefault=");
        sb2.append(this.f439884f);
        sb2.append(", addressType=");
        sb2.append(this.f439885g);
        sb2.append(", indexInBlock=");
        sb2.append(this.f439886h);
        sb2.append(", _addressStringOneLine=");
        return C22026a.c(sb2, this.f439887i, ')');
    }

    public /* synthetic */ C48901b(String str, String str2, C48902c c48902c, String str3, Long l12, boolean z12, AddressType addressType, int i12, String str4, int i13, C42822w c42822w) {
        this(str, str2, c48902c, str3, (i13 & 16) != 0 ? null : l12, (i13 & 32) != 0 ? false : z12, (i13 & 64) != 0 ? AddressType.f161963b : addressType, i12, (i13 & 256) != 0 ? null : str4);
    }
}
