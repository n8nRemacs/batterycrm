package com.avito.android.mortgage.root.list.items.team;

import KZ.H;
import KZ.I;
import a10.InterfaceC19664a;
import a10.InterfaceC19665b;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.conveyor_item.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: TeamItem.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/root/list/items/team/c;", "La10/b;", "La10/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class c implements InterfaceC19665b, InterfaceC19664a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f202854b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f202855c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final List<I> f202856d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final H f202857e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f202858f;

    public c(@Y61.k String str, @Y61.k String str2, @Y61.k List<I> list, @Y61.l H h12, boolean z12) {
        this.f202854b = str;
        this.f202855c = str2;
        this.f202856d = list;
        this.f202857e = h12;
        this.f202858f = z12;
    }

    @Override // a10.InterfaceC19664a
    @Y61.k
    public final InterfaceC19665b N() {
        return new c(this.f202854b, this.f202855c, this.f202856d, this.f202857e, false);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f202854b, cVar.f202854b) && L.f(this.f202855c, cVar.f202855c) && L.f(this.f202856d, cVar.f202856d) && L.f(this.f202857e, cVar.f202857e) && this.f202858f == cVar.f202858f;
    }

    @Override // a10.InterfaceC19664a
    /* renamed from: getEnabled, reason: from getter */
    public final boolean getF202412e() {
        return this.f202858f;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF79005b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF183757b() {
        return this.f202854b;
    }

    public final int hashCode() {
        int iE2 = androidx.compose.foundation.H.e(androidx.compose.foundation.H.d(this.f202854b.hashCode() * 31, 31, this.f202855c), 31, this.f202856d);
        H h12 = this.f202857e;
        return Boolean.hashCode(this.f202858f) + ((iE2 + (h12 == null ? 0 : h12.hashCode())) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TeamItem(stringId=");
        sb2.append(this.f202854b);
        sb2.append(", title=");
        sb2.append(this.f202855c);
        sb2.append(", members=");
        sb2.append(this.f202856d);
        sb2.append(", manager=");
        sb2.append(this.f202857e);
        sb2.append(", enabled=");
        return r.x(sb2, this.f202858f, ')');
    }

    public /* synthetic */ c(String str, String str2, List list, H h12, boolean z12, int i12, C42822w c42822w) {
        this(str, str2, list, h12, (i12 & 16) != 0 ? true : z12);
    }
}
