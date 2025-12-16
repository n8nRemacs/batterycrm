package com.jakewharton.rxbinding4.widget;

import kotlin.Metadata;

/* compiled from: SearchViewQueryTextEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/jakewharton/rxbinding4/widget/r0;", "", "rxbinding_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes7.dex */
public final /* data */ class r0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f364239a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f364240b;

    public r0(@Y61.k String str, boolean z12) {
        this.f364239a = str;
        this.f364240b = z12;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        r0Var.getClass();
        return kotlin.jvm.internal.L.f(null, null) && kotlin.jvm.internal.L.f(this.f364239a, r0Var.f364239a) && this.f364240b == r0Var.f364240b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        String str = this.f364239a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        boolean z12 = this.f364240b;
        int i12 = z12;
        if (z12 != 0) {
            i12 = 1;
        }
        return iHashCode + i12;
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SearchViewQueryTextEvent(view=null, queryText=");
        sb2.append((CharSequence) this.f364239a);
        sb2.append(", isSubmitted=");
        return androidx.appcompat.app.r.s(")", sb2, this.f364240b);
    }
}
