package Qs;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import kotlin.Metadata;

/* compiled from: JobCrmCounterItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LQs/b;", "", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Qs.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* data */ class C14929b {

    /* renamed from: a, reason: collision with root package name */
    public final int f14020a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f14021b;

    public C14929b(int i12, boolean z12) {
        this.f14020a = i12;
        this.f14021b = z12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14929b)) {
            return false;
        }
        C14929b c14929b = (C14929b) obj;
        return this.f14020a == c14929b.f14020a && this.f14021b == c14929b.f14021b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f14021b) + (Integer.hashCode(this.f14020a) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("JobCrmCounterItem(count=");
        sb2.append(this.f14020a);
        sb2.append(", isViewed=");
        return r.x(sb2, this.f14021b, ')');
    }
}
