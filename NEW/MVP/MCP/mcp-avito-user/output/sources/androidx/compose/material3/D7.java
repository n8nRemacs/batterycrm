package androidx.compose.material3;

import androidx.compose.runtime.internal.C22096n;
import kotlin.Metadata;

/* compiled from: SnackbarHost.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/material3/D7;", "T", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class D7<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Xf f34623a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C22096n f34624b;

    public D7(Xf xf2, @Y61.k C22096n c22096n) {
        this.f34623a = xf2;
        this.f34624b = c22096n;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D7)) {
            return false;
        }
        D7 d72 = (D7) obj;
        return kotlin.jvm.internal.L.f(this.f34623a, d72.f34623a) && this.f34624b.equals(d72.f34624b);
    }

    public final int hashCode() {
        Xf xf2 = this.f34623a;
        return this.f34624b.hashCode() + ((xf2 == null ? 0 : xf2.hashCode()) * 31);
    }

    @Y61.k
    public final String toString() {
        return "FadeInFadeOutAnimationItem(key=" + this.f34623a + ", transition=" + this.f34624b + ')';
    }
}
