package Kf;

import Y61.k;
import Y61.l;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AutotekaDirectPurchaseState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LKf/d;", "", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.autoteka.items.directPurchase.c f9593a;

    public d(@k com.avito.android.autoteka.items.directPurchase.c cVar) {
        this.f9593a = cVar;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && L.f(this.f9593a, ((d) obj).f9593a);
    }

    public final int hashCode() {
        return this.f9593a.hashCode();
    }

    @k
    public final String toString() {
        return "AutotekaDirectPurchaseState(directPurchaseItem=" + this.f9593a + ')';
    }
}
