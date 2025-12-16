package com.avito.android.mortgage.root.list.items.issue;

import Y61.k;
import Y61.l;
import a10.InterfaceC19664a;
import a10.InterfaceC19665b;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.api.model.ActionButton;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: IssueItem.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/root/list/items/issue/c;", "La10/b;", "La10/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class c implements InterfaceC19665b, InterfaceC19664a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f202640b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f202641c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f202642d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final ActionButton f202643e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f202644f;

    public c(@k String str, @k String str2, @l String str3, @l ActionButton actionButton, boolean z12) {
        this.f202640b = str;
        this.f202641c = str2;
        this.f202642d = str3;
        this.f202643e = actionButton;
        this.f202644f = z12;
    }

    @Override // a10.InterfaceC19664a
    @k
    public final InterfaceC19665b N() {
        return new c(this.f202640b, this.f202641c, this.f202642d, this.f202643e, false);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f202640b, cVar.f202640b) && L.f(this.f202641c, cVar.f202641c) && L.f(this.f202642d, cVar.f202642d) && L.f(this.f202643e, cVar.f202643e) && this.f202644f == cVar.f202644f;
    }

    @Override // a10.InterfaceC19664a
    /* renamed from: getEnabled, reason: from getter */
    public final boolean getF202481g() {
        return this.f202644f;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF82706b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF202482h() {
        return this.f202640b;
    }

    public final int hashCode() {
        int iD2 = H.d(this.f202640b.hashCode() * 31, 31, this.f202641c);
        String str = this.f202642d;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        ActionButton actionButton = this.f202643e;
        return Boolean.hashCode(this.f202644f) + ((iHashCode + (actionButton != null ? actionButton.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IssueItem(stringId=");
        sb2.append(this.f202640b);
        sb2.append(", title=");
        sb2.append(this.f202641c);
        sb2.append(", description=");
        sb2.append(this.f202642d);
        sb2.append(", action=");
        sb2.append(this.f202643e);
        sb2.append(", enabled=");
        return r.x(sb2, this.f202644f, ')');
    }

    public /* synthetic */ c(String str, String str2, String str3, ActionButton actionButton, boolean z12, int i12, C42822w c42822w) {
        this(str, str2, str3, actionButton, (i12 & 16) != 0 ? true : z12);
    }
}
