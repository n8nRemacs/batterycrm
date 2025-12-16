package com.avito.android.serp.adapter.vertical_main.vertical_filter.adapter;

import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.search.Filter;
import com.avito.android.serp.adapter.i1;
import com.avito.android.serp.adapter.vertical_main.vertical_filter.adapter.f;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: VerticalSearchFilterFormItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/vertical_filter/adapter/e;", "Lcom/avito/android/serp/adapter/i1;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class e implements i1 {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f273465b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public Filter f273466c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final ItemType f273467d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f273468e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f273469f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final f f273470g;

    /* renamed from: h, reason: collision with root package name */
    public final int f273471h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final String f273472i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final Integer f273473j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f273474k;

    public e(@Y61.k String str, @Y61.l Filter filter, @Y61.k ItemType itemType, boolean z12, boolean z13, @Y61.k f fVar, int i12, @Y61.k String str2, @Y61.l Integer num, boolean z14) {
        this.f273465b = str;
        this.f273466c = filter;
        this.f273467d = itemType;
        this.f273468e = z12;
        this.f273469f = z13;
        this.f273470g = fVar;
        this.f273471h = i12;
        this.f273472i = str2;
        this.f273473j = num;
        this.f273474k = z14;
    }

    @Y61.k
    public final e a(int i12) {
        return new e(this.f273465b, this.f273466c, this.f273467d, this.f273468e, this.f273469f, this.f273470g, i12, this.f273472i, this.f273473j, this.f273474k);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return L.f(this.f273465b, eVar.f273465b) && L.f(this.f273466c, eVar.f273466c) && this.f273467d == eVar.f273467d && this.f273468e == eVar.f273468e && this.f273469f == eVar.f273469f && L.f(this.f273470g, eVar.f273470g) && this.f273471h == eVar.f273471h && L.f(this.f273472i, eVar.f273472i) && L.f(this.f273473j, eVar.f273473j) && this.f273474k == eVar.f273474k;
    }

    @Override // TV0.a
    public final long getId() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF270668c() {
        return this.f273471h;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF270673d() {
        return this.f273465b;
    }

    public final int hashCode() {
        int iHashCode = this.f273465b.hashCode() * 31;
        Filter filter = this.f273466c;
        int iD2 = H.d(r.e(this.f273471h, (this.f273470g.hashCode() + r.i(r.i((this.f273467d.hashCode() + ((iHashCode + (filter == null ? 0 : filter.hashCode())) * 31)) * 31, 31, this.f273468e), 31, this.f273469f)) * 31, 31), 31, this.f273472i);
        Integer num = this.f273473j;
        return Boolean.hashCode(this.f273474k) + ((iD2 + (num != null ? num.hashCode() : 0)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VerticalSearchFilterFormItem(stringId=");
        sb2.append(this.f273465b);
        sb2.append(", filter=");
        sb2.append(this.f273466c);
        sb2.append(", itemType=");
        sb2.append(this.f273467d);
        sb2.append(", isEnabled=");
        sb2.append(this.f273468e);
        sb2.append(", isSelected=");
        sb2.append(this.f273469f);
        sb2.append(", state=");
        sb2.append(this.f273470g);
        sb2.append(", spanCount=");
        sb2.append(this.f273471h);
        sb2.append(", indicatorOfSelectedFilters=");
        sb2.append(this.f273472i);
        sb2.append(", style=");
        sb2.append(this.f273473j);
        sb2.append(", isLegacyTheme=");
        return r.x(sb2, this.f273474k, ')');
    }

    public /* synthetic */ e(String str, Filter filter, ItemType itemType, boolean z12, boolean z13, f fVar, int i12, String str2, Integer num, boolean z14, int i13, C42822w c42822w) {
        this(str, filter, (i13 & 4) != 0 ? ItemType.f273430b : itemType, (i13 & 8) != 0 ? true : z12, (i13 & 16) != 0 ? false : z13, (i13 & 32) != 0 ? f.b.f273476a : fVar, i12, str2, (i13 & 256) != 0 ? null : num, (i13 & 512) != 0 ? false : z14);
    }
}
