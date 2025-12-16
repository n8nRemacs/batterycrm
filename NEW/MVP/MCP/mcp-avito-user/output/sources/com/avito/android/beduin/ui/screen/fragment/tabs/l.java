package com.avito.android.beduin.ui.screen.fragment.tabs;

import androidx.view.AbstractC22991Y;
import com.avito.android.beduin.ui.screen.fragment.tabs.model.TabsScreenModel;
import com.avito.android.beduin_models.BeduinAction;
import gj.InterfaceC40691b;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;

/* compiled from: TabsScreenFragment.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
final /* synthetic */ class l extends H implements Y41.l<String, G0> {
    @Override // Y41.l
    public final G0 invoke(String str) {
        TabsScreenModel.b bVarF;
        String str2 = str;
        s sVar = (s) this.receiver;
        AbstractC22991Y abstractC22991Y = sVar.f104253K;
        TabsScreenModel tabsScreenModel = (TabsScreenModel) abstractC22991Y.getValue();
        List<BeduinAction> listE = null;
        if (!str2.equals(tabsScreenModel != null ? tabsScreenModel.g() : null)) {
            com.avito.android.beduin.ui.screen.fragment.i iVar = (com.avito.android.beduin.ui.screen.fragment.i) abstractC22991Y.getValue();
            abstractC22991Y.setValue(iVar != null ? TabsScreenModel.a((TabsScreenModel) iVar, str2) : null);
            InterfaceC40691b interfaceC40691b = sVar.f104364R.f104269d;
            TabsScreenModel tabsScreenModel2 = (TabsScreenModel) abstractC22991Y.getValue();
            if (tabsScreenModel2 != null && (bVarF = tabsScreenModel2.f()) != null) {
                listE = bVarF.e();
            }
            com.avito.android.beduin_shared.model.utils.a.a(interfaceC40691b, listE);
        }
        return G0.f406611a;
    }
}
