package com.avito.android.reward_bug_entry_impl.mvi;

import com.avito.android.account.E;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.reward_bug_entry_impl.mvi.m;
import com.huawei.hms.adapter.internal.AvailableCode;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43131e0;
import kotlinx.coroutines.flow.C1;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.internal.AbstractC43168f;
import kotlinx.coroutines.rx3.y;
import ln0.C43803a;

/* compiled from: RewardBugEntryBootstrap.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/reward_bug_entry_impl/mvi/h;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/reward_bug_entry_impl/mvi/m;", "_avito_reward-bug-entry_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class h implements com.avito.android.arch.mvi.b<m> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final E f255648a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.reward_bug_entry_impl.domain.c f255649b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C43803a f255650c;

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements InterfaceC43160i<Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f255651b;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.reward_bug_entry_impl.mvi.h$a$a, reason: collision with other inner class name */
        public static final class C7653a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f255652b;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.reward_bug_entry_impl.mvi.RewardBugEntryBootstrap$produce$$inlined$map$1$2", f = "RewardBugEntryBootstrap.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.reward_bug_entry_impl.mvi.h$a$a$a, reason: collision with other inner class name */
            public static final class C7654a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f255653q;

                /* renamed from: r, reason: collision with root package name */
                public int f255654r;

                public C7654a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f255653q = obj;
                    this.f255654r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return C7653a.this.emit(null, this);
                }
            }

            public C7653a(InterfaceC43172j interfaceC43172j) {
                this.f255652b = interfaceC43172j;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r5, @Y61.k kotlin.coroutines.Continuation r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.avito.android.reward_bug_entry_impl.mvi.h.a.C7653a.C7654a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.reward_bug_entry_impl.mvi.h$a$a$a r0 = (com.avito.android.reward_bug_entry_impl.mvi.h.a.C7653a.C7654a) r0
                    int r1 = r0.f255654r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f255654r = r1
                    goto L18
                L13:
                    com.avito.android.reward_bug_entry_impl.mvi.h$a$a$a r0 = new com.avito.android.reward_bug_entry_impl.mvi.h$a$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f255653q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f255654r
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r6)
                    goto L4e
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    kotlin.C42729a0.b(r6)
                    java.lang.String r5 = (java.lang.String) r5
                    int r5 = r5.length()
                    if (r5 <= 0) goto L3e
                    r5 = r3
                    goto L3f
                L3e:
                    r5 = 0
                L3f:
                    java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r5)
                    r0.f255654r = r3
                    kotlinx.coroutines.flow.j r6 = r4.f255652b
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L4e
                    return r1
                L4e:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.reward_bug_entry_impl.mvi.h.a.C7653a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public a(InterfaceC43160i interfaceC43160i) {
            this.f255651b = interfaceC43160i;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @Y61.l
        public final Object collect(@Y61.k InterfaceC43172j<? super Boolean> interfaceC43172j, @Y61.k Continuation continuation) {
            Object objCollect = ((AbstractC43168f) this.f255651b).collect(new C7653a(interfaceC43172j), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* compiled from: RewardBugEntryBootstrap.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/reward_bug_entry_impl/mvi/m;", "internalAction", "", "isAuth", "<anonymous>", "(Lcom/avito/android/reward_bug_entry_impl/mvi/m;Z)Lcom/avito/android/reward_bug_entry_impl/mvi/m;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.reward_bug_entry_impl.mvi.RewardBugEntryBootstrap$produce$2", f = "RewardBugEntryBootstrap.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.q<m, Boolean, Continuation<? super m>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ m f255656q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ boolean f255657r;

        public b() {
            throw null;
        }

        @Override // Y41.q
        public final Object invoke(m mVar, Boolean bool, Continuation<? super m> continuation) {
            boolean zBooleanValue = bool.booleanValue();
            b bVar = new b(3, continuation);
            bVar.f255656q = mVar;
            bVar.f255657r = zBooleanValue;
            return bVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            return this.f255657r ? this.f255656q : m.d.f255668a;
        }
    }

    /* compiled from: RewardBugEntryBootstrap.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/reward_bug_entry_impl/mvi/m;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.reward_bug_entry_impl.mvi.RewardBugEntryBootstrap$produce$pollingFlow$1", f = "RewardBugEntryBootstrap.kt", i = {0}, l = {AvailableCode.APP_IS_BACKGROUND_OR_LOCKED, 31}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class c extends SuspendLambda implements Y41.p<InterfaceC43172j<? super m>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f255658q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f255659r;

        /* compiled from: RewardBugEntryBootstrap.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/reward_bug_entry_impl/mvi/m;", "it", "Lkotlin/G0;", "emit", "(Lcom/avito/android/reward_bug_entry_impl/mvi/m;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j<m> f255661b;

            /* JADX WARN: Multi-variable type inference failed */
            public a(InterfaceC43172j<? super m> interfaceC43172j) {
                this.f255661b = interfaceC43172j;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            public final Object emit(Object obj, Continuation continuation) {
                Object objEmit = this.f255661b.emit((m) obj, continuation);
                return objEmit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit : G0.f406611a;
            }
        }

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            c cVar = h.this.new c(continuation);
            cVar.f255659r = obj;
            return cVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super m> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f255658q;
            h hVar = h.this;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f255659r;
                C43803a c43803a = hVar.f255650c;
                kotlin.reflect.n<Object> nVar = C43803a.f414191d[1];
                if (((Boolean) c43803a.f414193c.a().invoke()).booleanValue()) {
                    this.f255659r = interfaceC43172j;
                    this.f255658q = 1;
                    if (C43131e0.b(5000L, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    return G0.f406611a;
                }
                interfaceC43172j = (InterfaceC43172j) this.f255659r;
                C42729a0.b(obj);
            }
            InterfaceC43160i<m> interfaceC43160iExecute = hVar.f255649b.execute();
            a aVar = new a(interfaceC43172j);
            this.f255659r = null;
            this.f255658q = 2;
            if (interfaceC43160iExecute.collect(aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    @Inject
    public h(@Y61.k E e12, @Y61.k com.avito.android.reward_bug_entry_impl.domain.c cVar, @Y61.k C43803a c43803a) {
        this.f255648a = e12;
        this.f255649b = cVar;
        this.f255650c = c43803a;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<m> a() {
        return new C1(C43175k.G(new c(null)), C43175k.r(new a(y.a(this.f255648a.m()))), new b(3, null));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
