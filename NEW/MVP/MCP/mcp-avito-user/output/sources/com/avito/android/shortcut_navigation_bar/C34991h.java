package com.avito.android.shortcut_navigation_bar;

import com.avito.android.remote.model.search.Filter;
import com.avito.android.remote.model.search.WidgetType;
import com.avito.android.shortcut_navigation_bar.InlineAction;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: InlineActions.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_shortcut-bar_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.shortcut_navigation_bar.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34991h {
    @Y61.l
    public static final InlineAction.Predefined a(@Y61.k InlineActions inlineActions) {
        InlineAction inlineAction = inlineActions.f283126b;
        InlineAction.Predefined predefined = inlineAction instanceof InlineAction.Predefined ? (InlineAction.Predefined) inlineAction : null;
        InlineAction.Predefined.Type type = predefined != null ? predefined.f283116g : null;
        InlineAction.Predefined.Type type2 = InlineAction.Predefined.Type.f283123b;
        if (type != type2) {
            predefined = null;
        }
        InlineAction inlineAction2 = inlineActions.f283127c;
        InlineAction.Predefined predefined2 = inlineAction2 instanceof InlineAction.Predefined ? (InlineAction.Predefined) inlineAction2 : null;
        return predefined == null ? (predefined2 != null ? predefined2.f283116g : null) == type2 ? predefined2 : null : predefined;
    }

    public static final InlineAction b(Filter filter, boolean z12) {
        InlineAction inlineFilter;
        Filter.Config config;
        Filter.Config config2;
        Filter.Config config3;
        Filter.Config config4;
        Filter.Config config5;
        Filter.Widget widget = filter.getWidget();
        String icon = null;
        if ((widget != null ? widget.getType() : null) == WidgetType.SearchSubscription) {
            Filter.Widget widget2 = filter.getWidget();
            String icon2 = (widget2 == null || (config5 = widget2.getConfig()) == null) ? null : config5.getIcon();
            Filter.Widget widget3 = filter.getWidget();
            String iconOn = (widget3 == null || (config4 = widget3.getConfig()) == null) ? null : config4.getIconOn();
            Filter.Widget widget4 = filter.getWidget();
            String customTitle = (widget4 == null || (config3 = widget4.getConfig()) == null) ? null : config3.getCustomTitle();
            if (customTitle == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Filter.Widget widget5 = filter.getWidget();
            if (widget5 != null && (config2 = widget5.getConfig()) != null) {
                icon = config2.getCustomTitleOn();
            }
            String str = icon;
            if (str == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            inlineFilter = new InlineAction.Predefined(icon2, iconOn, customTitle, str, null, InlineAction.Predefined.Type.f283123b, z12 ? InlineAction.Predefined.State.f283118b : InlineAction.Predefined.State.f283119c);
        } else {
            Filter.Widget widget6 = filter.getWidget();
            if (widget6 != null && (config = widget6.getConfig()) != null) {
                icon = config.getIcon();
            }
            String displayTitle = filter.getDisplayTitle();
            if (displayTitle == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            String id2 = filter.getId();
            if (id2 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            inlineFilter = new InlineAction.InlineFilter(icon, displayTitle, id2);
        }
        return inlineFilter;
    }

    @Y61.k
    public static final InlineActions c(@Y61.k Filter filter, boolean z12, boolean z13) {
        Boolean saveSearchInHeaderOnScroll;
        Filter filter2;
        Filter filter3;
        List<Filter> filters = filter.getFilters();
        InlineAction inlineActionB = null;
        boolean zBooleanValue = false;
        InlineAction inlineActionB2 = (filters == null || (filter3 = (Filter) C42745f0.K(0, filters)) == null) ? null : b(filter3, z13);
        List<Filter> filters2 = filter.getFilters();
        if (filters2 != null && (filter2 = (Filter) C42745f0.K(1, filters2)) != null) {
            inlineActionB = b(filter2, z13);
        }
        Filter.Payload payload = filter.getPayload();
        if (payload != null && (saveSearchInHeaderOnScroll = payload.getSaveSearchInHeaderOnScroll()) != null) {
            zBooleanValue = saveSearchInHeaderOnScroll.booleanValue();
        }
        return new InlineActions(inlineActionB2, inlineActionB, zBooleanValue, z12);
    }

    public static final InlineAction d(InlineAction inlineAction, InlineAction.Predefined.State state) {
        InlineAction.Predefined predefined = inlineAction instanceof InlineAction.Predefined ? (InlineAction.Predefined) inlineAction : null;
        if (predefined == null) {
            return inlineAction;
        }
        InlineAction.Predefined.Type type = InlineAction.Predefined.Type.f283123b;
        InlineAction.Predefined.Type type2 = predefined.f283116g;
        return type2 == type ? new InlineAction.Predefined(predefined.f283111b, predefined.f283112c, predefined.f283113d, predefined.f283114e, predefined.f283115f, type2, state) : inlineAction;
    }
}
