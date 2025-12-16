package Hg0;

import java.util.Map;
import kotlin.Metadata;

/* compiled from: Api11ProfileRatingsGetResponse.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B0\u0012\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u00040\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tR+\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u00040\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u0011"}, d2 = {"LHg0/z;", "", "", "", "LX41/o;", "params", "title", "urlPath", "<init>", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/util/Map;", "a", "()Ljava/util/Map;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class z {

    @com.google.gson.annotations.c("params")
    @Y61.k
    private final Map<String, Object> params;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final String title;

    @com.google.gson.annotations.c("urlPath")
    @Y61.k
    private final String urlPath;

    public z(@Y61.k Map<String, Object> map, @Y61.k String str, @Y61.k String str2) {
        this.params = map;
        this.title = str;
        this.urlPath = str2;
    }

    @Y61.k
    public final Map<String, Object> a() {
        return this.params;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final String getUrlPath() {
        return this.urlPath;
    }
}
