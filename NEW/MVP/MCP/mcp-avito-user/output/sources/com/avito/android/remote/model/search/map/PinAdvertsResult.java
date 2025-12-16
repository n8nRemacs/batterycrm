package com.avito.android.remote.model.search.map;

import Y61.k;
import Y61.l;
import android.net.Uri;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.remote.model.SerpElement;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: PinAdvertsResult.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B3\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/avito/android/remote/model/search/map/PinAdvertsResult;", "", "items", "", "Lcom/avito/android/remote/model/SerpElement;", "nextPage", "Landroid/net/Uri;", "displayType", "Lcom/avito/android/remote/model/SerpDisplayType;", "floatingContainer", "Lcom/avito/android/remote/model/search/map/SerpFloatingContainer;", "(Ljava/util/List;Landroid/net/Uri;Lcom/avito/android/remote/model/SerpDisplayType;Lcom/avito/android/remote/model/search/map/SerpFloatingContainer;)V", "getDisplayType", "()Lcom/avito/android/remote/model/SerpDisplayType;", "getFloatingContainer", "()Lcom/avito/android/remote/model/search/map/SerpFloatingContainer;", "getItems", "()Ljava/util/List;", "getNextPage", "()Landroid/net/Uri;", "_avito-discouraged_avito-api_search"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class PinAdvertsResult {

    @c("displayType")
    @l
    private final SerpDisplayType displayType;

    @c("buttons")
    @l
    private final SerpFloatingContainer floatingContainer;

    @c("items")
    @k
    private final List<SerpElement> items;

    @c("nextPage")
    @l
    private final Uri nextPage;

    /* JADX WARN: Multi-variable type inference failed */
    public PinAdvertsResult(@k List<? extends SerpElement> list, @l Uri uri, @l SerpDisplayType serpDisplayType, @l SerpFloatingContainer serpFloatingContainer) {
        this.items = list;
        this.nextPage = uri;
        this.displayType = serpDisplayType;
        this.floatingContainer = serpFloatingContainer;
    }

    @l
    public final SerpDisplayType getDisplayType() {
        return this.displayType;
    }

    @l
    public final SerpFloatingContainer getFloatingContainer() {
        return this.floatingContainer;
    }

    @k
    public final List<SerpElement> getItems() {
        return this.items;
    }

    @l
    public final Uri getNextPage() {
        return this.nextPage;
    }

    public /* synthetic */ PinAdvertsResult(List list, Uri uri, SerpDisplayType serpDisplayType, SerpFloatingContainer serpFloatingContainer, int i12, C42822w c42822w) {
        this(list, uri, serpDisplayType, (i12 & 8) != 0 ? null : serpFloatingContainer);
    }
}
