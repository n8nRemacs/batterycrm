package nl0;

import Y61.k;
import Y61.l;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: SuggestParamsApiV2Request.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B2\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u00060\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR+\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u00060\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lnl0/b;", "", "Lnl0/d;", "navigation", "", "", "LX41/o;", "params", "publishSessionId", "<init>", "(Lnl0/d;Ljava/util/Map;Ljava/lang/String;)V", "Lnl0/d;", "getNavigation", "()Lnl0/d;", "Ljava/util/Map;", "getParams", "()Ljava/util/Map;", "Ljava/lang/String;", "getPublishSessionId", "()Ljava/lang/String;", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: nl0.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C44443b {

    @com.google.gson.annotations.c("navigation")
    @k
    private final d navigation;

    @com.google.gson.annotations.c("params")
    @k
    private final Map<String, Object> params;

    @com.google.gson.annotations.c("publishSessionId")
    @l
    private final String publishSessionId;

    public C44443b(@k d dVar, @k Map<String, Object> map, @l String str) {
        this.navigation = dVar;
        this.params = map;
        this.publishSessionId = str;
    }
}
