package com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.actions_block;

import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ActionsBlockItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/realty_agency_search/adapter/actions_block/a;", "Lcom/avito/conveyor_item/a;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f138271b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f138272c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f138273d;

    public a(String str, String str2, boolean z12, int i12, C42822w c42822w) {
        this.f138271b = (i12 & 1) != 0 ? "actions_block" : str;
        this.f138272c = str2;
        this.f138273d = z12;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f138271b, aVar.f138271b) && L.f(this.f138272c, aVar.f138272c) && this.f138273d == aVar.f138273d;
    }

    @Override // TV0.a
    public final long getId() {
        return getF138271b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF138271b() {
        return this.f138271b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f138273d) + H.d(this.f138271b.hashCode() * 31, 31, this.f138272c);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ActionsBlockItem(stringId=");
        sb2.append(this.f138271b);
        sb2.append(", sortingType=");
        sb2.append(this.f138272c);
        sb2.append(", isClientModeEnabled=");
        return r.x(sb2, this.f138273d, ')');
    }
}
