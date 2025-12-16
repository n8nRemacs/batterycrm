package kotlinx.coroutines;

import kotlin.Metadata;

/* compiled from: CancellableContinuationImpl.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/p;", "Lkotlinx/coroutines/h1;", "a", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlinx.coroutines.p, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public interface InterfaceC43269p extends InterfaceC43227h1 {

    /* compiled from: CancellableContinuationImpl.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/p$a;", "Lkotlinx/coroutines/p;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlinx.coroutines.p$a */
    public static final class a implements InterfaceC43269p {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final Y41.l<Throwable, kotlin.G0> f411953b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@Y61.k Y41.l<? super Throwable, kotlin.G0> lVar) {
            this.f411953b = lVar;
        }

        @Override // kotlinx.coroutines.InterfaceC43269p
        public final void a(@Y61.l Throwable th2) {
            this.f411953b.invoke(th2);
        }

        @Y61.k
        public final String toString() {
            return "CancelHandler.UserSupplied[" + this.f411953b.getClass().getSimpleName() + '@' + X.a(this) + ']';
        }
    }

    void a(@Y61.l Throwable th2);
}
