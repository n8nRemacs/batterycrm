package org.joda.time;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import org.joda.convert.ToString;

/* compiled from: Seconds.java */
/* loaded from: classes7.dex */
public final class O extends org.joda.time.base.m {

    /* renamed from: c, reason: collision with root package name */
    public static final O f420438c = new O(0);

    /* renamed from: d, reason: collision with root package name */
    public static final O f420439d = new O(1);

    /* renamed from: e, reason: collision with root package name */
    public static final O f420440e = new O(2);

    /* renamed from: f, reason: collision with root package name */
    public static final O f420441f = new O(3);

    /* renamed from: g, reason: collision with root package name */
    public static final O f420442g = new O(Integer.MAX_VALUE);

    /* renamed from: h, reason: collision with root package name */
    public static final O f420443h = new O(BeduinInputModel.MIN_TEXT_VERSION);
    private static final long serialVersionUID = 87525275727380862L;

    static {
        org.joda.time.format.q qVarA = org.joda.time.format.k.a();
        D.f();
        qVarA.getClass();
    }

    private Object readResolve() {
        int i12 = this.f420469b;
        return i12 != Integer.MIN_VALUE ? i12 != Integer.MAX_VALUE ? i12 != 0 ? i12 != 1 ? i12 != 2 ? i12 != 3 ? new O(i12) : f420441f : f420440e : f420439d : f420438c : f420442g : f420443h;
    }

    @Override // org.joda.time.base.m, org.joda.time.N
    public final D a() {
        return D.f();
    }

    @Override // org.joda.time.base.m
    public final AbstractC44872n b() {
        return AbstractC44872n.f420939m;
    }

    @ToString
    public final String toString() {
        return "PT" + String.valueOf(this.f420469b) + "S";
    }
}
