package u80;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import kotlin.Metadata;

/* compiled from: NormalizedRect.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lu80/g;", "", "_avito-discouraged_avito-libs_photo-camera-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class g {
    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        ((g) obj).getClass();
        return Float.compare(0.3f, 0.3f) == 0 && Float.compare(0.3f, 0.3f) == 0 && Float.compare(0.7f, 0.7f) == 0 && Float.compare(0.7f, 0.7f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(0.7f) + r.d(0.7f, r.d(0.3f, Float.hashCode(0.3f) * 31, 31), 31);
    }

    @k
    public final String toString() {
        return "NormalizedRect(left=0.3, top=0.3, right=0.7, bottom=0.7)";
    }
}
