package os;

import androidx.compose.runtime.internal.P;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: Api1CpaCjmCpxPromoGeoGetDataPostResponse.kt */
@P
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001BA\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\f\u0010\rR&\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019¨\u0006\u001b"}, d2 = {"Los/d;", "", "", "", "Los/g;", "days", "Los/m;", "icon", "Los/z;", "slider", "subTitle", "title", "<init>", "(Ljava/util/Map;Los/m;Los/z;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/util/Map;", "a", "()Ljava/util/Map;", "Los/m;", "b", "()Los/m;", "Los/z;", "c", "()Los/z;", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "e", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class d {

    @com.google.gson.annotations.c("days")
    @Y61.k
    private final Map<String, g> days;

    @com.google.gson.annotations.c("icon")
    @Y61.l
    private final m icon;

    @com.google.gson.annotations.c("slider")
    @Y61.k
    private final z slider;

    @com.google.gson.annotations.c("subTitle")
    @Y61.l
    private final String subTitle;

    @com.google.gson.annotations.c("title")
    @Y61.l
    private final String title;

    public d(@Y61.k Map<String, g> map, @Y61.l m mVar, @Y61.k z zVar, @Y61.l String str, @Y61.l String str2) {
        this.days = map;
        this.icon = mVar;
        this.slider = zVar;
        this.subTitle = str;
        this.title = str2;
    }

    @Y61.k
    public final Map<String, g> a() {
        return this.days;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final m getIcon() {
        return this.icon;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final z getSlider() {
        return this.slider;
    }

    @Y61.l
    /* renamed from: d, reason: from getter */
    public final String getSubTitle() {
        return this.subTitle;
    }

    @Y61.l
    /* renamed from: e, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
