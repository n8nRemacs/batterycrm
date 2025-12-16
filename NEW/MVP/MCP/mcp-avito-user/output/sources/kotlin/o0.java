package kotlin;

import kotlin.jvm.internal.C42822w;

/* compiled from: UByte.kt */
@K0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0000\b\u0087@\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/o0;", "", "a", "data", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42733c0
@X41.g
/* loaded from: classes8.dex */
public final class o0 implements Comparable<o0> {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f406874c = 0;

    /* renamed from: b, reason: collision with root package name */
    public final byte f406875b;

    /* compiled from: UByte.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006X\u0086Tø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00048\u0006X\u0086Tø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\n\u0082\u0002\u0004\n\u0002\b!¨\u0006\f"}, d2 = {"Lkotlin/o0$a;", "", "<init>", "()V", "Lkotlin/o0;", "MAX_VALUE", "B", "MIN_VALUE", "", "SIZE_BITS", "I", "SIZE_BYTES", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
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
    private /* synthetic */ o0(byte b12) {
        this.f406875b = b12;
    }

    public static final /* synthetic */ o0 a(byte b12) {
        return new o0(b12);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(o0 o0Var) {
        return kotlin.jvm.internal.L.g(this.f406875b & 255, o0Var.f406875b & 255);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o0) {
            return this.f406875b == ((o0) obj).f406875b;
        }
        return false;
    }

    public final int hashCode() {
        return Byte.hashCode(this.f406875b);
    }

    @Y61.k
    public final String toString() {
        return String.valueOf(this.f406875b & 255);
    }
}
