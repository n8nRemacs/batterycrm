package com.avito.android.mortgage.root.list.items.legacy_status;

import Y61.k;
import Y61.l;
import a10.InterfaceC19664a;
import a10.InterfaceC19665b;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.root.list.items.legacy_status.c;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PersonalStatusItem.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/root/list/items/legacy_status/d;", "La10/b;", "La10/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class d implements InterfaceC19665b, InterfaceC19664a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f202667b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final c f202668c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f202669d;

    public d(@k String str, @k c cVar, boolean z12) {
        this.f202667b = str;
        this.f202668c = cVar;
        this.f202669d = z12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [com.avito.android.mortgage.root.list.items.legacy_status.c] */
    public static d a(d dVar, c.a aVar, int i12) {
        String str = dVar.f202667b;
        c.a aVar2 = aVar;
        if ((i12 & 2) != 0) {
            aVar2 = dVar.f202668c;
        }
        boolean z12 = (i12 & 4) != 0 ? dVar.f202669d : false;
        dVar.getClass();
        return new d(str, aVar2, z12);
    }

    @Override // a10.InterfaceC19664a
    @k
    public final InterfaceC19665b N() {
        return a(this, null, 3);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f202667b, dVar.f202667b) && L.f(this.f202668c, dVar.f202668c) && this.f202669d == dVar.f202669d;
    }

    @Override // a10.InterfaceC19664a
    /* renamed from: getEnabled, reason: from getter */
    public final boolean getF202858f() {
        return this.f202669d;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF83054c() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF199668b() {
        return this.f202667b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f202669d) + ((this.f202668c.hashCode() + (this.f202667b.hashCode() * 31)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PersonalStatusItem(stringId=");
        sb2.append(this.f202667b);
        sb2.append(", content=");
        sb2.append(this.f202668c);
        sb2.append(", enabled=");
        return r.x(sb2, this.f202669d, ')');
    }

    public /* synthetic */ d(String str, c cVar, boolean z12, int i12, C42822w c42822w) {
        this(str, cVar, (i12 & 4) != 0 ? true : z12);
    }
}
