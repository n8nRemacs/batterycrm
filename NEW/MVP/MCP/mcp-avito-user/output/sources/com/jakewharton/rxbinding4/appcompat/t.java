package com.jakewharton.rxbinding4.appcompat;

import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SearchViewQueryTextEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/jakewharton/rxbinding4/appcompat/t;", "", "rxbinding-appcompat_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes7.dex */
public final /* data */ class t {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final CharSequence f364101a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f364102b;

    public t(boolean z12, @Y61.k CharSequence charSequence) {
        this.f364101a = charSequence;
        this.f364102b = z12;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        tVar.getClass();
        return L.f(null, null) && L.f(this.f364101a, tVar.f364101a) && this.f364102b == tVar.f364102b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        CharSequence charSequence = this.f364101a;
        int iHashCode = (charSequence != null ? charSequence.hashCode() : 0) * 31;
        boolean z12 = this.f364102b;
        int i12 = z12;
        if (z12 != 0) {
            i12 = 1;
        }
        return iHashCode + i12;
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SearchViewQueryTextEvent(view=null, queryText=");
        sb2.append(this.f364101a);
        sb2.append(", isSubmitted=");
        return androidx.appcompat.app.r.s(")", sb2, this.f364102b);
    }
}
