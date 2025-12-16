package com.avito.android.vas_performance;

import Zx.C19616a;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.Fragment;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.vas_performance.deeplink.StickersBuyVasLink;
import com.avito.android.vas_performance.screens.stickers.buy.StickersBuyFragment;
import com.avito.android.vas_performance.ui.stickers.buy.StickersBuyVasFragment;
import kotlin.Metadata;

/* compiled from: StickersBuyFragmentFactory.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/vas_performance/q;", "LA50/b;", "Lcom/avito/android/vas_performance/deeplink/StickersBuyVasLink;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class q implements A50.b<StickersBuyVasLink> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C19616a f320219a;

    public q(@Y61.k C19616a c19616a) {
        this.f320219a = c19616a;
    }

    @Override // A50.b
    public final Fragment a(DeepLink deepLink) {
        StickersBuyVasLink stickersBuyVasLink = (StickersBuyVasLink) deepLink;
        C19616a c19616a = this.f320219a;
        c19616a.getClass();
        kotlin.reflect.n<Object> nVar = C19616a.f20576q[6];
        boolean zBooleanValue = ((Boolean) c19616a.f20583h.a().invoke()).booleanValue();
        boolean z12 = stickersBuyVasLink.f319868d;
        String str = stickersBuyVasLink.f319869e;
        String str2 = stickersBuyVasLink.f319867c;
        String str3 = stickersBuyVasLink.f319866b;
        if (zBooleanValue) {
            StickersBuyFragment.f320573L0.getClass();
            Bundle bundle = new Bundle();
            bundle.putString("item_id", str3);
            bundle.putString("checkout_context", str2);
            bundle.putString("current_flow", str);
            bundle.putBoolean("closable", z12);
            StickersBuyFragment stickersBuyFragment = new StickersBuyFragment();
            stickersBuyFragment.setArguments(bundle);
            return stickersBuyFragment;
        }
        StickersBuyVasFragment.f321919K0.getClass();
        Bundle bundle2 = new Bundle();
        bundle2.putString("item_id", str3);
        bundle2.putString("checkout_context", str2);
        bundle2.putString("current_flow", str);
        bundle2.putBoolean("closable", z12);
        StickersBuyVasFragment stickersBuyVasFragment = new StickersBuyVasFragment();
        stickersBuyVasFragment.setArguments(bundle2);
        return stickersBuyVasFragment;
    }
}
