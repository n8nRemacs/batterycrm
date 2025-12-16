package com.avito.android.remote.model;

import Y61.k;
import Y61.l;
import android.os.Bundle;
import kotlin.Metadata;
import q50.InterfaceC47203a;

/* compiled from: NavigationBarStyle.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0001*\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0007\"\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroid/os/Bundle;", "Lcom/avito/android/remote/model/NavigationBarStyle;", "navigationBarStyle", "Lkotlin/G0;", "putSerpNavigationBarStyle", "(Landroid/os/Bundle;Lcom/avito/android/remote/model/NavigationBarStyle;)V", "getSerpNavigationBarStyle", "(Landroid/os/Bundle;)Lcom/avito/android/remote/model/NavigationBarStyle;", "", "KEY_SERP_NAVIGATION_BAR_STYLE", "Ljava/lang/String;", "_avito-discouraged_api-models_models"}, k = 2, mv = {1, 9, 0}, xi = 48)
@InterfaceC47203a
/* loaded from: classes17.dex */
public final class NavigationBarStyleKt {

    @k
    private static final String KEY_SERP_NAVIGATION_BAR_STYLE = "SERP_KEY_NAVIGATION_BAR_STYLE";

    @l
    public static final NavigationBarStyle getSerpNavigationBarStyle(@k Bundle bundle) {
        return (NavigationBarStyle) bundle.getParcelable(KEY_SERP_NAVIGATION_BAR_STYLE);
    }

    public static final void putSerpNavigationBarStyle(@k Bundle bundle, @l NavigationBarStyle navigationBarStyle) {
        bundle.putParcelable(KEY_SERP_NAVIGATION_BAR_STYLE, navigationBarStyle != null ? navigationBarStyle.prepareForNextScreen() : null);
    }
}
