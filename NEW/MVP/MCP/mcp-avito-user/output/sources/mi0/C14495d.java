package Mi0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import kotlin.Metadata;

/* compiled from: RecommendationLoaderState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMi0/d;", "", "_avito_recommendation-items-loader_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Mi0.d, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final /* data */ class C14495d {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f11000a;

    public C14495d(boolean z12) {
        this.f11000a = z12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C14495d) && this.f11000a == ((C14495d) obj).f11000a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f11000a);
    }

    @k
    public final String toString() {
        return r.x(new StringBuilder("RecommendationLoaderState(isLoading="), this.f11000a, ')');
    }
}
