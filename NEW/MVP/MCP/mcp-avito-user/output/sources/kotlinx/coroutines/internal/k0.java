package kotlinx.coroutines.internal;

import java.lang.Comparable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.AbstractC43303t0;
import kotlinx.coroutines.I0;
import kotlinx.coroutines.internal.l0;

/* compiled from: ThreadSafeHeap.kt */
@s0
@I0
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u0000*\u0012\b\u0000\u0010\u0003*\u00020\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0004j\u0002`\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007R\u000b\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¨\u0006\n"}, d2 = {"Lkotlinx/coroutines/internal/k0;", "Lkotlinx/coroutines/internal/l0;", "", "T", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "<init>", "()V", "Lkotlinx/atomicfu/AtomicInt;", "_size", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public class k0<T extends l0 & Comparable<? super T>> {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f411911b = AtomicIntegerFieldUpdater.newUpdater(k0.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public T[] f411912a;

    @kotlin.X
    public final void a(@Y61.k AbstractC43303t0.c cVar) {
        cVar.a((AbstractC43303t0.d) this);
        T[] tArr = this.f411912a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f411911b;
        if (tArr == null) {
            tArr = (T[]) new l0[4];
            this.f411912a = tArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= tArr.length) {
            tArr = (T[]) ((l0[]) Arrays.copyOf(tArr, atomicIntegerFieldUpdater.get(this) * 2));
            this.f411912a = tArr;
        }
        int i12 = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i12 + 1);
        tArr[i12] = cVar;
        cVar.f412295c = i12;
        while (i12 > 0) {
            T[] tArr2 = this.f411912a;
            int i13 = (i12 - 1) / 2;
            if (((Comparable) tArr2[i13]).compareTo(tArr2[i12]) <= 0) {
                return;
            }
            c(i12, i13);
            i12 = i13;
        }
    }

    @kotlin.X
    @Y61.k
    public final T b(int i12) {
        T[] tArr = this.f411912a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f411911b;
        atomicIntegerFieldUpdater.set(this, atomicIntegerFieldUpdater.get(this) - 1);
        if (i12 < atomicIntegerFieldUpdater.get(this)) {
            c(i12, atomicIntegerFieldUpdater.get(this));
            int i13 = (i12 - 1) / 2;
            if (i12 <= 0 || ((Comparable) tArr[i12]).compareTo(tArr[i13]) >= 0) {
                while (true) {
                    int i14 = i12 * 2;
                    int i15 = i14 + 1;
                    if (i15 >= atomicIntegerFieldUpdater.get(this)) {
                        break;
                    }
                    T[] tArr2 = this.f411912a;
                    int i16 = i14 + 2;
                    if (i16 >= atomicIntegerFieldUpdater.get(this) || ((Comparable) tArr2[i16]).compareTo(tArr2[i15]) >= 0) {
                        i16 = i15;
                    }
                    if (((Comparable) tArr2[i12]).compareTo(tArr2[i16]) <= 0) {
                        break;
                    }
                    c(i12, i16);
                    i12 = i16;
                }
            } else {
                c(i12, i13);
                while (i13 > 0) {
                    T[] tArr3 = this.f411912a;
                    int i17 = (i13 - 1) / 2;
                    if (((Comparable) tArr3[i17]).compareTo(tArr3[i13]) <= 0) {
                        break;
                    }
                    c(i13, i17);
                    i13 = i17;
                }
            }
        }
        T t12 = tArr[atomicIntegerFieldUpdater.get(this)];
        t12.a(null);
        t12.setIndex(-1);
        tArr[atomicIntegerFieldUpdater.get(this)] = null;
        return t12;
    }

    public final void c(int i12, int i13) {
        T[] tArr = this.f411912a;
        T t12 = tArr[i13];
        T t13 = tArr[i12];
        tArr[i12] = t12;
        tArr[i13] = t13;
        t12.setIndex(i12);
        t13.setIndex(i13);
    }
}
