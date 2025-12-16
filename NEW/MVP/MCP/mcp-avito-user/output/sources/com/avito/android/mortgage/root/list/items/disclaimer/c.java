package com.avito.android.mortgage.root.list.items.disclaimer;

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

/* compiled from: DisclaimerItem.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/root/list/items/disclaimer/c;", "La10/b;", "La10/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class c implements InterfaceC19665b, InterfaceC19664a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f202540b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f202541c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f202542d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f202543e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f202544f;

    public c(@k String str, @k String str2, @k String str3, @k String str4, boolean z12) {
        this.f202540b = str;
        this.f202541c = str2;
        this.f202542d = str3;
        this.f202543e = str4;
        this.f202544f = z12;
    }

    @Override // a10.InterfaceC19664a
    @k
    public final InterfaceC19665b N() {
        return new c(this.f202540b, this.f202541c, this.f202542d, this.f202543e, false);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f202540b, cVar.f202540b) && L.f(this.f202541c, cVar.f202541c) && L.f(this.f202542d, cVar.f202542d) && L.f(this.f202543e, cVar.f202543e) && this.f202544f == cVar.f202544f;
    }

    @Override // a10.InterfaceC19664a
    /* renamed from: getEnabled, reason: from getter */
    public final boolean getF202669d() {
        return this.f202544f;
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
        return this.f202540b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f202544f) + H.d(H.d(H.d(this.f202540b.hashCode() * 31, 31, this.f202541c), 31, this.f202542d), 31, this.f202543e);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DisclaimerItem(stringId=");
        sb2.append(this.f202540b);
        sb2.append(", iconName=");
        sb2.append(this.f202541c);
        sb2.append(", title=");
        sb2.append(this.f202542d);
        sb2.append(", subtitle=");
        sb2.append(this.f202543e);
        sb2.append(", enabled=");
        return r.x(sb2, this.f202544f, ')');
    }

    public /* synthetic */ c(String str, String str2, String str3, String str4, boolean z12, int i12, C42822w c42822w) {
        this(str, str2, str3, str4, (i12 & 16) != 0 ? true : z12);
    }
}
