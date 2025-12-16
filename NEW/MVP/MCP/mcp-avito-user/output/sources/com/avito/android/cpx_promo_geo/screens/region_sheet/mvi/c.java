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
@DebugMetadata(c = "com.avito.android.cpx_promo_geo.screens.region_sheet.mvi.RegionSheetActor$process$1", f = "RegionSheetActor.kt", i = {0, 0}, l = {34, 38}, m = "invokeSuspend", n = {"$this$flow", "location"}, s = {"L$0", "L$4"})
/* loaded from: classes12.dex */
final class c extends SuspendLambda implements Y41.p<InterfaceC43172j<? super RegionSheetInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public InterfaceC49374a f128335q;

    /* renamed from: r, reason: collision with root package name */
    public a f128336r;

    /* renamed from: s, reason: collision with root package name */
    public RegionSheetState f128337s;

    /* renamed from: t, reason: collision with root package name */
    public RegionSheetState.Location f128338t;

    /* renamed from: u, reason: collision with root package name */
    public int f128339u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f128340v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ RegionSheetState f128341w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ InterfaceC49374a f128342x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ a f128343y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a aVar, RegionSheetState regionSheetState, Continuation continuation, InterfaceC49374a interfaceC49374a) {
        super(2, continuation);
        this.f128341w = regionSheetState;
        this.f128342x = interfaceC49374a;
        this.f128343y = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        c cVar = new c(this.f128343y, this.f128341w, continuation, this.f128342x);
        cVar.f128340v = obj;
        return cVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super RegionSheetInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0087 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00aa A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r10.f128339u
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L2b
            if (r1 == r3) goto L1b
            if (r1 != r2) goto L13
            kotlin.C42729a0.b(r11)
            goto Lab
        L13:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1b:
            com.avito.android.cpx_promo_geo.screens.region_sheet.mvi.entity.RegionSheetState$Location r1 = r10.f128338t
            com.avito.android.cpx_promo_geo.screens.region_sheet.mvi.entity.RegionSheetState r4 = r10.f128337s
            com.avito.android.cpx_promo_geo.screens.region_sheet.mvi.a r5 = r10.f128336r
            vs.a r6 = r10.f128335q
            java.lang.Object r7 = r10.f128340v
            kotlinx.coroutines.flow.j r7 = (kotlinx.coroutines.flow.InterfaceC43172j) r7
            kotlin.C42729a0.b(r11)
            goto L68
        L2b:
            kotlin.C42729a0.b(r11)
            java.lang.Object r11 = r10.f128340v
            r7 = r11
            kotlinx.coroutines.flow.j r7 = (kotlinx.coroutines.flow.InterfaceC43172j) r7
            com.avito.android.cpx_promo_geo.screens.region_sheet.mvi.entity.RegionSheetState r4 = r10.f128341w
            java.util.Map<java.lang.Long, com.avito.android.cpx_promo_geo.screens.region_sheet.mvi.entity.RegionSheetState$Location> r11 = r4.f128393d
            vs.a r6 = r10.f128342x
            r1 = r6
            vs.a$a r1 = (vs.InterfaceC49374a.C12794a) r1
            long r8 = r1.f441006a
            java.lang.Long r5 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r8)
            java.lang.Object r11 = r11.get(r5)
            com.avito.android.cpx_promo_geo.screens.region_sheet.mvi.entity.RegionSheetState$Location r11 = (com.avito.android.cpx_promo_geo.screens.region_sheet.mvi.entity.RegionSheetState.Location) r11
            if (r11 == 0) goto Lab
            com.avito.android.cpx_promo_geo.screens.region_sheet.mvi.entity.RegionSheetInternalAction$ExpandLocation r5 = new com.avito.android.cpx_promo_geo.screens.region_sheet.mvi.entity.RegionSheetInternalAction$ExpandLocation
            long r8 = r1.f441006a
            r5.<init>(r8)
            r10.f128340v = r7
            r10.f128335q = r6
            com.avito.android.cpx_promo_geo.screens.region_sheet.mvi.a r1 = r10.f128343y
            r10.f128336r = r1
            r10.f128337s = r4
            r10.f128338t = r11
            r10.f128339u = r3
            java.lang.Object r5 = r7.emit(r5, r10)
            if (r5 != r0) goto L66
            return r0
        L66:
            r5 = r1
            r1 = r11
        L68:
            java.util.Map<java.lang.Long, com.avito.android.cpx_promo_geo.screens.region_sheet.mvi.entity.RegionSheetState$Location> r11 = r1.f128401e
            boolean r11 = r11.isEmpty()
            r8 = 0
            if (r11 != 0) goto L75
            boolean r11 = r1.f128404h
            if (r11 == 0) goto L7a
        L75:
            boolean r11 = r1.f128403g
            if (r11 != 0) goto L7a
            goto L7b
        L7a:
            r3 = r8
        L7b:
            java.lang.Boolean r11 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r8)
            java.lang.Boolean r1 = r1.f128400d
            boolean r11 = kotlin.jvm.internal.L.f(r1, r11)
            if (r3 == 0) goto Lab
            if (r11 == 0) goto Lab
            com.avito.android.cpx_promo_geo.screens.region_sheet.domain.a r11 = r5.f128322a
            vs.a$a r6 = (vs.InterfaceC49374a.C12794a) r6
            long r5 = r6.f441006a
            java.util.List r1 = com.avito.android.cpx_promo_geo.screens.region_sheet.mvi.a.e(r4)
            kotlinx.coroutines.flow.i r11 = r11.a(r5, r1)
            r1 = 0
            r10.f128340v = r1
            r10.f128335q = r1
            r10.f128336r = r1
            r10.f128337s = r1
            r10.f128338t = r1
            r10.f128339u = r2
            java.lang.Object r11 = kotlinx.coroutines.flow.C43175k.u(r10, r11, r7)
            if (r11 != r0) goto Lab
            return r0
        Lab:
            kotlin.G0 r11 = kotlin.G0.f406611a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.cpx_promo_geo.screens.region_sheet.mvi.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
