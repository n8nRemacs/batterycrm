package com.jakewharton.rxbinding4.recyclerview;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: RecyclerViewScrollEventObservable.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/jakewharton/rxbinding4/recyclerview/k;", "", "rxbinding-recyclerview_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes7.dex */
public final /* data */ class k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f364115a;

    /* renamed from: b, reason: collision with root package name */
    public final int f364116b;

    /* renamed from: c, reason: collision with root package name */
    public final int f364117c;

    public k(@Y61.k RecyclerView recyclerView, int i12, int i13) {
        this.f364115a = recyclerView;
        this.f364116b = i12;
        this.f364117c = i13;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return L.f(this.f364115a, kVar.f364115a) && this.f364116b == kVar.f364116b && this.f364117c == kVar.f364117c;
    }

    public final int hashCode() {
        RecyclerView recyclerView = this.f364115a;
        return Integer.hashCode(this.f364117c) + androidx.appcompat.app.r.e(this.f364116b, (recyclerView != null ? recyclerView.hashCode() : 0) * 31, 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RecyclerViewScrollEvent(view=");
        sb2.append(this.f364115a);
        sb2.append(", dx=");
        sb2.append(this.f364116b);
        sb2.append(", dy=");
        return AK.c.i(this.f364117c, ")", sb2);
    }
}
