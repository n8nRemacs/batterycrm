package com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.info;

import V80.h;
import W80.d;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.position_in_search.stats.screen.old_position_in_search.domain.model.PositionInfoBanner;
import com.avito.android.position_in_search.stats.screen.old_position_in_search.domain.model.PositionInfoButton;
import com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.info.entity.PositionInfoInternalAction;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.InterfaceC35863o4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.b1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: PositionInfoReducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/info/q;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/info/entity/PositionInfoInternalAction;", "LW80/h;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class q implements u<PositionInfoInternalAction, W80.h> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35863o4 f220555b;

    @Inject
    public q(@Y61.k InterfaceC35863o4 interfaceC35863o4) {
        this.f220555b = interfaceC35863o4;
    }

    @Override // com.avito.android.arch.mvi.u
    public final W80.h a(PositionInfoInternalAction positionInfoInternalAction, W80.h hVar) {
        W80.j jVar;
        String str;
        AttributedText attributedText;
        String strA;
        W80.b bVar;
        W80.g gVar;
        PositionInfoInternalAction positionInfoInternalAction2 = positionInfoInternalAction;
        W80.h hVar2 = hVar;
        boolean z12 = positionInfoInternalAction2 instanceof PositionInfoInternalAction.LoadingError;
        InterfaceC35863o4 interfaceC35863o4 = this.f220555b;
        if (z12) {
            PositionInfoInternalAction.LoadingError loadingError = (PositionInfoInternalAction.LoadingError) positionInfoInternalAction2;
            return W80.h.a(hVar2, null, new d.b(loadingError.f220514b, interfaceC35863o4.a(), loadingError.f220515c), null, 23);
        }
        boolean z13 = positionInfoInternalAction2 instanceof PositionInfoInternalAction.LoadingResult;
        String str2 = hVar2.f17797c;
        int i12 = 0;
        W80.d dVarA = hVar2.f17799e;
        if (z13) {
            PositionInfoInternalAction.LoadingResult loadingResult = (PositionInfoInternalAction.LoadingResult) positionInfoInternalAction2;
            ArrayList arrayList = new ArrayList();
            V80.h hVar3 = loadingResult.f220518b;
            Iterator it = hVar3.f16960e.iterator();
            boolean z14 = false;
            while (it.hasNext()) {
                h.c cVar = (h.c) it.next();
                boolean z15 = L.f(cVar.f16969a, str2) && cVar.f16971c;
                arrayList.add(new W80.f(cVar, z15));
                if (z15) {
                    z14 = true;
                }
            }
            if (!z14 && !arrayList.isEmpty()) {
                W80.f fVar = (W80.f) C42745f0.E(arrayList);
                arrayList.set(0, new W80.f(fVar.f17792a, true));
                str2 = fVar.f17792a.f16969a;
            }
            Set<String> set = loadingResult.f220519c;
            PositionInfoBanner positionInfoBanner = hVar3.f16959d;
            PositionInfoBanner positionInfoBanner2 = (positionInfoBanner == null || set.contains(positionInfoBanner.f220414a)) ? null : positionInfoBanner;
            d.a aVarB = W80.i.b(dVarA);
            if (aVarB == null || (gVar = aVarB.f17781c) == null || (strA = gVar.f17794a) == null) {
                strA = interfaceC35863o4.a();
            }
            W80.g gVar2 = new W80.g(strA, arrayList);
            h.b bVar2 = hVar3.f16962g;
            if (bVar2 != null) {
                PositionInfoButton positionInfoButton = bVar2.f16967b;
                W80.c cVar2 = positionInfoButton != null ? new W80.c(interfaceC35863o4.a(), positionInfoButton) : null;
                PositionInfoButton positionInfoButton2 = bVar2.f16968c;
                bVar = new W80.b(bVar2.f16966a, cVar2, positionInfoButton2 != null ? new W80.c(interfaceC35863o4.a(), positionInfoButton2) : null);
            } else {
                bVar = null;
            }
            return W80.h.a(hVar2, str2, new d.a(hVar3.f16956a, positionInfoBanner2, gVar2, hVar3.f16961f, bVar, null), set, 5);
        }
        if (positionInfoInternalAction2 instanceof PositionInfoInternalAction.LoadingStart) {
            return W80.h.a(hVar2, null, dVarA instanceof d.c ? (d.c) dVarA : new d.c(interfaceC35863o4.a()), null, 23);
        }
        if (!(positionInfoInternalAction2 instanceof PositionInfoInternalAction.PeriodSelected)) {
            if (positionInfoInternalAction2 instanceof PositionInfoInternalAction.BannerClosed) {
                String str3 = ((PositionInfoInternalAction.BannerClosed) positionInfoInternalAction2).f220512b;
                if (W80.i.a(hVar2, str3) == null) {
                    return hVar2;
                }
                LinkedHashSet linkedHashSetI = b1.i(hVar2.f17800f, str3);
                d.a aVarB2 = W80.i.b(dVarA);
                if (aVarB2 != null) {
                    PositionInfoBanner positionInfoBanner3 = aVarB2.f17780b;
                    dVarA = L.f(positionInfoBanner3 != null ? positionInfoBanner3.f220414a : null, str3) ? d.a.a(aVarB2, null, null, 61) : aVarB2;
                }
                return W80.h.a(hVar2, null, dVarA, linkedHashSetI, 7);
            }
            if (!(positionInfoInternalAction2 instanceof PositionInfoInternalAction.ToastClosed)) {
                if (positionInfoInternalAction2 instanceof PositionInfoInternalAction.NoChange ? true : positionInfoInternalAction2 instanceof PositionInfoInternalAction.Close ? true : positionInfoInternalAction2 instanceof PositionInfoInternalAction.OpenDeepLink) {
                    return hVar2;
                }
                throw new NoWhenBranchMatchedException();
            }
            PositionInfoInternalAction.ToastClosed toastClosed = (PositionInfoInternalAction.ToastClosed) positionInfoInternalAction2;
            d.a aVarB3 = W80.i.b(dVarA);
            if (aVarB3 != null) {
                W80.j jVar2 = aVarB3.f17784f;
                dVarA = L.f(jVar2 != null ? jVar2.f17803a : null, toastClosed.f220526b) ? d.a.a(aVarB3, null, null, 31) : aVarB3;
            }
            return W80.h.a(hVar2, null, dVarA, null, 23);
        }
        PositionInfoInternalAction.PeriodSelected periodSelected = (PositionInfoInternalAction.PeriodSelected) positionInfoInternalAction2;
        d.a aVarB4 = W80.i.b(dVarA);
        if (aVarB4 == null) {
            return hVar2;
        }
        ArrayList arrayList2 = new ArrayList(aVarB4.f17781c.f17795b);
        Iterator it2 = arrayList2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            W80.f fVar2 = (W80.f) it2.next();
            h.c cVar3 = fVar2.f17792a;
            String str4 = periodSelected.f220525b;
            boolean z16 = L.f(cVar3.f16969a, str4) && cVar3.f16971c;
            h.c cVar4 = fVar2.f17792a;
            str = cVar4.f16969a;
            if (z16) {
                jVar = null;
                break;
            }
            if (L.f(str, str4)) {
                if (cVar4.f16971c || (attributedText = cVar4.f16972d) == null) {
                    break;
                }
                jVar = new W80.j(str, attributedText);
            }
        }
        jVar = null;
        str = str2;
        if (!L.f(str, str2)) {
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                W80.f fVar3 = (W80.f) it3.next();
                arrayList2.set(i12, new W80.f(fVar3.f17792a, L.f(fVar3.f17792a.f16969a, str)));
                i12++;
            }
        }
        d.a aVarB5 = W80.i.b(dVarA);
        if (aVarB5 != null) {
            dVarA = d.a.a(aVarB5, new W80.g(aVarB5.f17781c.f17794a, arrayList2), jVar, 27);
        }
        return W80.h.a(hVar2, str, dVarA, null, 21);
    }
}
