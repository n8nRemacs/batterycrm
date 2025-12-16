package jK0;

import Y61.k;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ApiViewedEnrichResponse.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"LjK0/a;", "", "", "ok", "", "LjK0/e;", "viewedItems", "", "xHash", "<init>", "(ZLjava/util/List;Ljava/lang/String;)V", "Z", "getOk", "()Z", "Ljava/util/List;", "a", "()Ljava/util/List;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "_avito_user-viewed_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: jK0.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C42271a {

    @com.google.gson.annotations.c("ok")
    private final boolean ok;

    @com.google.gson.annotations.c("viewedItems")
    @k
    private final List<C42275e> viewedItems;

    @com.google.gson.annotations.c("xHash")
    @k
    private final String xHash;

    public C42271a(boolean z12, @k List<C42275e> list, @k String str) {
        this.ok = z12;
        this.viewedItems = list;
        this.xHash = str;
    }

    @k
    public final List<C42275e> a() {
        return this.viewedItems;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final String getXHash() {
        return this.xHash;
    }
}
