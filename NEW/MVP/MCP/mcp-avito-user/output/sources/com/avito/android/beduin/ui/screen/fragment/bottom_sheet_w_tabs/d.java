package com.avito.android.beduin.ui.screen.fragment.bottom_sheet_w_tabs;

import androidx.viewpager.widget.ViewPager;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.beduin.common.analytics.BeduinParametrizedClickStreamEvent;
import com.avito.android.beduin.ui.screen.fragment.bottom_sheet_w_tabs.BottomSheetWithTabsScreenFragment;
import com.avito.android.beduin.ui.screen.model.BeduinTabLayout;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;
import qi.C47400a;
import yi.C50254a;

/* compiled from: BottomSheetWithTabsScreenFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/ui/screen/fragment/bottom_sheet_w_tabs/d;", "Landroidx/viewpager/widget/ViewPager$l;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class d extends ViewPager.l {

    /* renamed from: b, reason: collision with root package name */
    public int f104235b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BeduinTabLayout f104236c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ BottomSheetWithTabsScreenFragment f104237d;

    public d(BottomSheetWithTabsScreenFragment bottomSheetWithTabsScreenFragment, BeduinTabLayout beduinTabLayout) {
        this.f104236c = beduinTabLayout;
        this.f104237d = bottomSheetWithTabsScreenFragment;
        this.f104235b = beduinTabLayout.f104409a;
    }

    @Override // androidx.viewpager.widget.ViewPager.l, androidx.viewpager.widget.ViewPager.i
    public final void b(int i12) {
        int i13 = this.f104235b;
        if (i13 != i12) {
            BeduinTabLayout beduinTabLayout = this.f104236c;
            C50254a c50254a = beduinTabLayout.f104411c.get(i13);
            C50254a c50254a2 = beduinTabLayout.f104411c.get(i12);
            BottomSheetWithTabsScreenFragment.a aVar = BottomSheetWithTabsScreenFragment.f104203P0;
            BottomSheetWithTabsScreenFragment bottomSheetWithTabsScreenFragment = this.f104237d;
            bottomSheetWithTabsScreenFragment.getClass();
            C47400a c47400a = c50254a2.f443474f;
            if (c47400a != null) {
                com.avito.android.beduin.domain.screen.analytics.a aVar2 = bottomSheetWithTabsScreenFragment.f104218N0;
                if (aVar2 == null) {
                    aVar2 = null;
                }
                String str = c50254a.f443469a;
                aVar2.getClass();
                Map<String, String> mapC = c47400a.c();
                if (mapC == null) {
                    mapC = P0.c();
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(mapC);
                linkedHashMap.put("from_page", str);
                aVar2.f104005a.c(L.f(c47400a.getHasSensitiveData(), Boolean.TRUE) ? new BeduinParametrizedClickStreamEvent(c47400a.getId(), c47400a.getVersion(), linkedHashMap) : new ParametrizedClickStreamEvent(c47400a.getId(), c47400a.getVersion(), linkedHashMap, null, 8, null));
            }
            this.f104235b = i12;
        }
    }
}
