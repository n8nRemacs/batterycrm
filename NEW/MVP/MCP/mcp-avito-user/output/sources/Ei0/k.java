package ei0;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.category_parameters.DistrictParameter;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Api2NdTrxLotsSearchGetResponse.kt */
@P
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001B;\u0012\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rR&\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0011\u001a\u0004\b\u001a\u0010\u0013¨\u0006\u001b"}, d2 = {"Lei0/k;", "", "", "", "bound", "", DistrictParameter.TYPE, "", "id", "Lei0/g;", "location", "name", "<init>", "(Ljava/util/List;Ljava/lang/String;JLei0/g;Ljava/lang/String;)V", "Ljava/util/List;", "getBound", "()Ljava/util/List;", "Ljava/lang/String;", "getDistrict", "()Ljava/lang/String;", "J", "a", "()J", "Lei0/g;", "getLocation", "()Lei0/g;", "getName", "_avito_realty-agency_checkerboard_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class k {

    @com.google.gson.annotations.c("bound")
    @Y61.k
    private final List<List<Double>> bound;

    @com.google.gson.annotations.c(DistrictParameter.TYPE)
    @Y61.k
    private final String district;

    @com.google.gson.annotations.c("id")
    private final long id;

    @com.google.gson.annotations.c("location")
    @Y61.k
    private final g location;

    @com.google.gson.annotations.c("name")
    @Y61.k
    private final String name;

    /* JADX WARN: Multi-variable type inference failed */
    public k(@Y61.k List<? extends List<Double>> list, @Y61.k String str, long j12, @Y61.k g gVar, @Y61.k String str2) {
        this.bound = list;
        this.district = str;
        this.id = j12;
        this.location = gVar;
        this.name = str2;
    }

    /* renamed from: a, reason: from getter */
    public final long getId() {
        return this.id;
    }
}
