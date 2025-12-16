package com.avito.android.campaigns_sale.mvi;

import com.avito.android.arch.mvi.a;
import com.avito.android.campaigns_sale.mvi.entity.CampaignsSaleInternalAction;
import com.avito.android.campaigns_sale.mvi.entity.CampaignsSaleState;
import gm.C40705b;
import gm.C40707d;
import im.InterfaceC41424a;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: CampaignsSaleActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/campaigns_sale/mvi/w;", "Lcom/avito/android/arch/mvi/a;", "Lim/a;", "Lcom/avito/android/campaigns_sale/mvi/entity/CampaignsSaleInternalAction;", "Lcom/avito/android/campaigns_sale/mvi/entity/CampaignsSaleState;", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class w implements com.avito.android.arch.mvi.a<InterfaceC41424a, CampaignsSaleInternalAction, CampaignsSaleState> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.campaigns_sale.network.a f114304a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final z f114305b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f114306c;

    @Inject
    public w(@Y61.k com.avito.android.campaigns_sale.network.a aVar, @Y61.k z zVar, @com.avito.android.campaigns_sale.di.p @Y61.k String str) {
        this.f114304a = aVar;
        this.f114305b = zVar;
        this.f114306c = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(com.avito.android.campaigns_sale.mvi.w r16, kotlinx.coroutines.flow.InterfaceC43172j r17, com.avito.android.campaigns_sale.mvi.entity.CampaignsSaleState r18, java.lang.String r19, kotlin.coroutines.jvm.internal.ContinuationImpl r20) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.campaigns_sale.mvi.w.c(com.avito.android.campaigns_sale.mvi.w, kotlinx.coroutines.flow.j, com.avito.android.campaigns_sale.mvi.entity.CampaignsSaleState, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static final Object d(w wVar, InterfaceC43172j interfaceC43172j, CampaignsSaleState campaignsSaleState, Y41.l lVar, SuspendLambda suspendLambda) {
        Object next;
        List<Long> list;
        wVar.getClass();
        Iterator<T> it = campaignsSaleState.f114191e.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            C40705b c40705b = (C40705b) next;
            if (c40705b.f396779h == null || (list = c40705b.f396777f) == null || list.isEmpty()) {
                break;
            }
            Integer num = c40705b.f396779h;
            int iIntValue = num.intValue();
            C40707d c40707d = c40705b.f396775d;
            if (iIntValue > c40707d.f396786b || num.intValue() < c40707d.f396785a) {
                break;
            }
        }
        C40705b c40705b2 = (C40705b) next;
        String str = c40705b2 != null ? c40705b2.f396773b : null;
        if (str == null) {
            Object objInvoke = lVar.invoke(suspendLambda);
            return objInvoke == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvoke : G0.f406611a;
        }
        Object objEmit = interfaceC43172j.emit(new CampaignsSaleInternalAction.ValidateBlocks(str), suspendLambda);
        return objEmit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit : G0.f406611a;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<CampaignsSaleInternalAction> b(InterfaceC41424a interfaceC41424a, CampaignsSaleState campaignsSaleState) {
        InterfaceC41424a interfaceC41424a2 = interfaceC41424a;
        CampaignsSaleState campaignsSaleState2 = campaignsSaleState;
        if (interfaceC41424a2 instanceof InterfaceC41424a.d) {
            return C43175k.G(new C29312l(this, null));
        }
        if (interfaceC41424a2 instanceof InterfaceC41424a.e) {
            return C43175k.G(new C29315o(campaignsSaleState2, null));
        }
        if (interfaceC41424a2 instanceof InterfaceC41424a.f) {
            return C43175k.G(new C29316p(interfaceC41424a2, null));
        }
        if (interfaceC41424a2 instanceof InterfaceC41424a.n) {
            return C43175k.G(new C29317q(this, null));
        }
        if (interfaceC41424a2 instanceof InterfaceC41424a.k) {
            return C43175k.G(new r(this, campaignsSaleState2, null));
        }
        if (interfaceC41424a2 instanceof InterfaceC41424a.l) {
            return C43175k.G(new C29318s(2, null));
        }
        if (interfaceC41424a2 instanceof InterfaceC41424a.m) {
            return C43175k.G(new C29319t(this, null));
        }
        if (interfaceC41424a2 instanceof InterfaceC41424a.q) {
            return C43175k.G(new u(this, campaignsSaleState2, null));
        }
        if (interfaceC41424a2 instanceof InterfaceC41424a.r) {
            return C43175k.G(new v(this, campaignsSaleState2, null));
        }
        if (interfaceC41424a2 instanceof InterfaceC41424a.p) {
            return C43175k.G(new C29302b(this, campaignsSaleState2, interfaceC41424a2, null));
        }
        if (interfaceC41424a2 instanceof InterfaceC41424a.b) {
            return C43175k.G(new C29303c(this, campaignsSaleState2, null));
        }
        if (interfaceC41424a2 instanceof InterfaceC41424a.i) {
            return C43175k.G(new C29304d(interfaceC41424a2, null));
        }
        if (interfaceC41424a2 instanceof InterfaceC41424a.g) {
            return C43175k.G(new C29305e(this, campaignsSaleState2, interfaceC41424a2, null));
        }
        if (interfaceC41424a2 instanceof InterfaceC41424a.h) {
            return C43175k.G(new C29306f(this, campaignsSaleState2, interfaceC41424a2, null));
        }
        if (interfaceC41424a2 instanceof InterfaceC41424a.t) {
            return C43175k.G(new C29307g(this, campaignsSaleState2, interfaceC41424a2, null));
        }
        if (interfaceC41424a2 instanceof InterfaceC41424a.s) {
            return C43175k.G(new C29308h(interfaceC41424a2, null));
        }
        if (interfaceC41424a2 instanceof InterfaceC41424a.C11392a) {
            return C43175k.G(new C29309i(this, campaignsSaleState2, interfaceC41424a2, null));
        }
        if (interfaceC41424a2 instanceof InterfaceC41424a.u) {
            return C43175k.G(new C29310j(this, campaignsSaleState2, interfaceC41424a2, null));
        }
        if (interfaceC41424a2 instanceof InterfaceC41424a.c) {
            return C43175k.G(new C29311k(this, interfaceC41424a2, null));
        }
        if (interfaceC41424a2 instanceof InterfaceC41424a.j) {
            return C43175k.G(new C29313m(this, interfaceC41424a2, null));
        }
        if (interfaceC41424a2 instanceof InterfaceC41424a.o) {
            return C43175k.G(new C29314n(this, campaignsSaleState2, interfaceC41424a2, null));
        }
        throw new NoWhenBranchMatchedException();
    }
}
