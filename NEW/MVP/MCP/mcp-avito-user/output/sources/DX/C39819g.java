package dx;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.category_parameters.DistrictParameter;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Api2NdTrxDevelopmentsSearchGetResponse.kt */
@P
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u000f\u001a\u0004\b\u001c\u0010\u0011¨\u0006\u001d"}, d2 = {"Ldx/g;", "", "", "distance", "Ldx/h;", "distanceInTime", DistrictParameter.TYPE, "", "id", "", "Ldx/i;", "lines", "name", "<init>", "(Ljava/lang/String;Ldx/h;Ljava/lang/String;JLjava/util/List;Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Ldx/h;", "b", "()Ldx/h;", "c", "J", "d", "()J", "Ljava/util/List;", "e", "()Ljava/util/List;", "f", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: dx.g, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C39819g {

    @com.google.gson.annotations.c("distance")
    @k
    private final String distance;

    @com.google.gson.annotations.c("distanceInTime")
    @l
    private final C39820h distanceInTime;

    @com.google.gson.annotations.c(DistrictParameter.TYPE)
    @l
    private final String district;

    @com.google.gson.annotations.c("id")
    private final long id;

    @com.google.gson.annotations.c("lines")
    @k
    private final List<C39821i> lines;

    @com.google.gson.annotations.c("name")
    @k
    private final String name;

    public C39819g(@k String str, @l C39820h c39820h, @l String str2, long j12, @k List<C39821i> list, @k String str3) {
        this.distance = str;
        this.distanceInTime = c39820h;
        this.district = str2;
        this.id = j12;
        this.lines = list;
        this.name = str3;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final String getDistance() {
        return this.distance;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final C39820h getDistanceInTime() {
        return this.distanceInTime;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final String getDistrict() {
        return this.district;
    }

    /* renamed from: d, reason: from getter */
    public final long getId() {
        return this.id;
    }

    @k
    public final List<C39821i> e() {
        return this.lines;
    }

    @k
    /* renamed from: f, reason: from getter */
    public final String getName() {
        return this.name;
    }
}
