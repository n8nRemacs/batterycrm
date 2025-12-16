package fe0;

import Y61.k;
import Y61.l;
import android.net.Uri;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FileMetaData.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lfe0/a;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: fe0.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final /* data */ class C40408a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Uri f395989a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f395990b;

    /* renamed from: c, reason: collision with root package name */
    public final long f395991c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f395992d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f395993e;

    public C40408a(@k Uri uri, @k String str, long j12, @k String str2, @k String str3) {
        this.f395989a = uri;
        this.f395990b = str;
        this.f395991c = j12;
        this.f395992d = str2;
        this.f395993e = str3;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40408a)) {
            return false;
        }
        C40408a c40408a = (C40408a) obj;
        return L.f(this.f395989a, c40408a.f395989a) && L.f(this.f395990b, c40408a.f395990b) && this.f395991c == c40408a.f395991c && L.f(this.f395992d, c40408a.f395992d) && L.f(this.f395993e, c40408a.f395993e);
    }

    public final int hashCode() {
        return this.f395993e.hashCode() + H.d(r.g(H.d(this.f395989a.hashCode() * 31, 31, this.f395990b), 31, this.f395991c), 31, this.f395992d);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FileMetaData(uri=");
        sb2.append(this.f395989a);
        sb2.append(", id=");
        sb2.append(this.f395990b);
        sb2.append(", size=");
        sb2.append(this.f395991c);
        sb2.append(", name=");
        sb2.append(this.f395992d);
        sb2.append(", type=");
        return C22026a.c(sb2, this.f395993e, ')');
    }
}
