package r0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: VelocityTracker.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lr0/a;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: r0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* data */ class C47470a {

    /* renamed from: a, reason: collision with root package name */
    public long f429558a;

    /* renamed from: b, reason: collision with root package name */
    public float f429559b;

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C47470a)) {
            return false;
        }
        C47470a c47470a = (C47470a) obj;
        return this.f429558a == c47470a.f429558a && Float.compare(this.f429559b, c47470a.f429559b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f429559b) + (Long.hashCode(this.f429558a) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DataPointAtTime(time=");
        sb2.append(this.f429558a);
        sb2.append(", dataPoint=");
        return r.k(')', this.f429559b, sb2);
    }
}
