package com.avito.android.remote.model;

import Y61.k;
import Y61.l;
import android.os.Bundle;
import com.avito.android.lib.util.darkTheme.ThemeAppearance;
import com.avito.android.remote.model.AdvertNavBarStyle;
import com.avito.android.remote.model.NavigationBarStyle;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: AdvertNavBarStyle.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001b\u0010\b\u001a\u00020\u0007*\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005*\u00020\u0004¢\u0006\u0004\b\n\u0010\u000b\u001a\u0011\u0010\r\u001a\u00020\u0005*\u00020\f¢\u0006\u0004\b\r\u0010\u000e\u001a\u0011\u0010\u0010\u001a\u00020\u0000*\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011\"\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/avito/android/remote/model/AdvertNavBarStyle$ThemeAppearance;", "Lcom/avito/android/lib/util/darkTheme/ThemeAppearance;", "toSearchViewThemeAppearance", "(Lcom/avito/android/remote/model/AdvertNavBarStyle$ThemeAppearance;)Lcom/avito/android/lib/util/darkTheme/ThemeAppearance;", "Landroid/os/Bundle;", "Lcom/avito/android/remote/model/AdvertNavBarStyle;", "navBarStyle", "Lkotlin/G0;", "putAdvertNavBarStyle", "(Landroid/os/Bundle;Lcom/avito/android/remote/model/AdvertNavBarStyle;)V", "getAdvertNavBarStyle", "(Landroid/os/Bundle;)Lcom/avito/android/remote/model/AdvertNavBarStyle;", "Lcom/avito/android/remote/model/NavigationBarStyle;", "toAdvertNavBarStyle", "(Lcom/avito/android/remote/model/NavigationBarStyle;)Lcom/avito/android/remote/model/AdvertNavBarStyle;", "Lcom/avito/android/remote/model/NavigationBarStyle$ThemeAppearance;", "toAdvertThemeAppearance", "(Lcom/avito/android/remote/model/NavigationBarStyle$ThemeAppearance;)Lcom/avito/android/remote/model/AdvertNavBarStyle$ThemeAppearance;", "", "KEY_ADVERT_NAVIGATION_BAR_STYLE", "Ljava/lang/String;", "_avito-discouraged_avito-api_advert-details"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class AdvertNavBarStyleKt {

    @k
    private static final String KEY_ADVERT_NAVIGATION_BAR_STYLE = "ADVERT_KEY_NAVIGATION_BAR_STYLE";

    /* compiled from: AdvertNavBarStyle.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[AdvertNavBarStyle.ThemeAppearance.values().length];
            try {
                iArr[AdvertNavBarStyle.ThemeAppearance.Dark.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AdvertNavBarStyle.ThemeAppearance.Light.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AdvertNavBarStyle.ThemeAppearance.AlwaysDark.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AdvertNavBarStyle.ThemeAppearance.AlwaysLight.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[NavigationBarStyle.ThemeAppearance.values().length];
            try {
                iArr2[NavigationBarStyle.ThemeAppearance.Dark.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[NavigationBarStyle.ThemeAppearance.Light.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[NavigationBarStyle.ThemeAppearance.AlwaysDark.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[NavigationBarStyle.ThemeAppearance.AlwaysLight.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @l
    public static final AdvertNavBarStyle getAdvertNavBarStyle(@k Bundle bundle) {
        return (AdvertNavBarStyle) bundle.getParcelable(KEY_ADVERT_NAVIGATION_BAR_STYLE);
    }

    public static final void putAdvertNavBarStyle(@k Bundle bundle, @l AdvertNavBarStyle advertNavBarStyle) {
        bundle.putParcelable(KEY_ADVERT_NAVIGATION_BAR_STYLE, advertNavBarStyle != null ? advertNavBarStyle.prepareForNextScreen() : null);
    }

    @k
    public static final AdvertNavBarStyle toAdvertNavBarStyle(@k NavigationBarStyle navigationBarStyle) {
        return new AdvertNavBarStyle(navigationBarStyle.getBackgroundColor(), navigationBarStyle.getElementsColor(), toAdvertThemeAppearance(navigationBarStyle.getThemeAppearance()), null, null, null);
    }

    @k
    public static final AdvertNavBarStyle.ThemeAppearance toAdvertThemeAppearance(@k NavigationBarStyle.ThemeAppearance themeAppearance) {
        int i12 = WhenMappings.$EnumSwitchMapping$1[themeAppearance.ordinal()];
        if (i12 == 1) {
            return AdvertNavBarStyle.ThemeAppearance.Dark;
        }
        if (i12 == 2) {
            return AdvertNavBarStyle.ThemeAppearance.Light;
        }
        if (i12 == 3) {
            return AdvertNavBarStyle.ThemeAppearance.AlwaysDark;
        }
        if (i12 == 4) {
            return AdvertNavBarStyle.ThemeAppearance.AlwaysLight;
        }
        throw new NoWhenBranchMatchedException();
    }

    @k
    public static final ThemeAppearance toSearchViewThemeAppearance(@k AdvertNavBarStyle.ThemeAppearance themeAppearance) {
        int i12 = WhenMappings.$EnumSwitchMapping$0[themeAppearance.ordinal()];
        if (i12 == 1) {
            return ThemeAppearance.f181334b;
        }
        if (i12 == 2) {
            return ThemeAppearance.f181335c;
        }
        if (i12 == 3) {
            return ThemeAppearance.f181336d;
        }
        if (i12 == 4) {
            return ThemeAppearance.f181337e;
        }
        throw new NoWhenBranchMatchedException();
    }
}
