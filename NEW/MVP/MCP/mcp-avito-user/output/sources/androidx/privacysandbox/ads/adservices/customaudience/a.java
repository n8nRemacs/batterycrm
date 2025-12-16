package androidx.privacysandbox.ads.adservices.customaudience;

import Y61.k;
import Y61.l;
import android.net.Uri;
import java.time.Instant;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CustomAudience.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/privacysandbox/ads/adservices/customaudience/a;", "", "a", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Q1.c f53516a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f53517b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Uri f53518c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Uri f53519d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final List<Q1.a> f53520e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final Instant f53521f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final Instant f53522g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final Q1.b f53523h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final e f53524i;

    /* compiled from: CustomAudience.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/privacysandbox/ads/adservices/customaudience/a$a;", "", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.privacysandbox.ads.adservices.customaudience.a$a, reason: collision with other inner class name */
    public static final class C1889a {
    }

    public a() {
        throw null;
    }

    public a(Q1.c cVar, String str, Uri uri, Uri uri2, List list, Instant instant, Instant instant2, Q1.b bVar, e eVar, int i12, C42822w c42822w) {
        instant = (i12 & 32) != 0 ? null : instant;
        instant2 = (i12 & 64) != 0 ? null : instant2;
        bVar = (i12 & 128) != 0 ? null : bVar;
        eVar = (i12 & 256) != 0 ? null : eVar;
        this.f53516a = cVar;
        this.f53517b = str;
        this.f53518c = uri;
        this.f53519d = uri2;
        this.f53520e = list;
        this.f53521f = instant;
        this.f53522g = instant2;
        this.f53523h = bVar;
        this.f53524i = eVar;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f53516a, aVar.f53516a) && L.f(this.f53517b, aVar.f53517b) && L.f(this.f53521f, aVar.f53521f) && L.f(this.f53522g, aVar.f53522g) && L.f(this.f53518c, aVar.f53518c) && L.f(this.f53523h, aVar.f53523h) && L.f(this.f53524i, aVar.f53524i) && L.f(this.f53520e, aVar.f53520e);
    }

    public final int hashCode() {
        this.f53516a.getClass();
        throw null;
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CustomAudience: buyer=");
        Uri uri = this.f53519d;
        sb2.append(uri);
        sb2.append(", activationTime=");
        sb2.append(this.f53521f);
        sb2.append(", expirationTime=");
        sb2.append(this.f53522g);
        sb2.append(", dailyUpdateUri=");
        sb2.append(this.f53518c);
        sb2.append(", userBiddingSignals=");
        sb2.append(this.f53523h);
        sb2.append(", trustedBiddingSignals=");
        sb2.append(this.f53524i);
        sb2.append(", biddingLogicUri=");
        sb2.append(uri);
        sb2.append(", ads=");
        sb2.append(this.f53520e);
        return sb2.toString();
    }
}
