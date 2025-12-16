package com.avito.android.cpx_promo.impl.mvi;

import com.avito.android.cpx_promo.impl.interactor.model.CpxPromo;
import com.avito.android.cpx_promo.impl.interactor.model.CpxPromoInputSheet;
import com.avito.android.cpx_promo.impl.mvi.entity.CpxPromoInternalAction;
import com.avito.android.cpx_promo.impl.mvi.entity.CpxPromoState;
import com.avito.android.cpx_promo.priceinput.CpxPromoInputSource;
import com.avito.android.cpx_promo.priceinput.CpxPromoPriceInputContent;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: CpxPromoActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/cpx_promo/impl/mvi/entity/CpxPromoInternalAction$OpenDeeplink;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.cpx_promo.impl.mvi.CpxPromoActor$processInputClick$1", f = "CpxPromoActor.kt", i = {}, l = {410, 436}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes12.dex */
final class f extends SuspendLambda implements Y41.p<InterfaceC43172j<? super CpxPromoInternalAction.OpenDeeplink>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f127169q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f127170r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ CpxPromoInputSource f127171s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ CpxPromoState f127172t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ k f127173u;

    /* compiled from: CpxPromoActor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[CpxPromoInputSource.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                CpxPromoInputSource cpxPromoInputSource = CpxPromoInputSource.f127248b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(CpxPromoInputSource cpxPromoInputSource, CpxPromoState cpxPromoState, k kVar, Continuation<? super f> continuation) {
        super(2, continuation);
        this.f127171s = cpxPromoInputSource;
        this.f127172t = cpxPromoState;
        this.f127173u = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        f fVar = new f(this.f127171s, this.f127172t, this.f127173u, continuation);
        fVar.f127170r = obj;
        return fVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super CpxPromoInternalAction.OpenDeeplink> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((f) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        CpxPromo cpxPromo;
        CpxPromo.Manual manual;
        CpxPromo.Manual.ExpenseLimit expenseLimit;
        CpxPromoInputSheet cpxPromoInputSheet;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f127169q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f127170r;
            CpxPromoInputSource cpxPromoInputSource = this.f127171s;
            int iOrdinal = cpxPromoInputSource.ordinal();
            k kVar = this.f127173u;
            CpxPromoState cpxPromoState = this.f127172t;
            if (iOrdinal == 0) {
                CpxPromoState.SliderState sliderState = cpxPromoState.f127117j;
                CpxPromoInputSheet cpxPromoInputSheet2 = sliderState.f127156m;
                if (cpxPromoInputSheet2 != null) {
                    boolean z12 = cpxPromoState.f127115h.f127143d;
                    CpxPromoInternalAction.OpenDeeplink openDeeplink = new CpxPromoInternalAction.OpenDeeplink(cpxPromoInputSheet2.f127040f, k.e(cpxPromoInputSource, cpxPromoInputSheet2, sliderState.f127154k, sliderState.f127155l, null, Boxing.boxLong(sliderState.f127146c), new CpxPromoPriceInputContent.DisplayingEventParams(z12 ? 11944 : 11951, 0, kVar.f127200b, z12)));
                    this.f127169q = 1;
                    if (interfaceC43172j.emit(openDeeplink, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else if (iOrdinal == 1 && (cpxPromo = cpxPromoState.f127111d) != null && (manual = cpxPromo.f127007i) != null && (expenseLimit = manual.f127020c) != null && (cpxPromoInputSheet = expenseLimit.f127026g) != null) {
                CpxPromoState.ExpenseLimitState expenseLimitState = cpxPromoState.f127118k;
                CpxPromoState.ExpenseLimitState.InputSheetParams inputSheetParams = expenseLimitState.f127138i;
                CpxPromoInternalAction.OpenDeeplink openDeeplink2 = new CpxPromoInternalAction.OpenDeeplink(cpxPromoInputSheet.f127040f, k.e(cpxPromoInputSource, cpxPromoInputSheet, inputSheetParams != null ? inputSheetParams.f127139b : expenseLimit.f127025f, expenseLimit.f127024e, inputSheetParams != null ? inputSheetParams.f127140c : null, expenseLimitState.f127134e, new CpxPromoPriceInputContent.DisplayingEventParams(11953, 0, kVar.f127200b, false)));
                this.f127169q = 2;
                if (interfaceC43172j.emit(openDeeplink2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i12 != 1 && i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
