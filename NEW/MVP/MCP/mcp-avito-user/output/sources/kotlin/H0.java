package kotlin;

import java.io.Serializable;

/* compiled from: Lazy.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkotlin/H0;", "T", "Lkotlin/C;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "writeReplace", "()Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class H0<T> implements InterfaceC42726C<T>, Serializable {

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public Y41.a<? extends T> f406612b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public Object f406613c;

    public H0() {
        throw null;
    }

    private final Object writeReplace() {
        return new C43074z(getValue());
    }

    @Override // kotlin.InterfaceC42726C
    public final T getValue() {
        if (this.f406613c == A0.f406601a) {
            this.f406613c = this.f406612b.invoke();
            this.f406612b = null;
        }
        return (T) this.f406613c;
    }

    @Override // kotlin.InterfaceC42726C
    public final boolean isInitialized() {
        return this.f406613c != A0.f406601a;
    }

    @Y61.k
    public final String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
