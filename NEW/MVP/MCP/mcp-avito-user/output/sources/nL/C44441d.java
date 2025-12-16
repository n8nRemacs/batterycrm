package nl;

import Y61.k;
import com.avito.android.lib.util.darkTheme.ThemeAppearance;
import com.avito.android.remote.model.NavigationBarStyle;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.search_view.k;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: NavigationBarStyles.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_serp_public"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: nl.d, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C44441d {

    /* compiled from: NavigationBarStyles.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: nl.d$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f419140a;

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
            f419140a = iArr;
        }
    }

    @k
    public static final com.avito.android.search_view.k a(@k NavigationBarStyle navigationBarStyle) {
        UniversalColor backgroundColor = navigationBarStyle.getBackgroundColor();
        UniversalColor elementsColor = navigationBarStyle.getElementsColor();
        ThemeAppearance themeAppearanceB = b(navigationBarStyle.getThemeAppearance());
        k.a aVar = new k.a(navigationBarStyle.getSearchBarStyle().getBackgroundColor(), navigationBarStyle.getSearchBarStyle().getPressedBackgroundColor(), navigationBarStyle.getSearchBarStyle().getHintColor());
        String navigationIcon = navigationBarStyle.getNavigationIcon();
        NavigationBarStyle.DisplayType displayType = navigationBarStyle.getDisplayType();
        UniversalColor cartPointColor = navigationBarStyle.getCartPointColor();
        if (cartPointColor == null) {
            cartPointColor = new UniversalColor("red", null, null);
        }
        return new com.avito.android.search_view.k(backgroundColor, elementsColor, cartPointColor, themeAppearanceB, aVar, navigationIcon, false, displayType, false, null);
    }

    @Y61.k
    public static final ThemeAppearance b(@Y61.k NavigationBarStyle.ThemeAppearance themeAppearance) {
        int i12 = a.f419140a[themeAppearance.ordinal()];
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
