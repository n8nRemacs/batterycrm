package com.avito.android.vas_union.domain;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.util.R0;
import com.avito.android.vas_union.di.d;
import com.avito.android.vas_union.mvi.entity.VasUnionV2InternalAction;
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
import sM0.InterfaceC48073a;

/* compiled from: GetVasUnionV2UseCase.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_union/domain/a;", "", "_avito_vas-union_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f323194a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f323195b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC48073a f323196c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final R0 f323197d;

    /* compiled from: GetVasUnionV2UseCase.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.vas_union.domain.GetVasUnionV2UseCase$invoke$1", f = "GetVasUnionV2UseCase.kt", i = {0, 1}, l = {22, InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES, AvailableCode.HMS_IS_SPOOF, 32}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    /* renamed from: com.avito.android.vas_union.domain.a$a, reason: collision with other inner class name */
    public static final class C9990a extends SuspendLambda implements p<InterfaceC43172j<?>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f323198q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f323199r;

        public C9990a(Continuation<? super C9990a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            C9990a c9990a = a.this.new C9990a(continuation);
            c9990a.f323199r = obj;
            return c9990a;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<?> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((C9990a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x007c  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r6.f323198q
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L32
                if (r1 == r5) goto L2a
                if (r1 == r4) goto L22
                if (r1 == r3) goto L1d
                if (r1 != r2) goto L15
                goto L1d
            L15:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1d:
                kotlin.C42729a0.b(r7)
                goto L9e
            L22:
                java.lang.Object r1 = r6.f323199r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r7)
                goto L5d
            L2a:
                java.lang.Object r1 = r6.f323199r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r7)
                goto L4a
            L32:
                kotlin.C42729a0.b(r7)
                java.lang.Object r7 = r6.f323199r
                kotlinx.coroutines.flow.j r7 = (kotlinx.coroutines.flow.InterfaceC43172j) r7
                com.avito.android.vas_union.mvi.entity.VasUnionV2InternalAction$Loading r1 = new com.avito.android.vas_union.mvi.entity.VasUnionV2InternalAction$Loading
                r1.<init>()
                r6.f323199r = r7
                r6.f323198q = r5
                java.lang.Object r1 = r7.emit(r1, r6)
                if (r1 != r0) goto L49
                return r0
            L49:
                r1 = r7
            L4a:
                com.avito.android.vas_union.domain.a r7 = com.avito.android.vas_union.domain.a.this
                sM0.a r5 = r7.f323196c
                r6.f323199r = r1
                r6.f323198q = r4
                java.lang.String r4 = r7.f323194a
                java.lang.String r7 = r7.f323195b
                java.lang.Object r7 = r5.a(r4, r7, r6)
                if (r7 != r0) goto L5d
                return r0
            L5d:
                com.avito.android.remote.model.TypedResult r7 = (com.avito.android.remote.model.TypedResult) r7
                boolean r4 = r7 instanceof com.avito.android.remote.model.TypedResult.Success
                r5 = 0
                if (r4 == 0) goto L7c
                com.avito.android.remote.model.TypedResult$Success r7 = (com.avito.android.remote.model.TypedResult.Success) r7
                java.lang.Object r7 = r7.getResult()
                tM0.g r7 = (tM0.g) r7
                com.avito.android.vas_union.mvi.entity.VasUnionV2InternalAction$Content r2 = new com.avito.android.vas_union.mvi.entity.VasUnionV2InternalAction$Content
                r2.<init>(r7)
                r6.f323199r = r5
                r6.f323198q = r3
                java.lang.Object r7 = r1.emit(r2, r6)
                if (r7 != r0) goto L9e
                return r0
            L7c:
                boolean r3 = r7 instanceof com.avito.android.remote.model.TypedResult.Error
                if (r3 == 0) goto La1
                com.avito.android.remote.model.TypedResult$Error r7 = (com.avito.android.remote.model.TypedResult.Error) r7
                com.avito.android.remote.error.ApiError r3 = r7.getError()
                java.lang.Throwable r7 = r7.getCause()
                com.avito.android.util.ApiException r7 = com.avito.android.util.C35936s.a(r3, r7)
                com.avito.android.vas_union.mvi.entity.VasUnionV2InternalAction$Error r3 = new com.avito.android.vas_union.mvi.entity.VasUnionV2InternalAction$Error
                r3.<init>(r7)
                r6.f323199r = r5
                r6.f323198q = r2
                java.lang.Object r7 = r1.emit(r3, r6)
                if (r7 != r0) goto L9e
                return r0
            L9e:
                kotlin.G0 r7 = kotlin.G0.f406611a
                return r7
            La1:
                kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
                r7.<init>()
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.vas_union.domain.a.C9990a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public a(@d @k String str, @com.avito.android.vas_union.di.a @k String str2, @k InterfaceC48073a interfaceC48073a, @k R0 r02) {
        this.f323194a = str;
        this.f323195b = str2;
        this.f323196c = interfaceC48073a;
        this.f323197d = r02;
    }

    @k
    public final InterfaceC43160i<VasUnionV2InternalAction> a() {
        return C43175k.I(this.f323197d.a(), C43175k.G(new C9990a(null)));
    }
}
