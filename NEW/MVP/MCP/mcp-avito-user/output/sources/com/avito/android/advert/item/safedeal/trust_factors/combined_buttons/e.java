package com.avito.android.advert.item.safedeal.trust_factors.combined_buttons;

import Y61.k;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.ab_tests.groups.StandardizeButtonWidthTestGroup;
import com.avito.android.advert.item.safedeal.InterfaceC28173a;
import com.avito.android.advert.item.safedeal.trust_factors.i;
import com.avito.android.delivery_combined_buttons_public.CombinedButtonsData;
import com.avito.android.lib.design.gradient.AvitoLinearGradientDrawable;
import com.avito.android.remote.safedeal.SafeDeal;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.reflect.n;
import u3.l;

/* compiled from: CombinedButtonsItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/safedeal/trust_factors/combined_buttons/e;", "LTV0/d;", "Lcom/avito/android/advert/item/safedeal/trust_factors/combined_buttons/h;", "Lcom/avito/android/advert/item/safedeal/trust_factors/combined_buttons/CombinedButtonsItem;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class e implements TV0.d<h, CombinedButtonsItem> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC28173a f79087b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final l<StandardizeButtonWidthTestGroup> f79088c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final G6.a f79089d;

    @Inject
    public e(@k InterfaceC28173a interfaceC28173a, @k l<StandardizeButtonWidthTestGroup> lVar, @k G6.a aVar) {
        this.f79087b = interfaceC28173a;
        this.f79088c = lVar;
        this.f79089d = aVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        i iVar;
        h hVar = (h) eVar;
        CombinedButtonsItem combinedButtonsItem = (CombinedButtonsItem) aVar;
        l<StandardizeButtonWidthTestGroup> lVar = this.f79088c;
        StandardizeButtonWidthTestGroup standardizeButtonWidthTestGroup = lVar.f439745a.f439749b;
        standardizeButtonWidthTestGroup.getClass();
        StandardizeButtonWidthTestGroup standardizeButtonWidthTestGroup2 = StandardizeButtonWidthTestGroup.f67983e;
        if (standardizeButtonWidthTestGroup == standardizeButtonWidthTestGroup2 || standardizeButtonWidthTestGroup == StandardizeButtonWidthTestGroup.f67982d || standardizeButtonWidthTestGroup == StandardizeButtonWidthTestGroup.f67981c) {
            lVar.b();
        }
        CombinedButtonsData combinedButtonsData = combinedButtonsItem.f79067c;
        int i13 = combinedButtonsData.f134955c;
        c cVar = new c(this);
        StandardizeButtonWidthTestGroup standardizeButtonWidthTestGroup3 = lVar.f439745a.f439749b;
        standardizeButtonWidthTestGroup3.getClass();
        hVar.f79100e.b(i13, combinedButtonsData.f134956d, combinedButtonsData.f134957e, combinedButtonsData.f134958f, combinedButtonsData.f134959g, combinedButtonsData.f134960h, combinedButtonsData.f134961i, cVar, standardizeButtonWidthTestGroup3 == standardizeButtonWidthTestGroup2);
        G6.a aVar2 = this.f79089d;
        aVar2.getClass();
        n<Object> nVar = G6.a.f6355c[0];
        if (((Boolean) aVar2.f6356b.a().invoke()).booleanValue()) {
            d dVar = new d(this);
            FreeDeliveryBlock freeDeliveryBlock = combinedButtonsItem.f79068d;
            View view = hVar.f79103h;
            View view2 = hVar.f79101f;
            View view3 = hVar.f79097b;
            if (freeDeliveryBlock != null) {
                Context context = view3.getContext();
                boolean z12 = freeDeliveryBlock.f79074c;
                boolean z13 = !z12;
                TextView textView = hVar.f79102g;
                textView.setText(freeDeliveryBlock.f79073b);
                I5.d(textView, null, !z12 ? C35835l0.h(R.attr.ic_arrowRight16, context) : null, 11);
                boolean z14 = freeDeliveryBlock.f79075d;
                view2.setVisibility(!z14 ? 0 : 8);
                view2.setOnClickListener(new g(z13, dVar, 0));
                view.setVisibility(z14 ? 0 : 8);
                AvitoLinearGradientDrawable.a.C5275a c5275a = new AvitoLinearGradientDrawable.a.C5275a(context, R.attr.gradientLinearMonoHorizontalViolet, 0, 4, null);
                c5275a.f179264a = D6.i(24, context);
                view3.setBackground(new AvitoLinearGradientDrawable(c5275a.a()));
                D6.f(hVar.f79098c, 0, D6.i(10, context), 0, 0, 13);
            } else {
                view3.setBackground(null);
                D6.f(hVar.f79098c, 0, 0, 0, 0, 13);
                view2.setVisibility(8);
                view.setVisibility(8);
            }
        }
        SafeDeal.TooltipData tooltipData = combinedButtonsItem.f79069e;
        if (tooltipData == null || (iVar = hVar.f79099d) == null) {
            return;
        }
        iVar.b(combinedButtonsItem.f79066b, tooltipData, this.f79087b);
    }
}
