package com.avito.android.remote.model.extended.modification;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SelectionItemListUpdateBody.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J#\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/avito/android/remote/model/extended/modification/SelectionItemListUpdateBody;", "", "itemListId", "", "itemIds", "", "(JLjava/util/List;)V", "getItemIds", "()Ljava/util/List;", "getItemListId", "()J", "component1", "component2", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class SelectionItemListUpdateBody {

    @c("itemIds")
    @k
    private final List<Long> itemIds;

    @c("itemListId")
    private final long itemListId;

    public SelectionItemListUpdateBody(long j12, @k List<Long> list) {
        this.itemListId = j12;
        this.itemIds = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SelectionItemListUpdateBody copy$default(SelectionItemListUpdateBody selectionItemListUpdateBody, long j12, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            j12 = selectionItemListUpdateBody.itemListId;
        }
        if ((i12 & 2) != 0) {
            list = selectionItemListUpdateBody.itemIds;
        }
        return selectionItemListUpdateBody.copy(j12, list);
    }

    /* renamed from: component1, reason: from getter */
    public final long getItemListId() {
        return this.itemListId;
    }

    @k
    public final List<Long> component2() {
        return this.itemIds;
    }

    @k
    public final SelectionItemListUpdateBody copy(long itemListId, @k List<Long> itemIds) {
        return new SelectionItemListUpdateBody(itemListId, itemIds);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelectionItemListUpdateBody)) {
            return false;
        }
        SelectionItemListUpdateBody selectionItemListUpdateBody = (SelectionItemListUpdateBody) other;
        return this.itemListId == selectionItemListUpdateBody.itemListId && L.f(this.itemIds, selectionItemListUpdateBody.itemIds);
    }

    @k
    public final List<Long> getItemIds() {
        return this.itemIds;
    }

    public final long getItemListId() {
        return this.itemListId;
    }

    public int hashCode() {
        return this.itemIds.hashCode() + (Long.hashCode(this.itemListId) * 31);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("SelectionItemListUpdateBody(itemListId=");
        sb2.append(this.itemListId);
        sb2.append(", itemIds=");
        return H.p(sb2, this.itemIds, ')');
    }
}
