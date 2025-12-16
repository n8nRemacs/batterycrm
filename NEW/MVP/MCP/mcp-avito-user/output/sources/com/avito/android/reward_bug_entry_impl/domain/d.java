package com.avito.android.reward_bug_entry_impl.domain;

import Y41.p;
import Y41.q;
import com.avito.android.account.E;
import com.avito.android.reward_bug_entry_impl.domain.j;
import com.avito.android.reward_bug_entry_impl.mvi.m;
import com.avito.android.util.R0;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import kotlinx.coroutines.C43131e0;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import ln0.C43803a;

/* compiled from: RewardBugEntryPollingUseCase.kt */
@Singleton
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/reward_bug_entry_impl/domain/d;", "Lcom/avito/android/reward_bug_entry_impl/domain/c;", "_avito_reward-bug-entry_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final k f255602a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final R0 f255603b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final E f255604c;

    /* renamed from: d, reason: collision with root package name */
    public final long f255605d;

    /* compiled from: RewardBugEntryPollingUseCase.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/reward_bug_entry_impl/mvi/m;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.reward_bug_entry_impl.domain.RewardBugEntryPollingUseCaseImpl$execute$1", f = "RewardBugEntryPollingUseCase.kt", i = {0, 0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7, 8, 8, 8}, l = {51, 52, 54, 58, 64, 66, 67, 74, 76}, m = "invokeSuspend", n = {"$this$flow", "continuePolling", "numberOfRetries", "$this$flow", "continuePolling", "numberOfRetries", "$this$flow", "continuePolling", "numberOfRetries", "$this$flow", "continuePolling", "numberOfRetries", "it", "$this$flow", "continuePolling", "numberOfRetries", "$this$flow", "continuePolling", "numberOfRetries", "$this$flow", "continuePolling", "numberOfRetries", "$this$flow", "continuePolling", "numberOfRetries", "$this$flow", "continuePolling", "numberOfRetries"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$4", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super m>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public l0.a f255606q;

        /* renamed from: r, reason: collision with root package name */
        public l0.f f255607r;

        /* renamed from: s, reason: collision with root package name */
        public d f255608s;

        /* renamed from: t, reason: collision with root package name */
        public j.b f255609t;

        /* renamed from: u, reason: collision with root package name */
        public int f255610u;

        /* renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f255611v;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = d.this.new a(continuation);
            aVar.f255611v = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super m> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0090  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00c7 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00db A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00dc  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00e5  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0134 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0135  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x0164 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0165  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x016d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x0135 -> B:52:0x0168). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x0165 -> B:52:0x0168). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x0196 -> B:52:0x0168). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x01a9 -> B:63:0x01ac). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r16) {
            /*
                Method dump skipped, instructions count: 464
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.reward_bug_entry_impl.domain.d.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: RewardBugEntryPollingUseCase.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/reward_bug_entry_impl/mvi/m;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.reward_bug_entry_impl.domain.RewardBugEntryPollingUseCaseImpl$execute$2", f = "RewardBugEntryPollingUseCase.kt", i = {}, l = {83}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements q<InterfaceC43172j<? super m>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f255613q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f255614r;

        public b() {
            throw null;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super m> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            b bVar = new b(3, continuation);
            bVar.f255614r = interfaceC43172j;
            return bVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f255613q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f255614r;
                m.d dVar = m.d.f255668a;
                this.f255613q = 1;
                if (interfaceC43172j.emit(dVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    @Inject
    public d(@Y61.k k kVar, @Y61.k R0 r02, @Y61.k E e12, @Y61.k C43803a c43803a) {
        this.f255602a = kVar;
        this.f255603b = r02;
        this.f255604c = e12;
        c43803a.getClass();
        n<Object> nVar = C43803a.f414191d[1];
        this.f255605d = ((Boolean) c43803a.f414193c.a().invoke()).booleanValue() ? 600000L : 3600000L;
    }

    public static final Object a(d dVar, long j12, Continuation continuation) {
        if (j12 < 60000) {
            dVar.getClass();
            Object objB = C43131e0.b(60000L, continuation);
            return objB == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objB : G0.f406611a;
        }
        long j13 = dVar.f255605d;
        if (j12 > j13) {
            Object objB2 = C43131e0.b(j13, continuation);
            return objB2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objB2 : G0.f406611a;
        }
        Object objB3 = C43131e0.b(j12, continuation);
        return objB3 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objB3 : G0.f406611a;
    }

    @Override // com.avito.android.reward_bug_entry_impl.domain.c
    @Y61.k
    public final InterfaceC43160i<m> execute() {
        return C43175k.I(this.f255603b.a(), new C43152f0(C43175k.G(new a(null)), new b(3, null)));
    }
}
