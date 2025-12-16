package com.avito.android.mortgage_invite.contact_info.domain;

import Y41.p;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage_invite.contact_info.mvi.entity.ApplicationContactInfoInternalAction;
import com.avito.android.util.R0;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import e20.InterfaceC39928a;
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

/* compiled from: LoadContactInfoFormUseCase.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage_invite/contact_info/domain/c;", "", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC39928a f205642a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.mortgage_invite.contact_info.domain.mapper.a f205643b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final R0 f205644c;

    /* compiled from: LoadContactInfoFormUseCase.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.mortgage_invite.contact_info.domain.LoadContactInfoFormUseCase$invoke$1", f = "LoadContactInfoFormUseCase.kt", i = {0, 1}, l = {20, 22, 23, InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<?>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f205645q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f205646r;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            a aVar = c.this.new a(continuation);
            aVar.f205646r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<?> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0060  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x007e  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r7.f205645q
                com.avito.android.mortgage_invite.contact_info.domain.c r2 = com.avito.android.mortgage_invite.contact_info.domain.c.this
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                if (r1 == 0) goto L34
                if (r1 == r6) goto L2c
                if (r1 == r5) goto L24
                if (r1 == r4) goto L1f
                if (r1 != r3) goto L17
                goto L1f
            L17:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1f:
                kotlin.C42729a0.b(r8)
                goto La4
            L24:
                java.lang.Object r1 = r7.f205646r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r8)
                goto L59
            L2c:
                java.lang.Object r1 = r7.f205646r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r8)
                goto L4c
            L34:
                kotlin.C42729a0.b(r8)
                java.lang.Object r8 = r7.f205646r
                kotlinx.coroutines.flow.j r8 = (kotlinx.coroutines.flow.InterfaceC43172j) r8
                com.avito.android.mortgage_invite.contact_info.mvi.entity.ApplicationContactInfoInternalAction$FormLoadingStarted r1 = new com.avito.android.mortgage_invite.contact_info.mvi.entity.ApplicationContactInfoInternalAction$FormLoadingStarted
                r1.<init>()
                r7.f205646r = r8
                r7.f205645q = r6
                java.lang.Object r1 = r8.emit(r1, r7)
                if (r1 != r0) goto L4b
                return r0
            L4b:
                r1 = r8
            L4c:
                e20.a r8 = r2.f205642a
                r7.f205646r = r1
                r7.f205645q = r5
                java.lang.Object r8 = r8.b(r7)
                if (r8 != r0) goto L59
                return r0
            L59:
                com.avito.android.remote.model.TypedResult r8 = (com.avito.android.remote.model.TypedResult) r8
                boolean r5 = r8 instanceof com.avito.android.remote.model.TypedResult.Success
                r6 = 0
                if (r5 == 0) goto L7e
                com.avito.android.remote.model.TypedResult$Success r8 = (com.avito.android.remote.model.TypedResult.Success) r8
                java.lang.Object r8 = r8.getResult()
                i20.b r8 = (i20.b) r8
                com.avito.android.mortgage_invite.contact_info.mvi.entity.ApplicationContactInfoInternalAction$FormLoadingCompleted r3 = new com.avito.android.mortgage_invite.contact_info.mvi.entity.ApplicationContactInfoInternalAction$FormLoadingCompleted
                com.avito.android.mortgage_invite.contact_info.domain.mapper.a r2 = r2.f205643b
                a20.a r8 = r2.a(r8)
                r3.<init>(r8)
                r7.f205646r = r6
                r7.f205645q = r4
                java.lang.Object r8 = r1.emit(r3, r7)
                if (r8 != r0) goto La4
                return r0
            L7e:
                boolean r2 = r8 instanceof com.avito.android.remote.model.TypedResult.Error
                if (r2 == 0) goto La7
                com.avito.android.remote.model.TypedResult$Error r8 = (com.avito.android.remote.model.TypedResult.Error) r8
                com.avito.android.remote.error.ApiError r2 = r8.getError()
                java.lang.Throwable r8 = r8.getCause()
                com.avito.android.util.ApiException r8 = com.avito.android.util.C35936s.a(r2, r8)
                com.avito.android.mortgage_invite.contact_info.mvi.entity.ApplicationContactInfoInternalAction$FormLoadingFailed r2 = new com.avito.android.mortgage_invite.contact_info.mvi.entity.ApplicationContactInfoInternalAction$FormLoadingFailed
                com.avito.android.remote.error.ApiError r8 = com.avito.android.error.z.n(r8)
                r2.<init>(r8)
                r7.f205646r = r6
                r7.f205645q = r3
                java.lang.Object r8 = r1.emit(r2, r7)
                if (r8 != r0) goto La4
                return r0
            La4:
                kotlin.G0 r8 = kotlin.G0.f406611a
                return r8
            La7:
                kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
                r8.<init>()
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.mortgage_invite.contact_info.domain.c.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public c(@k InterfaceC39928a interfaceC39928a, @k com.avito.android.mortgage_invite.contact_info.domain.mapper.a aVar, @k R0 r02) {
        this.f205642a = interfaceC39928a;
        this.f205643b = aVar;
        this.f205644c = r02;
    }

    @k
    public final InterfaceC43160i<ApplicationContactInfoInternalAction> a() {
        return C43175k.I(this.f205644c.a(), C43175k.G(new a(null)));
    }
}
