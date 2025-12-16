package com.jakewharton.rxbinding4.widget;

import android.view.View;
import android.widget.AdapterView;
import kotlin.Metadata;

/* compiled from: AdapterViewItemClickEventObservable.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/jakewharton/rxbinding4/widget/e;", "", "rxbinding_release"}, k = 1, mv = {1, 4, 0})
/* renamed from: com.jakewharton.rxbinding4.widget.e, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final /* data */ class C37747e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final AdapterView<?> f364219a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final View f364220b;

    /* renamed from: c, reason: collision with root package name */
    public final int f364221c;

    /* renamed from: d, reason: collision with root package name */
    public final long f364222d;

    public C37747e(@Y61.k AdapterView<?> adapterView, @Y61.l View view, int i12, long j12) {
        this.f364219a = adapterView;
        this.f364220b = view;
        this.f364221c = i12;
        this.f364222d = j12;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37747e)) {
            return false;
        }
        C37747e c37747e = (C37747e) obj;
        return kotlin.jvm.internal.L.f(this.f364219a, c37747e.f364219a) && kotlin.jvm.internal.L.f(this.f364220b, c37747e.f364220b) && this.f364221c == c37747e.f364221c && this.f364222d == c37747e.f364222d;
    }

    public final int hashCode() {
        AdapterView<?> adapterView = this.f364219a;
        int iHashCode = (adapterView != null ? adapterView.hashCode() : 0) * 31;
        View view = this.f364220b;
        return Long.hashCode(this.f364222d) + androidx.appcompat.app.r.e(this.f364221c, (iHashCode + (view != null ? view.hashCode() : 0)) * 31, 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdapterViewItemClickEvent(view=");
        sb2.append(this.f364219a);
        sb2.append(", clickedView=");
        sb2.append(this.f364220b);
        sb2.append(", position=");
        sb2.append(this.f364221c);
        sb2.append(", id=");
        return AK.c.j(this.f364222d, ")", sb2);
    }
}
