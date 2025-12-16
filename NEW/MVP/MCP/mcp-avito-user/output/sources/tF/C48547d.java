package tF;

import Y61.l;
import com.avito.android.remote.model.Location;
import java.util.List;
import kotlin.Metadata;

/* compiled from: LocationsResponse.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LtF/d;", "", "", "Lcom/avito/android/remote/model/Location;", "locations", "<init>", "(Ljava/util/List;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "_avito_geo-common_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: tF.d, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C48547d {

    @com.google.gson.annotations.c("locations")
    @l
    private final List<Location> locations;

    public C48547d(@l List<Location> list) {
        this.locations = list;
    }

    @l
    public final List<Location> a() {
        return this.locations;
    }
}
