package com.avito.android.tariff_lf_publication.level.mvi;

import UD0.c;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.tariff_lf_publication.level.mvi.entity.TariffLfPublicationLevelInternalAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import wZ.C49580d;

/* compiled from: TariffLfPublicationLevelReducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/tariff_lf_publication/level/mvi/l;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/tariff_lf_publication/level/mvi/entity/TariffLfPublicationLevelInternalAction;", "LUD0/c;", "<init>", "()V", "_avito_tariff-lf-publication_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class l implements u<TariffLfPublicationLevelInternalAction, UD0.c> {
    @Inject
    public l() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final UD0.c a(TariffLfPublicationLevelInternalAction tariffLfPublicationLevelInternalAction, UD0.c cVar) {
        String strA;
        String iconName;
        Iterator it;
        DeepLink uri;
        String iconName2;
        TariffLfPublicationLevelInternalAction tariffLfPublicationLevelInternalAction2 = tariffLfPublicationLevelInternalAction;
        UD0.c cVar2 = cVar;
        if (tariffLfPublicationLevelInternalAction2 instanceof TariffLfPublicationLevelInternalAction.Loading) {
            return UD0.c.a(cVar2, null, null, true, false, 159);
        }
        int i12 = 10;
        if (!(tariffLfPublicationLevelInternalAction2 instanceof TariffLfPublicationLevelInternalAction.Content)) {
            if (tariffLfPublicationLevelInternalAction2 instanceof TariffLfPublicationLevelInternalAction.Error) {
                return UD0.c.a(cVar2, null, ((TariffLfPublicationLevelInternalAction.Error) tariffLfPublicationLevelInternalAction2).f300928b, false, false, 31);
            }
            if (!(tariffLfPublicationLevelInternalAction2 instanceof TariffLfPublicationLevelInternalAction.LevelClicked)) {
                return tariffLfPublicationLevelInternalAction2 instanceof TariffLfPublicationLevelInternalAction.DeepLinkLoading ? UD0.c.a(cVar2, null, null, false, ((TariffLfPublicationLevelInternalAction.DeepLinkLoading) tariffLfPublicationLevelInternalAction2).f300927b, 127) : cVar2;
            }
            List<c.b> list = cVar2.f16280d;
            ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
            for (c.b bVar : list) {
                long j12 = bVar.f16288d;
                arrayList.add(new c.b(bVar.f16286b, j12 == ((TariffLfPublicationLevelInternalAction.LevelClicked) tariffLfPublicationLevelInternalAction2).f300932b, j12, bVar.f16289e, bVar.f16290f, bVar.f16291g));
            }
            return UD0.c.a(cVar2, arrayList, null, false, false, 251);
        }
        RD0.a aVar = ((TariffLfPublicationLevelInternalAction.Content) tariffLfPublicationLevelInternalAction2).f300926b;
        String title = aVar.getTitle();
        AttributedText description = aVar.getDescription();
        List<RD0.f> listC = aVar.c();
        ArrayList arrayList2 = new ArrayList(C42745f0.q(listC, 10));
        Iterator it2 = listC.iterator();
        while (it2.hasNext()) {
            RD0.f fVar = (RD0.f) it2.next();
            long id2 = fVar.getId();
            String title2 = fVar.getTitle();
            boolean isSelected = fVar.getIsSelected();
            List<RD0.c> listA = fVar.a();
            ArrayList arrayList3 = new ArrayList(C42745f0.q(listA, i12));
            for (RD0.c cVar3 : listA) {
                String title3 = cVar3.getTitle();
                String iconName3 = cVar3.getIconName();
                com.akita.compose.theme.re23.g.f65049a.getClass();
                String strA2 = com.akita.compose.theme.re23.g.a(iconName3);
                RD0.d hint = cVar3.getHint();
                String strA3 = (hint == null || (iconName2 = hint.getIconName()) == null) ? null : com.akita.compose.theme.re23.g.a(iconName2);
                RD0.d hint2 = cVar3.getHint();
                if (hint2 != null) {
                    uri = hint2.getUri();
                    it = it2;
                } else {
                    it = it2;
                    uri = null;
                }
                arrayList3.add(new c.b.a(title3, strA2, strA3, uri));
                it2 = it;
            }
            Iterator it3 = it2;
            String price = fVar.getLevelInfo().getPrice();
            String bonuses = fVar.getLevelInfo().getBonuses();
            RD0.d hint3 = fVar.getLevelInfo().getHint();
            if (hint3 == null || (iconName = hint3.getIconName()) == null) {
                strA = null;
            } else {
                com.akita.compose.theme.re23.g.f65049a.getClass();
                strA = com.akita.compose.theme.re23.g.a(iconName);
            }
            RD0.d hint4 = fVar.getLevelInfo().getHint();
            arrayList2.add(new c.b(title2, isSelected, id2, arrayList3, new c.b.C1110b(price, bonuses, hint4 != null ? hint4.getUri() : null, strA, fVar.getLevelInfo().getDescription()), new c.b.C1111c(fVar.getPriceInfo().getPrice(), fVar.getPriceInfo().getOldPrice())));
            it2 = it3;
            i12 = 10;
        }
        return new UD0.c(title, description, arrayList2, aVar.getTotalInfoTitle(), new C49580d(aVar.getButton().getTitle(), aVar.getButton().getUri(), aVar.getButton().getIsEnabled()), null, false, false);
    }
}
