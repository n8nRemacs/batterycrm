package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CancellableContinuationImpl.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/D;", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
final /* data */ class D {

    /* renamed from: a, reason: collision with root package name */
    @X41.f
    @Y61.l
    public final Object f410686a;

    /* renamed from: b, reason: collision with root package name */
    @X41.f
    @Y61.l
    public final InterfaceC43269p f410687b;

    /* renamed from: c, reason: collision with root package name */
    @X41.f
    @Y61.l
    public final Y41.l<Throwable, kotlin.G0> f410688c;

    /* renamed from: d, reason: collision with root package name */
    @X41.f
    @Y61.l
    public final Object f410689d;

    /* renamed from: e, reason: collision with root package name */
    @X41.f
    @Y61.l
    public final Throwable f410690e;

    /* JADX WARN: Multi-variable type inference failed */
    public D(@Y61.l Object obj, @Y61.l InterfaceC43269p interfaceC43269p, @Y61.l Y41.l<? super Throwable, kotlin.G0> lVar, @Y61.l Object obj2, @Y61.l Throwable th2) {
        this.f410686a = obj;
        this.f410687b = interfaceC43269p;
        this.f410688c = lVar;
        this.f410689d = obj2;
        this.f410690e = th2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Throwable] */
    public static D a(D d12, InterfaceC43269p interfaceC43269p, CancellationException cancellationException, int i12) {
        Object obj = d12.f410686a;
        if ((i12 & 2) != 0) {
            interfaceC43269p = d12.f410687b;
        }
        InterfaceC43269p interfaceC43269p2 = interfaceC43269p;
        Y41.l<Throwable, kotlin.G0> lVar = d12.f410688c;
        Object obj2 = d12.f410689d;
        CancellationException cancellationException2 = cancellationException;
        if ((i12 & 16) != 0) {
            cancellationException2 = d12.f410690e;
        }
        d12.getClass();
        return new D(obj, interfaceC43269p2, lVar, obj2, cancellationException2);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D)) {
            return false;
        }
        D d12 = (D) obj;
        return kotlin.jvm.internal.L.f(this.f410686a, d12.f410686a) && kotlin.jvm.internal.L.f(this.f410687b, d12.f410687b) && kotlin.jvm.internal.L.f(this.f410688c, d12.f410688c) && kotlin.jvm.internal.L.f(this.f410689d, d12.f410689d) && kotlin.jvm.internal.L.f(this.f410690e, d12.f410690e);
    }

    public final int hashCode() {
        Object obj = this.f410686a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        InterfaceC43269p interfaceC43269p = this.f410687b;
        int iHashCode2 = (iHashCode + (interfaceC43269p == null ? 0 : interfaceC43269p.hashCode())) * 31;
        Y41.l<Throwable, kotlin.G0> lVar = this.f410688c;
        int iHashCode3 = (iHashCode2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        Object obj2 = this.f410689d;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th2 = this.f410690e;
        return iHashCode4 + (th2 != null ? th2.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CompletedContinuation(result=");
        sb2.append(this.f410686a);
        sb2.append(", cancelHandler=");
        sb2.append(this.f410687b);
        sb2.append(", onCancellation=");
        sb2.append(this.f410688c);
        sb2.append(", idempotentResume=");
        sb2.append(this.f410689d);
        sb2.append(", cancelCause=");
        return com.avito.android.advert.item.delivery_suggests.l.t(sb2, this.f410690e, ')');
    }

    public /* synthetic */ D(Object obj, InterfaceC43269p interfaceC43269p, Y41.l lVar, Object obj2, Throwable th2, int i12, C42822w c42822w) {
        this(obj, (i12 & 2) != 0 ? null : interfaceC43269p, (i12 & 4) != 0 ? null : lVar, (i12 & 8) != 0 ? null : obj2, (i12 & 16) != 0 ? null : th2);
    }
}
