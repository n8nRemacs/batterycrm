package com.avito.android.loyalty.ui.criteria.items.header;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: HeaderItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/loyalty/ui/criteria/items/header/c;", "Lcom/avito/conveyor_item/a;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f183505b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f183506c;

    public c(@k String str, @k String str2) {
        this.f183505b = str;
        this.f183506c = str2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f183505b, cVar.f183505b) && L.f(this.f183506c, cVar.f183506c);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF139156b() {
        return getF183297b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF183297b() {
        return this.f183505b;
    }

    public final int hashCode() {
        return this.f183506c.hashCode() + (this.f183505b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HeaderItem(stringId=");
        sb2.append(this.f183505b);
        sb2.append(", title=");
        return C22026a.c(sb2, this.f183506c, ')');
    }
}
