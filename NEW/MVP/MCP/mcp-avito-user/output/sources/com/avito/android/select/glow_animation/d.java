package com.avito.android.select.glow_animation;

import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.NoMatchLink;
import com.avito.android.remote.model.ParcelableEntity;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.category_parameters.MultiselectDisplay;
import com.avito.android.remote.model.category_parameters.MultiselectParameter;
import com.avito.android.remote.model.category_parameters.MultiselectValue;
import com.avito.android.remote.model.category_parameters.SelectParameter;
import com.avito.android.remote.model.search.Filter;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: GlowAnimationItemCreator.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/select/glow_animation/d;", "", "<init>", "()V", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d {
    @Inject
    public d() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Y61.l
    public static a a(@Y61.k ParcelableEntity parcelableEntity) {
        Filter.InnerOptions.Options options;
        Filter.InnerOptions.Display display;
        List<UniversalColor> gradientColors;
        Filter.InnerOptions.Display.Link link;
        DeepLink deepLink;
        List<UniversalColor> gradientColors2;
        SelectParameter.Value.Display.Link link2;
        DeepLink deepLink2;
        String title;
        List<UniversalColor> gradientColors3;
        MultiselectParameter.Value.Display.Link link3;
        DeepLink deepLink3;
        if (parcelableEntity instanceof MultiselectValue) {
            MultiselectDisplay display2 = ((MultiselectValue) parcelableEntity).getDisplay();
            if (display2 == null || (title = parcelableEntity.getTitle()) == null || (gradientColors3 = display2.getGradientColors()) == null || (link3 = display2.getLink()) == null || (deepLink3 = link3.getDeepLink()) == null || gradientColors3.isEmpty() || (deepLink3 instanceof NoMatchLink)) {
                return null;
            }
            return new a((String) parcelableEntity.getId(), title, gradientColors3, deepLink3, null, true, null, display2.getMultiThemeImage(), 80, null);
        }
        if (parcelableEntity instanceof SelectParameter.Value) {
            SelectParameter.Value value = (SelectParameter.Value) parcelableEntity;
            SelectParameter.Value.Display display3 = value.getDisplay();
            if (display3 == null || (gradientColors2 = display3.getGradientColors()) == null || (link2 = display3.getLink()) == null || (deepLink2 = link2.getDeepLink()) == null || gradientColors2.isEmpty() || (deepLink2 instanceof NoMatchLink)) {
                return null;
            }
            return new a((String) parcelableEntity.getId(), value.getTitle(), gradientColors2, deepLink2, null, false, display3.getMultiThemeImages(), null, 144, null);
        }
        if (!(parcelableEntity instanceof Filter.InnerOptions.Options) || (display = (options = (Filter.InnerOptions.Options) parcelableEntity).getDisplay()) == null || (gradientColors = display.getGradientColors()) == null || (link = display.getLink()) == null || (deepLink = link.getDeepLink()) == null || gradientColors.isEmpty() || (deepLink instanceof NoMatchLink)) {
            return null;
        }
        String str = (String) parcelableEntity.getId();
        String title2 = options.getTitle();
        if (title2 == null) {
            title2 = "";
        }
        return new a(str, title2, gradientColors, deepLink, null, true, display.getMultiThemeImages(), null, 144, null);
    }
}
