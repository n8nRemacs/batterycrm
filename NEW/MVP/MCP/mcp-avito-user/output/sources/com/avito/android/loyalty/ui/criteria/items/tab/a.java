package com.avito.android.loyalty.ui.criteria.items.tab;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TabItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/loyalty/ui/criteria/items/tab/a;", "Lcom/avito/conveyor_item/a;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f183509b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final List<com.avito.conveyor_item.a> f183510c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f183511d;

    /* JADX WARN: Multi-variable type inference failed */
    public a(@k String str, @k List<? extends com.avito.conveyor_item.a> list, @l String str2) {
        this.f183509b = str;
        this.f183510c = list;
        this.f183511d = str2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f183509b, aVar.f183509b) && L.f(this.f183510c, aVar.f183510c) && L.f(this.f183511d, aVar.f183511d);
    }

    @Override // TV0.a
    public final long getId() {
        return getF163652b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF163652b() {
        return this.f183509b;
    }

    public final int hashCode() {
        int iE2 = H.e(this.f183509b.hashCode() * 31, 31, this.f183510c);
        String str = this.f183511d;
        return iE2 + (str == null ? 0 : str.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TabItem(stringId=");
        sb2.append(this.f183509b);
        sb2.append(", items=");
        sb2.append(this.f183510c);
        sb2.append(", itemToScroll=");
        return C22026a.c(sb2, this.f183511d, ')');
    }
}
