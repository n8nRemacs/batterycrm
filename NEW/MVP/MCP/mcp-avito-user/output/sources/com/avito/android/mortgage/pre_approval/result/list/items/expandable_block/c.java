package com.avito.android.mortgage.pre_approval.result.list.items.expandable_block;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ExpandableBlockItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/pre_approval/result/list/items/expandable_block/c;", "LT00/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class c implements T00.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f202044b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f202045c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f202046d;

    public c(@k String str, @k String str2, boolean z12) {
        this.f202044b = str;
        this.f202045c = str2;
        this.f202046d = z12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        cVar.getClass();
        return L.f(this.f202044b, cVar.f202044b) && L.f(this.f202045c, cVar.f202045c) && this.f202046d == cVar.f202046d;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF189215e() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public final String getF314301b() {
        return "EXPANDABLE_BLOCK_ID";
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f202046d) + H.d(H.d(1703441384, 31, this.f202044b), 31, this.f202045c);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ExpandableBlockItem(stringId=EXPANDABLE_BLOCK_ID, title=");
        sb2.append(this.f202044b);
        sb2.append(", description=");
        sb2.append(this.f202045c);
        sb2.append(", isExpanded=");
        return r.x(sb2, this.f202046d, ')');
    }
}
