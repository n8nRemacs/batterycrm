package com.avito.android.str_calendar.seller.calandar_parameters.items.carousel;

import Gy0.InterfaceC13931a;
import JO.m;
import Y41.l;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.CustomPaddings;
import com.avito.android.remote.model.category_parameters.SelectParameter;
import com.avito.android.remote.model.category_parameters.TipIconParameters;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CarouselSelectItemPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_calendar/seller/calandar_parameters/items/carousel/e;", "LTV0/d;", "Lcom/avito/android/str_calendar/seller/calandar_parameters/items/carousel/g;", "Lcom/avito/android/category_parameters/ParameterElement$C$b;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e implements TV0.d<g, ParameterElement.C.b> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<InterfaceC13931a, G0> f287040b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public e(@k l<? super InterfaceC13931a, G0> lVar) {
        this.f287040b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        DeepLink deepLink;
        CustomPaddings customPaddings;
        g gVar = (g) eVar;
        ParameterElement.C.b bVar = (ParameterElement.C.b) aVar;
        gVar.setTitle(bVar.f117208d);
        gVar.rb(bVar.f117211g);
        gVar.setEnabled(bVar.f117216l);
        TipIconParameters tipIconParameters = bVar.f117222r;
        gVar.iA(tipIconParameters);
        m mVar = bVar.f117212h;
        if (mVar != null) {
            gVar.d6(mVar.f8962c);
        }
        SelectParameter.Displaying displaying = bVar.f117223s;
        if (displaying != null && (customPaddings = displaying.getCustomPaddings()) != null) {
            gVar.k0(customPaddings);
        }
        gVar.a(new c(this, bVar));
        gVar.J7(null);
        if (tipIconParameters == null || (deepLink = tipIconParameters.getDeepLink()) == null) {
            return;
        }
        gVar.J7(new d(this, deepLink));
    }
}
