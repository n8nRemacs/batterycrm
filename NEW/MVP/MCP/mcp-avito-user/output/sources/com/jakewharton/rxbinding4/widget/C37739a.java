package com.jakewharton.rxbinding4.widget;

import kotlin.Metadata;

/* compiled from: AbsListViewScrollEventObservable.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/jakewharton/rxbinding4/widget/a;", "", "rxbinding_release"}, k = 1, mv = {1, 4, 0})
/* renamed from: com.jakewharton.rxbinding4.widget.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final /* data */ class C37739a {

    /* renamed from: a, reason: collision with root package name */
    public final int f364211a;

    /* renamed from: b, reason: collision with root package name */
    public final int f364212b;

    /* renamed from: c, reason: collision with root package name */
    public final int f364213c;

    /* renamed from: d, reason: collision with root package name */
    public final int f364214d;

    public C37739a(int i12, int i13, int i14, int i15) {
        this.f364211a = i12;
        this.f364212b = i13;
        this.f364213c = i14;
        this.f364214d = i15;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37739a)) {
            return false;
        }
        C37739a c37739a = (C37739a) obj;
        c37739a.getClass();
        return kotlin.jvm.internal.L.f(null, null) && this.f364211a == c37739a.f364211a && this.f364212b == c37739a.f364212b && this.f364213c == c37739a.f364213c && this.f364214d == c37739a.f364214d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f364214d) + androidx.appcompat.app.r.e(this.f364213c, androidx.appcompat.app.r.e(this.f364212b, Integer.hashCode(this.f364211a) * 31, 31), 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AbsListViewScrollEvent(view=null, scrollState=");
        sb2.append(this.f364211a);
        sb2.append(", firstVisibleItem=");
        sb2.append(this.f364212b);
        sb2.append(", visibleItemCount=");
        sb2.append(this.f364213c);
        sb2.append(", totalItemCount=");
        return AK.c.i(this.f364214d, ")", sb2);
    }
}
