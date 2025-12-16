package kotlin.collections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.collections.AbstractC42738c;

/* compiled from: SlidingWindow.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/collections/a1;", "T", "Lkotlin/collections/c;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
final class a1<T> extends AbstractC42738c<T> implements RandomAccess {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Object[] f406657c;

    /* renamed from: d, reason: collision with root package name */
    public final int f406658d;

    /* renamed from: e, reason: collision with root package name */
    public int f406659e;

    /* renamed from: f, reason: collision with root package name */
    public int f406660f;

    /* compiled from: SlidingWindow.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlin/collections/a1$a", "Lkotlin/collections/b;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends AbstractC42736b<T> {

        /* renamed from: d, reason: collision with root package name */
        public int f406661d;

        /* renamed from: e, reason: collision with root package name */
        public int f406662e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ a1<T> f406663f;

        public a(a1<T> a1Var) {
            this.f406663f = a1Var;
            this.f406661d = a1Var.f406660f;
            this.f406662e = a1Var.f406659e;
        }

        @Override // kotlin.collections.AbstractC42736b
        public final void a() {
            int i12 = this.f406661d;
            if (i12 == 0) {
                this.f406664b = 2;
                return;
            }
            a1<T> a1Var = this.f406663f;
            int i13 = this.f406662e;
            this.f406665c = (T) a1Var.f406657c[i13];
            this.f406664b = 1;
            this.f406662e = (i13 + 1) % a1Var.f406658d;
            this.f406661d = i12 - 1;
        }
    }

    public a1(@Y61.k Object[] objArr, int i12) {
        this.f406657c = objArr;
        if (i12 < 0) {
            throw new IllegalArgumentException(AK.c.g(i12, "ring buffer filled size should not be negative but it is ").toString());
        }
        if (i12 <= objArr.length) {
            this.f406658d = objArr.length;
            this.f406660f = i12;
        } else {
            StringBuilder sbJ = androidx.camera.camera2.internal.G.j(i12, "ring buffer filled size: ", " cannot be larger than the buffer size: ");
            sbJ.append(objArr.length);
            throw new IllegalArgumentException(sbJ.toString().toString());
        }
    }

    public final void a(int i12) {
        if (i12 < 0) {
            throw new IllegalArgumentException(AK.c.g(i12, "n shouldn't be negative but it is ").toString());
        }
        if (i12 > this.f406660f) {
            StringBuilder sbJ = androidx.camera.camera2.internal.G.j(i12, "n shouldn't be greater than the buffer size: n = ", ", size = ");
            sbJ.append(this.f406660f);
            throw new IllegalArgumentException(sbJ.toString().toString());
        }
        if (i12 > 0) {
            int i13 = this.f406659e;
            int i14 = this.f406658d;
            int i15 = (i13 + i12) % i14;
            Object[] objArr = this.f406657c;
            if (i13 > i15) {
                Arrays.fill(objArr, i13, i14, (Object) null);
                Arrays.fill(objArr, 0, i15, (Object) null);
            } else {
                Arrays.fill(objArr, i13, i15, (Object) null);
            }
            this.f406659e = i15;
            this.f406660f -= i12;
        }
    }

    @Override // kotlin.collections.AbstractC42738c, java.util.List
    public final T get(int i12) {
        int i13 = this.f406660f;
        AbstractC42738c.f406712b.getClass();
        AbstractC42738c.a.a(i12, i13);
        return (T) this.f406657c[(this.f406659e + i12) % this.f406658d];
    }

    @Override // kotlin.collections.AbstractC42734a
    /* renamed from: getSize, reason: from getter */
    public final int getF406660f() {
        return this.f406660f;
    }

    @Override // kotlin.collections.AbstractC42738c, java.util.Collection, java.lang.Iterable, java.util.List
    @Y61.k
    public final Iterator<T> iterator() {
        return new a(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.collections.AbstractC42734a, java.util.Collection
    @Y61.k
    public final Object[] toArray() {
        return toArray(new Object[getF406660f()]);
    }

    @Override // kotlin.collections.AbstractC42734a, java.util.Collection
    @Y61.k
    public final <T> T[] toArray(@Y61.k T[] tArr) {
        Object[] objArr;
        if (tArr.length < getF406660f()) {
            tArr = (T[]) Arrays.copyOf(tArr, getF406660f());
        }
        int f406660f = getF406660f();
        int i12 = this.f406659e;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            objArr = this.f406657c;
            if (i14 >= f406660f || i12 >= this.f406658d) {
                break;
            }
            tArr[i14] = objArr[i12];
            i14++;
            i12++;
        }
        while (i14 < f406660f) {
            tArr[i14] = objArr[i13];
            i14++;
            i13++;
        }
        if (f406660f < tArr.length) {
            tArr[f406660f] = null;
        }
        return tArr;
    }
}
