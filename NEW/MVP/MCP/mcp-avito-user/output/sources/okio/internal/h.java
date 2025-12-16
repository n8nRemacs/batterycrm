package okio.internal;

import androidx.camera.camera2.internal.G;
import java.io.EOFException;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import okio.C44802l;
import okio.C44805o;
import okio.S;

/* compiled from: Path.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"okio"}, k = 2, mv = {1, 9, 0}, xi = 48)
@X41.i
/* loaded from: classes7.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C44805o f420085a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final C44805o f420086b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final C44805o f420087c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final C44805o f420088d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final C44805o f420089e;

    static {
        C44805o.f420139e.getClass();
        f420085a = C44805o.a.c("/");
        f420086b = C44805o.a.c("\\");
        f420087c = C44805o.a.c("/\\");
        f420088d = C44805o.a.c(".");
        f420089e = C44805o.a.c("..");
    }

    public static final int a(S s5) {
        if (s5.f420035b.d() == 0) {
            return -1;
        }
        C44805o c44805o = s5.f420035b;
        if (c44805o.k(0) != 47) {
            if (c44805o.k(0) != 92) {
                if (c44805o.d() <= 2 || c44805o.k(1) != 58 || c44805o.k(2) != 92) {
                    return -1;
                }
                char cK2 = (char) c44805o.k(0);
                return (('a' > cK2 || cK2 >= '{') && ('A' > cK2 || cK2 >= '[')) ? -1 : 3;
            }
            if (c44805o.d() > 2 && c44805o.k(1) == 92) {
                int iF2 = c44805o.f(2, f420086b.data);
                return iF2 == -1 ? c44805o.d() : iF2;
            }
        }
        return 1;
    }

    @Y61.k
    public static final S b(@Y61.k S s5, @Y61.k S s12, boolean z12) {
        if (a(s12) != -1 || s12.f() != null) {
            return s12;
        }
        C44805o c44805oC = c(s5);
        if (c44805oC == null && (c44805oC = c(s12)) == null) {
            c44805oC = f(S.f420034d);
        }
        C44802l c44802l = new C44802l();
        c44802l.B(s5.f420035b);
        if (c44802l.f420125c > 0) {
            c44802l.B(c44805oC);
        }
        c44802l.B(s12.f420035b);
        return d(c44802l, z12);
    }

    public static final C44805o c(S s5) {
        C44805o c44805o = s5.f420035b;
        C44805o c44805o2 = f420085a;
        if (C44805o.h(c44805o, c44805o2) != -1) {
            return c44805o2;
        }
        C44805o c44805o3 = f420086b;
        if (C44805o.h(s5.f420035b, c44805o3) != -1) {
            return c44805o3;
        }
        return null;
    }

    @Y61.k
    public static final S d(@Y61.k C44802l c44802l, boolean z12) throws EOFException {
        C44805o c44805o;
        char cM2;
        C44805o c44805o2;
        C44805o c44805oW0;
        C44802l c44802l2 = new C44802l();
        C44805o c44805oE = null;
        int i12 = 0;
        while (true) {
            if (!c44802l.F0(0L, f420085a)) {
                c44805o = f420086b;
                if (!c44802l.F0(0L, c44805o)) {
                    break;
                }
            }
            byte b12 = c44802l.readByte();
            if (c44805oE == null) {
                c44805oE = e(b12);
            }
            i12++;
        }
        boolean z13 = i12 >= 2 && L.f(c44805oE, c44805o);
        C44805o c44805o3 = f420087c;
        if (z13) {
            c44802l2.B(c44805oE);
            c44805oE.u(c44805oE.d(), c44802l2);
        } else if (i12 > 0) {
            c44802l2.B(c44805oE);
        } else {
            long jO2 = c44802l.o(0L, c44805o3);
            if (c44805oE == null) {
                c44805oE = jO2 == -1 ? f(S.f420034d) : e(c44802l.m(jO2));
            }
            if (L.f(c44805oE, c44805o) && c44802l.f420125c >= 2 && c44802l.m(1L) == 58 && (('a' <= (cM2 = (char) c44802l.m(0L)) && cM2 < '{') || ('A' <= cM2 && cM2 < '['))) {
                if (jO2 == 2) {
                    c44802l2.write(c44802l, 3L);
                } else {
                    c44802l2.write(c44802l, 2L);
                }
            }
        }
        boolean z14 = c44802l2.f420125c > 0;
        ArrayList arrayList = new ArrayList();
        while (true) {
            boolean zW2 = c44802l.W2();
            c44805o2 = f420088d;
            if (zW2) {
                break;
            }
            long jO3 = c44802l.o(0L, c44805o3);
            if (jO3 == -1) {
                c44805oW0 = c44802l.W0(c44802l.f420125c);
            } else {
                c44805oW0 = c44802l.W0(jO3);
                c44802l.readByte();
            }
            C44805o c44805o4 = f420089e;
            if (L.f(c44805oW0, c44805o4)) {
                if (!z14 || !arrayList.isEmpty()) {
                    if (!z12 || (!z14 && (arrayList.isEmpty() || L.f(C42745f0.Q(arrayList), c44805o4)))) {
                        arrayList.add(c44805oW0);
                    } else if (!z13 || arrayList.size() != 1) {
                        C42745f0.o0(arrayList);
                    }
                }
            } else if (!L.f(c44805oW0, c44805o2) && !L.f(c44805oW0, C44805o.f420140f)) {
                arrayList.add(c44805oW0);
            }
        }
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            if (i13 > 0) {
                c44802l2.B(c44805oE);
            }
            c44802l2.B((C44805o) arrayList.get(i13));
        }
        if (c44802l2.f420125c == 0) {
            c44802l2.B(c44805o2);
        }
        return new S(c44802l2.W0(c44802l2.f420125c));
    }

    public static final C44805o e(byte b12) {
        if (b12 == 47) {
            return f420085a;
        }
        if (b12 == 92) {
            return f420086b;
        }
        throw new IllegalArgumentException(AK.c.g(b12, "not a directory separator: "));
    }

    public static final C44805o f(String str) {
        if (L.f(str, "/")) {
            return f420085a;
        }
        if (L.f(str, "\\")) {
            return f420086b;
        }
        throw new IllegalArgumentException(G.f("not a directory separator: ", str));
    }
}
