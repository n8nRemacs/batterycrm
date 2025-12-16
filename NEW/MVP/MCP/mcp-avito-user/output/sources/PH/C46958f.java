package pH;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.UniversalImage;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: GigSlotState.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LpH/f;", "", "_avito_gig_slot-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: pH.f, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final /* data */ class C46958f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final String f428339a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f428340b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final UniversalImage f428341c;

    public C46958f(@Y61.l String str, @Y61.l String str2, @Y61.l UniversalImage universalImage) {
        this.f428339a = str;
        this.f428340b = str2;
        this.f428341c = universalImage;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C46958f)) {
            return false;
        }
        C46958f c46958f = (C46958f) obj;
        return L.f(this.f428339a, c46958f.f428339a) && L.f(this.f428340b, c46958f.f428340b) && L.f(this.f428341c, c46958f.f428341c);
    }

    public final int hashCode() {
        String str = this.f428339a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f428340b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        UniversalImage universalImage = this.f428341c;
        return iHashCode2 + (universalImage != null ? universalImage.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GigHeaderState(title=");
        sb2.append(this.f428339a);
        sb2.append(", description=");
        sb2.append(this.f428340b);
        sb2.append(", icon=");
        return com.avito.android.advert.item.delivery_suggests.l.s(sb2, this.f428341c, ')');
    }
}
