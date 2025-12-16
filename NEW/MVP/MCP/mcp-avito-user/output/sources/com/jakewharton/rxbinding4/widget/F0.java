package com.jakewharton.rxbinding4.widget;

import kotlin.Metadata;

/* compiled from: TextViewTextChangeEventObservable.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/jakewharton/rxbinding4/widget/F0;", "", "rxbinding_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes7.dex */
public final /* data */ class F0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final CharSequence f364201a;

    /* renamed from: b, reason: collision with root package name */
    public final int f364202b;

    /* renamed from: c, reason: collision with root package name */
    public final int f364203c;

    /* renamed from: d, reason: collision with root package name */
    public final int f364204d;

    public F0(int i12, int i13, int i14, @Y61.k CharSequence charSequence) {
        this.f364201a = charSequence;
        this.f364202b = i12;
        this.f364203c = i13;
        this.f364204d = i14;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F0)) {
            return false;
        }
        F0 f02 = (F0) obj;
        f02.getClass();
        return kotlin.jvm.internal.L.f(null, null) && this.f364201a.equals(f02.f364201a) && this.f364202b == f02.f364202b && this.f364203c == f02.f364203c && this.f364204d == f02.f364204d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f364204d) + androidx.appcompat.app.r.e(this.f364203c, androidx.appcompat.app.r.e(this.f364202b, this.f364201a.hashCode() * 31, 31), 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TextViewTextChangeEvent(view=null, text=");
        sb2.append(this.f364201a);
        sb2.append(", start=");
        sb2.append(this.f364202b);
        sb2.append(", before=");
        sb2.append(this.f364203c);
        sb2.append(", count=");
        return AK.c.i(this.f364204d, ")", sb2);
    }
}
