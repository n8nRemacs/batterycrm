package com.avito.android.wallet.pin.impl.creation.mvi.components;

import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.wallet.pin.impl.creation.mvi.entity.WalletPinCreationInternalAction;
import com.huawei.hms.adapter.internal.AvailableCode;
import hP0.C40864b;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: WalletPinCreationBootstrap.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/wallet/pin/impl/creation/mvi/components/k;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/wallet/pin/impl/creation/mvi/entity/WalletPinCreationInternalAction;", "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class k implements com.avito.android.arch.mvi.b<WalletPinCreationInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.wallet.pin.impl.creation.mvi.a f328582a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.wallet_biometry.f f328583b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f328584c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f328585d;

    /* compiled from: WalletPinCreationBootstrap.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/wallet/pin/impl/creation/mvi/entity/WalletPinCreationInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.wallet.pin.impl.creation.mvi.components.WalletPinCreationBootstrap$produce$1", f = "WalletPinCreationBootstrap.kt", i = {0}, l = {AvailableCode.USER_IGNORE_PREVIOUS_POPUP, AvailableCode.APP_IS_BACKGROUND_OR_LOCKED}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super WalletPinCreationInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f328586q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f328587r;

        /* compiled from: WalletPinCreationBootstrap.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.wallet.pin.impl.creation.mvi.components.WalletPinCreationBootstrap$produce$1$1", f = "WalletPinCreationBootstrap.kt", i = {0, 2}, l = {36, 37, 39, 43}, m = "invokeSuspend", n = {"loadDataDeferred", "response"}, s = {"L$0", "L$1"})
        /* renamed from: com.avito.android.wallet.pin.impl.creation.mvi.components.k$a$a, reason: collision with other inner class name */
        public static final class C10195a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public C40864b f328589q;

            /* renamed from: r, reason: collision with root package name */
            public int f328590r;

            /* renamed from: s, reason: collision with root package name */
            public /* synthetic */ Object f328591s;

            /* renamed from: t, reason: collision with root package name */
            public final /* synthetic */ k f328592t;

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j<WalletPinCreationInternalAction> f328593u;

            /* compiled from: WalletPinCreationBootstrap.kt */
            @s0
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.wallet.pin.impl.creation.mvi.components.WalletPinCreationBootstrap$produce$1$1$clearBiometryDeferred$1", f = "WalletPinCreationBootstrap.kt", i = {0}, l = {30}, m = "invokeSuspend", n = {"$this$async"}, s = {"L$0"})
            /* renamed from: com.avito.android.wallet.pin.impl.creation.mvi.components.k$a$a$a, reason: collision with other inner class name */
            public static final class C10196a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f328594q;

                /* renamed from: r, reason: collision with root package name */
                public /* synthetic */ Object f328595r;

                /* renamed from: s, reason: collision with root package name */
                public final /* synthetic */ k f328596s;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C10196a(k kVar, Continuation<? super C10196a> continuation) {
                    super(2, continuation);
                    this.f328596s = kVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    C10196a c10196a = new C10196a(this.f328596s, continuation);
                    c10196a.f328595r = obj;
                    return c10196a;
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C10196a) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    T t12;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f328594q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        T t13 = (T) this.f328595r;
                        k kVar = this.f328596s;
                        try {
                            int i13 = Z.f406624c;
                            com.avito.android.wallet_biometry.f fVar = kVar.f328583b;
                            this.f328595r = t13;
                            this.f328594q = 1;
                            if (fVar.d(true, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            t12 = t13;
                        } catch (Throwable unused) {
                            t12 = t13;
                            int i14 = Z.f406624c;
                            U.d(t12);
                            return G0.f406611a;
                        }
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        t12 = (T) this.f328595r;
                        try {
                            C42729a0.b(obj);
                        } catch (Throwable unused2) {
                            int i142 = Z.f406624c;
                            U.d(t12);
                            return G0.f406611a;
                        }
                    }
                    G0 g02 = G0.f406611a;
                    int i15 = Z.f406624c;
                    U.d(t12);
                    return G0.f406611a;
                }
            }

            /* compiled from: WalletPinCreationBootstrap.kt */
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/TypedResult;", "LhP0/b;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.wallet.pin.impl.creation.mvi.components.WalletPinCreationBootstrap$produce$1$1$loadDataDeferred$1", f = "WalletPinCreationBootstrap.kt", i = {}, l = {34}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.wallet.pin.impl.creation.mvi.components.k$a$a$b */
            public static final class b extends SuspendLambda implements Y41.p<T, Continuation<? super TypedResult<C40864b>>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f328597q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ k f328598r;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(k kVar, Continuation<? super b> continuation) {
                    super(2, continuation);
                    this.f328598r = kVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new b(this.f328598r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super TypedResult<C40864b>> continuation) {
                    return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f328597q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        k kVar = this.f328598r;
                        com.avito.android.wallet.pin.impl.creation.mvi.a aVar = kVar.f328582a;
                        this.f328597q = 1;
                        obj = aVar.f328511a.get().a(kVar.f328584c, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C42729a0.b(obj);
                    }
                    return obj;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C10195a(k kVar, InterfaceC43172j<? super WalletPinCreationInternalAction> interfaceC43172j, Continuation<? super C10195a> continuation) {
                super(2, continuation);
                this.f328592t = kVar;
                this.f328593u = interfaceC43172j;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                C10195a c10195a = new C10195a(this.f328592t, this.f328593u, continuation);
                c10195a.f328591s = obj;
                return c10195a;
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((C10195a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            /* JADX WARN: Removed duplicated region for block: B:23:0x0073  */
            /* JADX WARN: Removed duplicated region for block: B:29:0x0096  */
            /* JADX WARN: Removed duplicated region for block: B:30:0x009b  */
            /* JADX WARN: Removed duplicated region for block: B:32:0x00a0  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r10) {
                /*
                    r9 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r1 = r9.f328590r
                    r2 = 3
                    r3 = 0
                    r4 = 4
                    r5 = 1
                    com.avito.android.wallet.pin.impl.creation.mvi.components.k r6 = r9.f328592t
                    r7 = 2
                    if (r1 == 0) goto L3b
                    if (r1 == r5) goto L33
                    if (r1 == r7) goto L2f
                    if (r1 == r2) goto L24
                    if (r1 != r4) goto L1c
                    kotlin.C42729a0.b(r10)
                    goto Lc0
                L1c:
                    java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r10.<init>(r0)
                    throw r10
                L24:
                    hP0.b r0 = r9.f328589q
                    java.lang.Object r1 = r9.f328591s
                    r6 = r1
                    com.avito.android.wallet.pin.impl.creation.mvi.components.k r6 = (com.avito.android.wallet.pin.impl.creation.mvi.components.k) r6
                    kotlin.C42729a0.b(r10)
                    goto L8e
                L2f:
                    kotlin.C42729a0.b(r10)
                    goto L6b
                L33:
                    java.lang.Object r1 = r9.f328591s
                    kotlinx.coroutines.a0 r1 = (kotlinx.coroutines.InterfaceC43076a0) r1
                    kotlin.C42729a0.b(r10)
                    goto L60
                L3b:
                    kotlin.C42729a0.b(r10)
                    java.lang.Object r10 = r9.f328591s
                    kotlinx.coroutines.T r10 = (kotlinx.coroutines.T) r10
                    com.avito.android.wallet.pin.impl.creation.mvi.components.k$a$a$a r1 = new com.avito.android.wallet.pin.impl.creation.mvi.components.k$a$a$a
                    r1.<init>(r6, r3)
                    kotlinx.coroutines.a0 r1 = kotlinx.coroutines.C43259k.b(r10, r3, r1, r2)
                    com.avito.android.wallet.pin.impl.creation.mvi.components.k$a$a$b r8 = new com.avito.android.wallet.pin.impl.creation.mvi.components.k$a$a$b
                    r8.<init>(r6, r3)
                    kotlinx.coroutines.a0 r10 = kotlinx.coroutines.C43259k.b(r10, r3, r8, r2)
                    r9.f328591s = r10
                    r9.f328590r = r5
                    java.lang.Object r1 = r1.F(r9)
                    if (r1 != r0) goto L5f
                    return r0
                L5f:
                    r1 = r10
                L60:
                    r9.f328591s = r3
                    r9.f328590r = r7
                    java.lang.Object r10 = r1.F(r9)
                    if (r10 != r0) goto L6b
                    return r0
                L6b:
                    com.avito.android.remote.model.TypedResult r10 = (com.avito.android.remote.model.TypedResult) r10
                    boolean r1 = r10 instanceof com.avito.android.remote.model.TypedResult.Success
                    kotlinx.coroutines.flow.j<com.avito.android.wallet.pin.impl.creation.mvi.entity.WalletPinCreationInternalAction> r5 = r9.f328593u
                    if (r1 == 0) goto La0
                    com.avito.android.remote.model.TypedResult$Success r10 = (com.avito.android.remote.model.TypedResult.Success) r10
                    java.lang.Object r10 = r10.getResult()
                    hP0.b r10 = (hP0.C40864b) r10
                    com.avito.android.wallet.pin.impl.creation.mvi.entity.WalletPinCreationInternalAction$ShowContent r1 = new com.avito.android.wallet.pin.impl.creation.mvi.entity.WalletPinCreationInternalAction$ShowContent
                    r1.<init>(r10)
                    r9.f328591s = r6
                    r9.f328589q = r10
                    r9.f328590r = r2
                    java.lang.Object r1 = r5.emit(r1, r9)
                    if (r1 != r0) goto L8d
                    return r0
                L8d:
                    r0 = r10
                L8e:
                    com.avito.android.analytics.a r10 = r6.f328585d
                    hP0.a r0 = r0.getEvents()
                    if (r0 == 0) goto L9b
                    dP0.a r0 = r0.getCreatePageLoad()
                    goto L9c
                L9b:
                    r0 = r3
                L9c:
                    cP0.C27083a.a(r10, r0, r3)
                    goto Lc0
                La0:
                    boolean r1 = r10 instanceof com.avito.android.remote.model.TypedResult.Error
                    if (r1 == 0) goto Lc3
                    com.avito.android.remote.model.TypedResult$Error r10 = (com.avito.android.remote.model.TypedResult.Error) r10
                    com.avito.android.remote.error.ApiError r1 = r10.getError()
                    java.lang.Throwable r10 = r10.getCause()
                    com.avito.android.util.ApiException r10 = com.avito.android.util.C35936s.a(r1, r10)
                    com.avito.android.wallet.pin.impl.creation.mvi.entity.WalletPinCreationInternalAction$ShowContentLoadingError r1 = new com.avito.android.wallet.pin.impl.creation.mvi.entity.WalletPinCreationInternalAction$ShowContentLoadingError
                    r1.<init>(r10)
                    r9.f328590r = r4
                    java.lang.Object r10 = r5.emit(r1, r9)
                    if (r10 != r0) goto Lc0
                    return r0
                Lc0:
                    kotlin.G0 r10 = kotlin.G0.f406611a
                    return r10
                Lc3:
                    kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
                    r10.<init>()
                    throw r10
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.wallet.pin.impl.creation.mvi.components.k.a.C10195a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = k.this.new a(continuation);
            aVar.f328587r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super WalletPinCreationInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f328586q;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f328587r;
                WalletPinCreationInternalAction.ShowContentLoading showContentLoading = new WalletPinCreationInternalAction.ShowContentLoading();
                this.f328587r = interfaceC43172j;
                this.f328586q = 1;
                if (interfaceC43172j.emit(showContentLoading, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    return G0.f406611a;
                }
                interfaceC43172j = (InterfaceC43172j) this.f328587r;
                C42729a0.b(obj);
            }
            C10195a c10195a = new C10195a(k.this, interfaceC43172j, null);
            this.f328587r = null;
            this.f328586q = 2;
            if (U.c(c10195a, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    @Inject
    public k(@Y61.k com.avito.android.wallet.pin.impl.creation.mvi.a aVar, @Y61.k com.avito.android.wallet_biometry.f fVar, @Y61.k String str, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f328582a = aVar;
        this.f328583b = fVar;
        this.f328584c = str;
        this.f328585d = interfaceC28373a;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<WalletPinCreationInternalAction> a() {
        return C43175k.G(new a(null));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
