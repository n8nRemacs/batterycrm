package com.avito.android.select.sectioned_multiselect.Items.section_list;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MultiselectSectionItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select/sectioned_multiselect/Items/section_list/a;", "Lcom/avito/conveyor_item/a;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f266390b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f266391c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Object f266392d;

    public a(@k String str, @l String str2, @l List<com.avito.android.select.sectioned_multiselect.Items.section_item.a> list) {
        this.f266390b = str;
        this.f266391c = str2;
        this.f266392d = list;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f266390b, aVar.f266390b) && L.f(this.f266391c, aVar.f266391c) && L.f(this.f266392d, aVar.f266392d);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF124042b() {
        return getF265132b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF265132b() {
        return this.f266390b;
    }

    public final int hashCode() {
        int iHashCode = this.f266390b.hashCode() * 31;
        String str = this.f266391c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Object obj = this.f266392d;
        return iHashCode2 + (obj != null ? obj.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MultiselectSectionItem(stringId=");
        sb2.append(this.f266390b);
        sb2.append(", title=");
        sb2.append(this.f266391c);
        sb2.append(", items=");
        return H.n(sb2, this.f266392d, ')');
    }
}
