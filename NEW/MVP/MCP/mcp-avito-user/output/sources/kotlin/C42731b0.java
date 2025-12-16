package kotlin;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.C42822w;

/* compiled from: LazyJVM.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0002\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004:\u0001\u000bJ\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lkotlin/b0;", "T", "Lkotlin/C;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "writeReplace", "()Ljava/lang/Object;", "c", "Ljava/lang/Object;", "_value", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.b0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C42731b0<T> implements InterfaceC42726C<T>, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater<C42731b0<?>, Object> f406633d;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public volatile Y41.a<? extends T> f406634b;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    public volatile Object _value;

    /* compiled from: LazyJVM.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Rd\u0010\u0007\u001aR\u0012\u0014\u0012\u0012\u0012\u0002\b\u0003 \u0006*\b\u0012\u0002\b\u0003\u0018\u00010\u00050\u0005\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00010\u0001 \u0006*(\u0012\u0014\u0012\u0012\u0012\u0002\b\u0003 \u0006*\b\u0012\u0002\b\u0003\u0018\u00010\u00050\u0005\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lkotlin/b0$a;", "", "<init>", "()V", "Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;", "Lkotlin/b0;", "kotlin.jvm.PlatformType", "valueUpdater", "Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.b0$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
        f406633d = AtomicReferenceFieldUpdater.newUpdater(C42731b0.class, Object.class, "c");
    }

    public C42731b0() {
        throw null;
    }

    private final Object writeReplace() {
        return new C43074z(getValue());
    }

    @Override // kotlin.InterfaceC42726C
    public final T getValue() {
        T t12 = (T) this._value;
        A0 a02 = A0.f406601a;
        if (t12 != a02) {
            return t12;
        }
        Y41.a<? extends T> aVar = this.f406634b;
        if (aVar != null) {
            T tInvoke = aVar.invoke();
            AtomicReferenceFieldUpdater<C42731b0<?>, Object> atomicReferenceFieldUpdater = f406633d;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, a02, tInvoke)) {
                if (atomicReferenceFieldUpdater.get(this) != a02) {
                }
            }
            this.f406634b = null;
            return tInvoke;
        }
        return (T) this._value;
    }

    @Override // kotlin.InterfaceC42726C
    public final boolean isInitialized() {
        return this._value != A0.f406601a;
    }

    @Y61.k
    public final String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
