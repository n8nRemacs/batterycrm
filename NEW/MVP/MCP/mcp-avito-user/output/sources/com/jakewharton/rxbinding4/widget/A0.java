package com.jakewharton.rxbinding4.widget;

import kotlin.Metadata;

/* compiled from: TextViewBeforeTextChangeEventObservable.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/jakewharton/rxbinding4/widget/A0;", "", "rxbinding_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes7.dex */
public final /* data */ class A0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final CharSequence f364190a;

    /* renamed from: b, reason: collision with root package name */
    public final int f364191b;

    /* renamed from: c, reason: collision with root package name */
    public final int f364192c;

    /* renamed from: d, reason: collision with root package name */
    public final int f364193d;

    public A0(int i12, int i13, int i14, @Y61.k CharSequence charSequence) {
        this.f364190a = charSequence;
        this.f364191b = i12;
        this.f364192c = i13;
        this.f364193d = i14;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A0)) {
            return false;
        }
        A0 a02 = (A0) obj;
        a02.getClass();
        return kotlin.jvm.internal.L.f(null, null) && this.f364190a.equals(a02.f364190a) && this.f364191b == a02.f364191b && this.f364192c == a02.f364192c && this.f364193d == a02.f364193d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f364193d) + androidx.appcompat.app.r.e(this.f364192c, androidx.appcompat.app.r.e(this.f364191b, this.f364190a.hashCode() * 31, 31), 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TextViewBeforeTextChangeEvent(view=null, text=");
        sb2.append(this.f364190a);
        sb2.append(", start=");
        sb2.append(this.f364191b);
        sb2.append(", count=");
        sb2.append(this.f364192c);
        sb2.append(", after=");
        return AK.c.i(this.f364193d, ")", sb2);
    }
}
