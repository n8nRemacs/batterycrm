package com.avito.android.beduin.ui.screen.fragment.bottom_sheet_w_tabs;

import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.analytics.provider.clickstream.ParcelableClickStreamEvent;
import com.avito.android.beduin.common.analytics.BeduinParametrizedClickStreamEvent;
import com.avito.android.beduin.ui.screen.fragment.bottom_sheet_w_tabs.BottomSheetWithTabsScreenFragment;
import com.avito.android.beduin.ui.screen.model.BeduinTabLayout;
import com.avito.android.remote.model.Image;
import com.avito.android.util.C35966w1;
import gF.InterfaceC40577a;
import iF.InterfaceC41277a;
import iF.InterfaceC41278b;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;
import pi.C47093d;
import qi.C47400a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class a implements InterfaceC41277a, InterfaceC41278b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BottomSheetWithTabsScreenFragment f104229b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C47093d f104230c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ BeduinTabLayout f104231d;

    public /* synthetic */ a(BottomSheetWithTabsScreenFragment bottomSheetWithTabsScreenFragment, C47093d c47093d, BeduinTabLayout beduinTabLayout) {
        this.f104229b = bottomSheetWithTabsScreenFragment;
        this.f104230c = c47093d;
        this.f104231d = beduinTabLayout;
    }

    @Override // iF.InterfaceC41278b
    public void c() {
        BottomSheetWithTabsScreenFragment bottomSheetWithTabsScreenFragment = this.f104229b;
        com.avito.android.beduin.domain.screen.analytics.a aVar = bottomSheetWithTabsScreenFragment.f104218N0;
        if (aVar == null) {
            aVar = null;
        }
        C47400a imageEvent = this.f104230c.getImageEvent();
        String str = this.f104231d.f104411c.get(bottomSheetWithTabsScreenFragment.A5().getCurrentItem()).f443469a;
        aVar.getClass();
        if (imageEvent == null) {
            return;
        }
        Map<String, String> mapC = imageEvent.c();
        if (mapC == null) {
            mapC = P0.c();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(mapC);
        linkedHashMap.put("from_block", "0");
        linkedHashMap.put("from_page", str);
        linkedHashMap.put("action_type", "scroll");
        aVar.f104005a.c(L.f(imageEvent.getHasSensitiveData(), Boolean.TRUE) ? new BeduinParametrizedClickStreamEvent(imageEvent.getId(), imageEvent.getVersion(), linkedHashMap) : new ParametrizedClickStreamEvent(imageEvent.getId(), imageEvent.getVersion(), linkedHashMap, null, 8, null));
    }

    @Override // iF.InterfaceC41277a
    public void d(int i12) {
        BottomSheetWithTabsScreenFragment.a aVar = BottomSheetWithTabsScreenFragment.f104203P0;
        BottomSheetWithTabsScreenFragment bottomSheetWithTabsScreenFragment = this.f104229b;
        String str = this.f104231d.f104411c.get(bottomSheetWithTabsScreenFragment.A5().getCurrentItem()).f443469a;
        com.avito.android.beduin.domain.screen.analytics.a aVar2 = bottomSheetWithTabsScreenFragment.f104218N0;
        ParcelableClickStreamEvent beduinParametrizedClickStreamEvent = null;
        if (aVar2 == null) {
            aVar2 = null;
        }
        C47093d c47093d = this.f104230c;
        C47400a imageEvent = c47093d.getImageEvent();
        aVar2.getClass();
        if (imageEvent != null) {
            Map<String, String> mapC = imageEvent.c();
            if (mapC == null) {
                mapC = P0.c();
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(mapC);
            linkedHashMap.put("from_block", "0");
            linkedHashMap.put("from_page", str);
            linkedHashMap.put("action_type", "open");
            aVar2.f104005a.c(L.f(imageEvent.getHasSensitiveData(), Boolean.TRUE) ? new BeduinParametrizedClickStreamEvent(imageEvent.getId(), imageEvent.getVersion(), linkedHashMap) : new ParametrizedClickStreamEvent(imageEvent.getId(), imageEvent.getVersion(), linkedHashMap, null, 8, null));
        }
        InterfaceC40577a interfaceC40577a = bottomSheetWithTabsScreenFragment.f104120o0;
        if (interfaceC40577a == null) {
            interfaceC40577a = null;
        }
        List<Image> listB = c47093d.b();
        com.avito.android.beduin.domain.screen.analytics.a aVar3 = bottomSheetWithTabsScreenFragment.f104218N0;
        if (aVar3 == null) {
            aVar3 = null;
        }
        C47400a imageEvent2 = c47093d.getImageEvent();
        aVar3.getClass();
        if (imageEvent2 != null) {
            Map<String, String> mapC2 = imageEvent2.c();
            if (mapC2 == null) {
                mapC2 = P0.c();
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(mapC2);
            linkedHashMap2.put("from_block", "1");
            linkedHashMap2.put("from_page", str);
            linkedHashMap2.put("action_type", "scroll");
            beduinParametrizedClickStreamEvent = L.f(imageEvent2.getHasSensitiveData(), Boolean.TRUE) ? new BeduinParametrizedClickStreamEvent(imageEvent2.getId(), imageEvent2.getVersion(), linkedHashMap2) : new ParametrizedClickStreamEvent(imageEvent2.getId(), imageEvent2.getVersion(), linkedHashMap2, null, 8, null);
        }
        C35966w1.d(bottomSheetWithTabsScreenFragment, interfaceC40577a.b(listB, i12, beduinParametrizedClickStreamEvent), 1);
    }

    public /* synthetic */ a(BeduinTabLayout beduinTabLayout, BottomSheetWithTabsScreenFragment bottomSheetWithTabsScreenFragment, C47093d c47093d) {
        this.f104231d = beduinTabLayout;
        this.f104229b = bottomSheetWithTabsScreenFragment;
        this.f104230c = c47093d;
    }
}
