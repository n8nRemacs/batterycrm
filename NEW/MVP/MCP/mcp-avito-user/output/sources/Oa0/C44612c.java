package oA0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.screens.mvi.q;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SuggestAddressesState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LoA0/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "_avito_suggest-addresses_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: oA0.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* data */ class C44612c extends q {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.suggest_addresses.domain.adapter.chips.c f419485b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final List<com.avito.android.suggest_addresses.domain.adapter.addresses.c> f419486c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final com.avito.android.suggest_addresses.domain.adapter.error.c f419487d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f419488e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f419489f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final String f419490g;

    public C44612c() {
        this(null, null, null, false, false, null, 63, null);
    }

    public static C44612c a(C44612c c44612c, com.avito.android.suggest_addresses.domain.adapter.chips.c cVar, List list, com.avito.android.suggest_addresses.domain.adapter.error.c cVar2, boolean z12, boolean z13, String str, int i12) {
        if ((i12 & 1) != 0) {
            cVar = c44612c.f419485b;
        }
        com.avito.android.suggest_addresses.domain.adapter.chips.c cVar3 = cVar;
        if ((i12 & 2) != 0) {
            list = c44612c.f419486c;
        }
        List list2 = list;
        if ((i12 & 4) != 0) {
            cVar2 = c44612c.f419487d;
        }
        com.avito.android.suggest_addresses.domain.adapter.error.c cVar4 = cVar2;
        if ((i12 & 8) != 0) {
            z12 = c44612c.f419488e;
        }
        boolean z14 = z12;
        if ((i12 & 16) != 0) {
            z13 = c44612c.f419489f;
        }
        boolean z15 = z13;
        if ((i12 & 32) != 0) {
            str = c44612c.f419490g;
        }
        c44612c.getClass();
        return new C44612c(cVar3, list2, cVar4, z14, z15, str);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C44612c)) {
            return false;
        }
        C44612c c44612c = (C44612c) obj;
        return L.f(this.f419485b, c44612c.f419485b) && L.f(this.f419486c, c44612c.f419486c) && L.f(this.f419487d, c44612c.f419487d) && this.f419488e == c44612c.f419488e && this.f419489f == c44612c.f419489f && L.f(this.f419490g, c44612c.f419490g);
    }

    public final int hashCode() {
        int iE2 = H.e(this.f419485b.hashCode() * 31, 31, this.f419486c);
        com.avito.android.suggest_addresses.domain.adapter.error.c cVar = this.f419487d;
        return this.f419490g.hashCode() + r.i(r.i((iE2 + (cVar == null ? 0 : cVar.hashCode())) * 31, 31, this.f419488e), 31, this.f419489f);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SuggestAddressesState(chips=");
        sb2.append(this.f419485b);
        sb2.append(", suggests=");
        sb2.append(this.f419486c);
        sb2.append(", error=");
        sb2.append(this.f419487d);
        sb2.append(", isInputEnabled=");
        sb2.append(this.f419488e);
        sb2.append(", isLoading=");
        sb2.append(this.f419489f);
        sb2.append(", query=");
        return C22026a.c(sb2, this.f419490g, ')');
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C44612c(com.avito.android.suggest_addresses.domain.adapter.chips.c cVar, List list, com.avito.android.suggest_addresses.domain.adapter.error.c cVar2, boolean z12, boolean z13, String str, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? new com.avito.android.suggest_addresses.domain.adapter.chips.c(C42784z0.f406748b, 0 == true ? 1 : 0, 2, 0 == true ? 1 : 0) : cVar, (i12 & 2) != 0 ? C42784z0.f406748b : list, (i12 & 4) == 0 ? cVar2 : null, (i12 & 8) != 0 ? true : z12, (i12 & 16) != 0 ? false : z13, (i12 & 32) != 0 ? "" : str);
    }

    public C44612c(@k com.avito.android.suggest_addresses.domain.adapter.chips.c cVar, @k List<com.avito.android.suggest_addresses.domain.adapter.addresses.c> list, @l com.avito.android.suggest_addresses.domain.adapter.error.c cVar2, boolean z12, boolean z13, @k String str) {
        this.f419485b = cVar;
        this.f419486c = list;
        this.f419487d = cVar2;
        this.f419488e = z12;
        this.f419489f = z13;
        this.f419490g = str;
    }
}
