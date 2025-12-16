package kotlin.ranges;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: Progressions.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\b\n\u0002\b\u0002\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/ranges/j;", "", "", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public class j implements Iterable<Integer>, Z41.a {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final a f406904e = new a(null);

    /* renamed from: b, reason: collision with root package name */
    public final int f406905b;

    /* renamed from: c, reason: collision with root package name */
    public final int f406906c;

    /* renamed from: d, reason: collision with root package name */
    public final int f406907d;

    /* compiled from: Progressions.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/ranges/j$a;", "", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public j(int i12, int i13, int i14) {
        if (i14 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i14 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f406905b = i12;
        this.f406906c = kotlin.internal.n.a(i12, i13, i14);
        this.f406907d = i14;
    }

    @Override // java.lang.Iterable
    @Y61.k
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final k iterator() {
        return new k(this.f406905b, this.f406906c, this.f406907d);
    }

    public boolean equals(@Y61.l Object obj) {
        if (obj instanceof j) {
            if (!isEmpty() || !((j) obj).isEmpty()) {
                j jVar = (j) obj;
                if (this.f406905b != jVar.f406905b || this.f406906c != jVar.f406906c || this.f406907d != jVar.f406907d) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f406905b * 31) + this.f406906c) * 31) + this.f406907d;
    }

    public boolean isEmpty() {
        int i12 = this.f406907d;
        int i13 = this.f406906c;
        int i14 = this.f406905b;
        if (i12 > 0) {
            if (i14 <= i13) {
                return false;
            }
        } else if (i14 >= i13) {
            return false;
        }
        return true;
    }

    @Y61.k
    public String toString() {
        StringBuilder sb2;
        int i12 = this.f406906c;
        int i13 = this.f406905b;
        int i14 = this.f406907d;
        if (i14 > 0) {
            sb2 = new StringBuilder();
            sb2.append(i13);
            sb2.append("..");
            sb2.append(i12);
            sb2.append(" step ");
            sb2.append(i14);
        } else {
            sb2 = new StringBuilder();
            sb2.append(i13);
            sb2.append(" downTo ");
            sb2.append(i12);
            sb2.append(" step ");
            sb2.append(-i14);
        }
        return sb2.toString();
    }
}
