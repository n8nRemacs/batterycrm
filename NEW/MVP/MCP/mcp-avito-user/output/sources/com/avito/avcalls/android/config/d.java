package com.avito.avcalls.android.config;

import com.avito.avcalls.android.logger.g;
import com.avito.avcalls.android.signaling.p;
import com.avito.avcalls.android.signaling.v;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.internal.C43238h;

/* compiled from: ConfigLoader.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/avcalls/android/config/d;", "", "Companion", "a", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class d {

    @Y61.k
    private static final a Companion = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final p f331667a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C43238h f331668b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final f f331669c;

    /* compiled from: ConfigLoader.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/avcalls/android/config/d$a;", "", "<init>", "()V", "", "LOG_TAG", "Ljava/lang/String;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ConfigLoader.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.avcalls.android.config.ConfigLoader$loadConfig$1", f = "ConfigLoader.kt", i = {}, l = {21}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f331670q;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return d.this.new b(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f331670q;
            d dVar = d.this;
            if (i12 == 0) {
                C42729a0.b(obj);
                p pVar = dVar.f331667a;
                this.f331670q = 1;
                obj = pVar.g(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            v vVar = (v) obj;
            if (vVar instanceof v.c) {
                f fVar = dVar.f331669c;
                Config config = (Config) ((v.c) vVar).f332215a;
                if (!L.f(fVar.f331673b, config)) {
                    fVar.f331672a.b(com.avito.avcalls.android.utils.i.a().c(Config.INSTANCE.serializer(), config));
                    fVar.f331673b = config;
                }
                com.avito.avcalls.android.logger.g.INSTANCE.getClass();
                g.Companion.c("ConfigLoader", "did load config");
            } else if (!(vVar instanceof v.b)) {
                throw new NoWhenBranchMatchedException();
            }
            return G0.f406611a;
        }
    }

    public d(@Y61.k p pVar, @Y61.k C43238h c43238h, @Y61.k f fVar) {
        this.f331667a = pVar;
        this.f331668b = c43238h;
        this.f331669c = fVar;
    }

    public final void a() {
        C43259k.d(this.f331668b, null, null, new b(null), 3);
    }
}
