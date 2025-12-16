package com.avito.android.cpx_promo_geo.screens.region_sheet.domain;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.cpx_promo_geo.screens.region_sheet.mvi.entity.RegionSheetInternalAction;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: RegionSheetSearchUseCase.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/cpx_promo_geo/screens/region_sheet/mvi/entity/RegionSheetInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.cpx_promo_geo.screens.region_sheet.domain.RegionSheetSearchUseCase$invoke$2", f = "RegionSheetSearchUseCase.kt", i = {0, 1, 2}, l = {47, 51, 52, 61, 69}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow"}, s = {"L$0", "L$0", "L$0"})
/* loaded from: classes12.dex */
final class e extends SuspendLambda implements p<InterfaceC43172j<? super RegionSheetInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f128306q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f128307r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f128308s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ c f128309t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f128310u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ List<Long> f128311v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(boolean z12, c cVar, String str, List<Long> list, Continuation<? super e> continuation) {
        super(2, continuation);
        this.f128308s = z12;
        this.f128309t = cVar;
        this.f128310u = str;
        this.f128311v = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        e eVar = new e(this.f128308s, this.f128309t, this.f128310u, this.f128311v, continuation);
        eVar.f128307r = obj;
        return eVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super RegionSheetInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((e) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0081 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ee  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.cpx_promo_geo.screens.region_sheet.domain.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
