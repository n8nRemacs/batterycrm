package qu;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FavoritesSyncDao.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lqu/a;", "", "_avito-discouraged_persistence_favorite"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: qu.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* data */ class C47445a {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final String f429466a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f429467b;

    public C47445a(@l String str, @l String str2) {
        this.f429466a = str;
        this.f429467b = str2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C47445a)) {
            return false;
        }
        C47445a c47445a = (C47445a) obj;
        return L.f(this.f429466a, c47445a.f429466a) && L.f(this.f429467b, c47445a.f429467b);
    }

    public final int hashCode() {
        String str = this.f429466a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f429467b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FavoriteData(xHash=");
        sb2.append(this.f429466a);
        sb2.append(", analyticsSource=");
        return C22026a.c(sb2, this.f429467b, ')');
    }
}
