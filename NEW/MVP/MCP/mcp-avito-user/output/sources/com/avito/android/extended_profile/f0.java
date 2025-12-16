package com.avito.android.extended_profile;

import Ju.InterfaceC14249c;
import com.avito.android.InterfaceC34162r0;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.deep_linking.RetrySellerSubscriptionLink;
import com.avito.android.deep_linking.links.auth.AuthenticateLink;
import com.avito.android.deep_linking.links.auth.PhoneAddLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.extended_profile.mvi.entity.ExtendedProfileInternalAction;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.SubscribeInfo;
import com.avito.android.util.R0;
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
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.internal.AbstractC43168f;
import kv.C43501a;
import zz.InterfaceC50647a;

/* compiled from: ExtendedProfileSubscriptionInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile/f0;", "Lcom/avito/android/extended_profile/e0;", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class f0 implements e0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.remote.Q f149971a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final I30.d f149972b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final R0 f149973c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC34162r0 f149974d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC50647a f149975e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f149976f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f149977g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.account.E f149978h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final I30.d f149979i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final c f149980j;

    /* compiled from: ExtendedProfileSubscriptionInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.extended_profile.ExtendedProfileSubscriptionInteractorImpl$changeSubscribe$1", f = "ExtendedProfileSubscriptionInteractor.kt", i = {1, 2, 3, 3}, l = {86, 98, 100, 106, 119}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "subscribeInfo"}, s = {"L$0", "L$0", "L$0", "L$1"})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super ExtendedProfileInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public SubscribeInfo f149981q;

        /* renamed from: r, reason: collision with root package name */
        public int f149982r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f149983s;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ boolean f149985u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f149986v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ String f149987w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z12, String str, String str2, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f149985u = z12;
            this.f149986v = str;
            this.f149987w = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = f0.this.new a(this.f149985u, this.f149986v, this.f149987w, continuation);
            aVar.f149983s = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super ExtendedProfileInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x00b8 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:45:0x012b A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r14) throws com.avito.android.util.ApiException {
            /*
                Method dump skipped, instructions count: 303
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.extended_profile.f0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: ExtendedProfileSubscriptionInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction;", "", "error", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.extended_profile.ExtendedProfileSubscriptionInteractorImpl$changeSubscribe$2", f = "ExtendedProfileSubscriptionInteractor.kt", i = {0, 0}, l = {130, 131}, m = "invokeSuspend", n = {"$this$catch", "error"}, s = {"L$0", "L$1"})
    public static final class b extends SuspendLambda implements Y41.q<InterfaceC43172j<? super ExtendedProfileInternalAction>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f149988q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f149989r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Throwable f149990s;

        public b(Continuation<? super b> continuation) {
            super(3, continuation);
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super ExtendedProfileInternalAction> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            b bVar = f0.this.new b(continuation);
            bVar.f149989r = interfaceC43172j;
            bVar.f149990s = th2;
            return bVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Throwable th2;
            InterfaceC43172j interfaceC43172j;
            ExtendedProfileInternalAction.ShowCommonErrorToastBar showCommonErrorToastBar;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f149988q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j2 = this.f149989r;
                th2 = this.f149990s;
                ExtendedProfileInternalAction.SubscriptionProgress subscriptionProgress = new ExtendedProfileInternalAction.SubscriptionProgress(false);
                this.f149989r = interfaceC43172j2;
                this.f149990s = th2;
                this.f149988q = 1;
                if (interfaceC43172j2.emit(subscriptionProgress, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                interfaceC43172j = interfaceC43172j2;
            } else {
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    return G0.f406611a;
                }
                th2 = this.f149990s;
                interfaceC43172j = this.f149989r;
                C42729a0.b(obj);
            }
            f0 f0Var = f0.this;
            ApiError apiErrorA = f0Var.f149975e.a(th2);
            if (apiErrorA instanceof ApiError.ErrorAction) {
                b.a.a(f0Var.f149977g, ((ApiError.ErrorAction) apiErrorA).getLink(), "req_key_ext_profile_favorite_seller_interactor", null, 4);
                showCommonErrorToastBar = null;
            } else {
                showCommonErrorToastBar = new ExtendedProfileInternalAction.ShowCommonErrorToastBar(th2);
            }
            if (showCommonErrorToastBar != null) {
                this.f149989r = null;
                this.f149990s = null;
                this.f149988q = 2;
                if (interfaceC43172j.emit(showCommonErrorToastBar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/k1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements InterfaceC43160i<C43501a> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f149992b;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/k1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f149993b;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.extended_profile.ExtendedProfileSubscriptionInteractorImpl$special$$inlined$filter$1$2", f = "ExtendedProfileSubscriptionInteractor.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.extended_profile.f0$c$a$a, reason: collision with other inner class name */
            public static final class C4390a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f149994q;

                /* renamed from: r, reason: collision with root package name */
                public int f149995r;

                public C4390a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f149994q = obj;
                    this.f149995r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC43172j interfaceC43172j) {
                this.f149993b = interfaceC43172j;
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
                    boolean r0 = r6 instanceof com.avito.android.extended_profile.f0.c.a.C4390a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.extended_profile.f0$c$a$a r0 = (com.avito.android.extended_profile.f0.c.a.C4390a) r0
                    int r1 = r0.f149995r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f149995r = r1
                    goto L18
                L13:
                    com.avito.android.extended_profile.f0$c$a$a r0 = new com.avito.android.extended_profile.f0$c$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f149994q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f149995r
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
                    r6 = r5
                    kv.a r6 = (kv.C43501a) r6
                    com.avito.android.deeplink_handler.handler.bundle.a r6 = r6.f413260a
                    java.lang.String r2 = "req_key_ext_profile_favorite_seller_interactor"
                    java.lang.String r6 = r6.f134521b
                    boolean r6 = kotlin.jvm.internal.L.f(r6, r2)
                    if (r6 == 0) goto L4e
                    r0.f149995r = r3
                    kotlinx.coroutines.flow.j r6 = r4.f149993b
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L4e
                    return r1
                L4e:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.extended_profile.f0.c.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public c(InterfaceC43160i interfaceC43160i) {
            this.f149992b = interfaceC43160i;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @Y61.l
        public final Object collect(@Y61.k InterfaceC43172j<? super C43501a> interfaceC43172j, @Y61.k Continuation continuation) {
            Object objCollect = ((AbstractC43168f) this.f149992b).collect(new a(interfaceC43172j), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    @Inject
    public f0(@Y61.k com.avito.android.remote.Q q12, @Y61.k I30.d dVar, @Y61.k R0 r02, @Y61.k InterfaceC34162r0 interfaceC34162r0, @Y61.k InterfaceC50647a interfaceC50647a, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k com.avito.android.account.E e12, @Y61.k I30.d dVar2) {
        this.f149971a = q12;
        this.f149972b = dVar;
        this.f149973c = r02;
        this.f149974d = interfaceC34162r0;
        this.f149975e = interfaceC50647a;
        this.f149976f = interfaceC28373a;
        this.f149977g = aVar;
        this.f149978h = e12;
        this.f149979i = dVar2;
        this.f149980j = new c(kotlinx.coroutines.rx3.y.a(aVar.d9()));
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(com.avito.android.extended_profile.f0 r8, boolean r9, java.lang.String r10, java.lang.String r11, kotlin.coroutines.jvm.internal.ContinuationImpl r12) throws com.avito.android.util.ApiException {
        /*
            r8.getClass()
            boolean r0 = r12 instanceof com.avito.android.extended_profile.g0
            if (r0 == 0) goto L17
            r0 = r12
            com.avito.android.extended_profile.g0 r0 = (com.avito.android.extended_profile.g0) r0
            int r1 = r0.f149999s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L17
            int r1 = r1 - r2
            r0.f149999s = r1
        L15:
            r7 = r0
            goto L1d
        L17:
            com.avito.android.extended_profile.g0 r0 = new com.avito.android.extended_profile.g0
            r0.<init>(r8, r12)
            goto L15
        L1d:
            java.lang.Object r12 = r7.f149997q
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r7.f149999s
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L3d
            if (r1 == r3) goto L39
            if (r1 != r2) goto L31
            kotlin.C42729a0.b(r12)
            goto L92
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            kotlin.C42729a0.b(r12)
            goto L58
        L3d:
            kotlin.C42729a0.b(r12)
            if (r9 == 0) goto L85
            I30.d r9 = r8.f149972b
            boolean r4 = r9.b()
            r7.f149999s = r3
            r5 = 1
            com.avito.android.remote.Q r1 = r8.f149971a
            java.lang.String r2 = "extended_profile"
            r3 = r10
            r6 = r11
            java.lang.Object r12 = r1.g(r2, r3, r4, r5, r6, r7)
            if (r12 != r0) goto L58
            goto La5
        L58:
            com.avito.android.remote.model.TypedResult r12 = (com.avito.android.remote.model.TypedResult) r12
            boolean r8 = r12 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r8 == 0) goto L6c
            com.avito.android.remote.model.TypedResult$Success r12 = (com.avito.android.remote.model.TypedResult.Success) r12
            java.lang.Object r8 = r12.getResult()
            com.avito.android.remote.model.SubscribeResult r8 = (com.avito.android.remote.model.SubscribeResult) r8
            com.avito.android.remote.model.SubscribeInfo r8 = com.avito.android.remote.model.SubscribeInfoKt.toSubscribeInfo(r8)
        L6a:
            r0 = r8
            goto La5
        L6c:
            boolean r8 = r12 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r8 == 0) goto L7f
            com.avito.android.remote.model.TypedResult$Error r12 = (com.avito.android.remote.model.TypedResult.Error) r12
            com.avito.android.remote.error.ApiError r8 = r12.getError()
            java.lang.Throwable r9 = r12.getCause()
            com.avito.android.util.ApiException r8 = com.avito.android.util.C35936s.a(r8, r9)
            throw r8
        L7f:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        L85:
            r7.f149999s = r2
            com.avito.android.remote.Q r8 = r8.f149971a
            java.lang.String r9 = "extended_profile"
            java.lang.Object r12 = r8.i(r9, r10, r3, r7)
            if (r12 != r0) goto L92
            goto La5
        L92:
            com.avito.android.remote.model.TypedResult r12 = (com.avito.android.remote.model.TypedResult) r12
            boolean r8 = r12 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r8 == 0) goto La6
            com.avito.android.remote.model.TypedResult$Success r12 = (com.avito.android.remote.model.TypedResult.Success) r12
            java.lang.Object r8 = r12.getResult()
            com.avito.android.remote.model.UnsubscribeResult r8 = (com.avito.android.remote.model.UnsubscribeResult) r8
            com.avito.android.remote.model.SubscribeInfo r8 = com.avito.android.remote.model.SubscribeInfoKt.toSubscribeInfo(r8)
            goto L6a
        La5:
            return r0
        La6:
            boolean r8 = r12 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r8 == 0) goto Lb9
            com.avito.android.remote.model.TypedResult$Error r12 = (com.avito.android.remote.model.TypedResult.Error) r12
            com.avito.android.remote.error.ApiError r8 = r12.getError()
            java.lang.Throwable r9 = r12.getCause()
            com.avito.android.util.ApiException r8 = com.avito.android.util.C35936s.a(r8, r9)
            throw r8
        Lb9:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.extended_profile.f0.e(com.avito.android.extended_profile.f0, boolean, java.lang.String, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // com.avito.android.extended_profile.e0
    @Y61.k
    /* renamed from: a, reason: from getter */
    public final c getF149980j() {
        return this.f149980j;
    }

    @Override // com.avito.android.extended_profile.e0
    @Y61.k
    public final InterfaceC43160i b(@Y61.k String str, @Y61.l String str2, boolean z12) {
        return C43175k.I(this.f149973c.a(), new C43152f0(C43175k.G(new a(z12, str, str2, null)), new b(null)));
    }

    @Override // com.avito.android.extended_profile.e0
    @Y61.k
    public final InterfaceC43160i<ExtendedProfileInternalAction> c(@Y61.k C43501a c43501a, @Y61.k String str, @Y61.l String str2, @Y61.l Boolean bool) {
        InterfaceC43160i<ExtendedProfileInternalAction> interfaceC43160iB;
        InterfaceC14249c interfaceC14249c = c43501a.f413261b;
        if (interfaceC14249c instanceof AuthenticateLink.b.C4024b) {
            return (bool == null || (interfaceC43160iB = b(str, str2, bool.booleanValue())) == null) ? C43175k.w() : interfaceC43160iB;
        }
        return interfaceC14249c instanceof PhoneAddLink.c.C4027c ? true : interfaceC14249c instanceof RetrySellerSubscriptionLink.b ? b(str, str2, true) : new C43210w(new ExtendedProfileInternalAction.UpdateTargetSubscribe(null));
    }

    @Override // com.avito.android.extended_profile.e0
    @Y61.k
    public final InterfaceC43160i d(@Y61.k String str, boolean z12, boolean z13) {
        return C43175k.I(this.f149973c.a(), new C43152f0(C43175k.G(new h0(this, str, z12, z13, null)), new i0(3, null)));
    }
}
