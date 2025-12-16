package TV;

import Y61.k;
import Y61.l;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SearchSubscriptionAuthRequestedEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LTV/b;", "", "_avito-discouraged_avito-libs_saved-searches"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class b {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final Parcelable f15682a;

    public b() {
        this(null, 1, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && L.f(this.f15682a, ((b) obj).f15682a);
    }

    public final int hashCode() {
        Parcelable parcelable = this.f15682a;
        if (parcelable == null) {
            return 0;
        }
        return parcelable.hashCode();
    }

    @k
    public final String toString() {
        return com.avito.android.advert.item.delivery_suggests.l.o(new StringBuilder("SearchSubscriptionAuthRequestedEvent(authResultData="), this.f15682a, ')');
    }

    public b(Parcelable parcelable, int i12, C42822w c42822w) {
        this.f15682a = (i12 & 1) != 0 ? null : parcelable;
    }
}
