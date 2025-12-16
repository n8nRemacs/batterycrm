package ru.avito.messenger.api.entity;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: GetChannelFilters.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u001e\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u001a\u0010\u0015¨\u0006\u001b"}, d2 = {"Lru/avito/messenger/api/entity/GetChannelFilters;", "", "", "", "tags", "excludeTags", "", "unreadOnly", "itemIds", "<init>", "(Ljava/util/Collection;Ljava/util/Collection;Ljava/lang/Boolean;Ljava/util/Collection;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Collection;", "getTags", "()Ljava/util/Collection;", "getExcludeTags", "Ljava/lang/Boolean;", "getUnreadOnly", "()Ljava/lang/Boolean;", "getItemIds", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class GetChannelFilters {

    @k
    private final Collection<String> excludeTags;

    @k
    private final Collection<String> itemIds;

    @k
    private final Collection<String> tags;

    @l
    private final Boolean unreadOnly;

    public GetChannelFilters() {
        this(null, null, null, null, 15, null);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetChannelFilters)) {
            return false;
        }
        GetChannelFilters getChannelFilters = (GetChannelFilters) other;
        return L.f(this.tags, getChannelFilters.tags) && L.f(this.excludeTags, getChannelFilters.excludeTags) && L.f(this.unreadOnly, getChannelFilters.unreadOnly) && L.f(this.itemIds, getChannelFilters.itemIds);
    }

    @k
    public final Collection<String> getExcludeTags() {
        return this.excludeTags;
    }

    @k
    public final Collection<String> getItemIds() {
        return this.itemIds;
    }

    @k
    public final Collection<String> getTags() {
        return this.tags;
    }

    @l
    public final Boolean getUnreadOnly() {
        return this.unreadOnly;
    }

    public int hashCode() {
        int iHashCode = (this.excludeTags.hashCode() + (this.tags.hashCode() * 31)) * 31;
        Boolean bool = this.unreadOnly;
        return this.itemIds.hashCode() + ((iHashCode + (bool == null ? 0 : bool.hashCode())) * 31);
    }

    @k
    public String toString() {
        return "GetChannelFilters(tags=" + this.tags + ", excludeTags=" + this.excludeTags + ", unreadOnly=" + this.unreadOnly + ", itemIds=" + this.itemIds + ')';
    }

    public GetChannelFilters(@k Collection<String> collection, @k Collection<String> collection2, @l Boolean bool, @k Collection<String> collection3) {
        this.tags = collection;
        this.excludeTags = collection2;
        this.unreadOnly = bool;
        this.itemIds = collection3;
    }

    public GetChannelFilters(Collection collection, Collection collection2, Boolean bool, Collection collection3, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? C42784z0.f406748b : collection, (i12 & 2) != 0 ? C42784z0.f406748b : collection2, (i12 & 4) != 0 ? Boolean.FALSE : bool, (i12 & 8) != 0 ? C42784z0.f406748b : collection3);
    }
}
