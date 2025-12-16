package jx;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.gson.d;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ResidentialComplexResponse.kt */
@d
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u0010\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u0012"}, d2 = {"Ljx/b;", "", "", "id", "", "name", "officialDeveloper", "locationName", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "I", "a", "()I", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "d", "b", "_avito_developments-catalog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: jx.b, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final /* data */ class C42440b {

    @c("id")
    private final int id;

    @c("locationName")
    @k
    private final String locationName;

    @c("name")
    @k
    private final String name;

    @c("officialDeveloper")
    @k
    private final String officialDeveloper;

    public C42440b(int i12, @k String str, @k String str2, @k String str3) {
        this.id = i12;
        this.name = str;
        this.officialDeveloper = str2;
        this.locationName = str3;
    }

    /* renamed from: a, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final String getLocationName() {
        return this.locationName;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final String getOfficialDeveloper() {
        return this.officialDeveloper;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C42440b)) {
            return false;
        }
        C42440b c42440b = (C42440b) obj;
        return this.id == c42440b.id && L.f(this.name, c42440b.name) && L.f(this.officialDeveloper, c42440b.officialDeveloper) && L.f(this.locationName, c42440b.locationName);
    }

    public final int hashCode() {
        return this.locationName.hashCode() + H.d(H.d(Integer.hashCode(this.id) * 31, 31, this.name), 31, this.officialDeveloper);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ResidentialComplexSuggest(id=");
        sb2.append(this.id);
        sb2.append(", name=");
        sb2.append(this.name);
        sb2.append(", officialDeveloper=");
        sb2.append(this.officialDeveloper);
        sb2.append(", locationName=");
        return C22026a.c(sb2, this.locationName, ')');
    }
}
