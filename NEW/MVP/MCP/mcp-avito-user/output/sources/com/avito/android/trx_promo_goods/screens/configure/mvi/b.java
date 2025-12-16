package com.avito.android.trx_promo_goods.screens.configure.mvi;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.trx_promo_goods.screens.configure.mvi.entity.TrxPromoGoodsConfigureInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: SafeCollector.common.kt */
@s0
@Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/q1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b implements InterfaceC43160i<TrxPromoGoodsConfigureInternalAction> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C43197r1 f303570b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Y41.a f303571c;

    /* compiled from: Emitters.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/q1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j f303572b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Y41.a f303573c;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.avito.android.trx_promo_goods.screens.configure.mvi.TrxPromoGoodsConfigureActor$process$$inlined$mapNotNull$1$2", f = "TrxPromoGoodsConfigureActor.kt", i = {}, l = {229}, m = "emit", n = {}, s = {})
        /* renamed from: com.avito.android.trx_promo_goods.screens.configure.mvi.b$a$a, reason: collision with other inner class name */
        public static final class C9296a extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f303574q;

            /* renamed from: r, reason: collision with root package name */
            public int f303575r;

            public C9296a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                this.f303574q = obj;
                this.f303575r |= BeduinInputModel.MIN_TEXT_VERSION;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC43172j interfaceC43172j, Y41.a aVar) {
            this.f303572b = interfaceC43172j;
            this.f303573c = aVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r6, @Y61.k kotlin.coroutines.Continuation r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof com.avito.android.trx_promo_goods.screens.configure.mvi.b.a.C9296a
                if (r0 == 0) goto L13
                r0 = r7
                com.avito.android.trx_promo_goods.screens.configure.mvi.b$a$a r0 = (com.avito.android.trx_promo_goods.screens.configure.mvi.b.a.C9296a) r0
                int r1 = r0.f303575r
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f303575r = r1
                goto L18
            L13:
                com.avito.android.trx_promo_goods.screens.configure.mvi.b$a$a r0 = new com.avito.android.trx_promo_goods.screens.configure.mvi.b$a$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f303574q
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f303575r
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.C42729a0.b(r7)
                goto L72
            L29:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L31:
                kotlin.C42729a0.b(r7)
                kv.a r6 = (kv.C43501a) r6
                Ju.c r6 = r6.f413261b
                boolean r7 = r6 instanceof com.avito.android.trx_promo_goods.screens.configure.deeplink.TrxPromoGoodsConfigureResetLink.b.a
                if (r7 == 0) goto L3f
                com.avito.android.trx_promo_goods.screens.configure.mvi.entity.TrxPromoGoodsConfigureInternalAction$ResetChanges r6 = com.avito.android.trx_promo_goods.screens.configure.mvi.entity.TrxPromoGoodsConfigureInternalAction.ResetChanges.f303590b
                goto L65
            L3f:
                boolean r7 = r6 instanceof com.avito.android.trx_promo_goods.screens.configure.deeplink.TrxPromoGoodsConfigureCancelLink.b.C9283b
                if (r7 == 0) goto L46
                com.avito.android.trx_promo_goods.screens.configure.mvi.entity.TrxPromoGoodsConfigureInternalAction$FinishFlow r6 = com.avito.android.trx_promo_goods.screens.configure.mvi.entity.TrxPromoGoodsConfigureInternalAction.FinishFlow.f303584b
                goto L65
            L46:
                boolean r7 = r6 instanceof com.avito.android.trx_promo_goods.screens.date_picker.deeplink.TrxPromoGoodsConfigureDatePickerLink.b.C9302b
                r2 = 0
                if (r7 == 0) goto L64
                com.avito.android.trx_promo_goods.screens.configure.mvi.entity.TrxPromoGoodsConfigureInternalAction$InputChange r7 = new com.avito.android.trx_promo_goods.screens.configure.mvi.entity.TrxPromoGoodsConfigureInternalAction$InputChange
                Y41.a r4 = r5.f303573c
                java.lang.Object r4 = r4.invoke()
                MF0.d r4 = (MF0.d) r4
                MF0.b r4 = r4.f10518h
                if (r4 == 0) goto L5b
                java.lang.Float r2 = r4.f10503a
            L5b:
                com.avito.android.trx_promo_goods.screens.date_picker.deeplink.TrxPromoGoodsConfigureDatePickerLink$b$b r6 = (com.avito.android.trx_promo_goods.screens.date_picker.deeplink.TrxPromoGoodsConfigureDatePickerLink.b.C9302b) r6
                java.time.LocalDate r6 = r6.f303670b
                r7.<init>(r2, r6)
                r6 = r7
                goto L65
            L64:
                r6 = r2
            L65:
                if (r6 == 0) goto L72
                r0.f303575r = r3
                kotlinx.coroutines.flow.j r7 = r5.f303572b
                java.lang.Object r6 = r7.emit(r6, r0)
                if (r6 != r1) goto L72
                return r1
            L72:
                kotlin.G0 r6 = kotlin.G0.f406611a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.trx_promo_goods.screens.configure.mvi.b.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    public b(C43197r1 c43197r1, Y41.a aVar) {
        this.f303570b = c43197r1;
        this.f303571c = aVar;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43160i
    @Y61.l
    public final Object collect(@Y61.k InterfaceC43172j<? super TrxPromoGoodsConfigureInternalAction> interfaceC43172j, @Y61.k Continuation continuation) {
        Object objCollect = this.f303570b.collect(new a(interfaceC43172j, this.f303571c), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
    }
}
