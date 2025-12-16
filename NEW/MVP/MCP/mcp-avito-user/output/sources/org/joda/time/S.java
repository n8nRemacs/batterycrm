package org.joda.time;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import org.joda.convert.ToString;

/* compiled from: Weeks.java */
/* loaded from: classes7.dex */
public final class S extends org.joda.time.base.m {

    /* renamed from: c, reason: collision with root package name */
    public static final S f420446c = new S(0);

    /* renamed from: d, reason: collision with root package name */
    public static final S f420447d = new S(1);

    /* renamed from: e, reason: collision with root package name */
    public static final S f420448e = new S(2);

    /* renamed from: f, reason: collision with root package name */
    public static final S f420449f = new S(3);

    /* renamed from: g, reason: collision with root package name */
    public static final S f420450g = new S(Integer.MAX_VALUE);

    /* renamed from: h, reason: collision with root package name */
    public static final S f420451h = new S(BeduinInputModel.MIN_TEXT_VERSION);
    private static final long serialVersionUID = 87525275727380866L;

    static {
        org.joda.time.format.q qVarA = org.joda.time.format.k.a();
        D.g();
        qVarA.getClass();
    }

    private Object readResolve() {
        int i12 = this.f420469b;
        return i12 != Integer.MIN_VALUE ? i12 != Integer.MAX_VALUE ? i12 != 0 ? i12 != 1 ? i12 != 2 ? i12 != 3 ? new S(i12) : f420449f : f420448e : f420447d : f420446c : f420450g : f420451h;
    }

    @Override // org.joda.time.base.m, org.joda.time.N
    public final D a() {
        return D.g();
    }

    @Override // org.joda.time.base.m
    public final AbstractC44872n b() {
        return AbstractC44872n.f420934h;
    }

    @ToString
    public final String toString() {
        return "P" + String.valueOf(this.f420469b) + "W";
    }
}
