package bn0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;

/* compiled from: Review.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lbn0/a;", "", "_avito_comfortable-deal-reviews_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: bn0.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* data */ class C25683a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f57436a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f57437b;

    /* renamed from: c, reason: collision with root package name */
    public final int f57438c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f57439d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f57440e;

    public C25683a(@k String str, int i12, @k String str2, @k String str3, @k String str4) {
        this.f57436a = str;
        this.f57437b = str2;
        this.f57438c = i12;
        this.f57439d = str3;
        this.f57440e = str4;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25683a)) {
            return false;
        }
        C25683a c25683a = (C25683a) obj;
        return this.f57436a.equals(c25683a.f57436a) && this.f57437b.equals(c25683a.f57437b) && this.f57438c == c25683a.f57438c && this.f57439d.equals(c25683a.f57439d) && this.f57440e.equals(c25683a.f57440e);
    }

    public final int hashCode() {
        return this.f57440e.hashCode() + H.d(r.e(this.f57438c, H.d(this.f57436a.hashCode() * 31, 31, this.f57437b), 31), 31, this.f57439d);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Review(nameOwner=");
        sb2.append(this.f57436a);
        sb2.append(", realtyDescription=");
        sb2.append(this.f57437b);
        sb2.append(", rating=");
        sb2.append(this.f57438c);
        sb2.append(", extraInformation=");
        sb2.append(this.f57439d);
        sb2.append(", body=");
        return C22026a.c(sb2, this.f57440e, ')');
    }
}
