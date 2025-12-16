package com.avito.android.short_term_rent.bookingform.page;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FormPageItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/page/c;", "LTV0/a;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class c implements TV0.a {

    /* renamed from: b, reason: collision with root package name */
    public final long f282036b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final List<TV0.a> f282037c;

    /* JADX WARN: Multi-variable type inference failed */
    public c(long j12, @k List<? extends TV0.a> list) {
        this.f282036b = j12;
        this.f282037c = list;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f282036b == cVar.f282036b && L.f(this.f282037c, cVar.f282037c);
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF124042b() {
        return this.f282036b;
    }

    public final int hashCode() {
        return this.f282037c.hashCode() + (Long.hashCode(this.f282036b) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FormPageItem(id=");
        sb2.append(this.f282036b);
        sb2.append(", items=");
        return H.p(sb2, this.f282037c, ')');
    }
}
