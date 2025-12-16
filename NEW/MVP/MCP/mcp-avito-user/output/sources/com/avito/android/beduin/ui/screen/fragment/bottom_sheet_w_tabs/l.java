package com.avito.android.beduin.ui.screen.fragment.bottom_sheet_w_tabs;

import com.avito.android.beduin.network.model.screen.BottomSheetWithTabsScreenModel;
import com.avito.android.beduin.ui.screen.model.BeduinTabLayout;
import com.avito.android.beduin_models.BeduinForm;
import gj.InterfaceC40691b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import lj.InterfaceC43779a;
import lj.d;
import pi.C47093d;
import qi.C47400a;
import qi.C47402c;
import qi.InterfaceC47401b;
import yi.C50254a;

/* compiled from: BottomSheetWithTabsToStateMapper.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/ui/screen/fragment/bottom_sheet_w_tabs/l;", "Lcom/avito/android/beduin/ui/screen/fragment/j;", "Lcom/avito/android/beduin/network/model/screen/BottomSheetWithTabsScreenModel;", "Lcom/avito/android/beduin/ui/screen/fragment/bottom_sheet_w_tabs/i;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class l implements com.avito.android.beduin.ui.screen.fragment.j<BottomSheetWithTabsScreenModel, i> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC40691b f104247a;

    @Inject
    public l(@Y61.k InterfaceC40691b interfaceC40691b) {
        this.f104247a = interfaceC40691b;
    }

    @Override // com.avito.android.beduin.ui.screen.fragment.j
    public final com.avito.android.beduin.ui.screen.fragment.i a(InterfaceC47401b interfaceC47401b) {
        BeduinTabLayout.Style styleValueOf;
        C47402c c47402c;
        C47400a c47400a;
        l lVar = this;
        BottomSheetWithTabsScreenModel bottomSheetWithTabsScreenModel = (BottomSheetWithTabsScreenModel) interfaceC47401b;
        pi.e navBar = bottomSheetWithTabsScreenModel.getNavBar();
        C47093d gallery = bottomSheetWithTabsScreenModel.getGallery();
        C47402c tabLayout = bottomSheetWithTabsScreenModel.getBottomSheet().getTabLayout();
        Iterator<C47402c.a> it = tabLayout.d().iterator();
        int i12 = 0;
        while (true) {
            if (!it.hasNext()) {
                i12 = -1;
                break;
            }
            if (L.f(it.next().getId(), tabLayout.getSelectedTabId())) {
                break;
            }
            i12++;
        }
        int i13 = i12 >= 0 ? i12 : 0;
        String style = tabLayout.getStyle();
        if (style == null || (styleValueOf = BeduinTabLayout.Style.valueOf(style.toUpperCase(Locale.ROOT))) == null) {
            styleValueOf = BeduinTabLayout.Style.f104412b;
        }
        List<C47402c.a> listD = tabLayout.d();
        ArrayList arrayList = new ArrayList(C42745f0.q(listD, 10));
        for (C47402c.a aVar : listD) {
            C47400a onSelectTabEvent = tabLayout.getOnSelectTabEvent();
            String id2 = aVar.getId();
            String title = aVar.getTitle();
            String strB = lVar.b(aVar.getTopForm());
            String strB2 = lVar.b(aVar.getMainForm());
            String strB3 = lVar.b(aVar.getBottomForm());
            if (onSelectTabEvent != null) {
                String id3 = aVar.getId();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Map<String, String> mapC = onSelectTabEvent.c();
                if (mapC == null) {
                    mapC = P0.c();
                }
                linkedHashMap.putAll(mapC);
                linkedHashMap.put("target_page", id3);
                c47402c = tabLayout;
                c47400a = new C47400a(onSelectTabEvent.getId(), onSelectTabEvent.getVersion(), linkedHashMap, onSelectTabEvent.getHasSensitiveData());
            } else {
                c47402c = tabLayout;
                c47400a = null;
            }
            arrayList.add(new C50254a(id2, title, strB, strB2, strB3, c47400a));
            lVar = this;
            tabLayout = c47402c;
        }
        return new i(navBar, gallery, new BeduinTabLayout(i13, styleValueOf, arrayList), bottomSheetWithTabsScreenModel.getExtraContent());
    }

    public final String b(BeduinForm beduinForm) {
        if (beduinForm == null) {
            return null;
        }
        InterfaceC43779a interfaceC43779aJ = this.f104247a.j();
        interfaceC43779aJ.h(new d.k(beduinForm.getComponents(), beduinForm.getF105312b()));
        return interfaceC43779aJ.getF103350r();
    }
}
