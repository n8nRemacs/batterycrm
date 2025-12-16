package com.avito.android.publish.items.int_range;

import androidx.compose.runtime.internal.P;
import com.avito.android.items.ItemWithState;
import com.avito.android.remote.model.search.Theme;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: IntRangeItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/items/int_range/b;", "Lcom/avito/android/items/ItemWithState;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class b implements ItemWithState {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f236964b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final a f236965c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final a f236966d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public ItemWithState.State f236967e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final Theme f236968f;

    public b(@Y61.k String str, @Y61.k a aVar, @Y61.k a aVar2, @Y61.k ItemWithState.State state, @Y61.l Theme theme) {
        this.f236964b = str;
        this.f236965c = aVar;
        this.f236966d = aVar2;
        this.f236967e = state;
        this.f236968f = theme;
    }

    @Override // com.avito.android.items.ItemWithState
    public final void O0(@Y61.k ItemWithState.State state) {
        this.f236967e = state;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return L.f(this.f236964b, bVar.f236964b) && L.f(this.f236965c, bVar.f236965c) && L.f(this.f236966d, bVar.f236966d) && L.f(this.f236967e, bVar.f236967e) && this.f236968f == bVar.f236968f;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF395939g() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.android.items.ItemWithState
    @Y61.k
    /* renamed from: getState, reason: from getter */
    public final ItemWithState.State getF244871c() {
        return this.f236967e;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF217853b() {
        return this.f236964b;
    }

    public final int hashCode() {
        int iHashCode = (this.f236967e.hashCode() + ((this.f236966d.hashCode() + ((this.f236965c.hashCode() + (this.f236964b.hashCode() * 31)) * 31)) * 31)) * 31;
        Theme theme = this.f236968f;
        return iHashCode + (theme == null ? 0 : theme.hashCode());
    }

    @Y61.k
    public final String toString() {
        return "IntRangeItem(stringId=" + this.f236964b + ", from=" + this.f236965c + ", to=" + this.f236966d + ", state=" + this.f236967e + ", theme=" + this.f236968f + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ b(String str, a aVar, a aVar2, ItemWithState.State state, Theme theme, int i12, C42822w c42822w) {
        this(str, aVar, aVar2, (i12 & 8) != 0 ? new ItemWithState.State.Normal(null, 1, 0 == true ? 1 : 0) : state, (i12 & 16) != 0 ? null : theme);
    }
}
