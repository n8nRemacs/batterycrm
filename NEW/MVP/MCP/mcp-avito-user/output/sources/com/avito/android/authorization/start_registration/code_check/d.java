package com.avito.android.authorization.start_registration.code_check;

import To.InterfaceC15383a;
import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.code_check_public.model.Phone;
import com.avito.android.code_check_public.screen.c;
import com.avito.android.code_confirmation.code_confirmation.model.ConfirmedCodeInfo;
import com.avito.android.remote.model.registration.ConfirmCodeResult;
import com.avito.android.remote.r;
import com.huawei.hms.adapter.internal.AvailableCode;
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
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: RegistrationCodeConfirmInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/authorization/start_registration/code_check/d;", "Lcom/avito/android/code_check_public/screen/c$b;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class d extends c.b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final r f94622a;

    /* compiled from: RegistrationCodeConfirmInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LTo/a;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.authorization.start_registration.code_check.RegistrationCodeConfirmInteractor$confirm$1", f = "RegistrationCodeConfirmInteractor.kt", i = {0, 1}, l = {23, AvailableCode.USER_IGNORE_PREVIOUS_POPUP, 50}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super InterfaceC15383a>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public d f94623q;

        /* renamed from: r, reason: collision with root package name */
        public int f94624r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f94625s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f94626t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ d f94627u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f94628v;

        /* compiled from: RegistrationCodeConfirmInteractor.kt */
        @s0
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/registration/ConfirmCodeResult;", "result", "LTo/a;", "<anonymous>", "(Lcom/avito/android/remote/model/registration/ConfirmCodeResult;)LTo/a;"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.authorization.start_registration.code_check.RegistrationCodeConfirmInteractor$confirm$1$result$1", f = "RegistrationCodeConfirmInteractor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.authorization.start_registration.code_check.d$a$a, reason: collision with other inner class name */
        public static final class C2808a extends SuspendLambda implements p<ConfirmCodeResult, Continuation<? super InterfaceC15383a>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f94629q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ String f94630r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2808a(String str, Continuation<? super C2808a> continuation) {
                super(2, continuation);
                this.f94630r = str;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                C2808a c2808a = new C2808a(this.f94630r, continuation);
                c2808a.f94629q = obj;
                return c2808a;
            }

            @Override // Y41.p
            public final Object invoke(ConfirmCodeResult confirmCodeResult, Continuation<? super InterfaceC15383a> continuation) {
                return ((C2808a) create(confirmCodeResult, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@k Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                C42729a0.b(obj);
                ConfirmCodeResult confirmCodeResult = (ConfirmCodeResult) this.f94629q;
                if (confirmCodeResult instanceof ConfirmCodeResult.Failure) {
                    return new InterfaceC15383a.c(com.avito.android.printable_text.b.f(((ConfirmCodeResult.Failure) confirmCodeResult).getMessage()), null, null, 6, null);
                }
                if (confirmCodeResult instanceof ConfirmCodeResult.IncorrectData) {
                    String str = (String) C42745f0.F(((ConfirmCodeResult.IncorrectData) confirmCodeResult).getMessages().values());
                    return new InterfaceC15383a.d.b(str != null ? com.avito.android.printable_text.b.f(str) : com.avito.android.code_check_public.k.a());
                }
                if (!(confirmCodeResult instanceof ConfirmCodeResult.Ok)) {
                    throw new NoWhenBranchMatchedException();
                }
                ConfirmCodeResult.Ok ok2 = (ConfirmCodeResult.Ok) confirmCodeResult;
                return new InterfaceC15383a.C1082a(new To.b(new ConfirmedCodeInfo(Phone.b(this.f94630r), ok2.getHash(), ok2.getIsPhoneUsed(), null, 8, null)));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, d dVar, String str2, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f94626t = str;
            this.f94627u = dVar;
            this.f94628v = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            a aVar = new a(this.f94626t, this.f94627u, this.f94628v, continuation);
            aVar.f94625s = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super InterfaceC15383a> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x0082 A[RETURN] */
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
                int r1 = r10.f94624r
                r2 = 3
                r3 = 2
                r4 = 1
                java.lang.String r5 = r10.f94626t
                r6 = 0
                if (r1 == 0) goto L33
                if (r1 == r4) goto L29
                if (r1 == r3) goto L21
                if (r1 != r2) goto L19
                kotlin.C42729a0.b(r11)
                goto L83
            L19:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L21:
                java.lang.Object r1 = r10.f94625s
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r11)
                goto L76
            L29:
                com.avito.android.authorization.start_registration.code_check.d r1 = r10.f94623q
                java.lang.Object r4 = r10.f94625s
                kotlinx.coroutines.flow.j r4 = (kotlinx.coroutines.flow.InterfaceC43172j) r4
                kotlin.C42729a0.b(r11)
                goto L5e
            L33:
                kotlin.C42729a0.b(r11)
                java.lang.Object r11 = r10.f94625s
                kotlinx.coroutines.flow.j r11 = (kotlinx.coroutines.flow.InterfaceC43172j) r11
                if (r5 == 0) goto L41
                com.avito.android.code_check_public.model.Phone r1 = com.avito.android.code_check_public.model.Phone.a(r5)
                goto L42
            L41:
                r1 = r6
            L42:
                if (r1 == 0) goto L86
                com.avito.android.authorization.start_registration.code_check.d r1 = r10.f94627u
                com.avito.android.remote.r r7 = r1.f94622a
                android.os.Parcelable$Creator<com.avito.android.authorization.analytics.CodeConfirmationSource> r8 = com.avito.android.authorization.analytics.CodeConfirmationSource.CREATOR
                r10.f94625s = r11
                r10.f94623q = r1
                r10.f94624r = r4
                java.lang.String r4 = r10.f94628v
                java.lang.String r8 = "registration"
                java.lang.Object r4 = r7.q(r5, r4, r8, r10)
                if (r4 != r0) goto L5b
                return r0
            L5b:
                r9 = r4
                r4 = r11
                r11 = r9
            L5e:
                com.avito.android.remote.model.TypedResult r11 = (com.avito.android.remote.model.TypedResult) r11
                com.avito.android.authorization.start_registration.code_check.d$a$a r7 = new com.avito.android.authorization.start_registration.code_check.d$a$a
                r7.<init>(r5, r6)
                r10.f94625s = r4
                r10.f94623q = r6
                r10.f94624r = r3
                r1.getClass()
                java.lang.Object r11 = com.avito.android.code_check_public.screen.c.b.b(r11, r7, r10)
                if (r11 != r0) goto L75
                return r0
            L75:
                r1 = r4
            L76:
                To.a r11 = (To.InterfaceC15383a) r11
                r10.f94625s = r6
                r10.f94624r = r2
                java.lang.Object r11 = r1.emit(r11, r10)
                if (r11 != r0) goto L83
                return r0
            L83:
                kotlin.G0 r11 = kotlin.G0.f406611a
                return r11
            L86:
                java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Phone must be set for RegistrationCodeConfirmInteractor"
                r11.<init>(r0)
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.authorization.start_registration.code_check.d.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public d(@k r rVar) {
        this.f94622a = rVar;
    }

    @Override // com.avito.android.code_check_public.screen.c.b
    @k
    public final InterfaceC43160i<InterfaceC15383a> a(@k String str, @l String str2) {
        return C43175k.G(new a(str2, this, str, null));
    }
}
