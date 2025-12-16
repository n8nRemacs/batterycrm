package com.avito.android.cpx_promo.v2.mvi;

import com.avito.android.cpx_promo.priceinput.CpxPromoInputSource;
import com.avito.android.cpx_promo.priceinput.CpxPromoPriceInputContent;
import com.avito.android.cpx_promo.v2.domain.model.CpxPromoV2;
import com.avito.android.cpx_promo.v2.mvi.entity.CpxPromoV2InternalAction;
import com.avito.android.cpx_promo.v2.mvi.entity.CpxPromoV2State;
import js.C42420b;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: CpxPromoV2Actor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/cpx_promo/v2/mvi/entity/CpxPromoV2InternalAction$OpenDeeplink;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.cpx_promo.v2.mvi.CpxPromoV2Actor$processInputClick$1", f = "CpxPromoV2Actor.kt", i = {}, l = {415, 442}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes12.dex */
final class i extends SuspendLambda implements Y41.p<InterfaceC43172j<? super CpxPromoV2InternalAction.OpenDeeplink>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f127712q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f127713r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ CpxPromoInputSource f127714s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ CpxPromoV2State f127715t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ m f127716u;

    /* compiled from: CpxPromoV2Actor.kt */
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
    public i(CpxPromoInputSource cpxPromoInputSource, CpxPromoV2State cpxPromoV2State, m mVar, Continuation<? super i> continuation) {
        super(2, continuation);
        this.f127714s = cpxPromoInputSource;
        this.f127715t = cpxPromoV2State;
        this.f127716u = mVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        i iVar = new i(this.f127714s, this.f127715t, this.f127716u, continuation);
        iVar.f127713r = obj;
        return iVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super CpxPromoV2InternalAction.OpenDeeplink> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((i) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        CpxPromoV2.a aVar;
        String str;
        CpxPromoV2.c cVar;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f127712q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f127713r;
            CpxPromoInputSource cpxPromoInputSource = this.f127714s;
            int iOrdinal = cpxPromoInputSource.ordinal();
            m mVar = this.f127716u;
            CpxPromoV2State cpxPromoV2State = this.f127715t;
            if (iOrdinal == 0) {
                CpxPromoV2State.g gVar = cpxPromoV2State.f127633k;
                C42420b c42420b = gVar.f127685o;
                if (c42420b != null) {
                    boolean z12 = cpxPromoV2State.f127630h.f127669c;
                    Long lBoxLong = Boxing.boxLong(gVar.f127672b);
                    CpxPromoPriceInputContent.DisplayingEventParams displayingEventParams = new CpxPromoPriceInputContent.DisplayingEventParams(z12 ? 11944 : 11951, 0, mVar.f127734b, z12);
                    CpxPromoV2 cpxPromoV2 = cpxPromoV2State.f127626d;
                    CpxPromoV2InternalAction.OpenDeeplink openDeeplink = new CpxPromoV2InternalAction.OpenDeeplink(c42420b.f405849e, m.f(mVar, cpxPromoInputSource, c42420b, gVar.f127683m, gVar.f127684n, lBoxLong, displayingEventParams, null, (cpxPromoV2 == null || (aVar = cpxPromoV2.f127490l) == null || (str = aVar.f127505b) == null || !cpxPromoV2State.f127631i.f127653a) ? null : str, 64));
                    this.f127712q = 1;
                    if (interfaceC43172j.emit(openDeeplink, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else if (iOrdinal == 1) {
                CpxPromoV2State.e eVar = cpxPromoV2State.f127634l;
                if (!eVar.f127656b) {
                    return G0.f406611a;
                }
                CpxPromoV2 cpxPromoV22 = cpxPromoV2State.f127626d;
                if (cpxPromoV22 != null && (cVar = cpxPromoV22.f127487i) != null) {
                    CpxPromoV2.c.a aVar2 = cVar.f127516b;
                    C42420b c42420b2 = aVar2.f127524h;
                    CpxPromoV2State.e.a aVar3 = eVar.f127664j;
                    CpxPromoV2InternalAction.OpenDeeplink openDeeplink2 = new CpxPromoV2InternalAction.OpenDeeplink(c42420b2.f405849e, m.f(mVar, cpxPromoInputSource, c42420b2, aVar3 != null ? aVar3.f127665a : aVar2.f127523g, aVar2.f127522f, eVar.f127659e, new CpxPromoPriceInputContent.DisplayingEventParams(11953, 0, mVar.f127734b, false), aVar3 != null ? aVar3.f127666b : null, null, 128));
                    this.f127712q = 2;
                    if (interfaceC43172j.emit(openDeeplink2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
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
