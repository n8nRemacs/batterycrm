package com.avito.android.vas_discount.v2.domain;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.util.R0;
import com.avito.android.vas_discount.v2.mvi.entity.VasDiscountV2InternalAction;
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
import mL0.InterfaceC43978a;

/* compiled from: GetDiscountInfoUseCase.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_discount/v2/domain/a;", "", "_avito_vas-discount_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC43978a f319791a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final R0 f319792b;

    /* compiled from: GetDiscountInfoUseCase.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.vas_discount.v2.domain.GetDiscountInfoUseCase$invoke$1", f = "GetDiscountInfoUseCase.kt", i = {0, 1}, l = {17, 18, 20, 23}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    /* renamed from: com.avito.android.vas_discount.v2.domain.a$a, reason: collision with other inner class name */
    public static final class C9913a extends SuspendLambda implements p<InterfaceC43172j<?>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f319793q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f319794r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f319796t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9913a(String str, Continuation<? super C9913a> continuation) {
            super(2, continuation);
            this.f319796t = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            C9913a c9913a = a.this.new C9913a(this.f319796t, continuation);
            c9913a.f319794r = obj;
            return c9913a;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<?> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((C9913a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0062  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x007a  */
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
                int r1 = r6.f319793q
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
                goto L9c
            L22:
                java.lang.Object r1 = r6.f319794r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r7)
                goto L5b
            L2a:
                java.lang.Object r1 = r6.f319794r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r7)
                goto L4a
            L32:
                kotlin.C42729a0.b(r7)
                java.lang.Object r7 = r6.f319794r
                kotlinx.coroutines.flow.j r7 = (kotlinx.coroutines.flow.InterfaceC43172j) r7
                com.avito.android.vas_discount.v2.mvi.entity.VasDiscountV2InternalAction$Loading r1 = new com.avito.android.vas_discount.v2.mvi.entity.VasDiscountV2InternalAction$Loading
                r1.<init>()
                r6.f319794r = r7
                r6.f319793q = r5
                java.lang.Object r1 = r7.emit(r1, r6)
                if (r1 != r0) goto L49
                return r0
            L49:
                r1 = r7
            L4a:
                com.avito.android.vas_discount.v2.domain.a r7 = com.avito.android.vas_discount.v2.domain.a.this
                mL0.a r7 = r7.f319791a
                r6.f319794r = r1
                r6.f319793q = r4
                java.lang.String r4 = r6.f319796t
                java.lang.Object r7 = r7.a(r4, r6)
                if (r7 != r0) goto L5b
                return r0
            L5b:
                com.avito.android.remote.model.TypedResult r7 = (com.avito.android.remote.model.TypedResult) r7
                boolean r4 = r7 instanceof com.avito.android.remote.model.TypedResult.Success
                r5 = 0
                if (r4 == 0) goto L7a
                com.avito.android.remote.model.TypedResult$Success r7 = (com.avito.android.remote.model.TypedResult.Success) r7
                java.lang.Object r7 = r7.getResult()
                com.avito.android.vas_discount.remote.model.DiscountResponse r7 = (com.avito.android.vas_discount.remote.model.DiscountResponse) r7
                com.avito.android.vas_discount.v2.mvi.entity.VasDiscountV2InternalAction$LoadDataSuccess r2 = new com.avito.android.vas_discount.v2.mvi.entity.VasDiscountV2InternalAction$LoadDataSuccess
                r2.<init>(r7)
                r6.f319794r = r5
                r6.f319793q = r3
                java.lang.Object r7 = r1.emit(r2, r6)
                if (r7 != r0) goto L9c
                return r0
            L7a:
                boolean r3 = r7 instanceof com.avito.android.remote.model.TypedResult.Error
                if (r3 == 0) goto L9f
                com.avito.android.remote.model.TypedResult$Error r7 = (com.avito.android.remote.model.TypedResult.Error) r7
                com.avito.android.remote.error.ApiError r3 = r7.getError()
                java.lang.Throwable r7 = r7.getCause()
                com.avito.android.util.ApiException r7 = com.avito.android.util.C35936s.a(r3, r7)
                com.avito.android.vas_discount.v2.mvi.entity.VasDiscountV2InternalAction$LoadDataError r3 = new com.avito.android.vas_discount.v2.mvi.entity.VasDiscountV2InternalAction$LoadDataError
                r3.<init>(r7)
                r6.f319794r = r5
                r6.f319793q = r2
                java.lang.Object r7 = r1.emit(r3, r6)
                if (r7 != r0) goto L9c
                return r0
            L9c:
                kotlin.G0 r7 = kotlin.G0.f406611a
                return r7
            L9f:
                kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
                r7.<init>()
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.vas_discount.v2.domain.a.C9913a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public a(@k InterfaceC43978a interfaceC43978a, @k R0 r02) {
        this.f319791a = interfaceC43978a;
        this.f319792b = r02;
    }

    @k
    public final InterfaceC43160i<VasDiscountV2InternalAction> a(@l String str) {
        return C43175k.I(this.f319792b.a(), C43175k.G(new C9913a(str, null)));
    }
}
