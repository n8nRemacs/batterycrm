package oB;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.avito.android.extended_profile_widgets.adapter.carousel.CarouselItem;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ExtendedProfileWidgetAction.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LoB/g;", "LoB/k;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class g implements k {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final CarouselItem f419510b;

    /* renamed from: c, reason: collision with root package name */
    public final int f419511c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final LinearLayoutManager.SavedState f419512d;

    public g(@Y61.k CarouselItem carouselItem, int i12, @Y61.l LinearLayoutManager.SavedState savedState) {
        this.f419510b = carouselItem;
        this.f419511c = i12;
        this.f419512d = savedState;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return L.f(this.f419510b, gVar.f419510b) && this.f419511c == gVar.f419511c && this.f419512d.equals(gVar.f419512d);
    }

    public final int hashCode() {
        return this.f419512d.hashCode() + androidx.appcompat.app.r.e(this.f419511c, this.f419510b.hashCode() * 31, 31);
    }

    @Y61.k
    public final String toString() {
        return "CarouselScrollItemAction(item=" + this.f419510b + ", lastVisiblePosition=" + this.f419511c + ", scrollState=" + this.f419512d + ')';
    }
}
