package org.joda.time;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import org.joda.convert.ToString;

/* compiled from: Hours.java */
/* renamed from: org.joda.time.o, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C44873o extends org.joda.time.base.m {

    /* renamed from: c, reason: collision with root package name */
    public static final C44873o f420943c = new C44873o(0);

    /* renamed from: d, reason: collision with root package name */
    public static final C44873o f420944d = new C44873o(1);

    /* renamed from: e, reason: collision with root package name */
    public static final C44873o f420945e = new C44873o(2);

    /* renamed from: f, reason: collision with root package name */
    public static final C44873o f420946f = new C44873o(3);

    /* renamed from: g, reason: collision with root package name */
    public static final C44873o f420947g = new C44873o(4);

    /* renamed from: h, reason: collision with root package name */
    public static final C44873o f420948h = new C44873o(5);

    /* renamed from: i, reason: collision with root package name */
    public static final C44873o f420949i = new C44873o(6);

    /* renamed from: j, reason: collision with root package name */
    public static final C44873o f420950j = new C44873o(7);

    /* renamed from: k, reason: collision with root package name */
    public static final C44873o f420951k = new C44873o(8);

    /* renamed from: l, reason: collision with root package name */
    public static final C44873o f420952l = new C44873o(Integer.MAX_VALUE);

    /* renamed from: m, reason: collision with root package name */
    public static final C44873o f420953m = new C44873o(BeduinInputModel.MIN_TEXT_VERSION);
    private static final long serialVersionUID = 87525275727380864L;

    static {
        org.joda.time.format.q qVarA = org.joda.time.format.k.a();
        D.b();
        qVarA.getClass();
    }

    private Object readResolve() {
        int i12 = this.f420469b;
        if (i12 == Integer.MIN_VALUE) {
            return f420953m;
        }
        if (i12 == Integer.MAX_VALUE) {
            return f420952l;
        }
        switch (i12) {
            case 0:
                return f420943c;
            case 1:
                return f420944d;
            case 2:
                return f420945e;
            case 3:
                return f420946f;
            case 4:
                return f420947g;
            case 5:
                return f420948h;
            case 6:
                return f420949i;
            case 7:
                return f420950j;
            case 8:
                return f420951k;
            default:
                return new C44873o(i12);
        }
    }

    @Override // org.joda.time.base.m, org.joda.time.N
    public final D a() {
        return D.b();
    }

    @Override // org.joda.time.base.m
    public final AbstractC44872n b() {
        return AbstractC44872n.f420937k;
    }

    @ToString
    public final String toString() {
        return "PT" + String.valueOf(this.f420469b) + "H";
    }
}
