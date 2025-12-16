package com.avito.android.developments_agency_search.adapter.horizontal_list;

import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: HorizontalListItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/adapter/horizontal_list/a;", "Lcom/avito/conveyor_item/a;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f136292b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final List<com.avito.conveyor_item.a> f136293c;

    /* renamed from: d, reason: collision with root package name */
    public final int f136294d;

    /* renamed from: e, reason: collision with root package name */
    public final int f136295e;

    /* renamed from: f, reason: collision with root package name */
    public final int f136296f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final Float f136297g;

    /* JADX WARN: Multi-variable type inference failed */
    public a(@Y61.k String str, @Y61.k List<? extends com.avito.conveyor_item.a> list, int i12, int i13, int i14, @l Float f12) {
        this.f136292b = str;
        this.f136293c = list;
        this.f136294d = i12;
        this.f136295e = i13;
        this.f136296f = i14;
        this.f136297g = f12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f136292b, aVar.f136292b) && L.f(this.f136293c, aVar.f136293c) && this.f136294d == aVar.f136294d && this.f136295e == aVar.f136295e && this.f136296f == aVar.f136296f && L.f(this.f136297g, aVar.f136297g);
    }

    @Override // TV0.a
    public final long getId() {
        return getStringId().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    public final String getStringId() {
        return this.f136292b;
    }

    public final int hashCode() {
        int iE2 = r.e(this.f136296f, r.e(this.f136295e, r.e(this.f136294d, H.e(this.f136292b.hashCode() * 31, 31, this.f136293c), 31), 31), 31);
        Float f12 = this.f136297g;
        return iE2 + (f12 == null ? 0 : f12.hashCode());
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HorizontalListItem(stringId=");
        sb2.append(this.f136292b);
        sb2.append(", items=");
        sb2.append(this.f136293c);
        sb2.append(", firstItemLeftPaddingDp=");
        sb2.append(this.f136294d);
        sb2.append(", lastItemRightPaddingDp=");
        sb2.append(this.f136295e);
        sb2.append(", itemGapDp=");
        sb2.append(this.f136296f);
        sb2.append(", fixedWidthRatio=");
        return org.webrtc.h.d(sb2, this.f136297g, ')');
    }

    public /* synthetic */ a(String str, List list, int i12, int i13, int i14, Float f12, int i15, C42822w c42822w) {
        this(str, list, (i15 & 4) != 0 ? 0 : i12, (i15 & 8) != 0 ? 0 : i13, (i15 & 16) != 0 ? 0 : i14, (i15 & 32) != 0 ? null : f12);
    }
}
