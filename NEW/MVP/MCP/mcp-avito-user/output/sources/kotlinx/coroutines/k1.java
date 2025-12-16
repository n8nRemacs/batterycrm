package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.Z;

/* compiled from: JobSupport.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/k1;", "T", "Lkotlinx/coroutines/U0;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
final class k1<T> extends U0 {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final r<T> f411944f;

    /* JADX WARN: Multi-variable type inference failed */
    public k1(@Y61.k r<? super T> rVar) {
        this.f411944f = rVar;
    }

    @Override // kotlinx.coroutines.H0
    public final void a(@Y61.l Throwable th2) {
        V0 v02 = this.f410722e;
        if (v02 == null) {
            v02 = null;
        }
        Object objJ0 = v02.j0();
        boolean z12 = objJ0 instanceof E;
        r<T> rVar = this.f411944f;
        if (z12) {
            int i12 = kotlin.Z.f406624c;
            rVar.resumeWith(new Z.b(((E) objJ0).f410693a));
        } else {
            int i13 = kotlin.Z.f406624c;
            rVar.resumeWith(C43077a1.a(objJ0));
        }
    }
}
