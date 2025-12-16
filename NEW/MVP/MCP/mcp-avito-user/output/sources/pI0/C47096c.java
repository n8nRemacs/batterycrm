package pi0;

import Y61.l;
import com.avito.android.remote.model.SearchParamsConverterKt;
import kotlin.Metadata;

/* compiled from: Api2NdTrxDevelopmentsSuggestPostRequest.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lpi0/c;", "", "Lpi0/d;", "geo", "", SearchParamsConverterKt.LOCATION_ID, "", "query", "<init>", "(Lpi0/d;Ljava/lang/Long;Ljava/lang/String;)V", "Lpi0/d;", "getGeo", "()Lpi0/d;", "Ljava/lang/Long;", "getLocationId", "()Ljava/lang/Long;", "Ljava/lang/String;", "getQuery", "()Ljava/lang/String;", "_avito_realty-agency_inline-filters_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: pi0.c, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C47096c {

    @com.google.gson.annotations.c("geo")
    @l
    private final C47097d geo;

    @com.google.gson.annotations.c(SearchParamsConverterKt.LOCATION_ID)
    @l
    private final Long locationId;

    @com.google.gson.annotations.c("query")
    @l
    private final String query;

    public C47096c(@l C47097d c47097d, @l Long l12, @l String str) {
        this.geo = c47097d;
        this.locationId = l12;
        this.query = str;
    }
}
