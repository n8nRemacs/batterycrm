package com.avito.android.success.domain;

import Y41.p;
import Y61.k;
import Y61.l;
import cA0.InterfaceC26997a;
import com.avito.android.success.g;
import com.avito.android.success.mvi.entity.SuccessInternalAction;
import com.avito.android.util.R0;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
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

/* compiled from: GetSuccessDataUseCase.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/success/domain/a;", "", "_avito_success_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f291606a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC26997a f291607b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final g f291608c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final R0 f291609d;

    /* compiled from: GetSuccessDataUseCase.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/success/mvi/entity/SuccessInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.success.domain.GetSuccessDataUseCase$invoke$1", f = "GetSuccessDataUseCase.kt", i = {0, 1}, l = {InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES, AvailableCode.ERROR_ON_ACTIVITY_RESULT, 43}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    /* renamed from: com.avito.android.success.domain.a$a, reason: collision with other inner class name */
    public static final class C8825a extends SuspendLambda implements p<InterfaceC43172j<? super SuccessInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f291610q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f291611r;

        public C8825a(Continuation<? super C8825a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            C8825a c8825a = a.this.new C8825a(continuation);
            c8825a.f291611r = obj;
            return c8825a;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super SuccessInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((C8825a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x008b  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00b1 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r8.f291610q
                com.avito.android.success.domain.a r2 = com.avito.android.success.domain.a.this
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L30
                if (r1 == r5) goto L28
                if (r1 == r4) goto L20
                if (r1 != r3) goto L18
                kotlin.C42729a0.b(r9)
                goto Lb2
            L18:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L20:
                java.lang.Object r1 = r8.f291611r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r9)
                goto L54
            L28:
                java.lang.Object r1 = r8.f291611r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r9)
                goto L45
            L30:
                kotlin.C42729a0.b(r9)
                java.lang.Object r9 = r8.f291611r
                kotlinx.coroutines.flow.j r9 = (kotlinx.coroutines.flow.InterfaceC43172j) r9
                com.avito.android.success.mvi.entity.SuccessInternalAction$Loading r1 = com.avito.android.success.mvi.entity.SuccessInternalAction.Loading.f291680b
                r8.f291611r = r9
                r8.f291610q = r5
                java.lang.Object r1 = r9.emit(r1, r8)
                if (r1 != r0) goto L44
                return r0
            L44:
                r1 = r9
            L45:
                cA0.a r9 = r2.f291607b
                r8.f291611r = r1
                r8.f291610q = r4
                java.lang.String r4 = r2.f291606a
                java.lang.Object r9 = r9.a(r4, r8)
                if (r9 != r0) goto L54
                return r0
            L54:
                com.avito.android.remote.model.TypedResult r9 = (com.avito.android.remote.model.TypedResult) r9
                boolean r4 = r9 instanceof com.avito.android.remote.model.TypedResult.Success
                if (r4 == 0) goto L8b
                com.avito.android.remote.model.TypedResult$Success r9 = (com.avito.android.remote.model.TypedResult.Success) r9
                java.lang.Object r9 = r9.getResult()
                com.avito.android.success.models.SuccessDataResponse r9 = (com.avito.android.success.models.SuccessDataResponse) r9
                com.avito.android.success.g r2 = r2.f291608c
                com.avito.android.success.models.AnimationUrl r4 = r9.getAnimationUrl()
                com.avito.android.remote.model.text.AttributedText r5 = r9.getTitle()
                java.util.List r6 = r9.getItems()
                com.avito.android.success.models.CharitySignBlock r7 = r9.getCharityBlock()
                java.util.ArrayList r2 = r2.a(r4, r5, r6, r7)
                com.avito.android.success.mvi.entity.SuccessInternalAction$Content r4 = new com.avito.android.success.mvi.entity.SuccessInternalAction$Content
                UV0.c r5 = new UV0.c
                r5.<init>(r2)
                java.util.List r2 = r9.d()
                java.util.List r9 = r9.f()
                r4.<init>(r5, r2, r9)
                goto La6
            L8b:
                boolean r2 = r9 instanceof com.avito.android.remote.model.TypedResult.Error
                if (r2 == 0) goto Lb5
                com.avito.android.remote.model.TypedResult$Error r9 = (com.avito.android.remote.model.TypedResult.Error) r9
                com.avito.android.remote.error.ApiError r2 = r9.getError()
                java.lang.Throwable r9 = r9.getCause()
                com.avito.android.util.ApiException r9 = com.avito.android.util.C35936s.a(r2, r9)
                com.avito.android.success.mvi.entity.SuccessInternalAction$Error r4 = new com.avito.android.success.mvi.entity.SuccessInternalAction$Error
                com.avito.android.remote.error.ApiError r9 = com.avito.android.error.z.n(r9)
                r4.<init>(r9)
            La6:
                r9 = 0
                r8.f291611r = r9
                r8.f291610q = r3
                java.lang.Object r9 = r1.emit(r4, r8)
                if (r9 != r0) goto Lb2
                return r0
            Lb2:
                kotlin.G0 r9 = kotlin.G0.f406611a
                return r9
            Lb5:
                kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
                r9.<init>()
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.success.domain.a.C8825a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public a(@k String str, @k InterfaceC26997a interfaceC26997a, @k g gVar, @k R0 r02) {
        this.f291606a = str;
        this.f291607b = interfaceC26997a;
        this.f291608c = gVar;
        this.f291609d = r02;
    }

    @k
    public final InterfaceC43160i<SuccessInternalAction> a() {
        return C43175k.I(this.f291609d.a(), C43175k.G(new C8825a(null)));
    }
}
