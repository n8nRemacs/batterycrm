package com.avito.android.vas_union.mvi;

import com.avito.android.arch.mvi.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.vas_union.mvi.entity.VasUnionV2InternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import qM0.C47322c;
import qM0.InterfaceC47320a;

/* compiled from: VasUnionV2Actor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/vas_union/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "LqM0/a;", "Lcom/avito/android/vas_union/mvi/entity/VasUnionV2InternalAction;", "LqM0/c;", "_avito_vas-union_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a implements com.avito.android.arch.mvi.a<InterfaceC47320a, VasUnionV2InternalAction, C47322c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.vas_union.domain.a f323207a;

    @Inject
    public a(@Y61.k com.avito.android.vas_union.domain.a aVar) {
        this.f323207a = aVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<VasUnionV2InternalAction> b(InterfaceC47320a interfaceC47320a, C47322c c47322c) {
        C43210w c43210w;
        ButtonAction button;
        InterfaceC47320a interfaceC47320a2 = interfaceC47320a;
        C47322c c47322c2 = c47322c;
        if (interfaceC47320a2 instanceof InterfaceC47320a.d) {
            return this.f323207a.a();
        }
        if (interfaceC47320a2 instanceof InterfaceC47320a.C12323a) {
            c43210w = new C43210w(c47322c2.f429225b ? VasUnionV2InternalAction.FinishFlow.f323222b : VasUnionV2InternalAction.Close.f323218b);
        } else {
            if (!(interfaceC47320a2 instanceof InterfaceC47320a.f)) {
                if (interfaceC47320a2 instanceof InterfaceC47320a.e) {
                    return new C43210w(new VasUnionV2InternalAction.HandleDeeplink(((InterfaceC47320a.e) interfaceC47320a2).f429210a, null, null, null, 14, null));
                }
                if (interfaceC47320a2 instanceof InterfaceC47320a.c) {
                    InterfaceC47320a.c cVar = (InterfaceC47320a.c) interfaceC47320a2;
                    DeepLink deepLink = cVar.f429207a;
                    return deepLink != null ? new C43210w(new VasUnionV2InternalAction.HandleDeeplink(deepLink, cVar.f429208b, c47322c2.f429235l, c47322c2.f429236m)) : C43175k.w();
                }
                if (interfaceC47320a2 instanceof InterfaceC47320a.j) {
                    return new C43210w(new VasUnionV2InternalAction.SelectTab(((InterfaceC47320a.j) interfaceC47320a2).f429216a));
                }
                if (interfaceC47320a2 instanceof InterfaceC47320a.h) {
                    return new C43210w(new VasUnionV2InternalAction.SelectPerformanceChip(((InterfaceC47320a.h) interfaceC47320a2).f429213a));
                }
                if (interfaceC47320a2 instanceof InterfaceC47320a.g) {
                    return new C43210w(new VasUnionV2InternalAction.SelectPerformanceCard(((InterfaceC47320a.g) interfaceC47320a2).f429212a));
                }
                if (interfaceC47320a2 instanceof InterfaceC47320a.b) {
                    return new C43210w(new VasUnionV2InternalAction.SelectBundleCard(((InterfaceC47320a.b) interfaceC47320a2).f429206a));
                }
                if (!(interfaceC47320a2 instanceof InterfaceC47320a.i)) {
                    throw new NoWhenBranchMatchedException();
                }
                InterfaceC47320a.i iVar = (InterfaceC47320a.i) interfaceC47320a2;
                return new C43210w(new VasUnionV2InternalAction.ChangeOnScreenLoading(iVar.f429214a, iVar.f429215b));
            }
            uZ.e eVar = c47322c2.f429228e;
            DeepLink deeplink = (eVar == null || (button = eVar.getButton()) == null) ? null : button.getDeeplink();
            if (deeplink == null) {
                return C43175k.w();
            }
            c43210w = new C43210w(new VasUnionV2InternalAction.HandleDeeplink(deeplink, null, null, null, 14, null));
        }
        return c43210w;
    }
}
