package com.avito.android.cpx_promo.impl.mvi;

import androidx.compose.runtime.internal.P;
import as.C24169a;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.cpx_promo.analytics.clickstream.events.ClickStreamButtonClickEvent;
import com.avito.android.cpx_promo.impl.di.a;
import com.avito.android.cpx_promo.impl.interactor.model.CpxPromo;
import com.avito.android.cpx_promo.impl.interactor.model.CpxPromoInputSheet;
import com.avito.android.cpx_promo.impl.mvi.entity.CpxPromoInternalAction;
import com.avito.android.cpx_promo.impl.mvi.entity.CpxPromoState;
import com.avito.android.cpx_promo.impl.mvi.entity.a;
import com.avito.android.cpx_promo.priceinput.CpxPromoInputSource;
import com.avito.android.cpx_promo.priceinput.CpxPromoPriceInputContent;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.ToastMessageLink;
import com.avito.android.screen_flow.link.ScreenFlowLink;
import com.avito.android.util.R0;
import fs.InterfaceC40470a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.rx3.y;

/* compiled from: CpxPromoActor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/cpx_promo/impl/mvi/k;", "Lcom/avito/android/arch/mvi/a;", "Lcom/avito/android/cpx_promo/impl/mvi/entity/a;", "Lcom/avito/android/cpx_promo/impl/mvi/entity/CpxPromoInternalAction;", "Lcom/avito/android/cpx_promo/impl/mvi/entity/CpxPromoState;", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class k implements com.avito.android.arch.mvi.a<com.avito.android.cpx_promo.impl.mvi.entity.a, CpxPromoInternalAction, CpxPromoState> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f127199a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f127200b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.cpx_promo.impl.interactor.a f127201c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final R0 f127202d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC40470a f127203e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f127204f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f127205g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public N0 f127206h;

    @Inject
    public k(@a.InterfaceC3782a @Y61.k String str, @a.c @Y61.k String str2, @Y61.k com.avito.android.cpx_promo.impl.interactor.a aVar, @Y61.k R0 r02, @Y61.k InterfaceC40470a interfaceC40470a, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar2, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f127199a = str;
        this.f127200b = str2;
        this.f127201c = aVar;
        this.f127202d = r02;
        this.f127203e = interfaceC40470a;
        this.f127204f = aVar2;
        this.f127205g = interfaceC28373a;
    }

    public static final DeepLink c(k kVar, C24169a c24169a) {
        kVar.getClass();
        String str = c24169a.f56763b;
        DeepLink deepLink = c24169a.f56762a;
        if (str == null) {
            return deepLink;
        }
        return new ScreenFlowLink(deepLink, new ToastMessageLink(str, ToastMessageLink.ToastType.f133735d, null, null, null, false, null, 124, null));
    }

    public static final void d(k kVar, CpxPromoState cpxPromoState, ClickStreamButtonClickEvent.ButtonName buttonName) {
        String str;
        kVar.getClass();
        boolean z12 = cpxPromoState.f127115h.f127143d;
        CpxPromoState.SliderState sliderState = cpxPromoState.f127117j;
        Long lValueOf = z12 ? Long.valueOf(sliderState.f127146c) : null;
        Long lValueOf2 = !z12 ? Long.valueOf(sliderState.f127146c) : null;
        Long l12 = cpxPromoState.f127118k.f127134e;
        Long l13 = (l12 == null || z12) ? null : l12;
        CpxPromoState.BudgetChip budgetChip = cpxPromoState.f127116i.f127125e;
        kVar.f127205g.c(new ClickStreamButtonClickEvent(kVar.f127200b, z12, lValueOf, lValueOf2, l13, (budgetChip == null || (str = budgetChip.f127120b) == null || !z12) ? null : str, buttonName, sliderState.f127153j, sliderState.f127152i));
    }

    public static CpxPromoPriceInputContent e(CpxPromoInputSource cpxPromoInputSource, CpxPromoInputSheet cpxPromoInputSheet, long j12, long j13, String str, Long l12, CpxPromoPriceInputContent.DisplayingEventParams displayingEventParams) {
        return new CpxPromoPriceInputContent(cpxPromoInputSource, cpxPromoInputSheet.f127036b, new CpxPromoPriceInputContent.Input(cpxPromoInputSheet.f127037c, cpxPromoInputSheet.f127038d, l12, cpxPromoInputSheet.f127041g, new CpxPromoPriceInputContent.Input.Constraints(Long.valueOf(j12), str == null ? cpxPromoInputSheet.f127042h : str, Long.valueOf(j13), cpxPromoInputSheet.f127043i)), cpxPromoInputSheet.f127039e, displayingEventParams, null, 32, null);
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return C43175k.N(C43175k.C(new a(this, aVar, null), y.a(this.f127204f.d9())), com.avito.android.arch.mvi.utils.h.e(c43197r1, b.f127061l, new c(this, aVar), 1000L));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final InterfaceC43160i<CpxPromoInternalAction> b(@Y61.k com.avito.android.cpx_promo.impl.mvi.entity.a aVar, @Y61.k CpxPromoState cpxPromoState) {
        String str;
        C43210w c43210w;
        boolean zEquals = aVar.equals(a.c.f127159a);
        CpxPromoState.SegmentedControlState segmentedControlState = cpxPromoState.f127115h;
        CpxPromoPriceInputContent cpxPromoPriceInputContent = null;
        Object[] objArr = 0;
        InterfaceC28373a interfaceC28373a = this.f127205g;
        if (zEquals) {
            interfaceC28373a.c(new Zr.g(this.f127200b, segmentedControlState.f127143d));
            CpxPromo cpxPromo = cpxPromoState.f127111d;
            return C43175k.G(new e(cpxPromo != null ? cpxPromo.f127002d : null, null, this, null));
        }
        if (aVar.equals(a.C3785a.f127157a)) {
            c43210w = new C43210w(CpxPromoInternalAction.Close.f127075b);
        } else {
            if (aVar instanceof a.i) {
                return C43175k.G(new i(this, (a.i) aVar, cpxPromoState, null));
            }
            if (aVar instanceof a.b) {
                return C43175k.G(new d(this, (a.b) aVar, cpxPromoState, null));
            }
            if (aVar instanceof a.l) {
                return C43175k.G(new j(this, cpxPromoState, (a.l) aVar, null));
            }
            if (aVar instanceof a.e) {
                return C43175k.G(new g(this, cpxPromoState, (a.e) aVar, null));
            }
            if (!(aVar instanceof a.j)) {
                if (aVar instanceof a.k) {
                    if (((a.k) aVar).f127166a) {
                        boolean z12 = segmentedControlState.f127143d;
                        CpxPromoState.SliderState sliderState = cpxPromoState.f127117j;
                        long j12 = sliderState.f127146c;
                        CpxPromoState.BudgetChip budgetChip = cpxPromoState.f127116i.f127125e;
                        interfaceC28373a.c(new Zr.l(this.f127200b, z12, j12, (budgetChip == null || (str = budgetChip.f127120b) == null || !z12) ? null : str, sliderState.f127153j, sliderState.f127152i));
                    }
                    return C43175k.w();
                }
                boolean z13 = aVar instanceof a.h;
                CpxPromoState.ButtonState buttonState = cpxPromoState.f127119l;
                if (z13) {
                    return C43175k.G(new e(buttonState.f127126b, cpxPromoState, this, null));
                }
                if (aVar instanceof a.f) {
                    return C43175k.G(new e(buttonState.f127128d, null, this, null));
                }
                if (aVar instanceof a.g) {
                    return C43175k.I(this.f127202d.a(), C43175k.G(new h(this, null)));
                }
                if (aVar instanceof a.d) {
                    return C43175k.G(new f(((a.d) aVar).f127160a, cpxPromoState, this, null));
                }
                if (aVar instanceof a.m) {
                    return new C43210w(new CpxPromoInternalAction.OpenDeeplink(((a.m) aVar).f127168a, cpxPromoPriceInputContent, 2, objArr == true ? 1 : 0));
                }
                throw new NoWhenBranchMatchedException();
            }
            c43210w = new C43210w(CpxPromoInternalAction.CloseSliderInfo.f127076b);
        }
        return c43210w;
    }
}
