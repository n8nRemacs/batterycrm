package com.avito.android.mortgage.root.list.items.mortgage_progress;

import Y61.k;
import Y61.l;
import a10.InterfaceC19665b;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.conveyor_item.a;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MortgageProgressItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/root/list/items/mortgage_progress/c;", "La10/b;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class c implements InterfaceC19665b {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f202684b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f202685c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ArrayList f202686d;

    /* renamed from: e, reason: collision with root package name */
    public final int f202687e;

    public c(int i12, @k String str, @k String str2, @k ArrayList arrayList) {
        this.f202684b = str;
        this.f202685c = str2;
        this.f202686d = arrayList;
        this.f202687e = i12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f202684b, cVar.f202684b) && L.f(this.f202685c, cVar.f202685c) && this.f202686d.equals(cVar.f202686d) && this.f202687e == cVar.f202687e;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF82706b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF198404b() {
        return this.f202684b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f202687e) + androidx.compose.ui.graphics.colorspace.e.g(this.f202686d, H.d(this.f202684b.hashCode() * 31, 31, this.f202685c), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MortgageProgressItem(stringId=");
        sb2.append(this.f202684b);
        sb2.append(", title=");
        sb2.append(this.f202685c);
        sb2.append(", steps=");
        sb2.append(this.f202686d);
        sb2.append(", currentStepIdx=");
        return r.t(sb2, this.f202687e, ')');
    }
}
