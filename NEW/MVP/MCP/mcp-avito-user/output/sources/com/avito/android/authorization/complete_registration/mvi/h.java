package com.avito.android.authorization.complete_registration.mvi;

import Wd.InterfaceC15745b;
import Y41.p;
import Yd.InterfaceC18254a;
import com.avito.android.P;
import com.avito.android.R;
import com.avito.android.account.InterfaceC27663a;
import com.avito.android.authorization.complete_registration.mvi.entity.CompleteRegistrationInternalAction;
import com.avito.android.credman.o;
import com.avito.android.remote.InterfaceC34258d;
import com.avito.android.remote.model.LoginResult;
import com.avito.android.remote.model.Profile;
import com.avito.android.remote.model.Session;
import com.yandex.metrica.YandexMetricaDefaultValues;
import fg0.InterfaceC40419c;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
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
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: CompleteRegistrationInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/authorization/complete_registration/mvi/h;", "Lcom/avito/android/authorization/complete_registration/mvi/f;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class h implements f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC34258d f93490a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC27663a f93491b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC40419c f93492c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC18254a f93493d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final P f93494e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final o f93495f;

    /* compiled from: CompleteRegistrationInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/authorization/complete_registration/mvi/entity/CompleteRegistrationInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.authorization.complete_registration.mvi.CompleteRegistrationInteractorImpl$handleParsingPermissionResult$1", f = "CompleteRegistrationInteractor.kt", i = {0, 1}, l = {65, 72, 77}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super CompleteRegistrationInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f93496q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f93497r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Session f93499t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Profile f93500u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f93501v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ InterfaceC15745b.C1278b f93502w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ String f93503x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Session session, Profile profile, String str, InterfaceC15745b.C1278b c1278b, String str2, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f93499t = session;
            this.f93500u = profile;
            this.f93501v = str;
            this.f93502w = c1278b;
            this.f93503x = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = h.this.new a(this.f93499t, this.f93500u, this.f93501v, this.f93502w, this.f93503x, continuation);
            aVar.f93497r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super CompleteRegistrationInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0078 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r14) {
            /*
                r13 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r13.f93496q
                r2 = 3
                r3 = 2
                r4 = 1
                r5 = 0
                if (r1 == 0) goto L2e
                if (r1 == r4) goto L26
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                kotlin.C42729a0.b(r14)
                goto L79
            L16:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            L1e:
                java.lang.Object r1 = r13.f93497r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r14)
                goto L6c
            L26:
                java.lang.Object r1 = r13.f93497r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r14)
                goto L46
            L2e:
                kotlin.C42729a0.b(r14)
                java.lang.Object r14 = r13.f93497r
                kotlinx.coroutines.flow.j r14 = (kotlinx.coroutines.flow.InterfaceC43172j) r14
                com.avito.android.authorization.complete_registration.mvi.entity.CompleteRegistrationInternalAction$ShowLoading r1 = new com.avito.android.authorization.complete_registration.mvi.entity.CompleteRegistrationInternalAction$ShowLoading
                r1.<init>()
                r13.f93497r = r14
                r13.f93496q = r4
                java.lang.Object r1 = r14.emit(r1, r13)
                if (r1 != r0) goto L45
                return r0
            L45:
                r1 = r14
            L46:
                com.avito.android.remote.model.AuthResult r9 = new com.avito.android.remote.model.AuthResult
                com.avito.android.remote.model.Session r14 = r13.f93499t
                com.avito.android.remote.model.Profile r4 = r13.f93500u
                r9.<init>(r14, r4, r5, r5)
                r13.f93497r = r1
                r13.f93496q = r3
                com.avito.android.authorization.complete_registration.mvi.h r7 = com.avito.android.authorization.complete_registration.mvi.h.this
                r7.getClass()
                com.avito.android.authorization.complete_registration.mvi.g r14 = new com.avito.android.authorization.complete_registration.mvi.g
                r12 = 0
                Wd.b$b r8 = r13.f93502w
                java.lang.String r10 = r13.f93501v
                java.lang.String r11 = r13.f93503x
                r6 = r14
                r6.<init>(r7, r8, r9, r10, r11, r12)
                kotlinx.coroutines.flow.i r14 = kotlinx.coroutines.flow.C43175k.G(r14)
                if (r14 != r0) goto L6c
                return r0
            L6c:
                kotlinx.coroutines.flow.i r14 = (kotlinx.coroutines.flow.InterfaceC43160i) r14
                r13.f93497r = r5
                r13.f93496q = r2
                java.lang.Object r14 = kotlinx.coroutines.flow.C43175k.u(r13, r14, r1)
                if (r14 != r0) goto L79
                return r0
            L79:
                kotlin.G0 r14 = kotlin.G0.f406611a
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.authorization.complete_registration.mvi.h.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: CompleteRegistrationInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/authorization/complete_registration/mvi/entity/CompleteRegistrationInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.authorization.complete_registration.mvi.CompleteRegistrationInteractorImpl$register$1", f = "CompleteRegistrationInteractor.kt", i = {0, 1, 2, 3}, l = {87, 88, YandexMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS, 98, 105}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "$this$flow"}, s = {"L$0", "L$0", "L$0", "L$0"})
    public static final class b extends SuspendLambda implements p<InterfaceC43172j<? super CompleteRegistrationInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f93504q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f93505r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f93507t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f93508u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f93509v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ InterfaceC15745b.C1278b f93510w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ String f93511x;

        /* compiled from: CompleteRegistrationInteractor.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/remote/model/LoginResult;", "it", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/authorization/complete_registration/mvi/entity/CompleteRegistrationInternalAction;", "<anonymous>", "(Lcom/avito/android/remote/model/LoginResult;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.authorization.complete_registration.mvi.CompleteRegistrationInteractorImpl$register$1$internalActionFlow$1", f = "CompleteRegistrationInteractor.kt", i = {}, l = {99}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements p<LoginResult, Continuation<? super InterfaceC43160i<? extends CompleteRegistrationInternalAction>>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f93512q;

            /* renamed from: r, reason: collision with root package name */
            public /* synthetic */ Object f93513r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ h f93514s;

            /* renamed from: t, reason: collision with root package name */
            public final /* synthetic */ String f93515t;

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ InterfaceC15745b.C1278b f93516u;

            /* renamed from: v, reason: collision with root package name */
            public final /* synthetic */ String f93517v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(h hVar, String str, InterfaceC15745b.C1278b c1278b, String str2, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f93514s = hVar;
                this.f93515t = str;
                this.f93516u = c1278b;
                this.f93517v = str2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                a aVar = new a(this.f93514s, this.f93515t, this.f93516u, this.f93517v, continuation);
                aVar.f93513r = obj;
                return aVar;
            }

            @Override // Y41.p
            public final Object invoke(LoginResult loginResult, Continuation<? super InterfaceC43160i<? extends CompleteRegistrationInternalAction>> continuation) {
                return ((a) create(loginResult, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f93512q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    LoginResult loginResult = (LoginResult) this.f93513r;
                    this.f93512q = 1;
                    h hVar = this.f93514s;
                    hVar.getClass();
                    boolean z12 = loginResult instanceof LoginResult.Ok;
                    String str = this.f93515t;
                    if (z12) {
                        obj = C43175k.G(new g(hVar, this.f93516u, ((LoginResult.Ok) loginResult).getAuthResult(), str, this.f93517v, null));
                    } else if (loginResult instanceof LoginResult.FailedWithDialog) {
                        obj = new C43210w(new CompleteRegistrationInternalAction.ShowDialog(((LoginResult.FailedWithDialog) loginResult).getUserDialog()));
                    } else {
                        if (loginResult instanceof LoginResult.FailedWithMessage) {
                            obj = new C43210w(new CompleteRegistrationInternalAction.ShowError(com.avito.android.printable_text.b.f(((LoginResult.FailedWithMessage) loginResult).getMessage()), null, 2, null));
                        } else if (loginResult instanceof LoginResult.FailedWithMessages) {
                            obj = new C43210w(h.c(((LoginResult.FailedWithMessages) loginResult).getMessages()));
                        } else {
                            if (!(loginResult instanceof LoginResult.ParsingPermission)) {
                                if (!(loginResult instanceof LoginResult.PassportBlocked ? true : loginResult instanceof LoginResult.FollowDeeplink ? true : loginResult instanceof LoginResult.TfaCheckWithPush)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                throw new IllegalStateException("LoginResult=" + loginResult + " is not expected at CompleteRegistration screen");
                            }
                            LoginResult.ParsingPermission parsingPermission = (LoginResult.ParsingPermission) loginResult;
                            String name = parsingPermission.getName();
                            List<String> phones = parsingPermission.getPhones();
                            obj = new C43210w(new CompleteRegistrationInternalAction.NeedParsingPermission(name, phones != null ? (String) C42745f0.G(phones) : null, str));
                        }
                    }
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

        /* compiled from: CompleteRegistrationInteractor.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "it", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/authorization/complete_registration/mvi/entity/CompleteRegistrationInternalAction;", "<anonymous>", "(Ljava/lang/String;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.authorization.complete_registration.mvi.CompleteRegistrationInteractorImpl$register$1$internalActionFlow$2", f = "CompleteRegistrationInteractor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.authorization.complete_registration.mvi.h$b$b, reason: collision with other inner class name */
        public static final class C2769b extends SuspendLambda implements p<String, Continuation<? super InterfaceC43160i<? extends CompleteRegistrationInternalAction>>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f93518q;

            public C2769b() {
                throw null;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                C2769b c2769b = new C2769b(2, continuation);
                c2769b.f93518q = obj;
                return c2769b;
            }

            @Override // Y41.p
            public final Object invoke(String str, Continuation<? super InterfaceC43160i<? extends CompleteRegistrationInternalAction>> continuation) {
                return ((C2769b) create(str, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                C42729a0.b(obj);
                return new C43210w(new CompleteRegistrationInternalAction.ShowError(com.avito.android.printable_text.b.f((String) this.f93518q), null, 2, null));
            }
        }

        /* compiled from: CompleteRegistrationInteractor.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "", "it", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/authorization/complete_registration/mvi/entity/CompleteRegistrationInternalAction;", "<anonymous>", "(Ljava/util/Map;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.authorization.complete_registration.mvi.CompleteRegistrationInteractorImpl$register$1$internalActionFlow$3", f = "CompleteRegistrationInteractor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class c extends SuspendLambda implements p<Map<String, ? extends String>, Continuation<? super InterfaceC43160i<? extends CompleteRegistrationInternalAction>>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f93519q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ h f93520r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(h hVar, Continuation<? super c> continuation) {
                super(2, continuation);
                this.f93520r = hVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                c cVar = new c(this.f93520r, continuation);
                cVar.f93519q = obj;
                return cVar;
            }

            @Override // Y41.p
            public final Object invoke(Map<String, ? extends String> map, Continuation<? super InterfaceC43160i<? extends CompleteRegistrationInternalAction>> continuation) {
                return ((c) create(map, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                C42729a0.b(obj);
                Map map = (Map) this.f93519q;
                this.f93520r.getClass();
                return new C43210w(h.c(map));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, String str2, String str3, InterfaceC15745b.C1278b c1278b, String str4, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f93507t = str;
            this.f93508u = str2;
            this.f93509v = str3;
            this.f93510w = c1278b;
            this.f93511x = str4;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = h.this.new b(this.f93507t, this.f93508u, this.f93509v, this.f93510w, this.f93511x, continuation);
            bVar.f93505r = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super CompleteRegistrationInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x00ae A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00af  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00e5 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00f2 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r18) {
            /*
                Method dump skipped, instructions count: 246
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.authorization.complete_registration.mvi.h.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public h(@Y61.k InterfaceC34258d interfaceC34258d, @Y61.k InterfaceC27663a interfaceC27663a, @Y61.k InterfaceC40419c interfaceC40419c, @Y61.k InterfaceC18254a interfaceC18254a, @Y61.k P p12, @Y61.k o oVar) {
        this.f93490a = interfaceC34258d;
        this.f93491b = interfaceC27663a;
        this.f93492c = interfaceC40419c;
        this.f93493d = interfaceC18254a;
        this.f93494e = p12;
        this.f93495f = oVar;
    }

    public static CompleteRegistrationInternalAction c(Map map) {
        String str = (String) map.get("name");
        String str2 = (String) map.get("password");
        if (str != null || str2 != null) {
            return new CompleteRegistrationInternalAction.HighlightInputs(str != null ? com.avito.android.printable_text.b.f(str) : null, str2 != null ? com.avito.android.printable_text.b.f(str2) : null);
        }
        String str3 = (String) C42745f0.F(map.values());
        return new CompleteRegistrationInternalAction.ShowError(str3 != null ? com.avito.android.printable_text.b.f(str3) : com.avito.android.printable_text.b.c(R.string.auth_common_error, new Serializable[0]), null, 2, null);
    }

    @Override // com.avito.android.authorization.complete_registration.mvi.f
    @Y61.k
    public final InterfaceC43160i<CompleteRegistrationInternalAction> a(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.k String str4, @Y61.k InterfaceC15745b.C1278b c1278b) {
        return C43175k.G(new b(str2, str3, str4, c1278b, str, null));
    }

    @Override // com.avito.android.authorization.complete_registration.mvi.f
    @Y61.k
    public final InterfaceC43160i<CompleteRegistrationInternalAction> b(@Y61.k Profile profile, @Y61.k Session session, @Y61.k String str, @Y61.k InterfaceC15745b.C1278b c1278b, @Y61.k String str2) {
        return C43175k.G(new a(session, profile, str, c1278b, str2, null));
    }
}
