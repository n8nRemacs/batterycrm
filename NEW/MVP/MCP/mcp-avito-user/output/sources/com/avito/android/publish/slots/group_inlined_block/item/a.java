package com.avito.android.publish.slots.group_inlined_block.item;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.items.ItemWithState;
import com.avito.conveyor_item.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: GroupInlinedBlockItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/slots/group_inlined_block/item/a;", "Lcom/avito/android/items/ItemWithState;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class a implements ItemWithState {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f244024b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f244025c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f244026d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final List<com.avito.conveyor_item.a> f244027e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public ItemWithState.State f244028f;

    /* JADX WARN: Multi-variable type inference failed */
    public a(@k String str, @l String str2, @l String str3, @l List<? extends com.avito.conveyor_item.a> list, @k ItemWithState.State state) {
        this.f244024b = str;
        this.f244025c = str2;
        this.f244026d = str3;
        this.f244027e = list;
        this.f244028f = state;
    }

    @Override // com.avito.android.items.ItemWithState
    public final void O0(@k ItemWithState.State state) {
        this.f244028f = state;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f244024b, aVar.f244024b) && L.f(this.f244025c, aVar.f244025c) && L.f(this.f244026d, aVar.f244026d) && L.f(this.f244027e, aVar.f244027e) && L.f(this.f244028f, aVar.f244028f);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF207600b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.android.items.ItemWithState
    @k
    /* renamed from: getState, reason: from getter */
    public final ItemWithState.State getF244801h() {
        return this.f244028f;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF243329b() {
        return this.f244024b;
    }

    public final int hashCode() {
        int iHashCode = this.f244024b.hashCode() * 31;
        String str = this.f244025c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f244026d;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<com.avito.conveyor_item.a> list = this.f244027e;
        return this.f244028f.hashCode() + ((iHashCode3 + (list != null ? list.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        return "GroupInlinedBlockItem(stringId=" + this.f244024b + ", title=" + this.f244025c + ", tooltipText=" + this.f244026d + ", params=" + this.f244027e + ", state=" + this.f244028f + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ a(String str, String str2, String str3, List list, ItemWithState.State state, int i12, C42822w c42822w) {
        if ((i12 & 16) != 0) {
            state = new ItemWithState.State.Normal(null, 1, 0 == true ? 1 : 0);
        }
        this(str, str2, str3, list, state);
    }
}
