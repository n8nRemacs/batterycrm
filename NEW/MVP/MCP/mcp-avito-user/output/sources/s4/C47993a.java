package s4;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import j.U;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TopBarAnchorsContainerStyle.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ls4/a;", "", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: s4.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final /* data */ class C47993a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f437458a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f437459b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f437460c;

    /* renamed from: d, reason: collision with root package name */
    public final int f437461d;

    public C47993a(@k String str, @k String str2, @l String str3, @U int i12) {
        this.f437458a = str;
        this.f437459b = str2;
        this.f437460c = str3;
        this.f437461d = i12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C47993a)) {
            return false;
        }
        C47993a c47993a = (C47993a) obj;
        return L.f(this.f437458a, c47993a.f437458a) && L.f(this.f437459b, c47993a.f437459b) && L.f(this.f437460c, c47993a.f437460c) && this.f437461d == c47993a.f437461d;
    }

    public final int hashCode() {
        int iD2 = H.d(this.f437458a.hashCode() * 31, 31, this.f437459b);
        String str = this.f437460c;
        return Integer.hashCode(this.f437461d) + ((iD2 + (str == null ? 0 : str.hashCode())) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TopBarAnchorsContainerStyle(normalButtonStyle=");
        sb2.append(this.f437458a);
        sb2.append(", highlightedButtonStyle=");
        sb2.append(this.f437459b);
        sb2.append(", theme=");
        sb2.append(this.f437460c);
        sb2.append(", horizontalOffset=");
        return r.t(sb2, this.f437461d, ')');
    }
}
