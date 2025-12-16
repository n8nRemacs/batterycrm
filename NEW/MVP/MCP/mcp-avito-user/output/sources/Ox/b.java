package ox;

import Y61.l;
import kotlin.Metadata;

/* compiled from: Api3DevelopmentSuggestPostRequest.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lox/b;", "", "", "latitude", "longitude", "", "query", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;)V", "Ljava/lang/Double;", "getLatitude", "()Ljava/lang/Double;", "getLongitude", "Ljava/lang/String;", "getQuery", "()Ljava/lang/String;", "_avito_developments-catalog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class b {

    @com.google.gson.annotations.c("latitude")
    @l
    private final Double latitude;

    @com.google.gson.annotations.c("longitude")
    @l
    private final Double longitude;

    @com.google.gson.annotations.c("query")
    @l
    private final String query;

    public b(@l Double d12, @l Double d13, @l String str) {
        this.latitude = d12;
        this.longitude = d13;
        this.query = str;
    }
}
