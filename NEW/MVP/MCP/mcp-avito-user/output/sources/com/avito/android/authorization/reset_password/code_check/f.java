package com.avito.android.authorization.reset_password.code_check;

import To.InterfaceC15383a;
import Y41.p;
import com.avito.android.authorization.confirm_3fa.ConfirmEmailList;
import com.avito.android.authorization.reset_password.code_check.ResetPasswordCodeCheckResult;
import com.avito.android.code_check_public.a;
import com.avito.android.code_check_public.screen.c;
import com.avito.android.remote.model.recover_by_phone.ConfirmPasswordRecoveryByPhoneResult;
import com.avito.android.remote.r;
import com.squareup.anvil.annotations.ContributesBinding;
import hD.C40806a;
import java.util.ArrayList;
import java.util.List;
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
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ResetPasswordCodeConfirmInteractor.kt */
@com.avito.android.code_check_public.g
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/authorization/reset_password/code_check/f;", "Lcom/avito/android/code_check_public/screen/c$b;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class f extends c.b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final r f94121a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C40806a f94122b;

    /* compiled from: ResetPasswordCodeConfirmInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LTo/a;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.authorization.reset_password.code_check.ResetPasswordCodeConfirmInteractor$confirm$1", f = "ResetPasswordCodeConfirmInteractor.kt", i = {0, 1, 2}, l = {36, 37, 39, 93}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow"}, s = {"L$0", "L$0", "L$0"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super InterfaceC15383a>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f94123q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f94124r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f94125s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ f f94126t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f94127u;

        /* compiled from: ResetPasswordCodeConfirmInteractor.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/recover_by_phone/ConfirmPasswordRecoveryByPhoneResult;", "result", "LTo/a;", "<anonymous>", "(Lcom/avito/android/remote/model/recover_by_phone/ConfirmPasswordRecoveryByPhoneResult;)LTo/a;"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.authorization.reset_password.code_check.ResetPasswordCodeConfirmInteractor$confirm$1$result$1", f = "ResetPasswordCodeConfirmInteractor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.authorization.reset_password.code_check.f$a$a, reason: collision with other inner class name */
        public static final class C2786a extends SuspendLambda implements p<ConfirmPasswordRecoveryByPhoneResult, Continuation<? super InterfaceC15383a>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f94128q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ String f94129r;

            /* compiled from: ResetPasswordCodeConfirmInteractor.kt */
            @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/code_check_public/a;", "invoke", "()Lcom/avito/android/code_check_public/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: com.avito.android.authorization.reset_password.code_check.f$a$a$a, reason: collision with other inner class name */
            public static final class C2787a extends N implements Y41.a<com.avito.android.code_check_public.a> {

                /* renamed from: l, reason: collision with root package name */
                public static final C2787a f94130l = new C2787a();

                public C2787a() {
                    super(0);
                }

                @Override // Y41.a
                public final com.avito.android.code_check_public.a invoke() {
                    return new a.b.C3497b(new To.b(ResetPasswordCodeCheckResult.CancelByAutoRecovery.f94109b), null, null, null, null, 30, null);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2786a(String str, Continuation<? super C2786a> continuation) {
                super(2, continuation);
                this.f94129r = str;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                C2786a c2786a = new C2786a(this.f94129r, continuation);
                c2786a.f94128q = obj;
                return c2786a;
            }

            @Override // Y41.p
            public final Object invoke(ConfirmPasswordRecoveryByPhoneResult confirmPasswordRecoveryByPhoneResult, Continuation<? super InterfaceC15383a> continuation) {
                return ((C2786a) create(confirmPasswordRecoveryByPhoneResult, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                C42729a0.b(obj);
                ConfirmPasswordRecoveryByPhoneResult confirmPasswordRecoveryByPhoneResult = (ConfirmPasswordRecoveryByPhoneResult) this.f94128q;
                if (confirmPasswordRecoveryByPhoneResult instanceof ConfirmPasswordRecoveryByPhoneResult.Failure) {
                    return new InterfaceC15383a.c(com.avito.android.printable_text.b.f(((ConfirmPasswordRecoveryByPhoneResult.Failure) confirmPasswordRecoveryByPhoneResult).getMessage()), null, null, 6, null);
                }
                if (confirmPasswordRecoveryByPhoneResult instanceof ConfirmPasswordRecoveryByPhoneResult.IncorrectData) {
                    String str = (String) C42745f0.F(((ConfirmPasswordRecoveryByPhoneResult.IncorrectData) confirmPasswordRecoveryByPhoneResult).getMessages().values());
                    return new InterfaceC15383a.d.b(str != null ? com.avito.android.printable_text.b.f(str) : com.avito.android.code_check_public.k.a());
                }
                if (confirmPasswordRecoveryByPhoneResult instanceof ConfirmPasswordRecoveryByPhoneResult.Ok) {
                    return new InterfaceC15383a.C1082a(new To.b(new ResetPasswordCodeCheckResult.Confirmed(this.f94129r, ((ConfirmPasswordRecoveryByPhoneResult.Ok) confirmPasswordRecoveryByPhoneResult).getHash(), true)));
                }
                if (confirmPasswordRecoveryByPhoneResult instanceof ConfirmPasswordRecoveryByPhoneResult.Deeplink) {
                    return new InterfaceC15383a.e(new a.InterfaceC3494a.b(((ConfirmPasswordRecoveryByPhoneResult.Deeplink) confirmPasswordRecoveryByPhoneResult).getDeeplink(), C2787a.f94130l));
                }
                if (confirmPasswordRecoveryByPhoneResult instanceof ConfirmPasswordRecoveryByPhoneResult.ErrorDialog) {
                    return new InterfaceC15383a.g(new com.avito.android.code_check_public.i(new com.avito.android.beduin.ui.screen.fragment.bottom_sheet.c(((ConfirmPasswordRecoveryByPhoneResult.ErrorDialog) confirmPasswordRecoveryByPhoneResult).getDialog()), null, 2, null));
                }
                if (!(confirmPasswordRecoveryByPhoneResult instanceof ConfirmPasswordRecoveryByPhoneResult.NeedConfirm3fa)) {
                    throw new NoWhenBranchMatchedException();
                }
                List<ConfirmPasswordRecoveryByPhoneResult.NeedConfirm3fa.Email> emailList = ((ConfirmPasswordRecoveryByPhoneResult.NeedConfirm3fa) confirmPasswordRecoveryByPhoneResult).getEmailList();
                ArrayList arrayList = new ArrayList(C42745f0.q(emailList, 10));
                for (ConfirmPasswordRecoveryByPhoneResult.NeedConfirm3fa.Email email : emailList) {
                    arrayList.add(new ConfirmEmailList.Email(email.getServerId(), email.getLabel()));
                }
                return new InterfaceC15383a.e(new a.b.C3497b(new To.b(new ResetPasswordCodeCheckResult.NeedConfirmEmailList(new ConfirmEmailList(arrayList))), null, null, null, null, 30, null));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, f fVar, String str2, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f94125s = str;
            this.f94126t = fVar;
            this.f94127u = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f94125s, this.f94126t, this.f94127u, continuation);
            aVar.f94124r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super InterfaceC15383a> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:35:0x00b1 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r11.f94123q
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 0
                r6 = 1
                com.avito.android.authorization.reset_password.code_check.f r7 = r11.f94126t
                java.lang.String r8 = r11.f94125s
                if (r1 == 0) goto L3f
                if (r1 == r6) goto L37
                if (r1 == r4) goto L2f
                if (r1 == r3) goto L26
                if (r1 != r2) goto L1e
                kotlin.C42729a0.b(r12)
                goto Lb2
            L1e:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L26:
                java.lang.Object r1 = r11.f94124r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r12)
                goto La5
            L2f:
                java.lang.Object r1 = r11.f94124r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r12)
                goto L90
            L37:
                java.lang.Object r1 = r11.f94124r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r12)
                goto L7c
            L3f:
                kotlin.C42729a0.b(r12)
                java.lang.Object r12 = r11.f94124r
                r1 = r12
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                if (r8 == 0) goto L4e
                com.avito.android.code_check_public.model.Phone r12 = com.avito.android.code_check_public.model.Phone.a(r8)
                goto L4f
            L4e:
                r12 = r5
            L4f:
                if (r12 == 0) goto Lbb
                hD.a r12 = r7.f94122b
                r12.getClass()
                kotlin.reflect.n<java.lang.Object>[] r9 = hD.C40806a.f397105l
                r10 = 6
                r9 = r9[r10]
                com.avito.android.A0$a r12 = r12.f397112h
                DE0.a r12 = r12.a()
                java.lang.Object r12 = r12.invoke()
                java.lang.Boolean r12 = (java.lang.Boolean) r12
                boolean r12 = r12.booleanValue()
                com.avito.android.remote.r r9 = r7.f94121a
                java.lang.String r10 = r11.f94127u
                if (r12 != r6) goto L7f
                r11.f94124r = r1
                r11.f94123q = r6
                java.lang.Object r12 = r9.p(r8, r10, r11)
                if (r12 != r0) goto L7c
                return r0
            L7c:
                com.avito.android.remote.model.TypedResult r12 = (com.avito.android.remote.model.TypedResult) r12
                goto L92
            L7f:
                if (r12 != 0) goto Lb5
                io.reactivex.rxjava3.core.z r12 = r9.b(r8, r10)
                r11.f94124r = r1
                r11.f94123q = r4
                java.lang.Object r12 = kotlinx.coroutines.rx3.C43292o.c(r12, r11)
                if (r12 != r0) goto L90
                return r0
            L90:
                com.avito.android.remote.model.TypedResult r12 = (com.avito.android.remote.model.TypedResult) r12
            L92:
                com.avito.android.authorization.reset_password.code_check.f$a$a r4 = new com.avito.android.authorization.reset_password.code_check.f$a$a
                r4.<init>(r8, r5)
                r11.f94124r = r1
                r11.f94123q = r3
                r7.getClass()
                java.lang.Object r12 = com.avito.android.code_check_public.screen.c.b.b(r12, r4, r11)
                if (r12 != r0) goto La5
                return r0
            La5:
                To.a r12 = (To.InterfaceC15383a) r12
                r11.f94124r = r5
                r11.f94123q = r2
                java.lang.Object r12 = r1.emit(r12, r11)
                if (r12 != r0) goto Lb2
                return r0
            Lb2:
                kotlin.G0 r12 = kotlin.G0.f406611a
                return r12
            Lb5:
                kotlin.NoWhenBranchMatchedException r12 = new kotlin.NoWhenBranchMatchedException
                r12.<init>()
                throw r12
            Lbb:
                java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Phone must be set for ResetPasswordCodeConfirmInteractor"
                r12.<init>(r0)
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.authorization.reset_password.code_check.f.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public f(@Y61.k r rVar, @Y61.k C40806a c40806a) {
        this.f94121a = rVar;
        this.f94122b = c40806a;
    }

    @Override // com.avito.android.code_check_public.screen.c.b
    @Y61.k
    public final InterfaceC43160i<InterfaceC15383a> a(@Y61.k String str, @Y61.l String str2) {
        return C43175k.G(new a(str2, this, str, null));
    }
}
