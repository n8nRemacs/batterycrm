package com.avito.android.developments_agency_search.screen.deal_room.adapter.accordion;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AccordionItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_room/adapter/accordion/c;", "Lcom/avito/conveyor_item/a;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f137249b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f137250c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f137251d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f137252e;

    public c(@k String str, @k String str2, boolean z12, boolean z13) {
        this.f137249b = str;
        this.f137250c = str2;
        this.f137251d = z12;
        this.f137252e = z13;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f137249b, cVar.f137249b) && L.f(this.f137250c, cVar.f137250c) && this.f137251d == cVar.f137251d && this.f137252e == cVar.f137252e;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF83558b() {
        return getF296143b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF296143b() {
        return this.f137249b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f137252e) + r.i(H.d(this.f137249b.hashCode() * 31, 31, this.f137250c), 31, this.f137251d);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AccordionItem(stringId=");
        sb2.append(this.f137249b);
        sb2.append(", title=");
        sb2.append(this.f137250c);
        sb2.append(", hideArrowIcon=");
        sb2.append(this.f137251d);
        sb2.append(", isExpanded=");
        return r.x(sb2, this.f137252e, ')');
    }

    public /* synthetic */ c(String str, String str2, boolean z12, boolean z13, int i12, C42822w c42822w) {
        this(str, str2, (i12 & 4) != 0 ? false : z12, z13);
    }
}
