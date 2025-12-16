package fx;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.FontStyleKt;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Api3NdTrxSearchParamsGetResponse.kt */
@P
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u001a\b\u0007\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R(\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001f\u001a\u0004\b\"\u0010!R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u001f\u001a\u0004\b#\u0010!R\u001a\u0010\u000f\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0018\u001a\u0004\b$\u0010\u001a¨\u0006%"}, d2 = {"Lfx/j;", "", "", FontStyleKt.BOLD, "", "", "bound", "", "id", "latitude", "longitude", "", "name", "prepositionalName", "regionName", "zoom", "<init>", "(ZLjava/util/List;JDDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "Z", "getBold", "()Z", "Ljava/util/List;", "a", "()Ljava/util/List;", "J", "b", "()J", "D", "getLatitude", "()D", "getLongitude", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "getPrepositionalName", "getRegionName", "getZoom", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class j {

    @com.google.gson.annotations.c(FontStyleKt.BOLD)
    private final boolean bold;

    @com.google.gson.annotations.c("bound")
    @Y61.l
    private final List<List<Double>> bound;

    @com.google.gson.annotations.c("id")
    private final long id;

    @com.google.gson.annotations.c("latitude")
    private final double latitude;

    @com.google.gson.annotations.c("longitude")
    private final double longitude;

    @com.google.gson.annotations.c("name")
    @Y61.k
    private final String name;

    @com.google.gson.annotations.c("prepositionalName")
    @Y61.l
    private final String prepositionalName;

    @com.google.gson.annotations.c("regionName")
    @Y61.l
    private final String regionName;

    @com.google.gson.annotations.c("zoom")
    private final long zoom;

    /* JADX WARN: Multi-variable type inference failed */
    public j(boolean z12, @Y61.l List<? extends List<Double>> list, long j12, double d12, double d13, @Y61.k String str, @Y61.l String str2, @Y61.l String str3, long j13) {
        this.bold = z12;
        this.bound = list;
        this.id = j12;
        this.latitude = d12;
        this.longitude = d13;
        this.name = str;
        this.prepositionalName = str2;
        this.regionName = str3;
        this.zoom = j13;
    }

    @Y61.l
    public final List<List<Double>> a() {
        return this.bound;
    }

    /* renamed from: b, reason: from getter */
    public final long getId() {
        return this.id;
    }
}
