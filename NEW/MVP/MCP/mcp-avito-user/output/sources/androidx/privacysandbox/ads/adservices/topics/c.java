package androidx.privacysandbox.ads.adservices.topics;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.camera.camera2.internal.G;
import kotlin.Metadata;

/* compiled from: Topic.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/privacysandbox/ads/adservices/topics/c;", "", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final long f53591a;

    /* renamed from: b, reason: collision with root package name */
    public final long f53592b;

    /* renamed from: c, reason: collision with root package name */
    public final int f53593c;

    public c(long j12, long j13, int i12) {
        this.f53591a = j12;
        this.f53592b = j13;
        this.f53593c = i12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f53591a == cVar.f53591a && this.f53592b == cVar.f53592b && this.f53593c == cVar.f53593c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f53593c) + r.g(Long.hashCode(this.f53591a) * 31, 31, this.f53592b);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TaxonomyVersion=");
        sb2.append(this.f53591a);
        sb2.append(", ModelVersion=");
        sb2.append(this.f53592b);
        sb2.append(", TopicCode=");
        return G.f("Topic { ", AK.c.i(this.f53593c, " }", sb2));
    }
}
