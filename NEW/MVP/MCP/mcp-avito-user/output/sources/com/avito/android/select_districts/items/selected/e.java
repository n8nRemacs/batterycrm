package com.avito.android.select_districts.items.selected;

import androidx.appcompat.app.r;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.B0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SelectedDistrictsTagsItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select_districts/items/selected/e;", "Lcom/avito/conveyor_item/a;", "_avito_select-districts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class e implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f266981b;

    /* renamed from: c, reason: collision with root package name */
    public final int f266982c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f266983d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Set<o> f266984e;

    public e() {
        this(null, 0, false, null, 15, null);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return L.f(this.f266981b, eVar.f266981b) && this.f266982c == eVar.f266982c && this.f266983d == eVar.f266983d && L.f(this.f266984e, eVar.f266984e);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF121506b() {
        return getF264886b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF264886b() {
        return this.f266981b;
    }

    public final int hashCode() {
        return this.f266984e.hashCode() + r.i(r.e(this.f266982c, this.f266981b.hashCode() * 31, 31), 31, this.f266983d);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SelectedDistrictsTagsItem(stringId=");
        sb2.append(this.f266981b);
        sb2.append(", minimumShowedItems=");
        sb2.append(this.f266982c);
        sb2.append(", isExpanded=");
        sb2.append(this.f266983d);
        sb2.append(", items=");
        return AK.c.u(sb2, this.f266984e, ')');
    }

    public e(int i12, @Y61.k String str, @Y61.k Set set, boolean z12) {
        this.f266981b = str;
        this.f266982c = i12;
        this.f266983d = z12;
        this.f266984e = set;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public e(String str, int i12, boolean z12, Set set, int i13, C42822w c42822w) {
        str = (i13 & 1) != 0 ? "SelectedDistrictsItem" : str;
        this((i13 & 2) != 0 ? 3 : i12, str, (i13 & 8) != 0 ? B0.f406639b : set, (i13 & 4) != 0 ? false : z12);
    }
}
