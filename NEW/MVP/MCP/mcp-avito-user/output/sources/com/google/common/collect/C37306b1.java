package com.google.common.collect;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

/* compiled from: GeneralRange.java */
@XY0.b
@InterfaceC37329f0
/* renamed from: com.google.common.collect.b1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C37306b1<T> implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final Comparator<? super T> f359647b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f359648c;

    /* renamed from: d, reason: collision with root package name */
    @I41.a
    public final T f359649d;

    /* renamed from: e, reason: collision with root package name */
    public final BoundType f359650e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f359651f;

    /* renamed from: g, reason: collision with root package name */
    @I41.a
    public final T f359652g;

    /* renamed from: h, reason: collision with root package name */
    public final BoundType f359653h;

    /* JADX WARN: Multi-variable type inference failed */
    public C37306b1(Comparator<? super T> comparator, boolean z12, @I41.a T t12, BoundType boundType, boolean z13, @I41.a T t13, BoundType boundType2) {
        comparator.getClass();
        this.f359647b = comparator;
        this.f359648c = z12;
        this.f359651f = z13;
        this.f359649d = t12;
        boundType.getClass();
        this.f359650e = boundType;
        this.f359652g = t13;
        boundType2.getClass();
        this.f359653h = boundType2;
        if (z12) {
            comparator.compare(t12, t12);
        }
        if (z13) {
            comparator.compare(t13, t13);
        }
        if (z12 && z13) {
            int iCompare = comparator.compare(t12, t13);
            com.google.common.base.M.h(iCompare <= 0, "lowerEndpoint (%s) > upperEndpoint (%s)", t12, t13);
            if (iCompare == 0) {
                BoundType boundType3 = BoundType.f359276b;
                com.google.common.base.M.g((boundType == boundType3 && boundType2 == boundType3) ? false : true);
            }
        }
    }

    public final boolean a(@InterfaceC37434x3 T t12) {
        return (d(t12) || c(t12)) ? false : true;
    }

    public final C37306b1<T> b(C37306b1<T> c37306b1) {
        boolean z12;
        int iCompare;
        boolean z13;
        Object obj;
        int iCompare2;
        BoundType boundType;
        Object obj2;
        BoundType boundType2;
        int iCompare3;
        Comparator<? super T> comparator = this.f359647b;
        com.google.common.base.M.g(comparator.equals(c37306b1.f359647b));
        BoundType boundType3 = BoundType.f359276b;
        boolean z14 = c37306b1.f359648c;
        BoundType boundType4 = c37306b1.f359650e;
        Object obj3 = c37306b1.f359649d;
        boolean z15 = this.f359648c;
        if (z15) {
            Object obj4 = this.f359649d;
            if (!z14 || ((iCompare = comparator.compare(obj4, obj3)) >= 0 && !(iCompare == 0 && boundType4 == boundType3))) {
                boundType4 = this.f359650e;
                z12 = z15;
                obj3 = obj4;
            } else {
                z12 = z15;
            }
        } else {
            z12 = z14;
        }
        boolean z16 = c37306b1.f359651f;
        BoundType boundType5 = c37306b1.f359653h;
        Object obj5 = c37306b1.f359652g;
        boolean z17 = this.f359651f;
        if (z17) {
            Object obj6 = this.f359652g;
            if (!z16 || ((iCompare2 = comparator.compare(obj6, obj5)) <= 0 && !(iCompare2 == 0 && boundType5 == boundType3))) {
                boundType5 = this.f359653h;
                z13 = z17;
                obj = obj6;
            } else {
                obj = obj5;
                z13 = z17;
            }
        } else {
            obj = obj5;
            z13 = z16;
        }
        if (z12 && z13 && ((iCompare3 = comparator.compare(obj3, obj)) > 0 || (iCompare3 == 0 && boundType4 == boundType3 && boundType5 == boundType3))) {
            boundType2 = BoundType.f359277c;
            boundType = boundType3;
            obj2 = obj;
        } else {
            boundType = boundType4;
            obj2 = obj3;
            boundType2 = boundType5;
        }
        return new C37306b1<>(this.f359647b, z12, obj2, boundType, z13, obj, boundType2);
    }

    public final boolean c(@InterfaceC37434x3 T t12) {
        if (!this.f359651f) {
            return false;
        }
        int iCompare = this.f359647b.compare(t12, this.f359652g);
        return ((iCompare == 0) & (this.f359653h == BoundType.f359276b)) | (iCompare > 0);
    }

    public final boolean d(@InterfaceC37434x3 T t12) {
        if (!this.f359648c) {
            return false;
        }
        int iCompare = this.f359647b.compare(t12, this.f359649d);
        return ((iCompare == 0) & (this.f359650e == BoundType.f359276b)) | (iCompare < 0);
    }

    public final boolean equals(@I41.a Object obj) {
        if (!(obj instanceof C37306b1)) {
            return false;
        }
        C37306b1 c37306b1 = (C37306b1) obj;
        return this.f359647b.equals(c37306b1.f359647b) && this.f359648c == c37306b1.f359648c && this.f359651f == c37306b1.f359651f && this.f359650e.equals(c37306b1.f359650e) && this.f359653h.equals(c37306b1.f359653h) && com.google.common.base.F.a(this.f359649d, c37306b1.f359649d) && com.google.common.base.F.a(this.f359652g, c37306b1.f359652g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f359647b, this.f359649d, this.f359650e, this.f359652g, this.f359653h});
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f359647b);
        sb2.append(":");
        BoundType boundType = BoundType.f359277c;
        sb2.append(this.f359650e == boundType ? '[' : '(');
        sb2.append(this.f359648c ? this.f359649d : "-∞");
        sb2.append(',');
        sb2.append(this.f359651f ? this.f359652g : "∞");
        sb2.append(this.f359653h == boundType ? ']' : ')');
        return sb2.toString();
    }
}
