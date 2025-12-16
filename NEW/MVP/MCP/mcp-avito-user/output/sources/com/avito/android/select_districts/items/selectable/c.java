package com.avito.android.select_districts.items.selectable;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SelectableDistrictsItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select_districts/items/selectable/c;", "Lcom/avito/conveyor_item/a;", "_avito_select-districts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f266966b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f266967c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f266968d;

    public c(@k String str, @k String str2, boolean z12) {
        this.f266966b = str;
        this.f266967c = str2;
        this.f266968d = z12;
    }

    public static c a(c cVar, boolean z12) {
        String str = cVar.f266966b;
        String str2 = cVar.f266967c;
        cVar.getClass();
        return new c(str, str2, z12);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f266966b, cVar.f266966b) && L.f(this.f266967c, cVar.f266967c) && this.f266968d == cVar.f266968d;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF247713b() {
        return getF265384b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF265384b() {
        return this.f266966b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f266968d) + H.d(this.f266966b.hashCode() * 31, 31, this.f266967c);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SelectableDistrictsItem(stringId=");
        sb2.append(this.f266966b);
        sb2.append(", title=");
        sb2.append(this.f266967c);
        sb2.append(", isChecked=");
        return r.x(sb2, this.f266968d, ')');
    }
}
