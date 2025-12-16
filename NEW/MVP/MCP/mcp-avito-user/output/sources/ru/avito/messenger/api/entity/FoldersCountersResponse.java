package ru.avito.messenger.api.entity;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FoldersCountersResponse.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R&\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0015\u0010\n¨\u0006\u0016"}, d2 = {"Lru/avito/messenger/api/entity/FoldersCountersResponse;", "", "", "", "", "counters", "entryPointViewType", "<init>", "(Ljava/util/Map;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Map;", "getCounters", "()Ljava/util/Map;", "Ljava/lang/String;", "getEntryPointViewType", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class FoldersCountersResponse {

    @c("folders")
    @k
    private final Map<String, Integer> counters;

    @c("entryPointViewType")
    @l
    private final String entryPointViewType;

    public FoldersCountersResponse(@k Map<String, Integer> map, @l String str) {
        this.counters = map;
        this.entryPointViewType = str;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FoldersCountersResponse)) {
            return false;
        }
        FoldersCountersResponse foldersCountersResponse = (FoldersCountersResponse) other;
        return L.f(this.counters, foldersCountersResponse.counters) && L.f(this.entryPointViewType, foldersCountersResponse.entryPointViewType);
    }

    @k
    public final Map<String, Integer> getCounters() {
        return this.counters;
    }

    @l
    public final String getEntryPointViewType() {
        return this.entryPointViewType;
    }

    public int hashCode() {
        int iHashCode = this.counters.hashCode() * 31;
        String str = this.entryPointViewType;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("FoldersCountersResponse(counters=");
        sb2.append(this.counters);
        sb2.append(", entryPointViewType=");
        return C22026a.c(sb2, this.entryPointViewType, ')');
    }
}
