package com.avito.android.cpx_promo_geo.screens.region_sheet.mvi;

import com.avito.android.cpx_promo_geo.screens.region_sheet.mvi.entity.RegionSheetInternalAction;
import com.avito.android.cpx_promo_geo.screens.region_sheet.mvi.entity.RegionSheetState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;
import vs.InterfaceC49374a;

/* compiled from: RegionSheetActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/cpx_promo_geo/screens/region_sheet/mvi/entity/RegionSheetInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.cpx_promo_geo.screens.region_sheet.mvi.RegionSheetActor$process$2", f = "RegionSheetActor.kt", i = {0}, l = {66, 68}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* loaded from: classes12.dex */
final class d extends SuspendLambda implements Y41.p<InterfaceC43172j<? super RegionSheetInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f128344q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f128345r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ a f128346s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ RegionSheetState f128347t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ InterfaceC49374a f128348u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(a aVar, RegionSheetState regionSheetState, Continuation continuation, InterfaceC49374a interfaceC49374a) {
        super(2, continuation);
        this.f128346s = aVar;
        this.f128347t = regionSheetState;
        this.f128348u = interfaceC49374a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        d dVar = new d(this.f128346s, this.f128347t, continuation, this.f128348u);
        dVar.f128345r = obj;
        return dVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super RegionSheetInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004e  */
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
            int r1 = r9.f128344q
            com.avito.android.cpx_promo_geo.screens.region_sheet.mvi.entity.RegionSheetState r2 = r9.f128347t
            r3 = 0
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L25
            if (r1 == r5) goto L1d
            if (r1 != r4) goto L15
            kotlin.C42729a0.b(r10)
            goto L5e
        L15:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1d:
            java.lang.Object r1 = r9.f128345r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r10)
            goto L48
        L25:
            kotlin.C42729a0.b(r10)
            java.lang.Object r10 = r9.f128345r
            r1 = r10
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            vs.a r10 = r9.f128348u
            vs.a$f r10 = (vs.InterfaceC49374a.f) r10
            long r6 = r10.f441011a
            java.lang.Long r10 = r10.f441012b
            com.avito.android.cpx_promo_geo.screens.region_sheet.mvi.a r8 = r9.f128346s
            com.avito.android.cpx_promo_geo.screens.region_sheet.mvi.entity.RegionSheetInternalAction$ShowValidationError r10 = com.avito.android.cpx_promo_geo.screens.region_sheet.mvi.a.c(r8, r2, r6, r10)
            if (r10 == 0) goto L4b
            r9.f128345r = r1
            r9.f128344q = r5
            java.lang.Object r10 = r1.emit(r10, r9)
            if (r10 != r0) goto L48
            return r0
        L48:
            kotlin.G0 r10 = kotlin.G0.f406611a
            goto L4c
        L4b:
            r10 = r3
        L4c:
            if (r10 != 0) goto L5e
            com.avito.android.cpx_promo_geo.screens.region_sheet.mvi.entity.RegionSheetInternalAction$UpdateState r10 = new com.avito.android.cpx_promo_geo.screens.region_sheet.mvi.entity.RegionSheetInternalAction$UpdateState
            r10.<init>(r2)
            r9.f128345r = r3
            r9.f128344q = r4
            java.lang.Object r10 = r1.emit(r10, r9)
            if (r10 != r0) goto L5e
            return r0
        L5e:
            kotlin.G0 r10 = kotlin.G0.f406611a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.cpx_promo_geo.screens.region_sheet.mvi.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
