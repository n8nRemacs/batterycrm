package com.avito.android.loyalty.ui.badge_details;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BadgeDetailsArgs.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/loyalty/ui/badge_details/b;", "", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ArrayList f183249a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final a f183250b;

    public b(@k ArrayList arrayList, @l a aVar) {
        this.f183249a = arrayList;
        this.f183250b = aVar;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f183249a.equals(bVar.f183249a) && L.f(this.f183250b, bVar.f183250b);
    }

    public final int hashCode() {
        int iHashCode = this.f183249a.hashCode() * 31;
        a aVar = this.f183250b;
        return iHashCode + (aVar == null ? 0 : aVar.hashCode());
    }

    @k
    public final String toString() {
        return "BadgeDetailsArgs(items=" + this.f183249a + ", action=" + this.f183250b + ')';
    }
}
