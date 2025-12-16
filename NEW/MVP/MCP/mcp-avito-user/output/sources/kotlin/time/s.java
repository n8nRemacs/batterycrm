package kotlin.time;

import kotlin.InterfaceC42733c0;
import kotlin.K0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.time.e;

/* compiled from: measureTime.kt */
@K0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkotlin/time/s;", "T", "", "value", "Lkotlin/time/e;", "duration", "<init>", "(Ljava/lang/Object;JLkotlin/jvm/internal/w;)V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42733c0
/* loaded from: classes8.dex */
public final /* data */ class s<T> {

    /* renamed from: a, reason: collision with root package name */
    public final T f410660a;

    /* renamed from: b, reason: collision with root package name */
    public final long f410661b;

    public s() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public s(Object obj, long j12, C42822w c42822w) {
        this.f410660a = obj;
        this.f410661b = j12;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        if (!L.f(this.f410660a, sVar.f410660a)) {
            return false;
        }
        e.a aVar = e.f410651c;
        return this.f410661b == sVar.f410661b;
    }

    public final int hashCode() {
        T t12 = this.f410660a;
        int iHashCode = t12 == null ? 0 : t12.hashCode();
        e.a aVar = e.f410651c;
        return Long.hashCode(this.f410661b) + (iHashCode * 31);
    }

    @Y61.k
    public final String toString() {
        return "TimedValue(value=" + this.f410660a + ", duration=" + ((Object) e.m(this.f410661b)) + ')';
    }
}
