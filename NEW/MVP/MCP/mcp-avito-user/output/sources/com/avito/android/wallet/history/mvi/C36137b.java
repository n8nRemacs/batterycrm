package com.avito.android.wallet.history.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.wallet.history.mvi.entity.WalletHistoryInternalAction;
import com.huawei.hms.adapter.internal.AvailableCode;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: WalletHistoryInteractor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/wallet/history/mvi/b;", "", "_avito_wallet-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.wallet.history.mvi.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C36137b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<IO0.a> f327559a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h31.e<DO0.a> f327560b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f327561c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.wallet.history.feature.a f327562d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final String f327563e;

    /* compiled from: WalletHistoryInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/wallet/history/mvi/entity/WalletHistoryInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.wallet.history.mvi.WalletHistoryInteractor$loadInitial$1", f = "WalletHistoryInteractor.kt", i = {0}, l = {AvailableCode.USER_IGNORE_PREVIOUS_POPUP, 30, 32}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    /* renamed from: com.avito.android.wallet.history.mvi.b$a */
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super WalletHistoryInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f327564q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f327565r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ boolean f327566s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ C36137b f327567t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z12, C36137b c36137b, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f327566s = z12;
            this.f327567t = c36137b;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f327566s, this.f327567t, continuation);
            aVar.f327565r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super WalletHistoryInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f327564q;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f327565r;
                WalletHistoryInternalAction walletHistoryInternalAction = this.f327566s ? WalletHistoryInternalAction.PullRefresh.f327661b : WalletHistoryInternalAction.InitialLoad.f327652b;
                this.f327565r = interfaceC43172j;
                this.f327564q = 1;
                if (interfaceC43172j.emit(walletHistoryInternalAction, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    if (i12 != 2 && i12 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    return G0.f406611a;
                }
                interfaceC43172j = (InterfaceC43172j) this.f327565r;
                C42729a0.b(obj);
            }
            C36137b c36137b = this.f327567t;
            com.avito.android.wallet.history.feature.a aVar = c36137b.f327562d;
            aVar.getClass();
            kotlin.reflect.n<Object> nVar = com.avito.android.wallet.history.feature.a.f327525c[0];
            if (((Boolean) aVar.f327526b.a().invoke()).booleanValue()) {
                this.f327565r = null;
                this.f327564q = 2;
                if (C36137b.b(c36137b, interfaceC43172j, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                this.f327565r = null;
                this.f327564q = 3;
                if (C36137b.a(c36137b, interfaceC43172j, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: WalletHistoryInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/wallet/history/mvi/entity/WalletHistoryInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.wallet.history.mvi.WalletHistoryInteractor$loadNext$1", f = "WalletHistoryInteractor.kt", i = {0}, l = {75, 77, 79}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    /* renamed from: com.avito.android.wallet.history.mvi.b$b, reason: collision with other inner class name */
    public static final class C10153b extends SuspendLambda implements Y41.p<InterfaceC43172j<? super WalletHistoryInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f327568q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f327569r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f327571t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10153b(String str, Continuation<? super C10153b> continuation) {
            super(2, continuation);
            this.f327571t = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            C10153b c10153b = C36137b.this.new C10153b(this.f327571t, continuation);
            c10153b.f327569r = obj;
            return c10153b;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super WalletHistoryInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((C10153b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f327568q;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f327569r;
                WalletHistoryInternalAction.LoadMore loadMore = WalletHistoryInternalAction.LoadMore.f327660b;
                this.f327569r = interfaceC43172j;
                this.f327568q = 1;
                if (interfaceC43172j.emit(loadMore, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    if (i12 != 2 && i12 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    return G0.f406611a;
                }
                interfaceC43172j = (InterfaceC43172j) this.f327569r;
                C42729a0.b(obj);
            }
            C36137b c36137b = C36137b.this;
            com.avito.android.wallet.history.feature.a aVar = c36137b.f327562d;
            aVar.getClass();
            kotlin.reflect.n<Object> nVar = com.avito.android.wallet.history.feature.a.f327525c[0];
            boolean zBooleanValue = ((Boolean) aVar.f327526b.a().invoke()).booleanValue();
            String str = this.f327571t;
            if (zBooleanValue) {
                this.f327569r = null;
                this.f327568q = 2;
                if (C36137b.d(c36137b, interfaceC43172j, str, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                this.f327569r = null;
                this.f327568q = 3;
                if (C36137b.c(c36137b, interfaceC43172j, str, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return G0.f406611a;
        }
    }

    @Inject
    public C36137b(@Y61.k h31.e<IO0.a> eVar, @Y61.k h31.e<DO0.a> eVar2, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k com.avito.android.wallet.history.feature.a aVar, @com.avito.android.wallet.history.mvi.di.b @Y61.k String str) {
        this.f327559a = eVar;
        this.f327560b = eVar2;
        this.f327561c = interfaceC28373a;
        this.f327562d = aVar;
        this.f327563e = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(com.avito.android.wallet.history.mvi.C36137b r7, kotlinx.coroutines.flow.InterfaceC43172j r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            Method dump skipped, instructions count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.wallet.history.mvi.C36137b.a(com.avito.android.wallet.history.mvi.b, kotlinx.coroutines.flow.j, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(com.avito.android.wallet.history.mvi.C36137b r9, kotlinx.coroutines.flow.InterfaceC43172j r10, kotlin.coroutines.jvm.internal.ContinuationImpl r11) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.wallet.history.mvi.C36137b.b(com.avito.android.wallet.history.mvi.b, kotlinx.coroutines.flow.j, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(com.avito.android.wallet.history.mvi.C36137b r6, kotlinx.coroutines.flow.InterfaceC43172j r7, java.lang.String r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            r6.getClass()
            boolean r0 = r9 instanceof com.avito.android.wallet.history.mvi.C36140e
            if (r0 == 0) goto L16
            r0 = r9
            com.avito.android.wallet.history.mvi.e r0 = (com.avito.android.wallet.history.mvi.C36140e) r0
            int r1 = r0.f327645v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f327645v = r1
            goto L1b
        L16:
            com.avito.android.wallet.history.mvi.e r0 = new com.avito.android.wallet.history.mvi.e
            r0.<init>(r6, r9)
        L1b:
            java.lang.Object r9 = r0.f327643t
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f327645v
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L46
            if (r2 == r5) goto L3c
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            goto L37
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            kotlin.C42729a0.b(r9)
            goto Lbd
        L3c:
            java.lang.String r8 = r0.f327642s
            kotlinx.coroutines.flow.j r7 = r0.f327641r
            com.avito.android.wallet.history.mvi.b r6 = r0.f327640q
            kotlin.C42729a0.b(r9)
            goto L62
        L46:
            kotlin.C42729a0.b(r9)
            h31.e<IO0.a> r9 = r6.f327559a
            java.lang.Object r9 = r9.get()
            IO0.a r9 = (IO0.a) r9
            r0.f327640q = r6
            r0.f327641r = r7
            r0.f327642s = r8
            r0.f327645v = r5
            java.lang.String r2 = r6.f327563e
            java.lang.Object r9 = r9.a(r8, r2, r0)
            if (r9 != r1) goto L62
            goto Lbf
        L62:
            com.avito.android.remote.model.TypedResult r9 = (com.avito.android.remote.model.TypedResult) r9
            boolean r2 = r9 instanceof com.avito.android.remote.model.TypedResult.Success
            r5 = 0
            if (r2 == 0) goto L91
            com.avito.android.remote.model.TypedResult$Success r9 = (com.avito.android.remote.model.TypedResult.Success) r9
            java.lang.Object r6 = r9.getResult()
            JO0.c r6 = (JO0.c) r6
            com.avito.android.wallet.history.mvi.entity.WalletHistoryInternalAction$Items r9 = new com.avito.android.wallet.history.mvi.entity.WalletHistoryInternalAction$Items
            java.util.List r2 = r6.b()
            if (r2 != 0) goto L7b
            kotlin.collections.z0 r2 = kotlin.collections.C42784z0.f406748b
        L7b:
            java.lang.String r6 = r6.getKey()
            r9.<init>(r2, r8, r6)
            r0.f327640q = r5
            r0.f327641r = r5
            r0.f327642s = r5
            r0.f327645v = r4
            java.lang.Object r6 = r7.emit(r9, r0)
            if (r6 != r1) goto Lbd
            goto Lbf
        L91:
            boolean r8 = r9 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r8 == 0) goto Lc0
            com.avito.android.remote.model.TypedResult$Error r9 = (com.avito.android.remote.model.TypedResult.Error) r9
            com.avito.android.remote.error.ApiError r8 = r9.getError()
            java.lang.Throwable r9 = r9.getCause()
            com.avito.android.util.C35936s.a(r8, r9)
            com.avito.android.analytics.a r6 = r6.f327561c
            CO0.b r8 = new CO0.b
            r8.<init>()
            r6.c(r8)
            com.avito.android.wallet.history.mvi.entity.WalletHistoryInternalAction$Error r6 = com.avito.android.wallet.history.mvi.entity.WalletHistoryInternalAction.Error.f327651b
            r0.f327640q = r5
            r0.f327641r = r5
            r0.f327642s = r5
            r0.f327645v = r3
            java.lang.Object r6 = r7.emit(r6, r0)
            if (r6 != r1) goto Lbd
            goto Lbf
        Lbd:
            kotlin.G0 r1 = kotlin.G0.f406611a
        Lbf:
            return r1
        Lc0:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.wallet.history.mvi.C36137b.c(com.avito.android.wallet.history.mvi.b, kotlinx.coroutines.flow.j, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(com.avito.android.wallet.history.mvi.C36137b r6, kotlinx.coroutines.flow.InterfaceC43172j r7, java.lang.String r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            r6.getClass()
            boolean r0 = r9 instanceof com.avito.android.wallet.history.mvi.C36141f
            if (r0 == 0) goto L16
            r0 = r9
            com.avito.android.wallet.history.mvi.f r0 = (com.avito.android.wallet.history.mvi.C36141f) r0
            int r1 = r0.f327687v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f327687v = r1
            goto L1b
        L16:
            com.avito.android.wallet.history.mvi.f r0 = new com.avito.android.wallet.history.mvi.f
            r0.<init>(r6, r9)
        L1b:
            java.lang.Object r9 = r0.f327685t
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f327687v
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L46
            if (r2 == r5) goto L3c
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            goto L37
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            kotlin.C42729a0.b(r9)
            goto Lb9
        L3c:
            java.lang.String r8 = r0.f327684s
            kotlinx.coroutines.flow.j r7 = r0.f327683r
            com.avito.android.wallet.history.mvi.b r6 = r0.f327682q
            kotlin.C42729a0.b(r9)
            goto L62
        L46:
            kotlin.C42729a0.b(r9)
            h31.e<DO0.a> r9 = r6.f327560b
            java.lang.Object r9 = r9.get()
            DO0.a r9 = (DO0.a) r9
            r0.f327682q = r6
            r0.f327683r = r7
            r0.f327684s = r8
            r0.f327687v = r5
            java.lang.String r2 = r6.f327563e
            java.lang.Object r9 = r9.a(r8, r2, r0)
            if (r9 != r1) goto L62
            goto Lbb
        L62:
            com.avito.android.remote.model.TypedResult r9 = (com.avito.android.remote.model.TypedResult) r9
            boolean r2 = r9 instanceof com.avito.android.remote.model.TypedResult.Success
            r5 = 0
            if (r2 == 0) goto L8d
            com.avito.android.remote.model.TypedResult$Success r9 = (com.avito.android.remote.model.TypedResult.Success) r9
            java.lang.Object r6 = r9.getResult()
            EO0.b r6 = (EO0.b) r6
            com.avito.android.wallet.history.mvi.entity.WalletHistoryInternalAction$ItemsV2 r9 = new com.avito.android.wallet.history.mvi.entity.WalletHistoryInternalAction$ItemsV2
            java.util.List r2 = r6.b()
            java.lang.String r6 = r6.getKey()
            r9.<init>(r2, r8, r6)
            r0.f327682q = r5
            r0.f327683r = r5
            r0.f327684s = r5
            r0.f327687v = r4
            java.lang.Object r6 = r7.emit(r9, r0)
            if (r6 != r1) goto Lb9
            goto Lbb
        L8d:
            boolean r8 = r9 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r8 == 0) goto Lbc
            com.avito.android.remote.model.TypedResult$Error r9 = (com.avito.android.remote.model.TypedResult.Error) r9
            com.avito.android.remote.error.ApiError r8 = r9.getError()
            java.lang.Throwable r9 = r9.getCause()
            com.avito.android.util.C35936s.a(r8, r9)
            com.avito.android.analytics.a r6 = r6.f327561c
            CO0.b r8 = new CO0.b
            r8.<init>()
            r6.c(r8)
            com.avito.android.wallet.history.mvi.entity.WalletHistoryInternalAction$Error r6 = com.avito.android.wallet.history.mvi.entity.WalletHistoryInternalAction.Error.f327651b
            r0.f327682q = r5
            r0.f327683r = r5
            r0.f327684s = r5
            r0.f327687v = r3
            java.lang.Object r6 = r7.emit(r6, r0)
            if (r6 != r1) goto Lb9
            goto Lbb
        Lb9:
            kotlin.G0 r1 = kotlin.G0.f406611a
        Lbb:
            return r1
        Lbc:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.wallet.history.mvi.C36137b.d(com.avito.android.wallet.history.mvi.b, kotlinx.coroutines.flow.j, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Y61.k
    public final InterfaceC43160i<WalletHistoryInternalAction> e(boolean z12) {
        return C43175k.G(new a(z12, this, null));
    }

    @Y61.k
    public final InterfaceC43160i<WalletHistoryInternalAction> f(@Y61.k String str) {
        return C43175k.G(new C10153b(str, null));
    }
}
