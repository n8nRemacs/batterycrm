package com.avito.android.profile_phones.add_phone;

import com.avito.android.code_confirmation.code_confirmation.RequestCodeV2Source;
import com.avito.android.profile_phones.add_phone.mvi.entity.AddPhoneInternalAction;
import com.avito.android.profile_phones.landline_verification.LandlinePhoneVerificationViewModel;
import com.avito.android.remote.model.PhoneValidationResult;
import com.avito.android.remote.model.SelfEmployedPhoneValidationResult;
import com.avito.android.remote.model.registration.RequestCodeResult;
import com.avito.android.remote.model.user_profile.Phone;
import io.reactivex.rxjava3.core.I;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: AddPhoneInteractor.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/profile_phones/add_phone/o;", "Lcom/avito/android/profile_phones/add_phone/n;", "Lcom/avito/android/code_confirmation/code_confirmation/phone_confirm/b;", "Lcom/avito/android/profile_phones/validation/d;", "Lcom/avito/android/profile_phones/validation/a;", "Lcom/avito/android/profile_phones/add_phone/raw_phones_list/a;", "_avito_profile-phones_impl-verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class o implements n, com.avito.android.code_confirmation.code_confirmation.phone_confirm.b, com.avito.android.profile_phones.validation.d, com.avito.android.profile_phones.validation.a, com.avito.android.profile_phones.add_phone.raw_phones_list.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.code_confirmation.code_confirmation.phone_confirm.b f226944a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.profile_phones.validation.a f226945b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.profile_phones.validation.d f226946c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.profile_phones.add_phone.raw_phones_list.a f226947d;

    /* compiled from: AddPhoneInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/profile_phones/add_phone/mvi/entity/AddPhoneInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.profile_phones.add_phone.AddPhoneInteractorImpl$onPhoneConfirmedResult$1", f = "AddPhoneInteractor.kt", i = {}, l = {56, 56, 63}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super AddPhoneInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f226948q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f226949r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f226950s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ o f226951t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f226952u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ LandlinePhoneVerificationViewModel.ResultStatus f226953v;

        /* compiled from: AddPhoneInteractor.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.profile_phones.add_phone.o$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C6889a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f226954a;

            static {
                int[] iArr = new int[LandlinePhoneVerificationViewModel.ResultStatus.values().length];
                try {
                    LandlinePhoneVerificationViewModel.ResultStatus resultStatus = LandlinePhoneVerificationViewModel.ResultStatus.f227191b;
                    iArr[0] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    LandlinePhoneVerificationViewModel.ResultStatus resultStatus2 = LandlinePhoneVerificationViewModel.ResultStatus.f227191b;
                    iArr[1] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    LandlinePhoneVerificationViewModel.ResultStatus resultStatus3 = LandlinePhoneVerificationViewModel.ResultStatus.f227191b;
                    iArr[2] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f226954a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, o oVar, String str2, LandlinePhoneVerificationViewModel.ResultStatus resultStatus, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f226950s = str;
            this.f226951t = oVar;
            this.f226952u = str2;
            this.f226953v = resultStatus;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f226950s, this.f226951t, this.f226952u, this.f226953v, continuation);
            aVar.f226949r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super AddPhoneInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0056 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r11) {
            /*
                r10 = this;
                r0 = 0
                r1 = 1
                java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r3 = r10.f226948q
                r4 = 3
                r5 = 2
                if (r3 == 0) goto L28
                if (r3 == r1) goto L20
                if (r3 == r5) goto L1b
                if (r3 != r4) goto L13
                goto L1b
            L13:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L1b:
                kotlin.C42729a0.b(r11)
                goto La5
            L20:
                java.lang.Object r0 = r10.f226949r
                kotlinx.coroutines.flow.j r0 = (kotlinx.coroutines.flow.InterfaceC43172j) r0
                kotlin.C42729a0.b(r11)
                goto L4b
            L28:
                kotlin.C42729a0.b(r11)
                java.lang.Object r11 = r10.f226949r
                kotlinx.coroutines.flow.j r11 = (kotlinx.coroutines.flow.InterfaceC43172j) r11
                java.lang.String r3 = r10.f226950s
                java.lang.String r6 = "self-employed"
                boolean r3 = kotlin.jvm.internal.L.f(r3, r6)
                java.lang.String r6 = r10.f226952u
                if (r3 == 0) goto L57
                r10.f226949r = r11
                r10.f226948q = r1
                com.avito.android.profile_phones.add_phone.o r0 = r10.f226951t
                java.lang.Object r0 = r0.d(r6, r10)
                if (r0 != r2) goto L48
                return r2
            L48:
                r9 = r0
                r0 = r11
                r11 = r9
            L4b:
                r1 = 0
                r10.f226949r = r1
                r10.f226948q = r5
                java.lang.Object r11 = r0.emit(r11, r10)
                if (r11 != r2) goto La5
                return r2
            L57:
                r3 = -1
                com.avito.android.profile_phones.landline_verification.LandlinePhoneVerificationViewModel$ResultStatus r7 = r10.f226953v
                if (r7 != 0) goto L5e
                r7 = r3
                goto L66
            L5e:
                int[] r8 = com.avito.android.profile_phones.add_phone.o.a.C6889a.f226954a
                int r7 = r7.ordinal()
                r7 = r8[r7]
            L66:
                if (r7 == r3) goto L8c
                if (r7 == r1) goto L8c
                if (r7 == r5) goto L80
                if (r7 != r4) goto L7a
                r3 = 2131958274(0x7f131a02, float:1.9553156E38)
                java.io.Serializable[] r1 = new java.io.Serializable[r1]
                r1[r0] = r6
                com.avito.android.printable_text.PrintableText r0 = com.avito.android.printable_text.b.c(r3, r1)
                goto L97
            L7a:
                kotlin.NoWhenBranchMatchedException r11 = new kotlin.NoWhenBranchMatchedException
                r11.<init>()
                throw r11
            L80:
                r3 = 2131956025(0x7f131139, float:1.9548594E38)
                java.io.Serializable[] r1 = new java.io.Serializable[r1]
                r1[r0] = r6
                com.avito.android.printable_text.PrintableText r0 = com.avito.android.printable_text.b.c(r3, r1)
                goto L97
            L8c:
                r3 = 2131956026(0x7f13113a, float:1.9548596E38)
                java.io.Serializable[] r1 = new java.io.Serializable[r1]
                r1[r0] = r6
                com.avito.android.printable_text.PrintableText r0 = com.avito.android.printable_text.b.c(r3, r1)
            L97:
                com.avito.android.profile_phones.add_phone.mvi.entity.AddPhoneInternalAction$RoutingFinish r1 = new com.avito.android.profile_phones.add_phone.mvi.entity.AddPhoneInternalAction$RoutingFinish
                r1.<init>(r6, r0)
                r10.f226948q = r4
                java.lang.Object r11 = r11.emit(r1, r10)
                if (r11 != r2) goto La5
                return r2
            La5:
                kotlin.G0 r11 = kotlin.G0.f406611a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.profile_phones.add_phone.o.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public o(@Y61.k com.avito.android.code_confirmation.code_confirmation.phone_confirm.b bVar, @Y61.k com.avito.android.profile_phones.validation.a aVar, @Y61.k com.avito.android.profile_phones.validation.d dVar, @Y61.k com.avito.android.profile_phones.add_phone.raw_phones_list.a aVar2) {
        this.f226944a = bVar;
        this.f226945b = aVar;
        this.f226946c = dVar;
        this.f226947d = aVar2;
    }

    @Override // com.avito.android.profile_phones.validation.d
    @Y61.k
    public final I<PhoneValidationResult> a(@Y61.k String str) {
        return this.f226946c.a(str);
    }

    @Override // com.avito.android.profile_phones.validation.a
    @Y61.k
    public final I<SelfEmployedPhoneValidationResult> b(@Y61.k String str) {
        return this.f226945b.b(str);
    }

    @Override // com.avito.android.profile_phones.add_phone.n
    @Y61.k
    public final InterfaceC43160i c(@Y61.l LandlinePhoneVerificationViewModel.ResultStatus resultStatus, @Y61.l String str, @Y61.k String str2) {
        return C43175k.G(new a(str, this, str2, resultStatus, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.avito.android.profile_phones.add_phone.n
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(@Y61.k java.lang.String r6, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.avito.android.profile_phones.add_phone.p
            if (r0 == 0) goto L13
            r0 = r7
            com.avito.android.profile_phones.add_phone.p r0 = (com.avito.android.profile_phones.add_phone.p) r0
            int r1 = r0.f226958t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f226958t = r1
            goto L18
        L13:
            com.avito.android.profile_phones.add_phone.p r0 = new com.avito.android.profile_phones.add_phone.p
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f226956r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f226958t
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.String r6 = r0.f226955q
            kotlin.C42729a0.b(r7)     // Catch: java.lang.Throwable -> L2c
            goto L4a
        L2c:
            r6 = move-exception
            goto L6e
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            kotlin.C42729a0.b(r7)
            com.avito.android.profile_phones.validation.a r7 = r5.f226945b     // Catch: java.lang.Throwable -> L2c
            io.reactivex.rxjava3.core.I r7 = r7.b(r6)     // Catch: java.lang.Throwable -> L2c
            r0.f226955q = r6     // Catch: java.lang.Throwable -> L2c
            r0.f226958t = r3     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r7 = kotlinx.coroutines.rx3.C43292o.b(r7, r0)     // Catch: java.lang.Throwable -> L2c
            if (r7 != r1) goto L4a
            return r1
        L4a:
            com.avito.android.remote.model.SelfEmployedPhoneValidationResult r7 = (com.avito.android.remote.model.SelfEmployedPhoneValidationResult) r7     // Catch: java.lang.Throwable -> L2c
            boolean r0 = r7 instanceof com.avito.android.remote.model.SelfEmployedPhoneValidationResult.Ok     // Catch: java.lang.Throwable -> L2c
            if (r0 == 0) goto L56
            com.avito.android.profile_phones.add_phone.mvi.entity.AddPhoneInternalAction$RoutingFinish r7 = new com.avito.android.profile_phones.add_phone.mvi.entity.AddPhoneInternalAction$RoutingFinish     // Catch: java.lang.Throwable -> L2c
            r7.<init>(r6, r4)     // Catch: java.lang.Throwable -> L2c
            goto L80
        L56:
            boolean r6 = r7 instanceof com.avito.android.remote.model.SelfEmployedPhoneValidationResult.Failure     // Catch: java.lang.Throwable -> L2c
            if (r6 == 0) goto L68
            com.avito.android.profile_phones.add_phone.mvi.entity.AddPhoneInternalAction$Error r6 = new com.avito.android.profile_phones.add_phone.mvi.entity.AddPhoneInternalAction$Error     // Catch: java.lang.Throwable -> L2c
            com.avito.android.remote.model.SelfEmployedPhoneValidationResult$Failure r7 = (com.avito.android.remote.model.SelfEmployedPhoneValidationResult.Failure) r7     // Catch: java.lang.Throwable -> L2c
            java.lang.String r7 = r7.getMessage()     // Catch: java.lang.Throwable -> L2c
            r0 = 2
            r6.<init>(r7, r4, r0, r4)     // Catch: java.lang.Throwable -> L2c
            r7 = r6
            goto L80
        L68:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException     // Catch: java.lang.Throwable -> L2c
            r6.<init>()     // Catch: java.lang.Throwable -> L2c
            throw r6     // Catch: java.lang.Throwable -> L2c
        L6e:
            boolean r7 = r6 instanceof java.util.concurrent.CancellationException
            if (r7 != 0) goto L81
            com.avito.android.util.V2 r7 = com.avito.android.util.V2.f318762a
            java.lang.String r0 = "DEFAULT_TAG"
            java.lang.String r1 = "Failed to validate self employed phone"
            r7.a(r0, r1, r6)
            com.avito.android.profile_phones.add_phone.mvi.entity.AddPhoneInternalAction$Error r7 = new com.avito.android.profile_phones.add_phone.mvi.entity.AddPhoneInternalAction$Error
            r7.<init>(r4, r6)
        L80:
            return r7
        L81:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.profile_phones.add_phone.o.d(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // com.avito.android.code_confirmation.code_confirmation.phone_confirm.b
    @Y61.k
    public final I<RequestCodeResult> e(@Y61.k String str, @Y61.k RequestCodeV2Source requestCodeV2Source, boolean z12, boolean z13) {
        return this.f226944a.e(str, requestCodeV2Source, z12, z13);
    }

    @Override // com.avito.android.profile_phones.add_phone.raw_phones_list.a
    @Y61.k
    public final I<List<Phone>> f() {
        return this.f226947d.f();
    }

    @Override // com.avito.android.code_confirmation.code_confirmation.phone_confirm.b
    @Y61.k
    public final I<com.avito.android.code_confirmation.code_confirmation.phone_confirm.a> g(@Y61.k String str, @Y61.k String str2, @Y61.k RequestCodeV2Source requestCodeV2Source) {
        return this.f226944a.g(str, str2, requestCodeV2Source);
    }
}
