package oB;

import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.ProfileRatingAction;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ExtendedProfileWidgetAction.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LoB/y;", "LoB/k;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class y implements k {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ProfileRatingAction f419538b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f419539c;

    public y(@Y61.k ProfileRatingAction profileRatingAction, @Y61.l String str) {
        this.f419538b = profileRatingAction;
        this.f419539c = str;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return L.f(this.f419538b, yVar.f419538b) && L.f(this.f419539c, yVar.f419539c);
    }

    public final int hashCode() {
        int iHashCode = this.f419538b.hashCode() * 31;
        String str = this.f419539c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RatingClickAction(ratingAction=");
        sb2.append(this.f419538b);
        sb2.append(", analytics=");
        return C22026a.c(sb2, this.f419539c, ')');
    }
}
