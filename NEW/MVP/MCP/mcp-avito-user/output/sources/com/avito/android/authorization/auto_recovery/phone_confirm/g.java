package com.avito.android.authorization.auto_recovery.phone_confirm;

import To.InterfaceC15383a;
import com.avito.android.code_check_public.a;
import com.avito.android.code_check_public.screen.c;
import ie.InterfaceC41389a;
import javax.inject.Inject;
import je.InterfaceC42365c;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: AutoRecoveryCodeConfirmInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/authorization/auto_recovery/phone_confirm/g;", "Lcom/avito/android/code_check_public/screen/c$b;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class g extends c.b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC41389a f93220a;

    /* compiled from: AutoRecoveryCodeConfirmInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LTo/a;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.authorization.auto_recovery.phone_confirm.AutoRecoveryCodeConfirmInteractor$confirm$1", f = "AutoRecoveryCodeConfirmInteractor.kt", i = {0, 1}, l = {21, 22, 33}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super InterfaceC15383a>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public g f93221q;

        /* renamed from: r, reason: collision with root package name */
        public int f93222r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f93223s;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f93225u;

        /* compiled from: AutoRecoveryCodeConfirmInteractor.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lje/c;", "result", "LTo/a;", "<anonymous>", "(Lje/c;)LTo/a;"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.authorization.auto_recovery.phone_confirm.AutoRecoveryCodeConfirmInteractor$confirm$1$result$1", f = "AutoRecoveryCodeConfirmInteractor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.authorization.auto_recovery.phone_confirm.g$a$a, reason: collision with other inner class name */
        public static final class C2755a extends SuspendLambda implements Y41.p<InterfaceC42365c, Continuation<? super InterfaceC15383a>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f93226q;

            /* compiled from: AutoRecoveryCodeConfirmInteractor.kt */
            @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/code_check_public/a;", "invoke", "()Lcom/avito/android/code_check_public/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: com.avito.android.authorization.auto_recovery.phone_confirm.g$a$a$a, reason: collision with other inner class name */
            public static final class C2756a extends N implements Y41.a<com.avito.android.code_check_public.a> {

                /* renamed from: l, reason: collision with root package name */
                public static final C2756a f93227l = new C2756a();

                public C2756a() {
                    super(0);
                }

                @Override // Y41.a
                public final com.avito.android.code_check_public.a invoke() {
                    return new a.b.C3497b(null, null, null, null, null, 31, null);
                }
            }

            public C2755a() {
                throw null;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                C2755a c2755a = new C2755a(2, continuation);
                c2755a.f93226q = obj;
                return c2755a;
            }

            @Override // Y41.p
            public final Object invoke(InterfaceC42365c interfaceC42365c, Continuation<? super InterfaceC15383a> continuation) {
                return ((C2755a) create(interfaceC42365c, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                C42729a0.b(obj);
                InterfaceC42365c interfaceC42365c = (InterfaceC42365c) this.f93226q;
                if (interfaceC42365c instanceof InterfaceC42365c.a) {
                    return new InterfaceC15383a.d.b(com.avito.android.printable_text.b.f(((InterfaceC42365c.a) interfaceC42365c).getMessages().getCode()));
                }
                if (interfaceC42365c instanceof InterfaceC42365c.b) {
                    return new InterfaceC15383a.e(new a.InterfaceC3494a.b(((InterfaceC42365c.b) interfaceC42365c).getUri(), C2756a.f93227l));
                }
                throw new NoWhenBranchMatchedException();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f93225u = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = g.this.new a(this.f93225u, continuation);
            aVar.f93223s = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super InterfaceC15383a> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0076 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r10.f93222r
                r2 = 3
                r3 = 1
                r4 = 0
                r5 = 2
                if (r1 == 0) goto L30
                if (r1 == r3) goto L26
                if (r1 == r5) goto L1e
                if (r1 != r2) goto L16
                kotlin.C42729a0.b(r11)
                goto L77
            L16:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L1e:
                java.lang.Object r1 = r10.f93223s
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r11)
                goto L6a
            L26:
                com.avito.android.authorization.auto_recovery.phone_confirm.g r1 = r10.f93221q
                java.lang.Object r3 = r10.f93223s
                kotlinx.coroutines.flow.j r3 = (kotlinx.coroutines.flow.InterfaceC43172j) r3
                kotlin.C42729a0.b(r11)
                goto L52
            L30:
                kotlin.C42729a0.b(r11)
                java.lang.Object r11 = r10.f93223s
                kotlinx.coroutines.flow.j r11 = (kotlinx.coroutines.flow.InterfaceC43172j) r11
                com.avito.android.authorization.auto_recovery.phone_confirm.g r1 = com.avito.android.authorization.auto_recovery.phone_confirm.g.this
                ie.a r6 = r1.f93220a
                je.b r7 = new je.b
                java.lang.String r8 = r10.f93225u
                r7.<init>(r8)
                r10.f93223s = r11
                r10.f93221q = r1
                r10.f93222r = r3
                java.lang.Object r3 = r6.b(r7, r10)
                if (r3 != r0) goto L4f
                return r0
            L4f:
                r9 = r3
                r3 = r11
                r11 = r9
            L52:
                com.avito.android.remote.model.TypedResult r11 = (com.avito.android.remote.model.TypedResult) r11
                com.avito.android.authorization.auto_recovery.phone_confirm.g$a$a r6 = new com.avito.android.authorization.auto_recovery.phone_confirm.g$a$a
                r6.<init>(r5, r4)
                r10.f93223s = r3
                r10.f93221q = r4
                r10.f93222r = r5
                r1.getClass()
                java.lang.Object r11 = com.avito.android.code_check_public.screen.c.b.b(r11, r6, r10)
                if (r11 != r0) goto L69
                return r0
            L69:
                r1 = r3
            L6a:
                To.a r11 = (To.InterfaceC15383a) r11
                r10.f93223s = r4
                r10.f93222r = r2
                java.lang.Object r11 = r1.emit(r11, r10)
                if (r11 != r0) goto L77
                return r0
            L77:
                kotlin.G0 r11 = kotlin.G0.f406611a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.authorization.auto_recovery.phone_confirm.g.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public g(@Y61.k InterfaceC41389a interfaceC41389a) {
        this.f93220a = interfaceC41389a;
    }

    @Override // com.avito.android.code_check_public.screen.c.b
    @Y61.k
    public final InterfaceC43160i<InterfaceC15383a> a(@Y61.k String str, @Y61.l String str2) {
        return C43175k.G(new a(str, null));
    }
}
