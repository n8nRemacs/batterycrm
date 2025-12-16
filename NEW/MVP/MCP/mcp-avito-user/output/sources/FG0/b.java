package fG0;

import Y61.k;
import android.content.Context;
import com.avito.android.R;
import com.avito.android.search_bar.utils.UdfToolbarStyle;
import j.InterfaceC42156l;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import sK0.C48063a;

/* compiled from: UdfToolbarHelper.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_search-bar_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b {
    @InterfaceC42156l
    public static final int a(@k UdfToolbarStyle.Color color, @k Context context) {
        if (color instanceof UdfToolbarStyle.Color.ByColor) {
            return ((UdfToolbarStyle.Color.ByColor) color).f264069b;
        }
        if (color instanceof UdfToolbarStyle.Color.ByUniversalColor) {
            return C48063a.f437606a.a(context, ((UdfToolbarStyle.Color.ByUniversalColor) color).f264071b);
        }
        if (color instanceof UdfToolbarStyle.Color.ByRes) {
            return androidx.core.content.d.getColor(context, ((UdfToolbarStyle.Color.ByRes) color).f264070b);
        }
        if (color instanceof UdfToolbarStyle.Color.RippleColorByThemeAppearance) {
            return androidx.core.content.d.getColor(context, com.avito.android.lib.util.darkTheme.d.a(((UdfToolbarStyle.Color.RippleColorByThemeAppearance) color).f264072b, com.avito.android.lib.util.darkTheme.c.a(context)) ? R.color.custom_product_color_constant_warm_gray_36 : R.color.custom_product_color_constant_warm_gray_36_night);
        }
        throw new NoWhenBranchMatchedException();
    }
}
