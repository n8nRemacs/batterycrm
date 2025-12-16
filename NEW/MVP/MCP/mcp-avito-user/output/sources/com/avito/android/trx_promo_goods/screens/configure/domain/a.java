package com.avito.android.trx_promo_goods.screens.configure.domain;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.trx_promo_goods.screens.configure.mvi.entity.TrxPromoGoodsConfigureInternalAction;
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

/* compiled from: GetTrxPromoGoodsConfigureUseCase.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/trx_promo_goods/screens/configure/domain/a;", "", "_avito_trx-promo-goods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f303471a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final IF0.a f303472b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final R0 f303473c;

    /* compiled from: GetTrxPromoGoodsConfigureUseCase.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/trx_promo_goods/screens/configure/mvi/entity/TrxPromoGoodsConfigureInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.trx_promo_goods.screens.configure.domain.GetTrxPromoGoodsConfigureUseCase$invoke$1", f = "GetTrxPromoGoodsConfigureUseCase.kt", i = {0, 1}, l = {21, 22, AvailableCode.ERROR_NO_ACTIVITY, 30, 34}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    /* renamed from: com.avito.android.trx_promo_goods.screens.configure.domain.a$a, reason: collision with other inner class name */
    public static final class C9288a extends SuspendLambda implements p<InterfaceC43172j<? super TrxPromoGoodsConfigureInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f303474q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f303475r;

        public C9288a(Continuation<? super C9288a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            C9288a c9288a = a.this.new C9288a(continuation);
            c9288a.f303475r = obj;
            return c9288a;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super TrxPromoGoodsConfigureInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((C9288a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0065  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00a2  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r14) {
            /*
                r13 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r13.f303474q
                r2 = 5
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                if (r1 == 0) goto L35
                if (r1 == r6) goto L2d
                if (r1 == r5) goto L25
                if (r1 == r4) goto L20
                if (r1 == r3) goto L20
                if (r1 != r2) goto L18
                goto L20
            L18:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            L20:
                kotlin.C42729a0.b(r14)
                goto Lc4
            L25:
                java.lang.Object r1 = r13.f303475r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r14)
                goto L5e
            L2d:
                java.lang.Object r1 = r13.f303475r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r14)
                goto L4d
            L35:
                kotlin.C42729a0.b(r14)
                java.lang.Object r14 = r13.f303475r
                kotlinx.coroutines.flow.j r14 = (kotlinx.coroutines.flow.InterfaceC43172j) r14
                com.avito.android.trx_promo_goods.screens.configure.mvi.entity.TrxPromoGoodsConfigureInternalAction$Loading r1 = new com.avito.android.trx_promo_goods.screens.configure.mvi.entity.TrxPromoGoodsConfigureInternalAction$Loading
                r1.<init>()
                r13.f303475r = r14
                r13.f303474q = r6
                java.lang.Object r1 = r14.emit(r1, r13)
                if (r1 != r0) goto L4c
                return r0
            L4c:
                r1 = r14
            L4d:
                com.avito.android.trx_promo_goods.screens.configure.domain.a r14 = com.avito.android.trx_promo_goods.screens.configure.domain.a.this
                IF0.a r6 = r14.f303472b
                r13.f303475r = r1
                r13.f303474q = r5
                java.lang.String r14 = r14.f303471a
                java.lang.Object r14 = r6.c(r14, r13)
                if (r14 != r0) goto L5e
                return r0
            L5e:
                com.avito.android.remote.model.TypedResult r14 = (com.avito.android.remote.model.TypedResult) r14
                boolean r5 = r14 instanceof com.avito.android.remote.model.TypedResult.Success
                r6 = 0
                if (r5 == 0) goto La2
                com.avito.android.remote.model.TypedResult$Success r14 = (com.avito.android.remote.model.TypedResult.Success) r14
                java.lang.Object r14 = r14.getResult()
                JF0.e r14 = (JF0.e) r14
                boolean r2 = r14 instanceof JF0.e.b
                if (r2 == 0) goto L83
                com.avito.android.trx_promo_goods.screens.configure.mvi.entity.TrxPromoGoodsConfigureInternalAction$Content r2 = new com.avito.android.trx_promo_goods.screens.configure.mvi.entity.TrxPromoGoodsConfigureInternalAction$Content
                JF0.e$b r14 = (JF0.e.b) r14
                r2.<init>(r14)
                r13.f303475r = r6
                r13.f303474q = r4
                java.lang.Object r14 = r1.emit(r2, r13)
                if (r14 != r0) goto Lc4
                return r0
            L83:
                boolean r2 = r14 instanceof JF0.e.a
                if (r2 == 0) goto Lc4
                com.avito.android.trx_promo_goods.screens.configure.mvi.entity.TrxPromoGoodsConfigureInternalAction$HandleDeeplink r2 = new com.avito.android.trx_promo_goods.screens.configure.mvi.entity.TrxPromoGoodsConfigureInternalAction$HandleDeeplink
                JF0.e$a r14 = (JF0.e.a) r14
                com.avito.android.deep_linking.links.DeepLink r8 = r14.getDeeplink()
                r9 = 0
                r10 = 0
                r11 = 6
                r12 = 0
                r7 = r2
                r7.<init>(r8, r9, r10, r11, r12)
                r13.f303475r = r6
                r13.f303474q = r3
                java.lang.Object r14 = r1.emit(r2, r13)
                if (r14 != r0) goto Lc4
                return r0
            La2:
                boolean r3 = r14 instanceof com.avito.android.remote.model.TypedResult.Error
                if (r3 == 0) goto Lc7
                com.avito.android.remote.model.TypedResult$Error r14 = (com.avito.android.remote.model.TypedResult.Error) r14
                com.avito.android.remote.error.ApiError r3 = r14.getError()
                java.lang.Throwable r14 = r14.getCause()
                com.avito.android.util.ApiException r14 = com.avito.android.util.C35936s.a(r3, r14)
                com.avito.android.trx_promo_goods.screens.configure.mvi.entity.TrxPromoGoodsConfigureInternalAction$ScreenError r3 = new com.avito.android.trx_promo_goods.screens.configure.mvi.entity.TrxPromoGoodsConfigureInternalAction$ScreenError
                r3.<init>(r14)
                r13.f303475r = r6
                r13.f303474q = r2
                java.lang.Object r14 = r1.emit(r3, r13)
                if (r14 != r0) goto Lc4
                return r0
            Lc4:
                kotlin.G0 r14 = kotlin.G0.f406611a
                return r14
            Lc7:
                kotlin.NoWhenBranchMatchedException r14 = new kotlin.NoWhenBranchMatchedException
                r14.<init>()
                throw r14
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.trx_promo_goods.screens.configure.domain.a.C9288a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public a(@com.avito.android.trx_promo_goods.common.di.b @k String str, @k IF0.a aVar, @k R0 r02) {
        this.f303471a = str;
        this.f303472b = aVar;
        this.f303473c = r02;
    }

    @k
    public final InterfaceC43160i<TrxPromoGoodsConfigureInternalAction> a() {
        return C43175k.I(this.f303473c.a(), C43175k.G(new C9288a(null)));
    }
}
