package To;

import Y61.k;
import Y61.l;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PackToDeeplinkResult.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LTo/b;", "", "_avito_code-check_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Parcelable f15854a;

    public b(@k Parcelable parcelable) {
        this.f15854a = parcelable;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && L.f(this.f15854a, ((b) obj).f15854a);
    }

    public final int hashCode() {
        return this.f15854a.hashCode();
    }

    @k
    public final String toString() {
        return com.avito.android.advert.item.delivery_suggests.l.o(new StringBuilder("PackToDeeplinkResult(result="), this.f15854a, ')');
    }
}
