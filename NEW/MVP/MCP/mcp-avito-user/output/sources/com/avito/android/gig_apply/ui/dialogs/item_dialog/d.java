package com.avito.android.gig_apply.ui.dialogs.item_dialog;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: GigSlotItemsState.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/gig_apply/ui/dialogs/item_dialog/d;", "", "_avito_gig_slot-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f160010a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<String> f160011b;

    public d() {
        this(null, null, 3, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f160010a, dVar.f160010a) && L.f(this.f160011b, dVar.f160011b);
    }

    public final int hashCode() {
        return this.f160011b.hashCode() + (this.f160010a.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GigSlotItemsState(title=");
        sb2.append(this.f160010a);
        sb2.append(", items=");
        return H.p(sb2, this.f160011b, ')');
    }

    public d(@k String str, @k List<String> list) {
        this.f160010a = str;
        this.f160011b = list;
    }

    public d(String str, List list, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? "" : str, (i12 & 2) != 0 ? C42784z0.f406748b : list);
    }
}
