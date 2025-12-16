package com.avito.android.cpx_promo.v2.mvi;

import androidx.compose.runtime.internal.P;
import as.C24169a;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.cpx_promo.analytics.clickstream.events.ClickStreamButtonClickEvent;
import com.avito.android.cpx_promo.priceinput.CpxPromoInputSource;
import com.avito.android.cpx_promo.priceinput.CpxPromoPriceInputContent;
import com.avito.android.cpx_promo.v2.di.a;
import com.avito.android.cpx_promo.v2.domain.model.CpxPromoV2;
import com.avito.android.cpx_promo.v2.mvi.entity.CpxPromoV2InternalAction;
import com.avito.android.cpx_promo.v2.mvi.entity.CpxPromoV2State;
import com.avito.android.cpx_promo.v2.mvi.entity.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.ToastMessageLink;
import com.avito.android.screen_flow.link.ScreenFlowLink;
import com.avito.android.util.R0;
import java.util.Iterator;
import javax.inject.Inject;
import js.C42420b;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.rx3.y;
import ls.InterfaceC43822a;

/* compiled from: CpxPromoV2Actor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/cpx_promo/v2/mvi/m;", "Lcom/avito/android/arch/mvi/a;", "Lcom/avito/android/cpx_promo/v2/mvi/entity/a;", "Lcom/avito/android/cpx_promo/v2/mvi/entity/CpxPromoV2InternalAction;", "Lcom/avito/android/cpx_promo/v2/mvi/entity/CpxPromoV2State;", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class m implements com.avito.android.arch.mvi.a<com.avito.android.cpx_promo.v2.mvi.entity.a, CpxPromoV2InternalAction, CpxPromoV2State> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f127733a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f127734b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.cpx_promo.v2.domain.a f127735c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final R0 f127736d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC43822a f127737e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f127738f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f127739g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public N0 f127740h;

    @Inject
    public m(@Y61.k @a.InterfaceC3791a String str, @a.c @Y61.k String str2, @Y61.k com.avito.android.cpx_promo.v2.domain.a aVar, @Y61.k R0 r02, @Y61.k InterfaceC43822a interfaceC43822a, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar2, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f127733a = str;
        this.f127734b = str2;
        this.f127735c = aVar;
        this.f127736d = r02;
        this.f127737e = interfaceC43822a;
        this.f127738f = aVar2;
        this.f127739g = interfaceC28373a;
    }

    public static final DeepLink c(m mVar, C24169a c24169a) {
        mVar.getClass();
        String str = c24169a.f56763b;
        DeepLink deepLink = c24169a.f56762a;
        return str != null ? new ScreenFlowLink(deepLink, new ToastMessageLink(str, ToastMessageLink.ToastType.f133735d, null, null, null, false, null, 124, null)) : deepLink;
    }

    public static final js.c d(m mVar, boolean z12, CpxPromoV2.Auto.Budget.Value.BudgetId budgetId, CpxPromoV2 cpxPromoV2) {
        CpxPromoV2.c cVar;
        CpxPromoV2.Auto auto;
        Object next;
        mVar.getClass();
        if (!z12) {
            if (cpxPromoV2 == null || (cVar = cpxPromoV2.f127487i) == null) {
                return null;
            }
            return cVar.f127515a;
        }
        if (cpxPromoV2 == null || (auto = cpxPromoV2.f127488j) == null) {
            return null;
        }
        Iterator it = auto.f127491a.f127494c.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((CpxPromoV2.Auto.Budget.Value) next).f127495a == budgetId) {
                break;
            }
        }
        CpxPromoV2.Auto.Budget.Value value = (CpxPromoV2.Auto.Budget.Value) next;
        if (value != null) {
            return value.f127497c;
        }
        return null;
    }

    public static final void e(m mVar, CpxPromoV2State cpxPromoV2State, ClickStreamButtonClickEvent.ButtonName buttonName) {
        mVar.getClass();
        boolean z12 = cpxPromoV2State.f127630h.f127669c;
        CpxPromoV2State.g gVar = cpxPromoV2State.f127633k;
        Long lValueOf = z12 ? Long.valueOf(gVar.f127672b) : null;
        Long lValueOf2 = !z12 ? Long.valueOf(gVar.f127672b) : null;
        Long l12 = cpxPromoV2State.f127634l.f127659e;
        mVar.f127739g.c(new ClickStreamButtonClickEvent(mVar.f127734b, z12, lValueOf, lValueOf2, (l12 == null || z12) ? null : l12, z12 ? cpxPromoV2State.f127632j.f127652d.f127503b : null, buttonName, gVar.f127682l, gVar.f127681k));
    }

    public static CpxPromoPriceInputContent f(m mVar, CpxPromoInputSource cpxPromoInputSource, C42420b c42420b, long j12, long j13, Long l12, CpxPromoPriceInputContent.DisplayingEventParams displayingEventParams, String str, String str2, int i12) {
        String str3 = (i12 & 64) != 0 ? null : str;
        String str4 = (i12 & 128) != 0 ? null : str2;
        mVar.getClass();
        String str5 = c42420b.f405845a;
        Long lValueOf = Long.valueOf(j12);
        Long lValueOf2 = Long.valueOf(j13);
        if (str3 == null) {
            str3 = c42420b.f405851g;
        }
        return new CpxPromoPriceInputContent(cpxPromoInputSource, str5, new CpxPromoPriceInputContent.Input(c42420b.f405846b, c42420b.f405847c, l12, c42420b.f405850f, new CpxPromoPriceInputContent.Input.Constraints(lValueOf, str3, lValueOf2, c42420b.f405852h)), c42420b.f405848d, displayingEventParams, str4);
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return C43175k.N(C43175k.C(new b(this, aVar, null), y.a(this.f127738f.d9())), com.avito.android.arch.mvi.utils.h.e(c43197r1, c.f127576l, new d(this, aVar), 1000L));
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final InterfaceC43160i<CpxPromoV2InternalAction> b(@Y61.k com.avito.android.cpx_promo.v2.mvi.entity.a aVar, @Y61.k CpxPromoV2State cpxPromoV2State) {
        C43210w c43210w;
        boolean z12 = aVar instanceof a.e;
        CpxPromoV2State.f fVar = cpxPromoV2State.f127630h;
        InterfaceC28373a interfaceC28373a = this.f127739g;
        if (z12) {
            interfaceC28373a.c(new Zr.g(this.f127734b, fVar.f127669c));
            return C43175k.G(new h(cpxPromoV2State, null));
        }
        if (aVar instanceof a.C3795a) {
            c43210w = new C43210w(CpxPromoV2InternalAction.Close.f127585b);
        } else {
            if (aVar instanceof a.i) {
                return C43175k.G(new l(this, (a.i) aVar, cpxPromoV2State, null));
            }
            if (aVar instanceof a.b) {
                return C43175k.G(new e(this, (a.b) aVar, cpxPromoV2State, null));
            }
            if (aVar instanceof a.l) {
                return C43175k.G(new a(cpxPromoV2State, this, ((a.l) aVar).f127699a, null));
            }
            if (aVar instanceof a.g) {
                return C43175k.G(new j(this, cpxPromoV2State, (a.g) aVar, null));
            }
            if (!(aVar instanceof a.j)) {
                if (aVar instanceof a.k) {
                    if (((a.k) aVar).f127698a) {
                        boolean z13 = fVar.f127669c;
                        CpxPromoV2State.g gVar = cpxPromoV2State.f127633k;
                        interfaceC28373a.c(new Zr.l(this.f127734b, z13, gVar.f127672b, z13 ? cpxPromoV2State.f127632j.f127652d.f127503b : null, gVar.f127682l, gVar.f127681k));
                    }
                    return C43175k.w();
                }
                if (aVar instanceof a.c) {
                    return C43175k.G(new f(((a.c) aVar).f127691a, this, cpxPromoV2State, null));
                }
                if (aVar instanceof a.h) {
                    return C43175k.I(this.f127736d.a(), C43175k.G(new k(this, null)));
                }
                if (aVar instanceof a.f) {
                    return C43175k.G(new i(((a.f) aVar).f127694a, cpxPromoV2State, this, null));
                }
                if (aVar instanceof a.m) {
                    return new C43210w(new CpxPromoV2InternalAction.OpenDeeplink(((a.m) aVar).f127700a, null, 2, null));
                }
                if (aVar instanceof a.d) {
                    return C43175k.G(new g(cpxPromoV2State, null));
                }
                throw new NoWhenBranchMatchedException();
            }
            c43210w = new C43210w(CpxPromoV2InternalAction.CloseSliderInfo.f127586b);
        }
        return c43210w;
    }
}
