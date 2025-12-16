package com.avito.android.comparison.items.diff_switch_item;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import kotlin.Metadata;

/* compiled from: DiffSwitchItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comparison/items/diff_switch_item/a;", "LTV0/a;", "_avito_comparison_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class a implements TV0.a {

    /* renamed from: b, reason: collision with root package name */
    public final long f123929b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f123930c;

    public a(long j12, boolean z12) {
        this.f123929b = j12;
        this.f123930c = z12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f123929b == aVar.f123929b && this.f123930c == aVar.f123930c;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF123929b() {
        return this.f123929b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f123930c) + (Long.hashCode(this.f123929b) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DiffSwitchItem(id=");
        sb2.append(this.f123929b);
        sb2.append(", isChecked=");
        return r.x(sb2, this.f123930c, ')');
    }
}
