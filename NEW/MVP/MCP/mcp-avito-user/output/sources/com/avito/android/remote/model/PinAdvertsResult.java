package com.avito.android.remote.model;

import Y61.k;
import Y61.l;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: PinAdvertsResult.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B)\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/remote/model/PinAdvertsResult;", "", "items", "", "Lcom/avito/android/remote/model/SerpElement;", "displayType", "Lcom/avito/android/remote/model/SerpDisplayType;", "floatingContainer", "Lcom/avito/android/remote/model/PinFloatingContainer;", "(Ljava/util/List;Lcom/avito/android/remote/model/SerpDisplayType;Lcom/avito/android/remote/model/PinFloatingContainer;)V", "getDisplayType", "()Lcom/avito/android/remote/model/SerpDisplayType;", "getFloatingContainer", "()Lcom/avito/android/remote/model/PinFloatingContainer;", "getItems", "()Ljava/util/List;", "_avito-discouraged_avito-api_search-map"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class PinAdvertsResult {

    @c("displayType")
    @l
    private final SerpDisplayType displayType;

    @c("buttons")
    @l
    private final PinFloatingContainer floatingContainer;

    @c("items")
    @k
    private final List<SerpElement> items;

    /* JADX WARN: Multi-variable type inference failed */
    public PinAdvertsResult(@k List<? extends SerpElement> list, @l SerpDisplayType serpDisplayType, @l PinFloatingContainer pinFloatingContainer) {
        this.items = list;
        this.displayType = serpDisplayType;
        this.floatingContainer = pinFloatingContainer;
    }

    @l
    public final SerpDisplayType getDisplayType() {
        return this.displayType;
    }

    @l
    public final PinFloatingContainer getFloatingContainer() {
        return this.floatingContainer;
    }

    @k
    public final List<SerpElement> getItems() {
        return this.items;
    }

    public /* synthetic */ PinAdvertsResult(List list, SerpDisplayType serpDisplayType, PinFloatingContainer pinFloatingContainer, int i12, C42822w c42822w) {
        this(list, serpDisplayType, (i12 & 4) != 0 ? null : pinFloatingContainer);
    }
}
