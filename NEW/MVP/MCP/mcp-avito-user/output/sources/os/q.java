package os;

import androidx.compose.runtime.internal.P;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Api1CpaCjmCpxPromoGeoGetDataPostResponse.kt */
@P
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B+\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\f\u0010\rR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000b\u001a\u0004\b\u000e\u0010\rR\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Los/q;", "", "", "Los/b;", "autoLocations", "Los/r;", "manualLocations", "Los/t;", "mergedLocation", "<init>", "(Ljava/util/List;Ljava/util/List;Los/t;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "b", "Los/t;", "c", "()Los/t;", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class q {

    @com.google.gson.annotations.c("autoLocations")
    @Y61.k
    private final List<C44932b> autoLocations;

    @com.google.gson.annotations.c("manualLocations")
    @Y61.k
    private final List<r> manualLocations;

    @com.google.gson.annotations.c("mergedLocation")
    @Y61.k
    private final t mergedLocation;

    public q(@Y61.k List<C44932b> list, @Y61.k List<r> list2, @Y61.k t tVar) {
        this.autoLocations = list;
        this.manualLocations = list2;
        this.mergedLocation = tVar;
    }

    @Y61.k
    public final List<C44932b> a() {
        return this.autoLocations;
    }

    @Y61.k
    public final List<r> b() {
        return this.manualLocations;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final t getMergedLocation() {
        return this.mergedLocation;
    }
}
