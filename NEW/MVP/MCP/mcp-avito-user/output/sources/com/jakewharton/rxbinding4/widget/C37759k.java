package com.jakewharton.rxbinding4.widget;

import android.view.View;
import android.widget.AdapterView;
import kotlin.Metadata;

/* compiled from: AdapterViewSelectionEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/jakewharton/rxbinding4/widget/k;", "Lcom/jakewharton/rxbinding4/widget/n;", "rxbinding_release"}, k = 1, mv = {1, 4, 0})
/* renamed from: com.jakewharton.rxbinding4.widget.k, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final /* data */ class C37759k extends AbstractC37762n {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final AdapterView<?> f364227a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final View f364228b;

    /* renamed from: c, reason: collision with root package name */
    public final int f364229c;

    /* renamed from: d, reason: collision with root package name */
    public final long f364230d;

    public C37759k(@Y61.k AdapterView<?> adapterView, @Y61.l View view, int i12, long j12) {
        super(null);
        this.f364227a = adapterView;
        this.f364228b = view;
        this.f364229c = i12;
        this.f364230d = j12;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37759k)) {
            return false;
        }
        C37759k c37759k = (C37759k) obj;
        return kotlin.jvm.internal.L.f(this.f364227a, c37759k.f364227a) && kotlin.jvm.internal.L.f(this.f364228b, c37759k.f364228b) && this.f364229c == c37759k.f364229c && this.f364230d == c37759k.f364230d;
    }

    public final int hashCode() {
        AdapterView<?> adapterView = this.f364227a;
        int iHashCode = (adapterView != null ? adapterView.hashCode() : 0) * 31;
        View view = this.f364228b;
        return Long.hashCode(this.f364230d) + androidx.appcompat.app.r.e(this.f364229c, (iHashCode + (view != null ? view.hashCode() : 0)) * 31, 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdapterViewItemSelectionEvent(view=");
        sb2.append(this.f364227a);
        sb2.append(", selectedView=");
        sb2.append(this.f364228b);
        sb2.append(", position=");
        sb2.append(this.f364229c);
        sb2.append(", id=");
        return AK.c.j(this.f364230d, ")", sb2);
    }
}
