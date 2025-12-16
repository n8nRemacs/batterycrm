package com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.mvi;

import Ju.InterfaceC14249c;
import com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.mvi.entity.CpxPromoGeoInternalAction;
import com.avito.android.cpx_promo_geo.screens.region_sheet.deeplink.RegionSheetLink;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import kotlinx.coroutines.flow.C43207v;
import kotlinx.coroutines.flow.InterfaceC43160i;
import os.u;
import ts.C48709c;

/* compiled from: CpxPromoGeoActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LJu/c;", "result", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/cpx_promo_geo/screens/cpx_promo_geo/mvi/entity/CpxPromoGeoInternalAction;", "<anonymous>", "(LJu/c;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.mvi.CpxPromoGeoActor$process$deeplinkResultFlow$3", f = "CpxPromoGeoActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes12.dex */
final class d extends SuspendLambda implements Y41.p<InterfaceC14249c, Continuation<? super InterfaceC43160i<? extends CpxPromoGeoInternalAction>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f127863q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ e f127864r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, Continuation<? super d> continuation) {
        super(2, continuation);
        this.f127864r = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        d dVar = new d(this.f127864r, continuation);
        dVar.f127863q = obj;
        return dVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC14249c interfaceC14249c, Continuation<? super InterfaceC43160i<? extends CpxPromoGeoInternalAction>> continuation) {
        return ((d) create(interfaceC14249c, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v18, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r9v19, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v20, types: [java.util.ArrayList] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        u uVar;
        ArrayList arrayList;
        C48709c c48709c;
        ArrayList arrayList2;
        C48709c c48709c2;
        C48709c.o oVar;
        List<C48709c.p> list;
        C48709c c48709c3;
        C48709c.o oVar2;
        List<C48709c.C48710a> list2;
        String str;
        ?? arrayList3;
        String str2;
        C48709c.o oVar3;
        C48709c.r rVar;
        Map<String, C48709c.f> map;
        C48709c.f fVar;
        C48709c.o oVar4;
        List<C48709c.C48710a> list3;
        C48709c.w wVar;
        C48709c.C48711b c48711b;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        InterfaceC14249c interfaceC14249c = (InterfaceC14249c) this.f127863q;
        boolean z12 = interfaceC14249c instanceof RegionSheetLink.b.C3804b;
        boolean z13 = false;
        e eVar = this.f127864r;
        C48709c c48709c4 = null;
        if (!z12) {
            eVar.f127869e = null;
            return new C43207v(new CpxPromoGeoInternalAction[0]);
        }
        C48709c c48709c5 = eVar.f127869e;
        boolean z14 = (c48709c5 == null || (c48711b = c48709c5.f439500i) == null || !c48711b.f439518c) ? false : true;
        if (c48709c5 != null && (wVar = c48709c5.f439501j) != null && !wVar.f439589a) {
            z13 = true;
        }
        if (z14 && z13) {
            if (c48709c5 == null || (oVar4 = c48709c5.f439505n) == null || (list3 = oVar4.f439563b) == null) {
                arrayList3 = C42784z0.f406748b;
            } else {
                List<C48709c.C48710a> list4 = list3;
                arrayList3 = new ArrayList(C42745f0.q(list4, 10));
                Iterator it = list4.iterator();
                while (it.hasNext()) {
                    arrayList3.add(Boxing.boxLong(((C48709c.C48710a) it.next()).f439514a));
                }
            }
            C48709c c48709c6 = eVar.f127869e;
            String str3 = (c48709c6 == null || (oVar3 = c48709c6.f439505n) == null || (rVar = oVar3.f439562a) == null || (map = rVar.f439576a.f439524e) == null || (fVar = map.get(c48709c6.f439502k)) == null) ? null : fVar.f439528a.f439577a;
            if (str3 == null) {
                str3 = "";
            }
            C48709c c48709c7 = eVar.f127869e;
            uVar = new u((c48709c7 == null || (str2 = c48709c7.f439502k) == null) ? null : C43066x.z0(str2), arrayList3, str3);
        } else {
            uVar = null;
        }
        if (!z14 || z13 || (c48709c3 = eVar.f127869e) == null || (oVar2 = c48709c3.f439505n) == null || (list2 = oVar2.f439563b) == null) {
            arrayList = null;
        } else {
            List<C48709c.C48710a> list5 = list2;
            arrayList = new ArrayList(C42745f0.q(list5, 10));
            for (C48709c.C48710a c48710a : list5) {
                long j12 = c48710a.f439514a;
                C48709c.C12686c c12686c = c48710a.f439515b;
                C48709c c48709c8 = eVar.f127869e;
                C48709c.f fVar2 = c12686c.f439524e.get(c48709c8 != null ? c48709c8.f439502k : null);
                String str4 = fVar2 != null ? fVar2.f439528a.f439577a : null;
                String str5 = str4 == null ? "" : str4;
                C48709c c48709c9 = eVar.f127869e;
                arrayList.add(new os.o(null, (c48709c9 == null || (str = c48709c9.f439502k) == null) ? null : C43066x.z0(str), j12, str5));
            }
        }
        if (z14 || (c48709c2 = eVar.f127869e) == null || (oVar = c48709c2.f439505n) == null || (list = oVar.f439564c) == null) {
            c48709c = null;
            arrayList2 = null;
        } else {
            List<C48709c.p> list6 = list;
            arrayList2 = new ArrayList(C42745f0.q(list6, 10));
            for (C48709c.p pVar : list6) {
                ArrayList arrayList4 = arrayList2;
                arrayList4.add(new os.o(C43066x.z0(pVar.f439567c.f439536b.f439538a), null, pVar.f439565a, pVar.f439566b.f439571d.f439577a));
                arrayList2 = arrayList4;
                c48709c4 = null;
            }
            c48709c = c48709c4;
        }
        eVar.f127869e = c48709c;
        return eVar.f127865a.a(((RegionSheetLink.b.C3804b) interfaceC14249c).f128254b, arrayList, uVar, arrayList2);
    }
}
