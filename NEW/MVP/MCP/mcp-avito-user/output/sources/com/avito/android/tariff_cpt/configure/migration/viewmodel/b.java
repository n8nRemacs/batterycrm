package com.avito.android.tariff_cpt.configure.migration.viewmodel;

import androidx.compose.runtime.internal.P;
import com.avito.android.lib.util.q;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import sC0.C48030a;

/* compiled from: CptMigrationConverter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/tariff_cpt/configure/migration/viewmodel/b;", "Lcom/avito/android/tariff_cpt/configure/migration/viewmodel/a;", "<init>", "()V", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b implements a {
    @Inject
    public b() {
    }

    @Override // com.avito.android.tariff_cpt.configure.migration.viewmodel.a
    @Y61.k
    public final C48030a a(@Y61.k KC0.e eVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new com.avito.android.tariff_cpt.common.item.screen_title.a(eVar.getTitle()));
        List<KC0.l> listB = eVar.b();
        ArrayList arrayList2 = new ArrayList(C42745f0.q(listB, 10));
        int i12 = 0;
        for (Object obj : listB) {
            int i13 = i12 + 1;
            UniversalColor color = null;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            KC0.l lVar = (KC0.l) obj;
            String strG = AK.c.g(i12, "cpt_migration_term_");
            AttributedText title = lVar.getTitle();
            AttributedText subtitle = lVar.getSubtitle();
            KC0.b coloredIcon = lVar.getColoredIcon();
            String name = coloredIcon != null ? coloredIcon.getName() : null;
            Integer numA = name != null ? q.a(name) : null;
            KC0.b coloredIcon2 = lVar.getColoredIcon();
            if (coloredIcon2 != null) {
                color = coloredIcon2.getColor();
            }
            arrayList2.add(new com.avito.android.tariff_cpt.configure.migration.item.terms.a(strG, title, subtitle, numA, color, lVar.getTextIcon()));
            i12 = i13;
        }
        arrayList.addAll(arrayList2);
        arrayList.add(new com.avito.android.tariff_cpt.common.item.button.a("cpt_migration_button", eVar.getButton().getTitle(), eVar.getButton().getDeeplink(), eVar.getLegalInfo(), false, 16, null));
        return new C48030a(arrayList);
    }
}
