package org.joda.time;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import org.joda.convert.ToString;

/* compiled from: Minutes.java */
/* renamed from: org.joda.time.v, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C44879v extends org.joda.time.base.m {

    /* renamed from: c, reason: collision with root package name */
    public static final C44879v f421011c = new C44879v(0);

    /* renamed from: d, reason: collision with root package name */
    public static final C44879v f421012d = new C44879v(1);

    /* renamed from: e, reason: collision with root package name */
    public static final C44879v f421013e = new C44879v(2);

    /* renamed from: f, reason: collision with root package name */
    public static final C44879v f421014f = new C44879v(3);

    /* renamed from: g, reason: collision with root package name */
    public static final C44879v f421015g = new C44879v(Integer.MAX_VALUE);

    /* renamed from: h, reason: collision with root package name */
    public static final C44879v f421016h = new C44879v(BeduinInputModel.MIN_TEXT_VERSION);
    private static final long serialVersionUID = 87525275727380863L;

    static {
        org.joda.time.format.q qVarA = org.joda.time.format.k.a();
        D.d();
        qVarA.getClass();
    }

    private Object readResolve() {
        int i12 = this.f420469b;
        return i12 != Integer.MIN_VALUE ? i12 != Integer.MAX_VALUE ? i12 != 0 ? i12 != 1 ? i12 != 2 ? i12 != 3 ? new C44879v(i12) : f421014f : f421013e : f421012d : f421011c : f421015g : f421016h;
    }

    @Override // org.joda.time.base.m, org.joda.time.N
    public final D a() {
        return D.d();
    }

    @Override // org.joda.time.base.m
    public final AbstractC44872n b() {
        return AbstractC44872n.f420938l;
    }

    @ToString
    public final String toString() {
        return "PT" + String.valueOf(this.f420469b) + "M";
    }
}
