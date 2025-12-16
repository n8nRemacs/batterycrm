package com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.domain;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.mvi.entity.CpxPromoGeoInternalAction;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;
import ps.C47136d;

/* compiled from: PostCpxPromoGeoSaveUseCase.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/cpx_promo_geo/screens/cpx_promo_geo/mvi/entity/CpxPromoGeoInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.domain.PostCpxPromoGeoSaveUseCase$invoke$1", f = "PostCpxPromoGeoSaveUseCase.kt", i = {0, 1, 2, 2, 3, 3, 5, 5}, l = {AvailableCode.USER_IGNORE_PREVIOUS_POPUP, AvailableCode.HMS_IS_SPOOF, 37, 38, 39, 42, 43}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "it", "$this$flow", "it", "$this$flow", "it"}, s = {"L$0", "L$0", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1"})
/* loaded from: classes12.dex */
final class d extends SuspendLambda implements p<InterfaceC43172j<? super CpxPromoGeoInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public Object f127837q;

    /* renamed from: r, reason: collision with root package name */
    public int f127838r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f127839s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ e f127840t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ ArrayList f127841u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C47136d f127842v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ArrayList f127843w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, ArrayList arrayList, C47136d c47136d, ArrayList arrayList2, Continuation continuation) {
        super(2, continuation);
        this.f127840t = eVar;
        this.f127841u = arrayList;
        this.f127842v = c47136d;
        this.f127843w = arrayList2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        d dVar = new d(this.f127840t, this.f127841u, this.f127842v, this.f127843w, continuation);
        dVar.f127839s = obj;
        return dVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super CpxPromoGeoInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0083 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0106  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.domain.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
