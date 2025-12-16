package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import androidx.compose.foundation.H;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: MemberScope.kt */
@s0
/* loaded from: classes8.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f409654c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    public static final int f409655d = 1;

    /* renamed from: e, reason: collision with root package name */
    public static final int f409656e;

    /* renamed from: f, reason: collision with root package name */
    public static final int f409657f;

    /* renamed from: g, reason: collision with root package name */
    public static final int f409658g;

    /* renamed from: h, reason: collision with root package name */
    public static final int f409659h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f409660i;

    /* renamed from: j, reason: collision with root package name */
    public static final int f409661j;

    /* renamed from: k, reason: collision with root package name */
    public static final int f409662k;

    /* renamed from: l, reason: collision with root package name */
    @X41.f
    @Y61.k
    public static final d f409663l;

    /* renamed from: m, reason: collision with root package name */
    @X41.f
    @Y61.k
    public static final d f409664m;

    /* renamed from: n, reason: collision with root package name */
    @X41.f
    @Y61.k
    public static final d f409665n;

    /* renamed from: o, reason: collision with root package name */
    @X41.f
    @Y61.k
    public static final d f409666o;

    /* renamed from: p, reason: collision with root package name */
    @X41.f
    @Y61.k
    public static final d f409667p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public static final ArrayList f409668q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public static final ArrayList f409669r;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final List<c> f409670a;

    /* renamed from: b, reason: collision with root package name */
    public final int f409671b;

    /* compiled from: MemberScope.kt */
    @s0
    public static final class a {

        /* compiled from: MemberScope.kt */
        /* renamed from: kotlin.reflect.jvm.internal.impl.resolve.scopes.d$a$a, reason: collision with other inner class name */
        public static final class C11687a {

            /* renamed from: a, reason: collision with root package name */
            public final int f409672a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final String f409673b;

            public C11687a(int i12, @Y61.k String str) {
                this.f409672a = i12;
                this.f409673b = str;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        int i12 = 1 << 1;
        int i13 = i12 << 1;
        f409656e = i12;
        int i14 = i12 << 2;
        f409657f = i13;
        int i15 = i12 << 3;
        f409658g = i14;
        int i16 = i12 << 4;
        f409659h = i15;
        f409660i = i16;
        int i17 = (i12 << 5) - 1;
        f409661j = i17;
        int i18 = 1 | i12 | i13;
        f409662k = i18;
        f409663l = new d(i17, null, 2, null);
        f409664m = new d(i15 | i16, null, 2, null);
        new d(1, null, 2, null);
        new d(i12, null, 2, null);
        new d(i13, null, 2, null);
        f409665n = new d(i18, null, 2, null);
        new d(i14, null, 2, null);
        f409666o = new d(i15, null, 2, null);
        f409667p = new d(i16, null, 2, null);
        new d(i12 | i15 | i16, null, 2, null);
        Field[] fields = d.class.getFields();
        ArrayList arrayList = new ArrayList();
        for (Field field : fields) {
            if (Modifier.isStatic(field.getModifiers())) {
                arrayList.add(field);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Field field2 = (Field) it.next();
            Object obj = field2.get(null);
            d dVar = obj instanceof d ? (d) obj : null;
            a.C11687a c11687a = dVar != null ? new a.C11687a(dVar.f409671b, field2.getName()) : null;
            if (c11687a != null) {
                arrayList2.add(c11687a);
            }
        }
        f409668q = arrayList2;
        Field[] fields2 = d.class.getFields();
        ArrayList arrayList3 = new ArrayList();
        for (Field field3 : fields2) {
            if (Modifier.isStatic(field3.getModifiers())) {
                arrayList3.add(field3);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (L.f(((Field) next).getType(), Integer.TYPE)) {
                arrayList4.add(next);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        Iterator it3 = arrayList4.iterator();
        while (it3.hasNext()) {
            Field field4 = (Field) it3.next();
            int iIntValue = ((Integer) field4.get(null)).intValue();
            a.C11687a c11687a2 = iIntValue == ((-iIntValue) & iIntValue) ? new a.C11687a(iIntValue, field4.getName()) : null;
            if (c11687a2 != null) {
                arrayList5.add(c11687a2);
            }
        }
        f409669r = arrayList5;
    }

    public d(int i12, List list, int i13, C42822w c42822w) {
        this(i12, (i13 & 2) != 0 ? C42784z0.f406748b : list);
    }

    public final boolean a(int i12) {
        return (i12 & this.f409671b) != 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!d.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f409670a, dVar.f409670a) && this.f409671b == dVar.f409671b;
    }

    public final int hashCode() {
        return (this.f409670a.hashCode() * 31) + this.f409671b;
    }

    @Y61.k
    public final String toString() {
        Object next;
        Iterator it = f409668q.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((a.C11687a) next).f409672a == this.f409671b) {
                break;
            }
        }
        a.C11687a c11687a = (a.C11687a) next;
        String strO = c11687a != null ? c11687a.f409673b : null;
        if (strO == null) {
            ArrayList arrayList = f409669r;
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                a.C11687a c11687a2 = (a.C11687a) it2.next();
                String str = a(c11687a2.f409672a) ? c11687a2.f409673b : null;
                if (str != null) {
                    arrayList2.add(str);
                }
            }
            strO = C42745f0.O(arrayList2, " | ", null, null, null, 62);
        }
        return H.p(androidx.appcompat.app.r.A("DescriptorKindFilter(", strO, ", "), this.f409670a, ')');
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(int i12, @Y61.k List<? extends c> list) {
        this.f409670a = list;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            i12 &= ~((c) it.next()).a();
        }
        this.f409671b = i12;
    }
}
