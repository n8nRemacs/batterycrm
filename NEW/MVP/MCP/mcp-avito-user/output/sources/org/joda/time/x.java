package org.joda.time;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import org.joda.convert.ToString;

/* compiled from: Months.java */
/* loaded from: classes7.dex */
public final class x extends org.joda.time.base.m {

    /* renamed from: c, reason: collision with root package name */
    public static final x f421018c = new x(0);

    /* renamed from: d, reason: collision with root package name */
    public static final x f421019d = new x(1);

    /* renamed from: e, reason: collision with root package name */
    public static final x f421020e = new x(2);

    /* renamed from: f, reason: collision with root package name */
    public static final x f421021f = new x(3);

    /* renamed from: g, reason: collision with root package name */
    public static final x f421022g = new x(4);

    /* renamed from: h, reason: collision with root package name */
    public static final x f421023h = new x(5);

    /* renamed from: i, reason: collision with root package name */
    public static final x f421024i = new x(6);

    /* renamed from: j, reason: collision with root package name */
    public static final x f421025j = new x(7);

    /* renamed from: k, reason: collision with root package name */
    public static final x f421026k = new x(8);

    /* renamed from: l, reason: collision with root package name */
    public static final x f421027l = new x(9);

    /* renamed from: m, reason: collision with root package name */
    public static final x f421028m = new x(10);

    /* renamed from: n, reason: collision with root package name */
    public static final x f421029n = new x(11);

    /* renamed from: o, reason: collision with root package name */
    public static final x f421030o = new x(12);

    /* renamed from: p, reason: collision with root package name */
    public static final x f421031p = new x(Integer.MAX_VALUE);

    /* renamed from: q, reason: collision with root package name */
    public static final x f421032q = new x(BeduinInputModel.MIN_TEXT_VERSION);
    private static final long serialVersionUID = 87525275727380867L;

    static {
        org.joda.time.format.q qVarA = org.joda.time.format.k.a();
        D.e();
        qVarA.getClass();
    }

    private Object readResolve() {
        int i12 = this.f420469b;
        if (i12 == Integer.MIN_VALUE) {
            return f421032q;
        }
        if (i12 == Integer.MAX_VALUE) {
            return f421031p;
        }
        switch (i12) {
            case 0:
                return f421018c;
            case 1:
                return f421019d;
            case 2:
                return f421020e;
            case 3:
                return f421021f;
            case 4:
                return f421022g;
            case 5:
                return f421023h;
            case 6:
                return f421024i;
            case 7:
                return f421025j;
            case 8:
                return f421026k;
            case 9:
                return f421027l;
            case 10:
                return f421028m;
            case 11:
                return f421029n;
            case 12:
                return f421030o;
            default:
                return new x(i12);
        }
    }

    @Override // org.joda.time.base.m, org.joda.time.N
    public final D a() {
        return D.e();
    }

    @Override // org.joda.time.base.m
    public final AbstractC44872n b() {
        return AbstractC44872n.f420933g;
    }

    @ToString
    public final String toString() {
        return "P" + String.valueOf(this.f420469b) + "M";
    }
}
