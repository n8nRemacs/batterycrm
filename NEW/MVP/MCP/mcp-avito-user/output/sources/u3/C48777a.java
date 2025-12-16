package u3;

import aW.InterfaceC19823a;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AbTest.kt */
@InterfaceC19823a
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lu3/a;", "", "_common_ab-tests_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: u3.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final /* data */ class C48777a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f439736a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final C48781e f439737b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f439738c;

    public C48777a(@Y61.k String str, @Y61.l C48781e c48781e, @Y61.l String str2) {
        this.f439736a = str;
        this.f439737b = c48781e;
        this.f439738c = str2;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C48777a)) {
            return false;
        }
        C48777a c48777a = (C48777a) obj;
        return L.f(this.f439736a, c48777a.f439736a) && L.f(this.f439737b, c48777a.f439737b) && L.f(this.f439738c, c48777a.f439738c);
    }

    public final int hashCode() {
        int iHashCode = this.f439736a.hashCode() * 31;
        C48781e c48781e = this.f439737b;
        int iHashCode2 = (iHashCode + (c48781e == null ? 0 : c48781e.hashCode())) * 31;
        String str = this.f439738c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AbTest(testGroup=");
        sb2.append(this.f439736a);
        sb2.append(", analyticParams=");
        sb2.append(this.f439737b);
        sb2.append(", testConfig=");
        return C22026a.c(sb2, this.f439738c, ')');
    }
}
