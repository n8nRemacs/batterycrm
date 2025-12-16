package Fv;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.delivery_location_suggest.Coordinates;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DeliveryLocationSelectedSuggest.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LFv/a;", "", "_avito_delivery-location-suggest_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Fv.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* data */ class C13838a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f6017a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f6018b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Coordinates f6019c;

    public C13838a(@k String str, @k String str2, @l Coordinates coordinates) {
        this.f6017a = str;
        this.f6018b = str2;
        this.f6019c = coordinates;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13838a)) {
            return false;
        }
        C13838a c13838a = (C13838a) obj;
        return L.f(this.f6017a, c13838a.f6017a) && L.f(this.f6018b, c13838a.f6018b) && L.f(this.f6019c, c13838a.f6019c);
    }

    public final int hashCode() {
        int iD2 = H.d(this.f6017a.hashCode() * 31, 31, this.f6018b);
        Coordinates coordinates = this.f6019c;
        return iD2 + (coordinates == null ? 0 : coordinates.hashCode());
    }

    @k
    public final String toString() {
        return "DeliveryLocationSelectedSuggest(city=" + this.f6017a + ", address=" + this.f6018b + ", coordinates=" + this.f6019c + ')';
    }
}
