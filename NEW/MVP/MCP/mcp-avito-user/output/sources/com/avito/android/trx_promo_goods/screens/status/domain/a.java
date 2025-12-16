package com.avito.android.trx_promo_goods.screens.status.domain;

import Y41.p;
import Y61.k;
import Y61.l;
import android.os.Parcelable;
import com.avito.android.trx_promo_goods.screens.status.mvi.entity.TrxPromoGoodsStatusInternalAction;
import com.avito.android.util.R0;
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

/* compiled from: GetTrxPromoGoodsStatusUseCase.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/trx_promo_goods/screens/status/domain/a;", "", "_avito_trx-promo-goods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f303824a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TrxPromoGoodsStatus f303825b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final IF0.a f303826c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final R0 f303827d;

    /* compiled from: GetTrxPromoGoodsStatusUseCase.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.trx_promo_goods.screens.status.domain.GetTrxPromoGoodsStatusUseCase$invoke$1", f = "GetTrxPromoGoodsStatusUseCase.kt", i = {0, 1, 2}, l = {22, AvailableCode.ERROR_ON_ACTIVITY_RESULT, AvailableCode.ERROR_NO_ACTIVITY, AvailableCode.HMS_IS_SPOOF, 32}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow"}, s = {"L$0", "L$0", "L$0"})
    /* renamed from: com.avito.android.trx_promo_goods.screens.status.domain.a$a, reason: collision with other inner class name */
    public static final class C9313a extends SuspendLambda implements p<InterfaceC43172j<?>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f303828q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f303829r;

        /* compiled from: GetTrxPromoGoodsStatusUseCase.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.trx_promo_goods.screens.status.domain.a$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C9314a {
            static {
                int[] iArr = new int[TrxPromoGoodsStatus.values().length];
                try {
                    iArr[0] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    Parcelable.Creator<TrxPromoGoodsStatus> creator = TrxPromoGoodsStatus.CREATOR;
                    iArr[1] = 2;
                } catch (NoSuchFieldError unused2) {
                }
            }
        }

        public C9313a(Continuation<? super C9313a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            C9313a c9313a = a.this.new C9313a(continuation);
            c9313a.f303829r = obj;
            return c9313a;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<?> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((C9313a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:35:0x008b  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00a3  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r9.f303828q
                r2 = 5
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                if (r1 == 0) goto L3d
                if (r1 == r6) goto L35
                if (r1 == r5) goto L2d
                if (r1 == r4) goto L25
                if (r1 == r3) goto L20
                if (r1 != r2) goto L18
                goto L20
            L18:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L20:
                kotlin.C42729a0.b(r10)
                goto Lc5
            L25:
                java.lang.Object r1 = r9.f303829r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r10)
                goto L70
            L2d:
                java.lang.Object r1 = r9.f303829r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r10)
                goto L84
            L35:
                java.lang.Object r1 = r9.f303829r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r10)
                goto L55
            L3d:
                kotlin.C42729a0.b(r10)
                java.lang.Object r10 = r9.f303829r
                kotlinx.coroutines.flow.j r10 = (kotlinx.coroutines.flow.InterfaceC43172j) r10
                com.avito.android.trx_promo_goods.screens.status.mvi.entity.TrxPromoGoodsStatusInternalAction$Loading r1 = new com.avito.android.trx_promo_goods.screens.status.mvi.entity.TrxPromoGoodsStatusInternalAction$Loading
                r1.<init>()
                r9.f303829r = r10
                r9.f303828q = r6
                java.lang.Object r1 = r10.emit(r1, r9)
                if (r1 != r0) goto L54
                return r0
            L54:
                r1 = r10
            L55:
                com.avito.android.trx_promo_goods.screens.status.domain.a r10 = com.avito.android.trx_promo_goods.screens.status.domain.a.this
                com.avito.android.trx_promo_goods.screens.status.domain.TrxPromoGoodsStatus r7 = r10.f303825b
                int r7 = r7.ordinal()
                java.lang.String r8 = r10.f303824a
                IF0.a r10 = r10.f303826c
                if (r7 == 0) goto L79
                if (r7 != r6) goto L73
                r9.f303829r = r1
                r9.f303828q = r4
                java.lang.Object r10 = r10.d(r8, r9)
                if (r10 != r0) goto L70
                return r0
            L70:
                com.avito.android.remote.model.TypedResult r10 = (com.avito.android.remote.model.TypedResult) r10
                goto L86
            L73:
                kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
                r10.<init>()
                throw r10
            L79:
                r9.f303829r = r1
                r9.f303828q = r5
                java.lang.Object r10 = r10.b(r8, r9)
                if (r10 != r0) goto L84
                return r0
            L84:
                com.avito.android.remote.model.TypedResult r10 = (com.avito.android.remote.model.TypedResult) r10
            L86:
                boolean r4 = r10 instanceof com.avito.android.remote.model.TypedResult.Success
                r5 = 0
                if (r4 == 0) goto La3
                com.avito.android.remote.model.TypedResult$Success r10 = (com.avito.android.remote.model.TypedResult.Success) r10
                java.lang.Object r10 = r10.getResult()
                JF0.g r10 = (JF0.g) r10
                com.avito.android.trx_promo_goods.screens.status.mvi.entity.TrxPromoGoodsStatusInternalAction$Content r2 = new com.avito.android.trx_promo_goods.screens.status.mvi.entity.TrxPromoGoodsStatusInternalAction$Content
                r2.<init>(r10)
                r9.f303829r = r5
                r9.f303828q = r3
                java.lang.Object r10 = r1.emit(r2, r9)
                if (r10 != r0) goto Lc5
                return r0
            La3:
                boolean r3 = r10 instanceof com.avito.android.remote.model.TypedResult.Error
                if (r3 == 0) goto Lc8
                com.avito.android.remote.model.TypedResult$Error r10 = (com.avito.android.remote.model.TypedResult.Error) r10
                com.avito.android.remote.error.ApiError r3 = r10.getError()
                java.lang.Throwable r10 = r10.getCause()
                com.avito.android.util.ApiException r10 = com.avito.android.util.C35936s.a(r3, r10)
                com.avito.android.trx_promo_goods.screens.status.mvi.entity.TrxPromoGoodsStatusInternalAction$Error r3 = new com.avito.android.trx_promo_goods.screens.status.mvi.entity.TrxPromoGoodsStatusInternalAction$Error
                r3.<init>(r10)
                r9.f303829r = r5
                r9.f303828q = r2
                java.lang.Object r10 = r1.emit(r3, r9)
                if (r10 != r0) goto Lc5
                return r0
            Lc5:
                kotlin.G0 r10 = kotlin.G0.f406611a
                return r10
            Lc8:
                kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
                r10.<init>()
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.trx_promo_goods.screens.status.domain.a.C9313a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public a(@com.avito.android.trx_promo_goods.common.di.b @k String str, @k TrxPromoGoodsStatus trxPromoGoodsStatus, @k IF0.a aVar, @k R0 r02) {
        this.f303824a = str;
        this.f303825b = trxPromoGoodsStatus;
        this.f303826c = aVar;
        this.f303827d = r02;
    }

    @k
    public final InterfaceC43160i<TrxPromoGoodsStatusInternalAction> a() {
        return C43175k.I(this.f303827d.a(), C43175k.G(new C9313a(null)));
    }
}
