package qs;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ApiCpxPromoGetLocationsRequest.kt */
@P
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lqs/b;", "", "", "context", "", "parentLocationId", "", "selectedLocationIds", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/util/List;)V", "Ljava/lang/String;", "getContext", "()Ljava/lang/String;", "Ljava/lang/Long;", "getParentLocationId", "()Ljava/lang/Long;", "Ljava/util/List;", "getSelectedLocationIds", "()Ljava/util/List;", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: qs.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C47434b {

    @c("context")
    @k
    private final String context;

    @c("parentLocationId")
    @l
    private final Long parentLocationId;

    @c("selectedLocationIds")
    @k
    private final List<Long> selectedLocationIds;

    public C47434b(@k String str, @l Long l12, @k List<Long> list) {
        this.context = str;
        this.parentLocationId = l12;
        this.selectedLocationIds = list;
    }
}
