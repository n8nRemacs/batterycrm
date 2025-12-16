package com.avito.android.tariff.cpx.configure.landing.items.accordions_card;

import Y41.l;
import Y61.k;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.w;
import com.avito.android.tariff.cpx.configure.landing.di.m;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: CpxConfigureLandingAccordionsCardItemPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/cpx/configure/landing/items/accordions_card/f;", "Lcom/avito/android/tariff/cpx/configure/landing/items/accordions_card/d;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class f implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f295952b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final l<String, G0> f295953c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final l<DeepLink, G0> f295954d;

    /* compiled from: CpxConfigureLandingAccordionsCardItemPresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements w, D {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l f295955b;

        public a(l lVar) {
            this.f295955b = lVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if ((obj instanceof w) && (obj instanceof D)) {
                return L.f(this.f295955b, ((D) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.D
        @k
        public final InterfaceC43072x<?> getFunctionDelegate() {
            return this.f295955b;
        }

        public final int hashCode() {
            return this.f295955b.hashCode();
        }

        @Override // com.avito.android.deep_linking.links.w
        public final /* synthetic */ void i7(DeepLink deepLink) {
            this.f295955b.invoke(deepLink);
        }
    }

    @Inject
    public f(@m @k l lVar, @k @YA0.b l lVar2, @k com.avito.android.util.text.a aVar) {
        this.f295952b = aVar;
        this.f295953c = lVar;
        this.f295954d = lVar2;
    }

    @Override // TV0.d
    public final /* bridge */ /* synthetic */ void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k((h) eVar, (com.avito.android.tariff.cpx.configure.landing.items.accordions_card.a) aVar);
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        h hVar = (h) eVar;
        com.avito.android.tariff.cpx.configure.landing.items.accordions_card.a aVar2 = (com.avito.android.tariff.cpx.configure.landing.items.accordions_card.a) aVar;
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof Bundle) {
                obj = obj2;
            }
        }
        Bundle bundle = (Bundle) (obj instanceof Bundle ? obj : null);
        if (bundle == null) {
            k(hVar, aVar2);
            return;
        }
        String string = bundle.getString("payload_cpx_configure_landing_accordion_tag_id");
        if (string != null) {
            hVar.hj(string);
        }
    }

    public final void k(@k h hVar, @k com.avito.android.tariff.cpx.configure.landing.items.accordions_card.a aVar) {
        hVar.e(aVar.f295946c);
        e eVar = new e(1, this.f295953c, l.class, "invoke", "invoke(Ljava/lang/Object;)Ljava/lang/Object;", 0);
        com.avito.android.util.text.a aVar2 = this.f295952b;
        List<CpxConfigureLandingAccordionItem> list = aVar.f295947d;
        hVar.ZF(aVar2, list, eVar);
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ((CpxConfigureLandingAccordionItem) it.next()).f295943d.setOnDeepLinkClickListener(new a(this.f295954d));
        }
    }
}
