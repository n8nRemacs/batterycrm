package androidx.compose.ui.unit;

import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.F3;
import androidx.compose.runtime.H0;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: Constraints.kt */
@H0
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/unit/b;", "", "a", "value", "", "ui-unit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@X41.g
/* renamed from: androidx.compose.ui.unit.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22712b {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f42842b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final long f42843a;

    /* compiled from: Constraints.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/unit/b$a;", "", "<init>", "()V", "", "Infinity", "I", "ui-unit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.unit.b$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @F3
        public static long a(int i12, int i13, int i14, int i15) {
            int i16 = 262142;
            int iMin = Math.min(i14, 262142);
            int iMin2 = i15 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i15, 262142);
            int i17 = iMin2 == Integer.MAX_VALUE ? iMin : iMin2;
            if (i17 >= 8191) {
                if (i17 < 32767) {
                    i16 = 65534;
                } else if (i17 < 65535) {
                    i16 = 32766;
                } else {
                    if (i17 >= 262143) {
                        C22713c.l(i17);
                        throw new KotlinNothingValueException();
                    }
                    i16 = 8190;
                }
            }
            return C22713c.a(Math.min(i16, i12), i13 != Integer.MAX_VALUE ? Math.min(i16, i13) : Integer.MAX_VALUE, iMin, iMin2);
        }

        @F3
        public static long b(int i12, int i13, int i14, int i15) {
            int i16 = 262142;
            int iMin = Math.min(i12, 262142);
            int iMin2 = i13 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i13, 262142);
            int i17 = iMin2 == Integer.MAX_VALUE ? iMin : iMin2;
            if (i17 >= 8191) {
                if (i17 < 32767) {
                    i16 = 65534;
                } else if (i17 < 65535) {
                    i16 = 32766;
                } else {
                    if (i17 >= 262143) {
                        C22713c.l(i17);
                        throw new KotlinNothingValueException();
                    }
                    i16 = 8190;
                }
            }
            return C22713c.a(iMin, iMin2, Math.min(i16, i14), i15 != Integer.MAX_VALUE ? Math.min(i16, i15) : Integer.MAX_VALUE);
        }

        @F3
        public static long c(int i12, int i13) {
            if (!((i13 >= 0) & (i12 >= 0))) {
                p.a("width and height must be >= 0");
            }
            return C22713c.h(i12, i12, i13, i13);
        }

        @F3
        public static long d(int i12) {
            if (i12 < 0) {
                p.a("height must be >= 0");
            }
            return C22713c.h(0, Integer.MAX_VALUE, i12, i12);
        }

        @F3
        public static long e(int i12) {
            if (i12 < 0) {
                p.a("width must be >= 0");
            }
            return C22713c.h(i12, i12, 0, Integer.MAX_VALUE);
        }

        public a() {
        }
    }

    private /* synthetic */ C22712b(long j12) {
        this.f42843a = j12;
    }

    public static final /* synthetic */ C22712b a(long j12) {
        return new C22712b(j12);
    }

    public static final long b(int i12, int i13, int i14, int i15) {
        if (i13 < i12 || i15 < i14 || i12 < 0 || i14 < 0) {
            p.a("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return C22713c.h(i12, i13, i14, i15);
    }

    public static /* synthetic */ long c(long j12, int i12, int i13, int i14, int i15, int i16) {
        if ((i16 & 1) != 0) {
            i12 = l(j12);
        }
        if ((i16 & 2) != 0) {
            i13 = j(j12);
        }
        if ((i16 & 4) != 0) {
            i14 = k(j12);
        }
        if ((i16 & 8) != 0) {
            i15 = i(j12);
        }
        return b(i12, i13, i14, i15);
    }

    public static final boolean d(long j12, long j13) {
        return j12 == j13;
    }

    public static final boolean e(long j12) {
        int i12 = (int) (3 & j12);
        int i13 = (((i12 & 2) >> 1) * 3) + ((i12 & 1) << 1);
        return (((int) (j12 >> (i13 + 46))) & ((1 << (18 - i13)) - 1)) != 0;
    }

    public static final boolean f(long j12) {
        int i12 = (int) (3 & j12);
        return (((int) (j12 >> 33)) & ((1 << C22026a.a((i12 & 2) >> 1, 3, (i12 & 1) << 1, 13)) - 1)) != 0;
    }

    public static final boolean g(long j12) {
        int i12 = (int) (3 & j12);
        int i13 = (((i12 & 2) >> 1) * 3) + ((i12 & 1) << 1);
        int i14 = (1 << (18 - i13)) - 1;
        int i15 = ((int) (j12 >> (i13 + 15))) & i14;
        int i16 = ((int) (j12 >> (i13 + 46))) & i14;
        return i15 == (i16 == 0 ? Integer.MAX_VALUE : i16 - 1);
    }

    public static final boolean h(long j12) {
        int i12 = (int) (3 & j12);
        int iA2 = (1 << C22026a.a((i12 & 2) >> 1, 3, (i12 & 1) << 1, 13)) - 1;
        int i13 = ((int) (j12 >> 2)) & iA2;
        int i14 = ((int) (j12 >> 33)) & iA2;
        return i13 == (i14 == 0 ? Integer.MAX_VALUE : i14 - 1);
    }

    public static final int i(long j12) {
        int i12 = (int) (3 & j12);
        int i13 = (((i12 & 2) >> 1) * 3) + ((i12 & 1) << 1);
        int i14 = ((int) (j12 >> (i13 + 46))) & ((1 << (18 - i13)) - 1);
        if (i14 == 0) {
            return Integer.MAX_VALUE;
        }
        return i14 - 1;
    }

    public static final int j(long j12) {
        int i12 = (int) (3 & j12);
        int i13 = (int) (j12 >> 33);
        int iA2 = i13 & ((1 << C22026a.a((i12 & 2) >> 1, 3, (i12 & 1) << 1, 13)) - 1);
        if (iA2 == 0) {
            return Integer.MAX_VALUE;
        }
        return iA2 - 1;
    }

    public static final int k(long j12) {
        int i12 = (int) (3 & j12);
        int i13 = (((i12 & 2) >> 1) * 3) + ((i12 & 1) << 1);
        return ((int) (j12 >> (i13 + 15))) & ((1 << (18 - i13)) - 1);
    }

    public static final int l(long j12) {
        int i12 = (int) (3 & j12);
        return ((int) (j12 >> 2)) & ((1 << C22026a.a((i12 & 2) >> 1, 3, (i12 & 1) << 1, 13)) - 1);
    }

    public static final boolean m(long j12) {
        int i12 = (int) (3 & j12);
        int i13 = (((i12 & 2) >> 1) * 3) + ((i12 & 1) << 1);
        return ((((int) (j12 >> 33)) & ((1 << (i13 + 13)) - 1)) - 1 == 0) | ((((int) (j12 >> (i13 + 46))) & ((1 << (18 - i13)) - 1)) - 1 == 0);
    }

    @Y61.k
    public static String n(long j12) {
        int iJ2 = j(j12);
        String strValueOf = iJ2 == Integer.MAX_VALUE ? "Infinity" : String.valueOf(iJ2);
        int i12 = i(j12);
        String strValueOf2 = i12 != Integer.MAX_VALUE ? String.valueOf(i12) : "Infinity";
        StringBuilder sb2 = new StringBuilder("Constraints(minWidth = ");
        sb2.append(l(j12));
        sb2.append(", maxWidth = ");
        sb2.append(strValueOf);
        sb2.append(", minHeight = ");
        sb2.append(k(j12));
        sb2.append(", maxHeight = ");
        return C22026a.c(sb2, strValueOf2, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C22712b) {
            return this.f42843a == ((C22712b) obj).f42843a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f42843a);
    }

    @Y61.k
    public final String toString() {
        return n(this.f42843a);
    }
}
