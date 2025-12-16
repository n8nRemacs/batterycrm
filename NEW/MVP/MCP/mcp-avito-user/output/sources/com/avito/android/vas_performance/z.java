package com.avito.android.vas_performance;

import Zx.C19616a;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.Fragment;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.vas_performance.deeplink.StickersEditVasLink;
import com.avito.android.vas_performance.screens.stickers.edit.ui.StickersEditFragment;
import com.avito.android.vas_performance.ui.stickers.edit.StickersEditVasFragment;
import kotlin.Metadata;

/* compiled from: StickersEditVasFragmentFactory.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/vas_performance/z;", "LA50/b;", "Lcom/avito/android/vas_performance/deeplink/StickersEditVasLink;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class z implements A50.b<StickersEditVasLink> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C19616a f322178a;

    public z(@Y61.k C19616a c19616a) {
        this.f322178a = c19616a;
    }

    @Override // A50.b
    public final Fragment a(DeepLink deepLink) {
        StickersEditVasLink stickersEditVasLink = (StickersEditVasLink) deepLink;
        C19616a c19616a = this.f322178a;
        c19616a.getClass();
        kotlin.reflect.n<Object> nVar = C19616a.f20576q[9];
        boolean zBooleanValue = ((Boolean) c19616a.f20586k.a().invoke()).booleanValue();
        boolean z12 = stickersEditVasLink.f319871c;
        String str = stickersEditVasLink.f319870b;
        if (zBooleanValue) {
            StickersEditFragment.f320827s0.getClass();
            Bundle bundle = new Bundle();
            bundle.putBoolean("closable", z12);
            bundle.putString("item_id", str);
            StickersEditFragment stickersEditFragment = new StickersEditFragment();
            stickersEditFragment.setArguments(bundle);
            return stickersEditFragment;
        }
        StickersEditVasFragment.f322004B0.getClass();
        Bundle bundle2 = new Bundle();
        bundle2.putString("item_id", str);
        bundle2.putBoolean("closable", z12);
        StickersEditVasFragment stickersEditVasFragment = new StickersEditVasFragment();
        stickersEditVasFragment.setArguments(bundle2);
        return stickersEditVasFragment;
    }
}
