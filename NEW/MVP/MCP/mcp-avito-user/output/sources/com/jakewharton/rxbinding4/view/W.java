package com.jakewharton.rxbinding4.view;

import android.view.View;
import kotlin.Metadata;

/* compiled from: ViewLayoutChangeEventObservable.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/jakewharton/rxbinding4/view/W;", "", "rxbinding_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes7.dex */
public final /* data */ class W {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f364163a;

    /* renamed from: b, reason: collision with root package name */
    public final int f364164b;

    /* renamed from: c, reason: collision with root package name */
    public final int f364165c;

    /* renamed from: d, reason: collision with root package name */
    public final int f364166d;

    /* renamed from: e, reason: collision with root package name */
    public final int f364167e;

    public W(@Y61.k View view, int i12, int i13, int i14, int i15) {
        this.f364163a = view;
        this.f364164b = i12;
        this.f364165c = i13;
        this.f364166d = i14;
        this.f364167e = i15;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof W)) {
            return false;
        }
        W w12 = (W) obj;
        return kotlin.jvm.internal.L.f(this.f364163a, w12.f364163a) && this.f364164b == w12.f364164b && this.f364165c == w12.f364165c && this.f364166d == w12.f364166d && this.f364167e == w12.f364167e;
    }

    public final int hashCode() {
        View view = this.f364163a;
        return Integer.hashCode(this.f364167e) + androidx.appcompat.app.r.e(this.f364166d, androidx.appcompat.app.r.e(this.f364165c, androidx.appcompat.app.r.e(this.f364164b, (view != null ? view.hashCode() : 0) * 31, 31), 31), 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ViewScrollChangeEvent(view=");
        sb2.append(this.f364163a);
        sb2.append(", scrollX=");
        sb2.append(this.f364164b);
        sb2.append(", scrollY=");
        sb2.append(this.f364165c);
        sb2.append(", oldScrollX=");
        sb2.append(this.f364166d);
        sb2.append(", oldScrollY=");
        return AK.c.i(this.f364167e, ")", sb2);
    }
}
