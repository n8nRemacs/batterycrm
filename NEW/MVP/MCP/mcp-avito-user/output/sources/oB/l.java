package oB;

import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ExtendedProfileWidgetAction.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LoB/l;", "LoB/k;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class l implements k {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final DeepLink f419517b;

    public l(@Y61.k DeepLink deepLink) {
        this.f419517b = deepLink;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && L.f(this.f419517b, ((l) obj).f419517b);
    }

    public final int hashCode() {
        return this.f419517b.hashCode();
    }

    @Y61.k
    public final String toString() {
        return com.avito.android.actions_sheet.a.v(new StringBuilder("FloatingBuyBlockItemAction(deepLink="), this.f419517b, ')');
    }
}
