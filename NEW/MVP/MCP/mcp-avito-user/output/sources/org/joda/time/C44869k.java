package org.joda.time;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import org.joda.convert.ToString;

/* compiled from: Days.java */
/* renamed from: org.joda.time.k, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C44869k extends org.joda.time.base.m {

    /* renamed from: c, reason: collision with root package name */
    public static final C44869k f420919c = new C44869k(0);

    /* renamed from: d, reason: collision with root package name */
    public static final C44869k f420920d = new C44869k(1);

    /* renamed from: e, reason: collision with root package name */
    public static final C44869k f420921e = new C44869k(2);

    /* renamed from: f, reason: collision with root package name */
    public static final C44869k f420922f = new C44869k(3);

    /* renamed from: g, reason: collision with root package name */
    public static final C44869k f420923g = new C44869k(4);

    /* renamed from: h, reason: collision with root package name */
    public static final C44869k f420924h = new C44869k(5);

    /* renamed from: i, reason: collision with root package name */
    public static final C44869k f420925i = new C44869k(6);

    /* renamed from: j, reason: collision with root package name */
    public static final C44869k f420926j = new C44869k(7);

    /* renamed from: k, reason: collision with root package name */
    public static final C44869k f420927k = new C44869k(Integer.MAX_VALUE);

    /* renamed from: l, reason: collision with root package name */
    public static final C44869k f420928l = new C44869k(BeduinInputModel.MIN_TEXT_VERSION);
    private static final long serialVersionUID = 87525275727380865L;

    static {
        org.joda.time.format.q qVarA = org.joda.time.format.k.a();
        D.a();
        qVarA.getClass();
    }

    private Object readResolve() {
        int i12 = this.f420469b;
        if (i12 == Integer.MIN_VALUE) {
            return f420928l;
        }
        if (i12 == Integer.MAX_VALUE) {
            return f420927k;
        }
        switch (i12) {
            case 0:
                return f420919c;
            case 1:
                return f420920d;
            case 2:
                return f420921e;
            case 3:
                return f420922f;
            case 4:
                return f420923g;
            case 5:
                return f420924h;
            case 6:
                return f420925i;
            case 7:
                return f420926j;
            default:
                return new C44869k(i12);
        }
    }

    @Override // org.joda.time.base.m, org.joda.time.N
    public final D a() {
        return D.a();
    }

    @Override // org.joda.time.base.m
    public final AbstractC44872n b() {
        return AbstractC44872n.f420935i;
    }

    @ToString
    public final String toString() {
        return "P" + String.valueOf(this.f420469b) + "D";
    }
}
