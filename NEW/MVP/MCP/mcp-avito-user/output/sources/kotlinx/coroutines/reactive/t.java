package kotlinx.coroutines.reactive;

import java.util.concurrent.CancellationException;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.P;

/* compiled from: Publish.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-coroutines-reactive"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class t {

    /* compiled from: Publish.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "t", "Lkotlin/coroutines/CoroutineContext;", "ctx", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;Lkotlin/coroutines/CoroutineContext;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.p<Throwable, CoroutineContext, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final /* synthetic */ int f412015l = 0;

        static {
            new a();
        }

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(Throwable th2, CoroutineContext coroutineContext) {
            Throwable th3 = th2;
            CoroutineContext coroutineContext2 = coroutineContext;
            if (!(th3 instanceof CancellationException)) {
                P.a(coroutineContext2, th3);
            }
            return G0.f406611a;
        }
    }

    static {
        int i12 = a.f412015l;
    }
}
