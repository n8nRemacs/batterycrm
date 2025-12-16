package com.avito.android.mortgage_invite.client_search;

import androidx.compose.foundation.lazy.w0;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.InterfaceC22204y1;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: MortgageClientSearchScreen.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.mortgage_invite.client_search.MortgageClientSearchScreenKt$ContentList$1$1", f = "MortgageClientSearchScreen.kt", i = {}, l = {209}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class q extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f205475q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ w0 f205476r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ W10.c f205477s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f205478t;

    /* compiled from: MortgageClientSearchScreen.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<Integer> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ w0 f205479l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(w0 w0Var) {
            super(0);
            this.f205479l = w0Var;
        }

        @Override // Y41.a
        public final Integer invoke() {
            androidx.compose.foundation.lazy.K k12 = (androidx.compose.foundation.lazy.K) C42745f0.S(this.f205479l.j().h());
            return Integer.valueOf(k12 != null ? k12.getF29645a() : -1);
        }
    }

    /* compiled from: MortgageClientSearchScreen.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "emit", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1 f205480b;

        public b(InterfaceC22204y1 interfaceC22204y1) {
            this.f205480b = interfaceC22204y1;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        public final Object emit(Object obj, Continuation continuation) {
            ((Boolean) obj).getClass();
            ((Y41.a) this.f205480b.getF42167b()).invoke();
            return G0.f406611a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/k1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements InterfaceC43160i<Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f205481b;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/k1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f205482b;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.mortgage_invite.client_search.MortgageClientSearchScreenKt$ContentList$1$1$invokeSuspend$$inlined$filter$1$2", f = "MortgageClientSearchScreen.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.mortgage_invite.client_search.q$c$a$a, reason: collision with other inner class name */
            public static final class C6122a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f205483q;

                /* renamed from: r, reason: collision with root package name */
                public int f205484r;

                public C6122a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f205483q = obj;
                    this.f205484r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC43172j interfaceC43172j) {
                this.f205482b = interfaceC43172j;
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
                    boolean r0 = r6 instanceof com.avito.android.mortgage_invite.client_search.q.c.a.C6122a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.mortgage_invite.client_search.q$c$a$a r0 = (com.avito.android.mortgage_invite.client_search.q.c.a.C6122a) r0
                    int r1 = r0.f205484r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f205484r = r1
                    goto L18
                L13:
                    com.avito.android.mortgage_invite.client_search.q$c$a$a r0 = new com.avito.android.mortgage_invite.client_search.q$c$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f205483q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f205484r
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r6)
                    goto L48
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    kotlin.C42729a0.b(r6)
                    r6 = r5
                    java.lang.Boolean r6 = (java.lang.Boolean) r6
                    boolean r6 = r6.booleanValue()
                    if (r6 == 0) goto L48
                    r0.f205484r = r3
                    kotlinx.coroutines.flow.j r6 = r4.f205482b
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L48
                    return r1
                L48:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.mortgage_invite.client_search.q.c.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public c(InterfaceC43160i interfaceC43160i) {
            this.f205481b = interfaceC43160i;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @Y61.l
        public final Object collect(@Y61.k InterfaceC43172j<? super Boolean> interfaceC43172j, @Y61.k Continuation continuation) {
            Object objCollect = this.f205481b.collect(new a(interfaceC43172j), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d implements InterfaceC43160i<Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f205486b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ w0 f205487c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ W10.c f205488d;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f205489b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ w0 f205490c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ W10.c f205491d;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.mortgage_invite.client_search.MortgageClientSearchScreenKt$ContentList$1$1$invokeSuspend$$inlined$map$1$2", f = "MortgageClientSearchScreen.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.mortgage_invite.client_search.q$d$a$a, reason: collision with other inner class name */
            public static final class C6123a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f205492q;

                /* renamed from: r, reason: collision with root package name */
                public int f205493r;

                public C6123a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f205492q = obj;
                    this.f205493r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC43172j interfaceC43172j, w0 w0Var, W10.c cVar) {
                this.f205489b = interfaceC43172j;
                this.f205490c = w0Var;
                this.f205491d = cVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r6, @Y61.k kotlin.coroutines.Continuation r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof com.avito.android.mortgage_invite.client_search.q.d.a.C6123a
                    if (r0 == 0) goto L13
                    r0 = r7
                    com.avito.android.mortgage_invite.client_search.q$d$a$a r0 = (com.avito.android.mortgage_invite.client_search.q.d.a.C6123a) r0
                    int r1 = r0.f205493r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f205493r = r1
                    goto L18
                L13:
                    com.avito.android.mortgage_invite.client_search.q$d$a$a r0 = new com.avito.android.mortgage_invite.client_search.q$d$a$a
                    r0.<init>(r7)
                L18:
                    java.lang.Object r7 = r0.f205492q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f205493r
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r7)
                    goto L64
                L29:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L31:
                    kotlin.C42729a0.b(r7)
                    java.lang.Number r6 = (java.lang.Number) r6
                    int r6 = r6.intValue()
                    androidx.compose.foundation.lazy.w0 r7 = r5.f205490c
                    androidx.compose.foundation.lazy.Y r7 = r7.j()
                    int r7 = r7.getF28948n()
                    int r7 = r7 + (-5)
                    if (r7 <= 0) goto L54
                    W10.c r2 = r5.f205491d
                    com.avito.android.mortgage_invite.client_search.mvi.entity.PagingState r2 = r2.f17563f
                    com.avito.android.mortgage_invite.client_search.mvi.entity.PagingState r4 = com.avito.android.mortgage_invite.client_search.mvi.entity.PagingState.f205439d
                    if (r2 != r4) goto L54
                    if (r6 < r7) goto L54
                    r6 = r3
                    goto L55
                L54:
                    r6 = 0
                L55:
                    java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r6)
                    r0.f205493r = r3
                    kotlinx.coroutines.flow.j r7 = r5.f205489b
                    java.lang.Object r6 = r7.emit(r6, r0)
                    if (r6 != r1) goto L64
                    return r1
                L64:
                    kotlin.G0 r6 = kotlin.G0.f406611a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.mortgage_invite.client_search.q.d.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public d(InterfaceC43160i interfaceC43160i, w0 w0Var, W10.c cVar) {
            this.f205486b = interfaceC43160i;
            this.f205487c = w0Var;
            this.f205488d = cVar;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @Y61.l
        public final Object collect(@Y61.k InterfaceC43172j<? super Boolean> interfaceC43172j, @Y61.k Continuation continuation) {
            Object objCollect = this.f205486b.collect(new a(interfaceC43172j, this.f205487c, this.f205488d), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(w0 w0Var, W10.c cVar, InterfaceC22204y1 interfaceC22204y1, Continuation continuation) {
        super(2, continuation);
        this.f205476r = w0Var;
        this.f205477s = cVar;
        this.f205478t = interfaceC22204y1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new q(this.f205476r, this.f205477s, this.f205478t, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((q) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f205475q;
        if (i12 == 0) {
            C42729a0.b(obj);
            w0 w0Var = this.f205476r;
            c cVar = new c(C43175k.r(new d(C22126m3.n(new a(w0Var)), w0Var, this.f205477s)));
            b bVar = new b(this.f205478t);
            this.f205475q = 1;
            if (cVar.collect(bVar, this) == coroutine_suspended) {
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
