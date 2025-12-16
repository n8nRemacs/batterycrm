package com.avito.android.cpx_promo_geo.screens.region_sheet.mvi;

import com.avito.android.cpx_promo_geo.screens.region_sheet.mvi.entity.RegionSheetInternalAction;
import com.avito.android.cpx_promo_geo.screens.region_sheet.mvi.entity.RegionSheetState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: RegionSheetActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/cpx_promo_geo/screens/region_sheet/mvi/entity/RegionSheetInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.cpx_promo_geo.screens.region_sheet.mvi.RegionSheetActor$performSelectSearchLocation$1", f = "RegionSheetActor.kt", i = {0}, l = {270, 272, 328}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* loaded from: classes12.dex */
final class b extends SuspendLambda implements Y41.p<InterfaceC43172j<? super RegionSheetInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: A, reason: collision with root package name */
    public final /* synthetic */ RegionSheetState.Location.CheckboxState f128324A;

    /* renamed from: q, reason: collision with root package name */
    public Long f128325q;

    /* renamed from: r, reason: collision with root package name */
    public RegionSheetState.Location.CheckboxState f128326r;

    /* renamed from: s, reason: collision with root package name */
    public long f128327s;

    /* renamed from: t, reason: collision with root package name */
    public int f128328t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f128329u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ RegionSheetInternalAction.SubContent f128330v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ RegionSheetState f128331w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ a f128332x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ long f128333y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Long f128334z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(RegionSheetInternalAction.SubContent subContent, RegionSheetState regionSheetState, a aVar, long j12, Long l12, RegionSheetState.Location.CheckboxState checkboxState, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f128330v = subContent;
        this.f128331w = regionSheetState;
        this.f128332x = aVar;
        this.f128333y = j12;
        this.f128334z = l12;
        this.f128324A = checkboxState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        b bVar = new b(this.f128330v, this.f128331w, this.f128332x, this.f128333y, this.f128334z, this.f128324A, continuation);
        bVar.f128329u = obj;
        return bVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super RegionSheetInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00d4  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r28) {
        /*
            Method dump skipped, instructions count: 474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.cpx_promo_geo.screens.region_sheet.mvi.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
