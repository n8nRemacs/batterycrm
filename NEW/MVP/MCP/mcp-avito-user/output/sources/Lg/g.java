package LG;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import kotlin.Metadata;

/* compiled from: SlotV7Response.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"LLG/g;", "", "", "lat", AddressParameter.Value.LNG, "<init>", "(DD)V", "D", "a", "()D", "b", "_avito_gig_slot-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class g {

    @com.google.gson.annotations.c("lat")
    private final double lat;

    @com.google.gson.annotations.c(AddressParameter.Value.LNG)
    private final double lng;

    public g(double d12, double d13) {
        this.lat = d12;
        this.lng = d13;
    }

    /* renamed from: a, reason: from getter */
    public final double getLat() {
        return this.lat;
    }

    /* renamed from: b, reason: from getter */
    public final double getLng() {
        return this.lng;
    }
}
