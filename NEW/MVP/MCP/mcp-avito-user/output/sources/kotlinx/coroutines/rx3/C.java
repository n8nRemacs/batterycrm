package kotlinx.coroutines.rx3;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.s0;

/* compiled from: RxFlowable.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-coroutines-rx3"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class C {

    /* compiled from: RxFlowable.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a extends kotlin.jvm.internal.H implements Y41.p<Throwable, CoroutineContext, G0> {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int f412044b = 0;

        static {
            new a();
        }

        public a() {
            super(2, C43294q.class, "handleUndeliverableException", "handleUndeliverableException(Ljava/lang/Throwable;Lkotlin/coroutines/CoroutineContext;)V", 1);
        }

        @Override // Y41.p
        public final G0 invoke(Throwable th2, CoroutineContext coroutineContext) {
            C43294q.a(coroutineContext, th2);
            return G0.f406611a;
        }
    }

    static {
        int i12 = a.f412044b;
    }
}
