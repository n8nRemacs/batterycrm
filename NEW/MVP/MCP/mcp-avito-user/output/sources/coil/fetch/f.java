package coil.fetch;

import android.graphics.drawable.Drawable;
import androidx.appcompat.app.r;
import coil.decode.DataSource;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FetchResult.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil/fetch/f;", "Lcoil/fetch/g;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class f extends g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Drawable f58385a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f58386b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final DataSource f58387c;

    public f(@Y61.k Drawable drawable, boolean z12, @Y61.k DataSource dataSource) {
        super(null);
        this.f58385a = drawable;
        this.f58386b = z12;
        this.f58387c = dataSource;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (L.f(this.f58385a, fVar.f58385a) && this.f58386b == fVar.f58386b && this.f58387c == fVar.f58387c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f58387c.hashCode() + r.i(this.f58385a.hashCode() * 31, 31, this.f58386b);
    }
}
