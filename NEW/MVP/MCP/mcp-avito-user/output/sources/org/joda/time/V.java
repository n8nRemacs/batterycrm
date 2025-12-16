package org.joda.time;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import org.joda.convert.ToString;

/* compiled from: Years.java */
/* loaded from: classes7.dex */
public final class V extends org.joda.time.base.m {

    /* renamed from: c, reason: collision with root package name */
    public static final V f420454c = new V(0);

    /* renamed from: d, reason: collision with root package name */
    public static final V f420455d = new V(1);

    /* renamed from: e, reason: collision with root package name */
    public static final V f420456e = new V(2);

    /* renamed from: f, reason: collision with root package name */
    public static final V f420457f = new V(3);

    /* renamed from: g, reason: collision with root package name */
    public static final V f420458g = new V(Integer.MAX_VALUE);

    /* renamed from: h, reason: collision with root package name */
    public static final V f420459h = new V(BeduinInputModel.MIN_TEXT_VERSION);
    private static final long serialVersionUID = 87525275727380868L;

    static {
        org.joda.time.format.q qVarA = org.joda.time.format.k.a();
        D.h();
        qVarA.getClass();
    }

    private Object readResolve() {
        int i12 = this.f420469b;
        return i12 != Integer.MIN_VALUE ? i12 != Integer.MAX_VALUE ? i12 != 0 ? i12 != 1 ? i12 != 2 ? i12 != 3 ? new V(i12) : f420457f : f420456e : f420455d : f420454c : f420458g : f420459h;
    }

    @Override // org.joda.time.base.m, org.joda.time.N
    public final D a() {
        return D.h();
    }

    @Override // org.joda.time.base.m
    public final AbstractC44872n b() {
        return AbstractC44872n.f420932f;
    }

    @ToString
    public final String toString() {
        return "P" + String.valueOf(this.f420469b) + "Y";
    }
}
