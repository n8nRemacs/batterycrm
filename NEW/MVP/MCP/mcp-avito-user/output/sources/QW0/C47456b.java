package qw0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import kotlin.Metadata;

/* compiled from: LoadingViewState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lqw0/b;", "", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: qw0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* data */ class C47456b {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f429508a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f429509b;

    public C47456b(boolean z12, boolean z13) {
        this.f429508a = z12;
        this.f429509b = z13;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C47456b)) {
            return false;
        }
        C47456b c47456b = (C47456b) obj;
        return this.f429508a == c47456b.f429508a && this.f429509b == c47456b.f429509b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f429509b) + (Boolean.hashCode(this.f429508a) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LoadingViewState(isLoaderAnimated=");
        sb2.append(this.f429508a);
        sb2.append(", isLoading=");
        return r.x(sb2, this.f429509b, ')');
    }
}
