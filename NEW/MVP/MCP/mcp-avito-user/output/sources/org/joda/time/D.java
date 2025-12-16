package org.joda.time;

import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: PeriodType.java */
/* loaded from: classes7.dex */
public class D implements Serializable {

    /* renamed from: d, reason: collision with root package name */
    public static D f420426d = null;

    /* renamed from: e, reason: collision with root package name */
    public static D f420427e = null;

    /* renamed from: f, reason: collision with root package name */
    public static D f420428f = null;

    /* renamed from: g, reason: collision with root package name */
    public static D f420429g = null;

    /* renamed from: h, reason: collision with root package name */
    public static D f420430h = null;

    /* renamed from: i, reason: collision with root package name */
    public static D f420431i = null;

    /* renamed from: j, reason: collision with root package name */
    public static D f420432j = null;

    /* renamed from: k, reason: collision with root package name */
    public static D f420433k = null;

    /* renamed from: l, reason: collision with root package name */
    public static D f420434l = null;
    private static final long serialVersionUID = 2274324892792009998L;

    /* renamed from: b, reason: collision with root package name */
    public final String f420435b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC44872n[] f420436c;

    static {
        new HashMap(32);
    }

    public D(String str, AbstractC44872n[] abstractC44872nArr) {
        this.f420435b = str;
        this.f420436c = abstractC44872nArr;
    }

    public static D a() {
        D d12 = f420431i;
        if (d12 != null) {
            return d12;
        }
        D d13 = new D("Days", new AbstractC44872n[]{AbstractC44872n.f420935i});
        f420431i = d13;
        return d13;
    }

    public static D b() {
        D d12 = f420432j;
        if (d12 != null) {
            return d12;
        }
        D d13 = new D("Hours", new AbstractC44872n[]{AbstractC44872n.f420937k});
        f420432j = d13;
        return d13;
    }

    public static D d() {
        D d12 = f420433k;
        if (d12 != null) {
            return d12;
        }
        D d13 = new D("Minutes", new AbstractC44872n[]{AbstractC44872n.f420938l});
        f420433k = d13;
        return d13;
    }

    public static D e() {
        D d12 = f420429g;
        if (d12 != null) {
            return d12;
        }
        D d13 = new D("Months", new AbstractC44872n[]{AbstractC44872n.f420933g});
        f420429g = d13;
        return d13;
    }

    public static D f() {
        D d12 = f420434l;
        if (d12 != null) {
            return d12;
        }
        D d13 = new D("Seconds", new AbstractC44872n[]{AbstractC44872n.f420939m});
        f420434l = d13;
        return d13;
    }

    public static D g() {
        D d12 = f420430h;
        if (d12 != null) {
            return d12;
        }
        D d13 = new D("Weeks", new AbstractC44872n[]{AbstractC44872n.f420934h});
        f420430h = d13;
        return d13;
    }

    public static D h() {
        D d12 = f420428f;
        if (d12 != null) {
            return d12;
        }
        D d13 = new D("Years", new AbstractC44872n[]{AbstractC44872n.f420932f});
        f420428f = d13;
        return d13;
    }

    public final boolean c(AbstractC44872n abstractC44872n) {
        AbstractC44872n[] abstractC44872nArr = this.f420436c;
        int length = abstractC44872nArr.length;
        int i12 = 0;
        while (true) {
            if (i12 >= length) {
                i12 = -1;
                break;
            }
            if (abstractC44872nArr[i12] == abstractC44872n) {
                break;
            }
            i12++;
        }
        return i12 >= 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof D) {
            return Arrays.equals(this.f420436c, ((D) obj).f420436c);
        }
        return false;
    }

    public final int hashCode() {
        int i12 = 0;
        int iHashCode = 0;
        while (true) {
            AbstractC44872n[] abstractC44872nArr = this.f420436c;
            if (i12 >= abstractC44872nArr.length) {
                return iHashCode;
            }
            iHashCode += abstractC44872nArr[i12].hashCode();
            i12++;
        }
    }

    public final String toString() {
        return AK.c.s(new StringBuilder("PeriodType["), this.f420435b, "]");
    }
}
