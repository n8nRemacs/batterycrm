package kotlin;

import kotlin.jvm.internal.C42822w;
import kotlin.text.C43044a;

/* compiled from: ULong.kt */
@K0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0087@\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/w0;", "", "a", "data", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42733c0
@X41.g
/* loaded from: classes8.dex */
public final class w0 implements Comparable<w0> {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f410662c = 0;

    /* renamed from: b, reason: collision with root package name */
    public final long f410663b;

    /* compiled from: ULong.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006X\u0086Tø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00048\u0006X\u0086Tø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\n\u0082\u0002\u0004\n\u0002\b!¨\u0006\f"}, d2 = {"Lkotlin/w0$a;", "", "<init>", "()V", "Lkotlin/w0;", "MAX_VALUE", "J", "MIN_VALUE", "", "SIZE_BITS", "I", "SIZE_BYTES", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @X
    @kotlin.internal.g
    private /* synthetic */ w0(long j12) {
        this.f410663b = j12;
    }

    public static final /* synthetic */ w0 a(long j12) {
        return new w0(j12);
    }

    @Y61.k
    public static String b(long j12) {
        if (j12 >= 0) {
            C43044a.a(10);
            return Long.toString(j12, 10);
        }
        long j13 = 10;
        long j14 = ((j12 >>> 1) / j13) << 1;
        long j15 = j12 - (j14 * j13);
        if (j15 >= j13) {
            j15 -= j13;
            j14++;
        }
        C43044a.a(10);
        String string = Long.toString(j14, 10);
        C43044a.a(10);
        return string.concat(Long.toString(j15, 10));
    }

    @Override // java.lang.Comparable
    public final int compareTo(w0 w0Var) {
        return kotlin.jvm.internal.L.h(this.f410663b ^ Long.MIN_VALUE, w0Var.f410663b ^ Long.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w0) {
            return this.f410663b == ((w0) obj).f410663b;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f410663b);
    }

    @Y61.k
    public final String toString() {
        return b(this.f410663b);
    }
}
