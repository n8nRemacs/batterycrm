package qt0;

import Y61.l;
import android.net.Uri;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SbSpecialistItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lqt0/j;", "Lcom/avito/conveyor_item/a;", "_avito-discouraged_avito-libs_service-booking-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class j implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f429454b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f429455c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f429456d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Uri f429457e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final String f429458f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f429459g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final String f429460h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final Integer f429461i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final String f429462j;

    public j(@Y61.k String str, boolean z12, @Y61.k String str2, @l Uri uri, @Y61.k String str3, @l String str4, @l String str5, @l Integer num, @l String str6) {
        this.f429454b = str;
        this.f429455c = z12;
        this.f429456d = str2;
        this.f429457e = uri;
        this.f429458f = str3;
        this.f429459g = str4;
        this.f429460h = str5;
        this.f429461i = num;
        this.f429462j = str6;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return L.f(this.f429454b, jVar.f429454b) && this.f429455c == jVar.f429455c && L.f(this.f429456d, jVar.f429456d) && L.f(this.f429457e, jVar.f429457e) && L.f(this.f429458f, jVar.f429458f) && L.f(this.f429459g, jVar.f429459g) && L.f(this.f429460h, jVar.f429460h) && L.f(this.f429461i, jVar.f429461i) && L.f(this.f429462j, jVar.f429462j);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF85686c() {
        return getF272880b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF272880b() {
        return this.f429454b;
    }

    public final int hashCode() {
        int iD2 = H.d(r.i(this.f429454b.hashCode() * 31, 31, this.f429455c), 31, this.f429456d);
        Uri uri = this.f429457e;
        int iD3 = H.d((iD2 + (uri == null ? 0 : uri.hashCode())) * 31, 31, this.f429458f);
        String str = this.f429459g;
        int iHashCode = (iD3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f429460h;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f429461i;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.f429462j;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SbSpecialistItem(stringId=");
        sb2.append(this.f429454b);
        sb2.append(", isClickable=");
        sb2.append(this.f429455c);
        sb2.append(", paramId=");
        sb2.append(this.f429456d);
        sb2.append(", avatar=");
        sb2.append(this.f429457e);
        sb2.append(", name=");
        sb2.append(this.f429458f);
        sb2.append(", speciality=");
        sb2.append(this.f429459g);
        sb2.append(", rating=");
        sb2.append(this.f429460h);
        sb2.append(", reviewsCount=");
        sb2.append(this.f429461i);
        sb2.append(", value=");
        return C22026a.c(sb2, this.f429462j, ')');
    }
}
