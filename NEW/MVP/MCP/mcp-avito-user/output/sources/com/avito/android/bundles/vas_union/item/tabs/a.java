package com.avito.android.bundles.vas_union.item.tabs;

import Y61.l;
import androidx.appcompat.app.r;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: Tab.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bundles/vas_union/item/tabs/a;", "", "_avito_vas-bundles_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f108664a;

    /* renamed from: b, reason: collision with root package name */
    public final int f108665b;

    public a(@Y61.k String str, int i12) {
        this.f108664a = str;
        this.f108665b = i12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f108664a, aVar.f108664a) && this.f108665b == aVar.f108665b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f108665b) + (this.f108664a.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Tab(title=");
        sb2.append(this.f108664a);
        sb2.append(", position=");
        return r.t(sb2, this.f108665b, ')');
    }
}
