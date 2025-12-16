package rp;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.UniversalImage;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PromoModel.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lrp/c;", "", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: rp.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* data */ class C47700c {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final UniversalImage f430196a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f430197b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f430198c;

    public C47700c(@l UniversalImage universalImage, @l String str, @l String str2) {
        this.f430196a = universalImage;
        this.f430197b = str;
        this.f430198c = str2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C47700c)) {
            return false;
        }
        C47700c c47700c = (C47700c) obj;
        return L.f(this.f430196a, c47700c.f430196a) && L.f(this.f430197b, c47700c.f430197b) && L.f(this.f430198c, c47700c.f430198c);
    }

    public final int hashCode() {
        UniversalImage universalImage = this.f430196a;
        int iHashCode = (universalImage == null ? 0 : universalImage.hashCode()) * 31;
        String str = this.f430197b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f430198c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HeaderItem(image=");
        sb2.append(this.f430196a);
        sb2.append(", title=");
        sb2.append(this.f430197b);
        sb2.append(", subtitle=");
        return C22026a.c(sb2, this.f430198c, ')');
    }
}
