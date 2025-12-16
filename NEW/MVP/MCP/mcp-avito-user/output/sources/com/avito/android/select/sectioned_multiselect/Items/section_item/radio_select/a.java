package com.avito.android.select.sectioned_multiselect.Items.section_item.radio_select;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SectionSelectItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select/sectioned_multiselect/Items/section_item/radio_select/a;", "Lcom/avito/conveyor_item/a;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f266350b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f266351c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f266352d;

    public a(@k String str, @k String str2, boolean z12) {
        this.f266350b = str;
        this.f266351c = str2;
        this.f266352d = z12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f266350b, aVar.f266350b) && L.f(this.f266351c, aVar.f266351c) && this.f266352d == aVar.f266352d;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF83054c() {
        return getF199668b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF199668b() {
        return this.f266350b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f266352d) + H.d(this.f266350b.hashCode() * 31, 31, this.f266351c);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SectionSelectItem(stringId=");
        sb2.append(this.f266350b);
        sb2.append(", title=");
        sb2.append(this.f266351c);
        sb2.append(", selected=");
        return r.x(sb2, this.f266352d, ')');
    }
}
