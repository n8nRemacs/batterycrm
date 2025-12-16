package com.avito.android.publish.slots.salary_range.item;

import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.items.ItemWithState;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SalaryRangeItem.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/slots/salary_range/item/c;", "Lcom/avito/conveyor_item/a;", "Lcom/avito/android/items/ItemWithState;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class c implements com.avito.conveyor_item.a, ItemWithState {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f244795b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f244796c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f244797d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f244798e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final a f244799f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final a f244800g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public ItemWithState.State f244801h;

    public c(@Y61.k String str, @Y61.k String str2, boolean z12, @l String str3, @Y61.k a aVar, @Y61.k a aVar2, @Y61.k ItemWithState.State state) {
        this.f244795b = str;
        this.f244796c = str2;
        this.f244797d = z12;
        this.f244798e = str3;
        this.f244799f = aVar;
        this.f244800g = aVar2;
        this.f244801h = state;
    }

    @Override // com.avito.android.items.ItemWithState
    public final void O0(@Y61.k ItemWithState.State state) {
        this.f244801h = state;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f244795b, cVar.f244795b) && L.f(this.f244796c, cVar.f244796c) && this.f244797d == cVar.f244797d && L.f(this.f244798e, cVar.f244798e) && L.f(this.f244799f, cVar.f244799f) && L.f(this.f244800g, cVar.f244800g) && L.f(this.f244801h, cVar.f244801h);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF85355b() {
        return getF229520b().hashCode();
    }

    @Override // com.avito.android.items.ItemWithState
    @Y61.k
    /* renamed from: getState, reason: from getter */
    public final ItemWithState.State getF173921f() {
        return this.f244801h;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF229520b() {
        return this.f244795b;
    }

    public final int hashCode() {
        int i12 = r.i(H.d(this.f244795b.hashCode() * 31, 31, this.f244796c), 31, this.f244797d);
        String str = this.f244798e;
        return this.f244801h.hashCode() + ((this.f244800g.hashCode() + ((this.f244799f.hashCode() + ((i12 + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31);
    }

    @Y61.k
    public final String toString() {
        return "SalaryRangeItem(stringId=" + this.f244795b + ", title=" + this.f244796c + ", hideTitle=" + this.f244797d + ", hint=" + this.f244798e + ", from=" + this.f244799f + ", to=" + this.f244800g + ", state=" + this.f244801h + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ c(String str, String str2, boolean z12, String str3, a aVar, a aVar2, ItemWithState.State state, int i12, C42822w c42822w) {
        ItemWithState.State normal;
        if ((i12 & 64) != 0) {
            normal = new ItemWithState.State.Normal(null, 1, 0 == true ? 1 : 0);
        } else {
            normal = state;
        }
        this(str, str2, z12, str3, aVar, aVar2, normal);
    }
}
