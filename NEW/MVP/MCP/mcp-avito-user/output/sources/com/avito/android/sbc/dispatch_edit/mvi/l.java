package com.avito.android.sbc.dispatch_edit.mvi;

import Wo0.C15785a;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.sbc.dispatch_edit.mvi.entity.SbcDispatchEditInternalAction;
import com.avito.android.sbc.generated.api.api_get_auto_dispatches_v_1.AutoDispatchItemOut;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: SbcDispatchEditReducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/sbc/dispatch_edit/mvi/l;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/sbc/dispatch_edit/mvi/entity/SbcDispatchEditInternalAction;", "LWo0/d;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class l implements u<SbcDispatchEditInternalAction, Wo0.d> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.sbc.utils.h f260145b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.sbc.utils.a f260146c;

    @Inject
    public l(@Y61.k com.avito.android.sbc.utils.h hVar, @Y61.k com.avito.android.sbc.utils.a aVar) {
        this.f260145b = hVar;
        this.f260146c = aVar;
    }

    @Override // com.avito.android.arch.mvi.u
    public final Wo0.d a(SbcDispatchEditInternalAction sbcDispatchEditInternalAction, Wo0.d dVar) {
        int i12;
        int i13;
        SbcDispatchEditInternalAction sbcDispatchEditInternalAction2 = sbcDispatchEditInternalAction;
        Wo0.d dVar2 = dVar;
        if (sbcDispatchEditInternalAction2 instanceof SbcDispatchEditInternalAction.Loaded) {
            List<AutoDispatchItemOut> list = ((SbcDispatchEditInternalAction.Loaded) sbcDispatchEditInternalAction2).f260127b;
            ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
            for (AutoDispatchItemOut autoDispatchItemOut : list) {
                arrayList.add(new C15785a(String.valueOf(autoDispatchItemOut.getItemId()), autoDispatchItemOut.getImg(), autoDispatchItemOut.getName(), this.f260146c.a(autoDispatchItemOut.getPrice()), this.f260145b.f260189a.format(autoDispatchItemOut.getChatsOpened()), false, autoDispatchItemOut.getStatus() != AutoDispatchItemOut.Status.Inactive));
            }
            return Wo0.d.a(dVar2, false, false, false, arrayList, 7);
        }
        boolean zEquals = sbcDispatchEditInternalAction2.equals(SbcDispatchEditInternalAction.CheckAllClicked.f260125b);
        List<C15785a> list2 = dVar2.f18064e;
        boolean z12 = dVar2.f18063d;
        if (zEquals) {
            if (z12) {
                return dVar2;
            }
            boolean z13 = dVar2.f18061b;
            boolean z14 = !z13;
            List<C15785a> list3 = list2;
            ArrayList arrayList2 = new ArrayList(C42745f0.q(list3, 10));
            for (C15785a c15785aA : list3) {
                if (c15785aA.f18050f) {
                    c15785aA = C15785a.a(c15785aA, z14);
                }
                arrayList2.add(c15785aA);
            }
            return Wo0.d.a(dVar2, z14, z13, false, arrayList2, 4);
        }
        if (!(sbcDispatchEditInternalAction2 instanceof SbcDispatchEditInternalAction.CheckClicked)) {
            if (sbcDispatchEditInternalAction2 instanceof SbcDispatchEditInternalAction.RemoveFromDispatchFailed) {
                return Wo0.d.a(dVar2, false, false, false, null, 11);
            }
            if (sbcDispatchEditInternalAction2 instanceof SbcDispatchEditInternalAction.RemovedFromDispatch) {
                return dVar2;
            }
            if (sbcDispatchEditInternalAction2.equals(SbcDispatchEditInternalAction.RemovingStarted.f260131b)) {
                return Wo0.d.a(dVar2, false, false, true, null, 11);
            }
            if (sbcDispatchEditInternalAction2.equals(SbcDispatchEditInternalAction.NavigateBack.f260128b)) {
                return dVar2;
            }
            throw new NoWhenBranchMatchedException();
        }
        if (z12) {
            return dVar2;
        }
        List<C15785a> list4 = list2;
        ArrayList arrayList3 = new ArrayList(C42745f0.q(list4, 10));
        for (C15785a c15785aA2 : list4) {
            if (L.f(c15785aA2.f18045a, ((SbcDispatchEditInternalAction.CheckClicked) sbcDispatchEditInternalAction2).f260126b) && c15785aA2.f18050f) {
                c15785aA2 = C15785a.a(c15785aA2, !c15785aA2.f18046b);
            }
            arrayList3.add(c15785aA2);
        }
        if (arrayList3.isEmpty()) {
            i12 = 0;
        } else {
            Iterator it = arrayList3.iterator();
            i12 = 0;
            while (it.hasNext()) {
                C15785a c15785a = (C15785a) it.next();
                if (c15785a.f18046b && c15785a.f18050f && (i12 = i12 + 1) < 0) {
                    C42745f0.G0();
                    throw null;
                }
            }
        }
        if (arrayList3.isEmpty()) {
            i13 = 0;
        } else {
            Iterator it2 = arrayList3.iterator();
            i13 = 0;
            while (it2.hasNext()) {
                if (((C15785a) it2.next()).f18050f && (i13 = i13 + 1) < 0) {
                    C42745f0.G0();
                    throw null;
                }
            }
        }
        return Wo0.d.a(dVar2, i12 == i13, i12 == 0, false, arrayList3, 4);
    }
}
