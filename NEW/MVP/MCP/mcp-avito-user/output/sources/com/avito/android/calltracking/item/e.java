package com.avito.android.calltracking.item;

import androidx.compose.runtime.C22026a;
import com.avito.android.calltracking.remote.model.Call;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CalltrackingItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/calltracking/item/e;", "Lcom/avito/conveyor_item/a;", "_avito_calltracking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class e implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Call f113719b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f113720c;

    public e(Call call, String str, int i12, C42822w c42822w) {
        str = (i12 & 2) != 0 ? "CALLTRACKING_ITEM_ID" : str;
        this.f113719b = call;
        this.f113720c = str;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return L.f(this.f113719b, eVar.f113719b) && L.f(this.f113720c, eVar.f113720c);
    }

    @Override // TV0.a
    public final long getId() {
        return getF113720c().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF113720c() {
        return this.f113720c;
    }

    public final int hashCode() {
        return this.f113720c.hashCode() + (this.f113719b.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CalltrackingItem(call=");
        sb2.append(this.f113719b);
        sb2.append(", stringId=");
        return C22026a.c(sb2, this.f113720c, ')');
    }
}
