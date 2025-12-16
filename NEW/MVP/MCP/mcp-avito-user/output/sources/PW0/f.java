package pw0;

import androidx.appcompat.app.r;
import kotlin.Metadata;

/* compiled from: LoadingState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lpw0/f;", "", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class f {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f428873a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f428874b;

    public f(boolean z12, boolean z13) {
        this.f428873a = z12;
        this.f428874b = z13;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f428873a == fVar.f428873a && this.f428874b == fVar.f428874b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f428874b) + (Boolean.hashCode(this.f428873a) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LoadingState(isLoading=");
        sb2.append(this.f428873a);
        sb2.append(", isLoaderAnimated=");
        return r.x(sb2, this.f428874b, ')');
    }
}
