package oB;

import com.avito.android.extended_profile_widgets.adapter.banner.BannerItem;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ExtendedProfileWidgetAction.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LoB/e;", "LoB/k;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: oB.e, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final /* data */ class C44619e implements k {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final BannerItem f419508b;

    public C44619e(@Y61.k BannerItem bannerItem) {
        this.f419508b = bannerItem;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C44619e) && L.f(this.f419508b, ((C44619e) obj).f419508b);
    }

    public final int hashCode() {
        return this.f419508b.hashCode();
    }

    @Y61.k
    public final String toString() {
        return "BannerItemAction(item=" + this.f419508b + ')';
    }
}
