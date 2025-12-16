package com.jakewharton.rxbinding4.view;

import android.view.View;
import kotlin.Metadata;

/* compiled from: ViewLayoutChangeEventObservable.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/jakewharton/rxbinding4/view/S;", "", "rxbinding_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes7.dex */
public final /* data */ class S {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f364147a;

    /* renamed from: b, reason: collision with root package name */
    public final int f364148b;

    /* renamed from: c, reason: collision with root package name */
    public final int f364149c;

    /* renamed from: d, reason: collision with root package name */
    public final int f364150d;

    /* renamed from: e, reason: collision with root package name */
    public final int f364151e;

    /* renamed from: f, reason: collision with root package name */
    public final int f364152f;

    /* renamed from: g, reason: collision with root package name */
    public final int f364153g;

    /* renamed from: h, reason: collision with root package name */
    public final int f364154h;

    /* renamed from: i, reason: collision with root package name */
    public final int f364155i;

    public S(@Y61.k View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        this.f364147a = view;
        this.f364148b = i12;
        this.f364149c = i13;
        this.f364150d = i14;
        this.f364151e = i15;
        this.f364152f = i16;
        this.f364153g = i17;
        this.f364154h = i18;
        this.f364155i = i19;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S)) {
            return false;
        }
        S s5 = (S) obj;
        return kotlin.jvm.internal.L.f(this.f364147a, s5.f364147a) && this.f364148b == s5.f364148b && this.f364149c == s5.f364149c && this.f364150d == s5.f364150d && this.f364151e == s5.f364151e && this.f364152f == s5.f364152f && this.f364153g == s5.f364153g && this.f364154h == s5.f364154h && this.f364155i == s5.f364155i;
    }

    public final int hashCode() {
        View view = this.f364147a;
        return Integer.hashCode(this.f364155i) + androidx.appcompat.app.r.e(this.f364154h, androidx.appcompat.app.r.e(this.f364153g, androidx.appcompat.app.r.e(this.f364152f, androidx.appcompat.app.r.e(this.f364151e, androidx.appcompat.app.r.e(this.f364150d, androidx.appcompat.app.r.e(this.f364149c, androidx.appcompat.app.r.e(this.f364148b, (view != null ? view.hashCode() : 0) * 31, 31), 31), 31), 31), 31), 31), 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ViewLayoutChangeEvent(view=");
        sb2.append(this.f364147a);
        sb2.append(", left=");
        sb2.append(this.f364148b);
        sb2.append(", top=");
        sb2.append(this.f364149c);
        sb2.append(", right=");
        sb2.append(this.f364150d);
        sb2.append(", bottom=");
        sb2.append(this.f364151e);
        sb2.append(", oldLeft=");
        sb2.append(this.f364152f);
        sb2.append(", oldTop=");
        sb2.append(this.f364153g);
        sb2.append(", oldRight=");
        sb2.append(this.f364154h);
        sb2.append(", oldBottom=");
        return AK.c.i(this.f364155i, ")", sb2);
    }
}
