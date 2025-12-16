package jz0;

import Y61.k;
import com.avito.android.remote.model.AdvertDetailsBlockIdKt;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: Api4StrSellerOrdersListPostRequest.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ljz0/h;", "", "Ljz0/i;", "pagination", "", "", AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS, "<init>", "(Ljz0/i;Ljava/util/Map;)V", "Ljz0/i;", "getPagination", "()Ljz0/i;", "Ljava/util/Map;", "getParameters", "()Ljava/util/Map;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: jz0.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C42462h {

    @com.google.gson.annotations.c("pagination")
    @k
    private final i pagination;

    @com.google.gson.annotations.c(AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS)
    @k
    private final Map<String, String> parameters;

    public C42462h(@k i iVar, @k Map<String, String> map) {
        this.pagination = iVar;
        this.parameters = map;
    }
}
