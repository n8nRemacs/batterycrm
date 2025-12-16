package ps;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Api1CpaCjmCpxPromoGeoSavePostRequest.kt */
@P
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B9\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\f\u001a\u0004\b\u0015\u0010\u000e¨\u0006\u0016"}, d2 = {"Lps/b;", "", "", "Lps/c;", "autoBidLocations", "Lps/d;", "autoBidMergedLocation", "", "context", "manBidLocations", "<init>", "(Ljava/util/List;Lps/d;Ljava/lang/String;Ljava/util/List;)V", "Ljava/util/List;", "getAutoBidLocations", "()Ljava/util/List;", "Lps/d;", "getAutoBidMergedLocation", "()Lps/d;", "Ljava/lang/String;", "getContext", "()Ljava/lang/String;", "getManBidLocations", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ps.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C47134b {

    @com.google.gson.annotations.c("autoBidLocations")
    @l
    private final List<C47135c> autoBidLocations;

    @com.google.gson.annotations.c("autoBidMergedLocation")
    @l
    private final C47136d autoBidMergedLocation;

    @com.google.gson.annotations.c("context")
    @k
    private final String context;

    @com.google.gson.annotations.c("manBidLocations")
    @l
    private final List<C47135c> manBidLocations;

    public C47134b(@l List<C47135c> list, @l C47136d c47136d, @k String str, @l List<C47135c> list2) {
        this.autoBidLocations = list;
        this.autoBidMergedLocation = c47136d;
        this.context = str;
        this.manBidLocations = list2;
    }
}
