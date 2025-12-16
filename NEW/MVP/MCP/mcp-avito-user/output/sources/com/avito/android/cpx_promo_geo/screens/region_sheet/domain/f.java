package com.avito.android.cpx_promo_geo.screens.region_sheet.domain;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.cpx_promo_geo.screens.region_sheet.mvi.entity.RegionSheetInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: RegionSheetSearchUseCase.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "it", "Lcom/avito/android/cpx_promo_geo/screens/region_sheet/mvi/entity/RegionSheetInternalAction;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.cpx_promo_geo.screens.region_sheet.domain.RegionSheetSearchUseCase$invoke$3", f = "RegionSheetSearchUseCase.kt", i = {0}, l = {107}, m = "invokeSuspend", n = {"$this$withLock_u24default$iv"}, s = {"L$0"})
/* loaded from: classes12.dex */
final class f extends SuspendLambda implements p<RegionSheetInternalAction, Continuation<? super Boolean>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public kotlinx.coroutines.sync.d f128312q;

    /* renamed from: r, reason: collision with root package name */
    public String f128313r;

    /* renamed from: s, reason: collision with root package name */
    public c f128314s;

    /* renamed from: t, reason: collision with root package name */
    public int f128315t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ c f128316u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String f128317v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(c cVar, String str, Continuation<? super f> continuation) {
        super(2, continuation);
        this.f128316u = cVar;
        this.f128317v = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        return new f(this.f128316u, this.f128317v, continuation);
    }

    @Override // Y41.p
    public final Object invoke(RegionSheetInternalAction regionSheetInternalAction, Continuation<? super Boolean> continuation) {
        return ((f) create(regionSheetInternalAction, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        c cVar;
        kotlinx.coroutines.sync.d dVar;
        String str;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f128315t;
        if (i12 == 0) {
            C42729a0.b(obj);
            c cVar2 = this.f128316u;
            kotlinx.coroutines.sync.d dVar2 = cVar2.f128298f;
            this.f128312q = dVar2;
            String str2 = this.f128317v;
            this.f128313r = str2;
            this.f128314s = cVar2;
            this.f128315t = 1;
            if (dVar2.b(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            cVar = cVar2;
            dVar = dVar2;
            str = str2;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cVar = this.f128314s;
            str = this.f128313r;
            dVar = this.f128312q;
            C42729a0.b(obj);
        }
        try {
            return Boxing.boxBoolean(L.f(str, cVar.f128297e));
        } finally {
            dVar.d(null);
        }
    }
}
