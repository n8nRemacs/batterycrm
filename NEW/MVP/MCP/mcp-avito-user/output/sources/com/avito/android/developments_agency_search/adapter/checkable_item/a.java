package com.avito.android.developments_agency_search.adapter.checkable_item;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CheckableItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/adapter/checkable_item/a;", "Lcom/avito/conveyor_item/a;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f136215b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f136216c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f136217d;

    public a(@k String str, @k String str2, boolean z12) {
        this.f136215b = str;
        this.f136216c = str2;
        this.f136217d = z12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f136215b, aVar.f136215b) && L.f(this.f136216c, aVar.f136216c) && this.f136217d == aVar.f136217d;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF123912b() {
        return getF136215b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF136215b() {
        return this.f136215b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f136217d) + H.d(this.f136215b.hashCode() * 31, 31, this.f136216c);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CheckableItem(stringId=");
        sb2.append(this.f136215b);
        sb2.append(", title=");
        sb2.append(this.f136216c);
        sb2.append(", isChecked=");
        return r.x(sb2, this.f136217d, ')');
    }

    public /* synthetic */ a(String str, String str2, boolean z12, int i12, C42822w c42822w) {
        this(str, str2, (i12 & 4) != 0 ? false : z12);
    }
}
