package s90;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import kotlin.Metadata;

/* compiled from: ProEnabledInfo.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ls90/a;", "", "_avito_profile-pro_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: s90.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final /* data */ class C48016a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f437498a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f437499b;

    public C48016a(boolean z12, boolean z13) {
        this.f437498a = z12;
        this.f437499b = z13;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C48016a)) {
            return false;
        }
        C48016a c48016a = (C48016a) obj;
        return this.f437498a == c48016a.f437498a && this.f437499b == c48016a.f437499b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f437499b) + (Boolean.hashCode(this.f437498a) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ProEnabledInfo(isPro=");
        sb2.append(this.f437498a);
        sb2.append(", isProfileTab=");
        return r.x(sb2, this.f437499b, ')');
    }
}
