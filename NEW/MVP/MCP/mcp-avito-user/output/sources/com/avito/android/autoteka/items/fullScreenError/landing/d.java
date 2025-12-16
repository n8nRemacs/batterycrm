package com.avito.android.autoteka.items.fullScreenError.landing;

import Ff.InterfaceC13798a;
import Lf.InterfaceC14387a;
import Y41.l;
import Y61.k;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: LandingErrorPresenterImpl.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/autoteka/items/fullScreenError/landing/d;", "LTV0/d;", "LFf/a;", "Lcom/avito/android/autoteka/items/fullScreenError/landing/LandingErrorItem;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class d implements TV0.d<InterfaceC13798a, LandingErrorItem> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<InterfaceC14387a, G0> f96775b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public d(@k l<? super InterfaceC14387a, G0> lVar) {
        this.f96775b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        InterfaceC13798a interfaceC13798a = (InterfaceC13798a) eVar;
        LandingErrorItem landingErrorItem = (LandingErrorItem) aVar;
        interfaceC13798a.Y2(landingErrorItem.f96768d);
        interfaceC13798a.p1(landingErrorItem.f96767c);
        interfaceC13798a.Zh(Integer.valueOf(R.drawable.img_cog));
        interfaceC13798a.l4(landingErrorItem.f96769e, new c(this));
    }
}
