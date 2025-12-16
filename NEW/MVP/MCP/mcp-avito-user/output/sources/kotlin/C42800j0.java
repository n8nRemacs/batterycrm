package kotlin;

import java.io.Serializable;
import kotlin.jvm.internal.C42822w;

/* compiled from: LazyJVM.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkotlin/j0;", "T", "Lkotlin/C;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "writeReplace", "()Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.j0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C42800j0<T> implements InterfaceC42726C<T>, Serializable {

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public Y41.a<? extends T> f406817b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public volatile Object f406818c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Object f406819d;

    public C42800j0(@Y61.k Y41.a<? extends T> aVar, @Y61.l Object obj) {
        this.f406817b = aVar;
        this.f406818c = A0.f406601a;
        this.f406819d = obj == null ? this : obj;
    }

    private final Object writeReplace() {
        return new C43074z(getValue());
    }

    @Override // kotlin.InterfaceC42726C
    public final T getValue() {
        T tInvoke;
        T t12 = (T) this.f406818c;
        A0 a02 = A0.f406601a;
        if (t12 != a02) {
            return t12;
        }
        synchronized (this.f406819d) {
            tInvoke = (T) this.f406818c;
            if (tInvoke == a02) {
                tInvoke = this.f406817b.invoke();
                this.f406818c = tInvoke;
                this.f406817b = null;
            }
        }
        return tInvoke;
    }

    @Override // kotlin.InterfaceC42726C
    public final boolean isInitialized() {
        return this.f406818c != A0.f406601a;
    }

    @Y61.k
    public final String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }

    public /* synthetic */ C42800j0(Y41.a aVar, Object obj, int i12, C42822w c42822w) {
        this(aVar, (i12 & 2) != 0 ? null : obj);
    }
}
