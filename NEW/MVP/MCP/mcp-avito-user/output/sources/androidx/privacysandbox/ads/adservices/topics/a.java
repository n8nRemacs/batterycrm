package androidx.privacysandbox.ads.adservices.topics;

import Y61.k;
import Y61.l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: GetTopicsRequest.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/privacysandbox/ads/adservices/topics/a;", "", "a", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f53588a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f53589b;

    /* compiled from: GetTopicsRequest.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/privacysandbox/ads/adservices/topics/a$a;", "", "<init>", "()V", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.privacysandbox.ads.adservices.topics.a$a, reason: collision with other inner class name */
    public static final class C1907a {
    }

    public a() {
        this(null, false, 3, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f53588a, aVar.f53588a) && this.f53589b == aVar.f53589b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f53589b) + (this.f53588a.hashCode() * 31);
    }

    @k
    public final String toString() {
        return "GetTopicsRequest: adsSdkName=" + this.f53588a + ", shouldRecordObservation=" + this.f53589b;
    }

    public a(String str, boolean z12, int i12, C42822w c42822w) {
        str = (i12 & 1) != 0 ? "" : str;
        z12 = (i12 & 2) != 0 ? false : z12;
        this.f53588a = str;
        this.f53589b = z12;
    }
}
