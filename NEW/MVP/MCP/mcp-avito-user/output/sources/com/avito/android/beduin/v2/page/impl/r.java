package com.avito.android.beduin.v2.page.impl;

import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.C29270c0;
import com.avito.android.ui.fragments.BaseFragment;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: BeduinV2PageFragmentFactoryImpl.kt */
@P
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/v2/page/impl/r;", "Lcom/avito/android/beduin/v2/page/n;", "_design-modules_beduin-v2-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class r implements com.avito.android.beduin.v2.page.n {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C29270c0 f105143a;

    @Inject
    public r(@Y61.k C29270c0 c29270c0) {
        this.f105143a = c29270c0;
    }

    @Override // com.avito.android.beduin.v2.page.n
    @Y61.k
    public final BaseFragment create() {
        C29270c0 c29270c0 = this.f105143a;
        kotlin.reflect.n<Object> nVar = C29270c0.f113263t[14];
        ((Boolean) c29270c0.f113278p.a().invoke()).booleanValue();
        BeduinV2PageFragment.f104859L0.getClass();
        BeduinV2PageFragment beduinV2PageFragment = new BeduinV2PageFragment();
        Bundle bundle = new Bundle();
        bundle.putString("pagePath", "/api/1/services-requests/requests/list");
        bundle.putString("screenName", "servicesOrders");
        bundle.putBoolean("scrollOnKeyboardShown", false);
        beduinV2PageFragment.setArguments(bundle);
        return beduinV2PageFragment;
    }
}
