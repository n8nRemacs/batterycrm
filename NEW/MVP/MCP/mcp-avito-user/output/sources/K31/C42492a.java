package k31;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: Mixed.java */
/* renamed from: k31.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C42492a implements Serializable, Comparable<Object> {
    private static final long serialVersionUID = -599069055376420973L;

    /* renamed from: b, reason: collision with root package name */
    public final Object f406030b;

    /* renamed from: c, reason: collision with root package name */
    public final int f406031c;

    public C42492a(Object obj) {
        int i12;
        int i13 = 0;
        if ((obj instanceof String) || (obj != null && obj.getClass().isEnum())) {
            i12 = 8;
        } else {
            boolean z12 = obj instanceof Integer;
            i12 = 3;
            if (!z12) {
                if ((obj instanceof List) || (obj instanceof Map)) {
                    i12 = 9;
                } else if (obj instanceof Character) {
                    i12 = 0;
                } else if (obj instanceof Byte) {
                    i12 = 1;
                } else if (obj instanceof Short) {
                    i12 = 2;
                } else if (!z12) {
                    i12 = obj instanceof Long ? 4 : obj instanceof Float ? 5 : obj instanceof Double ? 6 : obj instanceof Boolean ? 7 : -1;
                }
            }
        }
        this.f406031c = i12;
        if (i12 == 8) {
            this.f406030b = obj.toString();
            return;
        }
        if (i12 != 9) {
            this.f406030b = obj;
            return;
        }
        if (obj instanceof C42493b) {
            this.f406030b = obj;
            return;
        }
        if (!(obj instanceof List)) {
            this.f406030b = new C42493b((Map) obj);
            return;
        }
        C42493b c42493b = new C42493b();
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            c42493b.put(new C42492a(i13), it.next());
            i13++;
        }
        this.f406030b = c42493b;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        boolean z12 = obj instanceof C42492a;
        Object obj2 = this.f406030b;
        return z12 ? ((Comparable) obj2).compareTo(((C42492a) obj).f406030b) : ((Comparable) obj2).compareTo(obj);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        return obj instanceof C42492a ? toString().equals(obj.toString()) : toString().equals(obj.toString());
    }

    public final int hashCode() {
        return toString().hashCode();
    }

    public final String toString() {
        Object obj = this.f406030b;
        if (obj == null) {
            return null;
        }
        return obj.toString();
    }

    public C42492a(int i12) {
        this.f406030b = Integer.valueOf(i12);
        this.f406031c = 3;
    }
}
