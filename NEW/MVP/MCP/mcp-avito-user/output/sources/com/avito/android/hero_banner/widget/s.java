package com.avito.android.hero_banner.widget;

import com.avito.android.lib.util.darkTheme.ThemeAppearance;
import com.avito.android.remote.model.NavigationBarStyle;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: HeroUdfToolbarColorsConverterImpl.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_bx-content_widget_hero-banner_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class s {

    /* compiled from: HeroUdfToolbarColorsConverterImpl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f161958a;

        static {
            int[] iArr = new int[NavigationBarStyle.ThemeAppearance.values().length];
            try {
                iArr[NavigationBarStyle.ThemeAppearance.Dark.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NavigationBarStyle.ThemeAppearance.Light.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NavigationBarStyle.ThemeAppearance.AlwaysDark.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[NavigationBarStyle.ThemeAppearance.AlwaysLight.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f161958a = iArr;
        }
    }

    @Y61.k
    public static final ThemeAppearance a(@Y61.k NavigationBarStyle.ThemeAppearance themeAppearance) {
        int i12 = a.f161958a[themeAppearance.ordinal()];
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
