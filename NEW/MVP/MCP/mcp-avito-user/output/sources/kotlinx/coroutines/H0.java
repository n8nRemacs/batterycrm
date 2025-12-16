package kotlinx.coroutines;

import kotlin.Metadata;

/* compiled from: CompletionHandler.common.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/H0;", "", "a", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface H0 {

    /* compiled from: CompletionHandler.common.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/H0$a;", "Lkotlinx/coroutines/H0;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements H0 {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final Y41.l<Throwable, kotlin.G0> f410699b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@Y61.k Y41.l<? super Throwable, kotlin.G0> lVar) {
            this.f410699b = lVar;
        }

        @Override // kotlinx.coroutines.H0
        public final void a(@Y61.l Throwable th2) {
            this.f410699b.invoke(th2);
        }

        @Y61.k
        public final String toString() {
            return "InternalCompletionHandler.UserSupplied[" + this.f410699b.getClass().getSimpleName() + '@' + X.a(this) + ']';
        }
    }

    void a(@Y61.l Throwable th2);
}
