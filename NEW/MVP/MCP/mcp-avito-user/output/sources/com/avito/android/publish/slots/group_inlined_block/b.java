package com.avito.android.publish.slots.group_inlined_block;

import androidx.compose.runtime.internal.P;
import com.avito.android.items.ItemWithState;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: GroupInlinedBlockItemPayload.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/slots/group_inlined_block/b;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final List<com.avito.conveyor_item.a> f244009a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final ItemWithState.State f244010b;

    /* JADX WARN: Multi-variable type inference failed */
    public b(@Y61.l List<? extends com.avito.conveyor_item.a> list, @Y61.l ItemWithState.State state) {
        this.f244009a = list;
        this.f244010b = state;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return L.f(this.f244009a, bVar.f244009a) && L.f(this.f244010b, bVar.f244010b);
    }

    public final int hashCode() {
        List<com.avito.conveyor_item.a> list = this.f244009a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        ItemWithState.State state = this.f244010b;
        return iHashCode + (state != null ? state.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        return "GroupInlinedBlockItemPayload(params=" + this.f244009a + ", state=" + this.f244010b + ')';
    }
}
