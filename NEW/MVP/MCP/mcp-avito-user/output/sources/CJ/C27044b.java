package cJ;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: Api2HotelByItemIdSearchOffersGetResponse.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B1\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bR&\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"LcJ/b;", "", "", "", "analyticsParams", "LcJ/f;", "filters", "", "LcJ/j;", "items", "<init>", "(Ljava/util/Map;LcJ/f;Ljava/util/List;)V", "Ljava/util/Map;", "getAnalyticsParams", "()Ljava/util/Map;", "LcJ/f;", "getFilters", "()LcJ/f;", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "_avito_hotel_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: cJ.b, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C27044b {

    @com.google.gson.annotations.c("analyticsParams")
    @Y61.k
    private final Map<String, String> analyticsParams;

    @com.google.gson.annotations.c("filters")
    @Y61.k
    private final f filters;

    @com.google.gson.annotations.c("items")
    @Y61.k
    private final List<j> items;

    /* JADX WARN: Multi-variable type inference failed */
    public C27044b(@Y61.k Map<String, String> map, @Y61.k f fVar, @Y61.k List<? extends j> list) {
        this.analyticsParams = map;
        this.filters = fVar;
        this.items = list;
    }
}
