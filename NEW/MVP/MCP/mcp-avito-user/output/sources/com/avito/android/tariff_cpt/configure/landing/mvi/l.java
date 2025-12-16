package com.avito.android.tariff_cpt.configure.landing.mvi;

import KC0.d;
import androidx.compose.runtime.internal.P;
import com.akita.compose.foundation.p;
import com.avito.android.arch.mvi.u;
import com.avito.android.lib.util.q;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.tariff_cpt.configure.landing.mvi.entity.TariffCptConfigureLandingInternalAction;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import oC0.C44625c;

/* compiled from: TariffCptConfigureLandingReducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/tariff_cpt/configure/landing/mvi/l;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/tariff_cpt/configure/landing/mvi/entity/TariffCptConfigureLandingInternalAction;", "LoC0/c;", "<init>", "()V", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class l implements u<TariffCptConfigureLandingInternalAction, C44625c> {
    @Inject
    public l() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final C44625c a(TariffCptConfigureLandingInternalAction tariffCptConfigureLandingInternalAction, C44625c c44625c) {
        p pVarA;
        TariffCptConfigureLandingInternalAction tariffCptConfigureLandingInternalAction2 = tariffCptConfigureLandingInternalAction;
        C44625c c44625c2 = c44625c;
        if (tariffCptConfigureLandingInternalAction2 instanceof TariffCptConfigureLandingInternalAction.Loading) {
            return C44625c.a(c44625c2, null, null, null, null, null, null, false, null, true, 127);
        }
        if (!(tariffCptConfigureLandingInternalAction2 instanceof TariffCptConfigureLandingInternalAction.Content)) {
            return tariffCptConfigureLandingInternalAction2 instanceof TariffCptConfigureLandingInternalAction.Error ? C44625c.a(c44625c2, null, null, null, null, null, null, false, ((TariffCptConfigureLandingInternalAction.Error) tariffCptConfigureLandingInternalAction2).f297777b, false, 127) : tariffCptConfigureLandingInternalAction2 instanceof TariffCptConfigureLandingInternalAction.ShowButtonProgress ? C44625c.a(c44625c2, null, null, null, null, null, null, ((TariffCptConfigureLandingInternalAction.ShowButtonProgress) tariffCptConfigureLandingInternalAction2).f297781b, null, false, 447) : c44625c2;
        }
        d.b bVar = ((TariffCptConfigureLandingInternalAction.Content) tariffCptConfigureLandingInternalAction2).f297776b;
        String title = bVar.getTitle();
        List<KC0.g> listB = bVar.b();
        ArrayList arrayList = new ArrayList(C42745f0.q(listB, 10));
        for (KC0.g gVar : listB) {
            AttributedText title2 = gVar.getTitle();
            AttributedText subtitle = gVar.getSubtitle();
            UniversalImage image = gVar.getImage();
            Image image2 = image.getImage();
            arrayList.add(new C44625c.b(title2, subtitle, image2 != null ? new iC0.f(image2, image.getImageDark()) : null));
        }
        String termsTitle = bVar.getTermsTitle();
        List<KC0.h> listD = bVar.d();
        ArrayList arrayList2 = new ArrayList(C42745f0.q(listD, 10));
        for (KC0.h hVar : listD) {
            AttributedText title3 = hVar.getTitle();
            Integer numA = q.a(hVar.getColoredIcon().getName());
            UniversalColor color = hVar.getColoredIcon().getColor();
            if (color == null || (pVarA = HU.a.a(color)) == null) {
                com.akita.compose.theme.re23.b.f63983a.getClass();
                pVarA = com.akita.compose.theme.re23.b.f63984b.f63938l;
            }
            arrayList2.add(new C44625c.C12178c(title3, numA, pVarA));
        }
        return C44625c.a(c44625c2, title, arrayList, termsTitle, arrayList2, bVar.getButton(), bVar.getLegalInfo(), false, null, false, 64);
    }
}
