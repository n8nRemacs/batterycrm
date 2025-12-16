package com.jakewharton.rxbinding4.viewpager;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ViewPagerPageScrolledObservable.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/jakewharton/rxbinding4/viewpager/f;", "", "rxbinding-viewpager_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes7.dex */
public final /* data */ class f {

    /* renamed from: a, reason: collision with root package name */
    public final int f364184a;

    /* renamed from: b, reason: collision with root package name */
    public final float f364185b;

    /* renamed from: c, reason: collision with root package name */
    public final int f364186c;

    public f(float f12, int i12, int i13) {
        this.f364184a = i12;
        this.f364185b = f12;
        this.f364186c = i13;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        fVar.getClass();
        return L.f(null, null) && this.f364184a == fVar.f364184a && Float.compare(this.f364185b, fVar.f364185b) == 0 && this.f364186c == fVar.f364186c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f364186c) + r.d(this.f364185b, Integer.hashCode(this.f364184a) * 31, 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ViewPagerPageScrollEvent(viewPager=null, position=");
        sb2.append(this.f364184a);
        sb2.append(", positionOffset=");
        sb2.append(this.f364185b);
        sb2.append(", positionOffsetPixels=");
        return AK.c.i(this.f364186c, ")", sb2);
    }
}
