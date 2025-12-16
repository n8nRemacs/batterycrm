package xQ0;

import androidx.appcompat.app.r;
import kotlin.Metadata;

/* compiled from: MediaSenderState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LxQ0/g;", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class g {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f442488a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f442489b;

    public g(boolean z12, boolean z13) {
        this.f442488a = z12;
        this.f442489b = z13;
    }

    public static g a(g gVar, boolean z12, boolean z13, int i12) {
        if ((i12 & 1) != 0) {
            z12 = gVar.f442488a;
        }
        if ((i12 & 2) != 0) {
            z13 = gVar.f442489b;
        }
        gVar.getClass();
        gVar.getClass();
        return new g(z12, z13);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f442488a == gVar.f442488a && this.f442489b == gVar.f442489b;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + r.i(Boolean.hashCode(this.f442488a) * 31, 31, this.f442489b);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MediaSenderState(sendingAudio=");
        sb2.append(this.f442488a);
        sb2.append(", sendingVideo=");
        return r.s(", onHold=false)", sb2, this.f442489b);
    }
}
