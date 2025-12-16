package ru.cyberity.cbr.core.data.listener;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.graphics.drawable.Drawable;
import java.util.Locale;
import kotlin.Metadata;
import ru.cyberity.cbr.core.common.l0;
import ru.cyberity.cbr.core.common.n0;
import ru.cyberity.cbr.core.data.listener.CBRCountryPicker;

/* compiled from: CBRDefaultCountryPicker.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"getFlagDrawable", "Landroid/graphics/drawable/Drawable;", "Lru/cyberity/cbr/core/data/listener/CBRCountryPicker$CountryItem;", "context", "Landroid/content/Context;", "cyberity-mobile-sdk-ui_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class CBRDefaultCountryPickerKt {
    @l
    public static final Drawable getFlagDrawable(@k CBRCountryPicker.CountryItem countryItem, @k Context context) {
        return n0.f432787a.getIconHandler().onResolveIcon(context, "Flag/".concat(l0.f432743a.a(countryItem.getCode()).toLowerCase(Locale.ROOT)));
    }
}
