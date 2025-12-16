package com.avito.android.edit_carousel.adapter.paging_bar;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import ly.InterfaceC43848a;

/* compiled from: PagingBarItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/edit_carousel/adapter/paging_bar/a;", "Lly/a;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class a implements InterfaceC43848a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f146310b;

    /* renamed from: c, reason: collision with root package name */
    public final long f146311c;

    /* renamed from: d, reason: collision with root package name */
    public final long f146312d;

    public a(String str, long j12, long j13, int i12, C42822w c42822w) {
        this.f146310b = (i12 & 1) != 0 ? "paging_bar_item" : str;
        this.f146311c = j12;
        this.f146312d = j13;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f146310b, aVar.f146310b) && this.f146311c == aVar.f146311c && this.f146312d == aVar.f146312d;
    }

    @Override // TV0.a
    public final long getId() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF146310b() {
        return this.f146310b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f146312d) + r.g(this.f146310b.hashCode() * 31, 31, this.f146311c);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PagingBarItem(stringId=");
        sb2.append(this.f146310b);
        sb2.append(", numberOfPages=");
        sb2.append(this.f146311c);
        sb2.append(", pageSelected=");
        return r.u(sb2, this.f146312d, ')');
    }
}
