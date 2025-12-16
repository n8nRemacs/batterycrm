package com.avito.android.beduin.v2.page.impl;

import android.app.Application;
import android.content.Intent;
import androidx.compose.runtime.internal.P;
import com.avito.android.L;
import com.avito.android.beduin.v2.page.BeduinV2BottomSheetDeepLink;
import com.avito.android.beduin.v2.page.BeduinV2DeepLink;
import com.avito.android.beduin.v2.page.BeduinV2FragmentParams;
import com.avito.android.beduin.v2.page.BeduinV2PageDeepLink;
import com.avito.android.beduin.v2.page.BeduinV2PageModalDeepLink;
import com.avito.android.beduin.v2.page.ForcedTheme;
import com.avito.android.beduin.v2.page.impl.BeduinV2PageActivity;
import com.avito.android.bottom_navigation.NavigationTab;
import com.avito.android.bottom_navigation.NavigationTabSetItem;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: BeduinV2PageIntentFactoryImpl.kt */
@P
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/v2/page/impl/v;", "Lcom/avito/android/beduin/v2/page/o;", "_design-modules_beduin-v2-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class v implements com.avito.android.beduin.v2.page.o {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Application f105145a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final L f105146b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.navigation.a f105147c;

    @Inject
    public v(@Y61.k Application application, @Y61.k L l12, @Y61.k com.avito.android.navigation.a aVar) {
        this.f105145a = application;
        this.f105146b = l12;
        this.f105147c = aVar;
    }

    @Override // com.avito.android.beduin.v2.page.o
    @Y61.k
    public final Intent a(@Y61.k BeduinV2DeepLink beduinV2DeepLink) {
        boolean z12 = beduinV2DeepLink instanceof BeduinV2PageDeepLink;
        L l12 = this.f105146b;
        com.avito.android.navigation.a aVar = this.f105147c;
        Application application = this.f105145a;
        if (z12) {
            BeduinV2PageDeepLink beduinV2PageDeepLink = (BeduinV2PageDeepLink) beduinV2DeepLink;
            if (!beduinV2PageDeepLink.f104786f) {
                BeduinV2PageActivity.f104854p.getClass();
                return BeduinV2PageActivity.a.a(application, beduinV2PageDeepLink, null);
            }
            BeduinV2FragmentParams beduinV2FragmentParams = new BeduinV2FragmentParams(beduinV2PageDeepLink.f104782b, beduinV2PageDeepLink.f104783c, beduinV2PageDeepLink.f104784d, beduinV2PageDeepLink.f104785e, beduinV2PageDeepLink.f104788h, beduinV2PageDeepLink.f104789i, beduinV2PageDeepLink.f104790j);
            NavigationTabSetItem navigationTabSetItemA = aVar.a();
            if (navigationTabSetItemA == null) {
                navigationTabSetItemA = NavigationTab.f106970f;
            }
            return l12.d(new BeduinV2TabFragmentData(beduinV2FragmentParams, navigationTabSetItemA));
        }
        if (!(beduinV2DeepLink instanceof BeduinV2PageModalDeepLink)) {
            if (!(beduinV2DeepLink instanceof BeduinV2BottomSheetDeepLink)) {
                throw new NoWhenBranchMatchedException();
            }
            BeduinV2BottomSheetDeepLink beduinV2BottomSheetDeepLink = (BeduinV2BottomSheetDeepLink) beduinV2DeepLink;
            BeduinV2BottomSheetActivity.f104839n.getClass();
            Intent intentPutExtra = new Intent(application, (Class<?>) BeduinV2BottomSheetActivity.class).putExtra("bottomSheetHeightMode", beduinV2BottomSheetDeepLink.f104762d).putExtra("pagePath", beduinV2BottomSheetDeepLink.f104760b).putExtra("screenName", beduinV2BottomSheetDeepLink.f104761c).putExtra("scrollOnKeyboardShown", beduinV2BottomSheetDeepLink.f104763e).putExtra("bottomSheetContentPaddings", beduinV2BottomSheetDeepLink.f104764f);
            ForcedTheme.f104800c.getClass();
            ForcedTheme forcedThemeA = ForcedTheme.a.a(beduinV2BottomSheetDeepLink.f104765g);
            return intentPutExtra.putExtra("forced_theme", forcedThemeA != null ? forcedThemeA.f104805b : null).putExtra("scenarioParentId", beduinV2BottomSheetDeepLink.f104766h).putExtra("scenarioId", beduinV2BottomSheetDeepLink.f104767i).putExtra("composeRenderer", beduinV2BottomSheetDeepLink.f104768j);
        }
        BeduinV2PageModalDeepLink beduinV2PageModalDeepLink = (BeduinV2PageModalDeepLink) beduinV2DeepLink;
        if (beduinV2PageModalDeepLink.f104795f) {
            BeduinV2FragmentParams beduinV2FragmentParams2 = new BeduinV2FragmentParams(beduinV2PageModalDeepLink.f104791b, beduinV2PageModalDeepLink.f104792c, beduinV2PageModalDeepLink.f104793d, beduinV2PageModalDeepLink.f104794e, beduinV2PageModalDeepLink.f104797h, beduinV2PageModalDeepLink.f104798i, beduinV2PageModalDeepLink.f104799j);
            NavigationTabSetItem navigationTabSetItemA2 = aVar.a();
            if (navigationTabSetItemA2 == null) {
                navigationTabSetItemA2 = NavigationTab.f106970f;
            }
            return l12.d(new BeduinV2TabFragmentData(beduinV2FragmentParams2, navigationTabSetItemA2));
        }
        BeduinV2PageActivity.f104854p.getClass();
        Intent intentPutExtra2 = new Intent(application, (Class<?>) BeduinV2PageActivity.class).putExtra("pagePath", beduinV2PageModalDeepLink.f104791b).putExtra("screenName", beduinV2PageModalDeepLink.f104792c).putExtra("scrollOnKeyboardShown", beduinV2PageModalDeepLink.f104793d).putExtra("ignoreSafeArea", beduinV2PageModalDeepLink.f104794e);
        ForcedTheme.f104800c.getClass();
        ForcedTheme forcedThemeA2 = ForcedTheme.a.a(beduinV2PageModalDeepLink.f104796g);
        return intentPutExtra2.putExtra("forced_theme", forcedThemeA2 != null ? forcedThemeA2.f104805b : null).putExtra("scenarioParentId", beduinV2PageModalDeepLink.f104797h).putExtra("scenarioId", beduinV2PageModalDeepLink.f104798i).putExtra("composeRenderer", beduinV2PageModalDeepLink.f104799j);
    }

    @Override // com.avito.android.beduin.v2.page.o
    @Y61.k
    public final Intent b(@Y61.k BeduinV2PageDeepLink beduinV2PageDeepLink, @Y61.l Class<? extends com.avito.android.beduin.v2.page.e> cls) {
        BeduinV2PageActivity.f104854p.getClass();
        return BeduinV2PageActivity.a.a(this.f105145a, beduinV2PageDeepLink, cls);
    }
}
