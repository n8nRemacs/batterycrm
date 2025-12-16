package com.avito.android.vas_performance.ui.items.tabs;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: Tab.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_performance/ui/items/tabs/a;", "", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f321766a;

    /* renamed from: b, reason: collision with root package name */
    public final int f321767b;

    public a(@k String str, int i12) {
        this.f321766a = str;
        this.f321767b = i12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f321766a, aVar.f321766a) && this.f321767b == aVar.f321767b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f321767b) + (this.f321766a.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Tab(title=");
        sb2.append(this.f321766a);
        sb2.append(", position=");
        return r.t(sb2, this.f321767b, ')');
    }
}
