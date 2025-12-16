package m21;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ResponseError.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lm21/a;", "", "sdk-public-push-core-network_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
/* renamed from: m21.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final /* data */ class C43868a {

    /* renamed from: a, reason: collision with root package name */
    public final int f414279a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f414280b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f414281c;

    public C43868a(int i12, @k String str, @k String str2) {
        this.f414279a = i12;
        this.f414280b = str;
        this.f414281c = str2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C43868a)) {
            return false;
        }
        C43868a c43868a = (C43868a) obj;
        return this.f414279a == c43868a.f414279a && L.f(this.f414280b, c43868a.f414280b) && L.f(this.f414281c, c43868a.f414281c);
    }

    public final int hashCode() {
        return this.f414281c.hashCode() + H.d(Integer.hashCode(this.f414279a) * 31, 31, this.f414280b);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ResponseError(code=");
        sb2.append(this.f414279a);
        sb2.append(", message=");
        sb2.append(this.f414280b);
        sb2.append(", status=");
        return C22026a.c(sb2, this.f414281c, ')');
    }
}
