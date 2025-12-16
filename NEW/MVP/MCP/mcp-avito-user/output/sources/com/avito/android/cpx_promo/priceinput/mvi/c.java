package com.avito.android.cpx_promo.priceinput.mvi;

import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.cpx_promo.analytics.clickstream.events.ClickStreamCpxPromoEvent;
import com.avito.android.cpx_promo.priceinput.CpxPromoPriceInputContent;
import com.avito.android.cpx_promo.priceinput.mvi.entity.CpxPromoPriceInputInternalAction;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: CpxPromoPriceInputBootstrap.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/cpx_promo/priceinput/mvi/c;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/cpx_promo/priceinput/mvi/entity/CpxPromoPriceInputInternalAction;", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class c implements com.avito.android.arch.mvi.b<CpxPromoPriceInputInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final CpxPromoPriceInputContent f127325a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f127326b;

    @Inject
    public c(@Y61.k CpxPromoPriceInputContent cpxPromoPriceInputContent, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f127325a = cpxPromoPriceInputContent;
        this.f127326b = interfaceC28373a;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<CpxPromoPriceInputInternalAction> a() {
        CpxPromoPriceInputContent cpxPromoPriceInputContent = this.f127325a;
        CpxPromoPriceInputContent.DisplayingEventParams displayingEventParams = cpxPromoPriceInputContent.f127256f;
        int i12 = displayingEventParams.f127259c;
        String str = displayingEventParams.f127260d;
        this.f127326b.c(new ClickStreamCpxPromoEvent(displayingEventParams.f127258b, i12, str, Boolean.valueOf(displayingEventParams.f127261e), null, 16, null));
        return new C43210w(new CpxPromoPriceInputInternalAction.Content(cpxPromoPriceInputContent));
    }

    @Override // com.avito.android.arch.mvi.b
    @l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
