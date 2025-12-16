package com.avito.android.mortgage.root.list.items.borrower_add;

import Y61.k;
import Y61.l;
import a10.InterfaceC19664a;
import a10.InterfaceC19665b;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BorrowerAddItem.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/root/list/items/borrower_add/c;", "La10/b;", "La10/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class c implements InterfaceC19665b, InterfaceC19664a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f202460b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f202461c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f202462d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f202463e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f202464f;

    public /* synthetic */ c(String str, String str2, String str3, boolean z12, boolean z13, int i12, C42822w c42822w) {
        this(str, str2, (i12 & 8) != 0 ? false : z12, str3, (i12 & 16) != 0 ? true : z13);
    }

    public static c a(c cVar, int i12) {
        String str = cVar.f202460b;
        String str2 = cVar.f202461c;
        String str3 = cVar.f202462d;
        boolean z12 = (i12 & 8) != 0 ? cVar.f202463e : true;
        boolean z13 = (i12 & 16) != 0 ? cVar.f202464f : false;
        cVar.getClass();
        return new c(str, str2, z12, str3, z13);
    }

    @Override // a10.InterfaceC19664a
    @k
    public final InterfaceC19665b N() {
        return a(this, 15);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f202460b, cVar.f202460b) && L.f(this.f202461c, cVar.f202461c) && L.f(this.f202462d, cVar.f202462d) && this.f202463e == cVar.f202463e && this.f202464f == cVar.f202464f;
    }

    @Override // a10.InterfaceC19664a
    /* renamed from: getEnabled, reason: from getter */
    public final boolean getF202669d() {
        return this.f202464f;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF85003b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF170076b() {
        return this.f202460b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f202464f) + r.i(H.d(H.d(this.f202460b.hashCode() * 31, 31, this.f202461c), 31, this.f202462d), 31, this.f202463e);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BorrowerAddItem(stringId=");
        sb2.append(this.f202460b);
        sb2.append(", title=");
        sb2.append(this.f202461c);
        sb2.append(", description=");
        sb2.append(this.f202462d);
        sb2.append(", isLoading=");
        sb2.append(this.f202463e);
        sb2.append(", enabled=");
        return r.x(sb2, this.f202464f, ')');
    }

    public c(@k String str, @k String str2, boolean z12, @k String str3, boolean z13) {
        this.f202460b = str;
        this.f202461c = str2;
        this.f202462d = str3;
        this.f202463e = z12;
        this.f202464f = z13;
    }
}
