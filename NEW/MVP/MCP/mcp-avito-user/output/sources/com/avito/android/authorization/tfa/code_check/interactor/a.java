package com.avito.android.authorization.tfa.code_check.interactor;

import To.InterfaceC15383a;
import com.avito.android.account.InterfaceC27663a;
import com.avito.android.code_check_public.CodeCheckLink;
import com.avito.android.code_check_public.a;
import com.avito.android.code_check_public.screen.c;
import com.avito.android.remote.model.LoginResult;
import com.avito.android.remote.model.TfaFlow;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: TfaCodeCheckCodeConfirmInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/authorization/tfa/code_check/interactor/a;", "Lcom/avito/android/code_check_public/screen/c$b;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a extends c.b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC27663a f94644a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final TfaFlow f94645b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final CodeCheckLink.Flow.TfaCheck.LoginInfo f94646c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.credman.o f94647d;

    /* compiled from: TfaCodeCheckCodeConfirmInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LTo/a;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.authorization.tfa.code_check.interactor.TfaCodeCheckCodeConfirmInteractor$confirm$1", f = "TfaCodeCheckCodeConfirmInteractor.kt", i = {0, 1}, l = {65, 69, 96}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    /* renamed from: com.avito.android.authorization.tfa.code_check.interactor.a$a, reason: collision with other inner class name */
    public static final class C2811a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super InterfaceC15383a>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public a f94648q;

        /* renamed from: r, reason: collision with root package name */
        public int f94649r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f94650s;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f94652u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f94653v;

        /* compiled from: TfaCodeCheckCodeConfirmInteractor.kt */
        @s0
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/LoginResult;", "loginResult", "LTo/a;", "<anonymous>", "(Lcom/avito/android/remote/model/LoginResult;)LTo/a;"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.authorization.tfa.code_check.interactor.TfaCodeCheckCodeConfirmInteractor$confirm$1$result$1", f = "TfaCodeCheckCodeConfirmInteractor.kt", i = {}, l = {72}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.authorization.tfa.code_check.interactor.a$a$a, reason: collision with other inner class name */
        public static final class C2812a extends SuspendLambda implements Y41.p<LoginResult, Continuation<? super InterfaceC15383a>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f94654q;

            /* renamed from: r, reason: collision with root package name */
            public /* synthetic */ Object f94655r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ a f94656s;

            /* renamed from: t, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j<InterfaceC15383a> f94657t;

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ String f94658u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C2812a(a aVar, InterfaceC43172j<? super InterfaceC15383a> interfaceC43172j, String str, Continuation<? super C2812a> continuation) {
                super(2, continuation);
                this.f94656s = aVar;
                this.f94657t = interfaceC43172j;
                this.f94658u = str;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                C2812a c2812a = new C2812a(this.f94656s, this.f94657t, this.f94658u, continuation);
                c2812a.f94655r = obj;
                return c2812a;
            }

            @Override // Y41.p
            public final Object invoke(LoginResult loginResult, Continuation<? super InterfaceC15383a> continuation) {
                return ((C2812a) create(loginResult, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object eVar;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f94654q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    LoginResult loginResult = (LoginResult) this.f94655r;
                    if (!(loginResult instanceof LoginResult.Ok)) {
                        if (loginResult instanceof LoginResult.FailedWithDialog) {
                            eVar = new InterfaceC15383a.g(new com.avito.android.code_check_public.i(new com.avito.android.beduin.ui.screen.fragment.bottom_sheet.c(((LoginResult.FailedWithDialog) loginResult).getUserDialog()), null, 2, null));
                        } else if (loginResult instanceof LoginResult.FailedWithMessage) {
                            eVar = new InterfaceC15383a.c(com.avito.android.printable_text.b.f(((LoginResult.FailedWithMessage) loginResult).getMessage()), null, null, 6, null);
                        } else if (loginResult instanceof LoginResult.FailedWithMessages) {
                            String str = (String) C42745f0.F(((LoginResult.FailedWithMessages) loginResult).getMessages().values());
                            eVar = new InterfaceC15383a.d.b(str != null ? com.avito.android.printable_text.b.f(str) : com.avito.android.code_check_public.k.a());
                        } else {
                            if (!(loginResult instanceof LoginResult.FollowDeeplink)) {
                                if (loginResult instanceof LoginResult.ParsingPermission ? true : loginResult instanceof LoginResult.PassportBlocked ? true : loginResult instanceof LoginResult.TfaCheckWithPush) {
                                    return new InterfaceC15383a.c(null, null, null, 7, null);
                                }
                                throw new NoWhenBranchMatchedException();
                            }
                            eVar = new InterfaceC15383a.e(new a.InterfaceC3494a.b(((LoginResult.FollowDeeplink) loginResult).getDeeplink(), null, 2, null));
                        }
                        return eVar;
                    }
                    this.f94654q = 1;
                    obj = a.c(this.f94656s, this.f94657t, (LoginResult.Ok) loginResult, this.f94658u, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                }
                return (InterfaceC15383a) obj;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2811a(String str, String str2, Continuation<? super C2811a> continuation) {
            super(2, continuation);
            this.f94652u = str;
            this.f94653v = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            C2811a c2811a = a.this.new C2811a(this.f94652u, this.f94653v, continuation);
            c2811a.f94650s = obj;
            return c2811a;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super InterfaceC15383a> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((C2811a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x0095 A[RETURN] */
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
                int r1 = r9.f94649r
                com.avito.android.authorization.tfa.code_check.interactor.a r2 = com.avito.android.authorization.tfa.code_check.interactor.a.this
                r3 = 3
                r4 = 2
                r5 = 1
                r6 = 0
                if (r1 == 0) goto L33
                if (r1 == r5) goto L29
                if (r1 == r4) goto L21
                if (r1 != r3) goto L19
                kotlin.C42729a0.b(r10)
                goto L96
            L19:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L21:
                java.lang.Object r1 = r9.f94650s
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r10)
                goto L89
            L29:
                com.avito.android.authorization.tfa.code_check.interactor.a r1 = r9.f94648q
                java.lang.Object r5 = r9.f94650s
                kotlinx.coroutines.flow.j r5 = (kotlinx.coroutines.flow.InterfaceC43172j) r5
                kotlin.C42729a0.b(r10)
                goto L6f
            L33:
                kotlin.C42729a0.b(r10)
                java.lang.Object r10 = r9.f94650s
                kotlinx.coroutines.flow.j r10 = (kotlinx.coroutines.flow.InterfaceC43172j) r10
                com.avito.android.code_check_public.CodeCheckLink$Flow$TfaCheck$LoginInfo r1 = r2.f94646c
                boolean r7 = r1 instanceof com.avito.android.code_check_public.CodeCheckLink.Flow.TfaCheck.LoginInfo.ByLogin
                if (r7 == 0) goto L4a
                com.avito.android.account.Y$a r7 = new com.avito.android.account.Y$a
                com.avito.android.code_check_public.CodeCheckLink$Flow$TfaCheck$LoginInfo$ByLogin r1 = (com.avito.android.code_check_public.CodeCheckLink.Flow.TfaCheck.LoginInfo.ByLogin) r1
                java.lang.String r1 = r1.f119261b
                r7.<init>(r1)
                goto L59
            L4a:
                boolean r7 = r1 instanceof com.avito.android.code_check_public.CodeCheckLink.Flow.TfaCheck.LoginInfo.BySocial
                if (r7 == 0) goto L99
                com.avito.android.account.Y$b r7 = new com.avito.android.account.Y$b
                com.avito.android.code_check_public.CodeCheckLink$Flow$TfaCheck$LoginInfo$BySocial r1 = (com.avito.android.code_check_public.CodeCheckLink.Flow.TfaCheck.LoginInfo.BySocial) r1
                java.lang.String r8 = r1.f119263b
                java.lang.String r1 = r1.f119264c
                r7.<init>(r8, r1)
            L59:
                r9.f94650s = r10
                r9.f94648q = r2
                r9.f94649r = r5
                java.lang.String r1 = r9.f94652u
                com.avito.android.account.a r5 = r2.f94644a
                com.avito.android.remote.model.TfaFlow r8 = r2.f94645b
                java.lang.Object r1 = r5.b(r1, r8, r7, r9)
                if (r1 != r0) goto L6c
                return r0
            L6c:
                r5 = r10
                r10 = r1
                r1 = r2
            L6f:
                com.avito.android.remote.model.TypedResult r10 = (com.avito.android.remote.model.TypedResult) r10
                com.avito.android.authorization.tfa.code_check.interactor.a$a$a r7 = new com.avito.android.authorization.tfa.code_check.interactor.a$a$a
                java.lang.String r8 = r9.f94653v
                r7.<init>(r2, r5, r8, r6)
                r9.f94650s = r5
                r9.f94648q = r6
                r9.f94649r = r4
                r1.getClass()
                java.lang.Object r10 = com.avito.android.code_check_public.screen.c.b.b(r10, r7, r9)
                if (r10 != r0) goto L88
                return r0
            L88:
                r1 = r5
            L89:
                To.a r10 = (To.InterfaceC15383a) r10
                r9.f94650s = r6
                r9.f94649r = r3
                java.lang.Object r10 = r1.emit(r10, r9)
                if (r10 != r0) goto L96
                return r0
            L96:
                kotlin.G0 r10 = kotlin.G0.f406611a
                return r10
            L99:
                kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
                r10.<init>()
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.authorization.tfa.code_check.interactor.a.C2811a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public a(@Y61.k InterfaceC27663a interfaceC27663a, @Y61.k TfaFlow tfaFlow, @Y61.k CodeCheckLink.Flow.TfaCheck.LoginInfo loginInfo, @Y61.k com.avito.android.credman.o oVar) {
        this.f94644a = interfaceC27663a;
        this.f94645b = tfaFlow;
        this.f94646c = loginInfo;
        this.f94647d = oVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f5 A[PHI: r11 r12 r13
  0x00f5: PHI (r11v6 com.avito.android.code_check_public.CodeCheckLink$Flow$TfaCheck$LoginInfo$ByLogin) = 
  (r11v5 com.avito.android.code_check_public.CodeCheckLink$Flow$TfaCheck$LoginInfo$ByLogin)
  (r11v5 com.avito.android.code_check_public.CodeCheckLink$Flow$TfaCheck$LoginInfo$ByLogin)
  (r11v17 com.avito.android.code_check_public.CodeCheckLink$Flow$TfaCheck$LoginInfo$ByLogin)
 binds: [B:43:0x00e0, B:45:0x00f2, B:13:0x0031] A[DONT_GENERATE, DONT_INLINE]
  0x00f5: PHI (r12v5 java.lang.String) = (r12v4 java.lang.String), (r12v4 java.lang.String), (r12v13 java.lang.String) binds: [B:43:0x00e0, B:45:0x00f2, B:13:0x0031] A[DONT_GENERATE, DONT_INLINE]
  0x00f5: PHI (r13v5 com.avito.android.remote.model.LoginResult$Ok) = 
  (r13v4 com.avito.android.remote.model.LoginResult$Ok)
  (r13v4 com.avito.android.remote.model.LoginResult$Ok)
  (r13v14 com.avito.android.remote.model.LoginResult$Ok)
 binds: [B:43:0x00e0, B:45:0x00f2, B:13:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(com.avito.android.authorization.tfa.code_check.interactor.a r11, kotlinx.coroutines.flow.InterfaceC43172j r12, com.avito.android.remote.model.LoginResult.Ok r13, java.lang.String r14, kotlin.coroutines.jvm.internal.ContinuationImpl r15) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.authorization.tfa.code_check.interactor.a.c(com.avito.android.authorization.tfa.code_check.interactor.a, kotlinx.coroutines.flow.j, com.avito.android.remote.model.LoginResult$Ok, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // com.avito.android.code_check_public.screen.c.b
    @Y61.k
    public final InterfaceC43160i<InterfaceC15383a> a(@Y61.k String str, @Y61.l String str2) {
        return C43175k.G(new C2811a(str, str2, null));
    }
}
