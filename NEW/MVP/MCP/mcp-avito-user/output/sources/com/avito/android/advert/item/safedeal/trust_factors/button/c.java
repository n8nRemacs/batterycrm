package com.avito.android.advert.item.safedeal.trust_factors.button;

import Ca1.ViewOnClickListenerC13236c;
import Y61.k;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert.item.safedeal.InterfaceC28173a;
import com.avito.android.advert.item.safedeal.trust_factors.i;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.deprecated_design.f;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.util.q;
import com.avito.android.remote.model.ParametrizedEvent;
import com.avito.android.remote.safedeal.SafeDeal;
import com.avito.android.util.C35835l0;
import com.avito.android.util.Y4;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: TrustFactorsButtonPresenter.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/safedeal/trust_factors/button/c;", "LTV0/d;", "Lcom/avito/android/advert/item/safedeal/trust_factors/button/e;", "Lcom/avito/android/advert/item/safedeal/trust_factors/button/TrustFactorsButtonItem;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class c implements TV0.d<e, TrustFactorsButtonItem> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.advert.item.safedeal.trust_factors.d f79055b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.advert_core.analytics.a f79056c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final InterfaceC28173a f79057d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f79058e;

    @Inject
    public c(@k com.avito.android.advert.item.safedeal.trust_factors.d dVar, @k com.avito.android.advert_core.analytics.a aVar, @k InterfaceC28173a interfaceC28173a) {
        this.f79055b = dVar;
        this.f79056c = aVar;
        this.f79057d = interfaceC28173a;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) throws Resources.NotFoundException {
        i iVar;
        Integer numA;
        e eVar2 = (e) eVar;
        TrustFactorsButtonItem trustFactorsButtonItem = (TrustFactorsButtonItem) aVar;
        SafeDeal.Component.Button button = trustFactorsButtonItem.f79046c.f84257b;
        String theme = button.getTheme();
        String style = button.getStyle();
        Context context = eVar2.f79064d;
        Context contextA = f.a(context, theme);
        Y4.f318784a.getClass();
        int iJ2 = C35835l0.j(Y4.a(style), contextA);
        Button button2 = eVar2.f79062b;
        button2.setAppearance(iJ2);
        button2.setText(button.getTitle());
        String secondaryText = button.getSecondaryText();
        if (secondaryText == null) {
            secondaryText = "";
        }
        button2.setSubtitle(secondaryText);
        Boolean isLoading = button.getIsLoading();
        button2.setLoading(isLoading != null ? isLoading.booleanValue() : false);
        button2.setEnabled(button.getDeepLink() != null);
        DeepLink deepLink = button.getDeepLink();
        Drawable drawableH = null;
        button2.setOnClickListener(deepLink != null ? new ViewOnClickListenerC13236c(this, deepLink, button, 6) : null);
        String iconName = button.getIconName();
        if (iconName != null && (numA = q.a(iconName)) != null) {
            drawableH = C35835l0.h(numA.intValue(), context);
        }
        Button.g(eVar2.f79062b, drawableH, null, false, null, 14);
        ParametrizedEvent showEvent = button.getShowEvent();
        if (showEvent != null && !this.f79058e && this.f79057d.f() == null) {
            this.f79056c.O(showEvent);
            this.f79058e = true;
        }
        SafeDeal.TooltipData tooltipData = trustFactorsButtonItem.f79048e;
        if (tooltipData == null || (iVar = eVar2.f79063c) == null) {
            return;
        }
        iVar.b(trustFactorsButtonItem.f79045b, tooltipData, this.f79055b);
    }
}
