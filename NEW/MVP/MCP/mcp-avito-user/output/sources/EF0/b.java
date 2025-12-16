package Ef0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: UploadVideoModel.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LEf0/b;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class b {

    /* renamed from: a, reason: collision with root package name */
    public final long f4136a;

    /* renamed from: b, reason: collision with root package name */
    public final long f4137b;

    public b(long j12, long j13) {
        this.f4136a = j12;
        this.f4137b = j13;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f4136a == bVar.f4136a && this.f4137b == bVar.f4137b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f4137b) + (Long.hashCode(this.f4136a) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UploadVideoModel(currentlyUploadedBytes=");
        sb2.append(this.f4136a);
        sb2.append(", totalBytes=");
        return r.u(sb2, this.f4137b, ')');
    }
}
