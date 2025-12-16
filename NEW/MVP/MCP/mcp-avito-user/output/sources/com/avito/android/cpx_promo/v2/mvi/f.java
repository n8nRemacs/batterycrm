package com.avito.android.cpx_promo.v2.mvi;

import com.avito.android.cpx_promo.v2.mvi.entity.CpxPromoV2InternalAction;
import com.avito.android.cpx_promo.v2.mvi.entity.CpxPromoV2State;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: CpxPromoV2Actor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/cpx_promo/v2/mvi/entity/CpxPromoV2InternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.cpx_promo.v2.mvi.CpxPromoV2Actor$processButtonClick$1", f = "CpxPromoV2Actor.kt", i = {}, l = {328, 346}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes12.dex */
final class f extends SuspendLambda implements Y41.p<InterfaceC43172j<? super CpxPromoV2InternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f127701q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f127702r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ CpxPromoV2State.ButtonState.ButtonType f127703s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ m f127704t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ CpxPromoV2State f127705u;

    /* compiled from: CpxPromoV2Actor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[CpxPromoV2State.ButtonState.ButtonType.values().length];
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                CpxPromoV2State.ButtonState.ButtonType buttonType = CpxPromoV2State.ButtonState.ButtonType.f127641b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                CpxPromoV2State.ButtonState.ButtonType buttonType2 = CpxPromoV2State.ButtonState.ButtonType.f127641b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                CpxPromoV2State.ButtonState.ButtonType buttonType3 = CpxPromoV2State.ButtonState.ButtonType.f127641b;
                iArr[0] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(CpxPromoV2State.ButtonState.ButtonType buttonType, m mVar, CpxPromoV2State cpxPromoV2State, Continuation<? super f> continuation) {
        super(2, continuation);
        this.f127703s = buttonType;
        this.f127704t = mVar;
        this.f127705u = cpxPromoV2State;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        f fVar = new f(this.f127703s, this.f127704t, this.f127705u, continuation);
        fVar.f127702r = obj;
        return fVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super CpxPromoV2InternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((f) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0078  */
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
            int r1 = r8.f127701q
            r2 = 1
            r3 = 2
            if (r1 == 0) goto L1f
            if (r1 == r2) goto L1b
            if (r1 != r3) goto L13
            kotlin.C42729a0.b(r9)
            goto L86
        L13:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1b:
            kotlin.C42729a0.b(r9)
            goto L52
        L1f:
            kotlin.C42729a0.b(r9)
            java.lang.Object r9 = r8.f127702r
            kotlinx.coroutines.flow.j r9 = (kotlinx.coroutines.flow.InterfaceC43172j) r9
            com.avito.android.cpx_promo.v2.mvi.entity.CpxPromoV2State$ButtonState$ButtonType r1 = r8.f127703s
            int r1 = r1.ordinal()
            r4 = 0
            com.avito.android.cpx_promo.v2.mvi.entity.CpxPromoV2State r5 = r8.f127705u
            if (r1 == 0) goto L6e
            com.avito.android.cpx_promo.v2.mvi.m r6 = r8.f127704t
            if (r1 == r2) goto L5e
            if (r1 == r3) goto L55
            r7 = 3
            if (r1 == r7) goto L3c
        L3a:
            r1 = r4
            goto L76
        L3c:
            r6.getClass()
            com.avito.android.cpx_promo.v2.mvi.a r1 = new com.avito.android.cpx_promo.v2.mvi.a
            r3 = 0
            r1.<init>(r5, r6, r3, r4)
            kotlinx.coroutines.flow.i r1 = kotlinx.coroutines.flow.C43175k.G(r1)
            r8.f127701q = r2
            java.lang.Object r9 = kotlinx.coroutines.flow.C43175k.u(r8, r1, r9)
            if (r9 != r0) goto L52
            return r0
        L52:
            kotlin.G0 r9 = kotlin.G0.f406611a
            return r9
        L55:
            com.avito.android.cpx_promo.v2.domain.model.CpxPromoV2 r1 = r5.f127626d
            if (r1 == 0) goto L3a
            wZ.b r1 = r1.f127484f
            com.avito.android.deep_linking.links.DeepLink r1 = r1.f441547b
            goto L76
        L5e:
            com.avito.android.cpx_promo.analytics.clickstream.events.ClickStreamButtonClickEvent$ButtonName r1 = com.avito.android.cpx_promo.analytics.clickstream.events.ClickStreamButtonClickEvent.ButtonName.f126793c
            com.avito.android.cpx_promo.v2.mvi.m.e(r6, r5, r1)
            com.avito.android.cpx_promo.v2.domain.model.CpxPromoV2 r1 = r5.f127626d
            if (r1 == 0) goto L3a
            wZ.b r1 = r1.f127482d
            if (r1 == 0) goto L3a
            com.avito.android.deep_linking.links.DeepLink r1 = r1.f441547b
            goto L76
        L6e:
            com.avito.android.cpx_promo.v2.domain.model.CpxPromoV2 r1 = r5.f127626d
            if (r1 == 0) goto L3a
            wZ.b r1 = r1.f127483e
            com.avito.android.deep_linking.links.DeepLink r1 = r1.f441547b
        L76:
            if (r1 == 0) goto L86
            com.avito.android.cpx_promo.v2.mvi.entity.CpxPromoV2InternalAction$OpenDeeplink r2 = new com.avito.android.cpx_promo.v2.mvi.entity.CpxPromoV2InternalAction$OpenDeeplink
            r2.<init>(r1, r4, r3, r4)
            r8.f127701q = r3
            java.lang.Object r9 = r9.emit(r2, r8)
            if (r9 != r0) goto L86
            return r0
        L86:
            kotlin.G0 r9 = kotlin.G0.f406611a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.cpx_promo.v2.mvi.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
