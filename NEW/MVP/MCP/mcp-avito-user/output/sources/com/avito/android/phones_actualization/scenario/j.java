package com.avito.android.phones_actualization.scenario;

import com.avito.android.code_check_public.screen.d;
import com.avito.android.remote.InterfaceC34401z0;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ActualizePhonesPhoneRequestInteractor.kt */
@com.avito.android.code_check_public.g
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/phones_actualization/scenario/j;", "Lcom/avito/android/code_check_public/screen/d$b;", "_avito_phones-actualization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class j extends d.b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.remote.r f216255a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC34401z0 f216256b;

    /* compiled from: ActualizePhonesPhoneRequestInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LTo/d;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.phones_actualization.scenario.ActualizePhonesPhoneRequestInteractor$request$1", f = "ActualizePhonesPhoneRequestInteractor.kt", i = {0}, l = {38, 40, 44, 44}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super To.d>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f216257q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f216258r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f216259s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ j f216260t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, j jVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f216259s = str;
            this.f216260t = jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f216259s, this.f216260t, continuation);
            aVar.f216258r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super To.d> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:35:0x007f A[RETURN] */
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
                int r1 = r10.f216257q
                com.avito.android.phones_actualization.scenario.j r2 = r10.f216260t
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                r7 = 0
                java.lang.String r8 = r10.f216259s
                if (r1 == 0) goto L39
                if (r1 == r6) goto L31
                if (r1 == r5) goto L2d
                if (r1 == r4) goto L25
                if (r1 != r3) goto L1d
                kotlin.C42729a0.b(r11)
                goto L80
            L1d:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L25:
                java.lang.Object r1 = r10.f216258r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r11)
                goto L75
            L2d:
                kotlin.C42729a0.b(r11)
                goto L67
            L31:
                java.lang.Object r1 = r10.f216258r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r11)
                goto L58
            L39:
                kotlin.C42729a0.b(r11)
                java.lang.Object r11 = r10.f216258r
                kotlinx.coroutines.flow.j r11 = (kotlinx.coroutines.flow.InterfaceC43172j) r11
                if (r8 == 0) goto L47
                com.avito.android.code_check_public.model.Phone r1 = com.avito.android.code_check_public.model.Phone.a(r8)
                goto L48
            L47:
                r1 = r7
            L48:
                if (r1 == 0) goto L83
                r10.f216258r = r11
                r10.f216257q = r6
                java.lang.Object r1 = com.avito.android.phones_actualization.scenario.j.e(r2, r8, r10)
                if (r1 != r0) goto L55
                return r0
            L55:
                r9 = r1
                r1 = r11
                r11 = r9
            L58:
                To.d r11 = (To.d) r11
                if (r11 == 0) goto L6a
                r10.f216258r = r7
                r10.f216257q = r5
                java.lang.Object r11 = r1.emit(r11, r10)
                if (r11 != r0) goto L67
                return r0
            L67:
                kotlin.G0 r11 = kotlin.G0.f406611a
                return r11
            L6a:
                r10.f216258r = r1
                r10.f216257q = r4
                java.lang.Object r11 = com.avito.android.phones_actualization.scenario.j.d(r2, r8, r10)
                if (r11 != r0) goto L75
                return r0
            L75:
                r10.f216258r = r7
                r10.f216257q = r3
                java.lang.Object r11 = r1.emit(r11, r10)
                if (r11 != r0) goto L80
                return r0
            L80:
                kotlin.G0 r11 = kotlin.G0.f406611a
                return r11
            L83:
                java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Phone must be set for ActualizePhonesPhoneRequestInteractor"
                r11.<init>(r0)
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.phones_actualization.scenario.j.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public j(@Y61.k com.avito.android.remote.r rVar, @Y61.k InterfaceC34401z0 interfaceC34401z0) {
        this.f216255a = rVar;
        this.f216256b = interfaceC34401z0;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(com.avito.android.phones_actualization.scenario.j r4, java.lang.String r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r4.getClass()
            boolean r0 = r6 instanceof com.avito.android.phones_actualization.scenario.e
            if (r0 == 0) goto L16
            r0 = r6
            com.avito.android.phones_actualization.scenario.e r0 = (com.avito.android.phones_actualization.scenario.e) r0
            int r1 = r0.f216248u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f216248u = r1
            goto L1b
        L16:
            com.avito.android.phones_actualization.scenario.e r0 = new com.avito.android.phones_actualization.scenario.e
            r0.<init>(r4, r6)
        L1b:
            java.lang.Object r6 = r0.f216246s
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f216248u
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            com.avito.android.phones_actualization.scenario.j r4 = r0.f216245r
            java.lang.String r5 = r0.f216244q
            kotlin.C42729a0.b(r6)
            goto L50
        L30:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L38:
            kotlin.C42729a0.b(r6)
            java.lang.String r6 = com.avito.android.code_check_public.model.Phone.b(r5)
            r0.f216244q = r5
            r0.f216245r = r4
            r0.f216248u = r3
            com.avito.android.remote.r r2 = r4.f216255a
            java.lang.String r3 = "actualization_popup"
            java.lang.Object r6 = r2.f(r6, r3, r0)
            if (r6 != r1) goto L50
            goto L5e
        L50:
            com.avito.android.remote.model.TypedResult r6 = (com.avito.android.remote.model.TypedResult) r6
            com.avito.android.phones_actualization.scenario.f r0 = new com.avito.android.phones_actualization.scenario.f
            r0.<init>(r5)
            r4.getClass()
            To.d r1 = com.avito.android.code_check_public.screen.f.a(r6, r0)
        L5e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.phones_actualization.scenario.j.d(com.avito.android.phones_actualization.scenario.j, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(com.avito.android.phones_actualization.scenario.j r10, java.lang.String r11, kotlin.coroutines.jvm.internal.ContinuationImpl r12) {
        /*
            r10.getClass()
            boolean r0 = r12 instanceof com.avito.android.phones_actualization.scenario.g
            if (r0 == 0) goto L16
            r0 = r12
            com.avito.android.phones_actualization.scenario.g r0 = (com.avito.android.phones_actualization.scenario.g) r0
            int r1 = r0.f216252s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f216252s = r1
            goto L1b
        L16:
            com.avito.android.phones_actualization.scenario.g r0 = new com.avito.android.phones_actualization.scenario.g
            r0.<init>(r10, r12)
        L1b:
            java.lang.Object r12 = r0.f216250q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f216252s
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            kotlin.C42729a0.b(r12)
            goto L4b
        L2c:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L34:
            kotlin.C42729a0.b(r12)
            com.avito.android.remote.z0 r10 = r10.f216256b
            java.lang.String r11 = com.avito.android.code_check_public.model.Phone.b(r11)
            io.reactivex.rxjava3.core.I r10 = r10.h(r11)
            r0.f216252s = r3
            java.lang.Object r12 = kotlinx.coroutines.rx3.C43292o.b(r10, r0)
            if (r12 != r1) goto L4b
            goto Lc2
        L4b:
            com.avito.android.remote.model.TypedResult r12 = (com.avito.android.remote.model.TypedResult) r12
            boolean r10 = r12 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r10 == 0) goto L6a
            com.avito.android.remote.model.TypedResult$Error r12 = (com.avito.android.remote.model.TypedResult.Error) r12
            com.avito.android.remote.error.ApiError r0 = r12.getError()
            com.avito.android.phones_actualization.scenario.h r1 = com.avito.android.phones_actualization.scenario.h.f216253l
            com.avito.android.phones_actualization.scenario.i r2 = com.avito.android.phones_actualization.scenario.i.f216254l
            com.avito.android.printable_text.PrintableText r4 = com.avito.android.code_check_public.k.a()
            r3 = 0
            r5 = 12
            java.lang.Object r10 = com.avito.android.error.z.q(r0, r1, r2, r3, r4, r5)
            To.d r10 = (To.d) r10
        L68:
            r1 = r10
            goto Lc2
        L6a:
            boolean r10 = r12 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r10 == 0) goto Lc9
            com.avito.android.remote.model.TypedResult$Success r12 = (com.avito.android.remote.model.TypedResult.Success) r12
            java.lang.Object r10 = r12.getResult()
            com.avito.android.remote.model.PhoneValidationResult r10 = (com.avito.android.remote.model.PhoneValidationResult) r10
            boolean r11 = r10 instanceof com.avito.android.remote.model.PhoneValidationResult.AllowReverification
            if (r11 == 0) goto L7b
            goto L7d
        L7b:
            boolean r3 = r10 instanceof com.avito.android.remote.model.PhoneValidationResult.DisallowReverification
        L7d:
            if (r3 == 0) goto L94
            To.d$b r10 = new To.d$b
            r11 = 0
            java.io.Serializable[] r11 = new java.io.Serializable[r11]
            r12 = 2131956074(0x7f13116a, float:1.9548693E38)
            com.avito.android.printable_text.PrintableText r5 = com.avito.android.printable_text.b.c(r12, r11)
            r8 = 6
            r9 = 0
            r6 = 0
            r7 = 0
            r4 = r10
            r4.<init>(r5, r6, r7, r8, r9)
            goto L68
        L94:
            boolean r11 = r10 instanceof com.avito.android.remote.model.PhoneValidationResult.IncorrectData
            if (r11 == 0) goto Lbc
            com.avito.android.remote.model.PhoneValidationResult$IncorrectData r10 = (com.avito.android.remote.model.PhoneValidationResult.IncorrectData) r10
            java.util.Map r10 = r10.getMessages()
            java.util.Collection r10 = r10.values()
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.lang.Object r10 = kotlin.collections.C42745f0.F(r10)
            java.lang.String r10 = (java.lang.String) r10
            if (r10 == 0) goto Lb1
            com.avito.android.printable_text.PrintableText r10 = com.avito.android.printable_text.b.f(r10)
            goto Lb5
        Lb1:
            com.avito.android.printable_text.PrintableText r10 = com.avito.android.code_check_public.k.a()
        Lb5:
            To.d$c$b r11 = new To.d$c$b
            r11.<init>(r10)
            r1 = r11
            goto Lc2
        Lbc:
            boolean r10 = r10 instanceof com.avito.android.remote.model.PhoneValidationResult.Ok
            if (r10 == 0) goto Lc3
            r10 = 0
            goto L68
        Lc2:
            return r1
        Lc3:
            kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
            r10.<init>()
            throw r10
        Lc9:
            kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
            r10.<init>()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.phones_actualization.scenario.j.e(com.avito.android.phones_actualization.scenario.j, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // com.avito.android.code_check_public.screen.d.b
    @Y61.k
    public final InterfaceC43160i<To.d> c(@Y61.l String str) {
        return C43175k.G(new a(str, this, null));
    }
}
